package cn.mt.ai.llm;

import java.util.List;

/**
 * @author TengM 2314805774@qq.com @Misty
 * @description
 * @create 2026/11/13 10:29
 */
public interface ChatModel {
    String chat(List<Message> messages);
}
