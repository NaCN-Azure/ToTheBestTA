package com.android.cglib.dx.a.a;

import com.android.cglib.dx.c.b.s;

public final class u
  extends com.android.cglib.dx.d.h
{
  public static final u a = new u(0);
  
  public u(int paramInt)
  {
    super(paramInt);
  }
  
  public static u a(i parami, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("bogus howMuch");
    case 2: 
    case 3: 
      s locals1 = s.a;
      int i = parami.a();
      a[] arrayOfa = new a[i];
      int j = 0;
      Object localObject = locals1;
      int k = 0;
      int m = 0;
      int n = 0;
      while (k < i)
      {
        h localh = parami.a(k);
        if ((localh instanceof e))
        {
          n = 1;
        }
        else
        {
          s locals2 = localh.h();
          if ((!locals2.equals(locals1)) && (!locals2.a((s)localObject)) && ((paramInt != 3) || (n != 0)))
          {
            arrayOfa[m] = new a(localh.f(), locals2);
            m++;
            localObject = locals2;
            n = 0;
          }
        }
        k++;
      }
      u localu = new u(m);
      while (j < m)
      {
        localu.a(j, arrayOfa[j]);
        j++;
      }
      localu.e();
      return localu;
    }
    return a;
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
  {
    private final int a;
    private final s b;
    
    public a(int paramInt, s params)
    {
      if (paramInt < 0) {
        throw new IllegalArgumentException("address < 0");
      }
      if (params == null) {
        throw new NullPointerException("position == null");
      }
      this.a = paramInt;
      this.b = params;
    }
    
    public int a()
    {
      return this.a;
    }
    
    public s b()
    {
      return this.b;
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */