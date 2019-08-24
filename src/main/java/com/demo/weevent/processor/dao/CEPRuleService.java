package com.demo.weevent.processor.dao;

import com.demo.weevent.processor.model.CEPRule;

public interface CEPRuleService {
    CEPRule selectByPrimaryKey(Integer id);
    int insertSelective(CEPRule record);
}
