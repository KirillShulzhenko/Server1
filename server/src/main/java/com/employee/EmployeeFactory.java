package com.employee;

public class EmployeeFactory {
    static Employee createEmployeeByRank(String name)
    {
        switch (name)
        {
            case "Worker":{return new Worker();}
            case "Manager":{return new Manager();}
            case "Director":{return new Director();}

        }
        return null;
    }
}
