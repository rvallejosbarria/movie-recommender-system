package io.datajek.spring.basics.movierecommendersystem.lesson14;

import org.springframework.beans.factory.annotation.Autowired;

public class RecommenderImplementation {
  @Autowired
  private Filter filter;

  public Filter getFilter() {
    return filter;
  }

  public void setFilter(Filter filter) {
    this.filter = filter;
  }

  // use a filter to find recommendations
  public String[] recommendMovies(String movie) {
    // print the name of interface implementation being used
    System.out.println("\nName of the filter in use: " + filter + "\n");

    String[] results = filter.getRecommendations("Finding Dory");

    return results;
  }
}
