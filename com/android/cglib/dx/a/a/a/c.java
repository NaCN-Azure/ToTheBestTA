package com.android.cglib.dx.a.a.a;

import com.android.cglib.dx.a.a.f;
import com.android.cglib.dx.a.a.h;
import com.android.cglib.dx.c.b.m;
import com.android.cglib.dx.c.c.p;
import java.util.BitSet;

public final class c
  extends com.android.cglib.dx.a.a.n
{
  public static final com.android.cglib.dx.a.a.n b = new c();
  
  public int a()
  {
    return 1;
  }
  
  public String a(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    p localp = (p)((f)paramh).b();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localn.b(0).k());
    localStringBuilder.append(", ");
    localStringBuilder.append(a(localp));
    return localStringBuilder.toString();
  }
  
  public void a(com.android.cglib.dx.d.a parama, h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    int i = ((p)((f)paramh).b()).g();
    a(parama, a(paramh, b(localn.b(0).e(), i & 0xF)));
  }
  
  public String b(h paramh, boolean paramBoolean)
  {
    return a((p)((f)paramh).b(), 4);
  }
  
  public boolean b(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    boolean bool1 = paramh instanceof f;
    boolean bool2 = false;
    if (bool1)
    {
      int i = localn.a();
      bool2 = false;
      if (i == 1)
      {
        if (!b(localn.b(0).e())) {
          return false;
        }
        com.android.cglib.dx.c.c.a locala = ((f)paramh).b();
        if (!(locala instanceof p)) {
          return false;
        }
        p localp = (p)locala;
        boolean bool3 = localp.f();
        bool2 = false;
        if (bool3)
        {
          boolean bool4 = a(localp.g());
          bool2 = false;
          if (bool4) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public BitSet c(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    BitSet localBitSet = new BitSet(1);
    localBitSet.set(0, b(localn.b(0).e()));
    return localBitSet;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */