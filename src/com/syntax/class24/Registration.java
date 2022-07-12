package com.syntax.class24;

public class Registration {
    private String  email;
    private   String username;
    private String password;
    public void setEmail (String email){
        if(email.contains("yahoo")){
            this.email=email;}else{
            System.out.println("email should be of yahoo reset again");
        }

    }
    public String getEmail (){
        return email;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        int size=username.length();
        if(!username.equals(null)&&size>6){
            this.username = username;}

    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        int size=password.length();
        if(!password.equals(null)&&size>6&&!(password.equalsIgnoreCase(username))){
            this.password = password;}
        else{
            System.out.println("user name should not be null");

    }



}}

