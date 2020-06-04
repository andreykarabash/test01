package com.orc.ak;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContactBook {
    protected ArrayList<ContactCard> contactCards;

    public ContactBook(ArrayList<ContactCard> contactCards) {
        this.contactCards = contactCards;
    }

    public ContactBook(ContactCard card) {
        this();
        this.contactCards.add(card);
    }

    public ContactBook() {
        this.contactCards = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ContactBook={ " + contactCards.stream().map(Object::toString)
                .collect(Collectors.joining(";\n\t")) + " }";
    }

    public ArrayList<ContactCard> getContactCards() {
        return contactCards;
    }

    public void setContactCards(ArrayList<ContactCard> contactCards) {
        this.contactCards = contactCards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactBook)) return false;
        ContactBook that = (ContactBook) o;
        return Objects.equals(contactCards, that.contactCards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactCards);
    }

    public ArrayList<ContactCard> getContactByPhone(Integer phone) {
        final ArrayList<ContactCard> collect = contactCards.stream()
                .filter(e -> Objects.nonNull(e.getPhone()))
                .filter(e -> e.getPhone().equals(phone))
                .collect(Collectors.toCollection( ()-> new ArrayList<ContactCard>() ));
        return collect;
    }

    public ArrayList<ContactCard> getContactByName(String name) {
        final ArrayList<ContactCard> collect = contactCards.stream()
                .filter(e -> e.getName().equals(name))
                .collect(Collectors.toCollection( ()-> new ArrayList<ContactCard>() ));
        return collect;
    }

    public void Add(ContactCard card) {
        contactCards.add(card);
    }
    public void Add(String name, Integer phone) {
        contactCards.add(new ContactCard(name, phone));
    }

}
