package com.design.design.factorymothod;

import com.design.design.ICource;
import com.design.design.JavaCource;
import com.design.design.PythonCource;

public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICource createFactory() {
        return new PythonCource();
    }
}
