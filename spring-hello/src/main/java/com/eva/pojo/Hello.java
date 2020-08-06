package com.eva.pojo;

public class Hello {
    private String name;

    public Hello(String name) {
        this.name = name;
    }

    public Hello() {
        System.out.println("无参构造执行了~");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Hello，"+ name );
    }
}
