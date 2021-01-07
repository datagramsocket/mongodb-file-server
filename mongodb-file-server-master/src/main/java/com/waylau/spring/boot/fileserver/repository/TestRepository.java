package com.waylau.spring.boot.fileserver.repository;

import com.waylau.spring.boot.fileserver.domain.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<Test, String> {
}
