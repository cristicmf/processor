package com.demo.weevent.processor.model;

import java.util.Date;

public class CEPRule {
    private Integer id;

    private Integer ruleTriggerId;

    private String ruleName;

    private String fromDestination;

    private Byte type;

    private Byte status;

    private Integer conditionType;

    private String brokerUrl;

    private String toDestination;

    private String databaseurl;

    private Date createTime;

    private String errorDestination;

    private String errorCode;

    private String errorMessage;

    private String exParam;

    public CEPRule(Integer id, Integer ruleTriggerId, String ruleName, String fromDestination, Byte type, Byte status, Integer conditionType, String brokerUrl, String toDestination, String databaseurl, Date createTime, String errorDestination, String errorCode, String errorMessage, String exParam) {
        this.id = id;
        this.ruleTriggerId = ruleTriggerId;
        this.ruleName = ruleName;
        this.fromDestination = fromDestination;
        this.type = type;
        this.status = status;
        this.conditionType = conditionType;
        this.brokerUrl = brokerUrl;
        this.toDestination = toDestination;
        this.databaseurl = databaseurl;
        this.createTime = createTime;
        this.errorDestination = errorDestination;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.exParam = exParam;
    }

    public CEPRule() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRuleTriggerId() {
        return ruleTriggerId;
    }

    public void setRuleTriggerId(Integer ruleTriggerId) {
        this.ruleTriggerId = ruleTriggerId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public String getFromDestination() {
        return fromDestination;
    }

    public void setFromDestination(String fromDestination) {
        this.fromDestination = fromDestination == null ? null : fromDestination.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getConditionType() {
        return conditionType;
    }

    public void setConditionType(Integer conditionType) {
        this.conditionType = conditionType;
    }

    public String getBrokerUrl() {
        return brokerUrl;
    }

    public void setBrokerUrl(String brokerUrl) {
        this.brokerUrl = brokerUrl == null ? null : brokerUrl.trim();
    }

    public String getToDestination() {
        return toDestination;
    }

    public void setToDestination(String toDestination) {
        this.toDestination = toDestination == null ? null : toDestination.trim();
    }

    public String getDatabaseurl() {
        return databaseurl;
    }

    public void setDatabaseurl(String databaseurl) {
        this.databaseurl = databaseurl == null ? null : databaseurl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getErrorDestination() {
        return errorDestination;
    }

    public void setErrorDestination(String errorDestination) {
        this.errorDestination = errorDestination == null ? null : errorDestination.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }

    public String getExParam() {
        return exParam;
    }

    public void setExParam(String exParam) {
        this.exParam = exParam == null ? null : exParam.trim();
    }
}