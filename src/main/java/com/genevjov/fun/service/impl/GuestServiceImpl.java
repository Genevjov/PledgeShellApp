package com.genevjov.fun.service.impl;

import com.genevjov.fun.entity.GuestEntity;
import com.genevjov.fun.repository.GuestRepository;
import com.genevjov.fun.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;

    @Autowired
    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public void addGuest(GuestEntity guest) {
        guestRepository.addGuest(guest);
    }

    @Override
    public void removeGuestById(String id) {
        validateGuestData(id);
        guestRepository.removeGuestById(id);
    }

    @Override
    public void removeGuestByName(String name) {
        validateGuestData(name);
        guestRepository.removeGuestByName(name);
    }

    @Override
    public List<GuestEntity> getAllGuest() {
       return guestRepository.getAllGuests();
    }

    private void validateGuestData(String guestData) {
        if (Objects.isNull(guestData) || guestData.isEmpty()) {
            throw new RuntimeException("Guest data can not be empty");
        }
    }
}
