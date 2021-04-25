package com.company.admin;

import com.company.AdminGeneralMethods;
import com.company.User;

public class SalesPerson extends Admin implements AdminGeneralMethods {
    public SalesPerson(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getClientFirstName(User user) {
        return null;
    }

    @Override
    public String getClientLastName(User user) {
        return null;
    }
}
