package com.android.cglib.dx.d;

import java.io.FilterWriter;
import java.io.Writer;

public final class j
  extends FilterWriter
{
  private final String a;
  private final int b;
  private final int c;
  private int d;
  private boolean e;
  private int f;
  
  public j(Writer paramWriter, int paramInt)
  {
    this(paramWriter, paramInt, "");
  }
  
  public j(Writer paramWriter, int paramInt, String paramString)
  {
    super(paramWriter);
    if (paramWriter == null) {
      throw new NullPointerException("out == null");
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("width < 0");
    }
    if (paramString == null) {
      throw new NullPointerException("prefix == null");
    }
    int i;
    if (paramInt != 0) {
      i = paramInt;
    } else {
      i = Integer.MAX_VALUE;
    }
    this.b = i;
    this.c = (paramInt >> 1);
    if (paramString.length() == 0) {
      paramString = null;
    }
    this.a = paramString;
    a();
  }
  
  private void a()
  {
    this.d = 0;
    boolean bool;
    if (this.c != 0) {
      bool = true;
    } else {
      bool = false;
    }
    this.e = bool;
    this.f = 0;
  }
  
  public void write(int paramInt)
  {
    synchronized (this.lock)
    {
      if (this.e) {
        if (paramInt == 32)
        {
          this.f = (1 + this.f);
          if (this.f >= this.c) {
            this.f = this.c;
          }
        }
        else
        {
          this.e = false;
        }
      }
      if ((this.d == this.b) && (paramInt != 10))
      {
        this.out.write(10);
        this.d = 0;
      }
      if (this.d == 0)
      {
        if (this.a != null) {
          this.out.write(this.a);
        }
        boolean bool = this.e;
        int i = 0;
        if (!bool)
        {
          while (i < this.f)
          {
            this.out.write(32);
            i++;
          }
          this.d = this.f;
        }
      }
      this.out.write(paramInt);
      if (paramInt == 10) {
        a();
      } else {
        this.d = (1 + this.d);
      }
      return;
    }
  }
  
  public void write(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject1 = this.lock;
    for (;;)
    {
      if (paramInt2 > 0) {}
      try
      {
        write(paramString.charAt(paramInt1));
        paramInt1++;
        paramInt2--;
      }
      finally
      {
        Object localObject2;
        for (;;) {}
      }
    }
    return;
    throw ((Throwable)localObject2);
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    Object localObject1 = this.lock;
    for (;;)
    {
      if (paramInt2 > 0) {}
      try
      {
        write(paramArrayOfChar[paramInt1]);
        paramInt1++;
        paramInt2--;
      }
      finally
      {
        Object localObject2;
        for (;;) {}
      }
    }
    return;
    throw ((Throwable)localObject2);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */