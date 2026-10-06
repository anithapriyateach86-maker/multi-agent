package com.fde.ho2.model; import java.util.List; public record WorkflowTask(AgentType type,List<AgentType> dependsOn,String description) {}
