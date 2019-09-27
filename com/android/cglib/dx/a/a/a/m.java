package com.android.cglib.dx.a.a.a;

import com.android.cglib.dx.a.a.f;
import com.android.cglib.dx.a.a.h;
import com.android.cglib.dx.c.c.p;
import java.util.BitSet;

public final class m
  extends com.android.cglib.dx.a.a.n
{
  public static final com.android.cglib.dx.a.a.n b = new m();
  
  public int a()
  {
    return 2;
  }
  
  public String a(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    p localp = (p)((f)paramh).b();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localn.b(0).k());
    localStringBuilder.append(", ");
    localStringBuilder.append(localn.b(1).k());
    localStringBuilder.append(", ");
    localStringBuilder.append(a(localp));
    return localStringBuilder.toString();
  }
  
  public void a(com.android.cglib.dx.d.a parama, h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    int i = ((p)((f)paramh).b()).g();
    a(parama, a(paramh, b(localn.b(0).e(), localn.b(1).e())), (short)i);
  }
  
  public String b(h paramh, boolean paramBoolean)
  {
    return a((p)((f)paramh).b(), 16);
  }
  
  public boolean b(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    if (((paramh instanceof f)) && (localn.a() == 2) && (b(localn.b(0).e())))
    {
      if (!b(localn.b(1).e())) {
        return false;
      }
      com.android.cglib.dx.c.c.a locala = ((f)paramh).b();
      if (!(locala instanceof p)) {
        return false;
      }
      p localp = (p)locala;
      return (localp.f()) && (e(localp.g()));
    }
    return false;
  }
  
  public BitSet c(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    BitSet localBitSet = new BitSet(2);
    localBitSet.set(0, b(localn.b(0).e()));
    localBitSet.set(1, b(localn.b(1).e()));
    return localBitSet;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */