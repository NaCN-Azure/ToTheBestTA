package com.android.cglib.dx.c.c;

import com.android.cglib.dx.c.d.c;
import com.android.cglib.dx.d.i;

public final class u
  extends n
{
  public static final u a = a();
  
  private u(short paramShort)
  {
    super(paramShort);
  }
  
  public static u a(short paramShort)
  {
    return new u(paramShort);
  }
  
  public String a_()
  {
    return Integer.toString(g());
  }
  
  public c b()
  {
    return c.h;
  }
  
  public String e()
  {
    return "short";
  }
  
  public String toString()
  {
    int i = g();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("short{0x");
    localStringBuilder.append(i.c(i));
    localStringBuilder.append(" / ");
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */