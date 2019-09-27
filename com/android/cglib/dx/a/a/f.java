package com.android.cglib.dx.a.a;

import com.android.cglib.dx.c.b.n;
import com.android.cglib.dx.c.b.s;
import com.android.cglib.dx.c.c.a;

public final class f
  extends l
{
  private final a a;
  private int b;
  private int c;
  
  public f(j paramj, s params, n paramn, a parama)
  {
    super(paramj, params, paramn);
    if (parama == null) {
      throw new NullPointerException("constant == null");
    }
    this.a = parama;
    this.b = -1;
    this.c = -1;
  }
  
  public h a(j paramj)
  {
    f localf = new f(paramj, h(), i(), this.a);
    if (this.b >= 0) {
      localf.a(this.b);
    }
    if (this.c >= 0) {
      localf.b(this.c);
    }
    return localf;
  }
  
  public h a(n paramn)
  {
    f localf = new f(g(), h(), paramn, this.a);
    if (this.b >= 0) {
      localf.a(this.b);
    }
    if (this.c >= 0) {
      localf.b(this.c);
    }
    return localf;
  }
  
  protected String a()
  {
    return this.a.a_();
  }
  
  public void a(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("index < 0");
    }
    if (this.b >= 0) {
      throw new RuntimeException("index already set");
    }
    this.b = paramInt;
  }
  
  public a b()
  {
    return this.a;
  }
  
  public void b(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("index < 0");
    }
    if (this.c >= 0) {
      throw new RuntimeException("class index already set");
    }
    this.c = paramInt;
  }
  
  public int c()
  {
    if (this.b < 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("index not yet set for ");
      localStringBuilder.append(this.a);
      throw new RuntimeException(localStringBuilder.toString());
    }
    return this.b;
  }
  
  public boolean d()
  {
    return this.b >= 0;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */