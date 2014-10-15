/**
* 文件名：User.java
*
* 版本信息：
* 日期：2014-10-15
* Copyright cntomorrow Corporation 2014
* 版权所有
*
*/
package com.goudi.music.bean;

import java.util.Date;

/**
 * 
 * @author: GeorgeZou
 * @date: 2014-10-15 上午10:37:50
 */
public class User {
    
    private Long id;
    private String username;
    private String password;
    private boolean gender;
    private Date birthday;
    private String address;
    private String email;
    private String phone;
    private String avatar_path;
    private String description;
    private Long default_p_id;   //默认播放列表
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public Long getDefault_p_id() {
        return default_p_id;
    }
    public void setDefault_p_id(Long default_p_id) {
        this.default_p_id = default_p_id;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAvatar_path() {
        return avatar_path;
    }
    public void setAvatar_path(String avatar_path) {
        this.avatar_path = avatar_path;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
