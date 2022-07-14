package io.datajek.spring.basics.movierecommendersystem.lesson14;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieRecommenderSystemApplication {
  public static void main(String[] args) {
    //load the configuration file
    ClassPathXmlApplicationContext appContext =
      new ClassPathXmlApplicationContext("appContext.xml");

    //check the beans which have been loaded
    System.out.println("\nBeans loaded:");
    System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

    //retrieve bean from the application context
    RecommenderImplementation recommender =
      appContext.getBean("recommenderImpl", RecommenderImplementation.class);

    //print dependency
    System.out.println("\nDependency: " + recommender.getFilter());
    System.out.println();

    appContext.close();
	}
}
