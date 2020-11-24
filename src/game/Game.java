package game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Game implements Serializable {
    enum State {
        PLAYING,
        PAUSED,
        EXIT
    }

//    private Ball ball;
    public static final double gravity = 5.0;
    private int score;
    private State state;
    private ArrayList<GameObject> component;
    private Date date;

    public Game() {
        this.score = 0;
        this.state = State.PLAYING;
        this.date = java.util.Calendar.getInstance().getTime();
        this.component = new ArrayList<>();
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int sc) {
        if(sc >= 0 && sc > getScore())
            this.score = sc;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State s) {
        this.state = s;
    }

    public void play() {
        setState(State.PLAYING);
        // ...
    }

    public void pause() {
        setState(State.PAUSED);
    }

    public void exit() {
        setState(State.EXIT);
    }

    public GameObject getComponent(int ind) {
        if(ind >= 0 && ind < component.size())
            return component.get(ind);
        return null;
    }
}
