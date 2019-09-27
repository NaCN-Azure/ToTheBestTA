package com.baidu.mobstat;

import android.content.Context;

public class au
{
  private static l a;
  
  public static l a(Context paramContext)
  {
    try
    {
      bd.a("getBPStretegyController begin");
      Object localObject2 = a;
      if (localObject2 == null) {
        try
        {
          Class localClass = ax.a(paramContext, "com.baidu.bottom.remote.BPStretegyController2");
          if (localClass != null)
          {
            aw localaw = new aw(localClass.newInstance());
            try
            {
              bd.a("Get BPStretegyController load remote class v2");
              localObject2 = localaw;
            }
            catch (Exception localException3)
            {
              Exception localException1 = localException3;
              localObject2 = localaw;
            }
            bd.a(localException2);
          }
        }
        catch (Exception localException2) {}
      }
      if (localObject2 == null)
      {
        localObject2 = new av();
        bd.a("Get BPStretegyController load local class");
      }
      a = (l)localObject2;
      ax.a(paramContext, (l)localObject2);
      bd.a("getBPStretegyController end");
      return (l)localObject2;
    }
    finally {}
  }
  
  public static void a()
  {
    try
    {
      a = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */