package com.genevjov.fun.util;

import java.util.Random;

public final class GuestIdGenerator {

    private static final int ID_LENGTH = 5;
    private static final int MAX_ID_NUMDER = 10;

    public static String generateId() {
        StringBuilder idBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < ID_LENGTH; i++) {
            idBuilder.append(random.nextInt(MAX_ID_NUMDER));
        }
        return idBuilder.toString();
    }
}
