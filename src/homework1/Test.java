package homework1;

import homework1.obstruction.*;
import homework1.participant.*;

public class Test {

    public static void main(String[] args) {
        Participant[] members = new Participant[4];
        Obstruction[] obstructions = new Obstruction[10];

        Human human = new Human("Bobbi", 100, 3);
        Cat cat = new Cat("Josh", 60, 5);
        Robot robot = new Robot("Fedor", 120, 1);
        Human superman = new Human("Superman", 9999, 9999);

        members[0] = human;
        members[1] = cat;
        members[2] = robot;
        members[3] = superman;

        for (int i = 0; i < 5; i++){
            Wall wall = new Wall(i);
            obstructions[i*2] = wall;
        }

        for (int i = 1; i <= 5; i++){
            RunningTrack runningTrack = new RunningTrack(i*20);
            obstructions[i*2-1] = runningTrack;
        }

        for (Participant member : members){
            boolean check = true;
            for (Obstruction obstruction : obstructions){
                if (!obstruction.use(member)) {
                    System.out.println(member.getName() + " не прошел всю дистанцию с препятствиями!");
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(member.getName() + " прошел всю дистанцию с препятствиями!");
            }
        }

    }
}
