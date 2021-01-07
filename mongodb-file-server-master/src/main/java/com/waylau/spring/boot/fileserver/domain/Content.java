package com.waylau.spring.boot.fileserver.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: fcq
 * @create: 2021-01-07
 */
@Document
public class Content {
    @Id  // 主键
    private String id;

    private String name;

    public Content(){}

    public Content(String name){
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
