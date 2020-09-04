package com.orc.ak;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContactBook {
    protected List<ContactCard> contactCards;

    public ContactBook(List<ContactCard> contactCards) {
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

    public List<ContactCard> getContactCards() {
        return contactCards;
    }

    public void setContactCards(List<ContactCard> contactCards) {
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

    public List<ContactCard> getContactByPhone(Integer phone) {
        if (phone == null)
            return contactCards.stream()
                    .filter(e -> Objects.isNull(e.getPhone()))
                    .collect(Collectors.toList());
        else
            return contactCards.stream()
                .filter(e -> phone.equals(e.getPhone()))
                .collect(Collectors.toList());
    }

    public List<ContactCard> getContactByName(String name) {
        return contactCards.stream()
                .filter(e -> e.getName().equals(name))
                .collect(Collectors.toList());
    }

    public void Add(ContactCard card) {
        contactCards.add(card);
    }
    public void Add(String name, Integer phone) {
        contactCards.add(new ContactCard(name, phone));
    }

}
