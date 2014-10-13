package com.goudi.music.bean;

/**
 * music java bean
 * 
 */
public class Music{
	private Long id;
	private String musicName;
	private String songer;
	private String link;
	private int hot;
	public Long getId() {
	    return id;
	}
	public void setId(Long id) {
	    this.id = id;
	}
	public String getMusicName() {
	    return musicName;
	}
	public void setMusicName(String musicName) {
	    this.musicName = musicName;
	}
	public String getSonger() {
	    return songer;
	}
	public void setSonger(String songer) {
	    this.songer = songer;
	}
	public String getLink() {
	    return link;
	}
	public void setLink(String link) {
	    this.link = link;
	}
	public int getHot() {
	    return hot;
	}
	public void setHot(int hot) {
	    this.hot = hot;
	}

}