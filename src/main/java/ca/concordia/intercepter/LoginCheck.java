package ca.concordia.intercepter;

import ca.concordia.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 */
public class LoginCheck implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    
    	//For every request, we check the `user` of the session,
        User userSession = (User) request.getSession().getAttribute("user");
        System.out.println(request.getRequestURI());
        //If request is login request, we don't intercept it.
        if (request.getRequestURI().contains("pages")){
            return true;
        }
        
        //If request don't have a valid `user` object in the session, we redirect the request to login page.
        if (userSession == null) {
            response.sendRedirect("/pages/login.html");
            return false;
        } else {
        //If request have a valid user in session, reset it once again, and give it 5 seconds alive time.
            request.getSession().setAttribute("user", userSession);
            request.getSession().setMaxInactiveInterval(5);
        }
        return true;
    }
}
