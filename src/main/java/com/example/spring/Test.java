package com.example.spring;

public class Test {
    private  int input;
    private  Laptop laptop;

    public Test(){
        System.out.println("in Test constructer");
    }
    public void show(){
        laptop.compile();
        System.out.println("code is runnig no errors ");
    }

    public void getInput() {
        System.out.println(input);
    }

    public void setInput(int input) {
        this.input = input;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
