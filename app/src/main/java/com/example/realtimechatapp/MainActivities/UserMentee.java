package com.example.realtimechatapp.MainActivities;

public class UserMentee  {



    private String fullname;
    private String email;
    private String password;



    public UserMentee(String fullname, String email,String password) {
        this.fullname = fullname;
        this.email = email;

    }
    public UserMentee(){

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
