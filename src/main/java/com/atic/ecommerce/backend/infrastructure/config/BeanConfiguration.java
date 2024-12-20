package com.atic.ecommerce.backend.infrastructure.config;

import com.atic.ecommerce.backend.application.CategoryService;
import com.atic.ecommerce.backend.application.ProductService;
import com.atic.ecommerce.backend.application.UserService;
import com.atic.ecommerce.backend.domain.port.ICategoryRepository;
import com.atic.ecommerce.backend.domain.port.IProductRepository;
import com.atic.ecommerce.backend.domain.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository){
        return new UserService(iUserRepository);
    }

    @Bean
    public CategoryService categoryService(ICategoryRepository iCategoryRepository){
        return new CategoryService(iCategoryRepository);
    }

    @Bean
    public ProductService productService(IProductRepository iProductRepository){
        return new ProductService(iProductRepository);
    }
}
