package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Issue {
    private int id;
    private String autor;
    private String header;
    private String boody;
    private Boolean openClosed;
    private HashSet<String> lable;
    private HashSet<String> assignee;
}


