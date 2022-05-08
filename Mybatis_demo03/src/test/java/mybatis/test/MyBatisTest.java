package mybatis.test;

import mapper.SelectMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.SqlSessionUtils;

import java.io.IOException;

public class MyBatisTest {

    @Test
    public void testGetUserById() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(3));

    }
    @Test
    public void testGetUserByIdToList() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserByIdToList(3));

    }
    @Test
    public void testGetUserByIdToMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserByIdToMap(3));

    }

//    ---------------------------------------------



    @Test
    public void testGetUserToList() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserToList());

    }

    @Test
    public void testGetCount() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getCount());

    }

    @Test
    public void testGetUsersToMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUsersToMap());

    }
    @Test
    public void testGetUsersToMapByMapkey() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUsersToMapByMapkey());

    }

}
