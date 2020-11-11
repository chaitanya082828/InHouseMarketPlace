package com.cg.InHouseMarketPlace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.InHouseMarketPlace.model.Proposal;
import com.cg.InHouseMarketPlace.repository.ProposalRepository;
@Service()
public class ProposalService {
	
	@Autowired
	private ProposalRepository proposalRepository;

	public Proposal addProposal(Proposal prop) {
		return proposalRepository.save(prop);
	}
	
	public Proposal editProposal(Proposal prop) {
		if(proposalRepository.findById(prop.getPropId())!=null) {
			return proposalRepository.save(prop);
		}
		else {
			return null;
		}
	}
	public Proposal getProposal(int propId)  {
		return proposalRepository.findById(propId).orElse(new Proposal());

	}
	
	public Proposal removeProposal(int propId){
		 proposalRepository.deleteById(propId);
		 return null;
	}
	/*public void removeProposal(int propId){
		 proposalRepository.deleteById(propId);
	}*/
	
	public List<Proposal> getAllProposals() {
		return proposalRepository.findAll();

	}



	


}