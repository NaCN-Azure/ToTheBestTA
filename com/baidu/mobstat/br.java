package com.baidu.mobstat;

import android.content.Context;

class br
  implements Runnable
{
  br(bm parambm, long paramLong, Context paramContext, String paramString1, String paramString2, ExtraInfo paramExtraInfo) {}
  
  public void run()
  {
    bv.a().d();
    if (this.a <= 0L)
    {
      cz.a("EventStat: Wrong Case, Duration must be positive");
      return;
    }
    this.f.a(this.b, this.c, this.d, 1, System.currentTimeMillis(), this.a, this.e);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */