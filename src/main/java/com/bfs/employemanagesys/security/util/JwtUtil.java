package com.bfs.employemanagesys.security.util;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

public class JwtUtil {

    public static String generateRegisterToken(String signingKey, String subject, String email) {
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        JwtBuilder builder = Jwts.builder()
                .setSubject(subject)
                .claim("email", email)
                .setIssuedAt(now)
                .signWith(SignatureAlgorithm.HS256, signingKey);

        return builder.compact();
    }

    public static String getSubject(HttpServletRequest httpServletRequest, String jwtTokenCookieName, String signingKey){
        String token = CookieUtil.getValue(httpServletRequest, jwtTokenCookieName);
        if(token == null) return null;
        System.out.println(Jwts.parser().setSigningKey(signingKey));
        System.out.println(Jwts.parser().setSigningKey(signingKey).parseClaimsJws(token));
        System.out.println(Jwts.parser().setSigningKey(signingKey).parseClaimsJws(token).getBody());

        return Jwts.parser().setSigningKey(signingKey).parseClaimsJws(token).getBody().getSubject();
    }

    public static Integer getPersonID(HttpServletRequest httpServletRequest, String jwtTokenCookieName, String signingKey){
        String token = CookieUtil.getValue(httpServletRequest, jwtTokenCookieName);
        if(token == null) return null;
        System.out.println("personID : " + (Integer) Jwts.parser().setSigningKey(signingKey).parseClaimsJws(token).getBody().get("personID"));
        return (Integer) Jwts.parser().setSigningKey(signingKey).parseClaimsJws(token).getBody().get("personID");
    }

    public static String getRoleName(HttpServletRequest httpServletRequest, String jwtTokenCookieName, String signingKey){
        String token = CookieUtil.getValue(httpServletRequest, jwtTokenCookieName);
        if(token == null) return null;
        System.out.println("roleName : " + (String) Jwts.parser().setSigningKey(signingKey).parseClaimsJws(token).getBody().get("roleName"));
        return (String) Jwts.parser().setSigningKey(signingKey).parseClaimsJws(token).getBody().get("roleName");
    }

}
