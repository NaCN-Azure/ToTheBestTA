package com.baidu.mobstat;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import java.util.List;

public enum ao
{
  private int e;
  
  static
  {
    ao[] arrayOfao = new ao[4];
    arrayOfao[0] = a;
    arrayOfao[1] = b;
    arrayOfao[2] = c;
    arrayOfao[3] = d;
    f = arrayOfao;
  }
  
  private ao(int paramInt)
  {
    this.e = paramInt;
  }
  
  public static ao a(int paramInt)
  {
    for (ao localao : ) {
      if (localao.e == paramInt) {
        return localao;
      }
    }
    return b;
  }
  
  public static boolean b(Context paramContext)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    if (localActivityManager != null) {
      try
      {
        List localList = localActivityManager.getRunningServices(Integer.MAX_VALUE);
        for (int i = 0; (localList != null) && (i < localList.size()); i++)
        {
          boolean bool = "com.baidu.bottom.service.BottomService".equals(((ActivityManager.RunningServiceInfo)localList.get(i)).service.getClassName());
          if (bool) {
            return true;
          }
        }
        return false;
      }
      catch (Exception localException)
      {
        cz.a(localException);
      }
    }
  }
  
  public abstract void a(Context paramContext);
  
  public String toString()
  {
    return String.valueOf(this.e);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */