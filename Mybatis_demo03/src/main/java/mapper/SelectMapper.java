package mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;
import java.util.Map;


//demo03_各种查询
public interface SelectMapper {

//    查询返回单条数据，可以选择两种接受方法

    //    1，实体类对象来接收
    User getUserById(@Param("id") Integer id);

    //    2,list集合来接收
    List<User> getUserByIdToList(@Param("id") Integer id);

    //3,map集合接收
    Map<String, Object> getUserByIdToMap(Integer id);


    //    查询返回多条数据
//    1,实体类类型的list接收
    List<User> getUserToList();

    //  演示有别名
    Integer getCount();

    //2,map类型的list接收
    List<Map<String, Object>> getUsersToMap();

    //3,map类型的list接收(MapKey注解)
    @MapKey("id")
    Map<String, Object> getUsersToMapByMapkey();

}
