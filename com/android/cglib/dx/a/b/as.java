package com.android.cglib.dx.a.b;

import com.android.cglib.dx.d.a;
import java.util.Collection;
import java.util.Iterator;

public abstract class as
  extends ak
{
  public as(String paramString, l paraml, int paramInt)
  {
    super(paramString, paraml, paramInt);
  }
  
  public final int a(x paramx)
  {
    w localw = (w)paramx;
    return c(localw.g() * localw.b_());
  }
  
  protected final void a_(a parama)
  {
    l locall = e();
    int i = f();
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext())
    {
      ((x)localIterator.next()).a(locall, parama);
      parama.h(i);
    }
  }
  
  protected abstract void b();
  
  protected final void c()
  {
    l locall = e();
    b();
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext()) {
      ((x)localIterator.next()).a(locall);
    }
  }
  
  public final int c_()
  {
    Collection localCollection = a();
    int i = localCollection.size();
    if (i == 0) {
      return 0;
    }
    return i * ((x)localCollection.iterator().next()).b_();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\b\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */