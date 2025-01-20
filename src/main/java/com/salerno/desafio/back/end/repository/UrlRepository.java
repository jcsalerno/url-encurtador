package com.salerno.desafio.back.end.repository;
import com.salerno.desafio.back.end.entities.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
