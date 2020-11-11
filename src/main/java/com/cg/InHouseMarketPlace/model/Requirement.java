package com.cg.InHouseMarketPlace.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Requirement extends Resource
{
	private int reqId;
	private boolean isFulfilled;
	private LocalDate fulfilledOn;
	@OneToMany
	private List<Proposal> proposals;
	
	
	public int getReqId() {
		return reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	public boolean isFulfilled() {
		return isFulfilled;
	}
	public void setFulfilled(boolean isFulfilled) {
		this.isFulfilled = isFulfilled;
	}
	public LocalDate getFulfilledOn() {
		return fulfilledOn;
	}
	public void setFulfilledOn(LocalDate fulfilledOn) {
		this.fulfilledOn = fulfilledOn;
	}
	public List<Proposal> getProposals() {
		return proposals;
	}
	public void setProposals(List<Proposal> proposals) {
		this.proposals = proposals;
	}
	
	@Override
	public String toString() {
		return "Requirement [reqId=" + reqId + ", isFulfilled=" + isFulfilled + ", fulfilledOn=" + fulfilledOn
				+ ", proposals=" + proposals + "]";
	}

}
