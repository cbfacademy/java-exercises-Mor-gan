package com.cbfacademy.people;

import java.util.ArrayList;
import java.util.List;

public class ImmutablePerson {

    protected final String firstName;
    protected String middleName;
    protected final  String lastName;
    protected List<String> nickName;

public ImmutablePerson(String firstName, String lastName, String middleName, List<String> nickName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = new ArrayList<>(nickName);
    }
}
