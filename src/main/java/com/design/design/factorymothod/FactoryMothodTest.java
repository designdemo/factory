package com.design.design.factorymothod;

import com.design.design.ICource;

public class FactoryMothodTest {

    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new JavaCourseFactory();
        ICource factory = iCourseFactory.createFactory();
        factory.create();
    }
}
