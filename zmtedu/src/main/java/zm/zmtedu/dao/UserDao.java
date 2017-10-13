package zm.zmtedu.dao;

import zm.zmtedu.entity.User;

/**
 * ���û���Ϣά����
 * @author  mtj
 */
public interface UserDao {

    /**
     *
     * @param user
     * @return 返回值如果为1,则证明注册成功
     */
    int saveUser(User user);
}
