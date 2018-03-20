package com.kgfsl.eventapp;

import com.kgfsl.eventapp.Agenda;

import java.sql.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long eventId;

	@Column
	private String eventName;
	@Column
	private int edition;

	@Column
	private Date date;

	@Column
	private String location;

	@Column
	private Boolean isActive;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "eventId")
	private List<Agenda> agenda;
	//private Agenda ag;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return eventId;
	}

	public void setId(Long eventId) {
		this.eventId = eventId;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public List<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Agenda> agenda) {
		this.agenda = agenda;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

}