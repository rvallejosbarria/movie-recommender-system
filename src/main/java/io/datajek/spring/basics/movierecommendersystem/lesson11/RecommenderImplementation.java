package io.datajek.spring.basics.movierecommendersystem.lesson11;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
  private Logger logger = LoggerFactory.getLogger(this.getClass());
  private Filter filter;

  @Autowired
  public void setFilter(Filter filter) {
    logger.info("In RecommenderImplementation setter method..dependency injection");
    this.filter = filter;
  }

  // use a filter to find recommendations
  public String[] recommendMovies(String movie) {
    // print the name of interface implementation being used
    System.out.println("\nName of the filter in use: " + filter + "\n");

    String[] results = filter.getRecommendations("Finding Dory");

    return results;
  }

  @PostConstruct
  public void postConstruct() {
    //initialization code goes here
    logger.info("In RecommenderImplementation postConstruct method");
  }

  @PreDestroy
  public void preDestroy() {
    //cleanup code
    logger.info("In RecommenderImplementation preDestroy method");
  }
}
