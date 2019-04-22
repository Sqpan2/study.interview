
package com.panshiqi.study.interview.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panshiqi.study.interview.dao.DemoDao;
import com.panshiqi.study.interview.entity.DO.DemoDO;
import com.panshiqi.study.interview.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public List<DemoDO> query(DemoDO param) {

        return demoDao.query(param);
    }

}
