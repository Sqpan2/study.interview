
package com.panshiqi.study.interview.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseDao {

    // 备注：之所以不使用BaseDao直接继承SqlSessionDaoSupport，是因为 Dao 上用到了Aop，而SqlSessionDaoSupport有final方法，AOP无法代理，会抛出警告。所以用一个SqlSession类进行中继。

    @Autowired
    private SqlSession sqlSession;

    public org.apache.ibatis.session.SqlSession getSqlSession() {

        return sqlSession.getSqlSession();
    }

}
