package com.android.cglib.dx.c.a;

import com.android.cglib.dx.c.c.a;
import com.android.cglib.dx.c.c.v;

public final class d
  implements Comparable<d>
{
  private final v a;
  private final a b;
  
  public int a(d paramd)
  {
    int i = this.a.a(paramd.a);
    if (i != 0) {
      return i;
    }
    return this.b.a(paramd.b);
  }
  
  public v a()
  {
    return this.a;
  }
  
  public a b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d)) {
      return false;
    }
    d locald = (d)paramObject;
    boolean bool1 = this.a.equals(locald.a);
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = this.b.equals(locald.b);
      bool2 = false;
      if (bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    return 31 * this.a.hashCode() + this.b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a.a_());
    localStringBuilder.append(":");
    localStringBuilder.append(this.b);
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */