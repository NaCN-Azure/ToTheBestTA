package com.android.cglib.dx.c.a;

import com.android.cglib.dx.c.c.w;
import com.android.cglib.dx.d.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class c
  extends o
  implements Comparable<c>
{
  public static final c a = new c();
  private final TreeMap<w, a> b = new TreeMap();
  
  static
  {
    a.e();
  }
  
  public int a(c paramc)
  {
    Iterator localIterator1 = this.b.values().iterator();
    Iterator localIterator2 = paramc.b.values().iterator();
    while ((localIterator1.hasNext()) && (localIterator2.hasNext()))
    {
      int i = ((a)localIterator1.next()).a((a)localIterator2.next());
      if (i != 0) {
        return i;
      }
    }
    if (localIterator1.hasNext()) {
      return 1;
    }
    if (localIterator2.hasNext()) {
      return -1;
    }
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c)) {
      return false;
    }
    c localc = (c)paramObject;
    return this.b.equals(localc.b);
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("annotations{");
    Iterator localIterator = this.b.values().iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (i != 0) {
        i = 0;
      } else {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(locala.a_());
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */