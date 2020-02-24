package homework1.participant;

public class Human implements Participant {

    private String name;
    private int maxRun;
    private int maxJump;

    public Human() {
         this.name = DEFAULT_NAME;
         this.maxRun = DEFAULT_RUN;
         this.maxJump = DEFAULT_JUMP;
    }

    public Human(String name, int maxRun, int maxJump){
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
