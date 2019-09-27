package com.android.cglib.dx.a.b;

import com.android.cglib.dx.c.c.c;
import com.android.cglib.dx.d.a;
import com.android.cglib.dx.d.d;

public final class m
  extends ag
{
  private final c a;
  private byte[] b;
  
  public m(c paramc)
  {
    super(1, -1);
    if (paramc == null) {
      throw new NullPointerException("array == null");
    }
    this.a = paramc;
    this.b = null;
  }
  
  protected int a(ag paramag)
  {
    m localm = (m)paramag;
    return this.a.a(localm.a);
  }
  
  public y a()
  {
    return y.q;
  }
  
  protected void a(ak paramak, int paramInt)
  {
    d locald = new d();
    new au(paramak.e(), locald).a(this.a, false);
    this.b = locald.f();
    a(this.b.length);
  }
  
  public void a(l paraml)
  {
    au.a(paraml, this.a);
  }
  
  protected void a_(l paraml, a parama)
  {
    if (parama.a())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(g());
      localStringBuilder.append(" encoded array");
      parama.a(0, localStringBuilder.toString());
      new au(paraml, parama).a(this.a, true);
      return;
    }
    parama.a(this.b);
  }
  
  public String b()
  {
    return this.a.a_();
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */