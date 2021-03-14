package com.jemorriswebdesigns.msscbrewery.services;

import com.jemorriswebdesigns.msscbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * John Morris - 3/14/21
 * mssc-brewery
 **/
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Southren Pinemark")
                .beerStyle("PaleAle")
                .build();
    }
}
