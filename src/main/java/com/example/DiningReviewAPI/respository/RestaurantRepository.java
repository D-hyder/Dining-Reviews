package com.example.DiningReviewAPI.respository;

import com.example.DiningReviewAPI.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    Optional<Restaurant> findRestaurantsByNameAndZipCode(String name, String zipCode);
    List<Restaurant> findRestaurantsByZipCodeAndPeanutScoreNotNullOrderByPeanutScore(String zipcode);
    List<Restaurant> findRestaurantsByZipCodeAndDairyScoreNotNullOrderByDairyScore(String zipcode);
    List<Restaurant> findRestaurantsByZipCodeAndEggScoreNotNullOrderByEggScore(String zipcode);
}
