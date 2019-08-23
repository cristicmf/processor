package com.webank.weevent.processor.mapper;

import com.webank.weevent.processor.model.RuleTrigger;
import com.webank.weevent.processor.model.RuleTriggerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuleTriggerMapper {
    long countByExample(RuleTriggerExample example);

    int deleteByExample(RuleTriggerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RuleTrigger record);

    int insertSelective(RuleTrigger record);

    List<RuleTrigger> selectByExample(RuleTriggerExample example);

    RuleTrigger selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RuleTrigger record, @Param("example") RuleTriggerExample example);

    int updateByExample(@Param("record") RuleTrigger record, @Param("example") RuleTriggerExample example);

    int updateByPrimaryKeySelective(RuleTrigger record);

    int updateByPrimaryKey(RuleTrigger record);
}