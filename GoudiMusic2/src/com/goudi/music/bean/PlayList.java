/**
* 文件名：PlayList.java
*
* 版本信息：
* 日期：2014-10-15
* Copyright cntomorrow Corporation 2014
* 版权所有
*
*/
package com.goudi.music.bean;

import java.util.List;

/**
 * 
 * @author: GeorgeZou
 * @date: 2014-10-15 下午1:22:11
 */
public class PlayList {

    private Long p_id;
    private String p_name;
    private Long u_id;
    private List<Music> musics;
    
    public Long getP_id() {
        return p_id;
    }
    public void setP_id(Long p_id) {
        this.p_id = p_id;
    }
    public String getP_name() {
        return p_name;
    }
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }
    public Long getU_id() {
        return u_id;
    }
    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }
    public List<Music> getMusics() {
        return musics;
    }
    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }
}
