package fr.fairepartfait.server.models;

public class Text {

    private String text;
    private String color;
    private String policy;
    private int size;

    private int x;
    private int y;

    public Text() { }

    public Text(String text, String color, String policy, int size, int x, int y) {
        this.text = text;
        this.color = color;
        this.policy = policy;
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public String getText() {
        return text;
    }

    public String getColor() {
        return color;
    }

    public String getPolicy() {
        return policy;
    }

    public int getSize() {
        return size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
