package gr.hua.dit.entities;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Application implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private boolean approved;

	private int points;
	
	private Form applicationForm;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Form getApplicationForm() {
		return applicationForm;
	}

	public void setApplicationForm(Form applicationForm) {
		this.applicationForm = applicationForm;
	}
	
	
}
