package com.androlua;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.luajava.LuaObject;
import com.luajava.LuaState;
import com.luajava.LuaTable;

public class LuaFragment
  extends Fragment
{
  private LuaTable a = null;
  private LuaObject b = null;
  private View c;
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    try
    {
      if (this.c != null) {
        return this.c;
      }
      if (this.a != null)
      {
        LuaObject localLuaObject = (LuaObject)this.a.getLuaState().getLuaObject("require").call(new Object[] { "loadlayout" });
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.a;
        return (View)localLuaObject.call(arrayOfObject);
      }
      TextView localTextView = new TextView(getActivity());
      return localTextView;
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException(localException.getMessage());
    }
  }
  
  public void setLayout(View paramView)
  {
    this.c = paramView;
    this.a = null;
  }
  
  public void setLayout(LuaTable paramLuaTable)
  {
    this.a = paramLuaTable;
    this.c = null;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */