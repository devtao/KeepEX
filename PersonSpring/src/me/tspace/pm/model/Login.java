package me.tspace.pm.model;

import java.util.Date;

public class Login {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.LOGIN_ID
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    private Integer loginId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.LOGIN_NAME
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.LOGIN_PWD
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    private String loginPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.LOGIN_LEVEL
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    private Integer loginLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.LOGIN_IP
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    private String loginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.LOGIN_REGDATE
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    private Date loginRegdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.LOGIN_LASTDATE
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    private Date loginLastdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.LOGIN_ID
     *
     * @return the value of t_login.LOGIN_ID
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public Integer getLoginId() {
        return loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login.LOGIN_ID
     *
     * @param loginId the value for t_login.LOGIN_ID
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.LOGIN_NAME
     *
     * @return the value of t_login.LOGIN_NAME
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login.LOGIN_NAME
     *
     * @param loginName the value for t_login.LOGIN_NAME
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.LOGIN_PWD
     *
     * @return the value of t_login.LOGIN_PWD
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login.LOGIN_PWD
     *
     * @param loginPwd the value for t_login.LOGIN_PWD
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.LOGIN_LEVEL
     *
     * @return the value of t_login.LOGIN_LEVEL
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public Integer getLoginLevel() {
        return loginLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login.LOGIN_LEVEL
     *
     * @param loginLevel the value for t_login.LOGIN_LEVEL
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public void setLoginLevel(Integer loginLevel) {
        this.loginLevel = loginLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.LOGIN_IP
     *
     * @return the value of t_login.LOGIN_IP
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login.LOGIN_IP
     *
     * @param loginIp the value for t_login.LOGIN_IP
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.LOGIN_REGDATE
     *
     * @return the value of t_login.LOGIN_REGDATE
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public Date getLoginRegdate() {
        return loginRegdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login.LOGIN_REGDATE
     *
     * @param loginRegdate the value for t_login.LOGIN_REGDATE
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public void setLoginRegdate(Date loginRegdate) {
        this.loginRegdate = loginRegdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.LOGIN_LASTDATE
     *
     * @return the value of t_login.LOGIN_LASTDATE
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public Date getLoginLastdate() {
        return loginLastdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login.LOGIN_LASTDATE
     *
     * @param loginLastdate the value for t_login.LOGIN_LASTDATE
     *
     * @mbggenerated Sun May 26 14:00:34 CST 2013
     */
    public void setLoginLastdate(Date loginLastdate) {
        this.loginLastdate = loginLastdate;
    }
}