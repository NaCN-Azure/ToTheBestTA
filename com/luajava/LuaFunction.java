package com.luajava;

public class LuaFunction<T>
  extends LuaObject
  implements LuaMetaTable
{
  protected LuaFunction(LuaState paramLuaState, int paramInt)
  {
    super(paramLuaState, paramInt);
  }
  
  protected LuaFunction(LuaState paramLuaState, String paramString)
  {
    super(paramLuaState, paramString);
  }
  
  public T __call(Object[] paramArrayOfObject)
  {
    return (T)super.call(paramArrayOfObject);
  }
  
  public Object __index(String paramString)
  {
    return null;
  }
  
  public void __newIndex(String paramString, Object paramObject) {}
  
  public T call(Object... paramVarArgs)
  {
    return (T)super.call(paramVarArgs);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\luajava\LuaFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */