package mybatis.test;

import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: baifengxiao
 * @date: 2022/3/12 16:51
 */

public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
//        加载sqlsession
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        获取mapper接口对象(mapper通过反射在底层创建的)
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int result = mapper.insertUser();
//        提交事务
//        sqlSession.commit();
        System.out.println("result:"+result);
    }

    @Test
    public void testupdate() throws IOException {
//        加载sqlsession
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        获取mapper接口对象(mapper通过反射在底层创建的)
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser();
    }
    @Test
    public void testdelete() throws IOException {
//        加载sqlsession
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        获取mapper接口对象(mapper通过反射在底层创建的)
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser();
    }

    @Test
    public void testselectById() throws IOException {
//        加载sqlsession
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        获取mapper接口对象(mapper通过反射在底层创建的)
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById();
        System.out.println(user);

    }

    @Test
    public void testselectAll() throws IOException {
//        加载sqlsession
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        获取mapper接口对象(mapper通过反射在底层创建的)
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }
}
