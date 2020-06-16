package com.employee;

public class Message {
    Employee from,to;
    String message;

    public Message(Employee from, Employee to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    void send()
    {
        to.read(this);
    }
}
