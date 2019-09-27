package com.android.cglib.dx.d;

public class m
  extends h
{
  private final k a;
  
  public m(int paramInt)
  {
    super(paramInt);
    this.a = new k(paramInt);
  }
  
  private void a(int paramInt)
  {
    this.a.a(paramInt, -1);
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i = this.a.a();
    for (int j = 0; j <= paramInt1 - i; j++) {
      this.a.b(-1);
    }
    this.a.a(paramInt1, paramInt2);
  }
  
  protected void a(int paramInt, l paraml)
  {
    l locall = (l)e(paramInt);
    a(paramInt, paraml);
    if (locall != null) {
      a(locall.a());
    }
    if (paraml != null) {
      a(paraml.a(), paramInt);
    }
  }
  
  public final int c(int paramInt)
  {
    if (paramInt >= this.a.a()) {
      return -1;
    }
    return this.a.a(paramInt);
  }
  
  public final int d()
  {
    for (int i = -1 + this.a.a(); (i >= 0) && (this.a.a(i) < 0); i--) {}
    int j = i + 1;
    this.a.c(j);
    return j;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */