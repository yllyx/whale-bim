package com.yllyx.whalebim.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.yllyx.whalebim")
public class FeignConfiguration {

}
