package com.udacity.course3.reviews.repos;

import com.udacity.course3.reviews.entities.ReviewDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ReviewDocumentRepository extends MongoRepository<ReviewDocument, Integer> {
    List<ReviewDocument> findAllByProductId(Integer productId);
}
