package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.entity.SingleEntity;
import com.oocl.web.sampleWebApp.jpaSample.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

  @Autowired
  private UserRepository userRepository;
  @Autowired
  private SingleRespository singleRepository;
  @Test
  public void test_should_return_user_when_the_user_exist() {
    //given
    User user = new User();
    user.setName("test");
    userRepository.save(user);

    //when
    List<User> userList = userRepository.findAll();

    //then
    Assertions.assertEquals(1, userList.size());
    Assertions.assertEquals("test", userList.get(0).getName());
  }
  @Test
  public void test_should_return_single_when_the_sing_exist() {
    //given
    SingleEntity se = new SingleEntity();
    se.setId(1);
    se.setName("single");
    singleRepository.save(se);

    //when
    List<SingleEntity> singleList = singleRepository.findAll();

    //then
    Assertions.assertEquals(1, singleList.size());
    Assertions.assertEquals("single", singleList.get(0).getName());
  }


}

