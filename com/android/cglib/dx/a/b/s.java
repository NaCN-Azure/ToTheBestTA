package com.android.cglib.dx.a.b;

import com.android.cglib.dx.c.c.j;
import com.android.cglib.dx.d.i;
import java.util.Collection;
import java.util.TreeMap;

public final class s
  extends ab
{
  private final TreeMap<j, r> a = new TreeMap();
  
  public s(l paraml)
  {
    super("field_ids", paraml);
  }
  
  public r a(j paramj)
  {
    if (paramj == null) {
      throw new NullPointerException("field == null");
    }
    j();
    r localr = (r)this.a.get(paramj);
    if (localr == null)
    {
      localr = new r(paramj);
      this.a.put(paramj, localr);
    }
    return localr;
  }
  
  public w a(com.android.cglib.dx.c.c.a parama)
  {
    if (parama == null) {
      throw new NullPointerException("cst == null");
    }
    i();
    w localw = (w)this.a.get((j)parama);
    if (localw == null) {
      throw new IllegalArgumentException("not found");
    }
    return localw;
  }
  
  public Collection<? extends x> a()
  {
    return this.a.values();
  }
  
  public void a(com.android.cglib.dx.d.a parama)
  {
    i();
    int i = this.a.size();
    int j;
    if (i == 0) {
      j = 0;
    } else {
      j = g();
    }
    if (parama.a())
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("field_ids_size:  ");
      localStringBuilder1.append(i.a(i));
      parama.a(4, localStringBuilder1.toString());
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("field_ids_off:   ");
      localStringBuilder2.append(i.a(j));
      parama.a(4, localStringBuilder2.toString());
    }
    parama.d(i);
    parama.d(j);
  }
  
  public int b(j paramj)
  {
    if (paramj == null) {
      throw new NullPointerException("ref == null");
    }
    i();
    r localr = (r)this.a.get(paramj);
    if (localr == null) {
      throw new IllegalArgumentException("not found");
    }
    return localr.g();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */