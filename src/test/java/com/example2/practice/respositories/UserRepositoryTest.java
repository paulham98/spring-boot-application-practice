package com.example2.practice.respositories;

import com.example2.practice.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void name() {
        User user = new User();
        user.setName("paulham");

        System.out.println("id:"+user.getId());
        User user1 = userRepository.save(user);

        User user2 = new User();
        user2.setId(1l);
        user.setName("tina");
        user2 = userRepository.save(user2);

        System.out.println(user1.getId()+ " / " + user2.getId());
        System.out.println(user1.getName() + " / "+ user2.getName());
    }

}