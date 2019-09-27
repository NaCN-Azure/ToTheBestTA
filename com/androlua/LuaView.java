package com.androlua;

import android.content.Context;
import android.view.View;
import com.a.a.a.a.a.a.a;
import com.luajava.LuaException;
import com.luajava.LuaObject;
import com.luajava.LuaTable;

public class LuaView
  extends View
{
  private LuaTable a;
  private LuaObject b;
  
  public LuaView(Context paramContext)
  {
    super(paramContext);
  }
  
  public LuaView(Context paramContext, LuaTable paramLuaTable)
  {
    super(paramContext);
    this.a = paramLuaTable;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.a != null) {
      try
      {
        this.b = this.a.getField("onMeasure");
        if (this.b.isFunction())
        {
          LuaObject localLuaObject = this.b;
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(paramInt1);
          arrayOfObject[1] = Integer.valueOf(paramInt2);
          arrayOfObject[2] = this;
          localLuaObject.call(arrayOfObject);
          return;
        }
      }
      catch (LuaException localLuaException)
      {
        a.a(localLuaException);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */