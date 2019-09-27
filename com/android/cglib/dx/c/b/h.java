package com.android.cglib.dx.c.b;

import com.android.cglib.dx.c.c.v;

public class h
  implements Comparable<h>
{
  private final v a;
  private final v b;
  
  private static int a(v paramv1, v paramv2)
  {
    if (paramv1 == paramv2) {
      return 0;
    }
    if (paramv1 == null) {
      return -1;
    }
    if (paramv2 == null) {
      return 1;
    }
    return paramv1.a(paramv2);
  }
  
  public int a(h paramh)
  {
    int i = a(this.a, paramh.a);
    if (i != 0) {
      return i;
    }
    return a(this.b, paramh.b);
  }
  
  public v a()
  {
    return this.a;
  }
  
  public v b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof h)) {
      return false;
    }
    int i = a((h)paramObject);
    boolean bool = false;
    if (i == 0) {
      bool = true;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i;
    if (this.a == null) {
      i = 0;
    } else {
      i = this.a.hashCode();
    }
    int j = i * 31;
    int k;
    if (this.b == null) {
      k = 0;
    } else {
      k = this.b.hashCode();
    }
    return j + k;
  }
  
  public String toString()
  {
    if ((this.a != null) && (this.b == null)) {
      return this.a.f();
    }
    if ((this.a == null) && (this.b == null)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    String str1;
    if (this.a == null) {
      str1 = "";
    } else {
      str1 = this.a.f();
    }
    localStringBuilder.append(str1);
    localStringBuilder.append("|");
    String str2;
    if (this.b == null) {
      str2 = "";
    } else {
      str2 = this.b.f();
    }
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */