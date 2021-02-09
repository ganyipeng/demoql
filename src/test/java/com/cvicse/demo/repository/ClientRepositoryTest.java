package com.cvicse.demo.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ClientRepositoryTest {
    @Autowired
    ClientRepository repository;

    @Test
    public void countTest() throws Exception {
        System.out.println(repository.count());
    }
}
