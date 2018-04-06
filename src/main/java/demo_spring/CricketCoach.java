package demo_spring;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAdress;
    private String team;

    public CricketCoach() {
        System.out.println("Cricket Coach: inside no-arg constructor");
    }

    public void setEmailAdress(String emailAdress) {
        System.out.println("Cricket Coach: inside setter method - setEmailAdress");
        this.emailAdress = emailAdress;
    }

    public void setTeam(String team) {
        System.out.println("Cricket Coach: inside setter method - setTeam");
        this.team = team;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
