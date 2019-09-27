package com.androlua;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.luajava.LuaException;
import com.luajava.LuaFunction;
import com.luajava.LuaObject;
import com.luajava.LuaState;

public class LuaDrawable
  extends Drawable
{
  private final LuaContext a;
  private LuaObject b;
  private Paint c;
  private LuaFunction d;
  
  public LuaDrawable(LuaFunction paramLuaFunction)
  {
    this.b = paramLuaFunction;
    this.c = new Paint();
    this.a = this.b.getLuaState().getContext();
  }
  
  public void draw(Canvas paramCanvas)
  {
    try
    {
      if (this.d == null)
      {
        LuaObject localLuaObject = this.b;
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = paramCanvas;
        arrayOfObject[1] = this.c;
        arrayOfObject[2] = this;
        Object localObject = localLuaObject.call(arrayOfObject);
        if ((localObject != null) && ((localObject instanceof LuaFunction))) {
          this.d = ((LuaFunction)localObject);
        }
      }
      if (this.d != null)
      {
        this.d.call(new Object[] { paramCanvas });
        return;
      }
    }
    catch (LuaException localLuaException)
    {
      this.a.sendError("onDraw", localLuaException);
    }
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public Paint getPaint()
  {
    return this.c;
  }
  
  public void setAlpha(int paramInt)
  {
    this.c.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.c.setColorFilter(paramColorFilter);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */