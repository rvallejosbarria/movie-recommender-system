package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContentBasedFilter implements Filter {
  // getRecommendations takes a movie as input and returns a list of similar movies
  public String[] getRecommendations(String movie) {
    // implement logic of content based filter
    // return movie recommendations
    return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
  }
}
