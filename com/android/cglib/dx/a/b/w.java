package com.android.cglib.dx.a.b;

public abstract class w
  extends x
{
  private int a = -1;
  
  public final void a(int paramInt)
  {
    if (this.a != -1) {
      throw new RuntimeException("index already set");
    }
    this.a = paramInt;
  }
  
  public final boolean f()
  {
    return this.a >= 0;
  }
  
  public final int g()
  {
    if (this.a < 0) {
      throw new RuntimeException("index not yet set");
    }
    return this.a;
  }
  
  public final String h()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[');
    localStringBuilder.append(Integer.toHexString(this.a));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\b\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */