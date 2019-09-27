package com.baidu.mobstat;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class d
{
  public static byte[] a(byte[] paramArrayOfByte)
  {
    try
    {
      byte[] arrayOfByte = MessageDigest.getInstance("SHA-1").digest(paramArrayOfByte);
      return arrayOfByte;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */