package br.com.softcube.baseproject.mappers;

import br.com.softcube.baseproject.domains.EPrice;
import br.com.softcube.baseproject.models.dto.price.DPrice;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    List<DPrice> fromEPriceListToDPriceList(List<EPrice> prices);

    DPrice fromEPriceToDPrice(EPrice price);

}