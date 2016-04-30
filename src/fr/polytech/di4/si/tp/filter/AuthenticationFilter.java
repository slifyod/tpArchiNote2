package fr.polytech.di4.si.tp.filter;


import fr.polytech.di4.si.tp.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter(urlPatterns = "/restrict/*", filterName = "AuthenticationFilter")
public class AuthenticationFilter implements Filter {
    private ServletContext servletContext;

    public void init(FilterConfig config) throws ServletException {
        servletContext = config.getServletContext();
    }


    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        HttpSession session = httpRequest.getSession();

        User user = (User) session.getAttribute("authenticated");
        if (user != null) {
            chain.doFilter(servletRequest, servletResponse);
        } else {
            httpResponse.sendRedirect(servletContext.getContextPath() + "/login");
        }
    }

    public void destroy() {

    }

}
