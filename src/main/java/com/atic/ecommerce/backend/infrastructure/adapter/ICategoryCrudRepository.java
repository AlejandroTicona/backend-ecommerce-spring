package com.atic.ecommerce.backend.infrastructure.adapter;

import com.atic.ecommerce.backend.infrastructure.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryCrudRepository extends CrudRepository<CategoryEntity, Integer> {

}
