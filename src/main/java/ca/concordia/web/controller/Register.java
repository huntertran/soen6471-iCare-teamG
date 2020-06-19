package ca.concordia.web.controller;

import ca.concordia.error.Error;
import ca.concordia.pojo.User;
import ca.concordia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Register {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user/register", method= RequestMethod.POST)
    public @ResponseBody Object userRegister(@RequestBody User user){
        User query = userService.queryById(user.getUid());
        Error error = new Error();
        if (query != null){

            error.setMessage("user already exist!");
        } else {
            userService.insertUser(user);
            error.setMessage("Please click login");
        }
        return error;
    }
}
