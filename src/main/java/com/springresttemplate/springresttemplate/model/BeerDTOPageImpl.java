package com.springresttemplate.springresttemplate.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true, value = "pageable")
public class BeerDTOPageImpl<BeerDTO> extends PageImpl<com.springresttemplate.springresttemplate.model.BeerDTO> {

//    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
//    public BeerDTOPageImpl(@JsonProperty("content") List<BeerDTO> content,
//                           @JsonProperty("number") int page,
//                           @JsonProperty("size") int size,
//                           @JsonProperty("totalElements") long total) {
//        super(content, PageRequest.of(page, size), total);
//    }

//    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
//    public BeerDTOPageImpl(@JsonProperty("content") List<com.springresttemplate.springresttemplate.model.BeerDTO> content,
//                           @JsonProperty("number") int page,
//                           @JsonProperty("size") int size,
//                           @JsonProperty("totalElements") long total) {
//        super(content, PageRequest. of(page, size), total);
//    }

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public BeerDTOPageImpl(@JsonProperty("content") List<com.springresttemplate.springresttemplate.model.BeerDTO> content,
                           @JsonProperty("number") int page,
                           @JsonProperty("size") int size,
                           @JsonProperty("totalElements") long total) {
        super(content, PageRequest.of(page, size), total);
    }


    public BeerDTOPageImpl(List<com.springresttemplate.springresttemplate.model.BeerDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerDTOPageImpl(List<com.springresttemplate.springresttemplate.model.BeerDTO> content) {
        super(content);
    }
}
