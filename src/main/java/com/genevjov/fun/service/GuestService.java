package com.genevjov.fun.service;

import com.genevjov.fun.entity.GuestEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GuestService {

    void addGuest(GuestEntity guest);

    void removeGuestById(String id);

    void removeGuestByName(String name);

    List<GuestEntity> getAllGuest();
}
