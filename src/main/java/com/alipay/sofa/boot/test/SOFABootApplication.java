/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.sofa.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author ruoshan
 * @version $Id: SOFABootApplication.java, v 0.1 2019年01月22日 11:45 AM ruoshan Exp $
 */
@SpringBootApplication
@ImportResource("classpath:test.xml")
public class SOFABootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SOFABootApplication.class, args);
    }
}