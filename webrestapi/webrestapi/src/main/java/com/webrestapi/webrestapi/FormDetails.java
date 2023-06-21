package com.webrestapi.webrestapi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="simpleform")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FormDetails {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private String first_name;
    @Column
    private String phone_number;
    @Column
    private String gender;
    @Column
    private String email;
    @Column
    private String last_name;
    @Column
    private String percentange;
    @Column
    private String status = "pending";
    @Column
    private String scholar_type;
}
