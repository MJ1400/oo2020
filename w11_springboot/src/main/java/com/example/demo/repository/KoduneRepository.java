package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KoduneRepository {
    static List<Boolean> booleans = new ArrayList<>();

    public static List<Boolean> buildBooleans() {
        List<Boolean> booleans = Arrays.asList(true, false, false, true, true, false, false, true, false);
        return booleans;
    }
}