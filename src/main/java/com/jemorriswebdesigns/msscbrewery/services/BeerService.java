package com.jemorriswebdesigns.msscbrewery.services;

import com.jemorriswebdesigns.msscbrewery.web.model.BeerDTO;

import java.util.UUID;

/**
 * John Morris - 3/14/21
 * mssc-brewery
 **/
public interface BeerService {
    BeerDTO getBeerById(UUID beerId);

}
