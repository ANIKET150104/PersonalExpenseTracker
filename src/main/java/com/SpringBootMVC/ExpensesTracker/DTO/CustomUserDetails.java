package com.SpringBootMVC.ExpensesTracker.DTO;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;


import java.util.Collection;

public class CustomUserDetails extends User {

    private static final long serialVersionUID = 1L;
	private int clientId;

    public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities, int clientId) {
        super(username, password, authorities);
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }
}
