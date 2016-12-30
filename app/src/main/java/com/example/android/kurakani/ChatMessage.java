package com.example.android.kurakani;

/**
 * Created by prabesh subedi on 30/12/2016.
 */

public class ChatMessage {
    String name;
    String message;

    public ChatMessage() {
    }

    public ChatMessage(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
