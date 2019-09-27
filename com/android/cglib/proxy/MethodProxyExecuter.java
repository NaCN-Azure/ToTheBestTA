package com.android.cglib.proxy;

import com.a.a.a.a.a.a.a;
import java.lang.reflect.Method;

public class MethodProxyExecuter
{
  public static final String EXECUTE_INTERCEPTOR = "executeInterceptor";
  public static final String EXECUTE_METHOD = "executeMethod";
  
  public static Object executeInterceptor(MethodInterceptor paramMethodInterceptor, Class<?> paramClass, String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject, Object paramObject)
  {
    if (paramArrayOfObject == null) {
      paramArrayOfObject = new Object[0];
    }
    if (paramArrayOfClass == null) {
      paramArrayOfClass = new Class[0];
    }
    if (paramMethodInterceptor == null) {
      return executeMethod(paramClass, paramString, paramArrayOfClass, paramArrayOfObject, paramObject);
    }
    try
    {
      Object localObject = paramMethodInterceptor.intercept(paramObject, paramArrayOfObject, new MethodProxy(paramClass, paramString, paramArrayOfClass));
      return localObject;
    }
    catch (Exception localException)
    {
      a.a(localException);
      throw new ProxyException(localException.getMessage());
    }
  }
  
  public static Object executeMethod(Class paramClass, String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject, Object paramObject)
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("_Super");
      Method localMethod = paramClass.getMethod(localStringBuilder.toString(), paramArrayOfClass);
      localMethod.setAccessible(true);
      Object localObject = localMethod.invoke(paramObject, paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
      a.a(localException);
      throw new ProxyException(localException.getCause());
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\proxy\MethodProxyExecuter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */