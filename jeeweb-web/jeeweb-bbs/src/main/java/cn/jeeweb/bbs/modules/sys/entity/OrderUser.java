package cn.jeeweb.bbs.modules.sys.entity;


import cn.jeeweb.bbs.common.entity.DataEntity;
import cn.jeeweb.common.mvc.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import java.util.Date;

/**
 * All rights Reserved, Designed By www.gzst.gov.cn
 *
 * @version V1.0
 * @package cn.jeewe.bbs.modules.sys.entity
 * @title: user实体
 * @description: 用户实体
 * @author: zk
 * @date: 2020-03-12 16:03:56
 * @copyright: 2018 www.gzst.gov.cn Inc. All rights reserved.
 */

@TableName("user")
@SuppressWarnings("serial")
public class OrderUser extends AbstractEntity<String> {

    /**id*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**昵称*/
    @TableField(value = "nickname")
	private String nickname;
    /**登录名*/
    @TableField(value = "login_name")
	private String loginName;
    /**创建时间*/
    @TableField(value = "create_date",fill = FieldFill.INSERT)
	private Date createDate;
    /**活跃天数*/
    @TableField(value = "active_day")
	private Integer activeDay;
    /**上次登录时间*/
    @TableField(value = "last_login_date",fill = FieldFill.INSERT)
	private Date lastLoginDate;
    /**上次登陆ip*/
    @TableField(value = "last_login_ip")
	private String lastLoginIp;
    /**支付密码*/
    @TableField(value = "payment_password")
	private String paymentPassword;
    /**密保问题*/
    @TableField(value = "security _question")
	private String securityQuestion;
    /**密保答案*/
    @TableField(value = "security_answer")
	private String securityAnswer;
    /**用户手机*/
    @TableField(value = "phone")
	private String phone;
    /**陪练认证 0-不是陪练 1-是陪练*/
    @TableField(value = "accompany_flag")
	private Short accompanyFlag;
    /**账号余额*/
    @TableField(value = "pay")
	private Integer pay;
    /**冻结资金*/
    @TableField(value = "frozen_pay")
	private Integer frozenPay;
    /**可用资金*/
    @TableField(value = "enable_pay")
	private Integer enablePay;
    /**总发单输*/
    @TableField(value = "total_singular_number")
	private Integer totalSingularNumber;
    /**客服介入撤单数*/
    @TableField(value = "singular_intervention_withdrawal")
	private Integer singularInterventionWithdrawal;
    /**协商撤单数*/
    @TableField(value = "singular_negotiated_withdrawal_")
	private Integer singularNegotiatedWithdrawal;
    /**总接单数*/
    @TableField(value = "total_accept_number")
	private Integer totalAcceptNumber;
    /**介入撤单数*/
    @TableField(value = "accept_intervention_withdraw")
	private Integer acceptInterventionWithdraw;
    /**友好协商撤单数*/
    @TableField(value = "accept_negotiated_withdraw")
	private Integer acceptNegotiatedWithdraw;
    /**上家非常满意次数*/
    @TableField(value = "up_very_good_number")
	private Integer upVeryGoodNumber;
    /**上家满意次数*/
    @TableField(value = "up_good_number")
	private Integer upGoodNumber;
    /**上家一般次数*/
    @TableField(value = "up_normal_number")
	private Integer upNormalNumber;
    /**上家不满意次数*/
    @TableField(value = "up_bad_number")
	private Integer upBadNumber;
    /**下家非常满意次数*/
    @TableField(value = "down_very_good_number")
	private Integer downVeryGoodNumber;
    /**下家满意次数*/
    @TableField(value = "down_good_number")
	private Integer downGoodNumber;
    /**下家普通次数*/
    @TableField(value = "down_normal_number")
	private Integer downNormalNumber;
    /**下家不满意次数*/
    @TableField(value = "down_bad_number")
	private Integer downBadNumber;
    /**账号等级*/
    @TableField(value = "account_level")
	private Integer accountLevel;
    /**Head*/
    @TableField(value = "head")
	private String head;
    /**限额*/
    @TableField(value = "quota")
	private Integer quota;
    /**发单时是否需要支付密码*/
    @TableField(value = "pay_password_flag")
	private Short payPasswordFlag;
    /**签名*/
    @TableField(value = "signature")
	private String signature;
    /**登录设置
 0：登录时只做账号密码验证
 1：登录时做手机号验证
 2：登录时做密保问题验证
 4：登录同时做手机号和密保问题验证*/
    @TableField(value = "login_set")
	private Integer loginSet;
    /**通知设置*/
    @TableField(value = "notice_set")
	private Integer noticeSet;
    /**用户密码*/
    @TableField(value = "password")
	private String password;
    /**盐*/
    @TableField(value = "salt")
	private String salt;
    @TableField(value = "login_date",fill = FieldFill.UPDATE)
   	private  Date loginDate;
    @TableField(value = "login_ip")
   	private  String loginIP;


	/**
	 * 设置  singularInterventionWithdrawal
	 *@param singularInterventionWithdrawal  客服介入撤单数
	 */
	public void setSingularInterventionWithdrawal(Integer singularInterventionWithdrawal) {
		this.singularInterventionWithdrawal = singularInterventionWithdrawal;
	}

	/**
	 * 获取  id
	 *@return String  id
	 */
	public String getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param id  id
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 * 获取  nickname
	 *@return String  昵称
	 */
	public String getNickname(){
		return this.nickname;
	}

	/**
	 * 设置  nickname
	 *@param nickname  昵称
	 */
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	/**
	 * 获取  loginName
	 *@return String  登录名
	 */
	public String getLoginName(){
		return this.loginName;
	}

	/**
	 * 设置  loginName
	 *@param loginName  登录名
	 */
	public void setLoginName(String loginName){
		this.loginName = loginName;
	}
	/**
	 * 获取  createDate
	 *@return Date  创建时间
	 */
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 * 设置  createDate
	 *@param createDate  创建时间
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	/**
	 * 获取  activeDay
	 *@return Integer  活跃天数
	 */
	public Integer getActiveDay(){
		return this.activeDay;
	}

	/**
	 * 设置  activeDay
	 *@param activeDay  活跃天数
	 */
	public void setActiveDay(Integer activeDay){
		this.activeDay = activeDay;
	}
	/**
	 * 获取  lastLoginDate
	 *@return Date  上次登录时间
	 */
	public Date getLastLoginDate(){
		return this.lastLoginDate;
	}

	/**
	 * 设置  lastLoginDate
	 *@param lastLoginDate  上次登录时间
	 */
	public void setLastLoginDate(Date lastLoginDate){
		this.lastLoginDate = lastLoginDate;
	}
	/**
	 * 获取  lastLoginIp
	 *@return String  上次登陆ip
	 */
	public String getLastLoginIp(){
		return this.lastLoginIp;
	}

	/**
	 * 设置  lastLoginIp
	 *@param lastLoginIp  上次登陆ip
	 */
	public void setLastLoginIp(String lastLoginIp){
		this.lastLoginIp = lastLoginIp;
	}
	/**
	 * 获取  paymentPassword
	 *@return Integer  支付密码
	 */
	public String getPaymentPassword(){
		return this.paymentPassword;
	}

	/**
	 * 设置  paymentPassword
	 *@param paymentPassword  支付密码
	 */
	public void setPaymentPassword(String paymentPassword){
		this.paymentPassword = paymentPassword;
	}
	/**
	 * 获取  security Question
	 *@return String  密保问题
	 */
	public String getSecurityQuestion(){
		return this.securityQuestion;
	}

	/**
	 * 设置  security Question
	 *@param security Question  密保问题
	 */
	public void setSecurityQuestion(String securityQuestion){
		this.securityQuestion = securityQuestion;
	}
	/**
	 * 获取  securityAnswer
	 *@return String  密保答案
	 */
	public String getSecurityAnswer(){
		return this.securityAnswer;
	}

	/**
	 * 设置  securityAnswer
	 *@param securityAnswer  密保答案
	 */
	public void setSecurityAnswer(String securityAnswer){
		this.securityAnswer = securityAnswer;
	}
	/**
	 * 获取  phone
	 *@return Integer  用户手机
	 */
	public String getPhone(){
		return this.phone;
	}

	/**
	 * 设置  phone
	 *@param phone  用户手机
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	/**
	 * 获取  accompanyFlag
	 *@return Short  陪练认证 0-不是陪练 1-是陪练
	 */
	public Short getAccompanyFlag(){
		return this.accompanyFlag;
	}

	/**
	 * 设置  accompanyFlag
	 *@param accompanyFlag  陪练认证 0-不是陪练 1-是陪练
	 */
	public void setAccompanyFlag(Short accompanyFlag){
		this.accompanyFlag = accompanyFlag;
	}
	/**
	 * 获取  pay
	 *@return Integer  账号余额
	 */
	public Integer getPay(){
		return this.pay;
	}

	/**
	 * 设置  pay
	 *@param pay  账号余额
	 */
	public void setPay(Integer pay){
		this.pay = pay;
	}
	/**
	 * 获取  frozenPay
	 *@return Integer  冻结资金
	 */
	public Integer getFrozenPay(){
		return this.frozenPay;
	}

	/**
	 * 设置  frozenPay
	 *@param frozenPay  冻结资金
	 */
	public void setFrozenPay(Integer frozenPay){
		this.frozenPay = frozenPay;
	}
	/**
	 * 获取  enablePay
	 *@return Integer  可用资金
	 */
	public Integer getEnablePay(){
		return this.enablePay;
	}

	/**
	 * 设置  enablePay
	 *@param enablePay  可用资金
	 */
	public void setEnablePay(Integer enablePay){
		this.enablePay = enablePay;
	}
	/**
	 * 获取  totalSingularNumber
	 *@return Integer  总发单输
	 */
	public Integer getTotalSingularNumber(){
		return this.totalSingularNumber;
	}

	/**
	 * 设置  totalSingularNumber
	 *@param totalSingularNumber  总发单输
	 */
	public void setTotalSingularNumber(Integer totalSingularNumber){
		this.totalSingularNumber = totalSingularNumber;
	}
	/**
	 * 获取  singularInterventionWithdrawal
	 *@return Integer  客服介入撤单数
	 */
	public Integer getSingularInterventionWithdrawal(){
		return this.singularInterventionWithdrawal;
	}
	/**
	 * 获取  singularNegotiatedWithdrawal
	 *@return Integer  协商撤单数
	 */
	public Integer getSingularNegotiatedWithdrawal(){
		return this.singularNegotiatedWithdrawal;
	}

	/**
	 * 设置  singularNegotiatedWithdrawal
	 *@param singularNegotiatedWithdrawal  协商撤单数
	 */
	public void setSingularNegotiatedWithdrawal(Integer singularNegotiatedWithdrawal){
		this.singularNegotiatedWithdrawal = singularNegotiatedWithdrawal;
	}
	/**
	 * 获取  totalAcceptNumber
	 *@return Integer  总接单数
	 */
	public Integer getTotalAcceptNumber(){
		return this.totalAcceptNumber;
	}

	/**
	 * 设置  totalAcceptNumber
	 *@param totalAcceptNumber  总接单数
	 */
	public void setTotalAcceptNumber(Integer totalAcceptNumber){
		this.totalAcceptNumber = totalAcceptNumber;
	}
	/**
	 * 获取  acceptInterventionWithdraw
	 *@return Integer  介入撤单数
	 */
	public Integer getAcceptInterventionWithdraw(){
		return this.acceptInterventionWithdraw;
	}

	/**
	 * 设置  acceptInterventionWithdraw
	 *@param acceptInterventionWithdraw  介入撤单数
	 */
	public void setAcceptInterventionWithdraw(Integer acceptInterventionWithdraw){
		this.acceptInterventionWithdraw = acceptInterventionWithdraw;
	}
	/**
	 * 获取  acceptNegotiatedWithdraw
	 *@return Integer  友好协商撤单数
	 */
	public Integer getAcceptNegotiatedWithdraw(){
		return this.acceptNegotiatedWithdraw;
	}

