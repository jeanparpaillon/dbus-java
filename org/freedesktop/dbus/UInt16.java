package org.freedesktop.dbus;

/**
 * Class to represent 16-bit unsigned integers.
 */
@SuppressWarnings("serial")
public class UInt16 extends Number implements Comparable<UInt16>
{
   /** Maximum possible value. */
   public static final int MAX_VALUE = 65536;
   /** Minimum possible value. */
   public static final int MIN_VALUE = 0;
   private int value;
   /** Create a UInt16 from an int.
    * @param value Must be within MIN_VALUE&ndash;MAX_VALUE 
    * @throws NumberFormatException if value is not between MIN_VALUE and MAX_VALUE
    */
   public UInt16(int value)
   {
      if (value < MIN_VALUE || value > MAX_VALUE)
         throw new NumberFormatException(value +" is not between "+ MIN_VALUE +" and "+ MAX_VALUE);
      this.value = value;
   }
   /** Create a UInt16 from a String.
    * @param value Must parse to a valid integer within MIN_VALUE&ndash;MAX_VALUE 
    * @throws NumberFormatException if value is not an integer between MIN_VALUE and MAX_VALUE
    */
   public UInt16(String value)
   {
      this(Integer.parseInt(value));
   }
   /** The value of this as a byte. */
   public byte byteValue() { return (byte) value; }
   /** The value of this as a double. */
   public double doubleValue() { return (double) value; }
   /** The value of this as a float. */
   public float floatValue() { return (float) value; }
   /** The value of this as a int. */
   public int intValue() { return (int) value; }
   /** The value of this as a long. */
   public long longValue() { return (long) value; }
   /** The value of this as a short. */
   public short shortValue(){ return (short) value; }
   /** Test two UInt16s for equality. */
   public boolean equals(Object o)
   {
      return o instanceof UInt16 && ((UInt16) o).value == this.value;
   }
   public int hashCode()
   {
      return (int) value;
   }
   /** Compare two UInt16s. 
    * @return 0 if equal, -ve or +ve if they are different. 
    */
   public int compareTo(UInt16 other)
   {
      return (int) (this.value - other.value);
   }
   /** The value of this as a string. */
   public String toString()
   {
      return ""+value;
   }
}
