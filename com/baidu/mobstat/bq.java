package com.baidu.mobstat;

import android.content.Context;
import java.util.HashMap;

class bq
  implements Runnable
{
  bq(bm parambm, String paramString1, String paramString2, long paramLong, Context paramContext, ExtraInfo paramExtraInfo) {}
  
  public void run()
  {
    bv.a().d();
    String str = this.f.a(this.a, this.b);
    bs localbs = (bs)this.f.a.get(str);
    if (localbs == null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("EventStat: event_id[");
      localStringBuilder.append(this.a);
      localStringBuilder.append("] with label[");
      localStringBuilder.append(this.b);
      localStringBuilder.append("] is not started or alread done.");
      cz.b(localStringBuilder.toString());
      return;
    }
    if ((this.a.equals(localbs.a)) && (this.b.equals(localbs.b)))
    {
      this.f.a.remove(str);
      long l = this.c - localbs.c;
      if (l <= 0L)
      {
        cz.a("EventStat: Wrong Case, Duration must be positive");
        return;
      }
      this.f.a(this.d, this.a, this.b, 1, localbs.c, l, this.e);
      return;
    }
    cz.a("EventStat: Wrong Case, eventId/label pair not match");
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */