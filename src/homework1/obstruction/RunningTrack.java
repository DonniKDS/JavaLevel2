package homework1.obstruction;

import homework1.participant.Participant;

public class RunningTrack implements Obstruction {
    private int RunningTrackLength;

    public RunningTrack(int RunningTrackLength){
        this.RunningTrackLength = RunningTrackLength;
    }

    public boolean use(Participant runner){
        if (RunningTrackLength <= runner.getMaxRun()){
            System.out.println(runner.getName() + " успешно пробежал");
            return true;
        }
        else {
            System.out.println(runner.getName() + " не смог пробежать");
            return false;
        }
    }
}
