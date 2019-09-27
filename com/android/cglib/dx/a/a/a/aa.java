package com.android.cglib.dx.a.a.a;

import com.android.cglib.dx.a.a.f;
import com.android.cglib.dx.a.a.h;
import com.android.cglib.dx.c.b.m;
import com.android.cglib.dx.c.c.s;
import com.android.cglib.dx.c.c.w;

public final class aa
  extends com.android.cglib.dx.a.a.n
{
  public static final com.android.cglib.dx.a.a.n b = new aa();
  
  public int a()
  {
    return 5;
  }
  
  public String a(h paramh)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b(paramh.i()));
    localStringBuilder.append(", ");
    localStringBuilder.append(f(paramh));
    return localStringBuilder.toString();
  }
  
  public void a(com.android.cglib.dx.d.a parama, h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    int i = ((f)paramh).c();
    int j;
    if (localn.a() == 0) {
      j = 0;
    } else {
      j = localn.b(0).e();
    }
    int k = localn.b();
    a(parama, h(paramh), i, (short)k, (short)j);
  }
  
  public String b(h paramh, boolean paramBoolean)
  {
    if (paramBoolean) {
      return g(paramh);
    }
    return "";
  }
  
  public boolean b(h paramh)
  {
    if (!a) {
      return false;
    }
    if (!(paramh instanceof f)) {
      return false;
    }
    f localf = (f)paramh;
    com.android.cglib.dx.c.c.a locala = localf.b();
    if ((!(locala instanceof s)) && (!(locala instanceof w))) {
      return false;
    }
    com.android.cglib.dx.c.b.n localn = localf.i();
    localn.a();
    boolean bool1;
    if (localn.a() != 0)
    {
      boolean bool2 = c(localn);
      bool1 = false;
      if (bool2)
      {
        boolean bool3 = f(localn.b(0).e());
        bool1 = false;
        if (bool3)
        {
          boolean bool4 = f(localn.b());
          bool1 = false;
          if (!bool4) {}
        }
      }
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\a\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */