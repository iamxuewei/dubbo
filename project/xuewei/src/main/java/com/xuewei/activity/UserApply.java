package com.xuewei.activity;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserApply {

    @Autowired
    public ProcessEngine processEngine;
    @Autowired
    public RepositoryService repositoryService;

    //创建申请流程并设置创建人
    public String userApply(String userId){
        try {
            String processDefinitionKey = "apply";
            Map<String, Object> variables = new HashMap<String, Object>();
            variables.put("userId", userId);
            //与正在执行的流程实例和执行对象相关的Service
            ProcessInstance pi = processEngine.getRuntimeService()
                    .startProcessInstanceByKey(processDefinitionKey,variables);
            return pi.getId();
        }catch (Exception e) {
            return e.getMessage();
        }
    }
}
