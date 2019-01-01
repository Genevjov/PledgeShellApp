package com.genevjov.fun.entity;

import java.util.Objects;

public class GuestEntity {

    private String fullName;
    private String guestId;

    public GuestEntity() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuestEntity that = (GuestEntity) o;
        return Objects.equals(fullName, that.fullName) &&
                Objects.equals(guestId, that.guestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, guestId);
    }

    @Override
    public String toString() {
        return "Name: " + fullName +
                "\n Id: " + guestId;
    }
}
