package cn.jeeweb.bbs.modules.sys.mapper;


import cn.jeeweb.bbs.modules.sys.entity.OrderUser;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
 * All rights Reserved, Designed By www.gzst.gov.cn
 *
 * @version V1.0
 * @package cn.jeewe.bbs.modules.sys.mapper
 * @title: user数据库控制层接口
 * @description: 用户数据库控制层接口
 * @author: zk
 * @date: 2020-03-12 16:03:56
 * @copyright: 2018 www.gzst.gov.cn Inc. All rights reserved.
 */
@Mapper
public interface OrderUserMapper extends BaseMapper<OrderUser> {
    
}