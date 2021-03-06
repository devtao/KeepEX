package me.tspace.finance.invest.pojo;

import java.util.Date;

public class MoneyInvest {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_invest.id
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_invest.invest_type
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    private String investType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_invest.amount
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    private Float amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_invest.create_date
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_invest.invest_flag
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    private String investFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_invest.remark
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_invest.id
     *
     * @return the value of t_money_invest.id
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_invest.id
     *
     * @param id the value for t_money_invest.id
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_invest.invest_type
     *
     * @return the value of t_money_invest.invest_type
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public String getInvestType() {
        return investType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_invest.invest_type
     *
     * @param investType the value for t_money_invest.invest_type
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public void setInvestType(String investType) {
        this.investType = investType == null ? null : investType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_invest.amount
     *
     * @return the value of t_money_invest.amount
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_invest.amount
     *
     * @param amount the value for t_money_invest.amount
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public void setAmount(Float amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_invest.create_date
     *
     * @return the value of t_money_invest.create_date
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_invest.create_date
     *
     * @param createDate the value for t_money_invest.create_date
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_invest.invest_flag
     *
     * @return the value of t_money_invest.invest_flag
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public String getInvestFlag() {
        return investFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_invest.invest_flag
     *
     * @param investFlag the value for t_money_invest.invest_flag
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public void setInvestFlag(String investFlag) {
        this.investFlag = investFlag == null ? null : investFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_invest.remark
     *
     * @return the value of t_money_invest.remark
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_invest.remark
     *
     * @param remark the value for t_money_invest.remark
     *
     * @mbggenerated Thu Sep 12 23:04:00 CST 2013
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}