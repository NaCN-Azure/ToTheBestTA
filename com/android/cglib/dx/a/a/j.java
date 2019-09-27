package com.android.cglib.dx.a.a;

import com.android.cglib.dx.b.b;
import com.android.cglib.dx.b.c;

public final class j
{
  private final int a;
  private final int b;
  private final int c;
  private final n d;
  private final boolean e;
  
  public j(int paramInt1, int paramInt2, int paramInt3, n paramn, boolean paramBoolean)
  {
    if (!c.a(paramInt1)) {
      throw new IllegalArgumentException("bogus opcode");
    }
    if (!c.a(paramInt2)) {
      throw new IllegalArgumentException("bogus family");
    }
    if (!c.a(paramInt3)) {
      throw new IllegalArgumentException("bogus nextOpcode");
    }
    if (paramn == null) {
      throw new NullPointerException("format == null");
    }
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramn;
    this.e = paramBoolean;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public n c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return this.e;
  }
  
  public String e()
  {
    return b.b(this.a);
  }
  
  public int f()
  {
    return this.c;
  }
  
  public j g()
  {
    switch (this.a)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("bogus opcode: ");
      localStringBuilder.append(this);
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 61: 
      return k.aj;
    case 60: 
      return k.ak;
    case 59: 
      return k.ah;
    case 58: 
      return k.ai;
    case 57: 
      return k.af;
    case 56: 
      return k.ag;
    case 55: 
      return k.ad;
    case 54: 
      return k.ae;
    case 53: 
      return k.ab;
    case 52: 
      return k.ac;
    case 51: 
      return k.Z;
    }
    return k.aa;
  }
  
  public String toString()
  {
    return e();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */