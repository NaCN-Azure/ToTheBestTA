package com.baidu.mobstat;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a
{
  public static byte[] a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString2.getBytes(), "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(1, localSecretKeySpec, new IvParameterSpec(paramString1.getBytes()));
    return localCipher.doFinal(paramArrayOfByte);
  }
  
  public static byte[] b(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString2.getBytes(), "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(2, localSecretKeySpec, new IvParameterSpec(paramString1.getBytes()));
    return localCipher.doFinal(paramArrayOfByte);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */