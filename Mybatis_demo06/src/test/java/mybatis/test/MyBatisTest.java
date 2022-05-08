package mybatis.test;


import mapper.DynamicSQLMapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import pojo.Emp;
import utils.SqlSessionUtils;

import java.util.Arrays;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByCondition(new Emp(null, "", null, "男", "123@qq.com"));
        System.out.println(list);


    } @Test
    public void testDeleteMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int result = mapper.deleteMoreByArray(new Integer[]{6, 7});
        System.out.println(result);


    }
    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByChoose(new Emp(null, "null", null, "男", "123@qq.com"));
        System.out.println(list);


    }    @Test
    public void testInsertMoreByList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "a", null, "男", "123@qq.com");
        Emp emp2 = new Emp(null, "a2", null, "男", "123@qq.com");
        Emp emp3 = new Emp(null, "a3", null, "男", "123@qq.com");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        System.out.println(mapper.insertMoreByList(list));


    }


}
