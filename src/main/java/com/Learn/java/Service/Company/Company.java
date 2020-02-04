package com.Learn.java.Service.Company;


/**
 * Company
 */
public interface Company {

    void addPrimary(String state, String city, String distict, String address);
    void addOption(String subDiStrictm, int phoneNumber, int postalCode);

}