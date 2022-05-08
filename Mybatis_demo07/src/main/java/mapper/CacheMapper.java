package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Emp;

/**
 * @author: baifengxiao
 * @date: 2022/3/19 10:08
 */
//缓存
//    1，一级缓存（默认开启的开启的），sqlsession级别的
//    失效的四种情况
//            不同sqlsession是不同缓存
//改变了数据库数据（进行了增删改）
//查询条件不同
//手动删了缓存

//    2，二级缓存，使用条件如下
//    设置全局配置属性cacheEnabled="true"   (默认为true，不用设置)
//    映射文件中设置标签<cache/>
//    sqlsession关闭或提交后才有效
//    实现了序列号接口
//    唯一失效条件：两次查询间用了任意增删改
public interface CacheMapper {
    Emp getEmpByEid(@Param("eid") Integer eid);



}
