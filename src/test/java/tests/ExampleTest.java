package tests;

import steps.ExampleSteps;

public class ExampleTest {

    @org.junit.jupiter.api.Test
    public void test(){
        ExampleSteps exampleSteps = new ExampleSteps();
        String name = exampleSteps.getSomeThing();
        System.out.println(name);
    }
}
