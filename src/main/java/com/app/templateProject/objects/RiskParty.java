package com.app.templateProject.objects;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class RiskParty {

    private final Integer id;
    private final String name;
    private List<Client> clients;

    public void addClient(Client client){
        if (clients == null){
            clients = new ArrayList<>();
        }
        clients.add(client);
    }

}
