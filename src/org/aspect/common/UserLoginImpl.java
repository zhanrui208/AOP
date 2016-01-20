package org.aspect.common;

public class UserLoginImpl implements UserLogin {
    public void login(String userName) {
        System.out.println("欢迎 " + userName + " 登录系统");
    }
}
