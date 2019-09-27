package com.android.cglib.dx.a.a.a;

import com.android.cglib.dx.a.a.h;
import com.android.cglib.dx.a.a.z;
import com.android.cglib.dx.d.a;

public final class f
  extends com.android.cglib.dx.a.a.n
{
  public static final com.android.cglib.dx.a.a.n b = new f();
  
  public int a()
  {
    return 2;
  }
  
  public String a(h paramh)
  {
    return d(paramh);
  }
  
  public void a(a parama, h paramh)
  {
    int i = ((z)paramh).d();
    a(parama, a(paramh, 0), (short)i);
  }
  
  public boolean a(z paramz)
  {
    int i = paramz.d();
    return (i != 0) && (e(i));
  }
  
  public String b(h paramh, boolean paramBoolean)
  {
    return e(paramh);
  }
  
  public boolean b(h paramh)
  {
    if (((paramh instanceof z)) && (paramh.i().a() == 0))
    {
      z localz = (z)paramh;
      if (localz.o()) {
        return a(localz);
      }
      return true;
    }
    return false;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */