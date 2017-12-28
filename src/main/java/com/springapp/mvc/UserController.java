package com.springapp.mvc;

import com.springapp.constructorWay.Tea;
import com.springapp.model.User;
import com.springapp.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;



@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private Tea teaBean;
	
	
    @RequestMapping(method = RequestMethod.GET, value = "/{id}", headers = "Accept=*/*")
    public
    @ResponseBody
    User getUserById(@PathVariable String id) {
        User user = new User();
        user.setFirstName("Turgay");
        user.setLastName("Can");
        this.teaBean.PrepareDrink();
        return user;
    }

    @RequestMapping(method = RequestMethod.GET, headers = "Accept=*/*")
    public
    @ResponseBody
    Users getAllUsers() {
        User user1 = new User();
        user1.setFirstName("Turgay");
        user1.setLastName("Can");

        User user2 = new User();
        user2.setFirstName("Barışcan");
        user2.setLastName("Güngör");

        Users users = new Users();
        users.setUsers(new ArrayList<User>());
        users.getUsers().add(user1);
        users.getUsers().add(user2);

        return users;
    }
}
