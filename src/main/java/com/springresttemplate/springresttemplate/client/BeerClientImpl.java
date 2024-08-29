package com.springresttemplate.springresttemplate.client;

import com.springresttemplate.springresttemplate.model.BeerDTO;
import com.springresttemplate.springresttemplate.model.BeerDTOPageImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@RequiredArgsConstructor
@Service
public class BeerClientImpl implements BeerClient {


    private final RestTemplateBuilder restTemplateBuilder;

//    private static final String BASE_URL = "http://localhost:8080";
    private static final String GET_BEER_PATH = "/api/v1/beer";


//    @Override
//    public Page<BeerDTO> listBeers(String beerName)
//    {
//
//        RestTemplate restTemplate = restTemplateBuilder.build();
//
//        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromPath(GET_BEER_PATH);
//
////        ResponseEntity<String> stringResponseEntity =
////                restTemplate.getForEntity(BASE_URL + GET_BEER_PATH, String.class);
////        System.out.println(stringResponseEntity);
//
////        ResponseEntity<Map> mapResponseEntity =
////                restTemplate.getForEntity(BASE_URL + GET_BEER_PATH, Map.class);
////        System.out.println(mapResponseEntity);
//
////        ResponseEntity<JsonNode> jsonResponse =
////                restTemplate.getForEntity(BASE_URL + GET_BEER_PATH, JsonNode.class);
////
////        jsonResponse.getBody().findPath("content")
////            .elements().forEachRemaining(node->{
////            System.out.println(node.get("beerName").asText());
////        });
////
////        System.out.println(jsonResponse.getBody());
//
//
////        ResponseEntity<BeerDTO> stringResponse =
//////                restTemplate.getForEntity(GET_BEER_PATH, BeerDTO.class);
////                restTemplate.getForEntity(uriComponentsBuilder.toUriString() , BeerDTO.class);
//
//
//        if(beerName != null)
//        {
//            uriComponentsBuilder.queryParam("beerName", beerName);
//        }
//
//
//        ResponseEntity<BeerDTOPageImpl> stringResponse =
//                restTemplate.getForEntity(uriComponentsBuilder.toUriString() , BeerDTOPageImpl .class);
//
//
//
//        return stringResponse.getBody();
//    }

    @Override
    public Page<BeerDTO> listBeers(String beerName) {
        RestTemplate restTemplate = restTemplateBuilder.build();

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromPath(GET_BEER_PATH);

        if (beerName != null) {
            uriComponentsBuilder.queryParam("beerName", beerName);
        }


        ResponseEntity<BeerDTOPageImpl> response =
                restTemplate.getForEntity(uriComponentsBuilder.toUriString() , BeerDTOPageImpl.class);


        return response.getBody();
    }

}