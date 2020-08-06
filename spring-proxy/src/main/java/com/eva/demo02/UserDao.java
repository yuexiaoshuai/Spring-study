package com.eva.demo02;

//抽象角色：增删改查业务
public interface UserDao {
    void add();
    void delete();
    void select();
    void update();
}
