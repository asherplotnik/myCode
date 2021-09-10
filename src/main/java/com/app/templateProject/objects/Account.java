package com.app.templateProject.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class Account {

    final Integer id;
    final String accountName;
    final LocalDate validityDate;

}
