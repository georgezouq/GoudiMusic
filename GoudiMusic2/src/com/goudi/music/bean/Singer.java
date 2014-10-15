/**
* 文件名：Singer.java
*
* 版本信息：
* 日期：2014-10-15
* Copyright cntomorrow Corporation 2014
* 版权所有
*
*/
package com.goudi.music.bean;

/**
 * 
 * @author: GeorgeZou
 * @date: 2014-10-15 上午11:02:35
 */
public class Singer {

    private Long s_id;
    private String s_name;
    private String s_gender;
    private String s_type;
    private String s_desc;
    
    
    public Long getS_id() {
        return s_id;
    }
    public void setS_id(Long s_id) {
        this.s_id = s_id;
    }
    public String getS_name() {
        return s_name;
    }
    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
    public String getS_desc() {
        return s_desc;
    }
    public void setS_desc(String s_desc) {
        this.s_desc = s_desc;
    }
    public String getS_gender() {
        return s_gender;
    }
    public void setS_gender(String s_gender) {
        this.s_gender = s_gender;
    }
    public String getS_type() {
        return s_type;
    }
    public void setS_type(String s_type) {
        this.s_type = s_type;
    }
    
}
