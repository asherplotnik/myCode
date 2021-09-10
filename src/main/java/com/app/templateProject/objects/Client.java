package com.app.templateProject.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Client {

    final private Integer id;
    final private String name;
    private List<Account> accounts;

    public void addAccount(Account account){
        if (accounts == null){
            accounts = new ArrayList<>();
        }
        accounts.add(account);
    }
}
