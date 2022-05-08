package mapper;

import pojo.User;

import java.util.List;

/**
 * @author: baifengxiao
 * @date: 2022/3/12 16:34
 */
public interface UserMapper {

//    mybatis接口编程两个一致:
//    1，namespace和全类名一致
//    2,id和方法名一致

//    表——实体类——mapper接口——映射文件

//    添加用户信息
    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();
}
