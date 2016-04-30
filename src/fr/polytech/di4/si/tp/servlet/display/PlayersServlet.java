package fr.polytech.di4.si.tp.servlet.display;

import fr.polytech.di4.si.tp.model.Player;

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
@WebServlet(name = "PlayersServlet", urlPatterns = "/players")
public class PlayersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO get all players
        List<Player> players = new ArrayList<>();

        request.setAttribute("players", players);
        getServletContext().getRequestDispatcher("/WEB-INF/view/display/players.jsp").forward(request, response);
    }
}
