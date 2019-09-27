package bsh;

import java.io.Serializable;
import java.util.Hashtable;

public class Modifiers
  implements Serializable
{
  public static final int CLASS = 0;
  public static final int FIELD = 2;
  public static final int METHOD = 1;
  Hashtable a;
  
  private void a()
  {
    a("volatile", "Method");
    a("transient", "Method");
  }
  
  private void a(String paramString1, String paramString2)
  {
    if (hasModifier(paramString1))
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(paramString2);
      localStringBuffer.append(" cannot be declared '");
      localStringBuffer.append(paramString1);
      localStringBuffer.append("'");
      throw new IllegalStateException(localStringBuffer.toString());
    }
  }
  
  private void b()
  {
    a("synchronized", "Variable");
    a("native", "Variable");
    a("abstract", "Variable");
  }
  
  private void c()
  {
    a();
    a("native", "Class");
    a("synchronized", "Class");
  }
  
  public void addModifier(int paramInt, String paramString)
  {
    if (this.a == null) {
      this.a = new Hashtable();
    }
    if (this.a.put(paramString, Void.TYPE) != null)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("Duplicate modifier: ");
      localStringBuffer.append(paramString);
      throw new IllegalStateException(localStringBuffer.toString());
    }
    boolean bool = hasModifier("private");
    int i = 0;
    if (bool) {
      i = 1;
    }
    if (hasModifier("protected")) {
      i++;
    }
    if (hasModifier("public")) {
      i++;
    }
    if (i > 1) {
      throw new IllegalStateException("public/private/protected cannot be used in combination.");
    }
    switch (paramInt)
    {
    default: 
      return;
    case 2: 
      b();
      return;
    case 1: 
      a();
      return;
    }
    c();
  }
  
  public boolean hasModifier(String paramString)
  {
    if (this.a == null) {
      this.a = new Hashtable();
    }
    return this.a.get(paramString) != null;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("Modifiers: ");
    localStringBuffer.append(this.a);
    return localStringBuffer.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\Modifiers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */