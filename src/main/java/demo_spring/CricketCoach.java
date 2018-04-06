package demo_spring;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Practice fst bowling for 15 minutes";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
