package com.patterns;

import com.work.DirectorWork;
import com.work.ManagerWork;
import com.work.Work;
import com.work.WorkerWork;

import java.util.HashMap;

public class workCollection {
    public static final Work dw = new DirectorWork(),mw = new ManagerWork(),ww = new WorkerWork();
    public HashMap<String,Work> work = new HashMap<String,Work>(){{
        work.put("dw",dw);
        work.put("mw",mw);
        work.put("ww",ww);
    }};
    public void addWork(String name,Work w)
    {
        work.put(name,w);
    }
    public Work getWorkByName(String name)
    {
        return work.get(name);
    }
}
