package com.android.cglib.proxy;

import java.lang.reflect.Method;

public class MethodProxy
{
  private Class a;
  private String b;
  private Class[] c;
  
  public MethodProxy(Class paramClass, String paramString, Class[] paramArrayOfClass)
  {
    this.a = paramClass;
    this.b = paramString;
    this.c = paramArrayOfClass;
  }
  
  public String getMethodName()
  {
    return this.b;
  }
  
  public Method getOriginalMethod()
  {
    try
    {
      Method localMethod = this.a.getMethod(this.b, this.c);
      return localMethod;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new ProxyException(localNoSuchMethodException.getMessage());
    }
  }
  
  public Method getProxyMethod()
  {
    try
    {
      Class localClass = this.a;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.b);
      localStringBuilder.append("_Super");
      Method localMethod = localClass.getMethod(localStringBuilder.toString(), this.c);
      return localMethod;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new ProxyException(localNoSuchMethodException.getMessage());
    }
  }
  
  public Object invokeSuper(Object paramObject, Object[] paramArrayOfObject)
  {
    return ((EnhancerInterface)paramObject).executeSuperMethod_Enhancer(this.b, this.c, paramArrayOfObject);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\proxy\MethodProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */