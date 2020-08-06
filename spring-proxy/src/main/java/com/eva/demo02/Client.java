package com.eva.demo02;

public class Client {
    public static void main(String[] args) {
        //真实业务
        UserDaoImpl userDao = new UserDaoImpl();
        //代理类
        UserDaoImplProxy proxy = new UserDaoImplProxy(userDao);
        //使用代理类实现日志功能！
        proxy.add();
        proxy.delete();
    }
}
