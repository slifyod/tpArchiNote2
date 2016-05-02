package fr.polytech.di4.si.tp.servlet.display.detail;

import fr.polytech.di4.si.tp.model.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by linux on 30/04/16.
 */
@WebServlet(name = "InfoPlayerServlet", urlPatterns = "/infoPlayer")
public class InfoPlayerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO persist the match
        //if no id in player create ?
        String player_id = request.getParameter("player_id");
        String player_name = request.getParameter("player_name");
        String player_goals = request.getParameter("player_goals_id");
        String player_team_id = request.getParameter("player_team_id");
        String player_note = request.getParameter("player_note");

        Player player = new Player();
        player.setId(Long.parseLong(player_id));
        player.setName(player_name);
        //TODO goals from DB AND TEAM with ID !!
        //player.setGoals();
        //player.setTeam();
        player.setNote(Double.parseDouble(player_note));


        response.sendRedirect(getServletContext().getContextPath() + "/players");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String player_id = request.getParameter("player_id");
        boolean edit_mode = request.getParameter("edit_mode").equals("true");
        boolean logged = request.getSession().getAttribute("authenticated") != null;


        //TODO get the match with its id if no
        Player player = new Player();
        request.setAttribute("player", player);

        if (player_id == null && !edit_mode) {
            //miss param and not in edit mode so redirect
            response.sendRedirect(getServletContext().getContextPath() + "/players");

        } else if (!logged && edit_mode) {
            //want edit but not logged
            response.sendRedirect(getServletContext().getContextPath() + "/login");

        } else if (logged && edit_mode) {
            //edit mode
            getServletContext().getRequestDispatcher("/WEB-INF/view/restrict/infoPlayer.jsp").forward(request, response);

        } else {
            //display mode
            getServletContext().getRequestDispatcher("/WEB-INF/view/display/detail/infoPlayer.jsp").forward(request, response);
        }
    }
}
