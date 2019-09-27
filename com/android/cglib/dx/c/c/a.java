package com.android.cglib.dx.c.c;

import com.android.cglib.dx.d.r;

public abstract class a
  implements r, Comparable<a>
{
  public final int a(a parama)
  {
    Class localClass1 = getClass();
    Class localClass2 = parama.getClass();
    if (localClass1 != localClass2) {
      return localClass1.getName().compareTo(localClass2.getName());
    }
    return b(parama);
  }
  
  protected abstract int b(a parama);
  
  public abstract String e();
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */