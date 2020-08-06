package com.myorganization.sprocket.models.mappers;

import com.myorganization.sprocket.models.dtos.ProductDTO;
import com.myorganization.sprocket.models.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductDTO productToDTO(Product product);
    Product dtoToProduct(ProductDTO productDTO);
}
