package com.company.model;

public class LoginException extends Exception {
    private String name;
    private String login;
    public LoginException(String message){
        super(message);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
