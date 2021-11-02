package com.jimmyblogs.entity;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Employee {
  @Id
  @GeneratedValue
  Integer id;

  String name;
  Double salary;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "client_id", referencedColumnName = "id")
  Client client;

  @ManyToOne
  @JoinColumn(name="department_id", nullable=false)
  Department department;

  @ManyToMany(cascade = { CascadeType.ALL })
  @JoinTable(
      name = "employee_course",
      joinColumns = { @JoinColumn(name = "employee_id") },
      inverseJoinColumns = { @JoinColumn(name = "course_id") }
  )
  Set<Course> courses;
}
