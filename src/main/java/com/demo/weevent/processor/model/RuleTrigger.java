package com.demo.weevent.processor.model;

public class RuleTrigger {
    private Integer id;

    private Integer ruleId;

    private Byte filterTag;

    private String payload;

    public RuleTrigger(Integer id, Integer ruleId, Byte filterTag, String payload) {
        this.id = id;
        this.ruleId = ruleId;
        this.filterTag = filterTag;
        this.payload = payload;
    }

    public RuleTrigger() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Byte getFilterTag() {
        return filterTag;
    }

    public void setFilterTag(Byte filterTag) {
        this.filterTag = filterTag;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload == null ? null : payload.trim();
    }
}