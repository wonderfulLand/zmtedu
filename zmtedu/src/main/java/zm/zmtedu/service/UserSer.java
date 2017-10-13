package zm.zmtedu.service;

import zm.zmtedu.common.allException.UserException;
import zm.zmtedu.entity.User;

public interface UserSer {

    /**
     * 注册用户
     * @param userName 用户名
     * @param pwd 密码
     * @return 如果注册成功,则返回一个用户
     * @throws UserException
     */
    User saveUser(String userName, String pwd)throws UserException;
}
