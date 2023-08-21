package com.cbfacademy.people;

import java.util.ArrayList;
import java.util.List;

public class ImmutablePerson {

   private final String firstName;
    private String middleName;
    private final  String lastName;
    private List<String> nickName;

public ImmutablePerson(String firstName, String lastName, String middleName, List<String> nickName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = new ArrayList<>(nickName);
    }
}
