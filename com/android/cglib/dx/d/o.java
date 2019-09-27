package com.android.cglib.dx.d;

public class o
{
  private boolean a;
  
  public o()
  {
    this.a = true;
  }
  
  public o(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public void e()
  {
    this.a = false;
  }
  
  public final boolean f()
  {
    return true ^ this.a;
  }
  
  public final boolean g()
  {
    return this.a;
  }
  
  public final void h()
  {
    if (!this.a) {
      throw new p("immutable instance");
    }
  }
  
  public final void i()
  {
    if (this.a) {
      throw new p("mutable instance");
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */