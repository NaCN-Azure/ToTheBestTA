package com.baidu.mobstat;

import android.content.Context;

class bt
{
  private static bt a = new bt();
  private boolean b = false;
  
  public static bt a()
  {
    return a;
  }
  
  public void a(Context paramContext, boolean paramBoolean)
  {
    cz.a("openExceptonAnalysis");
    if (this.b) {
      return;
    }
    this.b = true;
    bl.a().a(paramContext);
    if (!paramBoolean) {
      NativeCrashHandler.init(paramContext);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */