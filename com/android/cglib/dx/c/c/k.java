package com.android.cglib.dx.c.c;

import com.android.cglib.dx.c.d.c;
import com.android.cglib.dx.d.i;

public final class k
  extends n
{
  public static final k a = a(Float.floatToIntBits(0.0F));
  public static final k b = a(Float.floatToIntBits(1.0F));
  public static final k c = a(Float.floatToIntBits(2.0F));
  
  private k(int paramInt)
  {
    super(paramInt);
  }
  
  public static k a(int paramInt)
  {
    return new k(paramInt);
  }
  
  public String a_()
  {
    return Float.toString(Float.intBitsToFloat(g()));
  }
  
  public c b()
  {
    return c.e;
  }
  
  public String e()
  {
    return "float";
  }
  
  public String toString()
  {
    int i = g();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("float{0x");
    localStringBuilder.append(i.a(i));
    localStringBuilder.append(" / ");
    localStringBuilder.append(Float.intBitsToFloat(i));
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */