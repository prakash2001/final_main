package com.webrestapi.webrestapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class FormUpdateDetails {
    private int id;
    private String status;
}
