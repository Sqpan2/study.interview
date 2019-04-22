
package com.panshiqi.study.interview.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;

@Getter
@Configuration
@PropertySource(value = "classpath:application-biz.properties")
public class BizConfig {

	@Value("${evn}")
	private String evn = "";

}
