package com.dianping.activityservice.service.test;

import com.dianping.swiftly.utils.concurrent.XDefaultContext;
import com.dianping.swiftly.utils.concurrent.TemplateProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 *  Created with IntelliJ IDEA.
 *  User: zhaoming
 *  Date: 13-12-24
 *  Time: 下午5:14
 * 
 * </pre>
 */
public class Processor1 extends TemplateProcessor {

    private static Logger logger = LoggerFactory.getLogger(Processor1.class);

    protected Processor1(String name) {
        super(name);
    }

    @Override
    protected Object doWork(XDefaultContext context) {
        logger.info("name :" + name);
        return name;
    }
}
