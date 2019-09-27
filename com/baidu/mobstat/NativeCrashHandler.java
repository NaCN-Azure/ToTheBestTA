package com.baidu.mobstat;

import android.content.Context;
import android.util.Log;

public final class NativeCrashHandler
{
  private static boolean a;
  private static Context b;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: ldc 14
    //   2: invokestatic 20	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   5: iconst_1
    //   6: putstatic 22	com/baidu/mobstat/NativeCrashHandler:a	Z
    //   9: return
    //   10: ldc 24
    //   12: ldc 26
    //   14: invokestatic 32	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   17: pop
    //   18: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   10	1	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	9	10	java/lang/Throwable
  }
  
  /* Error */
  public static void doNativeCrash()
  {
    // Byte code:
    //   0: getstatic 22	com/baidu/mobstat/NativeCrashHandler:a	Z
    //   3: ifeq +15 -> 18
    //   6: invokestatic 39	com/baidu/mobstat/NativeCrashHandler:nativeException	()V
    //   9: return
    //   10: ldc 24
    //   12: ldc 41
    //   14: invokestatic 32	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   17: pop
    //   18: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   10	1	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   6	9	10	java/lang/Throwable
  }
  
  /* Error */
  public static void init(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: invokevirtual 49	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   9: putstatic 51	com/baidu/mobstat/NativeCrashHandler:b	Landroid/content/Context;
    //   12: getstatic 22	com/baidu/mobstat/NativeCrashHandler:a	Z
    //   15: ifeq +38 -> 53
    //   18: aload_0
    //   19: invokevirtual 55	android/content/Context:getCacheDir	()Ljava/io/File;
    //   22: astore_1
    //   23: aload_1
    //   24: invokevirtual 61	java/io/File:exists	()Z
    //   27: ifeq +26 -> 53
    //   30: aload_1
    //   31: invokevirtual 64	java/io/File:isDirectory	()Z
    //   34: ifeq +19 -> 53
    //   37: aload_1
    //   38: invokevirtual 68	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   41: invokestatic 71	com/baidu/mobstat/NativeCrashHandler:nativeInit	(Ljava/lang/String;)V
    //   44: return
    //   45: ldc 24
    //   47: ldc 73
    //   49: invokestatic 32	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   52: pop
    //   53: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	paramContext	Context
    //   22	16	1	localFile	java.io.File
    //   45	1	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   37	44	45	java/lang/Throwable
  }
  
  private static native void nativeException();
  
  private static native void nativeInit(String paramString);
  
  private static native void nativeProcess(String paramString);
  
  private static native void nativeUnint();
  
  public static void onCrashCallbackFromNative(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("crash: ");
    localStringBuilder.append(paramString);
    Log.w("NativeCrashHandler", localStringBuilder.toString());
    long l = System.currentTimeMillis();
    bl.a().a(l, paramString, "NativeException", 1);
  }
  
  /* Error */
  public static void process(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +53 -> 54
    //   4: aload_0
    //   5: invokevirtual 109	java/lang/String:length	()I
    //   8: ifne +4 -> 12
    //   11: return
    //   12: getstatic 22	com/baidu/mobstat/NativeCrashHandler:a	Z
    //   15: ifeq +39 -> 54
    //   18: new 57	java/io/File
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 111	java/io/File:<init>	(Ljava/lang/String;)V
    //   26: astore_1
    //   27: aload_1
    //   28: invokevirtual 61	java/io/File:exists	()Z
    //   31: ifeq +23 -> 54
    //   34: aload_1
    //   35: invokevirtual 114	java/io/File:isFile	()Z
    //   38: ifeq +16 -> 54
    //   41: aload_0
    //   42: invokestatic 116	com/baidu/mobstat/NativeCrashHandler:nativeProcess	(Ljava/lang/String;)V
    //   45: return
    //   46: ldc 24
    //   48: ldc 118
    //   50: invokestatic 32	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   53: pop
    //   54: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	paramString	String
    //   26	9	1	localFile	java.io.File
    //   46	1	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   41	45	46	java/lang/Throwable
  }
  
  /* Error */
  public static void uninit()
  {
    // Byte code:
    //   0: getstatic 22	com/baidu/mobstat/NativeCrashHandler:a	Z
    //   3: ifeq +15 -> 18
    //   6: invokestatic 121	com/baidu/mobstat/NativeCrashHandler:nativeUnint	()V
    //   9: return
    //   10: ldc 24
    //   12: ldc 123
    //   14: invokestatic 32	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   17: pop
    //   18: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   10	1	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   6	9	10	java/lang/Throwable
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\NativeCrashHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */