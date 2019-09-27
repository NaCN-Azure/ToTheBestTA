package com.android.cglib.dx.c.c;

import com.android.cglib.dx.c.d.c;
import com.android.cglib.dx.d.i;

public final class f
  extends n
{
  public static final f a = a();
  
  private f(byte paramByte)
  {
    super(paramByte);
  }
  
  public static f a(byte paramByte)
  {
    return new f(paramByte);
  }
  
  public String a_()
  {
    return Integer.toString(g());
  }
  
  public c b()
  {
    return c.b;
  }
  
  public String e()
  {
    return "byte";
  }
  
  public String toString()
  {
    int i = g();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("byte{0x");
    localStringBuilder.append(i.e(i));
    localStringBuilder.append(" / ");
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */