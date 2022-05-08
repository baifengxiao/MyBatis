package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Emp;

import java.util.List;

/**
 * @author: baifengxiao
 * @date: 2022/3/18 16:04
 */
public interface DynamicSQLMapper {
//    动态sql
//    1，if：根据test属性中的表达式，决定是否需要拼接到sql中
//    2,where标签配合if标签，where标签有内容会自动生成where关键字，并将内容前(后的不能去)多余的and或or去掉
//    3，trim标签，另外，若标签中没有内容，则trim标签也没有任何效果
    List<Emp> getEmpByCondition(Emp emp);
//    4,choose,when,otherwise

    List<Emp> getEmpByChoose(Emp emp);
    //    5,foreach(2种删除)
    int deleteMoreByArray(@Param("eids") Integer[] eids);
    //1种添加
    int insertMoreByList(@Param("emps") List<Emp> emps);

//    6，sql标签，用于被引用

}
