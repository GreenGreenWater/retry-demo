package com.shf.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @author songhaifeng
 * @date 2018/2/26
 */
@SpringBootApplication
@EnableRetry(proxyTargetClass = true)
public class SpringRetryApp {
}
