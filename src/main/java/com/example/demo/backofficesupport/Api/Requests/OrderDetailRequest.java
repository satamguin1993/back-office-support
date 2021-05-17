package com.example.demo.backofficesupport.Api.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class OrderDetailRequest {

    @JsonProperty(required = true)
    private Integer orderDetailId;

    @JsonProperty
    private Integer id;

    @JsonProperty(required = true)
    private UUID trackingId;
}
