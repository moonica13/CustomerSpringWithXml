package com.company.managers;

import com.company.model.Admin;

public class AdminManager {

    private final Admin admin;

    public AdminManager( Admin admin) {
        this.admin = admin;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void postInit() {
        System.out.println(admin + " has just been added.");
    }

    public void preDestroy() {
        System.out.println(admin + " has been removed.");
    }
}
