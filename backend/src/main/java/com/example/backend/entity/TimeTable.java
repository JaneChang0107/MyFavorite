package com.example.backend.entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "timetable")
public class TimeTable implements Serializable {
    
    private static final long serialVersionUID = -4562809585540136656L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;

    @NonNull
    @Column(name = "time")
    private String time;

    @NonNull
    @Column(name = "hour")
    private Integer hour;

    @NonNull
    @Column(name = "comment")
    private String comment;

    @NonNull
    @Column(name = "type")
    private String type;

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
