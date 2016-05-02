package fr.polytech.di4.si.tp.servlet.display.detail;

import fr.polytech.di4.si.tp.model.Team;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by linux on 30/04/16.
 */
@WebServlet(name = "InfoTeamServlet", urlPatterns = "/infoTeam")
public class InfoTeamServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO persist the team
        //if no id in team create ?
        String id = request.getParameter("team_id");
        String team_name = request.getParameter("team_name");

        //TODO get the match with its id if no
        Team team = new Team();
        team.setId(Long.parseLong(id));
        team.setName(team_name);

        response.sendRedirect(getServletContext().getContextPath() + "/teams");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String team_id = request.getParameter("team_id");
        boolean edit_mode = request.getParameter("edit_mode").equals("true");
        boolean logged = request.getSession().getAttribute("authenticated") != null;


        //TODO get the match with its id if no
        Team team = new Team();
        request.setAttribute("team", team);

        if (team_id == null && !edit_mode) {
            //miss param and not in edit mode so redirect
            response.sendRedirect(getServletContext().getContextPath() + "/teams");

        } else if (!logged && edit_mode) {
            //want edit but not logged
            response.sendRedirect(getServletContext().getContextPath() + "/login");

        } else if (logged && edit_mode) {
            //edit mode
            getServletContext().getRequestDispatcher("/WEB-INF/view/restrict/infoTeam.jsp").forward(request, response);

        } else {
            //display mode
            getServletContext().getRequestDispatcher("/WEB-INF/view/display/detail/infoTeam.jsp").forward(request, response);
        }
    }
}
