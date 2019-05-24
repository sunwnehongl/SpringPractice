package com.swh.spring.bean.comfig.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: swh
 * @Date: 2019/5/24 21:35
 * @Description: ComponetScan 通过basePackages 属性来配置自动扫描的路径
 */
@Configuration
@ComponentScan(basePackages="com.swh.spring.bean")
public class AutoScanByClassConfig {
}
