package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Dept;

/**
 * @author: baifengxiao
 * @date: 2022/3/16 18:03
 */
public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);
    Dept getDeptAndEmp(@Param("did") Integer did);
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);

}
