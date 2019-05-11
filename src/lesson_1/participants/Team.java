package lesson_1.participants;

import lesson_1.Competitor;

public class Team {
    private String teamName;
    private Competitor[] teamCompetitors;


    //в задание написанно что нужен массив из 4 участников, но решил сделать количество от указанного при создании
    public Team(String teamName, Competitor... c) {
        this.teamName = teamName;
        teamCompetitors = new Competitor[c.length];
        for (int i = 0; i < c.length; i++) {
            teamCompetitors[i] = c[i];
        }
    }

    //метод выводит информаци о всех участниках группы
    public void showResultTeam() {
        for(Competitor c : teamCompetitors) {
            c.info();
        }
    }

    //выводит информацию о участниках прошедших дистанцию
    public void showResultDistance() {
        for(Competitor c : teamCompetitors) {
            if (c.isOnDistance()) {
                c.info();
            }
        }
    }

    public Competitor[] getTeamCompetitors() {
        return teamCompetitors;
    }
}
