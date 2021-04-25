package com.company.admin;

import com.company.AdminGeneralMethods;
import com.company.User;

public class Administrator extends Admin implements AdminGeneralMethods {

    public Administrator(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getClientFirstName(User user) {
        return user.getFirstName();
    }

    @Override
    public String getClientLastName(User user) {
        return user.getLastName();
    }
}
