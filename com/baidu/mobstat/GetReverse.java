package com.baidu.mobstat;

import android.content.Context;

public class GetReverse
{
  private static ICooperService a;
  
  public static ICooperService getCooperService(Context paramContext)
  {
    if (a == null) {
      a = CooperService.a();
    }
    return a;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\GetReverse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */