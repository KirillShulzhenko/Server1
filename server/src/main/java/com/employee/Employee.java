package com.employee;


import com.work.Work;

public interface Employee {
    void remove(Employee e);
    void add(Employee e);
    Manager upgrade(Worker w);
    void leave();
    void doWork();
    void read(Message m);
    void setDelegate(Employee e);
    void setWork(Work w);
    default Message createMessage(String in,Employee to)
    {
        return new Message(this,to,in);
    }
}
