package com.forest.microservices.core.recommendation.datalayer;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecommendationRepository extends CrudRepository<RecommendationEntity, String> {

    List<RecommendationEntity> findByProductId(int productId);
}