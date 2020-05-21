package fr.fairepartfait.server.models;

public class Card {

    private String id;
    private String color;
    private Text[] texts;

    public Card() { }

    public Card(String id, String color, Text[] texts) {
        this.id = id;
        this.color = color;
        this.texts = texts;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public Text[] getTexts() {
        return texts;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTexts(Text[] texts) {
        this.texts = texts;
    }
}
