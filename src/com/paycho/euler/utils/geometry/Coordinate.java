
package com.paycho.euler.utils.geometry;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Coordinate implements Comparable {
  
  private final Integer x;
  private final Integer y;
  
  public Coordinate(Integer x, Integer y) {
    this.x = x;
    this.y = y;
  }
  
  public boolean equals(Coordinate other) {
    return (this.x.equals(other.x) && this.y.equals(other.y));
  }
  
  @Override
  public int compareTo(Object object) {
    if(!(object instanceof Coordinate)) {
      throw new IllegalArgumentException("Non-coordinate object passed to compareTo");
    }
    Coordinate other = (Coordinate) object;
    if(this.x < other.x) {
      return -1;
    }
    if(this.x > other.x) {
      return 1;
    }
    if(this.y < other.y) {
      return -1;
    }
    if(this.y > other.y) {
      return 1;
    }
    return 0;
  }
  
  @Override
  public int hashCode() {
    return x.hashCode() ^ y.hashCode();
  }
}
