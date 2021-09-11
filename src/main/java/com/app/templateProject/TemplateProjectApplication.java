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
	}

}
