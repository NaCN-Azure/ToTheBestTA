package com.android.cglib.dx.c.c;

import com.android.cglib.dx.c.d.c;

public final class e
  extends n
{
  public static final e a = new e(false);
  public static final e b = new e(true);
  
  private e(boolean paramBoolean)
  {
    super(paramBoolean);
  }
  
  public static e a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return b;
    }
    return a;
  }
  
  public String a_()
  {
    if (d_()) {
      return "true";
    }
    return "false";
  }
  
  public c b()
  {
    return c.a;
  }
  
  public boolean d_()
  {
    return g() != 0;
  }
  
  public String e()
  {
    return "boolean";
  }
  
  public String toString()
  {
    if (d_()) {
      return "boolean{true}";
    }
    return "boolean{false}";
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */