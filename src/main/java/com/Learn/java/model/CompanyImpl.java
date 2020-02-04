package com.Learn.java.model;

import com.Learn.java.Service.Company.Company;

/**
 * App2dMpl
 */
public class CompanyImpl implements Company {

    private String state;
    private String city;
    private String district;
    private String subDiStrictm;
    private String address;
    private int phoneNumber;
    private int postalCode;
    private boolean haveOption = false;

    public CompanyImpl() {
        
    }


    @Override
    public void addPrimary(String state, String city, String distict, String address) {

        this.state = state;
        this.city = city;
        this.address = address;
        this.district = distict;

    }

    @Override
    public void addOption(String subDiStrictm, int phoneNumber, int postalCode) {

        this.subDiStrictm = subDiStrictm;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.haveOption = true;

    }

    public void showDetail() {
        String data = this.state + "\n" 
        + this.city + "\n" 
        + this.district + "\n" 
        + this.address + "\n";

        if (this.haveOption) {
            data = this.state + "\n" 
            + this.city + "\n" 
            + this.district + "\n" 
            + this.address + "\n"
            + this.subDiStrictm + "\n"
            + this.phoneNumber + "\n"
            + this.postalCode + "\n";
        }

        System.out.println(data);
    }

}