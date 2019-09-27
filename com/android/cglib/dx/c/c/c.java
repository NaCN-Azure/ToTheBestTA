package com.android.cglib.dx.c.c;

import com.android.cglib.dx.d.h;

public final class c
  extends a
{
  private final a a;
  
  public c(a parama)
  {
    if (parama == null) {
      throw new NullPointerException("list == null");
    }
    parama.i();
    this.a = parama;
  }
  
  public String a_()
  {
    return this.a.b("{", ", ", "}");
  }
  
  protected int b(a parama)
  {
    return this.a.a(((c)parama).a);
  }
  
  public a b()
  {
    return this.a;
  }
  
  public String e()
  {
    return "array";
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c)) {
      return false;
    }
    return this.a.equals(((c)paramObject).a);
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    return this.a.a("array{", ", ", "}");
  }
  
  public static final class a
    extends h
    implements Comparable<a>
  {
    public a(int paramInt)
    {
      super();
    }
    
    public int a(a parama)
    {
      int i = a();
      int j = parama.a();
      int k;
      if (i < j) {
        k = i;
      } else {
        k = j;
      }
      for (int m = 0; m < k; m++)
      {
        int n = ((a)d(m)).a((a)parama.d(m));
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
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */