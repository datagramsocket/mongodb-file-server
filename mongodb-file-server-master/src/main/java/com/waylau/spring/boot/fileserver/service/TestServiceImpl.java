package com.waylau.spring.boot.fileserver.service;


import com.waylau.spring.boot.fileserver.domain.Test;
import com.waylau.spring.boot.fileserver.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: fcq
 * @create: 2020-12-30
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestRepository testRepository;


    @Override
    public Test save(Test test) {
        return testRepository.save(test);
    }
}
