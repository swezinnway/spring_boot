package com.best.bright.onile_course.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Level_vedio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vedio_id;
	private String vedio_name;
	
	
	@ManyToOne
	@JoinColumn(name="level_id")
	private Level level;
	
	public Level_vedio() {}
	
	public Long getVedio_id() {
		return vedio_id;
	}
	public void setVedio_id(Long vedio_id) {
		this.vedio_id = vedio_id;
	}
	public String getVedio_name() {
		return vedio_name;
	}
	public void setVedio_name(String vedio_name) {
		this.vedio_name = vedio_name;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
}
