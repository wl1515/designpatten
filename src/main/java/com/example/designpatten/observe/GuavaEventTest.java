package com.example.designpatten.observe;

import com.google.common.eventbus.EventBus;

/**
 * Created by Tom on 2019/3/17.
 */
public class GuavaEventTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        Teacher guavaEvent = new Teacher("Tom");
        Question question = new Question();
        question.setUserName("wl");
        question.setContent("如何灵活使用设计模式？");

        eventBus.register(guavaEvent);
        eventBus.post(question);

    }
}