	/**
	 * 设置  acceptNegotiatedWithdraw
	 *@param acceptNegotiatedWithdraw  友好协商撤单数
	 */
	public void setAcceptNegotiatedWithdraw(Integer acceptNegotiatedWithdraw){
		this.acceptNegotiatedWithdraw = acceptNegotiatedWithdraw;
	}
	/**
	 * 获取  upVeryGoodNumber
	 *@return Integer  上家非常满意次数
	 */
	public Integer getUpVeryGoodNumber(){
		return this.upVeryGoodNumber;
	}

	/**
	 * 设置  upVeryGoodNumber
	 *@param upVeryGoodNumber  上家非常满意次数
	 */
	public void setUpVeryGoodNumber(Integer upVeryGoodNumber){
		this.upVeryGoodNumber = upVeryGoodNumber;
	}
	/**
	 * 获取  upGoodNumber
	 *@return Integer  上家满意次数
	 */
	public Integer getUpGoodNumber(){
		return this.upGoodNumber;
	}

	/**
	 * 设置  upGoodNumber
	 *@param upGoodNumber  上家满意次数
	 */
	public void setUpGoodNumber(Integer upGoodNumber){
		this.upGoodNumber = upGoodNumber;
	}
	/**
	 * 获取  upNormalNumber
	 *@return Integer  上家一般次数
	 */
	public Integer getUpNormalNumber(){
		return this.upNormalNumber;
	}

	/**
	 * 设置  upNormalNumber
	 *@param upNormalNumber  上家一般次数
	 */
	public void setUpNormalNumber(Integer upNormalNumber){
		this.upNormalNumber = upNormalNumber;
	}
	/**
	 * 获取  upBadNumber
	 *@return Integer  上家不满意次数
	 */
	public Integer getUpBadNumber(){
		return this.upBadNumber;
	}

	/**
	 * 设置  upBadNumber
	 *@param upBadNumber  上家不满意次数
	 */
	public void setUpBadNumber(Integer upBadNumber){
		this.upBadNumber = upBadNumber;
	}
	/**
	 * 获取  downVeryGoodNumber
	 *@return Integer  下家非常满意次数
	 */
	public Integer getDownVeryGoodNumber(){
		return this.downVeryGoodNumber;
	}

	/**
	 * 设置  downVeryGoodNumber
	 *@param downVeryGoodNumber  下家非常满意次数
	 */
	public void setDownVeryGoodNumber(Integer downVeryGoodNumber){
		this.downVeryGoodNumber = downVeryGoodNumber;
	}
	/**
	 * 获取  downGoodNumber
	 *@return Integer  下家满意次数
	 */
	public Integer getDownGoodNumber(){
		return this.downGoodNumber;
	}

	/**
	 * 设置  downGoodNumber
	 *@param downGoodNumber  下家满意次数
	 */
	public void setDownGoodNumber(Integer downGoodNumber){
		this.downGoodNumber = downGoodNumber;
	}
	/**
	 * 获取  downNormalNumber
	 *@return Integer  下家普通次数
	 */
	public Integer getDownNormalNumber(){
		return this.downNormalNumber;
	}

	/**
	 * 设置  downNormalNumber
	 *@param downNormalNumber  下家普通次数
	 */
	public void setDownNormalNumber(Integer downNormalNumber){
		this.downNormalNumber = downNormalNumber;
	}
	/**
	 * 获取  downBadNumber
	 *@return Integer  下家不满意次数
	 */
	public Integer getDownBadNumber(){
		return this.downBadNumber;
	}

	/**
	 * 设置  downBadNumber
	 *@param downBadNumber  下家不满意次数
	 */
	public void setDownBadNumber(Integer downBadNumber){
		this.downBadNumber = downBadNumber;
	}
	/**
	 * 获取  accountLevel
	 *@return Integer  账号等级
	 */
	public Integer getAccountLevel(){
		return this.accountLevel;
	}

