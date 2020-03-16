package cn.jeeweb;

import cn.jeeweb.bbs.modules.sys.entity.OrderUser;
import cn.jeeweb.bbs.modules.sys.service.impl.OrderUserServiceImpl;
import cn.jeeweb.common.utils.SpringContextHolder;
import cn.jeeweb.common.utils.StringUtils;

import java.util.Random;

/**
 * All rights Reserved, Designed By www.jeeweb.cn
 *
 * @version V1.0
 * @package cn.jeeweb
 * @title:
 * @description: Cache工具类
 * @author: 王存见
 * @date: 2018/9/7 17:34
 * @copyright: 2017 www.jeeweb.cn Inc. All rights reserved.
 */
public class Test {
    public static void main(String[] args) {
    	OrderUserServiceImpl ord=(OrderUserServiceImpl) SpringContextHolder.getBean("orderrService");
    	OrderUser ordu=ord.findByLoginName("admin");
    	System.out.println(ordu);
    }
}