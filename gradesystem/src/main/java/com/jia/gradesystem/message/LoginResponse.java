package com.jia.gradesystem.message;

import com.jia.gradesystem.model.User;

public enum LoginResponse {
    Success, Fail;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
