package com.baidu.mobstat;

import android.system.ErrnoException;
import android.system.Os;

class k
{
  static boolean a(String paramString, int paramInt)
  {
    try
    {
      Os.chmod(paramString, paramInt);
      return true;
    }
    catch (ErrnoException localErrnoException)
    {
      g.a(localErrnoException);
    }
    return false;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */