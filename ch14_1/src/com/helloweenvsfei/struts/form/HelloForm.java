/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.helloweenvsfei.struts.form;

import java.sql.Date;
import java.sql.Time;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * MyEclipse Struts Creation date: 04-29-2008
 * 
 * XDoclet definition:
 * 
 * @struts.form name="helloForm"
 */
public class HelloForm extends ActionForm {

	private static final long serialVersionUID = -734609785788348370L;

	private String name;
	private String[] hobby;
	private int age;
	private boolean experience;

	private Date date = new Date(System.currentTimeMillis());
	private Time time = new Time(System.currentTimeMillis());

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		if (name == null || name.trim().length() == 0)
			errors.add("name", new ActionMessage("hello.error.name"));

		if (hobby == null || hobby.length < 1)
			errors.add("hobby", new ActionMessage("hello.error.hobby"));

		if (age < 5)
			errors.add("age", new ActionMessage("hello.error.age", 5));

		return errors;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		age = 5;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isExperience() {
		return experience;
	}

	public void setExperience(boolean experience) {
		this.experience = experience;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
}