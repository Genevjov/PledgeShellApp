package com.genevjov.fun.repository.impl;

import com.genevjov.fun.entity.GuestEntity;
import com.genevjov.fun.repository.GuestRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PledgeRepositoryImpl implements GuestRepository {

    private List<GuestEntity> guests;

    public PledgeRepositoryImpl() {
        this.guests = new ArrayList();
    }

    @Override
    public List<GuestEntity> getAllGuests() {
        return guests;
    }

    @Override
    public void removeGuestById(String guestId) {
        guests.removeIf(guestEntity -> guestEntity.getGuestId().equals(guestId));
    }

    @Override
    public void removeGuestByName(String guestName) {
        guests.removeIf(guestEntity -> guestEntity.getFullName().equals(guestName));
    }

    @Override
    public void addGuest(GuestEntity guest) {
        guests.add(guest);
    }
}
