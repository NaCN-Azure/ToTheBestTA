package com.luajava;

import java.util.HashMap;
import java.util.Map;

public final class LuaStateFactory
{
  private static final Map<Long, LuaState> a = new HashMap();
  
  public static LuaState getExistingState(long paramLong)
  {
    try
    {
      LuaState localLuaState = (LuaState)a.get(Long.valueOf(paramLong));
      if (localLuaState == null)
      {
        localLuaState = new LuaState(paramLong);
        a.put(Long.valueOf(paramLong), localLuaState);
      }
      return localLuaState;
    }
    finally {}
  }
  
  public static long insertLuaState(LuaState paramLuaState)
  {
    try
    {
      a.put(Long.valueOf(paramLuaState.getPointer()), paramLuaState);
      long l = paramLuaState.getPointer();
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static LuaState newLuaState()
  {
    try
    {
      LuaState localLuaState = new LuaState();
      a.put(Long.valueOf(localLuaState.getPointer()), localLuaState);
      return localLuaState;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void removeLuaState(long paramLong)
  {
    try
    {
      a.put(Long.valueOf(paramLong), null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\luajava\LuaStateFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */