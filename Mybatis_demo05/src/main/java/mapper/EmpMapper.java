package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Emp;

import java.util.List;

public interface EmpMapper {
    //字段不一致情况,赋不了值
//    解决方式1，给字段起别名
//    2,设置全局映射，驼峰命名（规范命名的时候才可用）
//    3,用resultMap
    List<Emp> getAllEmp();
    List<Emp> getAllEmpByResultMap();
    //1对多，多对1处理
//    1，通过级联处理
    Emp getEmpAndDept(@Param("eid") Integer eid);
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);
    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);
}
