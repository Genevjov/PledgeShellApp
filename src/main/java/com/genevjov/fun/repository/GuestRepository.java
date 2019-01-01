package com.genevjov.fun.repository;

import com.genevjov.fun.entity.GuestEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository {

    List<GuestEntity> getAllGuests();

    void removeGuestById(String guestId);

    void removeGuestByName(String guestName);

    void addGuest(GuestEntity guest);

}
