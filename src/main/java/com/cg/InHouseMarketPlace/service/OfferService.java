package com.cg.InHouseMarketPlace.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.InHouseMarketPlace.model.Offer;
import com.cg.InHouseMarketPlace.repository.OfferRepository;

@Service
public class OfferService {
	@Autowired
	private OfferRepository offerRepository;
	
	public Offer addOffer(Offer offer) {
		
		return offerRepository.save(offer);	
	}
	
	public Offer editOffer(Offer offer) 
	{
		if(offerRepository.findById(offer.getOfferId())!=null) 
		{
			return offerRepository.save(offer);
		}
		
		      else 
		   {
			   return null;
		   }
	}
	
	public Offer getOffer(int offerId)
	{
		return offerRepository.findById(offerId).orElse(null);
	}
	
	public Offer removeOffer(int offerId)
	{
	 offerRepository.deleteById(offerId);
	    return null;
	}
	
	public List<Offer> getAllOffers() 
	{
		return (List<Offer>) offerRepository.findAll();
	}
	
	
	public List<Offer> getAllOffers(String category, String type)
	{
		return (List<Offer>) offerRepository.findAllOffers(category,type);
	}
	
}