package com.demo.weevent.processor.model;

import java.util.ArrayList;
import java.util.List;

public class RuleTriggerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RuleTriggerExample() {
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

        public Criteria andRuleIdIsNull() {
            addCriterion("rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(Integer value) {
            addCriterion("rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(Integer value) {
            addCriterion("rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(Integer value) {
            addCriterion("rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(Integer value) {
            addCriterion("rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<Integer> values) {
            addCriterion("rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<Integer> values) {
            addCriterion("rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_id not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andFilterTagIsNull() {
            addCriterion("filter_tag is null");
            return (Criteria) this;
        }

        public Criteria andFilterTagIsNotNull() {
            addCriterion("filter_tag is not null");
            return (Criteria) this;
        }

        public Criteria andFilterTagEqualTo(Byte value) {
            addCriterion("filter_tag =", value, "filterTag");
            return (Criteria) this;
        }

        public Criteria andFilterTagNotEqualTo(Byte value) {
            addCriterion("filter_tag <>", value, "filterTag");
            return (Criteria) this;
        }

        public Criteria andFilterTagGreaterThan(Byte value) {
            addCriterion("filter_tag >", value, "filterTag");
            return (Criteria) this;
        }

        public Criteria andFilterTagGreaterThanOrEqualTo(Byte value) {
            addCriterion("filter_tag >=", value, "filterTag");
            return (Criteria) this;
        }

        public Criteria andFilterTagLessThan(Byte value) {
            addCriterion("filter_tag <", value, "filterTag");
            return (Criteria) this;
        }

        public Criteria andFilterTagLessThanOrEqualTo(Byte value) {
            addCriterion("filter_tag <=", value, "filterTag");
            return (Criteria) this;
        }

        public Criteria andFilterTagIn(List<Byte> values) {
            addCriterion("filter_tag in", values, "filterTag");
            return (Criteria) this;
        }

        public Criteria andFilterTagNotIn(List<Byte> values) {
            addCriterion("filter_tag not in", values, "filterTag");
            return (Criteria) this;
        }

        public Criteria andFilterTagBetween(Byte value1, Byte value2) {
            addCriterion("filter_tag between", value1, value2, "filterTag");
            return (Criteria) this;
        }

        public Criteria andFilterTagNotBetween(Byte value1, Byte value2) {
            addCriterion("filter_tag not between", value1, value2, "filterTag");
            return (Criteria) this;
        }

        public Criteria andPayloadIsNull() {
            addCriterion("payload is null");
            return (Criteria) this;
        }

        public Criteria andPayloadIsNotNull() {
            addCriterion("payload is not null");
            return (Criteria) this;
        }

        public Criteria andPayloadEqualTo(String value) {
            addCriterion("payload =", value, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadNotEqualTo(String value) {
            addCriterion("payload <>", value, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadGreaterThan(String value) {
            addCriterion("payload >", value, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadGreaterThanOrEqualTo(String value) {
            addCriterion("payload >=", value, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadLessThan(String value) {
            addCriterion("payload <", value, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadLessThanOrEqualTo(String value) {
            addCriterion("payload <=", value, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadLike(String value) {
            addCriterion("payload like", value, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadNotLike(String value) {
            addCriterion("payload not like", value, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadIn(List<String> values) {
            addCriterion("payload in", values, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadNotIn(List<String> values) {
            addCriterion("payload not in", values, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadBetween(String value1, String value2) {
            addCriterion("payload between", value1, value2, "payload");
            return (Criteria) this;
        }

        public Criteria andPayloadNotBetween(String value1, String value2) {
            addCriterion("payload not between", value1, value2, "payload");
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