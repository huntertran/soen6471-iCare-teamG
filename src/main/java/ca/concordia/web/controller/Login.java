package ca.concordia.web.controller;


import ca.concordia.error.Error;
import ca.concordia.pojo.User;
import ca.concordia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class Login {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/user/login", method= RequestMethod.GET)
    public @ResponseBody Object userLogin(String username, String password , HttpSession session, HttpServletResponse response) throws Exception {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User query = userService.queryByUsernameAndPassword(user);
        System.out.println(query);
        System.out.println(username);
        Error error = new Error();
        if (query == null){
            error.setMessage("Email or password incorrect");
        } else {
            session.setAttribute("user", query);
            session.setMaxInactiveInterval(5000);
            response.sendRedirect("/main.html");
        }
        return error;
    }
}
