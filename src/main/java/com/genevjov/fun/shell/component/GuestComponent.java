package com.genevjov.fun.shell.component;

import com.genevjov.fun.entity.GuestEntity;
import com.genevjov.fun.service.GuestService;
import com.genevjov.fun.util.GuestIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
public class GuestComponent {

    private final GuestService guestService;

    @Autowired
    public GuestComponent(GuestService guestService) {
        this.guestService = guestService;
    }

    @ShellMethod("Add guest to program.")
    public void addGuest(
            @ShellOption String name) {
        GuestEntity guestEntity = new GuestEntity();
        guestEntity.setFullName(name);
        guestEntity.setGuestId(GuestIdGenerator.generateId());
        guestService.addGuest(guestEntity);
    }

    @ShellMethod("Returns list of all guestsList.")
    public List<GuestEntity> guestsList() {
        return guestService.getAllGuest();
    }

    @ShellMethod("Removes guest by id.")
    public void removeGuestById(
            @ShellOption String guestId) {
        guestService.removeGuestById(guestId);
    }

    @ShellMethod("Removes guest by name.")
    public void removeGuestByName(
            @ShellOption String guestFullName) {
        guestService.removeGuestByName(guestFullName);
    }
}