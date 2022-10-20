package org.example.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {

    @Test
    void employCashier() {
        Manager manager = new Manager("1234", "Enoch", "08108030607",
                "M.sc", 40, new Address(9, "Ajiji Street"));
        HireCashier hireCashier = new HireCashier("Deborah David", "Graduate", 22);
        Store main = new Store();

        boolean status = manager.employCashier(main , hireCashier);

        Assertions.assertTrue(status);
    }
}