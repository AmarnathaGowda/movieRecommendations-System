package io.datajek.spring.basics.movieRecommendationsSystem.Lession13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {


        //use content based filter to find similar movies
        //ContentBasedFilter filter = new ContentBasedFilter();
        //CollaborativeFilter filter = new CollaborativeFilter();

        //use filter interface to select filter
        /* @Autowired
        private Filter filter;

        public RecommenderImplementation(Filter filter) {
            super();
            this.filter = filter;
        }*/

    @Autowired
    @Qualifier("CF")
    private Filter filter;




        //use a filter to find recommendations
        public String [] recommendMovies (String movie) {

            //print the name of interface implementation being used
            System.out.println("Name of the filter in use: " + filter + "\n");

            String[] results = filter.getRecommendations(movie);

            //return the results
            return results;
        }



}
