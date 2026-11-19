package cn.mt.ai.llm;

public record ToolCall(String id,String name,String argumentsJson) {
}
