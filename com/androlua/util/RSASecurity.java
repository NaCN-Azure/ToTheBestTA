package com.androlua.util;

import com.androlua.LuaApplication;

public class RSASecurity
{
  private static String a = LuaApplication.getInstance().getLuaExtDir("PublicKey");
  private static String b = LuaApplication.getInstance().getLuaExtDir("PrivateKey");
  
  /* Error */
  public static byte[] decrypt(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 36	java/io/ObjectInputStream
    //   5: dup
    //   6: new 38	java/io/FileInputStream
    //   9: dup
    //   10: getstatic 27	com/androlua/util/RSASecurity:b	Ljava/lang/String;
    //   13: invokespecial 41	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   16: invokespecial 44	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   19: astore_2
    //   20: aload_2
    //   21: invokevirtual 48	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   24: checkcast 50	java/security/Key
    //   27: astore 5
    //   29: aload_2
    //   30: invokevirtual 53	java/io/ObjectInputStream:close	()V
    //   33: ldc 55
    //   35: invokestatic 60	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   38: astore 6
    //   40: aload 6
    //   42: iconst_2
    //   43: aload 5
    //   45: invokevirtual 64	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   48: aload 6
    //   50: aload_0
    //   51: invokevirtual 67	javax/crypto/Cipher:doFinal	([B)[B
    //   54: areturn
    //   55: astore 4
    //   57: aload_2
    //   58: astore_1
    //   59: goto +17 -> 76
    //   62: astore_3
    //   63: aload_2
    //   64: astore_1
    //   65: goto +9 -> 74
    //   68: astore 4
    //   70: goto +6 -> 76
    //   73: astore_3
    //   74: aload_3
    //   75: athrow
    //   76: aload_1
    //   77: invokevirtual 53	java/io/ObjectInputStream:close	()V
    //   80: aload 4
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	paramArrayOfByte	byte[]
    //   1	76	1	localObject1	Object
    //   19	45	2	localObjectInputStream	java.io.ObjectInputStream
    //   62	1	3	localException1	Exception
    //   73	2	3	localException2	Exception
    //   55	1	4	localObject2	Object
    //   68	13	4	localObject3	Object
    //   27	17	5	localKey	java.security.Key
    //   38	11	6	localCipher	javax.crypto.Cipher
    // Exception table:
    //   from	to	target	type
    //   20	29	55	finally
    //   20	29	62	java/lang/Exception
    //   2	20	68	finally
    //   74	76	68	finally
    //   2	20	73	java/lang/Exception
  }
  
  /* Error */
  public static byte[] encrypt(String paramString)
  {
    // Byte code:
    //   0: invokestatic 72	com/androlua/util/RSASecurity:generateKeyPair	()V
    //   3: aconst_null
    //   4: astore_1
    //   5: new 36	java/io/ObjectInputStream
    //   8: dup
    //   9: new 38	java/io/FileInputStream
    //   12: dup
    //   13: getstatic 23	com/androlua/util/RSASecurity:a	Ljava/lang/String;
    //   16: invokespecial 41	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   19: invokespecial 44	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   22: astore_2
    //   23: aload_2
    //   24: invokevirtual 48	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   27: checkcast 50	java/security/Key
    //   30: astore 5
    //   32: aload_2
    //   33: invokevirtual 53	java/io/ObjectInputStream:close	()V
    //   36: ldc 55
    //   38: invokestatic 60	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   41: astore 6
    //   43: aload 6
    //   45: iconst_1
    //   46: aload 5
    //   48: invokevirtual 64	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   51: aload 6
    //   53: aload_0
    //   54: invokevirtual 78	java/lang/String:getBytes	()[B
    //   57: invokevirtual 67	javax/crypto/Cipher:doFinal	([B)[B
    //   60: areturn
    //   61: astore 4
    //   63: aload_2
    //   64: astore_1
    //   65: goto +17 -> 82
    //   68: astore_3
    //   69: aload_2
    //   70: astore_1
    //   71: goto +9 -> 80
    //   74: astore 4
    //   76: goto +6 -> 82
    //   79: astore_3
    //   80: aload_3
    //   81: athrow
    //   82: aload_1
    //   83: invokevirtual 53	java/io/ObjectInputStream:close	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	paramString	String
    //   4	79	1	localObject1	Object
    //   22	48	2	localObjectInputStream	java.io.ObjectInputStream
    //   68	1	3	localException1	Exception
    //   79	2	3	localException2	Exception
    //   61	1	4	localObject2	Object
    //   74	13	4	localObject3	Object
    //   30	17	5	localKey	java.security.Key
    //   41	11	6	localCipher	javax.crypto.Cipher
    // Exception table:
    //   from	to	target	type
    //   23	32	61	finally
    //   23	32	68	java/lang/Exception
    //   5	23	74	finally
    //   80	82	74	finally
    //   5	23	79	java/lang/Exception
  }
  
