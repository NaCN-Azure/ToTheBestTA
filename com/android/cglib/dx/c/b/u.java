package com.android.cglib.dx.c.b;

import com.android.cglib.dx.c.d.c;
import com.android.cglib.dx.c.d.e;

public final class u
  extends f
{
  private final e a;
  
  public u(p paramp, s params, n paramn, e parame)
  {
    super(paramp, params, null, paramn);
    if (paramp.b() != 6) {
      throw new IllegalArgumentException("bogus branchingness");
    }
    if (parame == null) {
      throw new NullPointerException("catches == null");
    }
    this.a = parame;
  }
  
  public static String a(e parame)
  {
    StringBuffer localStringBuffer = new StringBuffer(100);
    localStringBuffer.append("catch");
    int i = parame.a();
    for (int j = 0; j < i; j++)
    {
      localStringBuffer.append(" ");
      localStringBuffer.append(parame.a(j).a_());
    }
    return localStringBuffer.toString();
  }
  
  public void a(f.b paramb)
  {
    paramb.a(this);
  }
  
  public String b()
  {
    return a(this.a);
  }
  
  public e i()
  {
    return this.a;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */