package io.akoserwa.SecureKeycloakApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;

import  org.springframework.web.servlet.view.RedirectView;

@RestController
public class TokenController {


    @RequestMapping("/token")
    public String getToken(){
        return JWTUtil.getJWTToken();
    }
    
    @GetMapping(value = "/logout")
	public RedirectView logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return new RedirectView("/");
	}

}
