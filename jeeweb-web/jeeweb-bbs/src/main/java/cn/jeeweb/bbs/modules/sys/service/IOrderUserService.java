package cn.jeeweb.bbs.modules.sys.service;

import cn.jeeweb.bbs.modules.sys.entity.OrderUser;
import cn.jeeweb.common.mybatis.mvc.service.ICommonService;


/**
* All rights Reserved, Designed By www.gzst.gov.cn
*
* @version V1.0
* @package cn.jeewe.bbs.modules.sys.service
* @title: OrderUser服务接口
* @description: 用户服务接口
* @author: zk
* @date: 2020-03-12 16:03:56
* @copyright: 2018 www.gzst.gov.cn Inc. All rights reserved.
*/
public interface IOrderUserService extends ICommonService<OrderUser> {
    /**
         *   用户注册
     * @param orderUser
     * @return
     */
	OrderUser register(OrderUser orderUser);
	/**
	 * 根据用户名登陆名查找用户
	 * 
	 * @param loginName
	 * @return
	 */
	public OrderUser findByLoginName(String loginName);

}