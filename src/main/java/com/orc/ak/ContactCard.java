package com.orc.ak;

import java.util.Objects;

public class ContactCard {
    protected String name;
    protected Integer phone;

    public ContactCard(String name, Integer phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(name);
        str.append(':');
        str.append(phone);
        return str.toString();
    }

    public String getName() {
        return name;
    }

    public Integer getPhone() {
        return phone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactCard)) return false;
        ContactCard that = (ContactCard) o;
        return name.equals(that.name) &&
                Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
