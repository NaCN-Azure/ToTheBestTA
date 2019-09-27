package com.androlua;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

public class LuaContentObserver
  extends ContentObserver
  implements LuaGcable
{
  private OnChangeListener a;
  private boolean b;
  
  private LuaContentObserver(Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public LuaContentObserver(LuaContext paramLuaContext, Uri paramUri)
  {
    this(new Handler(LuaApplication.getInstance().getMainLooper()));
    paramLuaContext.regGc(this);
    LuaApplication.getInstance().getContentResolver().registerContentObserver(paramUri, true, this);
  }
  
  public LuaContentObserver(LuaContext paramLuaContext, String paramString)
  {
    this(new Handler(LuaApplication.getInstance().getMainLooper()));
    Uri localUri = Uri.parse(paramString);
    paramLuaContext.regGc(this);
    LuaApplication.getInstance().getContentResolver().registerContentObserver(localUri, true, this);
  }
  
  public void gc()
  {
    LuaApplication.getInstance().getContentResolver().unregisterContentObserver(this);
    this.b = true;
  }
  
  public boolean isGc()
  {
    return this.b;
  }
  
  public void onChange(boolean paramBoolean, Uri paramUri)
  {
    super.onChange(paramBoolean, paramUri);
    if (this.a != null)
    {
      Cursor localCursor = LuaApplication.getInstance().getContentResolver().query(paramUri, null, null, null, null);
      if (localCursor != null) {
        localCursor.moveToFirst();
      }
      this.a.onChange(paramBoolean, paramUri, localCursor);
      if (localCursor != null) {
        localCursor.close();
      }
    }
  }
  
  public void setOnChangeListener(OnChangeListener paramOnChangeListener)
  {
    this.a = paramOnChangeListener;
  }
  
  public static abstract interface OnChangeListener
  {
    public abstract void onChange(boolean paramBoolean, Uri paramUri, Cursor paramCursor);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaContentObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */