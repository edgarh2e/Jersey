package com.lux.authentication.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class User {

    public String userName;
    public String suc;
    public String password;
    public String keyCode;

    public User(){

    }

    public User(String userName, String suc, String keyCode, String password) {
        this.userName = userName;
        this.suc = suc;
        this.keyCode = keyCode;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getSuc() {
        return this.suc;
    }

    public String getKeyCode() {
        return this.keyCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSuc(String suc) {
        this.suc = suc;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }

    @Override
    public String toString() {
        return new StringBuilder("user: ").append(this.getUserName())
                .append(" suc: ").append(this.suc)
                .append(" keyCode: ").append(this.keyCode).toString();
    }

}
