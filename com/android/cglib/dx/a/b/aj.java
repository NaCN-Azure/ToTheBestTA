package com.android.cglib.dx.a.b;

import com.android.cglib.dx.d.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class aj
  extends as
{
  private final TreeMap<com.android.cglib.dx.c.d.a, ai> a = new TreeMap();
  
  public aj(l paraml)
  {
    super("proto_ids", paraml, 4);
  }
  
  public ai a(com.android.cglib.dx.c.d.a parama)
  {
    if (parama == null) {
      throw new NullPointerException("prototype == null");
    }
    j();
    ai localai = (ai)this.a.get(parama);
    if (localai == null)
    {
      localai = new ai(parama);
      this.a.put(parama, localai);
    }
    return localai;
  }
  
  public Collection<? extends x> a()
  {
    return this.a.values();
  }
  
  public int b(com.android.cglib.dx.c.d.a parama)
  {
    if (parama == null) {
      throw new NullPointerException("prototype == null");
    }
    i();
    ai localai = (ai)this.a.get(parama);
    if (localai == null) {
      throw new IllegalArgumentException("not found");
    }
    return localai.g();
  }
  
  protected void b()
  {
    Iterator localIterator = a().iterator();
    for (int i = 0; localIterator.hasNext(); i++) {
      ((ai)localIterator.next()).a(i);
    }
  }
  
  public void b(com.android.cglib.dx.d.a parama)
  {
    i();
    int i = this.a.size();
    int j;
    if (i == 0) {
      j = 0;
    } else {
      j = g();
    }
    if (i > 65536) {
      throw new UnsupportedOperationException("too many proto ids");
    }
    if (parama.a())
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("proto_ids_size:  ");
      localStringBuilder1.append(i.a(i));
      parama.a(4, localStringBuilder1.toString());
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("proto_ids_off:   ");
      localStringBuilder2.append(i.a(j));
      parama.a(4, localStringBuilder2.toString());
    }
    parama.d(i);
    parama.d(j);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\b\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */