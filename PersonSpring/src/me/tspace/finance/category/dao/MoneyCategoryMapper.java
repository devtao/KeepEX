package me.tspace.finance.category.dao;

import me.tspace.finance.category.pojo.MoneyCategory;

public interface MoneyCategoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_money_category
	 * @mbggenerated  Thu Sep 12 23:00:05 CST 2013
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_money_category
	 * @mbggenerated  Thu Sep 12 23:00:05 CST 2013
	 */
	int insert(MoneyCategory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_money_category
	 * @mbggenerated  Thu Sep 12 23:00:05 CST 2013
	 */
	int insertSelective(MoneyCategory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_money_category
	 * @mbggenerated  Thu Sep 12 23:00:05 CST 2013
	 */
	MoneyCategory selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_money_category
	 * @mbggenerated  Thu Sep 12 23:00:05 CST 2013
	 */
	int updateByPrimaryKeySelective(MoneyCategory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_money_category
	 * @mbggenerated  Thu Sep 12 23:00:05 CST 2013
	 */
	int updateByPrimaryKey(MoneyCategory record);
}