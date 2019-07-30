package com.sustav.bean;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;

@ConversationScoped
public class ConversationBean implements Serializable {

    @Inject
    private Conversation conversation;

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void startConversation() {
        System.out.println(i);
        System.out.println("start conversation");
        conversation.begin();
        setI(2);
    }
    public void endConversation() {
        System.out.println("end conversation");
        conversation.end();
    }

}
