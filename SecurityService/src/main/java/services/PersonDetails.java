package services;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class PersonDetails {
	
	
	private String name;
    private String password;
    public PersonDetails(UserCredentialEntity user) {
        this.name = user.getName();
        this.password = user.getPassword();
    }
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return name;
    }

}
