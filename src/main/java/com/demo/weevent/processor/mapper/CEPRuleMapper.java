package com.demo.weevent.processor.mapper;

import com.demo.weevent.processor.model.CEPRule;
import com.demo.weevent.processor.model.CEPRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CEPRuleMapper {
    long countByExample(CEPRuleExample example);

    int deleteByExample(CEPRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CEPRule record);

    int insertSelective(CEPRule record);

    List<CEPRule> selectByExample(CEPRuleExample example);

    CEPRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CEPRule record, @Param("example") CEPRuleExample example);

    int updateByExample(@Param("record") CEPRule record, @Param("example") CEPRuleExample example);

    int updateByPrimaryKeySelective(CEPRule record);

    int updateByPrimaryKey(CEPRule record);
}