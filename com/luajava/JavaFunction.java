package com.luajava;

public abstract class JavaFunction
{
  protected LuaState b;
  
  public JavaFunction(LuaState paramLuaState)
  {
    this.b = paramLuaState;
  }
  
  public abstract int execute();
  
  public LuaObject getParam(int paramInt)
  {
    return this.b.getLuaObject(paramInt);
  }
  
  public void register(String paramString)
  {
    synchronized (this.b)
    {
      this.b.pushJavaFunction(this);
      this.b.setGlobal(paramString);
      return;
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\luajava\JavaFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */