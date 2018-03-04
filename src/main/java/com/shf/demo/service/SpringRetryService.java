package com.shf.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

/**
 *
 * AnnotationAwareRetryOperationsInterceptor
 *
 * @author songhaifeng
 * @date 2018/2/28
 */
@Component
public class SpringRetryService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringRetryService.class);

    @Retryable(value = Exception.class, maxAttempts = 4, backoff = @Backoff(value = 0L))
    public void run() throws Exception {
        LOGGER.info("do sth");
        throw new Exception("error");
    }

    @Recover
    private void recover(Exception e) {
        LOGGER.info("invoke recover");
    }

}
