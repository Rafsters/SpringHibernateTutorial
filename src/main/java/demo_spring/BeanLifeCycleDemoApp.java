package demo_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-appContext.xml");

        // retrieve beanfrom spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());

        context.close();

    }
}
