package com.android.cglib.dx.c.b;

import com.android.cglib.dx.c.c.a;

public abstract class d
  extends f
{
  private final a a;
  
  public d(p paramp, s params, m paramm, n paramn, a parama)
  {
    super(paramp, params, paramm, paramn);
    if (parama == null) {
      throw new NullPointerException("cst == null");
    }
    this.a = parama;
  }
  
  public String b()
  {
    return this.a.a_();
  }
  
  public a c()
  {
    return this.a;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */