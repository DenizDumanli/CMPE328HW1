//-----------------------------------------------------
// Title: Tester
// Author: Deniz Dumanlı
// ID: 25337236168
// Section: 1
// Description: This class is a tester class for our program.
//-----------------------------------------------------
package com.opentechnica.demo;

public class Tester {
    public static void main(String[] args) {
        // By calling those method we start the testing.
        getUserandCreateTest();
        deleteUserTest();
        updateUserTest();
    }

     // This method tests Create and Read operations of our program.
    public static void getUserandCreateTest(){
        UserService userService = new UserService();
        User newUser = new User(2,"CMPE","328","cmpe328@gmail.com");
        userService.addUser(newUser);
        System.out.println("Read User and Create Test Started");
        if(userService.getUser(2)==newUser){
            System.out.println("------Test Passed------");
        }else{
            System.out.println("------Test Failed------");
        }
    }

    // This method tests Delete operation of our program.
    public static void deleteUserTest(){
        UserService userService = new UserService();
        User newUser = new User(2,"CMPE","328","cmpe328@gmail.com");
        userService.addUser(newUser);
        userService.deleteUser(2);
        System.out.println("Delete User Test Started");
        if(userService.getUser(2)==newUser){
            System.out.println("------Test Failed------");
        }else{
            System.out.println("------Test Passed------");
        }
    }

    // This method tests Update operation of our program.
    public static void updateUserTest(){
        UserService userService = new UserService();
        User newUser = new User(2,"CMPE","328","cmpe328@gmail.com");
        userService.addUser(newUser);
        User newUserUpdated = new User(2,"Ali","HJ","cmpe@gmail.com");
        userService.updateUser(newUserUpdated);
        System.out.println("Update User Test Started");
        if(userService.getUser(2)==newUserUpdated){
            System.out.println("------Test Passed------");
        }else{
            System.out.println("------Test Failed------");
        }
    }

}
