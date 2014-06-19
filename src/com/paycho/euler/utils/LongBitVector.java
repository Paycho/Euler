
package com.paycho.euler.utils;

import com.google.inject.Inject;

/**
 * BROKEN: DO NOT USE
 * @author Paycho <paycho@paycho.org>
 */
public class LongBitVector {
  
  private byte data[];
  private final long length;
  
  private class Location {
    private final byte block;
    private final byte mask;
    private final int index;
    
    private Location(long location) {
      index = (int) (location >> 4);
      block = data[index];
      mask = (byte) (1 << ((location >> 1) & 7));
    }
    
    private boolean isSet() {
      return ((block & mask) != 0);
    }
    
    private void set() {
      data[index] = (byte) (block | mask);
    }
    
    private void unset() {
      data[index] = (byte) (block & ~mask);
    }
    
    private void toggle() {
      data[index] = (byte) (block ^ mask);
    }
  }
  
  @Inject
  public LongBitVector(long capacity) {
    this.length = capacity;
    int backingStorage = (int) capacity >> 4;
    if (backingStorage < 256) {
      backingStorage = 256;
    }
    data = new byte[backingStorage];
    throw new RuntimeException("OH GOD NO");
  }
  
  public boolean get(long index) {
    return new Location(index).isSet();
  }
  
  public void set(long index) {
    new Location(index).set();
  }
  
  public void unset(long index) {
    new Location(index).unset();
  }
  
  public void flip(long index) {
    new Location(index).toggle();
  }
  
  public long length() {
    return this.length;
  }
  
  public boolean getBit(long i) {
		byte block = data[(int) (i >> 4)];
		byte mask = (byte) (1 << ((i >> 1) & 7));

		return ((block & mask) != 0);
	}
  
  public void setBit(long i) {
		int index = (int) (i >> 4);
		byte block = data[index];
		byte mask = (byte) (1 << ((i >> 1) & 7));

		data[index] = (byte) (block | mask);
	}
}
