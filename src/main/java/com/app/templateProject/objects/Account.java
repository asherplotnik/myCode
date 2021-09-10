package com.app.templateProject.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Account {

    final Integer id;
    final String accountName;
    final double limit;

}
