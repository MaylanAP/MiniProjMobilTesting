package com.example.hook;

import com.example.app.drivers.AndroidDriverInit;
import org.junit.After;
import org.junit.Before;

public class AndroidDriverHook {

    @Before
    public void before(){
        AndroidDriverInit.initialization();
    }
    @After
    public void after(){
        AndroidDriverInit.close();
    }

}
