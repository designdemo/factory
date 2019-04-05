package com.design.design.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaFactory();
        INote edit = courseFactory.createEdit();
        edit.edit();
        IPlary plary = courseFactory.createPlary();
        plary.plary();


    }

}
