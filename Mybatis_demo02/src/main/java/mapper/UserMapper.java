package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.Map;

public interface UserMapper {

    //单个参数情况
    User getUserByUsername(String username);
//多个参数情况
    User checkLogin(String username,String password);
//自定义访问参数情况
    User checkLoginByMap(Map<String,Object> map);
//返回实体类型情况
    int insertUser(User user);
//    使用@Param
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
