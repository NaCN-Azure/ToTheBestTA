package com.android.cglib.dx.a.a;

import com.android.cglib.dx.c.b.m;
import com.android.cglib.dx.c.b.n;
import com.android.cglib.dx.c.b.s;

public final class o
  extends ab
{
  private final m a;
  
  public o(s params, m paramm)
  {
    super(params);
    if (paramm == null) {
      throw new NullPointerException("local == null");
    }
    this.a = paramm;
  }
  
  public h a(n paramn)
  {
    return new o(h(), this.a);
  }
  
  protected String a()
  {
    return this.a.toString();
  }
  
  protected String a(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("local-end ");
    localStringBuilder.append(r.a(this.a));
    return localStringBuilder.toString();
  }
  
  public m b()
  {
    return this.a;
  }
  
  public h d(int paramInt)
  {
    return new o(h(), this.a.c(paramInt));
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */