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
  //We can remove @Qualifier and the primary implementation will work but if we add quallifier it will
  //give priority to qualifier
  //Also more than one primary will cause error
  public DemoController (@Qualifier("trackCoach") Coach theCoach) {
      myCoach = theCoach;
  }

    @GetMapping("/getDailyWorkout") 
        public String getDailyWorkout() {
            return myCoach.getDailyWorkout();
        }
    
}