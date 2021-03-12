//-----------------------------------------------------
// Title: UserController
// Author: Deniz Dumanlı
// ID: 25337236168
// Section: 1
// Description: This class makes the CRUD operations of our program.
//-----------------------------------------------------
package com.opentechnica.demo;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    UserService userService = new UserService(); // Here we create userService object.

    //This method shows all of the users with GET request.
    @RequestMapping(value = "/users", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<User> getUsers() {
        List<User> listOfUsers = userService.getAllUsers();
        return listOfUsers;
    }

    // This method shows a specific user by given id with GET request.
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public User getUserById(@PathVariable int id) {
        if(userService.getUser(id)==null) throw new UserNotFoundException();
        else return userService.getUser(id);
    }

    // This method adds a new user by given properties with POST request.
    @RequestMapping(value = "/users", method = RequestMethod.POST, headers = "Accept=application/json")
    public User addUser(@RequestBody User user)  {
        if(userService.addUser(user)==null) throw new UserExistFoundException();
        else return userService.addUser(user);
    }

    // This method updates a user by given properties with PUT request.
    @RequestMapping(value = "/users", method = RequestMethod.PUT, headers = "Accept=application/json")
    public User updateUser(@RequestBody User user) {
        if(userService.updateUser(user)== null) throw new UserNotFoundException();
        else return userService.updateUser(user);
    }

    // This method deletes a user by given id with DELETE request.
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public void deleteUser(@PathVariable("id") int id) {
        if(userService.getUser(id)==null) throw new UserNotFoundException();
        else userService.deleteUser(id);
    }

    // This class is for error handling. We use this if there is no such user with given id.
    @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such user.")
    public class UserNotFoundException extends RuntimeException {
    }

    // This class if for error handling. We use this if there is an already with given id.
    @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="There is an already user with that id.")
    public class UserExistFoundException extends RuntimeException {
    }

    // This method shows a string in default page.
    @RequestMapping("/")
    public String index() {
        return "CMPE 328 HW1";
    }

}
