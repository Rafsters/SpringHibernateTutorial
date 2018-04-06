package demo_spring;

public class BaseballCoach implements Coach {

    // define a private field

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Spend 30 minutes on batting pracice";
    }

    public String getDailyFortune() {
        // use my fortuneService to get fortune
        return fortuneService.getFortune();
    }
}
