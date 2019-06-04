/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oos.store.utils;

import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Oluwaseun_Smart
 */
public class DBManager {

    private static EntityManager em;
    private static EntityManagerFactory emf;

    public static EntityManager entityManager() {
        if (Objects.isNull(em)) {
            emf = Persistence.createEntityManagerFactory("StorePU");
            em = emf.createEntityManager();
        }
        return em;
    }

    public static void closeDB() {
        em.close();
        emf.close();
    }

}
