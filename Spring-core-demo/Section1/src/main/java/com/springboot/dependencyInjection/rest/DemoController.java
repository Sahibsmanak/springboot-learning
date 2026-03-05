package com.springboot.dependencyInjection.rest;

import com.springboot.dependencyInjection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach myAnotherCoach;

  @Autowired
  public DemoController (@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach) {
      myCoach = theCoach;
      myAnotherCoach = theAnotherCoach;
  }

    @GetMapping("/getDailyWorkout") 
        public String getDailyWorkout() {
            return myCoach.getDailyWorkout();
        }
    
    /**
     * If the type of the bean is singleton it will give true otherwise if type is protoype it will give false.
     */
    @GetMapping("/check")
    public Boolean checkInstances() {
        return myCoach == myAnotherCoach;
    }
}