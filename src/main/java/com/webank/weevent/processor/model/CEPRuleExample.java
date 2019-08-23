package com.webank.weevent.processor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CEPRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CEPRuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdIsNull() {
            addCriterion("rule_trigger_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdIsNotNull() {
            addCriterion("rule_trigger_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdEqualTo(Integer value) {
            addCriterion("rule_trigger_id =", value, "ruleTriggerId");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdNotEqualTo(Integer value) {
            addCriterion("rule_trigger_id <>", value, "ruleTriggerId");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdGreaterThan(Integer value) {
            addCriterion("rule_trigger_id >", value, "ruleTriggerId");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_trigger_id >=", value, "ruleTriggerId");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdLessThan(Integer value) {
            addCriterion("rule_trigger_id <", value, "ruleTriggerId");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdLessThanOrEqualTo(Integer value) {
            addCriterion("rule_trigger_id <=", value, "ruleTriggerId");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdIn(List<Integer> values) {
            addCriterion("rule_trigger_id in", values, "ruleTriggerId");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdNotIn(List<Integer> values) {
            addCriterion("rule_trigger_id not in", values, "ruleTriggerId");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdBetween(Integer value1, Integer value2) {
            addCriterion("rule_trigger_id between", value1, value2, "ruleTriggerId");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_trigger_id not between", value1, value2, "ruleTriggerId");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andFromDestinationIsNull() {
            addCriterion("from_destination is null");
            return (Criteria) this;
        }

        public Criteria andFromDestinationIsNotNull() {
            addCriterion("from_destination is not null");
            return (Criteria) this;
        }

        public Criteria andFromDestinationEqualTo(String value) {
            addCriterion("from_destination =", value, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationNotEqualTo(String value) {
            addCriterion("from_destination <>", value, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationGreaterThan(String value) {
            addCriterion("from_destination >", value, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("from_destination >=", value, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationLessThan(String value) {
            addCriterion("from_destination <", value, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationLessThanOrEqualTo(String value) {
            addCriterion("from_destination <=", value, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationLike(String value) {
            addCriterion("from_destination like", value, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationNotLike(String value) {
            addCriterion("from_destination not like", value, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationIn(List<String> values) {
            addCriterion("from_destination in", values, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationNotIn(List<String> values) {
            addCriterion("from_destination not in", values, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationBetween(String value1, String value2) {
            addCriterion("from_destination between", value1, value2, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andFromDestinationNotBetween(String value1, String value2) {
            addCriterion("from_destination not between", value1, value2, "fromDestination");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andConditionTypeIsNull() {
            addCriterion("condition_type is null");
            return (Criteria) this;
        }

        public Criteria andConditionTypeIsNotNull() {
            addCriterion("condition_type is not null");
            return (Criteria) this;
        }

        public Criteria andConditionTypeEqualTo(Integer value) {
            addCriterion("condition_type =", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeNotEqualTo(Integer value) {
            addCriterion("condition_type <>", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeGreaterThan(Integer value) {
            addCriterion("condition_type >", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("condition_type >=", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeLessThan(Integer value) {
            addCriterion("condition_type <", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("condition_type <=", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeIn(List<Integer> values) {
            addCriterion("condition_type in", values, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeNotIn(List<Integer> values) {
            addCriterion("condition_type not in", values, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeBetween(Integer value1, Integer value2) {
            addCriterion("condition_type between", value1, value2, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("condition_type not between", value1, value2, "conditionType");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlIsNull() {
            addCriterion("broker_url is null");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlIsNotNull() {
            addCriterion("broker_url is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlEqualTo(String value) {
            addCriterion("broker_url =", value, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlNotEqualTo(String value) {
            addCriterion("broker_url <>", value, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlGreaterThan(String value) {
            addCriterion("broker_url >", value, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("broker_url >=", value, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlLessThan(String value) {
            addCriterion("broker_url <", value, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlLessThanOrEqualTo(String value) {
            addCriterion("broker_url <=", value, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlLike(String value) {
            addCriterion("broker_url like", value, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlNotLike(String value) {
            addCriterion("broker_url not like", value, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlIn(List<String> values) {
            addCriterion("broker_url in", values, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlNotIn(List<String> values) {
            addCriterion("broker_url not in", values, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlBetween(String value1, String value2) {
            addCriterion("broker_url between", value1, value2, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andBrokerUrlNotBetween(String value1, String value2) {
            addCriterion("broker_url not between", value1, value2, "brokerUrl");
            return (Criteria) this;
        }

        public Criteria andToDestinationIsNull() {
            addCriterion("to_destination is null");
            return (Criteria) this;
        }

        public Criteria andToDestinationIsNotNull() {
            addCriterion("to_destination is not null");
            return (Criteria) this;
        }

        public Criteria andToDestinationEqualTo(String value) {
            addCriterion("to_destination =", value, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationNotEqualTo(String value) {
            addCriterion("to_destination <>", value, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationGreaterThan(String value) {
            addCriterion("to_destination >", value, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("to_destination >=", value, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationLessThan(String value) {
            addCriterion("to_destination <", value, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationLessThanOrEqualTo(String value) {
            addCriterion("to_destination <=", value, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationLike(String value) {
            addCriterion("to_destination like", value, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationNotLike(String value) {
            addCriterion("to_destination not like", value, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationIn(List<String> values) {
            addCriterion("to_destination in", values, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationNotIn(List<String> values) {
            addCriterion("to_destination not in", values, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationBetween(String value1, String value2) {
            addCriterion("to_destination between", value1, value2, "toDestination");
            return (Criteria) this;
        }

        public Criteria andToDestinationNotBetween(String value1, String value2) {
            addCriterion("to_destination not between", value1, value2, "toDestination");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlIsNull() {
            addCriterion("databaseUrl is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlIsNotNull() {
            addCriterion("databaseUrl is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlEqualTo(String value) {
            addCriterion("databaseUrl =", value, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlNotEqualTo(String value) {
            addCriterion("databaseUrl <>", value, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlGreaterThan(String value) {
            addCriterion("databaseUrl >", value, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlGreaterThanOrEqualTo(String value) {
            addCriterion("databaseUrl >=", value, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlLessThan(String value) {
            addCriterion("databaseUrl <", value, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlLessThanOrEqualTo(String value) {
            addCriterion("databaseUrl <=", value, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlLike(String value) {
            addCriterion("databaseUrl like", value, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlNotLike(String value) {
            addCriterion("databaseUrl not like", value, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlIn(List<String> values) {
            addCriterion("databaseUrl in", values, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlNotIn(List<String> values) {
            addCriterion("databaseUrl not in", values, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlBetween(String value1, String value2) {
            addCriterion("databaseUrl between", value1, value2, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andDatabaseurlNotBetween(String value1, String value2) {
            addCriterion("databaseUrl not between", value1, value2, "databaseurl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationIsNull() {
            addCriterion("error_destination is null");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationIsNotNull() {
            addCriterion("error_destination is not null");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationEqualTo(String value) {
            addCriterion("error_destination =", value, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationNotEqualTo(String value) {
            addCriterion("error_destination <>", value, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationGreaterThan(String value) {
            addCriterion("error_destination >", value, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("error_destination >=", value, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationLessThan(String value) {
            addCriterion("error_destination <", value, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationLessThanOrEqualTo(String value) {
            addCriterion("error_destination <=", value, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationLike(String value) {
            addCriterion("error_destination like", value, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationNotLike(String value) {
            addCriterion("error_destination not like", value, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationIn(List<String> values) {
            addCriterion("error_destination in", values, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationNotIn(List<String> values) {
            addCriterion("error_destination not in", values, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationBetween(String value1, String value2) {
            addCriterion("error_destination between", value1, value2, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorDestinationNotBetween(String value1, String value2) {
            addCriterion("error_destination not between", value1, value2, "errorDestination");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("error_code is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("error_code is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("error_code =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("error_code <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("error_code >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("error_code >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("error_code <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("error_code <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("error_code like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("error_code not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("error_code in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("error_code not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("error_code between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("error_code not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNull() {
            addCriterion("error_message is null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNotNull() {
            addCriterion("error_message is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageEqualTo(String value) {
            addCriterion("error_message =", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotEqualTo(String value) {
            addCriterion("error_message <>", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThan(String value) {
            addCriterion("error_message >", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("error_message >=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThan(String value) {
            addCriterion("error_message <", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("error_message <=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLike(String value) {
            addCriterion("error_message like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotLike(String value) {
            addCriterion("error_message not like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIn(List<String> values) {
            addCriterion("error_message in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotIn(List<String> values) {
            addCriterion("error_message not in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageBetween(String value1, String value2) {
            addCriterion("error_message between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotBetween(String value1, String value2) {
            addCriterion("error_message not between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andExParamIsNull() {
            addCriterion("ex_param is null");
            return (Criteria) this;
        }

        public Criteria andExParamIsNotNull() {
            addCriterion("ex_param is not null");
            return (Criteria) this;
        }

        public Criteria andExParamEqualTo(String value) {
            addCriterion("ex_param =", value, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamNotEqualTo(String value) {
            addCriterion("ex_param <>", value, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamGreaterThan(String value) {
            addCriterion("ex_param >", value, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamGreaterThanOrEqualTo(String value) {
            addCriterion("ex_param >=", value, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamLessThan(String value) {
            addCriterion("ex_param <", value, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamLessThanOrEqualTo(String value) {
            addCriterion("ex_param <=", value, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamLike(String value) {
            addCriterion("ex_param like", value, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamNotLike(String value) {
            addCriterion("ex_param not like", value, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamIn(List<String> values) {
            addCriterion("ex_param in", values, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamNotIn(List<String> values) {
            addCriterion("ex_param not in", values, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamBetween(String value1, String value2) {
            addCriterion("ex_param between", value1, value2, "exParam");
            return (Criteria) this;
        }

        public Criteria andExParamNotBetween(String value1, String value2) {
            addCriterion("ex_param not between", value1, value2, "exParam");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}