package com.android.cglib.dx.c.c;

import com.android.cglib.dx.c.d.c;
import com.android.cglib.dx.d.i;

public final class g
  extends n
{
  public static final g a = a('\000');
  
  private g(char paramChar)
  {
    super(paramChar);
  }
  
  public static g a(char paramChar)
  {
    return new g(paramChar);
  }
  
  public String a_()
  {
    return Integer.toString(g());
  }
  
  public c b()
  {
    return c.c;
  }
  
  public String e()
  {
    return "char";
  }
  
  public String toString()
  {
    int i = g();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("char{0x");
    localStringBuilder.append(i.c(i));
    localStringBuilder.append(" / ");
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */