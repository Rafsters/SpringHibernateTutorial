package demo_spring;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAdress;
    private String team;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public FootballCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Practice kicking";
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void doMyStartupStuff(){
        System.out.println("FootballCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuffYoYo(){
        System.out.println("FootballCoach: inside method doMyCleanupStuffYoYo");
    }
}
