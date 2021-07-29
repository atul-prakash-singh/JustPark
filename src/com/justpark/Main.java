package com.justpark;

import com.justpark.models.Address;
import com.justpark.models.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello everyone!");
        Address address = new Address.Builder()
                .state("Uttar Pradesh")
                .country("India")
                .zipCode("226022")
                .city("Lucknow")
                .streetAddress("Sanjay Vihar")
                .build();

        Person person = new Person.Builder("Atul Prakash Singh")
                .phoneNumber("+91 8447149838")
                .build();

        System.out.println(address);
        System.out.println(person);
    }
}


