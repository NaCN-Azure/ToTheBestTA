package com.baidu.mobstat;

import android.os.Build.VERSION;

public final class bb
{
  public static boolean a = true;
  public static final String b;
  public static final String c;
  
  static
  {
    String str1;
    if (Build.VERSION.SDK_INT < 9) {
      str1 = "http://datax.baidu.com/xs.gif";
    } else {
      str1 = "https://datax.baidu.com/xs.gif";
    }
    b = str1;
    String str2;
    if (Build.VERSION.SDK_INT < 9) {
      str2 = "http://dxp.baidu.com/upgrade";
    } else {
      str2 = "https://dxp.baidu.com/upgrade";
    }
    c = str2;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */