package com.eva.demo02;

public class UserDaoImplProxy implements UserDao {
    private UserDaoImpl userDao;

    public UserDaoImplProxy(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public void add() {
        log("add");
        userDao.add();
    }

    public void delete() {
        log("delete");
        userDao.delete();
    }

    public void select() {
        log("select");
        userDao.select();
    }

    public void update() {
        log("update");
        userDao.update();
    }

    /*需求来了，现在我们需要增加一个日志功能，怎么实现！
    思路1 ：在实现类上增加代码 【麻烦！】
    思路2：使用代理来做，能够不改变原来的业务情况下，实现此功能就是最好的了！*/
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
