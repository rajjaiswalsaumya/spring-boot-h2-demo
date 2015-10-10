package org.cdac;

import org.cdac.models.User;
import org.cdac.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootH2DemoApplication implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootH2DemoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        User user = new User("raj", "raj", "rajjaiswalsaumya@gmail.com");
        //if (userRepository.findUserByEmailid("rajjaiswalsaumya@gmail.com") != null)
        userRepository.save(user);
    }
}
