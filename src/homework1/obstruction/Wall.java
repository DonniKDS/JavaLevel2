package homework1.obstruction;

import homework1.participant.Participant;

public class Wall implements Obstruction {
    private int wallHeight;

    public Wall(int wallHeight){
        this.wallHeight = wallHeight;
    }

    public boolean use(Participant runner){
        if (wallHeight <= runner.getMaxJump()){
            System.out.println(runner.getName() + " успешно перепрыгнул");
            return true;
        }
        else {
            System.out.println(runner.getName() + " не смог перепрыгнуть");
            return false;
        }
    }
}
