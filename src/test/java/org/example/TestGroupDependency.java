package org.example;


import org.testng.annotations.Test;

public class TestGroupDependency {
    @Test(groups={"smoke"})
    public void test1(){
        System.out.println("smoke => test1");
    }
    @Test(groups={"smoke"})
    public void test2(){
        System.out.println("smoke => test2");
        //System.out.println(5/0);
    }

    @Test(groups={"smoke"})
    public void test3(){
        System.out.println("smoke => test3");
    }

    @Test(groups={"sanity"})
    public void test4(){
        System.out.println("sanity => test4");
    }

    @Test(groups={"sanity"})
    public void test5(){
        System.out.println("sanity => test5");
    }

    @Test(dependsOnGroups={"smoke"},ignoreMissingDependencies = true)
    public void test0(){
        System.out.println("dependent test0");
    }
}
