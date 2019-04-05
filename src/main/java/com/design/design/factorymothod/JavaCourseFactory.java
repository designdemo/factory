package com.design.design.factorymothod;

import com.design.design.JavaCource;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public JavaCource createFactory() {
        return new JavaCource();
    }
}
