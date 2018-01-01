package com.atoumi.spring.jwt.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author Created by ahmed.ettoumi@gmail.com
 * @since 01/01/18.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Foo findById(
    @PathVariable
      long id) {
    return new Foo(randomNumeric(20), randomAlphabetic(26));
  }

  private char randomAlphabetic(int i) {
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    return upper.charAt(new Random().nextInt(i));
  }

  private long randomNumeric(int i) {
    return new Random().nextInt(i);
  }

  public static class Foo {
    private long id;
    private String name;

    public Foo(long id, char name) {
      this.id = id;
      this.name = "" + name;
    }

    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
