package webapp.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import webapp.model.User;

/**
 * 登陆控制器
 *
 * @author admin
 */
@Controller
@RequestMapping("/login")
@Api("user")
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "登录", response = User.class, notes = "登录")
    public String login(@RequestBody User user) {

        return "main";
    }

}
