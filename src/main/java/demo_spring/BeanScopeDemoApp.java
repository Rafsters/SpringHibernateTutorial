package demo_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-appContext.xml");

        // retrieve beanfrom spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same

        boolean result  = (theCoach == alphaCoach);

        // print out the result
        System.out.println(theCoach.equals(alphaCoach));
        System.out.println("\nPrinting to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        context.close();

    }
}
