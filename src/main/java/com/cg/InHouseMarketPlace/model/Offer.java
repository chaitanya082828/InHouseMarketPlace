package com.cg.InHouseMarketPlace.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Offer extends Resource {
	private int offerId;
	private boolean isAvailable;
	private LocalDate availableUpto;
	
	@OneToMany
	private List<Proposal> proposals;
	
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public LocalDate getAvailableUpto() {
		return availableUpto;
	}
	public void setAvailableUpto(LocalDate availableUpto) {
		this.availableUpto = availableUpto;
	}
	public List<Proposal> getProposals() {
		return proposals;
	}
	public void setProposals(List<Proposal> proposals) {
		this.proposals = proposals;
	}
	@Override
	public String toString() {
		return "Offer [offerId=" + offerId + ", isAvailable=" + isAvailable + ", availableUpto=" + availableUpto
				+ ", proposals=" + proposals + "]";
	}

}
