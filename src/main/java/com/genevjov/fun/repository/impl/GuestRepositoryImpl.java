package com.genevjov.fun.repository.impl;

import com.genevjov.fun.entity.GuestEntity;
import com.genevjov.fun.repository.GuestRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestRepositoryImpl implements GuestRepository {

    private List<GuestEntity> guestsStorage;

    public GuestRepositoryImpl() {
        this.guestsStorage = new ArrayList<>();
    }

    @Override
    public List<GuestEntity> getAllGuests() {
        return guestsStorage;
    }

    @Override
    public void removeGuestById(String guestId) {
        guestsStorage.removeIf(guestEntity -> guestEntity.getGuestId().equals(guestId));
    }

    @Override
    public void removeGuestByName(String guestName) {
        guestsStorage.removeIf(guestEntity -> guestEntity.getFullName().equals(guestName));
    }

    @Override
    public void addGuest(GuestEntity guest) {
        guestsStorage.add(guest);
    }
}