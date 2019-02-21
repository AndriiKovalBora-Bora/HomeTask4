package com.company.model;

public enum Record {
    RECORD1("Ivan","ivan228"),
    RECORD2("Andrew","andrew332"),
    RECORD3("Leha","lexa112"),
    RECORD4("Kolan","kol45"),
    RECORD5("Ira","ira99");

    private final String name;
    private final String login;

    Record(String name, String login){
        this.name = name;
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "  " + login;
    }
}
