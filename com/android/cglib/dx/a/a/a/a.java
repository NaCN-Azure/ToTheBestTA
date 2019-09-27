package com.android.cglib.dx.a.a.a;

import com.android.cglib.dx.a.a.h;
import com.android.cglib.dx.a.a.z;

public final class a
  extends com.android.cglib.dx.a.a.n
{
  public static final com.android.cglib.dx.a.a.n b = new a();
  
  public int a()
  {
    return 1;
  }
  
  public String a(h paramh)
  {
    return d(paramh);
  }
  
  public void a(com.android.cglib.dx.d.a parama, h paramh)
  {
    a(parama, a(paramh, 0xFF & ((z)paramh).d()));
  }
  
  public boolean a(z paramz)
  {
    int i = paramz.d();
    return (i != 0) && (c(i));
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


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */