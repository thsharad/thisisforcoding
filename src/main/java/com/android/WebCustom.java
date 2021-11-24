package com.android;
import com.simplifyqa.customMethod.SqaAutowired;
import com.simplifyqa.method.GeneralMethod;
public class WebCustom {

@SqaAutowired
public Object current_object_web;

public boolean checkerce(){
    GeneralMethod ok = new GeneralMethod();
    ok.eq("param1","param2");
    return true;
}

   
}

