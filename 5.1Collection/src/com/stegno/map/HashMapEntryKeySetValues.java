package com.stegno.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValues {
    public static void main(String[] args) {
        Map<String, String> contryCodes = new HashMap<>();

        contryCodes.put("India", "IN");
        contryCodes.put("United States of America", "US");
        contryCodes.put("Russia", "RU");
        contryCodes.put("Japan", "JP");
        contryCodes.put("China", "CN");

        // HashMap's entry set
        Set<Map.Entry<String, String>> countryISOCodeEntries = contryCodes.entrySet();
        System.out.println("countryISOCode entries : " + countryISOCodeEntries);

        // HashMap's key set
        Set<String> countries = contryCodes.keySet();
        System.out.println("countries : " + countries);

        // HashMap's values
        Collection<String> isoCodes = contryCodes.values();
        System.out.println("isoCodes : " + isoCodes);
    }
}