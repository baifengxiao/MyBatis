package mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;
import java.util.Map;


//demo04_特殊查询
public interface SelectMapper {

    //    模糊查询
    List<User> getUserByLike(@Param("username") String username);

    //批量删除
    int deleteMore(@Param("ids") String ids);

    //按表名查询
    List<User> getUserByTableName(@Param("tableName") String tableName);

    //获取功能自增的主键,赋给某个属性
    void insertUser(User user);
}
