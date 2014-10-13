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
	
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setMusicName(String musicName){
		this.musicName = musicName;
	}
	public Long getMusicName(){
		return this.musicName;
	}
	public void setSonger(Long songer){
		this.songer = songer;
	}
	public Long getSonger(){
		return this.songer;
	}
	public void setLink(Long link){
		this.link = link;
	}
	public Long getLink(){
		return this.link;
	}
	public void setHot(Long hot){
		this.hot = hot;
	}
	public Long getHot(){
		return this.hot;
	}

}