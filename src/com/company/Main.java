package com.company;

import com.company.admin.Administrator;
import com.company.client.RegularClient;

public class Main {

    public static void main(String[] args) {
        RegularClient regularClient = new RegularClient("Tomas", "Edison");
        System.out.println(regularClient.getLastName());
        Administrator administrator = new Administrator("Kelly", "Pro");
        System.out.println(administrator.getClientFirstName(regularClient));
    }
}
