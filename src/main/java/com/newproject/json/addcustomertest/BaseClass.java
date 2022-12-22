package com.newproject.json.addcustomertest;

import java.util.LinkedList;
import java.util.List;

public class BaseClass<T> {

    private List<T> tList = new LinkedList<>();
    private final Class<T> classT;

    public BaseClass(Class<T> classT) {
        this.classT = classT;
    }

    public List<T> gettList() {
        return tList;
    }

    public void settList(List<T> tList) {
        this.tList = tList;
    }

    public Class<T> getClassT() {
        return classT;
    }
}