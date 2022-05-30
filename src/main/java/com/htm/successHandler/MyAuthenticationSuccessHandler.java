package com.htm.successHandler;

import java.io.IOException;




import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
		
	
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
    @Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)throws IOException {
        
    
    	System.out.println("inside success handler");
    	
    	String targetUrl = determineTargetUrl(authentication);
             if (response.isCommitted()) {
            System.out.println("Can't redirect");
            return;
        }
 
        redirectStrategy.sendRedirect(request, response, targetUrl);
    }
    protected String determineTargetUrl(Authentication authentication) {
        String url = "";
 
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
 
        List<String> roles = new ArrayList<String>();
 
        for (GrantedAuthority a : authorities) {
            roles.add(a.getAuthority());
        }
 
        if (isRecep(roles)) {
            url = "/receptionist";
        } else if (isAdmin(roles)) {
            url = "/administrator";
        } else if (isCustom(roles)) {
            url = "/customer";
        } else {
            url = "/myLogin";
        }
 
        return url;
    }
 
    private boolean isCustom(List<String> roles) {
        if (roles.contains("cust")) {
            return true;
        }
        return false;
    }
 
    private boolean isAdmin(List<String> roles) {
        if (roles.contains("admin")) {
            return true;
        }
        return false;
    }
 
    private boolean isRecep(List<String> roles) {
        if (roles.contains("recep")) {
            return true;
        }
        return false;
    }
    
	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }
 
    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }
}