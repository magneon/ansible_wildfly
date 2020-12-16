package br.com.softcube.baseproject.models.dto.price;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DPrice {
    private int id;
    private BigDecimal value;
}