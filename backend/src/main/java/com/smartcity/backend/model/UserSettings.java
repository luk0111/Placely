package com.smartcity.backend.model;

public class UserSettings {

    private boolean isAdmin;

    public String getPermissions() {
        return isAdmin ? "Admin" : "Citizen";
    }

    public boolean isAdmin() {
        return isAdmin;
    }


    private boolean receiveNotifications = true;
    private boolean darkMode = true;
    private boolean privateProfile = false;

    // Getters and Setters
    public boolean GetReceiveNotifications() {
        return receiveNotifications;
    }
    public void SetReceiveNotifications(boolean receiveNotifications) {
        this.receiveNotifications = receiveNotifications;
    }

    public boolean GetDarkMode() {
        return darkMode;
    }
    public void SetDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public boolean GetPrivateProfile() {
        return privateProfile;
    }
    public void SetPrivateProfile(boolean privateProfile) {
        this.privateProfile = privateProfile;
    }


}
