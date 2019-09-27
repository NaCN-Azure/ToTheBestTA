package com.android.cglib.dx.a.a;

import com.android.cglib.dx.c.b.b;
import com.android.cglib.dx.c.b.c;
import com.android.cglib.dx.c.b.f;
import com.android.cglib.dx.c.b.g;
import com.android.cglib.dx.c.b.q;
import com.android.cglib.dx.c.b.s;

public final class a
{
  private final e[] a;
  private final e[] b;
  private final e[] c;
  
  public a(q paramq)
  {
    int i = paramq.a().d();
    this.a = new e[i];
    this.b = new e[i];
    this.c = new e[i];
    a(paramq);
  }
  
  private void a(q paramq)
  {
    c localc = paramq.a();
    int i = localc.a();
    for (int j = 0; j < i; j++)
    {
      b localb = localc.a(j);
      int k = localb.a();
      f localf = localb.b().a(0);
      this.a[k] = new e(localf.e());
      s locals = localb.f().e();
      this.b[k] = new e(locals);
      this.c[k] = new e(locals);
    }
  }
  
  public e a(int paramInt)
  {
    return this.a[paramInt];
  }
  
  public e a(b paramb)
  {
    return this.a[paramb.a()];
  }
  
  public e b(b paramb)
  {
    return this.b[paramb.a()];
  }
  
  public e c(b paramb)
  {
    return this.c[paramb.a()];
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */