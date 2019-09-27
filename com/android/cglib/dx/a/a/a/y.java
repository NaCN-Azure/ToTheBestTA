package com.android.cglib.dx.a.a.a;

import com.android.cglib.dx.a.a.f;
import com.android.cglib.dx.a.a.h;
import com.android.cglib.dx.c.b.m;
import com.android.cglib.dx.c.c.o;
import com.android.cglib.dx.c.c.p;
import com.android.cglib.dx.d.a;
import java.util.BitSet;

public final class y
  extends com.android.cglib.dx.a.a.n
{
  public static final com.android.cglib.dx.a.a.n b = new y();
  
  public int a()
  {
    return 5;
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
  
  public void a(a parama, h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    long l = ((o)((f)paramh).b()).h();
    a(parama, a(paramh, localn.b(0).e()), l);
  }
  
  public String b(h paramh, boolean paramBoolean)
  {
    return a((p)((f)paramh).b(), 64);
  }
  
  public boolean b(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    if (((paramh instanceof f)) && (localn.a() == 1))
    {
      if (!d(localn.b(0).e())) {
        return false;
      }
      return ((f)paramh).b() instanceof o;
    }
    return false;
  }
  
  public BitSet c(h paramh)
  {
    com.android.cglib.dx.c.b.n localn = paramh.i();
    BitSet localBitSet = new BitSet(1);
    localBitSet.set(0, d(localn.b(0).e()));
    return localBitSet;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */