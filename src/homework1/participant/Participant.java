package homework1.participant;

public interface Participant {

    String DEFAULT_NAME = "Unknown";
    int DEFAULT_RUN = 50;
    int DEFAULT_JUMP = 50;

    void run();
    void jump();
    int getMaxRun();
    void setMaxRun(int maxRun);
    int getMaxJump();
    void setMaxJump(int maxJump);
    String getName();
    void setName(String name);
}
