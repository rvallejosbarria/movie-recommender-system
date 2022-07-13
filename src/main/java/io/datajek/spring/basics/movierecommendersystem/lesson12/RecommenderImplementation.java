package io.datajek.spring.basics.movierecommendersystem.lesson12;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named
public class RecommenderImplementation {
  @Inject
  @Qualifier("CF")
  private Filter filter;

  // use a filter to find recommendations
  public String[] recommendMovies(String movie) {
    // print the name of interface implementation being used
    System.out.println("\nName of the filter in use: " + filter + "\n");

    String[] results = filter.getRecommendations("Finding Dory");

    return results;
  }

  public Filter getFilter() {
    return filter;
  }
}
