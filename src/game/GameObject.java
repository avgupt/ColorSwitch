package game;
import javafx.scene.Node;
import util.Vector;

import java.io.Serializable;

public abstract class GameObject implements Serializable {
    private Vector position;
    private boolean visibility;

    public GameObject() {
        visibility = true;
        position = new Vector();
    }

    public GameObject(Vector pos, boolean vis) {
        this.position = pos;
        this.visibility = vis;
    }

    public GameObject(double centerX, double centerY, boolean vis) {
        this.position = new Vector(centerX, centerY);
        this.visibility = vis;
    }

    public Vector getPosition() {
        return position;
    }

    public void setPosition(Vector position) {
        this.position = position;
    }

    public void setPosition(double centerX, double centerY) {
        this.position.setX(centerX);
        this.position.setY(centerY);
    }

    public boolean isVisible() {
        return visibility;
    }

    public void setVisibility(boolean vis) {
        this.visibility = vis;
    }
//    public void display() {
//        visibility = true;
//    }
    public abstract void display();
    public abstract void createObstacle();
    public abstract Node getNode();
}
