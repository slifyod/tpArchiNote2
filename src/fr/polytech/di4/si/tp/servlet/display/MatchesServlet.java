package fr.polytech.di4.si.tp.servlet.display;

import fr.polytech.di4.si.tp.model.Match;

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
@WebServlet(name = "MatchesServlet", urlPatterns = "/matches")
public class MatchesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO get all matches
        List<Match> matches = new ArrayList<>();

        request.setAttribute("matches", matches);
        getServletContext().getRequestDispatcher("/WEB-INF/view/display/matches.jsp").forward(request, response);
    }
}
