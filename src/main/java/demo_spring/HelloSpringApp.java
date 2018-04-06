package demo_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        // call new method for fortunes
        System.out.println(theCoach.getDailyFortune());
        // close the context
        context.close();
    }
}
