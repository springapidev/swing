/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.domain.Country;
import java.util.Set;

/**
 *
 * @author Rajail Islam
 */
public interface CountryDAO {

    void save(Country c);

    void saveList(Set<Country> countries);

    Set<Country> getCountries();
}
