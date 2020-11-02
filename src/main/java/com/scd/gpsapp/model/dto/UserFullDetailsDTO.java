package com.scd.gpsapp.model.dto;

import com.scd.gpsapp.model.entity.GPSData;
import com.scd.gpsapp.model.entity.Role;
import com.scd.gpsapp.model.entity.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserFullDetailsDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private List<GPSData> gpsDataList;
    private Set<Role> roles;

    public UserFullDetailsDTO(User user, Set<Role> roles, List<GPSData> gpsDataList){
        this.roles = roles;
        this.gpsDataList = gpsDataList;
    }

    public UserFullDetailsDTO(UserSimpleDetailsDTO otherSimpleUser){
        this.username = otherSimpleUser.getUsername();
        this.email = otherSimpleUser.getEmail();
        this.firstName = otherSimpleUser.getFirstName();
        this.lastName = otherSimpleUser.getLastName();
        this.gpsDataList = new ArrayList<GPSData>();
        this.roles = new HashSet<Role>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<GPSData> getGpsDataList() {
        return gpsDataList;
    }

    public void setGpsDataList(List<GPSData> gpsDataList) {
        this.gpsDataList = gpsDataList;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
