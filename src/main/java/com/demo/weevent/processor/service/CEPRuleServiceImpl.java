package com.demo.weevent.processor.service;

import java.util.List;

import com.demo.weevent.processor.dao.CEPRuleService;
import com.demo.weevent.processor.mapper.CEPRuleMapper;
import com.demo.weevent.processor.model.CEPRule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CEPRuleServiceImpl implements CEPRuleService {

    @Autowired
    CEPRuleMapper cepRuleMapper;

    @Override
    public  int insertSelective(CEPRule record) {
        return cepRuleMapper.insertSelective(record);
    }

    @Override
    public CEPRule selectByPrimaryKey(Integer id) {
        return cepRuleMapper.selectByPrimaryKey(id);
    }
}
