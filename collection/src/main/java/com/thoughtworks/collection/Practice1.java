package com.thoughtworks.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Practice1 {
  public static void main(String[] args) {
    System.out.println(getRandomNumber1());
  }

  /**
   * 生成10个0到20的随机整数，要求不能重复
   */
  public static Collection<Integer> getRandomNumber1() {
    Collection<Integer> randomNumbers = new HashSet<>();
    Random random = new Random();
    while (randomNumbers.size() < 10) {
      randomNumbers.add(random.nextInt(21));
    }
    return randomNumbers;
  }

  public static Collection<Integer> getRandomNumber2() {
    List<Integer> randomNumbers = new LinkedList<>();
    for (int i = 0; i < 21; i++) {
      randomNumbers.add(i);
    }
    Collections.shuffle(randomNumbers);
    return randomNumbers.subList(0, 10);
  }
}
