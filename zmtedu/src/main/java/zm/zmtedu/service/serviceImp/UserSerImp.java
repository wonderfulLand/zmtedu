package zm.zmtedu.service.serviceImp;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;
import zm.zmtedu.common.allException.UserException;
import zm.zmtedu.dao.UserDao;
import zm.zmtedu.entity.User;
import zm.zmtedu.service.UserSer;

import javax.annotation.Resource;

@Service("userSer")
public class UserSerImp implements UserSer {

    @Resource
    private UserDao userDao;

    public User saveUser(String userName, String pwd) throws UserException {
        System.out.println(userName+","+pwd);
        String md5Pwd= DigestUtils.md5Hex(pwd);
        int i=userDao.saveUser(new User(userName,md5Pwd));
        if(i!=1)
            throw new UserException();
        return new User(userName,pwd);
    }
}
