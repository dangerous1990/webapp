package webapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webapp.model.User;

/**
 * 登陆控制器
 * @author admin
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestBody User user){
		System.out.println(user);
		return "main";
	}

}
