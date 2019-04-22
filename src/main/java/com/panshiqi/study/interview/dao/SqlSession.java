
package com.panshiqi.study.interview.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class SqlSession extends SqlSessionDaoSupport {

    // 备注：Mybatis3依赖的 mybatis-spring-1.2.0.jar,对SqlSessionDaoSupport类中的'sqlSessionFactory'或'sqlSessionTemplate'注入方式进行了调整，有别于 mybatis-spring-1.1.1.jar的配置。

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
