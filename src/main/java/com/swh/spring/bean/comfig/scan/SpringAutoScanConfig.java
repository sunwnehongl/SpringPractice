package com.swh.spring.bean.comfig.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: swh
 * @Date: 2019/5/22 22:04
 * @Description: Spring 自动扫描的配置类
 */
@Configuration
@ComponentScan("com.swh.spring.bean")
public class SpringAutoScanConfig {
}
