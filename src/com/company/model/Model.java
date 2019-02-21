package com.company.model;

import java.util.ArrayDeque;

public class Model {
    private String name;
    private String login;

    public boolean check(String name, String login) throws LoginException {
        boolean b = false;
        for (Record record : Record.values()) {
            if (record.getLogin().equals(login)) {
                LoginException loginException = new LoginException("This login already exists");
                loginException.setName(name);
                loginException.setLogin(login);
                throw loginException;
            }
        }
        b = true;
        return b;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
