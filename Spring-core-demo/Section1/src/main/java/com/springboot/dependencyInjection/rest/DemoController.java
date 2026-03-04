package com.springboot.dependencyInjection.rest;

import com.springboot.dependencyInjection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

  @Autowired
//  USING CONSTRUCTOR
//  public DemoController(@Qualifier("trackCoach") Coach theCoach) {
//      myCoach = theCoach;
//  }
  public void test (@Qualifier("baseballCoach") Coach theCoach) {
      myCoach = theCoach;
  }

    @GetMapping("/getDailyWorkout") 
        public String getDailyWorkout() {
            return myCoach.getDailyWorkout();
        }
    
}