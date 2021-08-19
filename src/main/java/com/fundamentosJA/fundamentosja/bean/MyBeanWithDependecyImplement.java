package com.fundamentosJA.fundamentosja.bean;

public class MyBeanWithDependecyImplement implements MyBeanWithDependency{
    private MyOperation myOperation;

    public MyBeanWithDependecyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero=100;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implementacion de un bean con dependencia");
    }
}
