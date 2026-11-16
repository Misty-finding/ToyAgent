package cn.mt.ai.agent;

import java.util.List;
import java.util.Map;

/**
 * @author TengM 2314805774@qq.com @Misty
 * @description
 * @create 2026/11/13 15:38
 */
public interface Agent {
    String name();
    String chat(String input);
    default List<Map<String,Object>> trace(){
        return List.of();
    }
    default void reset(){

    }
}
