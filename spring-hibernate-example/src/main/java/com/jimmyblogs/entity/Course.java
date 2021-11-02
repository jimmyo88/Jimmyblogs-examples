package com.jimmyblogs.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Course {

  @Id
  @GeneratedValue
  Integer id;

  String name;
  Integer duration;

  @ManyToMany(mappedBy = "courses")
  Set<Employee> employees;
}
