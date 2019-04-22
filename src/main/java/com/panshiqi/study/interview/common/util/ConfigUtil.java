
package com.panshiqi.study.interview.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.panshiqi.study.interview.common.config.BizConfig;

@Component
public class ConfigUtil {

	/**
	 * 业务配置信息
	 */
	public static BizConfig biz;

	/**  
	 * 设置 业务配置信息  
	 * @param biz 业务配置信息  
	 */
	@Autowired(required = true)
	public void setBiz(BizConfig biz) {
		ConfigUtil.biz = biz;
	}
}
