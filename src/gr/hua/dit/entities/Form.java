package gr.hua.dit.entities;

import java.io.Serializable;

import javax.persistence.Column;

public class Form implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int annualIncome;
	
	private boolean parentalStatus;
	
	private int siblingStudents;
	
	private String resdence;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	public boolean isParentalStatus() {
		return parentalStatus;
	}

	public void setParentalStatus(boolean parentalStatus) {
		this.parentalStatus = parentalStatus;
	}

	public int getSiblingStudents() {
		return siblingStudents;
	}

	public void setSiblingStudents(int siblingStudents) {
		this.siblingStudents = siblingStudents;
	}

	public String getResdence() {
		return resdence;
	}

	public void setResdence(String resdence) {
		this.resdence = resdence;
	}
	
	
}
