package com.example.cydemo.dao;

import com.example.cydemo.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RestaurantDao extends BaseDao<Restaurant> {
}
