package com.webank.weevent.processor.controller;

import com.webank.weevent.processor.model.CEPRule;
import com.webank.weevent.processor.service.CEPRuleServiceImpl;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CEPRuleController extends BaseController {
    @Autowired
    private CEPRuleServiceImpl cepRuleService;


    @RequestMapping("/getCEPRuleById")
    @ResponseBody
    public CEPRule getCEPRuleById(@RequestParam(name = "id") Integer id) {
        CEPRule cepRule = cepRuleService.selectByPrimaryKey(id);
        if (cepRule != null) {
            System.out.println(JSONArray.toJSON(cepRule));
        }
        return cepRule;
    }
}
