package com.android.cglib.dx.a.a;

import com.android.cglib.dx.d.h;

public final class d
  extends h
  implements Comparable<d>
{
  public static final d a = new d(0);
  
  public d(int paramInt)
  {
    super(paramInt);
  }
  
  public int a(d paramd)
  {
    if (this == paramd) {
      return 0;
    }
    int i = a();
    int j = paramd.a();
    int k = Math.min(i, j);
    for (int m = 0; m < k; m++)
    {
      int n = a(m).a(paramd.a(m));
      if (n != 0) {
        return n;
      }
    }
    if (i < j) {
      return -1;
    }
    if (i > j) {
      return 1;
    }
    return 0;
  }
  
  public a a(int paramInt)
  {
    return (a)d(paramInt);
  }
  
  public void a(int paramInt, a parama)
  {
    a(paramInt, parama);
  }
  
  public static class a
    implements Comparable<a>
  {
    private final int a;
    private final int b;
    private final c c;
    
    public a(int paramInt1, int paramInt2, c paramc)
    {
      if (paramInt1 < 0) {
        throw new IllegalArgumentException("start < 0");
      }
      if (paramInt2 <= paramInt1) {
        throw new IllegalArgumentException("end <= start");
      }
      if (paramc.g()) {
        throw new IllegalArgumentException("handlers.isMutable()");
      }
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramc;
    }
    
    public int a()
    {
      return this.a;
    }
    
    public int a(a parama)
    {
      if (this.a < parama.a) {
        return -1;
      }
      if (this.a > parama.a) {
        return 1;
      }
      if (this.b < parama.b) {
        return -1;
      }
      if (this.b > parama.b) {
        return 1;
      }
      return this.c.a(parama.c);
    }
    
    public int b()
    {
      return this.b;
    }
    
    public c c()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      if (bool1)
      {
        int i = a((a)paramObject);
        bool2 = false;
        if (i == 0) {
          bool2 = true;
        }
      }
      return bool2;
    }
    
    public int hashCode()
    {
      return 31 * (31 * this.a + this.b) + this.c.hashCode();
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */