package io.datajek.spring.basics.movieRecommendationsSystem.Lession6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommendationsSystemApplication {

	public static void main(String[] args) {

		//passing name of the filter as constructor argument
		//RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());

		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommendationsSystemApplication.class, args);

		//use ApplicationContext to find which filter is being used
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));
	}

}
