package cn.jeeweb.bbs.security.shiro.realm;

import java.io.Serializable;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jeeweb.bbs.modules.sys.entity.OrderUser;
import cn.jeeweb.bbs.modules.sys.service.IOrderUserService;
import cn.jeeweb.bbs.security.shiro.filter.authc.UsernamePasswordToken;
import cn.jeeweb.bbs.utils.UserUtils;

public class OrderUserRealm  extends AuthorizingRealm  {
	@Autowired 
	IOrderUserService orderUserService;
	/**
	 * 授权的回调方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(UserUtils.getRoleStringList());
		authorizationInfo.setStringPermissions(UserUtils.getPermissionsList());
		return authorizationInfo;
	}
    /**
     * 认证回调方法
     */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken authcToken = (UsernamePasswordToken) token;
		String loginName = authcToken.getUsername();
		OrderUser orderUser = orderUserService.findByLoginName(loginName);
		/*
		 * if (user == null) { user = userService.findByEmail(username); if (user ==
		 * null) { user = userService.findByPhone(username); } }
		 */
		if (orderUser == null) {
			throw new UnknownAccountException();// 没找到帐号
		}

		/*
		 * if (User.STATUS_LOCKED.equals(user.getStatus())) { throw new
		 * LockedAccountException(); // 帐号锁定 }
		 */
		// 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				new Principal(orderUser, authcToken.isMobileLogin()), // 用户名
				orderUser.getPassword(), // 密码
				ByteSource.Util.bytes(orderUser.getCredentialsSalt()), // salt=username+salt
				getName() // nickname
		);
		return authenticationInfo;
	}
	/**
	 * 授权用户信息
	 */
	public static class Principal implements Serializable {

		private static final long serialVersionUID = 1L;

		private String id; // 编号
		private String loginName; // 登录名
		private String nickname; // 昵称()
		private boolean mobileLogin; // 是否手机登录

		public Principal(OrderUser orderUser, boolean mobileLogin) {
			this.id = orderUser.getId();
			this.loginName = orderUser.getLoginName();
			this.nickname = orderUser.getNickname();
			this.mobileLogin = mobileLogin;
		}

		public String getId() {
			return id;
		}

		public String getLoginName() {
			return loginName;
		}

		public String getNickName() {
			return nickname;
		}

		public boolean isMobileLogin() {
			return mobileLogin;
		}

		/**
		 * 获取SESSIONID
		 */
		public String getSessionid() {
			try {
				return (String) UserUtils.getSession().getId();
			} catch (Exception e) {
				return "";
			}
		}

		@Override
		public String toString() {
			return id;
		}

	}

}
