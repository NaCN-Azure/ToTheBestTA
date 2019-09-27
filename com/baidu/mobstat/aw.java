package com.baidu.mobstat;

import android.content.Context;
import java.lang.reflect.Method;
import org.json.JSONObject;

class aw
  implements l
{
  private ba a = ba.a;
  private Object b;
  private Class<?> c;
  
  public aw(Object paramObject)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("proxy is null.");
    }
    if (!"com.baidu.bottom.remote.BPStretegyController2".equals(paramObject.getClass().getName())) {
      throw new IllegalArgumentException("class isn't com.baidu.bottom.remote.BPStretegyController2");
    }
    this.b = paramObject;
    this.c = paramObject.getClass();
  }
  
  private <T> T a(Object[] paramArrayOfObject, String paramString, Class<?>[] paramArrayOfClass)
  {
    return (T)this.c.getMethod(paramString, paramArrayOfClass).invoke(this.b, paramArrayOfObject);
  }
  
  public void a(Context paramContext, long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = Long.valueOf(paramLong);
    Class[] arrayOfClass = new Class[2];
    arrayOfClass[0] = Context.class;
    arrayOfClass[1] = Long.TYPE;
    try
    {
      a(arrayOfObject, "setLastUpdateTime", arrayOfClass);
      return;
    }
    catch (Exception localException)
    {
      bd.b(localException);
      this.a.a(paramContext, paramLong);
    }
  }
  
  public void a(Context paramContext, String paramString)
  {
    Object[] arrayOfObject = { paramContext, paramString };
    Class[] arrayOfClass = { Context.class, String.class };
    try
    {
      a(arrayOfObject, "saveRemoteConfig2", arrayOfClass);
      return;
    }
    catch (Exception localException)
    {
      bd.b(localException);
      this.a.a(paramContext, paramString);
    }
  }
  
  public void a(Context paramContext, JSONObject paramJSONObject)
  {
    Object[] arrayOfObject = { paramContext, paramJSONObject };
    Class[] arrayOfClass = { Context.class, JSONObject.class };
    try
    {
      a(arrayOfObject, "startDataAnynalyze", arrayOfClass);
      return;
    }
    catch (Exception localException)
    {
      bd.b(localException);
      this.a.a(paramContext, paramJSONObject);
    }
  }
  
  public boolean a(Context paramContext)
  {
    Object[] arrayOfObject = { paramContext };
    Class[] arrayOfClass = { Context.class };
    try
    {
      boolean bool = ((Boolean)a(arrayOfObject, "needUpdate", arrayOfClass)).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
      bd.b(localException);
    }
    return this.a.a(paramContext);
  }
  
  public void b(Context paramContext, String paramString)
  {
    Object[] arrayOfObject = { paramContext, paramString };
    Class[] arrayOfClass = { Context.class, String.class };
    try
    {
      a(arrayOfObject, "saveRemoteSign", arrayOfClass);
      return;
    }
    catch (Exception localException)
    {
      bd.b(localException);
      this.a.b(paramContext, paramString);
    }
  }
  
  public boolean b(Context paramContext)
  {
    Object[] arrayOfObject = { paramContext };
    Class[] arrayOfClass = { Context.class };
    try
    {
      boolean bool = ((Boolean)a(arrayOfObject, "canStartService", arrayOfClass)).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
      bd.b(localException);
    }
    return this.a.b(paramContext);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */