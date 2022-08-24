package com.samples.S04Spel.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CarDealer {

	@Value("#{12+27}")
	private String id;
	
	@Value("#{T(java.lang.Math).abs(-21)}")
	private int id2;
	
	@Value("#{new Integer(21)}")
	private int id3;
	
	@Value("#{'Tamil Ezhilen'}")
	private String name;
	
	@Value("#{'Tamil Ezhilen'.toUpperCase()}")
	private String name2;
	
	@Value("#{1+4<3}")
	private boolean active;
	
	@Value("#{2+4>4?true:false}")
	private boolean active2;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "CarDealer [id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", name=" + name + ", name2=" + name2
				+ ", active=" + active + ", active2=" + active2 + "]";
	}

}