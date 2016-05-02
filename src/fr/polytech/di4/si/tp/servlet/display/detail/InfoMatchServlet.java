package fr.polytech.di4.si.tp.servlet.display.detail;

import fr.polytech.di4.si.tp.model.Matche;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by linux on 30/04/16.
 */
@WebServlet(name = "InfoMatchServlet", urlPatterns = "/infoMatch")
public class InfoMatchServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO persist the match
        //if no id in match create ?
        Matche match = (Matche) request.getAttribute("match");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String match_id = request.getParameter("match_id");
        boolean edit_mode = request.getParameter("edit_mode").equals("true");
        boolean logged = request.getParameter("authenticated") != null;

        //TODO get the match with its id if no
        Matche match = new Matche();
        request.setAttribute("match", match);

        if (match_id == null && !edit_mode) {
            //miss param and not in edit mode so redirect
            response.sendRedirect(getServletContext().getContextPath() + "/matches");

        } else if (!logged && edit_mode) {
            //want edit but not logged
            response.sendRedirect(getServletContext().getContextPath() + "/login");

        } else if (logged && edit_mode) {
            //edit mode
            getServletContext().getRequestDispatcher("/WEB-INF/view/restrict/infoMatch.jsp").forward(request, response);

        } else {
            //display mode
            getServletContext().getRequestDispatcher("/WEB-INF/view/display/detail/infoMatch.jsp").forward(request, response);
        }
    }
}
