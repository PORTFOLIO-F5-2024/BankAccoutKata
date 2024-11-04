package org.BAK;

import  java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    Scanner scanner = new Scanner(System.in);
    private int id;
    private String Email;
    private String Password;

    public UserAccount(int id, String Email, String Password) {
        this.id = id;
        this.Email = Email;
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public UserAccount inputUserAccount(List <UserAccount> usersList){
        int newId = usersList.size()+1;
        UserAccount newUser = new UserAccount (newId, getStringInput("mail"),getStringInput("password"));

        for (UserAccount user : usersList) {

            if (user.getEmail().equals(newUser.getEmail()) && user.getPassword().equals(newUser.getPassword())){
                return user;
            };

            if (!user.getEmail().equals(newUser.getEmail()) || !user.getPassword().equals(newUser.getPassword())){
                do{
                    System.out.println("The email or the password is wrong, try again");
                    newUser = new UserAccount(newId, getStringInput("mail"), getStringInput("password"));
                } while (!user.getEmail().equals(newUser.getEmail()) || !user.getPassword().equals(newUser.getPassword()));

                return user;

            }
        }

        usersList.add(newUser);
        return newUser;
    }

    private String getStringInput(String inputText) {
        System.out.print("Enter your " + inputText + ": ");
        String stringInput = scanner.nextLine();
        return stringInput;
    }

}