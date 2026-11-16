package cn.mt.ai.agent.step01;

import cn.mt.ai.agent.Agent;
import cn.mt.ai.llm.ChatModel;
import cn.mt.ai.llm.Message;
import cn.mt.ai.llm.Models;
import cn.mt.ai.llm.OpenAiChatModel;

import java.util.List;

/**
 * @author MaTeng 2314805774@qq.com @Misty
 * @description
 * @create 2026/11/13 16:01
 */
public interface ChatAgent extends Agent {
    class Impl implements ChatAgent{

        private final ChatModel model;

        public Impl(ChatModel model){
            this.model = model;
        }

        @Override
        public String name() {
            return "Step01-对话智能体(最小MVP)";
        }
        @Override
        public String chat(String input) {
            return model.chat(List.of(Message.user(input)));
        }
    }

    public static void main(String[] args) {
        OpenAiChatModel model=Models.openAiOrNull();
        System.out.println(new Impl(model).chat("你是谁"));
    }
}
