package visi.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {

    public static void main(String[] args) {

        //use Artificial Intelligence
        ArtificialIntelligence ai = new ArtificialIntelligence();
        ai.enroll();
        ai.results();

        //use Machine Learning
        MachineLearning ml = new MachineLearning();
        ml.enroll();
        ml.results();

        //using interface reference
        Course ai1 = new ArtificialIntelligence();
        ai1.enroll();
        ai1.results();

        //Using Spring IOC Container Application Context
        //Spring reads config file and create objects
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config file loaded");
        ArtificialIntelligence artificial = context.getBean("artificial",ArtificialIntelligence.class);
        artificial.enroll();
        artificial.results();

        Course course = context.getBean("Course",Course.class);
        course.enroll();
        course.results();

    }
}
