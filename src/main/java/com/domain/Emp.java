package com.domain;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-23 19:23
 **/
public class Emp {
    private int e_id;
    private String e_name;
    private String e_sex;
    private String e_tell;
    private String username;
    private String passwd;

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_sex() {
        return e_sex;
    }

    public void setE_sex(String e_sex) {
        this.e_sex = e_sex;
    }

    public String getE_tell() {
        return e_tell;
    }

    public void setE_tell(String e_tell) {
        this.e_tell = e_tell;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
