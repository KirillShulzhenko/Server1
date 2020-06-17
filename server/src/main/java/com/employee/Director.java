package com.employee;

import com.lab13.Visitor;
import com.patterns.UserList;
import com.patterns.workCollection;
import com.work.Work;

public class Director implements Employee {
    UserList l = new UserList();
    Work w = workCollection.dw;


    public void delegate(Manager e)
    {
        e.delegate = this;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void remove(Employee e) {
        l.remove(e);

    }

    @Override
    public void add(Employee e) {
        l.add(e);

    }

    @Override
    public Manager upgrade(Worker w) {
        return new Manager(w);
    }

    @Override
    public void leave() {

    }

    @Override
    public void doWork() {
        w.doWork();

    }

    @Override
    public void read(Message m) {

    }

    @Override
    public void setDelegate(Employee e) {


    }

    @Override
    public void setWork(Work w) {
        this.w = w;
    }
}
