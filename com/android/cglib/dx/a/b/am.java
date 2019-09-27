package com.android.cglib.dx.a.b;

import com.android.cglib.dx.c.c.v;
import com.android.cglib.dx.d.a;
import com.android.cglib.dx.d.c;
import com.android.cglib.dx.d.i;
import com.android.cglib.dx.d.n;

public final class am
  extends ag
{
  private final v a;
  
  public am(v paramv)
  {
    super(1, a(paramv));
    this.a = paramv;
  }
  
  private static int a(v paramv)
  {
    return 1 + (n.a(paramv.j()) + paramv.i());
  }
  
  protected int a(ag paramag)
  {
    am localam = (am)paramag;
    return this.a.a(localam.a);
  }
  
  public y a()
  {
    return y.n;
  }
  
  public void a(l paraml) {}
  
  public void a_(l paraml, a parama)
  {
    c localc = this.a.h();
    int i = this.a.j();
    if (parama.a())
    {
      int j = n.a(i);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("utf16_size: ");
      localStringBuilder.append(i.a(i));
      parama.a(j, localStringBuilder.toString());
      parama.a(1 + localc.a(), this.a.f());
    }
    parama.e(i);
    parama.a(localc);
    parama.b(0);
  }
  
  public String b()
  {
    return this.a.f();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\b\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */