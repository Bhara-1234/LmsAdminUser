package com.model;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.sql.Date;

@Entity
@Table(name = "mbs_loanapplicants")
public class LoanApplicant {

	public LoanApplicant() {

	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;

	private Integer customerId;
	private Integer noy;

	public Integer getNoy() {
		return noy;
	}

	public void setNoy(Integer noy) {
		this.noy = noy;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date applicationDate;

	private Integer loanTypeId;

	private Double loanAmount;

	private Double emiRangeFrom;

	private Double emiRangeTo;

	private Integer nominalRequested;

	private Integer cibilScore;

	private String status;

	private String remarks;

	private Integer processedUser;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date processedDate;

	public int getId() {
		return id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public Integer getLoanTypeId() {
		return loanTypeId;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public Double getEmiRangeFrom() {
		return emiRangeFrom;
	}

	public Double getEmiRangeTo() {
		return emiRangeTo;
	}

	public Integer getNominalRequested() {
		return nominalRequested;
	}

	public Integer getCibilScore() {
		return cibilScore;
	}

	public String getStatus() {
		return status;
	}

	public String getRemarks() {
		return remarks;
	}

	public Integer getProcessedUser() {
		return processedUser;
	}

	public Date getProcessedDate() {
		return processedDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public void setApplicationDate(String applicationDate) {
		String dateString = applicationDate;
		Date sqlDate = null;

		try {
			sqlDate = Date.valueOf(dateString);
			System.out.println("Converted SQL Date: " + sqlDate);
		} catch (IllegalArgumentException e) {

		}
		this.applicationDate = sqlDate;
	}

	public void setLoanTypeId(Integer loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setEmiRangeFrom(Double emiRangeFrom) {
		this.emiRangeFrom = emiRangeFrom;
	}

	public void setEmiRangeTo(Double emiRangeTo) {
		this.emiRangeTo = emiRangeTo;
	}

	public void setNominalRequested(Integer nominalRequested) {
		this.nominalRequested = nominalRequested;
	}

	public void setCibilScore(Integer cibilScore) {
		this.cibilScore = cibilScore;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setProcessedUser(Integer processedUser) {
		this.processedUser = processedUser;
	}

	public void setProcessedDate(String processedDate) {
		String dateString = processedDate;
		Date sqlDate = null;

		try {
			sqlDate = Date.valueOf(dateString);

		} catch (IllegalArgumentException e) {

		}
		this.processedDate = sqlDate;
	}

	@Override
	public String toString() {
		return "LoanApplicant [id=" + id + ", customerId=" + customerId + ", applicationDate=" + applicationDate
				+ ", loanTypeId=" + loanTypeId + ", loanAmount=" + loanAmount + ", emiRangeFrom=" + emiRangeFrom
				+ ", emiRangeTo=" + emiRangeTo + ", nominalRequested=" + nominalRequested + ", cibilScore=" + cibilScore
				+ ", status=" + status + ", conclusionRemarks=" + remarks + ", processedUser=" + processedUser
				+ ", processedDate=" + processedDate + ", getId()=" + getId() + ", getCustomerId()=" + getCustomerId()
				+ ", getApplicationDate()=" + getApplicationDate() + ", getLoanTypeId()=" + getLoanTypeId()
				+ ", getLoanAmount()=" + getLoanAmount() + ", getEmiRangeFrom()=" + getEmiRangeFrom()
				+ ", getEmiRangeTo()=" + getEmiRangeTo() + ", getNominalRequested()=" + getNominalRequested()
				+ ", getCibilScore()=" + getCibilScore() + ", getStatus()=" + getStatus() + ", getConclusionRemarks()="
				+ getRemarks() + ", getProcessedUser()=" + getProcessedUser() + ", getProcessedDate()="
				+ getProcessedDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	// Constructors, getters, and setters
	// ...
}