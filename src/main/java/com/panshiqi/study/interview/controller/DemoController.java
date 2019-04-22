
package com.panshiqi.study.interview.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.panshiqi.study.interview.common.util.ConfigUtil;
import com.panshiqi.study.interview.common.util.LoggerUtil;
import com.panshiqi.study.interview.common.util.SpringContextHolder;
import com.panshiqi.study.interview.entity.DO.DemoDO;
import com.panshiqi.study.interview.service.DemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/demo")
public class DemoController {

    private final static Logger log2 = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoService         demoService;

    @RequestMapping(value = "/log")
    public @ResponseBody String logUtilDemo(HttpServletRequest request) {
        try {
            log.error("日志记录方式1：Slf4j注解");
            log2.error("日志记录方式2：显示声明日志对象");
            LoggerUtil.INSTANCE.access("日志记录方式3：自定义日志工具类");
        } catch (Exception e) {
            log.error("has exception", e);
        }
        return "[demo-->log]  test ok!";
    }

    @RequestMapping(value = "/config")
    public @ResponseBody String configUtilDemo(HttpServletRequest request) {
        try {
            //静态工具获取配置项值
            System.out.println(ConfigUtil.biz.getEvn());
            System.out.println(SpringContextHolder.getBean(ConfigUtil.class).biz.getEvn());
        } catch (Exception e) {
            log.error("has exception", e);
        }
        return "[demo-->config]  test ok!";
    }

    @RequestMapping(value = "/sql")
    public @ResponseBody String sqlDemo(HttpServletRequest request) {
        try {
            DemoDO param = new DemoDO();
            param.setLoginName("admin");
            List<DemoDO> accountList = demoService.query(param);

            if (CollectionUtils.isNotEmpty(accountList)) {
                return "[demo-->sql]  " + JSON.toJSONString(accountList);
            } else {
                return "[demo-->sql]  query result is empty";
            }

        } catch (Exception e) {
            log.error("has exception", e);
        }
        return "[demo-->sql]  test ok!";
    }

}
