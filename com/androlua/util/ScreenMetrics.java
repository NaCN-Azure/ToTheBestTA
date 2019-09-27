package com.androlua.util;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class ScreenMetrics
{
  private static int a;
  private static int b;
  private static boolean c;
  private static int d;
  private static Display e;
  private int f;
  private int g;
  
  public ScreenMetrics() {}
  
  public ScreenMetrics(int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.g = paramInt2;
  }
  
  public static int getDeviceScreenDensity()
  {
    return d;
  }
  
  public static int getDeviceScreenHeight()
  {
    return a;
  }
  
  public static int getDeviceScreenWidth()
  {
    return b;
  }
  
  public static void initIfNeeded(Activity paramActivity)
  {
    if (c) {
      return;
    }
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getRealMetrics(localDisplayMetrics);
    a = localDisplayMetrics.heightPixels;
    b = localDisplayMetrics.widthPixels;
    d = localDisplayMetrics.densityDpi;
    e = paramActivity.getWindowManager().getDefaultDisplay();
    c = true;
  }
  
  public static int rescaleX(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      if (!c) {
        return paramInt1;
      }
      paramInt1 = paramInt1 * paramInt2 / b;
    }
    return paramInt1;
  }
  
  public static int rescaleY(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      if (!c) {
        return paramInt1;
      }
      paramInt1 = paramInt1 * paramInt2 / a;
    }
    return paramInt1;
  }
  
  public static int scaleX(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      if (!c) {
        return paramInt1;
      }
      paramInt1 = paramInt1 * b / paramInt2;
    }
    return paramInt1;
  }
  
  public static int scaleY(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      if (!c) {
        return paramInt1;
      }
      paramInt1 = paramInt1 * a / paramInt2;
    }
    return paramInt1;
  }
  
  public int rescaleX(int paramInt)
  {
    return rescaleX(paramInt, this.f);
  }
  
  public int rescaleY(int paramInt)
  {
    return rescaleY(paramInt, this.g);
  }
  
  public int scaleX(int paramInt)
  {
    return scaleX(paramInt, this.f);
  }
  
  public int scaleY(int paramInt)
  {
    return scaleY(paramInt, this.g);
  }
  
  public void setDesignHeight(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void setDesignWidth(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void setScreenMetrics(int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.g = paramInt2;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\util\ScreenMetrics.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */