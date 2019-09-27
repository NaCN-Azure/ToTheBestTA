package com.androlua;

import dalvik.system.DexClassLoader;
import java.util.HashMap;

public class LuaDexClassLoader
  extends DexClassLoader
{
  private HashMap<String, Class<?>> a = new HashMap();
  private String b;
  
  public LuaDexClassLoader(String paramString1, String paramString2, String paramString3, ClassLoader paramClassLoader)
  {
    super(paramString1, paramString2, paramString3, paramClassLoader);
    this.b = paramString1;
  }
  
  protected Class<?> findClass(String paramString)
  {
    Class localClass = (Class)this.a.get(paramString);
    if (localClass == null)
    {
      localClass = super.findClass(paramString);
      this.a.put(paramString, localClass);
    }
    return localClass;
  }
  
  public String getDexPath()
  {
    return this.b;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaDexClassLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */