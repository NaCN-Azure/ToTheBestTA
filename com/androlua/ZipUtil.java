package com.androlua;

public class ZipUtil
{
  /* Error */
  public static boolean unzip(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokestatic 18	com/androlua/LuaUtil:unZip	(Ljava/lang/String;Ljava/lang/String;)V
    //   5: iconst_1
    //   6: ireturn
    //   7: iconst_0
    //   8: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	9	0	paramString1	String
    //   0	9	1	paramString2	String
    //   7	1	2	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   0	5	7	java/io/IOException
  }
  
  public static boolean zip(String paramString1, String paramString2)
  {
    return LuaUtil.zip(paramString1, paramString2);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\ZipUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */