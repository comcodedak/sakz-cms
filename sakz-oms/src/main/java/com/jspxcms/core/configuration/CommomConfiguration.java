package com.jspxcms.core.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.sakz.common.ip.IPSeeker;

/**
 * 通用组件common配置
 * @author hunter
 *
 */
@Configuration
public class CommomConfiguration {
	/**
	 * 注册IP库工具
	 * @return
	 */
	@Bean
    public IPSeeker ipSeeker() {
    	try {
			return new IPSeeker(null);
		} catch (Exception e) {
			return null;
		}
    }
}
