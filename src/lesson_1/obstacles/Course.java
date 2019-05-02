package lesson_1.obstacles;

import lesson_1.Competitor;
import lesson_1.participants.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... ob) {
        obstacles = new Obstacle[ob.length];
        for (int i = 0; i < ob.length; i++) {
            obstacles[i] = ob[i];
        }
    }

    public void doIt(Team team) {
        for (Competitor c : team.getTeamCompetitors()) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
