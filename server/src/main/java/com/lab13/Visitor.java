package com.lab13;

import com.employee.Director;
import com.employee.Manager;
import com.employee.Worker;

public interface Visitor {
    public void visit(Director d);
    public void visit(Manager d);
    public void visit(Worker d);
}
