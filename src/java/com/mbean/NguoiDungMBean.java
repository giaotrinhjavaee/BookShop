package com.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Le Thi Minh Loan
 */
@ManagedBean
@SessionScoped
public class NguoiDungMBean {
    private String username;
    private String password;
    /** Creates a new instance of NguoiDungMBean */
    public NguoiDungMBean() {
    }

    public String checkUser(){
        String outcome="dangnhap";
        if(username.equals("admin")&&password.equals("123456")){
            outcome="sanpham";
        }
        return outcome;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
