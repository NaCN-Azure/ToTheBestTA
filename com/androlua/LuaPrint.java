package com.androlua;

import com.luajava.JavaFunction;
import com.luajava.LuaState;

public class LuaPrint
  extends JavaFunction
{
  private LuaState a;
  private LuaContext c;
  private StringBuilder d = new StringBuilder();
  
  public LuaPrint(LuaContext paramLuaContext, LuaState paramLuaState)
  {
    super(paramLuaState);
    this.a = paramLuaState;
    this.c = paramLuaContext;
  }
  
  public int execute()
  {
    int i = this.a.getTop();
    int j = 2;
    if (i < j)
    {
      this.c.sendMsg("");
      return 0;
    }
    while (j <= this.a.getTop())
    {
      int k = this.a.type(j);
      Object localObject1 = this.a.typeName(k);
      String str;
      if (((String)localObject1).equals("userdata"))
      {
        Object localObject2 = this.a.toJavaObject(j);
        str = null;
        if (localObject2 != null) {
          str = localObject2.toString();
        }
      }
      else if (((String)localObject1).equals("boolean"))
      {
        if (this.a.toBoolean(j)) {
          str = "true";
        } else {
          str = "false";
        }
      }
      else
      {
        str = this.a.toString(j);
      }
      if (str != null) {
        localObject1 = str;
      }
      this.d.append("\t");
      this.d.append((String)localObject1);
      this.d.append("\t");
      j++;
    }
    this.c.sendMsg(this.d.toString().substring(1, this.d.length() - 1));
    this.d.setLength(0);
    return 0;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaPrint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */