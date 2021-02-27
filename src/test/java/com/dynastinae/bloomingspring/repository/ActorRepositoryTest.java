package com.dynastinae.bloomingspring.repository;

import com.dynastinae.bloomingspring.model.Actor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class ActorRepositoryTest {

    @Autowired
    private ActorRepository actorRepository;

    @Test
    void findTest() {
        List<Actor> actors = actorRepository.findAll();

        for (Actor actor : actors) {
            log.info("@@ actor => {}", actor);
        }
    }

}