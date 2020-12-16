package br.com.softcube.baseproject.mappers;

import br.com.softcube.baseproject.domains.EProduct;
import br.com.softcube.baseproject.models.dto.product.DProduct;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    List<DProduct> fromEProductListToDProductList(List<EProduct> products);

    DProduct fromEProductToDProduct(EProduct product);
}