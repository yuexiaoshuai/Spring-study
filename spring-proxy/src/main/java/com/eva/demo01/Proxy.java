package com.eva.demo01;

public class Proxy {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent(){
        host.rent();
    }

    public void see(){
        System.out.println("看房");
    }
    public void fee(){
        System.out.println("收中介费");
    }
}
