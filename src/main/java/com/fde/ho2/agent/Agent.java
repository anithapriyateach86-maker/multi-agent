package com.fde.ho2.agent; import com.fde.ho2.model.*; import java.util.Map; public interface Agent { AgentType type(); AgentResult execute(String id,Map<AgentType,AgentResult> done); }
