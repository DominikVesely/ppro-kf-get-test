package com.example.demofim.dao;

import com.example.demofim.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * Ulozi noveho uzivatele do DB.
     * @param user uzivatel, ktery ma by ulozen
     */
    void create(User user);

    /**
     * Najde uzivatele podle ID (PK).
     * @param id ID hledaneho uzivatele
     * @return nalezeneho uzivatele nebo NULL, pokud uzivatel nebyl nalezen.
     */
    User findById(long id);

    /**
     * Najde vsechny uzivatele
     * @return seznam vsech uzivatelu
     */
    List<User> findAll();
}
