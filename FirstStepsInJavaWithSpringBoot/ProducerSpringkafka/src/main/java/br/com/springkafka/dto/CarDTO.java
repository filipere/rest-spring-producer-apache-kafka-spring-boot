package br.com.springkafka.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CarDTO {

    private String id;
    private String name;
    private String brand;   
}
