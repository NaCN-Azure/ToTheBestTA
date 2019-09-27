package com.android.cglib.dx.a.b;

import com.android.cglib.dx.d.f;
import java.util.Collection;
import java.util.Iterator;

public abstract class ab
  extends as
{
  public ab(String paramString, l paraml)
  {
    super(paramString, paraml, 4);
  }
  
  protected void b()
  {
    if (a().size() > 65536)
    {
      String str;
      if ((this instanceof ae)) {
        str = "methods";
      } else {
        str = "fields";
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Too many ");
      localStringBuilder.append(str);
      localStringBuilder.append(": ");
      localStringBuilder.append(a().size());
      localStringBuilder.append("; max is ");
      localStringBuilder.append(65536);
      throw new f(localStringBuilder.toString());
    }
    Iterator localIterator = a().iterator();
    for (int i = 0; localIterator.hasNext(); i++) {
      ((aa)localIterator.next()).a(i);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\b\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */