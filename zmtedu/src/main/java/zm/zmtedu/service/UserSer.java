package zm.zmtedu.service;

import zm.zmtedu.common.allException.UserException;
import zm.zmtedu.entity.User;

public interface UserSer {

    /**
     * ע���û�
     * @param userName �û���
     * @param pwd ����
     * @return ���ע��ɹ�,�򷵻�һ���û�
     * @throws UserException
     */
    User saveUser(String userName, String pwd)throws UserException;
}
