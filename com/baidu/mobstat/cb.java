package com.baidu.mobstat;

import android.content.Context;
import java.util.TimerTask;

class cb
  extends TimerTask
{
  cb(by paramby, Context paramContext) {}
  
  public void run()
  {
    if (!DataCore.instance().isPartEmpty()) {
      by.a(this.b, this.a);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */