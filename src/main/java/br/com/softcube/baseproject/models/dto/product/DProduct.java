package br.com.softcube.baseproject.models.dto.product;

import br.com.softcube.baseproject.models.dto.price.DPrice;
import lombok.Data;

import java.util.List;

@Data
public class DProduct {
    private long id;
    private String name;
    private String description;
    private List<DPrice> prices;
}