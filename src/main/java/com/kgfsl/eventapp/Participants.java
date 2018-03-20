package com.kgfsl.eventapp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Email;

@Entity
public class Participants{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    String phoneNumber;

    @Column
    String email;

    @Column
    String company;

    @Column
    String eventName;
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "eventId", updatable = false, insertable = true)
	private Event event;
    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }/**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }/**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }/**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }/**
     * @return the email
     */
    public String getEmail() {
        return email;
    }/**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }/**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }/**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

}