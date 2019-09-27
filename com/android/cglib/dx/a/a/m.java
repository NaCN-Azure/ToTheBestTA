package com.android.cglib.dx.a.a;

import com.android.cglib.dx.c.b.n;
import com.android.cglib.dx.c.b.s;
import com.android.cglib.dx.d.a;

public final class m
  extends aa
{
  private x[] a;
  
  public m(s params, n paramn)
  {
    super(params, paramn);
    if (paramn.a() == 0) {
      throw new IllegalArgumentException("registers.size() == 0");
    }
    this.a = null;
  }
  
  private static x a(com.android.cglib.dx.c.b.m paramm, int paramInt)
  {
    return h.a(s.a, com.android.cglib.dx.c.b.m.a(paramInt, paramm.b()), paramm);
  }
  
  private void b()
  {
    if (this.a != null) {
      return;
    }
    n localn = i();
    int i = localn.a();
    this.a = new x[i];
    int j = 0;
    int k = 0;
    while (j < i)
    {
      com.android.cglib.dx.c.b.m localm = localn.b(j);
      this.a[j] = a(localm, k);
      k += localm.i();
      j++;
    }
  }
  
  public h a(n paramn)
  {
    return new m(h(), paramn);
  }
  
  protected String a()
  {
    return null;
  }
  
  protected String a(boolean paramBoolean)
  {
    n localn = i();
    int i = localn.a();
    StringBuffer localStringBuffer = new StringBuffer(100);
    int j = 0;
    int k = 0;
    while (j < i)
    {
      com.android.cglib.dx.c.b.m localm = localn.b(j);
      x localx = a(localm, k);
      if (j != 0) {
        localStringBuffer.append('\n');
      }
      localStringBuffer.append(localx.a(paramBoolean));
      k += localm.i();
      j++;
    }
    return localStringBuffer.toString();
  }
  
  public void a(a parama)
  {
    b();
    x[] arrayOfx = this.a;
    int i = arrayOfx.length;
    for (int j = 0; j < i; j++) {
      arrayOfx[j].a(parama);
    }
  }
  
  public int n()
  {
    b();
    x[] arrayOfx = this.a;
    int i = arrayOfx.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += arrayOfx[j].n();
      j++;
    }
    return k;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */