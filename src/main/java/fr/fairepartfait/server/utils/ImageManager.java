package fr.fairepartfait.server.utils;

import fr.fairepartfait.server.models.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ImageManager {

    private List<Card> cards;

    public ImageManager() {
        cards = new ArrayList<>();
    }

    public void addCard(Card...cards) {
        Collections.addAll(this.cards, cards);
    }

    public Card getCardById(String id) {
        return cards.stream().filter(card -> card.getId().equals(id)).collect(Collectors.toList()).get(0);
    }

    public List<Card> getCards() {
        return cards;
    }
}
