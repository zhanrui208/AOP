package org.aspect.common2;


public class WorkServiceImpl implements WorkService{
    @Override
    public String work() {
        return "work success";
    }
    @Override
    public String sleep() {
        return "sleep success";
    }
}