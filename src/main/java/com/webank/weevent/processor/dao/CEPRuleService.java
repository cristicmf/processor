package com.webank.weevent.processor.dao;

import com.webank.weevent.processor.model.CEPRule;

public interface CEPRuleService {
    CEPRule selectByPrimaryKey(Integer id);
    int insertSelective(CEPRule record);
}
