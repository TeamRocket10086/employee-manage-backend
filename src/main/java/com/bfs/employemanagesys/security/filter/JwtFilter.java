package com.bfs.employemanagesys.security.filter;


import com.bfs.employemanagesys.security.util.JwtUtil;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Component
public class JwtFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String username = JwtUtil.getSubject(httpServletRequest, "JWT-TOKEN", "signingKeyemployee");
        Integer personid = JwtUtil.getPersonID(httpServletRequest, "JWT-TOKEN", "signingKeyemployee");
        String rolename = JwtUtil.getRoleName(httpServletRequest, "JWT-TOKEN", "signingKeyemployee");
        //String personID = JwtUtil
        //Constant.JWT_TOKEN_COOKIE_NAME, Constant.SIGNING_KEY
        if(username == null){
            String authService = this.getFilterConfig().getInitParameter("services.auth");
            httpServletResponse.sendRedirect(authService + "?redirect=" + httpServletRequest.getRequestURL());
        } else{
            httpServletRequest.setAttribute("username", username);
            httpServletRequest.setAttribute("personid", personid);
            httpServletRequest.setAttribute("rolename", rolename);
            filterChain.doFilter(httpServletRequest, httpServletResponse);
        }
    }
}
