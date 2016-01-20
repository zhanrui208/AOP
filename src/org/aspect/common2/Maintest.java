package org.aspect.common2;

import java.util.logging.Logger;

public class Maintest {
	public static Logger logger = Logger.getLogger(Maintest.class.getSimpleName());
    public static void main(String[] args) {
        BussinessService bs = LogInvoHandler.getProxyInstance(BussinessServiceImpl.class);
        bs.login("zhangsan", "123456");
        bs.find();
        logger.info("--------------------------------------");
        WorkService ws = LogInvoHandler.getProxyInstance(WorkServiceImpl.class);
        ws.work();
        ws.sleep();
        logger.info("--------------------------------------");
        BussinessService bss = LogInvoHandler.getProxyInstance(BussinessServiceImpl.class);
        bss.login("lisi", "654321");
        bss.find();
    }
}
