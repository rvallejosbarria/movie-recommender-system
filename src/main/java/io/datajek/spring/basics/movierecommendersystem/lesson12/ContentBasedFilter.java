package io.datajek.spring.basics.movierecommendersystem.lesson12;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
  // getRecommendations takes a movie as input and returns a list of similar movies
  public String[] getRecommendations(String movie) {
    // implement logic of content based filter
    // return movie recommendations
    return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
  }
}
