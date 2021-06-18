package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static  Integer max(Integer a, Integer b, Integer c) {
    a = a != null ? a : 0;
    b = b != null ? b : 0;
    c = c != null ? c : 0;
    Integer maximum = a;
    if (a > b && a > c) {
      maximum = a;
    }else if( b > c && b > a){
      maximum = b;
    } else if( c > a && c > b){
      maximum = c;
    }
    return maximum;
  }
}
