package com.android.cglib.dx.c.c;

import com.android.cglib.dx.c.d.b;
import com.android.cglib.dx.c.d.c;

public abstract class d
  extends r
{
  private final com.android.cglib.dx.c.d.a a = com.android.cglib.dx.c.d.a.a(h().c().g());
  private com.android.cglib.dx.c.d.a b = null;
  
  d(w paramw, t paramt)
  {
    super(paramw, paramt);
  }
  
  public final com.android.cglib.dx.c.d.a a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.a;
    }
    if (this.b == null)
    {
      c localc = g().f();
      this.b = this.a.a(localc);
    }
    return this.b;
  }
  
  protected final int b(a parama)
  {
    int i = super.b(parama);
    if (i != 0) {
      return i;
    }
    d locald = (d)parama;
    return this.a.a(locald.a);
  }
  
  public final int b(boolean paramBoolean)
  {
    return a(paramBoolean).c().b();
  }
  
  public final c b()
  {
    return this.a.b();
  }
  
  public final com.android.cglib.dx.c.d.a f()
  {
    return this.a;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */