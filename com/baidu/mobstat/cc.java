package com.baidu.mobstat;

import android.content.Context;
import java.io.File;
import java.util.Arrays;

class cc
  implements Runnable
{
  cc(by paramby, Context paramContext) {}
  
  public void run()
  {
    try
    {
      File localFile = this.a.getFilesDir();
      if (localFile != null)
      {
        if (!localFile.exists()) {
          return;
        }
        String[] arrayOfString = localFile.list(new cd(this));
        if (arrayOfString != null)
        {
          int i = arrayOfString.length;
          if (i == 0) {
            return;
          }
          try
          {
            Arrays.sort(arrayOfString, new ce(this));
          }
          catch (Exception localException2)
          {
            cz.b(localException2);
          }
          int j = arrayOfString.length;
          int k = 0;
          int m = 0;
          while (k < j)
          {
            String str1 = arrayOfString[k];
            String str2 = cs.a(this.a, str1);
            if (by.a(this.b, this.a, str2))
            {
              cs.b(this.a, str1);
              m = 0;
            }
            else
            {
              m++;
              if (m >= 5) {
                return;
              }
            }
            k++;
          }
        }
      }
      return;
    }
    catch (Exception localException1)
    {
      cz.b(localException1);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */