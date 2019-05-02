package lesson_1;

import lesson_1.obstacles.*;
import lesson_1.participants.Cat;
import lesson_1.participants.Dog;
import lesson_1.participants.Human;
import lesson_1.participants.Team;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("BlueStrip", new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"));
        Course course1 = new Course(new Cross(80), new Wall(2), new Water(1), new Cross(120));
        course1.doIt(team1);
        team1.showResultDistance();
        System.out.println();
        team1.showResultTeam();
    }
}