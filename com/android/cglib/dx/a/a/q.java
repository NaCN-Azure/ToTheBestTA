package com.android.cglib.dx.a.a;

import com.android.cglib.dx.c.b.m;
import com.android.cglib.dx.c.b.n;
import com.android.cglib.dx.c.b.o;
import com.android.cglib.dx.c.b.s;

public final class q
  extends ab
{
  private final o a;
  
  public q(s params, o paramo)
  {
    super(params);
    if (paramo == null) {
      throw new NullPointerException("locals == null");
    }
    this.a = paramo;
  }
  
  public h a(n paramn)
  {
    return new q(h(), this.a);
  }
  
  protected String a()
  {
    return this.a.toString();
  }
  
  protected String a(boolean paramBoolean)
  {
    int i = this.a.b();
    int j = this.a.a();
    StringBuffer localStringBuffer = new StringBuffer(100 + i * 40);
    localStringBuffer.append("local-snapshot");
    for (int k = 0; k < j; k++)
    {
      m localm = this.a.a(k);
      if (localm != null)
      {
        localStringBuffer.append("\n  ");
        localStringBuffer.append(r.a(localm));
      }
    }
    return localStringBuffer.toString();
  }
  
  public o b()
  {
    return this.a;
  }
  
  public h d(int paramInt)
  {
    return new q(h(), this.a.b(paramInt));
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */