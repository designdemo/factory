package com.design.design.abstractfactory;

public interface CourseFactory {

    /**
     * 编辑
     * @return
     */
    INote createEdit();

    /**
     * 播放
     * @return
     */
    IPlary createPlary();
}
