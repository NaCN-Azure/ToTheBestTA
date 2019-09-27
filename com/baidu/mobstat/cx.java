package com.baidu.mobstat;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class cx
{
  public static String a(File paramFile)
  {
    try
    {
      String str = cw.a(MessageDigest.getInstance("SHA-256"), paramFile);
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      cz.b(localNoSuchAlgorithmException);
    }
    return "";
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    try
    {
      String str = cw.a(MessageDigest.getInstance("SHA-256"), paramArrayOfByte);
      return str;
    }
    catch (Exception localException)
    {
      cz.b(localException);
    }
    return "";
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */