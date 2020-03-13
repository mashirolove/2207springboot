package cn.jeeweb.bbs.modules.sys.service.impl;

import cn.jeeweb.bbs.modules.sys.entity.OrderUser;
import cn.jeeweb.bbs.modules.sys.mapper.OrderUserMapper;
import cn.jeeweb.bbs.modules.sys.service.IOrderUserService;
import cn.jeeweb.common.mybatis.mvc.service.impl.CommonServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
* All rights Reserved, Designed By www.gzst.gov.cn
*
* @version V1.0
* @package cn.jeewe.bbs.modules.sys.service.impl
* @title: user服务实现
* @description: 用户服务实现
* @author: zk
* @date: 2020-03-12 16:03:56
* @copyright: 2018 www.gzst.gov.cn Inc. All rights reserved.
*/
@Transactional
@Service("orderrService")
public class OrderUserServiceImpl  extends CommonServiceImpl<OrderUserMapper,OrderUser> implements  IOrderUserService {
     
	@Autowired
	PasswordService passwordService;
	@Override
	public OrderUser register(OrderUser orderUser) {
		// TODO Auto-generated method stub
		orderUser.setDeful();
		passwordService.encryptPassword(orderUser);
		super.insert(orderUser);
		return orderUser;
	}

}