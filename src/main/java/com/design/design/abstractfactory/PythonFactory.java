package com.design.design.abstractfactory;

public class PythonFactory implements CourseFactory {
    @Override
    public INote createEdit() {
        return new PythonNote();
    }

    @Override
    public IPlary createPlary() {
        return new PythonPlary();
    }
}
