package mybatis.test;

import mapper.DeptMapper;
import mapper.EmpMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Dept;
import pojo.Emp;
import utils.SqlSessionUtils;

import java.util.List;

public class MyBatisTest {

    @Test
    public void testGetAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> list = mapper.getAllEmp();
        list.forEach(emp -> System.out.println(emp));


    }

    @Test
    public void testGetAllEmpByResultMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> list = mapper.getAllEmpByResultMap();
        list.forEach(emp -> System.out.println(emp));


    }

    @Test
    public void testGetEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(1);
        System.out.println(emp);

    }

    @Test
    public void testGetEmpAndDeptByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(1);
        System.out.println(emp);
        System.out.println(emp.getEmpName());

    }

    @Test
    public void testDeptAndEmpResultMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmp(1);
        //同样有延迟加载功能
        System.out.println(dept);

    }


}
