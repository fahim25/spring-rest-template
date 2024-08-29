package com.springresttemplate.springresttemplate.client;

import com.springresttemplate.springresttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

public interface BeerClient {

    Page<BeerDTO> listBeers(String beerName);
}