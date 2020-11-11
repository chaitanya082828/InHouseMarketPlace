package com.cg.InHouseMarketPlace.model;

import java.time.LocalDate;

import javax.annotation.Resource;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Proposal {

	@Id
	private int propId;
	private String proposal;
	private double amount;
	private LocalDate proposalDate;
	private boolean isAccepted;
	private LocalDate acceptedOn;
	@ManyToOne
	private Employee emp;
    @ManyToOne
	private Resource resource;

	public int getPropId() {
		return propId;
	}
	public void setPropId(int propId) {
		this.propId = propId;
	}
	public String getProposal() {
		return proposal;
	}
	public void setProposal(String proposal) {
		this.proposal = proposal;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getProposalDate() {
		return proposalDate;
	}
	public void setProposalDate(LocalDate proposalDate) {
		this.proposalDate = proposalDate;
	}
	public boolean isAccepted() {
		return isAccepted;
	}
	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
	public LocalDate getAcceptedOn() {
		return acceptedOn;
	}
	public void setAcceptedOn(LocalDate acceptedOn) {
		this.acceptedOn = acceptedOn;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	@Override
	public String toString() {
		return "Proposal [propId=" + propId + ", proposal=" + proposal + ", amount=" + amount + ", proposalDate="
				+ proposalDate + ", isAccepted=" + isAccepted + ", acceptedOn=" + acceptedOn + ", emp=" + emp
				+ ", resource=" + resource + "]";
	}
	
}
