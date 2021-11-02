package com.jimmyblogs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Client {
  @Id
  @GeneratedValue
  Integer id;

  String name;
  Double contractAmount;

  @OneToOne(mappedBy = "client")
  Employee employee;
}
