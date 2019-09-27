package com.luajava;

import com.android.cglib.proxy.MethodInterceptor;
import com.android.cglib.proxy.MethodProxy;
import com.androlua.LuaContext;
import java.lang.reflect.Method;

public class LuaMethodInterceptor
  implements MethodInterceptor
{
  private final LuaContext a;
  private LuaObject b;
  
  public LuaMethodInterceptor(LuaObject paramLuaObject)
  {
    this.b = paramLuaObject;
    this.a = paramLuaObject.getLuaState().getContext();
  }
  
  public Object intercept(Object paramObject, Object[] paramArrayOfObject, MethodProxy paramMethodProxy)
  {
    synchronized (this.b.b)
    {
      Method localMethod = paramMethodProxy.getOriginalMethod();
      String str = localMethod.getName();
      LuaObject localLuaObject;
      if (this.b.isFunction()) {
        localLuaObject = this.b;
      } else {
        localLuaObject = this.b.getField(str);
      }
      Class localClass = localMethod.getReturnType();
      boolean bool = localLuaObject.isNil();
      Object localObject2 = null;
      if (bool)
      {
        if ((!localClass.equals(Boolean.TYPE)) && (!localClass.equals(Boolean.class)))
        {
          if ((!localClass.isPrimitive()) && (!Number.class.isAssignableFrom(localClass))) {
            return null;
          }
          Integer localInteger1 = Integer.valueOf(0);
          return localInteger1;
        }
        Boolean localBoolean1 = Boolean.valueOf(false);
        return localBoolean1;
      }
      Object[] arrayOfObject = new Object[1 + paramArrayOfObject.length];
      System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 1, paramArrayOfObject.length);
      arrayOfObject[0] = new SuperCall(paramObject, paramMethodProxy);
      try
      {
        if ((!localClass.equals(Void.class)) && (!localClass.equals(Void.TYPE)))
        {
          Object localObject3 = localLuaObject.call(arrayOfObject);
          if (localObject3 != null) {
            try
            {
              if ((localObject3 instanceof Double)) {
                localObject2 = LuaState.convertLuaNumber((Double)localObject3, localClass);
              }
            }
            catch (LuaException localLuaException1)
            {
              localObject2 = localObject3;
              break label277;
            }
          }
          localObject2 = localObject3;
        }
        else
        {
          localLuaObject.call(arrayOfObject);
          localObject2 = null;
        }
      }
      catch (LuaException localLuaException2)
      {
        label277:
        this.a.sendError(str, localLuaException2);
      }
      if (localObject2 == null) {
        if ((!localClass.equals(Boolean.TYPE)) && (!localClass.equals(Boolean.class)))
        {
          if ((localClass.isPrimitive()) || (Number.class.isAssignableFrom(localClass)))
          {
            Integer localInteger2 = Integer.valueOf(0);
            return localInteger2;
          }
        }
        else
        {
          Boolean localBoolean2 = Boolean.valueOf(false);
          return localBoolean2;
        }
      }
      return localObject2;
    }
  }
  
  private class SuperCall
    implements LuaMetaTable
  {
    private final Object b;
    private final MethodProxy c;
    
    public SuperCall(Object paramObject, MethodProxy paramMethodProxy)
    {
      this.b = paramObject;
      this.c = paramMethodProxy;
    }
    
    public Object __call(Object... paramVarArgs)
    {
      return this.c.invokeSuper(this.b, paramVarArgs);
    }
    
    public Object __index(String paramString)
    {
      return null;
    }
    
    public void __newIndex(String paramString, Object paramObject) {}
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\luajava\LuaMethodInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */