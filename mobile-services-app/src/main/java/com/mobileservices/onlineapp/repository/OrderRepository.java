package com.mobileservices.onlineapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobileservices.onlineapp.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {

}
