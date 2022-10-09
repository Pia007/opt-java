package com.springrestdemo.springrestdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Step 3
//extending the abstract base class
//public class MySpringMcvDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//    @Override
//    protected Class<?>[] getRootConfigClasses () {
//
//        return null;
//    }
//
//    ref DemoAppConfig.java
//    @Override
//    protected Class<?>[] getServletConfigClasses () {
//        return new Class[] { DemoAppConfig.class};
//    }
//
//    servlet mapping - map it to the root url
//    @Override
//    protected String[] getServletMappings () {
//        return new String[] { "/" };
//    }
//
//}
