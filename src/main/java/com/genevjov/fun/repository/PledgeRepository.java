package com.genevjov.fun.repository;

import com.genevjov.fun.entity.GuestEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PledgeRepository {

    void addToGuest(GuestEntity guestEntity);

    void pickOutScoreFromGuest(GuestEntity guestEntity);

}
