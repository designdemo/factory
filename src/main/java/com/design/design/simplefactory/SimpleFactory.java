package com.design.design.simplefactory;

import com.design.design.ICource;

public class SimpleFactory {

//    public static ICource create(String name){
//        if("java".equals(name)){
//            return new JavaCource();
//        }else{
//            return null;
//        }
//    }

    public static ICource create(String className) {
        try{
            if (!(null == className || "".equals(className))) {
                return (ICource) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static ICource create(Class<? extends ICource> clazz) {
        try{
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
