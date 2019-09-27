package com.baidu.mobstat;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class da
{
  public static String a(byte[] paramArrayOfByte)
  {
    try
    {
      String str = ct.b(a(false, cu.a(), paramArrayOfByte));
      return str;
    }
    catch (Exception localException)
    {
      cz.b(localException);
    }
    return "";
  }
  
  private static RSAKey a(boolean paramBoolean, byte[] paramArrayOfByte)
  {
    KeyFactory localKeyFactory = KeyFactory.getInstance("RSA");
    if (paramBoolean) {
      return (RSAPrivateKey)localKeyFactory.generatePrivate(new PKCS8EncodedKeySpec(paramArrayOfByte));
    }
    return (RSAPublicKey)localKeyFactory.generatePublic(new X509EncodedKeySpec(paramArrayOfByte));
  }
  
  private static byte[] a(int paramInt1, Key paramKey, int paramInt2, byte[] paramArrayOfByte)
  {
    Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    localCipher.init(paramInt1, paramKey);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte.length - i;
      if (j > paramInt2) {
        j = paramInt2;
      }
      localByteArrayOutputStream.write(localCipher.doFinal(paramArrayOfByte, i, j));
      i += paramInt2;
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static byte[] a(boolean paramBoolean, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    RSAKey localRSAKey = a(paramBoolean, paramArrayOfByte1);
    int i = -11 + (1 + localRSAKey.getModulus().bitLength()) / 8;
    return a(1, (Key)localRSAKey, i, paramArrayOfByte2);
  }
  
  public static byte[] b(boolean paramBoolean, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    RSAKey localRSAKey = a(paramBoolean, paramArrayOfByte1);
    int i = (1 + localRSAKey.getModulus().bitLength()) / 8;
    return a(2, (Key)localRSAKey, i, paramArrayOfByte2);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */