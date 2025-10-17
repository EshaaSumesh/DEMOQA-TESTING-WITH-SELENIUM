package com.mytests.TestNG_Examples;

import org.testng.TestNG;


public class TestRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[]{TextBoxTest.class});
        testng.run();
    }
}
