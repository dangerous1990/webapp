package webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webapp.model.User;

/**
 * 登陆控制器
 * 
 * @author admin
 * 
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(User user) {
		return "main";
	}

}