	/**
	 * 设置  accountLevel
	 *@param accountLevel  账号等级
	 */
	public void setAccountLevel(Integer accountLevel){
		this.accountLevel = accountLevel;
	}
	/**
	 * 获取  head
	 *@return String  Head
	 */
	public String getHead(){
		return this.head;
	}

	/**
	 * 设置  head
	 *@param head  Head
	 */
	public void setHead(String head){
		this.head = head;
	}
	/**
	 * 获取  quota
	 *@return Integer  限额
	 */
	public Integer getQuota(){
		return this.quota;
	}

	/**
	 * 设置  quota
	 *@param quota  限额
	 */
	public void setQuota(Integer quota){
		this.quota = quota;
	}
	/**
	 * 获取  payPasswordFlag
	 *@return Short  发单时是否需要支付密码
	 */
	public Short getPayPasswordFlag(){
		return this.payPasswordFlag;
	}

	/**
	 * 设置  payPasswordFlag
	 *@param payPasswordFlag  发单时是否需要支付密码
	 */
	public void setPayPasswordFlag(Short payPasswordFlag){
		this.payPasswordFlag = payPasswordFlag;
	}
	/**
	 * 获取  signature
	 *@return String  前面
	 */
	public String getSignature(){
		return this.signature;
	}

	/**
	 * 设置  signature
	 *@param signature  前面
	 */
	public void setSignature(String signature){
		this.signature = signature;
	}
	/**
	 * 获取  loginSet
	 *@return Integer  登录设置
 0：登录时只做账号密码验证
 1：登录时做手机号验证
 2：登录时做密保问题验证
 4：登录同时做手机号和密保问题验证
	 */
	public Integer getLoginSet(){
		return this.loginSet;
	}

	/**
	 * 设置  loginSet
	 *@param loginSet  登录设置
 0：登录时只做账号密码验证
 1：登录时做手机号验证
 2：登录时做密保问题验证
 4：登录同时做手机号和密保问题验证
	 */
	public void setLoginSet(Integer loginSet){
		this.loginSet = loginSet;
	}
	/**
	 * 获取  noticeSet
	 *@return Integer  通知设置
	 */
	public Integer getNoticeSet(){
		return this.noticeSet;
	}

	/**
	 * 设置  noticeSet
	 *@param noticeSet  通知设置
	 */
	public void setNoticeSet(Integer noticeSet){
		this.noticeSet = noticeSet;
	}
	/**
	 * 获取  password
	 *@return String  用户密码
	 */
	public String getPassword(){
		return this.password;
	}

	/**
	 * 设置  password
	 *@param password  用户密码
	 */
	public void setPassword(String password){
		this.password = password;
	}
	/**
	 * 获取  salt
	 *@return String  盐
	 */
	public String getSalt(){
		return this.salt;
	}

	/**
	 * 设置  salt
	 *@param salt  盐
	 */
	public void setSalt(String salt){
		this.salt = salt;
	}
	public String getCredentialsSalt() {
		return loginName + salt;
	}
	/**
	 * 设置  loginData
	 *@param loginDate  登陆时间
	 */
	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	/**
	 * 设置  登陆ip
	 *@param loginIP  登陆ip
	 */
	public String getLoginIP() {
		return loginIP;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}
	public void setDeful(){
		this.totalSingularNumber= 0;//总接单数
		this.singularInterventionWithdrawal =0;//
		this.singularNegotiatedWithdrawal = 0;
		this.totalAcceptNumber =0;
		this.acceptInterventionWithdraw =0; //初始化200
		this.acceptNegotiatedWithdraw =0;
		this.upVeryGoodNumber =0;
		this.upNormalNumber =0;
		this.upBadNumber =0;
		this.acceptNegotiatedWithdraw =0;
		this.upVeryGoodNumber =0;
		this.upNormalNumber =0;
		this.upBadNumber=0;
		this.downGoodNumber =0;
		this.downNormalNumber =0;
		this.downBadNumber=0;
		this.quota =1000;
		this.payPasswordFlag =1;
		this.loginSet =0;
		this.activeDay=1;
		this.loginDate=new Date();
		this.lastLoginDate=new Date();
		
	};
}