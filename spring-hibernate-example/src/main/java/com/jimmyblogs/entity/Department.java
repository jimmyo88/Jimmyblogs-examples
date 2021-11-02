package com.jimmyblogs.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Department {

  @Id
  @GeneratedValue
  Integer id;

  String name;
  String code;
  Double budget;

  @OneToMany(mappedBy="department")
  private Set<Employee> employees;
}
