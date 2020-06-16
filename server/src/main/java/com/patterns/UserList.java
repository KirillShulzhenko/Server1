package com.patterns;

import com.employee.Employee;
import com.employee.Manager;
import com.employee.Message;
import com.employee.Worker;
import com.work.Work;

import java.util.LinkedList;

public class UserList implements com.employee.Employee {
    LinkedList<com.employee.Employee> list = new LinkedList<>();
    int temp =0;
    void reverse()
    {
        temp = 0;
    }
    boolean hasNext()
    {
        return temp == list.size()-1;
    }
    Employee next()
    {
        return list.get(temp++);
    }
    @Override
    public void remove(Employee e) {

    }

    @Override
    public void add(Employee e) {

    }

    @Override
    public Manager upgrade(Worker w) {
        return null;
    }

    @Override
    public void leave() {

    }

    @Override
    public void doWork() {

    }

    @Override
    public void read(Message m) {

    }

    @Override
    public void setDelegate(Employee e) {

    }

    @Override
    public void setWork(Work w) {

    }
}
