package com.design.design.simplefactory;

import com.design.design.ICource;
import com.design.design.PythonCource;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        ICource iCource = SimpleFactory.create(PythonCource.class);
        iCource.create();
    }
}
