//-----------------------------------------------------
// Title: UserService
// Author: Deniz Dumanlı
// ID: 25337236168
// Section: 1
// Description: In this class there are methods for CRUD operations.
//-----------------------------------------------------
package com.opentechnica.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserService {

    static HashMap<Integer, User> userIdMap=getUserIdMap(); // This is a HashMap declaration.

    // This is constructor for UserService class.
    public UserService(){
        super();

        if(userIdMap==null){
            userIdMap=new HashMap<Integer, User>();
            User bekir = new User(1,"CMPE","328","cmpe328@gmail.com");
            userIdMap.put(1,bekir);
        }
    }

    // This method gets all of the users and returns it as a list.
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<User>(userIdMap.values());
        return users;
    }

    // This method gets a user with id.
    public User getUser(int id){
        User user = userIdMap.get(id);
        return user;
    }

    // This method adds a to HashMap.
    public User addUser(User user){
        // This if method checks is there already user with given id. If yes it returns null. If no it adds a new user.
        if(userIdMap.containsKey(user.getId())){
            return null;
        }
        else{
        user.setId(getMaxId()+1); // Here, if id is not specified it automatically gives a id that is 1 number bigger than max id.
        userIdMap.put(user.getId(), user);
        return user;
        }
    }

    // This method updates the user's properties.
    public User updateUser(User user){
        // This if method checks is given id valid and is there already a user with given id. If there is no user with given id it returns null.
        // If there is user with given id, it Updates the user.
        if(user.getId()<=0 || !userIdMap.containsKey(user.getId()))
            return null;
        userIdMap.put(user.getId(), user);
        return user;

    }

    // This method deletes the user with given id.
    public void deleteUser(int id) {
        userIdMap.remove(id);
    }

    // This method gets the userIdMap.
    public static HashMap<Integer, User> getUserIdMap() {
        return userIdMap;
    }

    // This method gets max id.
    public static int getMaxId() {
        int max=0;
        for (int id:userIdMap.keySet()) {
            if(max<=id)
                max=id;
        }
        return max;
    }
}

