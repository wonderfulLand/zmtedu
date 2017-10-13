package zm.zmtedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zm.zmtedu.common.JsonResult;
import zm.zmtedu.entity.User;
import zm.zmtedu.service.UserSer;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserSer userSer;

    @RequestMapping("/register")
    @ResponseBody
    public JsonResult<User> register(String userName,String pwd){
        System.out.println("name:"+userName+",pwd:"+pwd);
        User user=userSer.saveUser(userName,pwd);
        return new JsonResult<User>(user);
    }

}
