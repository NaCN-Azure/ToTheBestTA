package com.android.cglib.dx.c.c;

import com.android.cglib.dx.c.d.c;
import com.android.cglib.dx.d.i;

public final class h
  extends o
{
  public static final h a = new h(Double.doubleToLongBits(0.0D));
  public static final h b = new h(Double.doubleToLongBits(1.0D));
  
  private h(long paramLong)
  {
    super(paramLong);
  }
  
  public static h a(long paramLong)
  {
    return new h(paramLong);
  }
  
  public String a_()
  {
    return Double.toString(Double.longBitsToDouble(h()));
  }
  
  public c b()
  {
    return c.d;
  }
  
  public String e()
  {
    return "double";
  }
  
  public String toString()
  {
    long l = h();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("double{0x");
    localStringBuilder.append(i.a(l));
    localStringBuilder.append(" / ");
    localStringBuilder.append(Double.longBitsToDouble(l));
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */