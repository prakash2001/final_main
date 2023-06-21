package com.webrestapi.webrestapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class ApiResponse {
    private String message = "Default-message";
    private int status = 200;
}
