package com.android.cglib.dx.a.b;

import com.android.cglib.dx.c.c.w;
import com.android.cglib.dx.d.a;
import com.android.cglib.dx.d.i;

public final class ap
  extends v
{
  public ap(w paramw)
  {
    super(paramw);
  }
  
  public y a()
  {
    return y.c;
  }
  
  public void a(l paraml)
  {
    paraml.g().a(e().g());
  }
  
  public void a(l paraml, a parama)
  {
    com.android.cglib.dx.c.c.v localv = e().g();
    int i = paraml.g().b(localv);
    if (parama.a())
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append(h());
      localStringBuilder1.append(' ');
      localStringBuilder1.append(localv.a_());
      parama.a(0, localStringBuilder1.toString());
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("  descriptor_idx: ");
      localStringBuilder2.append(i.a(i));
      parama.a(4, localStringBuilder2.toString());
    }
    parama.d(i);
  }
  
  public int b_()
  {
    return 4;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\b\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */