package com.ED.OOP.DataHiding;

class User{
    private String userName;
    private String password;

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public void login(String user, String pass){
        if(this.userName.equalsIgnoreCase(user) && this.password.equalsIgnoreCase(pass)){
            System.out.println("You have succesfully logged in!");
        }
        else{
            System.out.println("Invalid Credentials");
        }
    }
}
public class Encapsulation {

    public static void main(String[] args) {
        User user = new User("brooke122", "helloworld");
        user.login("brooke122", "Helloworld");

    }
}
