package com.eva.demo02;

public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("增加用户");
    }

    public void delete() {
        System.out.println("删除用户");
    }

    public void select() {
        System.out.println("查询用户");
    }

    public void update() {
        System.out.println("修改用户");
    }
}
