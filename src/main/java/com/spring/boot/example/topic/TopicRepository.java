package com.spring.boot.example.topic;

import org.springframework.data.repository.CrudRepository;

interface TopicRepository extends CrudRepository<Topic, String> {
}
