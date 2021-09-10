package com.app.templateProject;

import com.app.templateProject.objects.Account;
import com.app.templateProject.objects.Client;
import com.app.templateProject.objects.RiskParty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class TemplateProjectApplication {

	public static void main(String[] args) {
			SpringApplication.run(TemplateProjectApplication.class, args);

			Account acc1 = new Account(1,"acc1", LocalDate.of(2020,1,1));
			Account acc2 = new Account(2,"acc2",LocalDate.of(2020,1,1));
			Account acc3 = new Account(3,"acc3",LocalDate.of(2021,1,1));
			Account acc4 = new Account(4,"acc4",LocalDate.of(2021,1,1));
			Client client1 = new Client(1, "client1", new ArrayList<Account>(List.of(acc1, acc2)));
			Client client2 = new Client(2, "client2", new ArrayList<Account>(List.of(acc3)));
			Client client3 = new Client(3, "client3", new ArrayList<Account>(List.of(acc4)));
			RiskParty party1 = new RiskParty(1,"party1",new ArrayList<>(List.of(client1,client2)));
			RiskParty party2 = new RiskParty(2,"party2",new ArrayList<>(List.of(client3)));
			List<RiskParty> list =  new ArrayList<>(List.of(party1,party2));
			List<Client> listOfClients = list.stream().flatMap(party-> party.getClients().stream()).collect(Collectors.toList());
			List<Account> listOfAccounts = listOfClients.stream().flatMap(client-> client.getAccounts().stream()).collect(Collectors.toList());
		    Optional<Account> maxLimitAccount =
					listOfAccounts.stream().max((a,b)->(a.getValidityDate().isAfter(b.getValidityDate()) ? 1 : a.getValidityDate().isEqual(b.getValidityDate())? 0 : -1));
			List<Account> filteredList = listOfAccounts.stream().filter(account->account.getValidityDate()==maxLimitAccount.get().getValidityDate()).collect(Collectors.toList());
			System.out.println(filteredList);
	}

}
