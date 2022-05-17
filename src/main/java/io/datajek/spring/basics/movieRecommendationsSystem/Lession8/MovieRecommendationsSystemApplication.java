package io.datajek.spring.basics.movieRecommendationsSystem.Lession8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommendationsSystemApplication {

	public static void main(String[] args) {

		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommendationsSystemApplication.class, args);

		//Retrieve singleton bean from application context thrice
		ContentBasedFilter cbf1 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf2 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf3= appContext.getBean(ContentBasedFilter.class);

		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);

		CollaborativeFilter cbf4 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cbf5 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cbf6= appContext.getBean(CollaborativeFilter.class);

		System.out.println(cbf4);
		System.out.println(cbf5);
		System.out.println(cbf6);
	}

}
