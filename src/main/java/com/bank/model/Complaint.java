package com.bank.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="complaint")
public class Complaint {

@Id
@Column(name="slno")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int slno;

@Column(name="comp_to")
private String complaintTo;

@Column(name="comp_from")
private String complaintFrom;

@Column(name="subject")
private String subject;

@Column(name="complaint")
private String complaint;

@Column(name="comp_date")
private Date complaintDate;

public int getSlno() {
	return slno;
}

public void setSlno(int slno) {
	this.slno = slno;
}

public String getComplaintTo() {
	return complaintTo;
}

public void setComplaintTo(String complaintTo) {
	this.complaintTo = complaintTo;
}

public String getComplaintFrom() {
	return complaintFrom;
}

public void setComplaintFrom(String complaintFrom) {
	this.complaintFrom = complaintFrom;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public String getComplaint() {
	return complaint;
}

public void setComplaint(String complaint) {
	this.complaint = complaint;
}

public Date getComplaintDate() {
	return complaintDate;
}

public void setComplaintDate(Date complaintDate) {
	this.complaintDate = complaintDate;
}
	


}
