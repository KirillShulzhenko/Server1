package com.employee;

import com.lab13.Visitor;
import com.patterns.workCollection;
import com.work.Work;

public class Worker implements Employee {
    Employee delegate;
    Work w = workCollection.ww;
    @Override
    public void remove(Employee e) {
        if(delegate!=null)
        {
            delegate.remove(e);

        }

    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    @Override
    public void add(Employee e) {
        if(delegate!=null)
        {
            delegate.add(e);

        }

    }

    @Override
    public Manager upgrade(Worker w) {
        if(delegate!=null)
        {
            return delegate.upgrade(w);
        }
        return  null;
    }

    @Override
    public void leave() {

    }

    @Override
    public void doWork() {
        if(delegate!=null)
        {
            delegate.doWork();

        }
        else
        {
            w.doWork();

        }
    }

    @Override
    public void read(Message m) {

    }

    @Override
    public void setDelegate(Employee e) {
        delegate = e;

    }

    @Override
    public void setWork(Work w) {
        this.w = w;
    }
}
