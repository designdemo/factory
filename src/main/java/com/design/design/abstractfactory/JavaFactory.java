package com.design.design.abstractfactory;

public class JavaFactory implements CourseFactory {
    @Override
    public INote createEdit() {
      return new JavaNote();
    }

    @Override
    public IPlary createPlary() {
        return new JavaPlary();
    }
}
