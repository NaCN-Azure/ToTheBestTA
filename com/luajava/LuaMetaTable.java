package com.luajava;

public abstract interface LuaMetaTable
{
  public abstract Object __call(Object... paramVarArgs);
  
  public abstract Object __index(String paramString);
  
  public abstract void __newIndex(String paramString, Object paramObject);
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\luajava\LuaMetaTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */