package homework1.participant;

public class Cat implements Participant {

    private String name;
    private int maxRun;
    private int maxJump;

    public Cat() {
        this.name = DEFAULT_NAME;
        this.maxRun = DEFAULT_RUN;
        this.maxJump = DEFAULT_JUMP;
    }

    public Cat(String name, int maxRun, int maxJump){
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
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
