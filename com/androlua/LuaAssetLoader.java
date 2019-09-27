package com.androlua;

import android.content.Context;
import android.content.res.AssetManager;
import com.luajava.JavaFunction;
import com.luajava.LuaState;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class LuaAssetLoader
  extends JavaFunction
{
  private LuaState a;
  private Context c;
  
  public LuaAssetLoader(LuaContext paramLuaContext, LuaState paramLuaState)
  {
    super(paramLuaState);
    this.a = paramLuaState;
    this.c = paramLuaContext.getContext();
  }
  
  private static byte[] a(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(4096);
    byte[] arrayOfByte1 = new byte['က'];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte1);
      if (-1 == i) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte1, 0, i);
    }
    byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    return arrayOfByte2;
  }
  
  /* Error */
  public int execute()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	com/androlua/LuaAssetLoader:a	Lcom/luajava/LuaState;
    //   4: iconst_m1
    //   5: invokevirtual 57	com/luajava/LuaState:toString	(I)Ljava/lang/String;
    //   8: astore_1
    //   9: new 59	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   16: astore_2
    //   17: aload_2
    //   18: aload_1
    //   19: bipush 46
    //   21: bipush 47
    //   23: invokevirtual 67	java/lang/String:replace	(CC)Ljava/lang/String;
    //   26: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload_2
    //   31: ldc 73
    //   33: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload_2
    //   38: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: astore 5
    //   43: aload_0
    //   44: aload 5
    //   46: invokevirtual 80	com/androlua/LuaAssetLoader:readAsset	(Ljava/lang/String;)[B
    //   49: astore 11
    //   51: aload_0
    //   52: getfield 15	com/androlua/LuaAssetLoader:a	Lcom/luajava/LuaState;
    //   55: aload 11
    //   57: aload 5
    //   59: invokevirtual 84	com/luajava/LuaState:LloadBuffer	([BLjava/lang/String;)I
    //   62: ifeq +50 -> 112
    //   65: aload_0
    //   66: getfield 15	com/androlua/LuaAssetLoader:a	Lcom/luajava/LuaState;
    //   69: astore 12
    //   71: new 59	java/lang/StringBuilder
    //   74: dup
    //   75: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   78: astore 13
    //   80: aload 13
    //   82: ldc 86
    //   84: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload 13
    //   90: aload_0
    //   91: getfield 15	com/androlua/LuaAssetLoader:a	Lcom/luajava/LuaState;
    //   94: iconst_m1
    //   95: invokevirtual 57	com/luajava/LuaState:toString	(I)Ljava/lang/String;
    //   98: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload 12
    //   104: aload 13
    //   106: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   109: invokevirtual 90	com/luajava/LuaState:pushString	(Ljava/lang/String;)V
    //   112: iconst_1
    //   113: ireturn
    //   114: aload_0
    //   115: getfield 15	com/androlua/LuaAssetLoader:a	Lcom/luajava/LuaState;
    //   118: astore 6
    //   120: new 59	java/lang/StringBuilder
    //   123: dup
    //   124: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   127: astore 7
    //   129: aload 7
    //   131: ldc 92
    //   133: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload 7
    //   139: aload 5
    //   141: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload 7
    //   147: ldc 94
    //   149: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: aload 6
    //   155: aload 7
    //   157: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokevirtual 90	com/luajava/LuaState:pushString	(Ljava/lang/String;)V
    //   163: iconst_1
    //   164: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	LuaAssetLoader
    //   8	11	1	str1	String
    //   16	22	2	localStringBuilder1	StringBuilder
    //   41	99	5	str2	String
    //   118	36	6	localLuaState1	LuaState
    //   127	29	7	localStringBuilder2	StringBuilder
    //   114	1	9	localIOException	java.io.IOException
    //   49	7	11	arrayOfByte	byte[]
    //   69	34	12	localLuaState2	LuaState
    //   78	27	13	localStringBuilder3	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   43	112	114	java/io/IOException
  }
  
  public byte[] readAsset(String paramString)
  {
    InputStream localInputStream = this.c.getAssets().open(paramString);
    byte[] arrayOfByte = a(localInputStream);
    localInputStream.close();
    return arrayOfByte;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaAssetLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */