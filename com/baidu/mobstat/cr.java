package com.baidu.mobstat;

import android.text.TextUtils;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class cr
{
  public static byte[] a(int paramInt, byte[] paramArrayOfByte)
  {
    int i = paramInt - 1;
    if ((i >= 0) && (cu.a.length > i))
    {
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(cu.a[i].getBytes(), "AES");
      Cipher localCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      localCipher.init(1, localSecretKeySpec);
      return localCipher.doFinal(paramArrayOfByte);
    }
    return new byte[0];
  }
  
  public static byte[] b(int paramInt, byte[] paramArrayOfByte)
  {
    int i = paramInt - 1;
    if ((i >= 0) && (cu.a.length > i))
    {
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(cu.a[i].getBytes(), "AES");
      Cipher localCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      localCipher.init(2, localSecretKeySpec);
      return localCipher.doFinal(paramArrayOfByte);
    }
    return new byte[0];
  }
  
  public static String c(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      String str = ct.b(a(paramInt, paramArrayOfByte));
      return str;
    }
    catch (Exception localException)
    {
      cz.a(localException);
    }
    return "";
  }
  
  public static String d(int paramInt, byte[] paramArrayOfByte)
  {
    String str = c(paramInt, paramArrayOfByte);
    if (TextUtils.isEmpty(str)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append("|");
    localStringBuilder.append(paramInt);
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */