package com.example.client.webclients;

import models.UserView;

public class UserWebClient extends AutoWebClient{
    static final String uri = "/users/";
    public static UserView getByLogin(String login)
    {
        return getOneItem(uri + "login/" + login, UserView.class);
    }
    public static UserView getById(long id)
    {
        return getOneItem(uri + Long.toString(id), UserView.class);
    }
}
