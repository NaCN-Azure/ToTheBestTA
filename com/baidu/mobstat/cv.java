package com.baidu.mobstat;

import com.a.a.a.a.a.a.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class cv
{
  public static byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramArrayOfByte);
      localGZIPOutputStream.close();
    }
    catch (IOException localIOException)
    {
      a.a(localIOException);
    }
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */