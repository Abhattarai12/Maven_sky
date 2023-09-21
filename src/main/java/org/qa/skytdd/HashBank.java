package org.qa.skytdd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class HashBank {

    private HashSet<BankAccount> Accounts = new HashSet<>();

    public HashBank() {
    }
    ;
    public void AddAccount(BankAccount newBankAccount) throws Exception {
        Accounts.add(newBankAccount);
    }

    ;

    public void DeleteByAccountNumber(int value) {
        for (BankAccount a : Accounts) {
            if (value == a.getAccountNumber()) {
                Accounts.remove(a);
            };
        }
        ;

    }

    ;

    public BankAccount findAccount(int AccountNumber) {

        BankAccount found = null;
        for (BankAccount ba : Accounts) {
            found = ba;// THIS - for loop
            if (ba.getAccountNumber() == AccountNumber) {
                return found;
            } else {
                found = null;
            }
        }
        return found;
    };
}

