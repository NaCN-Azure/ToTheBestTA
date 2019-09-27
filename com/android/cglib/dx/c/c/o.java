package com.android.cglib.dx.c.c;

public abstract class o
  extends p
{
  private final long a;
  
  o(long paramLong)
  {
    this.a = paramLong;
  }
  
  protected int b(a parama)
  {
    long l = ((o)parama).a;
    if (this.a < l) {
      return -1;
    }
    if (this.a > l) {
      return 1;
    }
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return (paramObject != null) && (getClass() == paramObject.getClass()) && (this.a == ((o)paramObject).a);
  }
  
  public final boolean f()
  {
    return (int)this.a == this.a;
  }
  
  public final int g()
  {
    return (int)this.a;
  }
  
  public final long h()
  {
    return this.a;
  }
  
  public final int hashCode()
  {
    return (int)this.a ^ (int)(this.a >> 32);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */