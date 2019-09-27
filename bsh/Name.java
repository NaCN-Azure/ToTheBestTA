package bsh;

import java.io.Serializable;

class Name
  implements Serializable
{
  private static String f;
  String a = null;
  Class b;
  Class c;
  private String d;
  private String e;
  private Object g;
  private int h;
  public NameSpace namespace;
  
  Name(NameSpace paramNameSpace, String paramString)
  {
    this.namespace = paramNameSpace;
    this.a = paramString;
  }
  
  static int a(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    int i = -1;
    for (int j = 0;; j++)
    {
      i = paramString.indexOf('.', i + 1);
      if (i == -1) {
        return j + 1;
      }
    }
  }
  
  static NameSpace a(NameSpace paramNameSpace)
  {
    if (paramNameSpace.d) {
      return paramNameSpace;
    }
    if ((paramNameSpace.c) && (paramNameSpace.getParent() != null) && (paramNameSpace.getParent().d)) {
      return paramNameSpace.getParent();
    }
    return null;
  }
  
  /* Error */
  private Object a(CallStack paramCallStack, Interpreter paramInterpreter, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   4: ifnonnull +56 -> 60
    //   7: aload_0
    //   8: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   11: invokestatic 60	bsh/Name:isCompound	(Ljava/lang/String;)Z
    //   14: ifne +46 -> 60
    //   17: iload_3
    //   18: ifne +42 -> 60
    //   21: aload_0
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   27: aload_2
    //   28: aload_0
    //   29: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   32: iconst_0
    //   33: invokevirtual 63	bsh/Name:a	(Lbsh/CallStack;Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;Z)Ljava/lang/Object;
    //   36: astore 82
    //   38: aload 82
    //   40: getstatic 69	bsh/Primitive:VOID	Lbsh/Primitive;
    //   43: if_acmpeq +17 -> 60
    //   46: aload_0
    //   47: aload_0
    //   48: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   51: getstatic 71	bsh/Name:f	Ljava/lang/String;
    //   54: aload 82
    //   56: invokespecial 74	bsh/Name:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   59: areturn
    //   60: aload_0
    //   61: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   64: iconst_1
    //   65: invokestatic 77	bsh/Name:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   68: astore 5
    //   70: aload_0
    //   71: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   74: ifnull +13 -> 87
    //   77: aload_0
    //   78: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   81: instanceof 79
    //   84: ifeq +178 -> 262
    //   87: iload_3
    //   88: ifne +174 -> 262
    //   91: getstatic 84	bsh/Interpreter:DEBUG	Z
    //   94: ifeq +36 -> 130
    //   97: new 86	java/lang/StringBuffer
    //   100: dup
    //   101: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   104: astore 71
    //   106: aload 71
    //   108: ldc 89
    //   110: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   113: pop
    //   114: aload 71
    //   116: aload 5
    //   118: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   121: pop
    //   122: aload 71
    //   124: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   127: invokestatic 101	bsh/Interpreter:debug	(Ljava/lang/String;)V
    //   130: aload_0
    //   131: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   134: ifnonnull +29 -> 163
    //   137: aload_0
    //   138: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   141: astore 74
    //   143: iconst_0
    //   144: istore 75
    //   146: aload_0
    //   147: aload_1
    //   148: aload 74
    //   150: aload_2
    //   151: aload 5
    //   153: iload 75
    //   155: invokevirtual 63	bsh/Name:a	(Lbsh/CallStack;Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;Z)Ljava/lang/Object;
    //   158: astore 76
    //   160: goto +21 -> 181
    //   163: aload_0
    //   164: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   167: checkcast 79	bsh/This
    //   170: getfield 103	bsh/This:a	Lbsh/NameSpace;
    //   173: astore 74
    //   175: iconst_1
    //   176: istore 75
    //   178: goto -32 -> 146
    //   181: aload 76
    //   183: getstatic 69	bsh/Primitive:VOID	Lbsh/Primitive;
    //   186: if_acmpeq +76 -> 262
    //   189: getstatic 84	bsh/Interpreter:DEBUG	Z
    //   192: ifeq +54 -> 246
    //   195: new 86	java/lang/StringBuffer
    //   198: dup
    //   199: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   202: astore 77
    //   204: aload 77
    //   206: ldc 105
    //   208: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   211: pop
    //   212: aload 77
    //   214: aload 5
    //   216: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   219: pop
    //   220: aload 77
    //   222: ldc 107
    //   224: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   227: pop
    //   228: aload 77
    //   230: aload_0
    //   231: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   234: invokevirtual 110	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   237: pop
    //   238: aload 77
    //   240: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   243: invokestatic 101	bsh/Interpreter:debug	(Ljava/lang/String;)V
    //   246: aload_0
    //   247: aload 5
    //   249: aload_0
    //   250: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   253: invokestatic 113	bsh/Name:c	(Ljava/lang/String;)Ljava/lang/String;
    //   256: aload 76
    //   258: invokespecial 74	bsh/Name:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   261: areturn
    //   262: aload_0
    //   263: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   266: ifnonnull +183 -> 449
    //   269: getstatic 84	bsh/Interpreter:DEBUG	Z
    //   272: ifeq +38 -> 310
    //   275: new 86	java/lang/StringBuffer
    //   278: dup
    //   279: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   282: astore 62
    //   284: aload 62
    //   286: ldc 115
    //   288: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   291: pop
    //   292: aload 62
    //   294: aload_0
    //   295: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   298: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   301: pop
    //   302: aload 62
    //   304: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   307: invokestatic 101	bsh/Interpreter:debug	(Ljava/lang/String;)V
    //   310: aconst_null
    //   311: astore 65
    //   313: aconst_null
    //   314: astore 66
    //   316: iconst_1
    //   317: istore 67
    //   319: iload 67
    //   321: aload_0
    //   322: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   325: invokestatic 117	bsh/Name:a	(Ljava/lang/String;)I
    //   328: if_icmple +6 -> 334
    //   331: goto +30 -> 361
    //   334: aload_0
    //   335: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   338: iload 67
    //   340: invokestatic 77	bsh/Name:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   343: astore 66
    //   345: aload_0
    //   346: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   349: aload 66
    //   351: invokevirtual 121	bsh/NameSpace:getClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   354: astore 65
    //   356: aload 65
    //   358: ifnull +85 -> 443
    //   361: aload 65
    //   363: ifnull +36 -> 399
    //   366: aload_0
    //   367: aload 66
    //   369: aload_0
    //   370: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   373: aload_0
    //   374: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   377: invokestatic 117	bsh/Name:a	(Ljava/lang/String;)I
    //   380: iload 67
    //   382: isub
    //   383: invokestatic 124	bsh/Name:suffix	(Ljava/lang/String;I)Ljava/lang/String;
    //   386: new 126	bsh/ClassIdentifier
    //   389: dup
    //   390: aload 65
    //   392: invokespecial 129	bsh/ClassIdentifier:<init>	(Ljava/lang/Class;)V
    //   395: invokespecial 74	bsh/Name:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   398: areturn
    //   399: getstatic 84	bsh/Interpreter:DEBUG	Z
    //   402: ifeq +47 -> 449
    //   405: new 86	java/lang/StringBuffer
    //   408: dup
    //   409: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   412: astore 68
    //   414: aload 68
    //   416: ldc -125
    //   418: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   421: pop
    //   422: aload 68
    //   424: aload_0
    //   425: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   428: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   431: pop
    //   432: aload 68
    //   434: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   437: invokestatic 101	bsh/Interpreter:debug	(Ljava/lang/String;)V
    //   440: goto +9 -> 449
    //   443: iinc 67 1
    //   446: goto -127 -> 319
    //   449: aload_0
    //   450: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   453: ifnull +13 -> 466
    //   456: aload_0
    //   457: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   460: instanceof 79
    //   463: ifeq +111 -> 574
    //   466: iload_3
    //   467: ifne +107 -> 574
    //   470: iload 4
    //   472: ifeq +102 -> 574
    //   475: aload_0
    //   476: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   479: ifnonnull +12 -> 491
    //   482: aload_0
    //   483: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   486: astore 57
    //   488: goto +15 -> 503
    //   491: aload_0
    //   492: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   495: checkcast 79	bsh/This
    //   498: getfield 103	bsh/This:a	Lbsh/NameSpace;
    //   501: astore 57
    //   503: new 86	java/lang/StringBuffer
    //   506: dup
    //   507: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   510: astore 58
    //   512: aload 58
    //   514: ldc -123
    //   516: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   519: pop
    //   520: aload 58
    //   522: aload 5
    //   524: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   527: pop
    //   528: new 40	bsh/NameSpace
    //   531: dup
    //   532: aload 57
    //   534: aload 58
    //   536: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   539: invokespecial 135	bsh/NameSpace:<init>	(Lbsh/NameSpace;Ljava/lang/String;)V
    //   542: aload_2
    //   543: invokevirtual 138	bsh/NameSpace:a	(Lbsh/Interpreter;)Lbsh/This;
    //   546: astore 61
    //   548: aload 57
    //   550: aload 5
    //   552: aload 61
    //   554: iconst_0
    //   555: invokevirtual 142	bsh/NameSpace:setVariable	(Ljava/lang/String;Ljava/lang/Object;Z)V
    //   558: aload_0
    //   559: aload 5
    //   561: aload_0
    //   562: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   565: invokestatic 113	bsh/Name:c	(Ljava/lang/String;)Ljava/lang/String;
    //   568: aload 61
    //   570: invokespecial 74	bsh/Name:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   573: areturn
    //   574: aload_0
    //   575: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   578: ifnonnull +68 -> 646
    //   581: aload_0
    //   582: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   585: invokestatic 60	bsh/Name:isCompound	(Ljava/lang/String;)Z
    //   588: ifne +18 -> 606
    //   591: aload_0
    //   592: aload_0
    //   593: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   596: getstatic 71	bsh/Name:f	Ljava/lang/String;
    //   599: getstatic 69	bsh/Primitive:VOID	Lbsh/Primitive;
    //   602: invokespecial 74	bsh/Name:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   605: areturn
    //   606: new 86	java/lang/StringBuffer
    //   609: dup
    //   610: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   613: astore 54
    //   615: aload 54
    //   617: ldc -112
    //   619: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   622: pop
    //   623: aload 54
    //   625: aload_0
    //   626: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   629: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   632: pop
    //   633: new 146	bsh/UtilEvalError
    //   636: dup
    //   637: aload 54
    //   639: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   642: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   645: athrow
    //   646: aload_0
    //   647: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   650: getstatic 151	bsh/Primitive:NULL	Lbsh/Primitive;
    //   653: if_acmpne +50 -> 703
    //   656: new 86	java/lang/StringBuffer
    //   659: dup
    //   660: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   663: astore 6
    //   665: aload 6
    //   667: ldc -103
    //   669: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   672: pop
    //   673: aload 6
    //   675: aload_0
    //   676: getfield 28	bsh/Name:a	Ljava/lang/String;
    //   679: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   682: pop
    //   683: new 155	bsh/UtilTargetError
    //   686: dup
    //   687: new 157	java/lang/NullPointerException
    //   690: dup
    //   691: aload 6
    //   693: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   696: invokespecial 158	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   699: invokespecial 161	bsh/UtilTargetError:<init>	(Ljava/lang/Throwable;)V
    //   702: athrow
    //   703: aload_0
    //   704: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   707: getstatic 69	bsh/Primitive:VOID	Lbsh/Primitive;
    //   710: if_acmpne +43 -> 753
    //   713: new 86	java/lang/StringBuffer
    //   716: dup
    //   717: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   720: astore 9
    //   722: aload 9
    //   724: ldc -93
    //   726: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   729: pop
    //   730: aload 9
    //   732: aload_0
    //   733: getfield 28	bsh/Name:a	Ljava/lang/String;
    //   736: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   739: pop
    //   740: new 146	bsh/UtilEvalError
    //   743: dup
    //   744: aload 9
    //   746: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   749: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   752: athrow
    //   753: aload_0
    //   754: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   757: instanceof 65
    //   760: ifeq +43 -> 803
    //   763: new 86	java/lang/StringBuffer
    //   766: dup
    //   767: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   770: astore 12
    //   772: aload 12
    //   774: ldc -91
    //   776: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   779: pop
    //   780: aload 12
    //   782: aload_0
    //   783: getfield 28	bsh/Name:a	Ljava/lang/String;
    //   786: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   789: pop
    //   790: new 146	bsh/UtilEvalError
    //   793: dup
    //   794: aload 12
    //   796: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   799: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   802: athrow
    //   803: aload_0
    //   804: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   807: instanceof 126
    //   810: ifeq +395 -> 1205
    //   813: aload_0
    //   814: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   817: checkcast 126	bsh/ClassIdentifier
    //   820: invokevirtual 169	bsh/ClassIdentifier:getTargetClass	()Ljava/lang/Class;
    //   823: astore 27
    //   825: aload_0
    //   826: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   829: iconst_1
    //   830: invokestatic 77	bsh/Name:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   833: astore 28
    //   835: aload 28
    //   837: ldc -85
    //   839: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   842: ifeq +102 -> 944
    //   845: aload_0
    //   846: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   849: astore 50
    //   851: aload 50
    //   853: ifnonnull +41 -> 894
    //   856: new 86	java/lang/StringBuffer
    //   859: dup
    //   860: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   863: astore 51
    //   865: aload 51
    //   867: ldc -79
    //   869: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   872: pop
    //   873: aload 51
    //   875: aload 27
    //   877: invokevirtual 110	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   880: pop
    //   881: new 146	bsh/UtilEvalError
    //   884: dup
    //   885: aload 51
    //   887: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   890: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   893: athrow
    //   894: aload 50
    //   896: getfield 179	bsh/NameSpace:f	Ljava/lang/Object;
    //   899: ifnull +35 -> 934
    //   902: aload 50
    //   904: getfield 179	bsh/NameSpace:f	Ljava/lang/Object;
    //   907: invokevirtual 181	java/lang/Object:getClass	()Ljava/lang/Class;
    //   910: aload 27
    //   912: if_acmpne +22 -> 934
    //   915: aload_0
    //   916: aload 28
    //   918: aload_0
    //   919: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   922: invokestatic 113	bsh/Name:c	(Ljava/lang/String;)Ljava/lang/String;
    //   925: aload 50
    //   927: getfield 179	bsh/NameSpace:f	Ljava/lang/Object;
    //   930: invokespecial 74	bsh/Name:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   933: areturn
    //   934: aload 50
    //   936: invokevirtual 49	bsh/NameSpace:getParent	()Lbsh/NameSpace;
    //   939: astore 50
    //   941: goto -90 -> 851
    //   944: getstatic 84	bsh/Interpreter:DEBUG	Z
    //   947: ifeq +52 -> 999
    //   950: new 86	java/lang/StringBuffer
    //   953: dup
    //   954: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   957: astore 45
    //   959: aload 45
    //   961: ldc -73
    //   963: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   966: pop
    //   967: aload 45
    //   969: aload 27
    //   971: invokevirtual 110	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   974: pop
    //   975: aload 45
    //   977: ldc -71
    //   979: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   982: pop
    //   983: aload 45
    //   985: aload 28
    //   987: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   990: pop
    //   991: aload 45
    //   993: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   996: invokestatic 101	bsh/Interpreter:debug	(Ljava/lang/String;)V
    //   999: aload 27
    //   1001: aload 28
    //   1003: invokestatic 191	bsh/Reflect:getStaticFieldValue	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   1006: astore 33
    //   1008: goto +47 -> 1055
    //   1011: astore 29
    //   1013: getstatic 84	bsh/Interpreter:DEBUG	Z
    //   1016: ifeq +36 -> 1052
    //   1019: new 86	java/lang/StringBuffer
    //   1022: dup
    //   1023: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   1026: astore 30
    //   1028: aload 30
    //   1030: ldc -63
    //   1032: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1035: pop
    //   1036: aload 30
    //   1038: aload 29
    //   1040: invokevirtual 110	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   1043: pop
    //   1044: aload 30
    //   1046: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1049: invokestatic 101	bsh/Interpreter:debug	(Ljava/lang/String;)V
    //   1052: aconst_null
    //   1053: astore 33
    //   1055: aload 33
    //   1057: ifnonnull +73 -> 1130
    //   1060: new 86	java/lang/StringBuffer
    //   1063: dup
    //   1064: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   1067: astore 34
    //   1069: aload 34
    //   1071: aload 27
    //   1073: invokevirtual 198	java/lang/Class:getName	()Ljava/lang/String;
    //   1076: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1079: pop
    //   1080: aload 34
    //   1082: ldc -56
    //   1084: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1087: pop
    //   1088: aload 34
    //   1090: aload 28
    //   1092: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1095: pop
    //   1096: aload 34
    //   1098: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1101: astore 38
    //   1103: aload_0
    //   1104: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   1107: aload 38
    //   1109: invokevirtual 121	bsh/NameSpace:getClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   1112: astore 39
    //   1114: aload 39
    //   1116: ifnull +14 -> 1130
    //   1119: new 126	bsh/ClassIdentifier
    //   1122: dup
    //   1123: aload 39
    //   1125: invokespecial 129	bsh/ClassIdentifier:<init>	(Ljava/lang/Class;)V
    //   1128: astore 33
    //   1130: aload 33
    //   1132: ifnonnull +57 -> 1189
    //   1135: new 86	java/lang/StringBuffer
    //   1138: dup
    //   1139: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   1142: astore 40
    //   1144: aload 40
    //   1146: ldc -54
    //   1148: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1151: pop
    //   1152: aload 40
    //   1154: aload 28
    //   1156: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1159: pop
    //   1160: aload 40
    //   1162: ldc -52
    //   1164: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1167: pop
    //   1168: aload 40
    //   1170: aload 27
    //   1172: invokevirtual 110	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   1175: pop
    //   1176: new 146	bsh/UtilEvalError
    //   1179: dup
    //   1180: aload 40
    //   1182: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1185: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   1188: athrow
    //   1189: aload_0
    //   1190: aload 28
    //   1192: aload_0
    //   1193: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   1196: invokestatic 113	bsh/Name:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1199: aload 33
    //   1201: invokespecial 74	bsh/Name:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   1204: areturn
    //   1205: iload_3
    //   1206: ifeq +43 -> 1249
    //   1209: new 86	java/lang/StringBuffer
    //   1212: dup
    //   1213: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   1216: astore 15
    //   1218: aload 15
    //   1220: aload_0
    //   1221: getfield 28	bsh/Name:a	Ljava/lang/String;
    //   1224: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1227: pop
    //   1228: aload 15
    //   1230: ldc -50
    //   1232: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1235: pop
    //   1236: new 146	bsh/UtilEvalError
    //   1239: dup
    //   1240: aload 15
    //   1242: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1245: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   1248: athrow
    //   1249: aload_0
    //   1250: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   1253: iconst_1
    //   1254: invokestatic 77	bsh/Name:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   1257: astore 18
    //   1259: aload 18
    //   1261: ldc -48
    //   1263: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1266: ifeq +48 -> 1314
    //   1269: aload_0
    //   1270: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   1273: invokevirtual 181	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1276: invokevirtual 212	java/lang/Class:isArray	()Z
    //   1279: ifeq +35 -> 1314
    //   1282: new 65	bsh/Primitive
    //   1285: dup
    //   1286: aload_0
    //   1287: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   1290: invokestatic 218	java/lang/reflect/Array:getLength	(Ljava/lang/Object;)I
    //   1293: invokespecial 221	bsh/Primitive:<init>	(I)V
    //   1296: astore 26
    //   1298: aload_0
    //   1299: aload 18
    //   1301: aload_0
    //   1302: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   1305: invokestatic 113	bsh/Name:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1308: aload 26
    //   1310: invokespecial 74	bsh/Name:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   1313: areturn
    //   1314: aload_0
    //   1315: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   1318: aload 18
    //   1320: invokestatic 225	bsh/Reflect:getObjectFieldValue	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   1323: astore 24
    //   1325: aload_0
    //   1326: aload 18
    //   1328: aload_0
    //   1329: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   1332: invokestatic 113	bsh/Name:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1335: aload 24
    //   1337: invokespecial 74	bsh/Name:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   1340: astore 25
    //   1342: aload 25
    //   1344: areturn
    //   1345: new 86	java/lang/StringBuffer
    //   1348: dup
    //   1349: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   1352: astore 19
    //   1354: aload 19
    //   1356: ldc -29
    //   1358: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1361: pop
    //   1362: aload 19
    //   1364: aload 18
    //   1366: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1369: pop
    //   1370: aload 19
    //   1372: ldc -27
    //   1374: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1377: pop
    //   1378: aload 19
    //   1380: aload_0
    //   1381: getfield 54	bsh/Name:g	Ljava/lang/Object;
    //   1384: invokevirtual 110	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   1387: pop
    //   1388: new 146	bsh/UtilEvalError
    //   1391: dup
    //   1392: aload 19
    //   1394: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1397: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   1400: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1401	0	this	Name
    //   0	1401	1	paramCallStack	CallStack
    //   0	1401	2	paramInterpreter	Interpreter
    //   0	1401	3	paramBoolean1	boolean
    //   0	1401	4	paramBoolean2	boolean
    //   68	492	5	str1	String
    //   663	29	6	localStringBuffer1	StringBuffer
    //   720	25	9	localStringBuffer2	StringBuffer
    //   770	25	12	localStringBuffer3	StringBuffer
    //   1216	25	15	localStringBuffer4	StringBuffer
    //   1257	108	18	str2	String
    //   1352	41	19	localStringBuffer5	StringBuffer
    //   1323	13	24	localObject1	Object
    //   1340	3	25	localObject2	Object
    //   1296	13	26	localPrimitive	Primitive
    //   823	348	27	localClass1	Class
    //   833	358	28	str3	String
    //   1011	28	29	localReflectError1	ReflectError
    //   1026	19	30	localStringBuffer6	StringBuffer
    //   1006	194	33	localObject3	Object
    //   1067	30	34	localStringBuffer7	StringBuffer
    //   1101	7	38	str4	String
    //   1112	12	39	localClass2	Class
    //   1142	39	40	localStringBuffer8	StringBuffer
    //   1345	1	42	localReflectError2	ReflectError
    //   957	35	45	localStringBuffer9	StringBuffer
    //   849	91	50	localNameSpace1	NameSpace
    //   863	23	51	localStringBuffer10	StringBuffer
    //   613	25	54	localStringBuffer11	StringBuffer
    //   486	63	57	localNameSpace2	NameSpace
    //   510	25	58	localStringBuffer12	StringBuffer
    //   546	23	61	localThis	This
    //   282	21	62	localStringBuffer13	StringBuffer
    //   311	80	65	localClass3	Class
    //   314	54	66	str5	String
    //   317	127	67	i	int
    //   412	21	68	localStringBuffer14	StringBuffer
    //   104	19	71	localStringBuffer15	StringBuffer
    //   141	33	74	localNameSpace3	NameSpace
    //   144	33	75	bool	boolean
    //   158	99	76	localObject4	Object
    //   202	37	77	localStringBuffer16	StringBuffer
    //   36	19	82	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   944	999	1011	bsh/ReflectError
    //   999	1008	1011	bsh/ReflectError
    //   1314	1342	1345	bsh/ReflectError
  }
  
  /* Error */
  private Object a(Interpreter paramInterpreter, Object[] paramArrayOfObject, CallStack paramCallStack, SimpleNode paramSimpleNode)
  {
    // Byte code:
    //   0: getstatic 84	bsh/Interpreter:DEBUG	Z
    //   3: ifeq +38 -> 41
    //   6: new 86	java/lang/StringBuffer
    //   9: dup
    //   10: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   13: astore 5
    //   15: aload 5
    //   17: ldc -24
    //   19: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   22: pop
    //   23: aload 5
    //   25: aload_0
    //   26: getfield 28	bsh/Name:a	Ljava/lang/String;
    //   29: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   32: pop
    //   33: aload 5
    //   35: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   38: invokestatic 101	bsh/Interpreter:debug	(Ljava/lang/String;)V
    //   41: aload_1
    //   42: ifnonnull +13 -> 55
    //   45: new 234	bsh/InterpreterError
    //   48: dup
    //   49: ldc -20
    //   51: invokespecial 237	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   54: athrow
    //   55: aload_0
    //   56: getfield 28	bsh/Name:a	Ljava/lang/String;
    //   59: astore 8
    //   61: aload_2
    //   62: invokestatic 243	bsh/Types:getTypes	([Ljava/lang/Object;)[Ljava/lang/Class;
    //   65: astore 9
    //   67: aload_0
    //   68: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   71: aload 8
    //   73: aload 9
    //   75: invokevirtual 247	bsh/NameSpace:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;
    //   78: astore 11
    //   80: aload 11
    //   82: ifnull +14 -> 96
    //   85: aload 11
    //   87: aload_2
    //   88: aload_1
    //   89: aload_3
    //   90: aload 4
    //   92: invokevirtual 253	bsh/BshMethod:invoke	([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/SimpleNode;)Ljava/lang/Object;
    //   95: areturn
    //   96: aload_1
    //   97: invokevirtual 257	bsh/Interpreter:getClassManager	()Lbsh/BshClassManager;
    //   100: pop
    //   101: aload_0
    //   102: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   105: aload 8
    //   107: aload 9
    //   109: aload_1
    //   110: invokevirtual 261	bsh/NameSpace:getCommand	(Ljava/lang/String;[Ljava/lang/Class;Lbsh/Interpreter;)Ljava/lang/Object;
    //   113: astore 14
    //   115: aload 14
    //   117: ifnonnull +116 -> 233
    //   120: aload_0
    //   121: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   124: ldc_w 262
    //   127: iconst_2
    //   128: anewarray 195	java/lang/Class
    //   131: dup
    //   132: iconst_0
    //   133: aconst_null
    //   134: aastore
    //   135: dup
    //   136: iconst_1
    //   137: aconst_null
    //   138: aastore
    //   139: invokevirtual 247	bsh/NameSpace:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;
    //   142: astore 18
    //   144: aload 18
    //   146: ifnull +26 -> 172
    //   149: aload 18
    //   151: iconst_2
    //   152: anewarray 4	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload 8
    //   159: aastore
    //   160: dup
    //   161: iconst_1
    //   162: aload_2
    //   163: aastore
    //   164: aload_1
    //   165: aload_3
    //   166: aload 4
    //   168: invokevirtual 253	bsh/BshMethod:invoke	([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/SimpleNode;)Ljava/lang/Object;
    //   171: areturn
    //   172: new 86	java/lang/StringBuffer
    //   175: dup
    //   176: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   179: astore 19
    //   181: aload 19
    //   183: ldc_w 264
    //   186: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   189: pop
    //   190: aload 19
    //   192: aload 8
    //   194: aload 9
    //   196: invokestatic 270	bsh/StringUtil:methodString	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;
    //   199: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   202: pop
    //   203: new 272	bsh/EvalError
    //   206: dup
    //   207: aload 19
    //   209: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   212: aload 4
    //   214: aload_3
    //   215: invokespecial 275	bsh/EvalError:<init>	(Ljava/lang/String;Lbsh/SimpleNode;Lbsh/CallStack;)V
    //   218: athrow
    //   219: astore 17
    //   221: aload 17
    //   223: ldc_w 277
    //   226: aload 4
    //   228: aload_3
    //   229: invokevirtual 281	bsh/UtilEvalError:toEvalError	(Ljava/lang/String;Lbsh/SimpleNode;Lbsh/CallStack;)Lbsh/EvalError;
    //   232: athrow
    //   233: aload 14
    //   235: instanceof 249
    //   238: ifeq +17 -> 255
    //   241: aload 14
    //   243: checkcast 249	bsh/BshMethod
    //   246: aload_2
    //   247: aload_1
    //   248: aload_3
    //   249: aload 4
    //   251: invokevirtual 253	bsh/BshMethod:invoke	([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/SimpleNode;)Ljava/lang/Object;
    //   254: areturn
    //   255: aload 14
    //   257: instanceof 195
    //   260: ifeq +33 -> 293
    //   263: aload 14
    //   265: checkcast 195	java/lang/Class
    //   268: aload_2
    //   269: aload_1
    //   270: aload_3
    //   271: invokestatic 285	bsh/Reflect:invokeCompiledCommand	(Ljava/lang/Class;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;)Ljava/lang/Object;
    //   274: astore 16
    //   276: aload 16
    //   278: areturn
    //   279: astore 15
    //   281: aload 15
    //   283: ldc_w 287
    //   286: aload 4
    //   288: aload_3
    //   289: invokevirtual 281	bsh/UtilEvalError:toEvalError	(Ljava/lang/String;Lbsh/SimpleNode;Lbsh/CallStack;)Lbsh/EvalError;
    //   292: athrow
    //   293: new 234	bsh/InterpreterError
    //   296: dup
    //   297: ldc_w 289
    //   300: invokespecial 237	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   303: athrow
    //   304: astore 13
    //   306: aload 13
    //   308: ldc_w 291
    //   311: aload 4
    //   313: aload_3
    //   314: invokevirtual 281	bsh/UtilEvalError:toEvalError	(Ljava/lang/String;Lbsh/SimpleNode;Lbsh/CallStack;)Lbsh/EvalError;
    //   317: athrow
    //   318: astore 10
    //   320: aload 10
    //   322: ldc_w 277
    //   325: aload 4
    //   327: aload_3
    //   328: invokevirtual 281	bsh/UtilEvalError:toEvalError	(Ljava/lang/String;Lbsh/SimpleNode;Lbsh/CallStack;)Lbsh/EvalError;
    //   331: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	332	0	this	Name
    //   0	332	1	paramInterpreter	Interpreter
    //   0	332	2	paramArrayOfObject	Object[]
    //   0	332	3	paramCallStack	CallStack
    //   0	332	4	paramSimpleNode	SimpleNode
    //   13	21	5	localStringBuffer1	StringBuffer
    //   59	134	8	str	String
    //   65	130	9	arrayOfClass	Class[]
    //   318	3	10	localUtilEvalError1	UtilEvalError
    //   78	8	11	localBshMethod1	BshMethod
    //   304	3	13	localUtilEvalError2	UtilEvalError
    //   113	151	14	localObject1	Object
    //   279	3	15	localUtilEvalError3	UtilEvalError
    //   274	3	16	localObject2	Object
    //   219	3	17	localUtilEvalError4	UtilEvalError
    //   142	8	18	localBshMethod2	BshMethod
    //   179	29	19	localStringBuffer2	StringBuffer
    // Exception table:
    //   from	to	target	type
    //   120	144	219	bsh/UtilEvalError
    //   263	276	279	bsh/UtilEvalError
    //   101	115	304	bsh/UtilEvalError
    //   67	80	318	bsh/UtilEvalError
  }
  
  private Object a(String paramString1, String paramString2, Object paramObject)
  {
    if (paramObject == null)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("lastEvalName = ");
      localStringBuffer.append(paramString1);
      throw new InterpreterError(localStringBuffer.toString());
    }
    this.e = paramString1;
    this.d = paramString2;
    this.g = paramObject;
    return paramObject;
  }
  
  static String a(String paramString, int paramInt)
  {
    if (paramInt < 1) {
      return null;
    }
    int i = -1;
    int j = 0;
    do
    {
      i = paramString.indexOf('.', i + 1);
      if (i == -1) {
        break;
      }
      j++;
    } while (j < paramInt);
    if (i == -1) {
      return paramString;
    }
    return paramString.substring(0, i);
  }
  
  private void a()
  {
    this.d = this.a;
    this.g = null;
    this.h = 0;
  }
  
  static String b(String paramString)
  {
    if (!isCompound(paramString)) {
      return null;
    }
    return a(paramString, -1 + a(paramString));
  }
  
  static String c(String paramString)
  {
    if (!isCompound(paramString)) {
      return null;
    }
    return suffix(paramString, -1 + a(paramString));
  }
  
  public static boolean isCompound(String paramString)
  {
    return paramString.indexOf('.') != -1;
  }
  
  public static String suffix(String paramString, int paramInt)
  {
    if (paramInt < 1) {
      return null;
    }
    int i = 0;
    int j = 1 + paramString.length();
    do
    {
      j = paramString.lastIndexOf('.', j - 1);
      if (j == -1) {
        break;
      }
      i++;
    } while (i < paramInt);
    if (j == -1) {
      return paramString;
    }
    return paramString.substring(j + 1);
  }
  
  Object a(CallStack paramCallStack, NameSpace paramNameSpace, Interpreter paramInterpreter, String paramString, boolean paramBoolean)
  {
    if (paramString.equals("this"))
    {
      if (paramBoolean) {
        throw new UtilEvalError("Redundant to call .this on This type");
      }
      Object localObject2 = paramNameSpace.a(paramInterpreter);
      NameSpace localNameSpace2 = a(((This)localObject2).getNameSpace());
      if (localNameSpace2 != null)
      {
        if (isCompound(this.d)) {
          return localNameSpace2.a(paramInterpreter);
        }
        localObject2 = localNameSpace2.a();
      }
      return localObject2;
    }
    if (paramString.equals("super"))
    {
      This localThis = paramNameSpace.getSuper(paramInterpreter);
      NameSpace localNameSpace1 = localThis.getNameSpace();
      if ((localNameSpace1.getParent() != null) && (localNameSpace1.getParent().d)) {
        localThis = localNameSpace1.getParent().a(paramInterpreter);
      }
      return localThis;
    }
    boolean bool = paramString.equals("global");
    Object localObject1 = null;
    if (bool) {
      localObject1 = paramNameSpace.getGlobal(paramInterpreter);
    }
    if ((localObject1 == null) && (paramBoolean)) {
      if (paramString.equals("namespace")) {
        localObject1 = paramNameSpace;
      } else if (paramString.equals("variables")) {
        localObject1 = paramNameSpace.getVariableNames();
      } else if (paramString.equals("methods")) {
        localObject1 = paramNameSpace.getMethodNames();
      } else if (paramString.equals("interpreter")) {
        if (this.e.equals("this")) {
          localObject1 = paramInterpreter;
        } else {
          throw new UtilEvalError("Can only call .interpreter on literal 'this'");
        }
      }
    }
    if ((localObject1 == null) && (paramBoolean) && (paramString.equals("caller")))
    {
      if ((!this.e.equals("this")) && (!this.e.equals("caller"))) {
        throw new UtilEvalError("Can only call .caller on literal 'this' or literal '.caller'");
      }
      if (paramCallStack == null) {
        throw new InterpreterError("no callstack");
      }
      int i = 1 + this.h;
      this.h = i;
      return paramCallStack.get(i).a(paramInterpreter);
    }
    if ((localObject1 == null) && (paramBoolean) && (paramString.equals("callstack")))
    {
      if (this.e.equals("this"))
      {
        if (paramCallStack == null) {
          throw new InterpreterError("no callstack");
        }
      }
      else {
        throw new UtilEvalError("Can only call .callstack on literal 'this'");
      }
    }
    else {
      paramCallStack = (CallStack)localObject1;
    }
    if (paramCallStack == null) {
      paramCallStack = paramNameSpace.getVariable(paramString);
    }
    if (paramCallStack == null)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("null this field ref:");
      localStringBuffer.append(paramString);
      throw new InterpreterError(localStringBuffer.toString());
    }
    return paramCallStack;
  }
  
  public Object invokeMethod(Interpreter paramInterpreter, Object[] paramArrayOfObject, CallStack paramCallStack, SimpleNode paramSimpleNode)
  {
    String str1 = suffix(this.a, 1);
    BshClassManager localBshClassManager = paramInterpreter.getClassManager();
    NameSpace localNameSpace1 = paramCallStack.top();
    if (this.c != null) {
      return Reflect.invokeStaticMethod(localBshClassManager, this.c, str1, paramArrayOfObject);
    }
    if (!isCompound(this.a)) {
      return a(paramInterpreter, paramArrayOfObject, paramCallStack, paramSimpleNode);
    }
    String str2 = b(this.a);
    if ((str2.equals("super")) && (a(this.a) == 2))
    {
      NameSpace localNameSpace2 = a(localNameSpace1.a(paramInterpreter).getNameSpace());
      if (localNameSpace2 != null)
      {
        Object localObject2 = localNameSpace2.a();
        return ClassGenerator.getClassGenerator().invokeSuperclassMethod(localBshClassManager, localObject2, str1, paramArrayOfObject);
      }
    }
    Name localName = localNameSpace1.b(str2);
    Object localObject1 = localName.toObject(paramCallStack, paramInterpreter);
    if (localObject1 == Primitive.VOID)
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append("Attempt to resolve method: ");
      localStringBuffer1.append(str1);
      localStringBuffer1.append("() on undefined variable or class name: ");
      localStringBuffer1.append(localName);
      throw new UtilEvalError(localStringBuffer1.toString());
    }
    if (!(localObject1 instanceof ClassIdentifier))
    {
      if ((localObject1 instanceof Primitive))
      {
        if (localObject1 == Primitive.NULL) {
          throw new UtilTargetError(new NullPointerException("Null Pointer in Method Invocation"));
        }
        if (Interpreter.DEBUG) {
          Interpreter.debug("Attempt to access method on primitive... allowing bsh.Primitive to peek through for debugging");
        }
      }
      return Reflect.invokeObjectMethod(localObject1, str1, paramArrayOfObject, paramInterpreter, paramCallStack, paramSimpleNode);
    }
    if (Interpreter.DEBUG)
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("invokeMethod: trying static - ");
      localStringBuffer2.append(localName);
      Interpreter.debug(localStringBuffer2.toString());
    }
    Class localClass = ((ClassIdentifier)localObject1).getTargetClass();
    this.c = localClass;
    if (localClass != null) {
      return Reflect.invokeStaticMethod(localBshClassManager, localClass, str1, paramArrayOfObject);
    }
    StringBuffer localStringBuffer3 = new StringBuffer();
    localStringBuffer3.append("invokeMethod: unknown target: ");
    localStringBuffer3.append(localName);
    throw new UtilEvalError(localStringBuffer3.toString());
  }
  
  public Class toClass()
  {
    try
    {
      if (this.b != null)
      {
        Class localClass3 = this.b;
        return localClass3;
      }
      a();
      boolean bool = this.d.equals("var");
      Object localObject2 = null;
      if (bool)
      {
        this.b = null;
        return null;
      }
      Class localClass1 = this.namespace.getClass(this.d);
      if (localClass1 == null)
      {
        try
        {
          Object localObject3 = toObject(null, null, true);
          localObject2 = localObject3;
        }
        catch (UtilEvalError localUtilEvalError) {}
        if ((localObject2 instanceof ClassIdentifier)) {
          localClass1 = ((ClassIdentifier)localObject2).getTargetClass();
        }
      }
      if (localClass1 == null)
      {
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("Class: ");
        localStringBuffer.append(this.a);
        localStringBuffer.append(" not found in namespace");
        throw new ClassNotFoundException(localStringBuffer.toString());
      }
      this.b = localClass1;
      Class localClass2 = this.b;
      return localClass2;
    }
    finally {}
  }
  
  /* Error */
  public LHS toLHS(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 423	bsh/Name:a	()V
    //   6: aload_0
    //   7: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   10: invokestatic 60	bsh/Name:isCompound	(Ljava/lang/String;)Z
    //   13: ifne +49 -> 62
    //   16: aload_0
    //   17: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   20: ldc -85
    //   22: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   25: ifeq +14 -> 39
    //   28: new 146	bsh/UtilEvalError
    //   31: dup
    //   32: ldc_w 439
    //   35: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   38: athrow
    //   39: new 441	bsh/LHS
    //   42: dup
    //   43: aload_0
    //   44: getfield 30	bsh/Name:namespace	Lbsh/NameSpace;
    //   47: aload_0
    //   48: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   51: iconst_0
    //   52: invokespecial 444	bsh/LHS:<init>	(Lbsh/NameSpace;Ljava/lang/String;Z)V
    //   55: astore 27
    //   57: aload_0
    //   58: monitorexit
    //   59: aload 27
    //   61: areturn
    //   62: aconst_null
    //   63: astore 4
    //   65: aload_0
    //   66: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   69: ifnull +29 -> 98
    //   72: aload_0
    //   73: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   76: invokestatic 60	bsh/Name:isCompound	(Ljava/lang/String;)Z
    //   79: ifne +6 -> 85
    //   82: goto +16 -> 98
    //   85: aload_0
    //   86: aload_1
    //   87: aload_2
    //   88: iconst_0
    //   89: iconst_1
    //   90: invokespecial 446	bsh/Name:a	(Lbsh/CallStack;Lbsh/Interpreter;ZZ)Ljava/lang/Object;
    //   93: astore 4
    //   95: goto -30 -> 65
    //   98: aload_0
    //   99: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   102: ifnonnull +52 -> 154
    //   105: aload 4
    //   107: instanceof 126
    //   110: ifeq +44 -> 154
    //   113: new 86	java/lang/StringBuffer
    //   116: dup
    //   117: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   120: astore 24
    //   122: aload 24
    //   124: ldc_w 448
    //   127: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   130: pop
    //   131: aload 24
    //   133: aload_0
    //   134: getfield 28	bsh/Name:a	Ljava/lang/String;
    //   137: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   140: pop
    //   141: new 146	bsh/UtilEvalError
    //   144: dup
    //   145: aload 24
    //   147: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   150: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   153: athrow
    //   154: aload 4
    //   156: ifnonnull +44 -> 200
    //   159: new 86	java/lang/StringBuffer
    //   162: dup
    //   163: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   166: astore 9
    //   168: aload 9
    //   170: ldc_w 450
    //   173: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   176: pop
    //   177: aload 9
    //   179: aload_0
    //   180: getfield 28	bsh/Name:a	Ljava/lang/String;
    //   183: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   186: pop
    //   187: new 146	bsh/UtilEvalError
    //   190: dup
    //   191: aload 9
    //   193: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   196: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   199: athrow
    //   200: aload 4
    //   202: instanceof 79
    //   205: ifeq +147 -> 352
    //   208: aload_0
    //   209: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   212: ldc_w 334
    //   215: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   218: ifne +93 -> 311
    //   221: aload_0
    //   222: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   225: ldc_w 336
    //   228: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   231: ifne +80 -> 311
    //   234: aload_0
    //   235: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   238: ldc_w 342
    //   241: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   244: ifne +67 -> 311
    //   247: aload_0
    //   248: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   251: ldc_w 351
    //   254: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   257: ifeq +6 -> 263
    //   260: goto +51 -> 311
    //   263: ldc_w 452
    //   266: invokestatic 101	bsh/Interpreter:debug	(Ljava/lang/String;)V
    //   269: iconst_1
    //   270: aload_0
    //   271: getfield 295	bsh/Name:e	Ljava/lang/String;
    //   274: ldc_w 325
    //   277: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   280: ixor
    //   281: istore 22
    //   283: new 441	bsh/LHS
    //   286: dup
    //   287: aload 4
    //   289: checkcast 79	bsh/This
    //   292: getfield 103	bsh/This:a	Lbsh/NameSpace;
    //   295: aload_0
    //   296: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   299: iload 22
    //   301: invokespecial 444	bsh/LHS:<init>	(Lbsh/NameSpace;Ljava/lang/String;Z)V
    //   304: astore 23
    //   306: aload_0
    //   307: monitorexit
    //   308: aload 23
    //   310: areturn
    //   311: new 86	java/lang/StringBuffer
    //   314: dup
    //   315: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   318: astore 19
    //   320: aload 19
    //   322: ldc_w 454
    //   325: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   328: pop
    //   329: aload 19
    //   331: aload_0
    //   332: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   335: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   338: pop
    //   339: new 146	bsh/UtilEvalError
    //   342: dup
    //   343: aload 19
    //   345: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   348: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   351: athrow
    //   352: aload_0
    //   353: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   356: astore 12
    //   358: aload 12
    //   360: ifnull +90 -> 450
    //   363: aload 4
    //   365: instanceof 126
    //   368: ifeq +25 -> 393
    //   371: aload 4
    //   373: checkcast 126	bsh/ClassIdentifier
    //   376: invokevirtual 169	bsh/ClassIdentifier:getTargetClass	()Ljava/lang/Class;
    //   379: aload_0
    //   380: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   383: invokestatic 457	bsh/Reflect:a	(Ljava/lang/Class;Ljava/lang/String;)Lbsh/LHS;
    //   386: astore 18
    //   388: aload_0
    //   389: monitorexit
    //   390: aload 18
    //   392: areturn
    //   393: aload 4
    //   395: aload_0
    //   396: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   399: invokestatic 460	bsh/Reflect:a	(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;
    //   402: astore 17
    //   404: aload_0
    //   405: monitorexit
    //   406: aload 17
    //   408: areturn
    //   409: astore 13
    //   411: new 86	java/lang/StringBuffer
    //   414: dup
    //   415: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   418: astore 14
    //   420: aload 14
    //   422: ldc_w 462
    //   425: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   428: pop
    //   429: aload 14
    //   431: aload 13
    //   433: invokevirtual 110	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   436: pop
    //   437: new 146	bsh/UtilEvalError
    //   440: dup
    //   441: aload 14
    //   443: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   446: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   449: athrow
    //   450: new 234	bsh/InterpreterError
    //   453: dup
    //   454: ldc_w 464
    //   457: invokespecial 237	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   460: athrow
    //   461: astore 5
    //   463: new 86	java/lang/StringBuffer
    //   466: dup
    //   467: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   470: astore 6
    //   472: aload 6
    //   474: ldc_w 466
    //   477: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   480: pop
    //   481: aload 6
    //   483: aload 5
    //   485: invokevirtual 469	bsh/UtilEvalError:getMessage	()Ljava/lang/String;
    //   488: invokevirtual 93	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   491: pop
    //   492: new 146	bsh/UtilEvalError
    //   495: dup
    //   496: aload 6
    //   498: invokevirtual 97	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   501: invokespecial 148	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   504: athrow
    //   505: astore_3
    //   506: aload_0
    //   507: monitorexit
    //   508: aload_3
    //   509: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	510	0	this	Name
    //   0	510	1	paramCallStack	CallStack
    //   0	510	2	paramInterpreter	Interpreter
    //   505	4	3	localObject1	Object
    //   63	331	4	localObject2	Object
    //   461	23	5	localUtilEvalError	UtilEvalError
    //   470	27	6	localStringBuffer1	StringBuffer
    //   166	26	9	localStringBuffer2	StringBuffer
    //   356	3	12	str	String
    //   409	23	13	localReflectError	ReflectError
    //   418	24	14	localStringBuffer3	StringBuffer
    //   402	5	17	localLHS1	LHS
    //   386	5	18	localLHS2	LHS
    //   318	26	19	localStringBuffer4	StringBuffer
    //   281	19	22	bool	boolean
    //   304	5	23	localLHS3	LHS
    //   120	26	24	localStringBuffer5	StringBuffer
    //   55	5	27	localLHS4	LHS
    // Exception table:
    //   from	to	target	type
    //   363	388	409	bsh/ReflectError
    //   393	404	409	bsh/ReflectError
    //   65	82	461	bsh/UtilEvalError
    //   85	95	461	bsh/UtilEvalError
    //   2	39	505	finally
    //   39	57	505	finally
    //   65	82	505	finally
    //   85	95	505	finally
    //   98	154	505	finally
    //   159	200	505	finally
    //   200	260	505	finally
    //   263	306	505	finally
    //   311	352	505	finally
    //   352	358	505	finally
    //   363	388	505	finally
    //   393	404	505	finally
    //   411	450	505	finally
    //   450	461	505	finally
    //   463	505	505	finally
  }
  
  public Object toObject(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    return toObject(paramCallStack, paramInterpreter, false);
  }
  
  /* Error */
  public Object toObject(CallStack paramCallStack, Interpreter paramInterpreter, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 423	bsh/Name:a	()V
    //   6: aconst_null
    //   7: astore 5
    //   9: aload_0
    //   10: getfield 56	bsh/Name:d	Ljava/lang/String;
    //   13: ifnonnull +24 -> 37
    //   16: aload 5
    //   18: ifnonnull +14 -> 32
    //   21: new 234	bsh/InterpreterError
    //   24: dup
    //   25: ldc_w 471
    //   28: invokespecial 237	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   31: athrow
    //   32: aload_0
    //   33: monitorexit
    //   34: aload 5
    //   36: areturn
    //   37: aload_0
    //   38: aload_1
    //   39: aload_2
    //   40: iload_3
    //   41: iconst_0
    //   42: invokespecial 446	bsh/Name:a	(Lbsh/CallStack;Lbsh/Interpreter;ZZ)Ljava/lang/Object;
    //   45: astore 5
    //   47: goto -38 -> 9
    //   50: astore 4
    //   52: aload_0
    //   53: monitorexit
    //   54: aload 4
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	Name
    //   0	57	1	paramCallStack	CallStack
    //   0	57	2	paramInterpreter	Interpreter
    //   0	57	3	paramBoolean	boolean
    //   50	5	4	localObject1	Object
    //   7	39	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	50	finally
    //   9	16	50	finally
    //   21	32	50	finally
    //   37	47	50	finally
  }
  
  public String toString()
  {
    return this.a;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\Name.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */