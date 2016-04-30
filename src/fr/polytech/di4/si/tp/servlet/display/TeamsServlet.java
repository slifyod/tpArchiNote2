package fr.polytech.di4.si.tp.servlet.display;

import fr.polytech.di4.si.tp.model.Team;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linux on 30/04/16.
 */
@WebServlet(name = "TeamsServlet", urlPatterns = "/teams")
public class TeamsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO get all teams
        List<Team> teams = new ArrayList<>();

        request.setAttribute("teams", teams);
        getServletContext().getRequestDispatcher("/WEB-INF/view/display/teams.jsp").forward(request, response);
    }
}
