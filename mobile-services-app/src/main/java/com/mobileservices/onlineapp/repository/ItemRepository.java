package com.mobileservices.onlineapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobileservices.onlineapp.entity.ItemEntity;

@Repository
public interface ItemRepository extends CrudRepository<ItemEntity,Integer> {

}