  /* Error */
  public static void generateKeyPair()
  {
    // Byte code:
    //   0: new 80	java/security/SecureRandom
    //   3: dup
    //   4: invokespecial 81	java/security/SecureRandom:<init>	()V
    //   7: astore_0
    //   8: ldc 55
    //   10: invokestatic 86	java/security/KeyPairGenerator:getInstance	(Ljava/lang/String;)Ljava/security/KeyPairGenerator;
    //   13: astore_1
    //   14: aload_1
    //   15: sipush 1024
    //   18: aload_0
    //   19: invokevirtual 90	java/security/KeyPairGenerator:initialize	(ILjava/security/SecureRandom;)V
    //   22: aload_1
    //   23: sipush 1024
    //   26: invokevirtual 93	java/security/KeyPairGenerator:initialize	(I)V
    //   29: aload_1
    //   30: invokevirtual 96	java/security/KeyPairGenerator:generateKeyPair	()Ljava/security/KeyPair;
    //   33: astore_2
    //   34: aload_2
    //   35: invokevirtual 102	java/security/KeyPair:getPublic	()Ljava/security/PublicKey;
    //   38: astore_3
    //   39: aload_2
    //   40: invokevirtual 106	java/security/KeyPair:getPrivate	()Ljava/security/PrivateKey;
    //   43: astore 4
    //   45: aconst_null
    //   46: astore 5
    //   48: new 108	java/io/ObjectOutputStream
    //   51: dup
    //   52: new 110	java/io/FileOutputStream
    //   55: dup
    //   56: getstatic 23	com/androlua/util/RSASecurity:a	Ljava/lang/String;
    //   59: invokespecial 111	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   62: invokespecial 114	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   65: astore 6
    //   67: new 108	java/io/ObjectOutputStream
    //   70: dup
    //   71: new 110	java/io/FileOutputStream
    //   74: dup
    //   75: getstatic 27	com/androlua/util/RSASecurity:b	Ljava/lang/String;
    //   78: invokespecial 111	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   81: invokespecial 114	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   84: astore 7
    //   86: aload 6
    //   88: aload_3
    //   89: invokevirtual 118	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   92: aload 7
    //   94: aload 4
    //   96: invokevirtual 118	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   99: aload 6
    //   101: invokevirtual 119	java/io/ObjectOutputStream:close	()V
    //   104: aload 7
    //   106: invokevirtual 119	java/io/ObjectOutputStream:close	()V
    //   109: return
    //   110: astore 9
    //   112: goto +53 -> 165
    //   115: astore 8
    //   117: goto +16 -> 133
    //   120: astore 9
    //   122: aconst_null
    //   123: astore 10
    //   125: goto +44 -> 169
    //   128: astore 8
    //   130: aconst_null
    //   131: astore 7
    //   133: aload 6
    //   135: astore 5
    //   137: goto +19 -> 156
    //   140: astore 9
    //   142: aconst_null
    //   143: astore 10
    //   145: aconst_null
    //   146: astore 6
    //   148: goto +21 -> 169
    //   151: astore 8
    //   153: aconst_null
    //   154: astore 7
    //   156: aload 8
    //   158: athrow
    //   159: astore 9
    //   161: aload 5
    //   163: astore 6
    //   165: aload 7
    //   167: astore 10
    //   169: aload 6
    //   171: invokevirtual 119	java/io/ObjectOutputStream:close	()V
    //   174: aload 10
    //   176: invokevirtual 119	java/io/ObjectOutputStream:close	()V
    //   179: aload 9
    //   181: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   7	12	0	localSecureRandom	java.security.SecureRandom
    //   13	17	1	localKeyPairGenerator	java.security.KeyPairGenerator
    //   33	7	2	localKeyPair	java.security.KeyPair
    //   38	51	3	localPublicKey	java.security.PublicKey
    //   43	52	4	localPrivateKey	java.security.PrivateKey
    //   46	116	5	localObject1	Object
    //   65	105	6	localObject2	Object
    //   84	82	7	localObjectOutputStream1	java.io.ObjectOutputStream
    //   115	1	8	localException1	Exception
    //   128	1	8	localException2	Exception
    //   151	6	8	localException3	Exception
    //   110	1	9	localObject3	Object
    //   120	1	9	localObject4	Object
    //   140	1	9	localObject5	Object
    //   159	21	9	localObject6	Object
    //   123	52	10	localObjectOutputStream2	java.io.ObjectOutputStream
    // Exception table:
    //   from	to	target	type
    //   86	99	110	finally
    //   86	99	115	java/lang/Exception
    //   67	86	120	finally
    //   67	86	128	java/lang/Exception
    //   48	67	140	finally
    //   48	67	151	java/lang/Exception
    //   156	159	159	finally
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\util\RSASecurity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */