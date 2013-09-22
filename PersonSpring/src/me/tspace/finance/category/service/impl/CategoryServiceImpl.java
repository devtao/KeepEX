package me.tspace.finance.category.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import me.tspace.finance.category.dao.MoneyCategoryMapper;
import me.tspace.finance.category.service.ICategoryService;

@Service
@Scope("prototype")
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	MoneyCategoryMapper categoryMapper;

	@Override
	public List<Map> getIncomeCategory() {
		List<Map> categorys = categoryMapper.selectCategoryByType("收入");
		return categorys;
	}

	@Override
	public List<Map> getOutcomeCategory() {
		List<Map> categorys =  categoryMapper.selectCategoryByType("支出");
		return categorys;
	}

}
