package com.android.cglib.dx.a.a.a;

import com.android.cglib.dx.a.a.h;
import com.android.cglib.dx.a.a.x;
import com.android.cglib.dx.c.b.m;
import com.android.cglib.dx.d.a;
import java.util.BitSet;

public final class o
  extends com.android.cglib.dx.a.a.n
{
  public static final com.android.cglib.dx.a.a.n b = new o();
  
  public int a()
  {
    return 2;
  }
  
  public String a(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localn.b(0).k());
    localStringBuilder.append(", ");
    localStringBuilder.append(localn.b(1).k());
    return localStringBuilder.toString();
  }
  
  public void a(a parama, h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    a(parama, a(paramh, localn.b(0).e()), (short)localn.b(1).e());
  }
  
  public String b(h paramh, boolean paramBoolean)
  {
    return "";
  }
  
  public boolean b(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    return ((paramh instanceof x)) && (localn.a() == 2) && (d(localn.b(0).e())) && (f(localn.b(1).e()));
  }
  
  public BitSet c(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    BitSet localBitSet = new BitSet(2);
    localBitSet.set(0, d(localn.b(0).e()));
    localBitSet.set(1, f(localn.b(1).e()));
    return localBitSet;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */