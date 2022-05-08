package mybatis.test;

import mapper.SelectMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.SqlSessionUtils;

import java.io.IOException;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testGetUserByLike() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserByLike("a"));

    }

    @Test
    public void testDeleteMore() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        int result = mapper.deleteMore("3,4,6");
        System.out.println(result);

    }

    @Test
    public void testGetUserByTableName() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getUserByTableName("t_user");
        System.out.println(list);
    }

    @Test
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = new User(null, "王五", "123", 23, "男", "123@126.com");
        mapper.insertUser(user);
        System.out.println(user);
    }

}
