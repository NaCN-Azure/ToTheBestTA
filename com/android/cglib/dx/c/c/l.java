package com.android.cglib.dx.c.c;

import com.android.cglib.dx.c.d.c;
import com.android.cglib.dx.d.i;

public final class l
  extends n
{
  public static final l a = a(-1);
  public static final l b = a(0);
  public static final l c = a(1);
  public static final l d = a(2);
  public static final l e = a(3);
  public static final l f = a(4);
  public static final l g = a(5);
  private static final l[] h = new l['ǿ'];
  
  private l(int paramInt)
  {
    super(paramInt);
  }
  
  public static l a(int paramInt)
  {
    int i = (0x7FFFFFFF & paramInt) % h.length;
    l locall1 = h[i];
    if ((locall1 != null) && (locall1.e_() == paramInt)) {
      return locall1;
    }
    l locall2 = new l(paramInt);
    h[i] = locall2;
    return locall2;
  }
  
  public String a_()
  {
    return Integer.toString(g());
  }
  
  public c b()
  {
    return c.f;
  }
  
  public String e()
  {
    return "int";
  }
  
  public int e_()
  {
    return g();
  }
  
  public String toString()
  {
    int i = g();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("int{0x");
    localStringBuilder.append(i.a(i));
    localStringBuilder.append(" / ");
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */