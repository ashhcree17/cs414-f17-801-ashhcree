package csu.springmvc;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import csu.springmvc.model.Login;
import csu.springmvc.model.Trainer;
import csu.springmvc.service.TrainerService;

@ContextConfiguration(locations = { "classpath:csu/config/beans.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TrainerServiceTest {

  @Autowired
  TrainerService trainerService;

  Trainer trainer = new Trainer();
  
  @Before
  public void setUp() throws Exception {
    trainer.setTrainerid(1464);
    trainer.setUsername("joesmith");
    trainer.setPassword("iLOVEtheGYM21");
    trainer.setFirstname("Joe");
    trainer.setLastname("Smith");
    trainer.setPhonenumber(1234567890);
    trainer.setEmail("joesmith@email.com");
    trainer.setInsurance("Aetna");
    trainerService.register(trainer);
  }

  @Test
  public void testValidateUser() {
    Login login = new Login();
    login.setUsername("joesmith");
    login.setPassword("iLOVEtheGYM21");

    Trainer trainerChk = trainerService.validateTrainer(login);

    assertEquals("Joe", trainerChk.getFirstname());
  }
}