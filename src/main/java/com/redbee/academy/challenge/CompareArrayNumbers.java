package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer> listOfMax = new ArrayList<Integer>();
    List<Integer> listOfA = a;
    List<Integer> listOfB = b;
    Integer maxAB;

    while (!listOfA.isEmpty() && !listOfB.isEmpty()) {
      if (listOfA.get(0) > listOfB.get(0)) {
        maxAB = listOfA.get(0);
      } else {
        maxAB = listOfB.get(0);
      }

      listOfA.remove(listOfA.get(0));
      listOfB.remove(listOfB.get(0));
      listOfMax.add(maxAB);
    }

    listOfMax.addAll(listOfA);
    listOfMax.addAll(listOfB);

    return listOfMax;
  }
}
