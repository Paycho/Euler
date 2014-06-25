
package com.paycho.euler.utils.geometry;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Vector implements Set<Coordinate> {
  private final Set<Coordinate> vector = Sets.newHashSet();
  
  @Override
  public boolean add(Coordinate point) {
    return vector.add(point);
  }
  
  @Override
  public boolean addAll(Collection<? extends Coordinate> points) {
    return vector.addAll(points);
  }
  
  @Override
  public void clear() {
    vector.clear();
  }
  
  @Override
  public boolean contains(Object point) {
    return vector.contains(point);
  }
  
  @Override
  public boolean containsAll(Collection<?> points) {
    return vector.containsAll(points);
  }
  
  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Vector)) {
      return false;
    }
    Vector other = (Vector) obj;
    return ((other.size() == vector.size()) && (Iterables.elementsEqual(vector, other)));
  }
  
  @Override
  public int hashCode() {
    return vector.hashCode();
  }
  
  @Override
  public boolean isEmpty() {
    return vector.isEmpty();
  }
  
  @Override
  public Iterator<Coordinate> iterator() {
    return vector.iterator();
  }
  
  @Override
  public boolean remove(Object obj) {
    return vector.remove(obj);
  }
  
  @Override
  public boolean removeAll(Collection<?> points) {
    return vector.removeAll(points);
  }
  
  @Override
  public boolean retainAll(Collection<?> points) {
    return vector.retainAll(points);
  }
  
  @Override
  public int size() {
    return vector.size();
  }
  
  @Override
  public Object[] toArray() {
    return vector.toArray();
  }
  
  @Override
  public <T> T[] toArray(T[] a) {
    return vector.toArray(a);
  }

  public boolean add(Integer x, Integer y) {
    return add(new Coordinate(x, y));
  }
}
