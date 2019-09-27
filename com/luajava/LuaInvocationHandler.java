package com.luajava;

import com.androlua.LuaContext;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LuaInvocationHandler
  implements InvocationHandler
{
  private final LuaContext a;
  private LuaObject b;
  
  public LuaInvocationHandler(LuaObject paramLuaObject)
  {
    this.b = paramLuaObject;
    this.a = paramLuaObject.getLuaState().getContext();
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    synchronized (this.b.b)
    {
      String str = paramMethod.getName();
      LuaObject localLuaObject;
      if (this.b.isFunction()) {
        localLuaObject = this.b;
      } else {
        localLuaObject = this.b.getField(str);
      }
      Class localClass = paramMethod.getReturnType();
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
      try
      {
        if ((!localClass.equals(Void.class)) && (!localClass.equals(Void.TYPE)))
        {
          Object localObject3 = localLuaObject.call(paramArrayOfObject);
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
              break label234;
            }
          }
          localObject2 = localObject3;
        }
        else
        {
          localLuaObject.call(paramArrayOfObject);
          localObject2 = null;
        }
      }
      catch (LuaException localLuaException2)
      {
        label234:
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
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\luajava\LuaInvocationHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */