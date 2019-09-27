package bsh;

import java.io.IOException;
import java.io.PrintStream;

public class ParserTokenManager
  implements ParserConstants
{
  static final long[] a = { 0L, 0L, -1L, -1L };
  static final long[] b = { -2L, -1L, -1L, -1L };
  static final long[] c = { 2301339413881290750L, -16384L, 4294967295L, 432345564227567616L };
  static final long[] d = { 0L, 0L, 0L, -36028797027352577L };
  static final long[] e = { 0L, -1L, -1L, -1L };
  static final long[] f = { -1L, -1L, 65535L, 0L };
  static final long[] g = { -1L, -1L, 0L, 0L };
  static final long[] h = { 70368744177663L, 0L, 0L, 0L };
  static final int[] i = { 37, 38, 43, 44, 47, 48, 15, 56, 61, 73, 26, 27, 29, 17, 19, 52, 54, 9, 57, 58, 60, 2, 3, 5, 11, 12, 15, 26, 27, 31, 29, 39, 40, 15, 47, 48, 15, 63, 64, 66, 69, 70, 72, 13, 14, 20, 21, 23, 28, 30, 32, 41, 42, 45, 46, 49, 50 };
  static final long[] j = { 2305843009213692929L, -195L, 63L };
  public static final String[] jjstrLiteralImages = { "", null, null, null, null, null, null, null, null, null, "abstract", "boolean", "break", "class", "byte", "case", "catch", "char", "const", "continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "switch", "synchronized", "transient", "throw", "throws", "true", "try", "void", "volatile", "while", null, null, null, null, null, null, null, null, null, null, null, null, "(", ")", "{", "}", "[", "]", ";", ",", ".", "=", ">", "@gt", "<", "@lt", "!", "~", "?", ":", "==", "<=", "@lteq", ">=", "@gteq", "!=", "||", "@or", "&&", "@and", "++", "--", "+", "-", "*", "/", "&", "@bitwise_and", "|", "@bitwise_or", "^", "%", "<<", "@left_shift", ">>", "@right_shift", ">>>", "@right_unsigned_shift", "+=", "-=", "*=", "/=", "&=", "@and_assign", "|=", "@or_assign", "^=", "%=", "<<=", "@left_shift_assign", ">>=", "@right_shift_assign", ">>>=", "@right_unsigned_shift_assign" };
  static final long[] k = { 1022L, 0L, 0L };
  static final long[] l = { 896L, 0L, 0L };
  public static final String[] lexStateNames = { "DEFAULT" };
  public PrintStream debugStream = System.out;
  protected JavaCharStream m;
  protected char n;
  int o = 0;
  int p = 0;
  int q;
  int r;
  int s;
  int t;
  private final int[] u = new int[74];
  private final int[] v = new int[''];
  
  public ParserTokenManager(JavaCharStream paramJavaCharStream)
  {
    this.m = paramJavaCharStream;
  }
  
  public ParserTokenManager(JavaCharStream paramJavaCharStream, int paramInt)
  {
    this(paramJavaCharStream);
    SwitchTo(paramInt);
  }
  
  private final int a(int paramInt1, int paramInt2)
  {
    this.t = paramInt2;
    this.s = paramInt1;
    return paramInt1 + 1;
  }
  
  /* Error */
  private final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: putfield 357	bsh/ParserTokenManager:t	I
    //   5: aload_0
    //   6: iload_1
    //   7: putfield 359	bsh/ParserTokenManager:s	I
    //   10: aload_0
    //   11: aload_0
    //   12: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   15: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   18: putfield 370	bsh/ParserTokenManager:n	C
    //   21: aload_0
    //   22: iload_3
    //   23: iload_1
    //   24: iconst_1
    //   25: iadd
    //   26: invokespecial 372	bsh/ParserTokenManager:e	(II)I
    //   29: ireturn
    //   30: iload_1
    //   31: iconst_1
    //   32: iadd
    //   33: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	ParserTokenManager
    //   0	34	1	paramInt1	int
    //   0	34	2	paramInt2	int
    //   0	34	3	paramInt3	int
    //   30	1	4	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   10	21	30	java/io/IOException
  }
  
  private final int a(int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    int i1;
    switch (paramInt)
    {
    default: 
      return -1;
    case 11: 
      if ((paramLong1 & 0x8000000000000) != 0L) {
        return 35;
      }
      return -1;
    case 10: 
      if ((paramLong1 & 0x8000000000000) != 0L)
      {
        if (this.s != 10)
        {
          this.t = 69;
          this.s = 10;
        }
        return 35;
      }
      return -1;
    case 9: 
      if ((paramLong1 & 0x8000000000000) != 0L)
      {
        this.t = 69;
        i1 = 9;
      }
    case 8: 
    case 7: 
    case 6: 
    case 5: 
      for (;;)
      {
        this.s = i1;
        return 35;
        if ((paramLong1 & 0xA00000000) != 0L) {
          return 35;
        }
        return -1;
        if ((paramLong1 & 0x8000A00000000) != 0L)
        {
          this.t = 69;
          i1 = 8;
        }
        else
        {
          if ((paramLong1 & 0x10102000000000) != 0L) {
            return 35;
          }
          return -1;
          if ((paramLong1 & 0x402000000080400) != 0L) {
            return 35;
          }
          if ((paramLong1 & 0x18102A00000000) != 0L)
          {
            this.t = 69;
            i1 = 7;
          }
          else
          {
            return -1;
            if ((paramLong1 & 0x41A102A00080400) != 0L)
            {
              this.t = 69;
              i1 = 6;
            }
            else
            {
              if ((paramLong1 & 0xC0012100800) != 0L) {
                return 35;
              }
              return -1;
              if ((paramLong1 & 0x41A1C2A12180C00) == 0L) {
                break;
              }
              this.t = 69;
              i1 = 5;
            }
          }
        }
      }
      if ((paramLong1 & 0x45608400400000) != 0L) {
        return 35;
      }
      return -1;
    case 4: 
      if ((paramLong1 & 0x86080003C053000) != 0L) {
        return 35;
      }
      if ((paramLong1 & 0x41F7CAE02580C00) != 0L)
      {
        if (this.s != 4)
        {
          this.t = 69;
          this.s = 4;
        }
        return 35;
      }
      return -1;
    case 3: 
      if ((paramLong1 & 0xC7FFCAE3E5D3C00) != 0L)
      {
        if (this.s != 3)
        {
          this.t = 69;
          this.s = 3;
        }
        return 35;
      }
      if ((paramLong1 & 0x28002408182C000) != 0L) {
        return 35;
      }
      return -1;
    case 2: 
      if ((paramLong1 & 0xEFFFECEBFDFFC00) != 0L)
      {
        if (this.s != 2)
        {
          this.t = 69;
          this.s = 2;
        }
        return 35;
      }
      if ((paramLong1 & 0x100013040000000) != 0L) {
        return 35;
      }
      return -1;
    case 1: 
      if ((paramLong1 & 0x100600000) != 0L) {
        return 35;
      }
      if ((paramLong1 & 0xFFFFFFEFF9FFC00) != 0L)
      {
        if (this.s != 1)
        {
          this.t = 69;
          this.s = 1;
        }
        return 35;
      }
      return -1;
    }
    if ((paramLong2 & 0x200020000000000) != 0L) {
      return 56;
    }
    if ((paramLong1 & 0x3E) != 0L) {
      return 0;
    }
    if ((paramLong2 & 0x10000) != 0L) {
      return 11;
    }
    if ((paramLong1 & 0xFFFFFFFFFFFFC00) != 0L)
    {
      this.t = 69;
      return 35;
    }
    return -1;
  }
  
  /* Error */
  private final int a(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 5
    //   5: lload 5
    //   7: lconst_0
    //   8: lcmp
    //   9: ifne +13 -> 22
    //   12: aload_0
    //   13: bipush 20
    //   15: lconst_0
    //   16: lconst_0
    //   17: lload_1
    //   18: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   21: ireturn
    //   22: aload_0
    //   23: aload_0
    //   24: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   27: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   30: putfield 370	bsh/ParserTokenManager:n	C
    //   33: aload_0
    //   34: getfield 370	bsh/ParserTokenManager:n	C
    //   37: bipush 97
    //   39: if_icmpeq +14 -> 53
    //   42: aload_0
    //   43: bipush 21
    //   45: lconst_0
    //   46: lconst_0
    //   47: lload 5
    //   49: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   52: ireturn
    //   53: aload_0
    //   54: lload 5
    //   56: ldc2_w 421
    //   59: invokespecial 424	bsh/ParserTokenManager:b	(JJ)I
    //   62: ireturn
    //   63: aload_0
    //   64: bipush 21
    //   66: lconst_0
    //   67: lconst_0
    //   68: lload 5
    //   70: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   73: pop
    //   74: bipush 22
    //   76: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	ParserTokenManager
    //   0	77	1	paramLong1	long
    //   0	77	3	paramLong2	long
    //   63	1	4	localIOException	IOException
    //   3	66	5	l1	long
    // Exception table:
    //   from	to	target	type
    //   22	33	63	java/io/IOException
  }
  
  /* Error */
  private final int a(long paramLong1, long paramLong2, long paramLong3)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   5: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   8: putfield 370	bsh/ParserTokenManager:n	C
    //   11: aload_0
    //   12: getfield 370	bsh/ParserTokenManager:n	C
    //   15: lookupswitch	default:+201->216, 38:+823->838, 43:+805->820, 45:+787->802, 60:+754->769, 61:+538->553, 62:+501->516, 97:+485->500, 98:+469->484, 101:+455->470, 102:+435->450, 103:+421->436, 104:+407->422, 105:+393->408, 108:+375->390, 109:+361->376, 110:+347->362, 111:+310->325, 114:+292->307, 116:+278->293, 117:+264->279, 119:+250->265, 120:+236->251, 121:+222->237, 124:+204->219
    //   216: goto +640 -> 856
    //   219: lload_3
    //   220: ldc2_w 428
    //   223: land
    //   224: lconst_0
    //   225: lcmp
    //   226: ifeq +630 -> 856
    //   229: aload_0
    //   230: iconst_1
    //   231: bipush 96
    //   233: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   236: ireturn
    //   237: aload_0
    //   238: lload_1
    //   239: ldc2_w 432
    //   242: lload_3
    //   243: lconst_0
    //   244: lload 5
    //   246: lconst_0
    //   247: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   250: ireturn
    //   251: aload_0
    //   252: lload_1
    //   253: ldc2_w 437
    //   256: lload_3
    //   257: lconst_0
    //   258: lload 5
    //   260: lconst_0
    //   261: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   264: ireturn
    //   265: aload_0
    //   266: lload_1
    //   267: ldc2_w 439
    //   270: lload_3
    //   271: lconst_0
    //   272: lload 5
    //   274: lconst_0
    //   275: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   278: ireturn
    //   279: aload_0
    //   280: lload_1
    //   281: ldc2_w 441
    //   284: lload_3
    //   285: lconst_0
    //   286: lload 5
    //   288: lconst_0
    //   289: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   292: ireturn
    //   293: aload_0
    //   294: lload_1
    //   295: ldc2_w 443
    //   298: lload_3
    //   299: lconst_0
    //   300: lload 5
    //   302: lconst_0
    //   303: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   306: ireturn
    //   307: aload_0
    //   308: lload_1
    //   309: ldc2_w 445
    //   312: lload_3
    //   313: ldc2_w 447
    //   316: lload 5
    //   318: ldc2_w 449
    //   321: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   324: ireturn
    //   325: lload_1
    //   326: ldc2_w 451
    //   329: land
    //   330: lconst_0
    //   331: lcmp
    //   332: ifeq +14 -> 346
    //   335: aload_0
    //   336: bipush 21
    //   338: putfield 357	bsh/ParserTokenManager:t	I
    //   341: aload_0
    //   342: iconst_1
    //   343: putfield 359	bsh/ParserTokenManager:s	I
    //   346: aload_0
    //   347: lload_1
    //   348: ldc2_w 453
    //   351: lload_3
    //   352: ldc2_w 455
    //   355: lload 5
    //   357: lconst_0
    //   358: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   361: ireturn
    //   362: aload_0
    //   363: lload_1
    //   364: ldc2_w 457
    //   367: lload_3
    //   368: lconst_0
    //   369: lload 5
    //   371: lconst_0
    //   372: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   375: ireturn
    //   376: aload_0
    //   377: lload_1
    //   378: ldc2_w 459
    //   381: lload_3
    //   382: lconst_0
    //   383: lload 5
    //   385: lconst_0
    //   386: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   389: ireturn
    //   390: aload_0
    //   391: lload_1
    //   392: ldc2_w 461
    //   395: lload_3
    //   396: ldc2_w 463
    //   399: lload 5
    //   401: ldc2_w 465
    //   404: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   407: ireturn
    //   408: aload_0
    //   409: lload_1
    //   410: ldc2_w 467
    //   413: lload_3
    //   414: lconst_0
    //   415: lload 5
    //   417: lconst_0
    //   418: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   421: ireturn
    //   422: aload_0
    //   423: lload_1
    //   424: ldc2_w 469
    //   427: lload_3
    //   428: lconst_0
    //   429: lload 5
    //   431: lconst_0
    //   432: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   435: ireturn
    //   436: aload_0
    //   437: lload_1
    //   438: lconst_0
    //   439: lload_3
    //   440: ldc2_w 471
    //   443: lload 5
    //   445: lconst_0
    //   446: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   449: ireturn
    //   450: lload_1
    //   451: ldc2_w 428
    //   454: land
    //   455: lconst_0
    //   456: lcmp
    //   457: ifeq +399 -> 856
    //   460: aload_0
    //   461: iconst_1
    //   462: bipush 32
    //   464: bipush 35
    //   466: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   469: ireturn
    //   470: aload_0
    //   471: lload_1
    //   472: ldc2_w 475
    //   475: lload_3
    //   476: lconst_0
    //   477: lload 5
    //   479: lconst_0
    //   480: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   483: ireturn
    //   484: aload_0
    //   485: lload_1
    //   486: ldc2_w 477
    //   489: lload_3
    //   490: ldc2_w 479
    //   493: lload 5
    //   495: lconst_0
    //   496: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   499: ireturn
    //   500: aload_0
    //   501: lload_1
    //   502: ldc2_w 481
    //   505: lload_3
    //   506: ldc2_w 483
    //   509: lload 5
    //   511: lconst_0
    //   512: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   515: ireturn
    //   516: lload_3
    //   517: ldc2_w 439
    //   520: land
    //   521: lconst_0
    //   522: lcmp
    //   523: ifeq +14 -> 537
    //   526: aload_0
    //   527: bipush 114
    //   529: putfield 357	bsh/ParserTokenManager:t	I
    //   532: aload_0
    //   533: iconst_1
    //   534: putfield 359	bsh/ParserTokenManager:s	I
    //   537: aload_0
    //   538: lload_1
    //   539: lconst_0
    //   540: lload_3
    //   541: ldc2_w 485
    //   544: lload 5
    //   546: ldc2_w 487
    //   549: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   552: ireturn
    //   553: lload_3
    //   554: ldc2_w 489
    //   557: land
    //   558: lconst_0
    //   559: lcmp
    //   560: ifeq +11 -> 571
    //   563: aload_0
    //   564: iconst_1
    //   565: bipush 90
    //   567: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   570: ireturn
    //   571: lload_3
    //   572: ldc2_w 491
    //   575: land
    //   576: lconst_0
    //   577: lcmp
    //   578: ifeq +11 -> 589
    //   581: aload_0
    //   582: iconst_1
    //   583: bipush 91
    //   585: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   588: ireturn
    //   589: lload_3
    //   590: ldc2_w 493
    //   593: land
    //   594: lconst_0
    //   595: lcmp
    //   596: ifeq +11 -> 607
    //   599: aload_0
    //   600: iconst_1
    //   601: bipush 93
    //   603: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   606: ireturn
    //   607: lload_3
    //   608: ldc2_w 495
    //   611: land
    //   612: lconst_0
    //   613: lcmp
    //   614: ifeq +11 -> 625
    //   617: aload_0
    //   618: iconst_1
    //   619: bipush 95
    //   621: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   624: ireturn
    //   625: lload_3
    //   626: ldc2_w 497
    //   629: land
    //   630: lconst_0
    //   631: lcmp
    //   632: ifeq +11 -> 643
    //   635: aload_0
    //   636: iconst_1
    //   637: bipush 118
    //   639: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   642: ireturn
    //   643: lload_3
    //   644: ldc2_w 499
    //   647: land
    //   648: lconst_0
    //   649: lcmp
    //   650: ifeq +11 -> 661
    //   653: aload_0
    //   654: iconst_1
    //   655: bipush 119
    //   657: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   660: ireturn
    //   661: lload_3
    //   662: ldc2_w 501
    //   665: land
    //   666: lconst_0
    //   667: lcmp
    //   668: ifeq +11 -> 679
    //   671: aload_0
    //   672: iconst_1
    //   673: bipush 120
    //   675: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   678: ireturn
    //   679: lload_3
    //   680: ldc2_w 503
    //   683: land
    //   684: lconst_0
    //   685: lcmp
    //   686: ifeq +11 -> 697
    //   689: aload_0
    //   690: iconst_1
    //   691: bipush 121
    //   693: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   696: ireturn
    //   697: lload_3
    //   698: ldc2_w 505
    //   701: land
    //   702: lconst_0
    //   703: lcmp
    //   704: ifeq +11 -> 715
    //   707: aload_0
    //   708: iconst_1
    //   709: bipush 122
    //   711: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   714: ireturn
    //   715: lload_3
    //   716: ldc2_w 507
    //   719: land
    //   720: lconst_0
    //   721: lcmp
    //   722: ifeq +11 -> 733
    //   725: aload_0
    //   726: iconst_1
    //   727: bipush 124
    //   729: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   732: ireturn
    //   733: lload_3
    //   734: ldc2_w 509
    //   737: land
    //   738: lconst_0
    //   739: lcmp
    //   740: ifeq +11 -> 751
    //   743: aload_0
    //   744: iconst_1
    //   745: bipush 126
    //   747: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   750: ireturn
    //   751: lload_3
    //   752: ldc2_w 511
    //   755: land
    //   756: lconst_0
    //   757: lcmp
    //   758: ifeq +98 -> 856
    //   761: aload_0
    //   762: iconst_1
    //   763: bipush 127
    //   765: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   768: ireturn
    //   769: lload_3
    //   770: ldc2_w 513
    //   773: land
    //   774: lconst_0
    //   775: lcmp
    //   776: ifeq +14 -> 790
    //   779: aload_0
    //   780: bipush 112
    //   782: putfield 357	bsh/ParserTokenManager:t	I
    //   785: aload_0
    //   786: iconst_1
    //   787: putfield 359	bsh/ParserTokenManager:s	I
    //   790: aload_0
    //   791: lload_1
    //   792: lconst_0
    //   793: lload_3
    //   794: lconst_0
    //   795: lload 5
    //   797: lconst_1
    //   798: invokespecial 436	bsh/ParserTokenManager:a	(JJJJJJ)I
    //   801: ireturn
    //   802: lload_3
    //   803: ldc2_w 515
    //   806: land
    //   807: lconst_0
    //   808: lcmp
    //   809: ifeq +47 -> 856
    //   812: aload_0
    //   813: iconst_1
    //   814: bipush 101
    //   816: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   819: ireturn
    //   820: lload_3
    //   821: ldc2_w 517
    //   824: land
    //   825: lconst_0
    //   826: lcmp
    //   827: ifeq +29 -> 856
    //   830: aload_0
    //   831: iconst_1
    //   832: bipush 100
    //   834: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   837: ireturn
    //   838: lload_3
    //   839: ldc2_w 519
    //   842: land
    //   843: lconst_0
    //   844: lcmp
    //   845: ifeq +11 -> 856
    //   848: aload_0
    //   849: iconst_1
    //   850: bipush 98
    //   852: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   855: ireturn
    //   856: aload_0
    //   857: iconst_0
    //   858: lload_1
    //   859: lload_3
    //   860: lload 5
    //   862: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   865: ireturn
    //   866: aload_0
    //   867: iconst_0
    //   868: lload_1
    //   869: lload_3
    //   870: lload 5
    //   872: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   875: pop
    //   876: iconst_1
    //   877: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	878	0	this	ParserTokenManager
    //   0	878	1	paramLong1	long
    //   0	878	3	paramLong2	long
    //   866	1	4	???	IOException
    //   0	878	5	paramLong3	long
    // Exception table:
    //   from	to	target	type
    //   0	11	866	java/io/IOException
  }
  
  /* Error */
  private final int a(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 9
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 11
    //   12: lload 9
    //   14: lload 11
    //   16: lor
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +14 -> 33
    //   22: aload_0
    //   23: bipush 11
    //   25: lconst_0
    //   26: lload_1
    //   27: lload 5
    //   29: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   32: ireturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   38: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   41: putfield 370	bsh/ParserTokenManager:n	C
    //   44: aload_0
    //   45: getfield 370	bsh/ParserTokenManager:n	C
    //   48: istore 14
    //   50: iload 14
    //   52: bipush 97
    //   54: if_icmpeq +57 -> 111
    //   57: iload 14
    //   59: bipush 101
    //   61: if_icmpeq +35 -> 96
    //   64: iload 14
    //   66: bipush 115
    //   68: if_icmpeq +15 -> 83
    //   71: aload_0
    //   72: bipush 12
    //   74: lconst_0
    //   75: lload 9
    //   77: lload 11
    //   79: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   82: ireturn
    //   83: aload_0
    //   84: lload 9
    //   86: lconst_0
    //   87: lload 11
    //   89: ldc2_w 465
    //   92: invokespecial 523	bsh/ParserTokenManager:b	(JJJJ)I
    //   95: ireturn
    //   96: aload_0
    //   97: lload 9
    //   99: ldc2_w 524
    //   102: lload 11
    //   104: ldc2_w 421
    //   107: invokespecial 523	bsh/ParserTokenManager:b	(JJJJ)I
    //   110: ireturn
    //   111: aload_0
    //   112: lload 9
    //   114: lconst_0
    //   115: lload 11
    //   117: ldc2_w 526
    //   120: invokespecial 523	bsh/ParserTokenManager:b	(JJJJ)I
    //   123: ireturn
    //   124: aload_0
    //   125: bipush 12
    //   127: lconst_0
    //   128: lload 9
    //   130: lload 11
    //   132: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   135: pop
    //   136: bipush 13
    //   138: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	ParserTokenManager
    //   0	139	1	paramLong1	long
    //   0	139	3	paramLong2	long
    //   0	139	5	paramLong3	long
    //   0	139	7	paramLong4	long
    //   124	1	8	localIOException	IOException
    //   3	126	9	l1	long
    //   10	121	11	l2	long
    //   48	21	14	i1	int
    // Exception table:
    //   from	to	target	type
    //   33	44	124	java/io/IOException
  }
  
  /* Error */
  private final int a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +14 -> 47
    //   36: aload_0
    //   37: iconst_0
    //   38: lload_1
    //   39: lload 5
    //   41: lload 9
    //   43: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   46: ireturn
    //   47: aload_0
    //   48: aload_0
    //   49: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   52: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   55: putfield 370	bsh/ParserTokenManager:n	C
    //   58: aload_0
    //   59: getfield 370	bsh/ParserTokenManager:n	C
    //   62: lookupswitch	default:+154->216, 61:+583->645, 62:+545->607, 97:+529->591, 98:+513->575, 99:+497->559, 101:+477->539, 102:+461->523, 105:+441->503, 108:+425->487, 110:+407->469, 111:+391->453, 112:+375->437, 114:+314->376, 115:+298->360, 116:+215->277, 117:+199->261, 119:+178->240, 121:+157->219
    //   216: goto +467 -> 683
    //   219: lload 13
    //   221: ldc2_w 501
    //   224: land
    //   225: lconst_0
    //   226: lcmp
    //   227: ifeq +456 -> 683
    //   230: aload_0
    //   231: iconst_2
    //   232: bipush 56
    //   234: bipush 35
    //   236: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   239: ireturn
    //   240: lload 13
    //   242: ldc2_w 528
    //   245: land
    //   246: lconst_0
    //   247: lcmp
    //   248: ifeq +435 -> 683
    //   251: aload_0
    //   252: iconst_2
    //   253: bipush 40
    //   255: bipush 35
    //   257: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   260: ireturn
    //   261: aload_0
    //   262: lload 13
    //   264: ldc2_w 530
    //   267: lload 15
    //   269: lconst_0
    //   270: lload 19
    //   272: lconst_0
    //   273: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   276: ireturn
    //   277: lload 13
    //   279: ldc2_w 517
    //   282: land
    //   283: lconst_0
    //   284: lcmp
    //   285: ifeq +21 -> 306
    //   288: bipush 36
    //   290: istore 22
    //   292: aload_0
    //   293: iload 22
    //   295: putfield 357	bsh/ParserTokenManager:t	I
    //   298: aload_0
    //   299: iconst_2
    //   300: putfield 359	bsh/ParserTokenManager:s	I
    //   303: goto +39 -> 342
    //   306: lload 15
    //   308: ldc2_w 534
    //   311: land
    //   312: lconst_0
    //   313: lcmp
    //   314: ifeq +10 -> 324
    //   317: bipush 83
    //   319: istore 22
    //   321: goto -29 -> 292
    //   324: lload 15
    //   326: ldc2_w 451
    //   329: land
    //   330: lconst_0
    //   331: lcmp
    //   332: ifeq +10 -> 342
    //   335: bipush 85
    //   337: istore 22
    //   339: goto -47 -> 292
    //   342: aload_0
    //   343: lload 13
    //   345: ldc2_w 536
    //   348: lload 15
    //   350: ldc2_w 538
    //   353: lload 19
    //   355: lconst_0
    //   356: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   359: ireturn
    //   360: aload_0
    //   361: lload 13
    //   363: ldc2_w 540
    //   366: lload 15
    //   368: lconst_0
    //   369: lload 19
    //   371: lconst_0
    //   372: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   375: ireturn
    //   376: lload 13
    //   378: ldc2_w 542
    //   381: land
    //   382: lconst_0
    //   383: lcmp
    //   384: ifeq +13 -> 397
    //   387: aload_0
    //   388: iconst_2
    //   389: bipush 30
    //   391: bipush 35
    //   393: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   396: ireturn
    //   397: lload 15
    //   399: ldc2_w 544
    //   402: land
    //   403: lconst_0
    //   404: lcmp
    //   405: ifeq +14 -> 419
    //   408: aload_0
    //   409: bipush 97
    //   411: putfield 357	bsh/ParserTokenManager:t	I
    //   414: aload_0
    //   415: iconst_2
    //   416: putfield 359	bsh/ParserTokenManager:s	I
    //   419: aload_0
    //   420: lload 13
    //   422: ldc2_w 546
    //   425: lload 15
    //   427: ldc2_w 548
    //   430: lload 19
    //   432: lconst_0
    //   433: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   436: ireturn
    //   437: aload_0
    //   438: lload 13
    //   440: ldc2_w 459
    //   443: lload 15
    //   445: lconst_0
    //   446: lload 19
    //   448: lconst_0
    //   449: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   452: ireturn
    //   453: aload_0
    //   454: lload 13
    //   456: ldc2_w 550
    //   459: lload 15
    //   461: lconst_0
    //   462: lload 19
    //   464: lconst_0
    //   465: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   468: ireturn
    //   469: aload_0
    //   470: lload 13
    //   472: ldc2_w 552
    //   475: lload 15
    //   477: ldc2_w 483
    //   480: lload 19
    //   482: lconst_0
    //   483: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   486: ireturn
    //   487: aload_0
    //   488: lload 13
    //   490: ldc2_w 554
    //   493: lload 15
    //   495: lconst_0
    //   496: lload 19
    //   498: lconst_0
    //   499: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   502: ireturn
    //   503: aload_0
    //   504: lload 13
    //   506: ldc2_w 556
    //   509: lload 15
    //   511: ldc2_w 558
    //   514: lload 19
    //   516: ldc2_w 449
    //   519: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   522: ireturn
    //   523: aload_0
    //   524: lload 13
    //   526: ldc2_w 560
    //   529: lload 15
    //   531: lconst_0
    //   532: lload 19
    //   534: lconst_0
    //   535: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   538: ireturn
    //   539: aload_0
    //   540: lload 13
    //   542: ldc2_w 562
    //   545: lload 15
    //   547: ldc2_w 564
    //   550: lload 19
    //   552: ldc2_w 465
    //   555: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   558: ireturn
    //   559: aload_0
    //   560: lload 13
    //   562: ldc2_w 566
    //   565: lload 15
    //   567: lconst_0
    //   568: lload 19
    //   570: lconst_0
    //   571: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   574: ireturn
    //   575: aload_0
    //   576: lload 13
    //   578: ldc2_w 568
    //   581: lload 15
    //   583: lconst_0
    //   584: lload 19
    //   586: lconst_0
    //   587: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   590: ireturn
    //   591: aload_0
    //   592: lload 13
    //   594: ldc2_w 570
    //   597: lload 15
    //   599: lconst_0
    //   600: lload 19
    //   602: lconst_0
    //   603: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   606: ireturn
    //   607: lload 15
    //   609: ldc2_w 485
    //   612: land
    //   613: lconst_0
    //   614: lcmp
    //   615: ifeq +14 -> 629
    //   618: aload_0
    //   619: bipush 116
    //   621: putfield 357	bsh/ParserTokenManager:t	I
    //   624: aload_0
    //   625: iconst_2
    //   626: putfield 359	bsh/ParserTokenManager:s	I
    //   629: aload_0
    //   630: lload 13
    //   632: lconst_0
    //   633: lload 15
    //   635: lconst_0
    //   636: lload 19
    //   638: ldc2_w 572
    //   641: invokespecial 533	bsh/ParserTokenManager:b	(JJJJJJ)I
    //   644: ireturn
    //   645: lload 19
    //   647: lconst_1
    //   648: land
    //   649: lconst_0
    //   650: lcmp
    //   651: ifeq +12 -> 663
    //   654: aload_0
    //   655: iconst_2
    //   656: sipush 128
    //   659: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   662: ireturn
    //   663: lload 19
    //   665: ldc2_w 574
    //   668: land
    //   669: lconst_0
    //   670: lcmp
    //   671: ifeq +12 -> 683
    //   674: aload_0
    //   675: iconst_2
    //   676: sipush 130
    //   679: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   682: ireturn
    //   683: aload_0
    //   684: iconst_1
    //   685: lload 13
    //   687: lload 15
    //   689: lload 19
    //   691: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   694: ireturn
    //   695: aload_0
    //   696: iconst_1
    //   697: lload 13
    //   699: lload 15
    //   701: lload 19
    //   703: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   706: pop
    //   707: iconst_2
    //   708: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	709	0	this	ParserTokenManager
    //   0	709	1	paramLong1	long
    //   0	709	3	paramLong2	long
    //   0	709	5	paramLong3	long
    //   0	709	7	paramLong4	long
    //   0	709	9	paramLong5	long
    //   0	709	11	paramLong6	long
    //   695	1	12	localIOException	IOException
    //   3	695	13	l1	long
    //   10	690	15	l2	long
    //   17	10	17	l3	long
    //   24	678	19	l4	long
    //   290	48	22	i1	int
    // Exception table:
    //   from	to	target	type
    //   47	58	695	java/io/IOException
  }
  
  private final void a(int paramInt)
  {
    if (this.u[paramInt] != this.r)
    {
      int[] arrayOfInt = this.v;
      int i1 = this.q;
      this.q = (i1 + 1);
      arrayOfInt[i1] = paramInt;
      this.u[paramInt] = this.r;
    }
  }
  
  private static final boolean a(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2)
  {
    if (paramInt1 != 0) {
      return false;
    }
    boolean bool1 = (paramLong2 & a[paramInt3]) < 0L;
    boolean bool2 = false;
    if (bool1) {
      bool2 = true;
    }
    return bool2;
  }
  
  private final int b()
  {
    int i1 = this.n;
    switch (i1)
    {
    default: 
      switch (i1)
      {
      default: 
        switch (i1)
        {
        default: 
          switch (i1)
          {
          default: 
            switch (i1)
            {
            default: 
              switch (i1)
              {
              default: 
                switch (i1)
                {
                default: 
                  switch (i1)
                  {
                  default: 
                    switch (i1)
                    {
                    default: 
                      switch (i1)
                      {
                      default: 
                        switch (i1)
                        {
                        default: 
                          switch (i1)
                          {
                          default: 
                            return e(6, 0);
                          case 112: 
                            return a(65970697666560L, 0L, 0L);
                          case 110: 
                            return a(3848290697216L, 0L, 0L);
                          case 108: 
                            return a(274877906944L, 0L, 0L);
                          case 105: 
                            return a(270582939648L, 0L, 0L);
                          }
                          return a(0, 76);
                        case 126: 
                          return a(0, 87);
                        case 125: 
                          return a(0, 75);
                        case 124: 
                          this.t = 108;
                          return a(0L, 1152921508901814272L, 0L);
                        }
                        return a(0, 74);
                      case 119: 
                        return a(576460752303423488L, 0L, 0L);
                      }
                      return a(432345564227567616L, 0L, 0L);
                    case 116: 
                      return a(139611588448485376L, 0L, 0L);
                    case 115: 
                      return a(4362862139015168L, 0L, 0L);
                    }
                    return a(70368744177664L, 0L, 0L);
                  case 103: 
                    return a(2147483648L, 0L, 0L);
                  case 102: 
                    return a(2080374784L, 0L, 0L);
                  case 101: 
                    return a(58720256L, 0L, 0L);
                  case 100: 
                    return a(7340032L, 0L, 0L);
                  case 99: 
                    return a(1024000L, 0L, 0L);
                  case 98: 
                    return a(22528L, 0L, 0L);
                  }
                  return a(1024L, 0L, 0L);
                case 94: 
                  this.t = 110;
                  return a(0L, 4611686018427387904L, 0L);
                }
                return a(0, 77);
              case 64: 
                return a(0L, 2894169735298547712L, 42L);
              case 63: 
                return a(0, 88);
              case 62: 
                this.t = 82;
                return a(0L, 5629500071084032L, 20L);
              case 61: 
                this.t = 81;
                return a(0L, 67108864L, 0L);
              case 60: 
                this.t = 84;
                return a(0L, 281475110928384L, 1L);
              case 59: 
                return a(0, 78);
              }
              return a(0, 89);
            case 47: 
              this.t = 105;
              return a(0L, 144115188075855872L, 0L);
            case 46: 
              return a(0, 80, 11);
            case 45: 
              this.t = 103;
              return a(0L, 36028934457917440L, 0L);
            case 44: 
              return a(0, 79);
            case 43: 
              this.t = 102;
              return a(0L, 18014467228958720L, 0L);
            case 42: 
              this.t = 104;
              return a(0L, 72057594037927936L, 0L);
            case 41: 
              return a(0, 73);
            }
            return a(0, 72);
          case 38: 
            this.t = 106;
            return a(0L, 288230393331580928L, 0L);
          }
          this.t = 111;
          return a(0L, Long.MIN_VALUE, 0L);
        case 33: 
          this.t = 86;
          return a(0L, 2147483648L, 0L);
        }
        return a(0, 1, 0);
      case 13: 
        return a(0, 3, 0);
      }
      return a(0, 4, 0);
    case 10: 
      return a(0, 5, 0);
    }
    return a(0, 2, 0);
  }
  
  private final int b(int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    return e(a(paramInt, paramLong1, paramLong2, paramLong3), paramInt + 1);
  }
  
  /* Error */
  private final int b(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 5
    //   5: lload 5
    //   7: lconst_0
    //   8: lcmp
    //   9: ifne +13 -> 22
    //   12: aload_0
    //   13: bipush 21
    //   15: lconst_0
    //   16: lconst_0
    //   17: lload_1
    //   18: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   21: ireturn
    //   22: aload_0
    //   23: aload_0
    //   24: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   27: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   30: putfield 370	bsh/ParserTokenManager:n	C
    //   33: aload_0
    //   34: getfield 370	bsh/ParserTokenManager:n	C
    //   37: bipush 115
    //   39: if_icmpeq +14 -> 53
    //   42: aload_0
    //   43: bipush 22
    //   45: lconst_0
    //   46: lconst_0
    //   47: lload 5
    //   49: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   52: ireturn
    //   53: aload_0
    //   54: lload 5
    //   56: ldc2_w 421
    //   59: invokespecial 627	bsh/ParserTokenManager:c	(JJ)I
    //   62: ireturn
    //   63: aload_0
    //   64: bipush 22
    //   66: lconst_0
    //   67: lconst_0
    //   68: lload 5
    //   70: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   73: pop
    //   74: bipush 23
    //   76: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	ParserTokenManager
    //   0	77	1	paramLong1	long
    //   0	77	3	paramLong2	long
    //   63	1	4	localIOException	IOException
    //   3	66	5	l1	long
    // Exception table:
    //   from	to	target	type
    //   22	33	63	java/io/IOException
  }
  
  /* Error */
  private final int b(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 9
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 11
    //   12: lload 9
    //   14: lload 11
    //   16: lor
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +14 -> 33
    //   22: aload_0
    //   23: bipush 12
    //   25: lconst_0
    //   26: lload_1
    //   27: lload 5
    //   29: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   32: ireturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   38: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   41: putfield 370	bsh/ParserTokenManager:n	C
    //   44: aload_0
    //   45: getfield 370	bsh/ParserTokenManager:n	C
    //   48: istore 14
    //   50: iload 14
    //   52: bipush 100
    //   54: if_icmpeq +35 -> 89
    //   57: iload 14
    //   59: bipush 115
    //   61: if_icmpeq +15 -> 76
    //   64: aload_0
    //   65: bipush 13
    //   67: lconst_0
    //   68: lload 9
    //   70: lload 11
    //   72: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   75: ireturn
    //   76: aload_0
    //   77: lload 9
    //   79: lconst_0
    //   80: lload 11
    //   82: ldc2_w 628
    //   85: invokespecial 631	bsh/ParserTokenManager:c	(JJJJ)I
    //   88: ireturn
    //   89: aload_0
    //   90: lload 9
    //   92: ldc2_w 524
    //   95: lload 11
    //   97: ldc2_w 421
    //   100: invokespecial 631	bsh/ParserTokenManager:c	(JJJJ)I
    //   103: ireturn
    //   104: aload_0
    //   105: bipush 13
    //   107: lconst_0
    //   108: lload 9
    //   110: lload 11
    //   112: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   115: pop
    //   116: bipush 14
    //   118: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	ParserTokenManager
    //   0	119	1	paramLong1	long
    //   0	119	3	paramLong2	long
    //   0	119	5	paramLong3	long
    //   0	119	7	paramLong4	long
    //   104	1	8	localIOException	IOException
    //   3	106	9	l1	long
    //   10	101	11	l2	long
    //   48	14	14	i1	int
    // Exception table:
    //   from	to	target	type
    //   33	44	104	java/io/IOException
  }
  
  /* Error */
  private final int b(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +14 -> 47
    //   36: aload_0
    //   37: iconst_1
    //   38: lload_1
    //   39: lload 5
    //   41: lload 9
    //   43: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   46: ireturn
    //   47: aload_0
    //   48: aload_0
    //   49: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   52: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   55: putfield 370	bsh/ParserTokenManager:n	C
    //   58: aload_0
    //   59: getfield 370	bsh/ParserTokenManager:n	C
    //   62: istore 22
    //   64: iload 22
    //   66: bipush 61
    //   68: if_icmpeq +663 -> 731
    //   71: iload 22
    //   73: bipush 95
    //   75: if_icmpeq +640 -> 715
    //   78: iload 22
    //   80: bipush 105
    //   82: if_icmpeq +617 -> 699
    //   85: iload 22
    //   87: tableswitch	default:+41->128, 97:+596->683, 98:+580->667, 99:+564->651, 100:+505->592, 101:+403->490, 102:+385->472, 103:+346->433
    //   128: iload 22
    //   130: tableswitch	default:+34->164, 107:+287->417, 108:+250->380, 109:+229->359, 110:+213->343, 111:+176->306
    //   164: iload 22
    //   166: tableswitch	default:+34->200, 114:+103->269, 115:+87->253, 116:+69->235, 117:+53->219, 118:+37->203
    //   200: goto +551 -> 751
    //   203: aload_0
    //   204: lload 13
    //   206: ldc2_w 632
    //   209: lload 15
    //   211: lconst_0
    //   212: lload 19
    //   214: lconst_0
    //   215: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   218: ireturn
    //   219: aload_0
    //   220: lload 13
    //   222: ldc2_w 600
    //   225: lload 15
    //   227: lconst_0
    //   228: lload 19
    //   230: lconst_0
    //   231: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   234: ireturn
    //   235: aload_0
    //   236: lload 13
    //   238: ldc2_w 636
    //   241: lload 15
    //   243: ldc2_w 479
    //   246: lload 19
    //   248: lconst_0
    //   249: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   252: ireturn
    //   253: aload_0
    //   254: lload 13
    //   256: ldc2_w 638
    //   259: lload 15
    //   261: lconst_0
    //   262: lload 19
    //   264: lconst_0
    //   265: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   268: ireturn
    //   269: lload 13
    //   271: ldc2_w 640
    //   274: land
    //   275: lconst_0
    //   276: lcmp
    //   277: ifeq +13 -> 290
    //   280: aload_0
    //   281: iconst_3
    //   282: bipush 17
    //   284: bipush 35
    //   286: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   289: ireturn
    //   290: aload_0
    //   291: lload 13
    //   293: ldc2_w 642
    //   296: lload 15
    //   298: lconst_0
    //   299: lload 19
    //   301: lconst_0
    //   302: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   305: ireturn
    //   306: lload 13
    //   308: ldc2_w 495
    //   311: land
    //   312: lconst_0
    //   313: lcmp
    //   314: ifeq +13 -> 327
    //   317: aload_0
    //   318: iconst_3
    //   319: bipush 31
    //   321: bipush 35
    //   323: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   326: ireturn
    //   327: aload_0
    //   328: lload 13
    //   330: ldc2_w 644
    //   333: lload 15
    //   335: lconst_0
    //   336: lload 19
    //   338: lconst_0
    //   339: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   342: ireturn
    //   343: aload_0
    //   344: lload 13
    //   346: ldc2_w 485
    //   349: lload 15
    //   351: lconst_0
    //   352: lload 19
    //   354: lconst_0
    //   355: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   358: ireturn
    //   359: lload 13
    //   361: ldc2_w 646
    //   364: land
    //   365: lconst_0
    //   366: lcmp
    //   367: ifeq +384 -> 751
    //   370: aload_0
    //   371: iconst_3
    //   372: bipush 24
    //   374: bipush 35
    //   376: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   379: ireturn
    //   380: lload 13
    //   382: ldc2_w 648
    //   385: land
    //   386: lconst_0
    //   387: lcmp
    //   388: ifeq +13 -> 401
    //   391: aload_0
    //   392: iconst_3
    //   393: bipush 41
    //   395: bipush 35
    //   397: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   400: ireturn
    //   401: aload_0
    //   402: lload 13
    //   404: ldc2_w 650
    //   407: lload 15
    //   409: lconst_0
    //   410: lload 19
    //   412: lconst_0
    //   413: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   416: ireturn
    //   417: aload_0
    //   418: lload 13
    //   420: ldc2_w 566
    //   423: lload 15
    //   425: lconst_0
    //   426: lload 19
    //   428: lconst_0
    //   429: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   432: ireturn
    //   433: lload 13
    //   435: ldc2_w 588
    //   438: land
    //   439: lconst_0
    //   440: lcmp
    //   441: ifeq +13 -> 454
    //   444: aload_0
    //   445: iconst_3
    //   446: bipush 38
    //   448: bipush 35
    //   450: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   453: ireturn
    //   454: aload_0
    //   455: lload 13
    //   457: lconst_0
    //   458: lload 15
    //   460: ldc2_w 447
    //   463: lload 19
    //   465: ldc2_w 449
    //   468: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   471: ireturn
    //   472: aload_0
    //   473: lload 13
    //   475: lconst_0
    //   476: lload 15
    //   478: ldc2_w 564
    //   481: lload 19
    //   483: ldc2_w 465
    //   486: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   489: ireturn
    //   490: lload 13
    //   492: ldc2_w 652
    //   495: land
    //   496: lconst_0
    //   497: lcmp
    //   498: ifeq +13 -> 511
    //   501: aload_0
    //   502: iconst_3
    //   503: bipush 14
    //   505: bipush 35
    //   507: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   510: ireturn
    //   511: lload 13
    //   513: ldc2_w 654
    //   516: land
    //   517: lconst_0
    //   518: lcmp
    //   519: ifeq +13 -> 532
    //   522: aload_0
    //   523: iconst_3
    //   524: bipush 15
    //   526: bipush 35
    //   528: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   531: ireturn
    //   532: lload 13
    //   534: ldc2_w 656
    //   537: land
    //   538: lconst_0
    //   539: lcmp
    //   540: ifeq +13 -> 553
    //   543: aload_0
    //   544: iconst_3
    //   545: bipush 23
    //   547: bipush 35
    //   549: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   552: ireturn
    //   553: lload 13
    //   555: ldc2_w 499
    //   558: land
    //   559: lconst_0
    //   560: lcmp
    //   561: ifeq +13 -> 574
    //   564: aload_0
    //   565: iconst_3
    //   566: bipush 55
    //   568: bipush 35
    //   570: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   573: ireturn
    //   574: aload_0
    //   575: lload 13
    //   577: ldc2_w 658
    //   580: lload 15
    //   582: ldc2_w 538
    //   585: lload 19
    //   587: lconst_0
    //   588: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   591: ireturn
    //   592: lload 13
    //   594: ldc2_w 503
    //   597: land
    //   598: lconst_0
    //   599: lcmp
    //   600: ifeq +13 -> 613
    //   603: aload_0
    //   604: iconst_3
    //   605: bipush 57
    //   607: bipush 35
    //   609: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   612: ireturn
    //   613: lload 15
    //   615: ldc2_w 660
    //   618: land
    //   619: lconst_0
    //   620: lcmp
    //   621: ifeq +14 -> 635
    //   624: aload_0
    //   625: bipush 99
    //   627: putfield 357	bsh/ParserTokenManager:t	I
    //   630: aload_0
    //   631: iconst_3
    //   632: putfield 359	bsh/ParserTokenManager:s	I
    //   635: aload_0
    //   636: lload 13
    //   638: lconst_0
    //   639: lload 15
    //   641: ldc2_w 594
    //   644: lload 19
    //   646: lconst_0
    //   647: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   650: ireturn
    //   651: aload_0
    //   652: lload 13
    //   654: ldc2_w 662
    //   657: lload 15
    //   659: lconst_0
    //   660: lload 19
    //   662: lconst_0
    //   663: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   666: ireturn
    //   667: aload_0
    //   668: lload 13
    //   670: ldc2_w 664
    //   673: lload 15
    //   675: lconst_0
    //   676: lload 19
    //   678: lconst_0
    //   679: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   682: ireturn
    //   683: aload_0
    //   684: lload 13
    //   686: ldc2_w 666
    //   689: lload 15
    //   691: lconst_0
    //   692: lload 19
    //   694: lconst_0
    //   695: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   698: ireturn
    //   699: aload_0
    //   700: lload 13
    //   702: ldc2_w 668
    //   705: lload 15
    //   707: lconst_0
    //   708: lload 19
    //   710: lconst_0
    //   711: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   714: ireturn
    //   715: aload_0
    //   716: lload 13
    //   718: lconst_0
    //   719: lload 15
    //   721: ldc2_w 548
    //   724: lload 19
    //   726: lconst_0
    //   727: invokespecial 635	bsh/ParserTokenManager:c	(JJJJJJ)I
    //   730: ireturn
    //   731: lload 19
    //   733: ldc2_w 572
    //   736: land
    //   737: lconst_0
    //   738: lcmp
    //   739: ifeq +12 -> 751
    //   742: aload_0
    //   743: iconst_3
    //   744: sipush 132
    //   747: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   750: ireturn
    //   751: aload_0
    //   752: iconst_2
    //   753: lload 13
    //   755: lload 15
    //   757: lload 19
    //   759: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   762: ireturn
    //   763: aload_0
    //   764: iconst_2
    //   765: lload 13
    //   767: lload 15
    //   769: lload 19
    //   771: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   774: pop
    //   775: iconst_3
    //   776: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	777	0	this	ParserTokenManager
    //   0	777	1	paramLong1	long
    //   0	777	3	paramLong2	long
    //   0	777	5	paramLong3	long
    //   0	777	7	paramLong4	long
    //   0	777	9	paramLong5	long
    //   0	777	11	paramLong6	long
    //   763	1	12	localIOException	IOException
    //   3	763	13	l1	long
    //   10	758	15	l2	long
    //   17	10	17	l3	long
    //   24	746	19	l4	long
    //   62	103	22	i1	int
    // Exception table:
    //   from	to	target	type
    //   47	58	763	java/io/IOException
  }
  
  private final void b(int paramInt1, int paramInt2)
  {
    for (;;)
    {
      int[] arrayOfInt = this.v;
      int i1 = this.q;
      this.q = (i1 + 1);
      arrayOfInt[i1] = i[paramInt1];
      int i2 = paramInt1 + 1;
      if (paramInt1 == paramInt2) {
        return;
      }
      paramInt1 = i2;
    }
  }
  
  private static final boolean b(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2)
  {
    if (paramInt1 != 0) {
      return (paramLong1 & b[paramInt2]) != 0L;
    }
    boolean bool1 = (paramLong2 & a[paramInt3]) < 0L;
    boolean bool2 = false;
    if (bool1) {
      bool2 = true;
    }
    return bool2;
  }
  
  /* Error */
  private final int c(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 5
    //   5: lload 5
    //   7: lconst_0
    //   8: lcmp
    //   9: ifne +13 -> 22
    //   12: aload_0
    //   13: bipush 22
    //   15: lconst_0
    //   16: lconst_0
    //   17: lload_1
    //   18: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   21: ireturn
    //   22: aload_0
    //   23: aload_0
    //   24: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   27: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   30: putfield 370	bsh/ParserTokenManager:n	C
    //   33: aload_0
    //   34: getfield 370	bsh/ParserTokenManager:n	C
    //   37: bipush 115
    //   39: if_icmpeq +14 -> 53
    //   42: aload_0
    //   43: bipush 23
    //   45: lconst_0
    //   46: lconst_0
    //   47: lload 5
    //   49: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   52: ireturn
    //   53: aload_0
    //   54: lload 5
    //   56: ldc2_w 421
    //   59: invokespecial 672	bsh/ParserTokenManager:d	(JJ)I
    //   62: ireturn
    //   63: aload_0
    //   64: bipush 23
    //   66: lconst_0
    //   67: lconst_0
    //   68: lload 5
    //   70: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   73: pop
    //   74: bipush 24
    //   76: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	ParserTokenManager
    //   0	77	1	paramLong1	long
    //   0	77	3	paramLong2	long
    //   63	1	4	localIOException	IOException
    //   3	66	5	l1	long
    // Exception table:
    //   from	to	target	type
    //   22	33	63	java/io/IOException
  }
  
  /* Error */
  private final int c(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 9
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 11
    //   12: lload 9
    //   14: lload 11
    //   16: lor
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +14 -> 33
    //   22: aload_0
    //   23: bipush 13
    //   25: lconst_0
    //   26: lload_1
    //   27: lload 5
    //   29: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   32: ireturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   38: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   41: putfield 370	bsh/ParserTokenManager:n	C
    //   44: aload_0
    //   45: getfield 370	bsh/ParserTokenManager:n	C
    //   48: istore 14
    //   50: iload 14
    //   52: bipush 95
    //   54: if_icmpeq +55 -> 109
    //   57: iload 14
    //   59: bipush 105
    //   61: if_icmpeq +35 -> 96
    //   64: iload 14
    //   66: bipush 115
    //   68: if_icmpeq +15 -> 83
    //   71: aload_0
    //   72: bipush 14
    //   74: lconst_0
    //   75: lload 9
    //   77: lload 11
    //   79: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   82: ireturn
    //   83: aload_0
    //   84: lload 9
    //   86: lconst_0
    //   87: lload 11
    //   89: ldc2_w 526
    //   92: invokespecial 674	bsh/ParserTokenManager:d	(JJJJ)I
    //   95: ireturn
    //   96: aload_0
    //   97: lload 9
    //   99: lconst_0
    //   100: lload 11
    //   102: ldc2_w 465
    //   105: invokespecial 674	bsh/ParserTokenManager:d	(JJJJ)I
    //   108: ireturn
    //   109: aload_0
    //   110: lload 9
    //   112: ldc2_w 524
    //   115: lload 11
    //   117: ldc2_w 421
    //   120: invokespecial 674	bsh/ParserTokenManager:d	(JJJJ)I
    //   123: ireturn
    //   124: aload_0
    //   125: bipush 14
    //   127: lconst_0
    //   128: lload 9
    //   130: lload 11
    //   132: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   135: pop
    //   136: bipush 15
    //   138: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	ParserTokenManager
    //   0	139	1	paramLong1	long
    //   0	139	3	paramLong2	long
    //   0	139	5	paramLong3	long
    //   0	139	7	paramLong4	long
    //   124	1	8	localIOException	IOException
    //   3	126	9	l1	long
    //   10	121	11	l2	long
    //   48	21	14	i1	int
    // Exception table:
    //   from	to	target	type
    //   33	44	124	java/io/IOException
  }
  
  /* Error */
  private final int c(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +14 -> 47
    //   36: aload_0
    //   37: iconst_2
    //   38: lload_1
    //   39: lload 5
    //   41: lload 9
    //   43: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   46: ireturn
    //   47: aload_0
    //   48: aload_0
    //   49: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   52: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   55: putfield 370	bsh/ParserTokenManager:n	C
    //   58: aload_0
    //   59: getfield 370	bsh/ParserTokenManager:n	C
    //   62: tableswitch	default:+114->176, 95:+587->649, 96:+114->176, 97:+569->631, 98:+114->176, 99:+553->615, 100:+114->176, 101:+495->557, 102:+114->176, 103:+114->176, 104:+454->516, 105:+438->500, 106:+114->176, 107:+417->479, 108:+379->441, 109:+114->176, 110:+363->425, 111:+114->176, 112:+114->176, 113:+325->387, 114:+309->371, 115:+272->334, 116:+189->251, 117:+173->235, 118:+157->219, 119:+117->179
    //   176: goto +489 -> 665
    //   179: lload 13
    //   181: ldc2_w 524
    //   184: land
    //   185: lconst_0
    //   186: lcmp
    //   187: ifeq +14 -> 201
    //   190: aload_0
    //   191: bipush 53
    //   193: putfield 357	bsh/ParserTokenManager:t	I
    //   196: aload_0
    //   197: iconst_4
    //   198: putfield 359	bsh/ParserTokenManager:s	I
    //   201: aload_0
    //   202: lload 13
    //   204: ldc2_w 497
    //   207: lload 15
    //   209: ldc2_w 479
    //   212: lload 19
    //   214: lconst_0
    //   215: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   218: ireturn
    //   219: aload_0
    //   220: lload 13
    //   222: ldc2_w 677
    //   225: lload 15
    //   227: lconst_0
    //   228: lload 19
    //   230: lconst_0
    //   231: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   234: ireturn
    //   235: aload_0
    //   236: lload 13
    //   238: ldc2_w 560
    //   241: lload 15
    //   243: lconst_0
    //   244: lload 19
    //   246: lconst_0
    //   247: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   250: ireturn
    //   251: lload 13
    //   253: ldc2_w 679
    //   256: land
    //   257: lconst_0
    //   258: lcmp
    //   259: ifeq +13 -> 272
    //   262: aload_0
    //   263: iconst_4
    //   264: bipush 18
    //   266: bipush 35
    //   268: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   271: ireturn
    //   272: lload 13
    //   274: ldc2_w 493
    //   277: land
    //   278: lconst_0
    //   279: lcmp
    //   280: ifeq +13 -> 293
    //   283: aload_0
    //   284: iconst_4
    //   285: bipush 29
    //   287: bipush 35
    //   289: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   292: ireturn
    //   293: lload 13
    //   295: ldc2_w 642
    //   298: land
    //   299: lconst_0
    //   300: lcmp
    //   301: ifeq +13 -> 314
    //   304: aload_0
    //   305: iconst_4
    //   306: bipush 47
    //   308: bipush 35
    //   310: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   313: ireturn
    //   314: aload_0
    //   315: lload 13
    //   317: ldc2_w 505
    //   320: lload 15
    //   322: ldc2_w 564
    //   325: lload 19
    //   327: ldc2_w 465
    //   330: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   333: ireturn
    //   334: lload 13
    //   336: ldc2_w 681
    //   339: land
    //   340: lconst_0
    //   341: lcmp
    //   342: ifeq +13 -> 355
    //   345: aload_0
    //   346: iconst_4
    //   347: bipush 13
    //   349: bipush 35
    //   351: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   354: ireturn
    //   355: aload_0
    //   356: lload 13
    //   358: ldc2_w 485
    //   361: lload 15
    //   363: lconst_0
    //   364: lload 19
    //   366: lconst_0
    //   367: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   370: ireturn
    //   371: aload_0
    //   372: lload 13
    //   374: ldc2_w 683
    //   377: lload 15
    //   379: lconst_0
    //   380: lload 19
    //   382: lconst_0
    //   383: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   386: ireturn
    //   387: lload 15
    //   389: ldc2_w 685
    //   392: land
    //   393: lconst_0
    //   394: lcmp
    //   395: ifeq +11 -> 406
    //   398: aload_0
    //   399: iconst_4
    //   400: bipush 92
    //   402: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   405: ireturn
    //   406: lload 15
    //   408: ldc2_w 542
    //   411: land
    //   412: lconst_0
    //   413: lcmp
    //   414: ifeq +251 -> 665
    //   417: aload_0
    //   418: iconst_4
    //   419: bipush 94
    //   421: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   424: ireturn
    //   425: aload_0
    //   426: lload 13
    //   428: ldc2_w 437
    //   431: lload 15
    //   433: lconst_0
    //   434: lload 19
    //   436: lconst_0
    //   437: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   440: ireturn
    //   441: lload 13
    //   443: ldc2_w 491
    //   446: land
    //   447: lconst_0
    //   448: lcmp
    //   449: ifeq +14 -> 463
    //   452: aload_0
    //   453: bipush 27
    //   455: putfield 357	bsh/ParserTokenManager:t	I
    //   458: aload_0
    //   459: iconst_4
    //   460: putfield 359	bsh/ParserTokenManager:s	I
    //   463: aload_0
    //   464: lload 13
    //   466: ldc2_w 687
    //   469: lload 15
    //   471: lconst_0
    //   472: lload 19
    //   474: lconst_0
    //   475: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   478: ireturn
    //   479: lload 13
    //   481: ldc2_w 562
    //   484: land
    //   485: lconst_0
    //   486: lcmp
    //   487: ifeq +178 -> 665
    //   490: aload_0
    //   491: iconst_4
    //   492: bipush 12
    //   494: bipush 35
    //   496: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   499: ireturn
    //   500: aload_0
    //   501: lload 13
    //   503: ldc2_w 689
    //   506: lload 15
    //   508: lconst_0
    //   509: lload 19
    //   511: lconst_0
    //   512: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   515: ireturn
    //   516: lload 13
    //   518: ldc2_w 414
    //   521: land
    //   522: lconst_0
    //   523: lcmp
    //   524: ifeq +13 -> 537
    //   527: aload_0
    //   528: iconst_4
    //   529: bipush 16
    //   531: bipush 35
    //   533: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   536: ireturn
    //   537: aload_0
    //   538: lload 13
    //   540: ldc2_w 374
    //   543: lload 15
    //   545: ldc2_w 447
    //   548: lload 19
    //   550: ldc2_w 449
    //   553: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   556: ireturn
    //   557: lload 13
    //   559: ldc2_w 489
    //   562: land
    //   563: lconst_0
    //   564: lcmp
    //   565: ifeq +13 -> 578
    //   568: aload_0
    //   569: iconst_4
    //   570: bipush 26
    //   572: bipush 35
    //   574: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   577: ireturn
    //   578: lload 13
    //   580: ldc2_w 594
    //   583: land
    //   584: lconst_0
    //   585: lcmp
    //   586: ifeq +13 -> 599
    //   589: aload_0
    //   590: iconst_4
    //   591: bipush 59
    //   593: bipush 35
    //   595: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   598: ireturn
    //   599: aload_0
    //   600: lload 13
    //   602: ldc2_w 691
    //   605: lload 15
    //   607: lconst_0
    //   608: lload 19
    //   610: lconst_0
    //   611: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   614: ireturn
    //   615: aload_0
    //   616: lload 13
    //   618: ldc2_w 693
    //   621: lload 15
    //   623: lconst_0
    //   624: lload 19
    //   626: lconst_0
    //   627: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   630: ireturn
    //   631: aload_0
    //   632: lload 13
    //   634: ldc2_w 695
    //   637: lload 15
    //   639: ldc2_w 548
    //   642: lload 19
    //   644: lconst_0
    //   645: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   648: ireturn
    //   649: aload_0
    //   650: lload 13
    //   652: lconst_0
    //   653: lload 15
    //   655: ldc2_w 594
    //   658: lload 19
    //   660: lconst_0
    //   661: invokespecial 676	bsh/ParserTokenManager:d	(JJJJJJ)I
    //   664: ireturn
    //   665: aload_0
    //   666: iconst_3
    //   667: lload 13
    //   669: lload 15
    //   671: lload 19
    //   673: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   676: ireturn
    //   677: aload_0
    //   678: iconst_3
    //   679: lload 13
    //   681: lload 15
    //   683: lload 19
    //   685: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   688: pop
    //   689: iconst_4
    //   690: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	691	0	this	ParserTokenManager
    //   0	691	1	paramLong1	long
    //   0	691	3	paramLong2	long
    //   0	691	5	paramLong3	long
    //   0	691	7	paramLong4	long
    //   0	691	9	paramLong5	long
    //   0	691	11	paramLong6	long
    //   677	1	11	localIOException	IOException
    //   3	677	13	l1	long
    //   10	672	15	l2	long
    //   17	10	17	l3	long
    //   24	660	19	l4	long
    // Exception table:
    //   from	to	target	type
    //   47	58	677	java/io/IOException
  }
  
  private final void c()
  {
    this.r = -2147483647;
    int i2;
    for (int i1 = 74;; i1 = i2)
    {
      i2 = i1 - 1;
      if (i1 <= 0) {
        return;
      }
      this.u[i2] = Integer.MIN_VALUE;
    }
  }
  
  private final void c(int paramInt1, int paramInt2)
  {
    a(paramInt1);
    a(paramInt2);
  }
  
  private static final boolean c(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2)
  {
    if (paramInt1 != 0)
    {
      if (paramInt1 != 51)
      {
        if (paramInt1 != 61)
        {
          switch (paramInt1)
          {
          default: 
            return (paramLong1 & c[paramInt2]) != 0L;
          case 49: 
            boolean bool9 = (paramLong2 & f[paramInt3]) < 0L;
            boolean bool10 = false;
            if (bool9) {
              bool10 = true;
            }
            return bool10;
          }
          boolean bool7 = (paramLong2 & e[paramInt3]) < 0L;
          boolean bool8 = false;
          if (bool7) {
            bool8 = true;
          }
          return bool8;
        }
        boolean bool5 = (paramLong2 & h[paramInt3]) < 0L;
        boolean bool6 = false;
        if (bool5) {
          bool6 = true;
        }
        return bool6;
      }
      boolean bool3 = (paramLong2 & g[paramInt3]) < 0L;
      boolean bool4 = false;
      if (bool3) {
        bool4 = true;
      }
      return bool4;
    }
    boolean bool1 = (paramLong2 & d[paramInt3]) < 0L;
    boolean bool2 = false;
    if (bool1) {
      bool2 = true;
    }
    return bool2;
  }
  
  /* Error */
  private final int d(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 5
    //   5: lload 5
    //   7: lconst_0
    //   8: lcmp
    //   9: ifne +13 -> 22
    //   12: aload_0
    //   13: bipush 23
    //   15: lconst_0
    //   16: lconst_0
    //   17: lload_1
    //   18: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   21: ireturn
    //   22: aload_0
    //   23: aload_0
    //   24: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   27: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   30: putfield 370	bsh/ParserTokenManager:n	C
    //   33: aload_0
    //   34: getfield 370	bsh/ParserTokenManager:n	C
    //   37: bipush 105
    //   39: if_icmpeq +14 -> 53
    //   42: aload_0
    //   43: bipush 24
    //   45: lconst_0
    //   46: lconst_0
    //   47: lload 5
    //   49: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   52: ireturn
    //   53: aload_0
    //   54: lload 5
    //   56: ldc2_w 421
    //   59: invokespecial 702	bsh/ParserTokenManager:e	(JJ)I
    //   62: ireturn
    //   63: aload_0
    //   64: bipush 24
    //   66: lconst_0
    //   67: lconst_0
    //   68: lload 5
    //   70: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   73: pop
    //   74: bipush 25
    //   76: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	ParserTokenManager
    //   0	77	1	paramLong1	long
    //   0	77	3	paramLong2	long
    //   63	1	4	localIOException	IOException
    //   3	66	5	l1	long
    // Exception table:
    //   from	to	target	type
    //   22	33	63	java/io/IOException
  }
  
  /* Error */
  private final int d(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 9
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 11
    //   12: lload 9
    //   14: lload 11
    //   16: lor
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +14 -> 33
    //   22: aload_0
    //   23: bipush 14
    //   25: lconst_0
    //   26: lload_1
    //   27: lload 5
    //   29: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   32: ireturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   38: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   41: putfield 370	bsh/ParserTokenManager:n	C
    //   44: aload_0
    //   45: getfield 370	bsh/ParserTokenManager:n	C
    //   48: istore 14
    //   50: iload 14
    //   52: bipush 103
    //   54: if_icmpeq +57 -> 111
    //   57: iload 14
    //   59: bipush 105
    //   61: if_icmpeq +37 -> 98
    //   64: iload 14
    //   66: bipush 115
    //   68: if_icmpeq +15 -> 83
    //   71: aload_0
    //   72: bipush 15
    //   74: lconst_0
    //   75: lload 9
    //   77: lload 11
    //   79: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   82: ireturn
    //   83: aload_0
    //   84: lload 9
    //   86: ldc2_w 524
    //   89: lload 11
    //   91: ldc2_w 421
    //   94: invokespecial 704	bsh/ParserTokenManager:e	(JJJJ)I
    //   97: ireturn
    //   98: aload_0
    //   99: lload 9
    //   101: lconst_0
    //   102: lload 11
    //   104: ldc2_w 526
    //   107: invokespecial 704	bsh/ParserTokenManager:e	(JJJJ)I
    //   110: ireturn
    //   111: aload_0
    //   112: lload 9
    //   114: lconst_0
    //   115: lload 11
    //   117: ldc2_w 465
    //   120: invokespecial 704	bsh/ParserTokenManager:e	(JJJJ)I
    //   123: ireturn
    //   124: aload_0
    //   125: bipush 15
    //   127: lconst_0
    //   128: lload 9
    //   130: lload 11
    //   132: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   135: pop
    //   136: bipush 16
    //   138: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	ParserTokenManager
    //   0	139	1	paramLong1	long
    //   0	139	3	paramLong2	long
    //   0	139	5	paramLong3	long
    //   0	139	7	paramLong4	long
    //   124	1	8	localIOException	IOException
    //   3	126	9	l1	long
    //   10	121	11	l2	long
    //   48	21	14	i1	int
    // Exception table:
    //   from	to	target	type
    //   33	44	124	java/io/IOException
  }
  
  /* Error */
  private final int d(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +14 -> 47
    //   36: aload_0
    //   37: iconst_3
    //   38: lload_1
    //   39: lload 5
    //   41: lload 9
    //   43: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   46: ireturn
    //   47: aload_0
    //   48: aload_0
    //   49: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   52: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   55: putfield 370	bsh/ParserTokenManager:n	C
    //   58: aload_0
    //   59: getfield 370	bsh/ParserTokenManager:n	C
    //   62: tableswitch	default:+102->164, 95:+473->535, 96:+102->164, 97:+455->517, 98:+102->164, 99:+397->459, 100:+381->443, 101:+339->401, 102:+323->385, 103:+307->369, 104:+286->348, 105:+268->330, 106:+102->164, 107:+102->164, 108:+252->314, 109:+236->298, 110:+199->261, 111:+102->164, 112:+102->164, 113:+102->164, 114:+183->245, 115:+146->208, 116:+105->167
    //   164: goto +389 -> 553
    //   167: lload 13
    //   169: ldc2_w 519
    //   172: land
    //   173: lconst_0
    //   174: lcmp
    //   175: ifeq +13 -> 188
    //   178: aload_0
    //   179: iconst_5
    //   180: bipush 34
    //   182: bipush 35
    //   184: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   187: ireturn
    //   188: aload_0
    //   189: lload 13
    //   191: ldc2_w 705
    //   194: lload 15
    //   196: ldc2_w 447
    //   199: lload 19
    //   201: ldc2_w 449
    //   204: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   207: ireturn
    //   208: lload 13
    //   210: ldc2_w 497
    //   213: land
    //   214: lconst_0
    //   215: lcmp
    //   216: ifeq +13 -> 229
    //   219: aload_0
    //   220: iconst_5
    //   221: bipush 54
    //   223: bipush 35
    //   225: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   228: ireturn
    //   229: aload_0
    //   230: lload 13
    //   232: lconst_0
    //   233: lload 15
    //   235: ldc2_w 548
    //   238: lload 19
    //   240: lconst_0
    //   241: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   244: ireturn
    //   245: aload_0
    //   246: lload 13
    //   248: ldc2_w 374
    //   251: lload 15
    //   253: lconst_0
    //   254: lload 19
    //   256: lconst_0
    //   257: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   260: ireturn
    //   261: lload 13
    //   263: ldc2_w 600
    //   266: land
    //   267: lconst_0
    //   268: lcmp
    //   269: ifeq +13 -> 282
    //   272: aload_0
    //   273: iconst_5
    //   274: bipush 46
    //   276: bipush 35
    //   278: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   281: ireturn
    //   282: aload_0
    //   283: lload 13
    //   285: ldc2_w 709
    //   288: lload 15
    //   290: lconst_0
    //   291: lload 19
    //   293: lconst_0
    //   294: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   297: ireturn
    //   298: aload_0
    //   299: lload 13
    //   301: ldc2_w 544
    //   304: lload 15
    //   306: lconst_0
    //   307: lload 19
    //   309: lconst_0
    //   310: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   313: ireturn
    //   314: aload_0
    //   315: lload 13
    //   317: ldc2_w 711
    //   320: lload 15
    //   322: lconst_0
    //   323: lload 19
    //   325: lconst_0
    //   326: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   329: ireturn
    //   330: aload_0
    //   331: lload 13
    //   333: ldc2_w 713
    //   336: lload 15
    //   338: ldc2_w 479
    //   341: lload 19
    //   343: lconst_0
    //   344: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   347: ireturn
    //   348: lload 13
    //   350: ldc2_w 439
    //   353: land
    //   354: lconst_0
    //   355: lcmp
    //   356: ifeq +197 -> 553
    //   359: aload_0
    //   360: iconst_5
    //   361: bipush 50
    //   363: bipush 35
    //   365: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   368: ireturn
    //   369: aload_0
    //   370: lload 13
    //   372: ldc2_w 566
    //   375: lload 15
    //   377: lconst_0
    //   378: lload 19
    //   380: lconst_0
    //   381: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   384: ireturn
    //   385: aload_0
    //   386: lload 13
    //   388: ldc2_w 515
    //   391: lload 15
    //   393: lconst_0
    //   394: lload 19
    //   396: lconst_0
    //   397: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   400: ireturn
    //   401: lload 13
    //   403: ldc2_w 664
    //   406: land
    //   407: lconst_0
    //   408: lcmp
    //   409: ifeq +13 -> 422
    //   412: aload_0
    //   413: iconst_5
    //   414: bipush 22
    //   416: bipush 35
    //   418: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   421: ireturn
    //   422: lload 13
    //   424: ldc2_w 677
    //   427: land
    //   428: lconst_0
    //   429: lcmp
    //   430: ifeq +123 -> 553
    //   433: aload_0
    //   434: iconst_5
    //   435: bipush 39
    //   437: bipush 35
    //   439: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   442: ireturn
    //   443: aload_0
    //   444: lload 13
    //   446: ldc2_w 437
    //   449: lload 15
    //   451: lconst_0
    //   452: lload 19
    //   454: lconst_0
    //   455: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   458: ireturn
    //   459: lload 13
    //   461: ldc2_w 568
    //   464: land
    //   465: lconst_0
    //   466: lcmp
    //   467: ifeq +13 -> 480
    //   470: aload_0
    //   471: iconst_5
    //   472: bipush 45
    //   474: bipush 35
    //   476: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   479: ireturn
    //   480: lload 13
    //   482: ldc2_w 513
    //   485: land
    //   486: lconst_0
    //   487: lcmp
    //   488: ifeq +13 -> 501
    //   491: aload_0
    //   492: iconst_5
    //   493: bipush 48
    //   495: bipush 35
    //   497: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   500: ireturn
    //   501: aload_0
    //   502: lload 13
    //   504: ldc2_w 715
    //   507: lload 15
    //   509: lconst_0
    //   510: lload 19
    //   512: lconst_0
    //   513: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   516: ireturn
    //   517: aload_0
    //   518: lload 13
    //   520: ldc2_w 717
    //   523: lload 15
    //   525: ldc2_w 594
    //   528: lload 19
    //   530: lconst_0
    //   531: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   534: ireturn
    //   535: aload_0
    //   536: lload 13
    //   538: lconst_0
    //   539: lload 15
    //   541: ldc2_w 564
    //   544: lload 19
    //   546: ldc2_w 465
    //   549: invokespecial 708	bsh/ParserTokenManager:e	(JJJJJJ)I
    //   552: ireturn
    //   553: aload_0
    //   554: iconst_4
    //   555: lload 13
    //   557: lload 15
    //   559: lload 19
    //   561: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   564: ireturn
    //   565: aload_0
    //   566: iconst_4
    //   567: lload 13
    //   569: lload 15
    //   571: lload 19
    //   573: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   576: pop
    //   577: iconst_5
    //   578: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	579	0	this	ParserTokenManager
    //   0	579	1	paramLong1	long
    //   0	579	3	paramLong2	long
    //   0	579	5	paramLong3	long
    //   0	579	7	paramLong4	long
    //   0	579	9	paramLong5	long
    //   0	579	11	paramLong6	long
    //   565	1	11	localIOException	IOException
    //   3	565	13	l1	long
    //   10	560	15	l2	long
    //   17	10	17	l3	long
    //   24	548	19	l4	long
    // Exception table:
    //   from	to	target	type
    //   47	58	565	java/io/IOException
  }
  
  private final void d(int paramInt1, int paramInt2)
  {
    for (;;)
    {
      a(i[paramInt1]);
      int i1 = paramInt1 + 1;
      if (paramInt1 == paramInt2) {
        return;
      }
      paramInt1 = i1;
    }
  }
  
  /* Error */
  private final int e(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: bipush 74
    //   3: putfield 579	bsh/ParserTokenManager:q	I
    //   6: aload_0
    //   7: getfield 341	bsh/ParserTokenManager:v	[I
    //   10: iconst_0
    //   11: iload_1
    //   12: iastore
    //   13: iconst_1
    //   14: istore_3
    //   15: iload_2
    //   16: istore 4
    //   18: iconst_1
    //   19: istore 5
    //   21: ldc_w 719
    //   24: istore 6
    //   26: iconst_0
    //   27: istore 7
    //   29: iload_3
    //   30: aload_0
    //   31: getfield 577	bsh/ParserTokenManager:r	I
    //   34: iadd
    //   35: istore 8
    //   37: aload_0
    //   38: iload 8
    //   40: putfield 577	bsh/ParserTokenManager:r	I
    //   43: iload 8
    //   45: ldc_w 719
    //   48: if_icmpne +7 -> 55
    //   51: aload_0
    //   52: invokespecial 721	bsh/ParserTokenManager:c	()V
    //   55: aload_0
    //   56: getfield 370	bsh/ParserTokenManager:n	C
    //   59: istore 9
    //   61: bipush 10
    //   63: istore 10
    //   65: bipush 63
    //   67: istore 11
    //   69: iload 9
    //   71: bipush 64
    //   73: if_icmpge +2241 -> 2314
    //   76: lconst_1
    //   77: aload_0
    //   78: getfield 370	bsh/ParserTokenManager:n	C
    //   81: lshl
    //   82: lstore 35
    //   84: aload_0
    //   85: getfield 341	bsh/ParserTokenManager:v	[I
    //   88: astore 37
    //   90: iinc 5 -1
    //   93: aload 37
    //   95: iload 5
    //   97: iaload
    //   98: istore 38
    //   100: bipush 42
    //   102: istore 39
    //   104: iload 38
    //   106: tableswitch	default:+310->416, 0:+2158->2264, 1:+2138->2244, 2:+2124->2230, 3:+2099->2205, 4:+2080->2186, 5:+2042->2148, 6:+1775->1881, 7:+1735->1841, 8:+1711->1817, 9:+310->416, 10:+1695->1801, 11:+1651->1757, 12:+310->416, 13:+1633->1739, 14:+1589->1695, 15:+310->416, 16:+1569->1675, 17:+1549->1655, 18:+1526->1632, 19:+310->416, 20:+1512->1618, 21:+1490->1596, 22:+1476->1582, 23:+1435->1541, 24:+1417->1523, 25:+1393->1499, 26:+1375->1481, 27:+310->416, 28:+1357->1463, 29:+1334->1440, 30:+1312->1418, 31:+1298->1404, 32:+1257->1363, 33:+1239->1345, 34:+1203->1309, 35:+1179->1285, 36:+1150->1256, 37:+1128->1234, 38:+1094->1200, 39:+1070->1176, 40:+310->416, 41:+1056->1162, 42:+1028->1134, 43:+1006->1112, 44:+310->416, 45:+988->1094, 46:+956->1062, 47:+934->1040, 48:+310->416, 49:+916->1022, 50:+898->1004, 51:+864->970, 52:+310->416, 53:+832->938, 54:+800->906, 55:+780->886, 56:+697->803, 57:+661->767, 58:+636->742, 59:+617->723, 60:+578->684, 61:+562->668, 62:+536->642, 63:+516->622, 64:+498->604, 65:+484->590, 66:+461->567, 67:+437->543, 68:+423->529, 69:+407->513, 70:+389->495, 71:+375->481, 72:+352->458, 73:+313->419
    //   416: goto +1462 -> 1878
    //   419: aload_0
    //   420: getfield 370	bsh/ParserTokenManager:n	C
    //   423: iload 39
    //   425: if_icmpne +1453 -> 1878
    //   428: aload_0
    //   429: getfield 341	bsh/ParserTokenManager:v	[I
    //   432: astore 63
    //   434: aload_0
    //   435: getfield 579	bsh/ParserTokenManager:q	I
    //   438: istore 64
    //   440: aload_0
    //   441: iload 64
    //   443: iconst_1
    //   444: iadd
    //   445: putfield 579	bsh/ParserTokenManager:q	I
    //   448: aload 63
    //   450: iload 64
    //   452: bipush 67
    //   454: iastore
    //   455: goto +1423 -> 1878
    //   458: aload_0
    //   459: getfield 370	bsh/ParserTokenManager:n	C
    //   462: bipush 47
    //   464: if_icmpne +1414 -> 1878
    //   467: iload 6
    //   469: bipush 68
    //   471: if_icmple +1407 -> 1878
    //   474: bipush 68
    //   476: istore 6
    //   478: goto +1400 -> 1878
    //   481: lload 35
    //   483: ldc2_w 722
    //   486: land
    //   487: lconst_0
    //   488: lcmp
    //   489: ifeq +1389 -> 1878
    //   492: goto +14 -> 506
    //   495: lload 35
    //   497: ldc2_w 724
    //   500: land
    //   501: lconst_0
    //   502: lcmp
    //   503: ifeq +1375 -> 1878
    //   506: bipush 71
    //   508: istore 62
    //   510: goto +46 -> 556
    //   513: aload_0
    //   514: getfield 370	bsh/ParserTokenManager:n	C
    //   517: iload 39
    //   519: if_icmpne +1359 -> 1878
    //   522: bipush 40
    //   524: istore 56
    //   526: goto +748 -> 1274
    //   529: lload 35
    //   531: ldc2_w 722
    //   534: land
    //   535: lconst_0
    //   536: lcmp
    //   537: ifeq +1341 -> 1878
    //   540: goto +12 -> 552
    //   543: aload_0
    //   544: getfield 370	bsh/ParserTokenManager:n	C
    //   547: iload 39
    //   549: if_icmpne +1329 -> 1878
    //   552: bipush 68
    //   554: istore 62
    //   556: aload_0
    //   557: iload 62
    //   559: bipush 69
    //   561: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   564: goto +1314 -> 1878
    //   567: aload_0
    //   568: getfield 370	bsh/ParserTokenManager:n	C
    //   571: bipush 47
    //   573: if_icmpne +1305 -> 1878
    //   576: iload 6
    //   578: bipush 9
    //   580: if_icmple +1298 -> 1878
    //   583: bipush 9
    //   585: istore 6
    //   587: goto +1291 -> 1878
    //   590: lload 35
    //   592: ldc2_w 722
    //   595: land
    //   596: lconst_0
    //   597: lcmp
    //   598: ifeq +1280 -> 1878
    //   601: goto +14 -> 615
    //   604: lload 35
    //   606: ldc2_w 724
    //   609: land
    //   610: lconst_0
    //   611: lcmp
    //   612: ifeq +1266 -> 1878
    //   615: bipush 65
    //   617: istore 61
    //   619: goto +38 -> 657
    //   622: aload_0
    //   623: getfield 370	bsh/ParserTokenManager:n	C
    //   626: iload 39
    //   628: if_icmpne +1250 -> 1878
    //   631: bipush 37
    //   633: istore 48
    //   635: bipush 39
    //   637: istore 49
    //   639: goto +1151 -> 1790
    //   642: lload 35
    //   644: ldc2_w 722
    //   647: land
    //   648: lconst_0
    //   649: lcmp
    //   650: ifeq +1228 -> 1878
    //   653: bipush 62
    //   655: istore 61
    //   657: aload_0
    //   658: iload 61
    //   660: iload 11
    //   662: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   665: goto +1213 -> 1878
    //   668: aload_0
    //   669: getfield 370	bsh/ParserTokenManager:n	C
    //   672: iload 39
    //   674: if_icmpne +1204 -> 1878
    //   677: bipush 62
    //   679: istore 39
    //   681: goto +655 -> 1336
    //   684: aload_0
    //   685: getfield 370	bsh/ParserTokenManager:n	C
    //   688: bipush 13
    //   690: if_icmpne +1188 -> 1878
    //   693: aload_0
    //   694: getfield 341	bsh/ParserTokenManager:v	[I
    //   697: astore 59
    //   699: aload_0
    //   700: getfield 579	bsh/ParserTokenManager:q	I
    //   703: istore 60
    //   705: aload_0
    //   706: iload 60
    //   708: iconst_1
    //   709: iadd
    //   710: putfield 579	bsh/ParserTokenManager:q	I
    //   713: aload 59
    //   715: iload 60
    //   717: bipush 59
    //   719: iastore
    //   720: goto +1158 -> 1878
    //   723: aload_0
    //   724: getfield 370	bsh/ParserTokenManager:n	C
    //   727: iload 10
    //   729: if_icmpne +1149 -> 1878
    //   732: iload 6
    //   734: bipush 7
    //   736: if_icmple +1142 -> 1878
    //   739: goto +21 -> 760
    //   742: lload 35
    //   744: ldc2_w 728
    //   747: land
    //   748: lconst_0
    //   749: lcmp
    //   750: ifeq +1128 -> 1878
    //   753: iload 6
    //   755: bipush 7
    //   757: if_icmple +1121 -> 1878
    //   760: bipush 7
    //   762: istore 6
    //   764: goto +1114 -> 1878
    //   767: lload 35
    //   769: ldc2_w 730
    //   772: land
    //   773: lconst_0
    //   774: lcmp
    //   775: ifne +6 -> 781
    //   778: goto +1100 -> 1878
    //   781: iload 6
    //   783: bipush 7
    //   785: if_icmple +7 -> 792
    //   788: bipush 7
    //   790: istore 6
    //   792: aload_0
    //   793: bipush 18
    //   795: bipush 20
    //   797: invokespecial 733	bsh/ParserTokenManager:d	(II)V
    //   800: goto +1078 -> 1878
    //   803: aload_0
    //   804: getfield 370	bsh/ParserTokenManager:n	C
    //   807: iload 39
    //   809: if_icmpne +33 -> 842
    //   812: aload_0
    //   813: getfield 341	bsh/ParserTokenManager:v	[I
    //   816: astore 57
    //   818: aload_0
    //   819: getfield 579	bsh/ParserTokenManager:q	I
    //   822: istore 58
    //   824: aload_0
    //   825: iload 58
    //   827: iconst_1
    //   828: iadd
    //   829: putfield 579	bsh/ParserTokenManager:q	I
    //   832: aload 57
    //   834: iload 58
    //   836: bipush 67
    //   838: iastore
    //   839: goto +31 -> 870
    //   842: aload_0
    //   843: getfield 370	bsh/ParserTokenManager:n	C
    //   846: bipush 47
    //   848: if_icmpne +22 -> 870
    //   851: iload 6
    //   853: bipush 7
    //   855: if_icmple +7 -> 862
    //   858: bipush 7
    //   860: istore 6
    //   862: aload_0
    //   863: bipush 18
    //   865: bipush 20
    //   867: invokespecial 733	bsh/ParserTokenManager:d	(II)V
    //   870: aload_0
    //   871: getfield 370	bsh/ParserTokenManager:n	C
    //   874: iload 39
    //   876: if_icmpne +1002 -> 1878
    //   879: bipush 62
    //   881: istore 39
    //   883: goto +453 -> 1336
    //   886: aload_0
    //   887: getfield 370	bsh/ParserTokenManager:n	C
    //   890: bipush 47
    //   892: if_icmpne +986 -> 1878
    //   895: aload_0
    //   896: bipush 7
    //   898: bipush 9
    //   900: invokespecial 735	bsh/ParserTokenManager:b	(II)V
    //   903: goto +975 -> 1878
    //   906: lload 35
    //   908: ldc2_w 736
    //   911: land
    //   912: lconst_0
    //   913: lcmp
    //   914: ifne +6 -> 920
    //   917: goto +961 -> 1878
    //   920: iload 6
    //   922: bipush 60
    //   924: if_icmple +7 -> 931
    //   927: bipush 60
    //   929: istore 6
    //   931: bipush 54
    //   933: istore 47
    //   935: goto +935 -> 1870
    //   938: lload 35
    //   940: ldc2_w 738
    //   943: land
    //   944: lconst_0
    //   945: lcmp
    //   946: ifne +6 -> 952
    //   949: goto +929 -> 1878
    //   952: iload 6
    //   954: bipush 60
    //   956: if_icmple +7 -> 963
    //   959: bipush 60
    //   961: istore 6
    //   963: bipush 53
    //   965: istore 47
    //   967: goto +903 -> 1870
    //   970: aload_0
    //   971: getfield 370	bsh/ParserTokenManager:n	C
    //   974: bipush 48
    //   976: if_icmpeq +6 -> 982
    //   979: goto +899 -> 1878
    //   982: iload 6
    //   984: bipush 60
    //   986: if_icmple +7 -> 993
    //   989: bipush 60
    //   991: istore 6
    //   993: bipush 15
    //   995: istore 48
    //   997: bipush 17
    //   999: istore 49
    //   1001: goto +789 -> 1790
    //   1004: lload 35
    //   1006: ldc2_w 738
    //   1009: land
    //   1010: lconst_0
    //   1011: lcmp
    //   1012: ifeq +866 -> 1878
    //   1015: bipush 50
    //   1017: istore 39
    //   1019: goto +705 -> 1724
    //   1022: lload 35
    //   1024: ldc2_w 479
    //   1027: land
    //   1028: lconst_0
    //   1029: lcmp
    //   1030: ifeq +848 -> 1878
    //   1033: bipush 50
    //   1035: istore 39
    //   1037: goto +299 -> 1336
    //   1040: lload 35
    //   1042: ldc2_w 738
    //   1045: land
    //   1046: lconst_0
    //   1047: lcmp
    //   1048: ifeq +830 -> 1878
    //   1051: bipush 34
    //   1053: istore 48
    //   1055: bipush 36
    //   1057: istore 49
    //   1059: goto +731 -> 1790
    //   1062: lload 35
    //   1064: ldc2_w 738
    //   1067: land
    //   1068: lconst_0
    //   1069: lcmp
    //   1070: ifne +6 -> 1076
    //   1073: goto +805 -> 1878
    //   1076: iload 6
    //   1078: bipush 64
    //   1080: if_icmple +7 -> 1087
    //   1083: bipush 64
    //   1085: istore 6
    //   1087: bipush 46
    //   1089: istore 39
    //   1091: goto +633 -> 1724
    //   1094: lload 35
    //   1096: ldc2_w 479
    //   1099: land
    //   1100: lconst_0
    //   1101: lcmp
    //   1102: ifeq +776 -> 1878
    //   1105: bipush 46
    //   1107: istore 39
    //   1109: goto +227 -> 1336
    //   1112: lload 35
    //   1114: ldc2_w 738
    //   1117: land
    //   1118: lconst_0
    //   1119: lcmp
    //   1120: ifeq +758 -> 1878
    //   1123: bipush 43
    //   1125: istore 39
    //   1127: bipush 44
    //   1129: istore 50
    //   1131: goto +597 -> 1728
    //   1134: lload 35
    //   1136: ldc2_w 738
    //   1139: land
    //   1140: lconst_0
    //   1141: lcmp
    //   1142: ifne +6 -> 1148
    //   1145: goto +733 -> 1878
    //   1148: iload 6
    //   1150: bipush 64
    //   1152: if_icmple +572 -> 1724
    //   1155: bipush 64
    //   1157: istore 6
    //   1159: goto +565 -> 1724
    //   1162: lload 35
    //   1164: ldc2_w 479
    //   1167: land
    //   1168: lconst_0
    //   1169: lcmp
    //   1170: ifeq +708 -> 1878
    //   1173: goto +163 -> 1336
    //   1176: lload 35
    //   1178: ldc2_w 738
    //   1181: land
    //   1182: lconst_0
    //   1183: lcmp
    //   1184: ifne +6 -> 1190
    //   1187: goto +691 -> 1878
    //   1190: iload 6
    //   1192: bipush 64
    //   1194: if_icmple +29 -> 1223
    //   1197: goto +22 -> 1219
    //   1200: aload_0
    //   1201: getfield 370	bsh/ParserTokenManager:n	C
    //   1204: bipush 46
    //   1206: if_icmpeq +6 -> 1212
    //   1209: goto +669 -> 1878
    //   1212: iload 6
    //   1214: bipush 64
    //   1216: if_icmple +7 -> 1223
    //   1219: bipush 64
    //   1221: istore 6
    //   1223: bipush 31
    //   1225: istore 48
    //   1227: bipush 33
    //   1229: istore 49
    //   1231: goto +559 -> 1790
    //   1234: lload 35
    //   1236: ldc2_w 738
    //   1239: land
    //   1240: lconst_0
    //   1241: lcmp
    //   1242: ifeq +636 -> 1878
    //   1245: bipush 37
    //   1247: istore 39
    //   1249: bipush 38
    //   1251: istore 50
    //   1253: goto +475 -> 1728
    //   1256: lload 35
    //   1258: ldc2_w 738
    //   1261: land
    //   1262: lconst_0
    //   1263: lcmp
    //   1264: ifeq +614 -> 1878
    //   1267: bipush 6
    //   1269: istore 39
    //   1271: iconst_0
    //   1272: istore 56
    //   1274: aload_0
    //   1275: iload 56
    //   1277: iload 39
    //   1279: invokespecial 733	bsh/ParserTokenManager:d	(II)V
    //   1282: goto +596 -> 1878
    //   1285: lload 35
    //   1287: ldc2_w 740
    //   1290: land
    //   1291: lconst_0
    //   1292: lcmp
    //   1293: ifne +6 -> 1299
    //   1296: goto +582 -> 1878
    //   1299: iload 6
    //   1301: bipush 69
    //   1303: if_icmple +29 -> 1332
    //   1306: goto +22 -> 1328
    //   1309: aload_0
    //   1310: getfield 370	bsh/ParserTokenManager:n	C
    //   1313: bipush 36
    //   1315: if_icmpeq +6 -> 1321
    //   1318: goto +560 -> 1878
    //   1321: iload 6
    //   1323: bipush 69
    //   1325: if_icmple +7 -> 1332
    //   1328: bipush 69
    //   1330: istore 6
    //   1332: bipush 35
    //   1334: istore 39
    //   1336: aload_0
    //   1337: iload 39
    //   1339: invokespecial 700	bsh/ParserTokenManager:a	(I)V
    //   1342: goto +536 -> 1878
    //   1345: lload 35
    //   1347: ldc2_w 736
    //   1350: land
    //   1351: lconst_0
    //   1352: lcmp
    //   1353: ifeq +525 -> 1878
    //   1356: bipush 31
    //   1358: istore 39
    //   1360: goto -24 -> 1336
    //   1363: lload 35
    //   1365: ldc2_w 742
    //   1368: land
    //   1369: lconst_0
    //   1370: lcmp
    //   1371: ifeq +507 -> 1878
    //   1374: aload_0
    //   1375: getfield 341	bsh/ParserTokenManager:v	[I
    //   1378: astore 54
    //   1380: aload_0
    //   1381: getfield 579	bsh/ParserTokenManager:q	I
    //   1384: istore 55
    //   1386: aload_0
    //   1387: iload 55
    //   1389: iconst_1
    //   1390: iadd
    //   1391: putfield 579	bsh/ParserTokenManager:q	I
    //   1394: aload 54
    //   1396: iload 55
    //   1398: bipush 33
    //   1400: iastore
    //   1401: goto +477 -> 1878
    //   1404: lload 35
    //   1406: ldc2_w 736
    //   1409: land
    //   1410: lconst_0
    //   1411: lcmp
    //   1412: ifeq +466 -> 1878
    //   1415: goto +59 -> 1474
    //   1418: lload 35
    //   1420: ldc2_w 736
    //   1423: land
    //   1424: lconst_0
    //   1425: lcmp
    //   1426: ifeq +452 -> 1878
    //   1429: bipush 27
    //   1431: istore 48
    //   1433: bipush 30
    //   1435: istore 49
    //   1437: goto +353 -> 1790
    //   1440: aload_0
    //   1441: getfield 370	bsh/ParserTokenManager:n	C
    //   1444: bipush 34
    //   1446: if_icmpne +432 -> 1878
    //   1449: iload 6
    //   1451: bipush 67
    //   1453: if_icmple +425 -> 1878
    //   1456: bipush 67
    //   1458: istore 6
    //   1460: goto +418 -> 1878
    //   1463: lload 35
    //   1465: ldc2_w 744
    //   1468: land
    //   1469: lconst_0
    //   1470: lcmp
    //   1471: ifeq +407 -> 1878
    //   1474: bipush 12
    //   1476: istore 53
    //   1478: goto +34 -> 1512
    //   1481: bipush 12
    //   1483: istore 53
    //   1485: lload 35
    //   1487: ldc2_w 746
    //   1490: land
    //   1491: lconst_0
    //   1492: lcmp
    //   1493: ifeq +385 -> 1878
    //   1496: goto +16 -> 1512
    //   1499: bipush 12
    //   1501: istore 53
    //   1503: aload_0
    //   1504: getfield 370	bsh/ParserTokenManager:n	C
    //   1507: bipush 34
    //   1509: if_icmpne +369 -> 1878
    //   1512: aload_0
    //   1513: iload 10
    //   1515: iload 53
    //   1517: invokespecial 733	bsh/ParserTokenManager:d	(II)V
    //   1520: goto +358 -> 1878
    //   1523: lload 35
    //   1525: ldc2_w 736
    //   1528: land
    //   1529: lconst_0
    //   1530: lcmp
    //   1531: ifeq +347 -> 1878
    //   1534: bipush 22
    //   1536: istore 39
    //   1538: goto -202 -> 1336
    //   1541: lload 35
    //   1543: ldc2_w 742
    //   1546: land
    //   1547: lconst_0
    //   1548: lcmp
    //   1549: ifeq +329 -> 1878
    //   1552: aload_0
    //   1553: getfield 341	bsh/ParserTokenManager:v	[I
    //   1556: astore 51
    //   1558: aload_0
    //   1559: getfield 579	bsh/ParserTokenManager:q	I
    //   1562: istore 52
    //   1564: aload_0
    //   1565: iload 52
    //   1567: iconst_1
    //   1568: iadd
    //   1569: putfield 579	bsh/ParserTokenManager:q	I
    //   1572: aload 51
    //   1574: iload 52
    //   1576: bipush 24
    //   1578: iastore
    //   1579: goto +299 -> 1878
    //   1582: lload 35
    //   1584: ldc2_w 736
    //   1587: land
    //   1588: lconst_0
    //   1589: lcmp
    //   1590: ifeq +288 -> 1878
    //   1593: goto +73 -> 1666
    //   1596: lload 35
    //   1598: ldc2_w 736
    //   1601: land
    //   1602: lconst_0
    //   1603: lcmp
    //   1604: ifeq +274 -> 1878
    //   1607: aload_0
    //   1608: bipush 22
    //   1610: bipush 18
    //   1612: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   1615: goto +263 -> 1878
    //   1618: lload 35
    //   1620: ldc2_w 744
    //   1623: land
    //   1624: lconst_0
    //   1625: lcmp
    //   1626: ifeq +252 -> 1878
    //   1629: goto +37 -> 1666
    //   1632: aload_0
    //   1633: getfield 370	bsh/ParserTokenManager:n	C
    //   1636: bipush 39
    //   1638: if_icmpne +240 -> 1878
    //   1641: iload 6
    //   1643: bipush 66
    //   1645: if_icmple +233 -> 1878
    //   1648: bipush 66
    //   1650: istore 6
    //   1652: goto +226 -> 1878
    //   1655: lload 35
    //   1657: ldc2_w 748
    //   1660: land
    //   1661: lconst_0
    //   1662: lcmp
    //   1663: ifeq +215 -> 1878
    //   1666: aload_0
    //   1667: bipush 18
    //   1669: invokespecial 700	bsh/ParserTokenManager:a	(I)V
    //   1672: goto +206 -> 1878
    //   1675: aload_0
    //   1676: getfield 370	bsh/ParserTokenManager:n	C
    //   1679: bipush 39
    //   1681: if_icmpne +197 -> 1878
    //   1684: aload_0
    //   1685: bipush 13
    //   1687: bipush 14
    //   1689: invokespecial 735	bsh/ParserTokenManager:b	(II)V
    //   1692: goto +186 -> 1878
    //   1695: lload 35
    //   1697: ldc2_w 738
    //   1700: land
    //   1701: lconst_0
    //   1702: lcmp
    //   1703: ifne +6 -> 1709
    //   1706: goto +172 -> 1878
    //   1709: iload 6
    //   1711: bipush 64
    //   1713: if_icmple +7 -> 1720
    //   1716: bipush 64
    //   1718: istore 6
    //   1720: bipush 14
    //   1722: istore 39
    //   1724: bipush 15
    //   1726: istore 50
    //   1728: aload_0
    //   1729: iload 39
    //   1731: iload 50
    //   1733: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   1736: goto +142 -> 1878
    //   1739: lload 35
    //   1741: ldc2_w 479
    //   1744: land
    //   1745: lconst_0
    //   1746: lcmp
    //   1747: ifeq +131 -> 1878
    //   1750: bipush 14
    //   1752: istore 39
    //   1754: goto -418 -> 1336
    //   1757: lload 35
    //   1759: ldc2_w 738
    //   1762: land
    //   1763: lconst_0
    //   1764: lcmp
    //   1765: ifne +6 -> 1771
    //   1768: goto +110 -> 1878
    //   1771: iload 6
    //   1773: bipush 64
    //   1775: if_icmple +7 -> 1782
    //   1778: bipush 64
    //   1780: istore 6
    //   1782: bipush 24
    //   1784: istore 48
    //   1786: bipush 26
    //   1788: istore 49
    //   1790: aload_0
    //   1791: iload 48
    //   1793: iload 49
    //   1795: invokespecial 733	bsh/ParserTokenManager:d	(II)V
    //   1798: goto +80 -> 1878
    //   1801: aload_0
    //   1802: getfield 370	bsh/ParserTokenManager:n	C
    //   1805: bipush 46
    //   1807: if_icmpne +71 -> 1878
    //   1810: bipush 11
    //   1812: istore 39
    //   1814: goto -478 -> 1336
    //   1817: lload 35
    //   1819: ldc2_w 738
    //   1822: land
    //   1823: lconst_0
    //   1824: lcmp
    //   1825: ifne +6 -> 1831
    //   1828: goto +50 -> 1878
    //   1831: iload 6
    //   1833: bipush 60
    //   1835: if_icmple +31 -> 1866
    //   1838: goto +24 -> 1862
    //   1841: lload 35
    //   1843: ldc2_w 750
    //   1846: land
    //   1847: lconst_0
    //   1848: lcmp
    //   1849: ifne +6 -> 1855
    //   1852: goto +26 -> 1878
    //   1855: iload 6
    //   1857: bipush 60
    //   1859: if_icmple +7 -> 1866
    //   1862: bipush 60
    //   1864: istore 6
    //   1866: bipush 8
    //   1868: istore 47
    //   1870: aload_0
    //   1871: iload 47
    //   1873: bipush 9
    //   1875: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   1878: goto +419 -> 2297
    //   1881: lload 35
    //   1883: ldc2_w 752
    //   1886: land
    //   1887: lconst_0
    //   1888: lcmp
    //   1889: ifeq +22 -> 1911
    //   1892: iload 6
    //   1894: bipush 6
    //   1896: if_icmple +7 -> 1903
    //   1899: bipush 6
    //   1901: istore 6
    //   1903: aload_0
    //   1904: iconst_0
    //   1905: invokespecial 700	bsh/ParserTokenManager:a	(I)V
    //   1908: goto +168 -> 2076
    //   1911: lload 35
    //   1913: ldc2_w 738
    //   1916: land
    //   1917: lconst_0
    //   1918: lcmp
    //   1919: ifeq +13 -> 1932
    //   1922: aload_0
    //   1923: iconst_0
    //   1924: bipush 6
    //   1926: invokespecial 733	bsh/ParserTokenManager:d	(II)V
    //   1929: goto -21 -> 1908
    //   1932: aload_0
    //   1933: getfield 370	bsh/ParserTokenManager:n	C
    //   1936: bipush 47
    //   1938: if_icmpne +14 -> 1952
    //   1941: aload_0
    //   1942: bipush 7
    //   1944: bipush 9
    //   1946: invokespecial 735	bsh/ParserTokenManager:b	(II)V
    //   1949: goto -41 -> 1908
    //   1952: aload_0
    //   1953: getfield 370	bsh/ParserTokenManager:n	C
    //   1956: bipush 36
    //   1958: if_icmpne +27 -> 1985
    //   1961: iload 6
    //   1963: bipush 69
    //   1965: if_icmple +7 -> 1972
    //   1968: bipush 69
    //   1970: istore 6
    //   1972: bipush 35
    //   1974: istore 46
    //   1976: aload_0
    //   1977: iload 46
    //   1979: invokespecial 700	bsh/ParserTokenManager:a	(I)V
    //   1982: goto -74 -> 1908
    //   1985: aload_0
    //   1986: getfield 370	bsh/ParserTokenManager:n	C
    //   1989: bipush 34
    //   1991: if_icmpne +14 -> 2005
    //   1994: aload_0
    //   1995: iload 10
    //   1997: bipush 12
    //   1999: invokespecial 733	bsh/ParserTokenManager:d	(II)V
    //   2002: goto -94 -> 1908
    //   2005: aload_0
    //   2006: getfield 370	bsh/ParserTokenManager:n	C
    //   2009: bipush 39
    //   2011: if_icmpne +14 -> 2025
    //   2014: aload_0
    //   2015: bipush 13
    //   2017: bipush 14
    //   2019: invokespecial 735	bsh/ParserTokenManager:b	(II)V
    //   2022: goto -114 -> 1908
    //   2025: aload_0
    //   2026: getfield 370	bsh/ParserTokenManager:n	C
    //   2029: bipush 46
    //   2031: if_icmpne +10 -> 2041
    //   2034: bipush 11
    //   2036: istore 46
    //   2038: goto -62 -> 1976
    //   2041: aload_0
    //   2042: getfield 370	bsh/ParserTokenManager:n	C
    //   2045: bipush 35
    //   2047: if_icmpne -139 -> 1908
    //   2050: aload_0
    //   2051: getfield 341	bsh/ParserTokenManager:v	[I
    //   2054: astore 44
    //   2056: aload_0
    //   2057: getfield 579	bsh/ParserTokenManager:q	I
    //   2060: istore 45
    //   2062: aload_0
    //   2063: iload 45
    //   2065: iconst_1
    //   2066: iadd
    //   2067: putfield 579	bsh/ParserTokenManager:q	I
    //   2070: aload 44
    //   2072: iload 45
    //   2074: iconst_1
    //   2075: iastore
    //   2076: lload 35
    //   2078: ldc2_w 750
    //   2081: land
    //   2082: lconst_0
    //   2083: lcmp
    //   2084: ifeq +25 -> 2109
    //   2087: iload 6
    //   2089: bipush 60
    //   2091: if_icmple +7 -> 2098
    //   2094: bipush 60
    //   2096: istore 6
    //   2098: aload_0
    //   2099: bipush 8
    //   2101: bipush 9
    //   2103: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   2106: goto +191 -> 2297
    //   2109: aload_0
    //   2110: getfield 370	bsh/ParserTokenManager:n	C
    //   2113: bipush 48
    //   2115: if_icmpne +182 -> 2297
    //   2118: iload 6
    //   2120: bipush 60
    //   2122: if_icmple +7 -> 2129
    //   2125: bipush 60
    //   2127: istore 6
    //   2129: bipush 15
    //   2131: istore 40
    //   2133: bipush 17
    //   2135: istore 41
    //   2137: aload_0
    //   2138: iload 40
    //   2140: iload 41
    //   2142: invokespecial 733	bsh/ParserTokenManager:d	(II)V
    //   2145: goto +152 -> 2297
    //   2148: aload_0
    //   2149: getfield 370	bsh/ParserTokenManager:n	C
    //   2152: bipush 13
    //   2154: if_icmpne +143 -> 2297
    //   2157: aload_0
    //   2158: getfield 341	bsh/ParserTokenManager:v	[I
    //   2161: astore 42
    //   2163: aload_0
    //   2164: getfield 579	bsh/ParserTokenManager:q	I
    //   2167: istore 43
    //   2169: aload_0
    //   2170: iload 43
    //   2172: iconst_1
    //   2173: iadd
    //   2174: putfield 579	bsh/ParserTokenManager:q	I
    //   2177: aload 42
    //   2179: iload 43
    //   2181: iconst_4
    //   2182: iastore
    //   2183: goto +114 -> 2297
    //   2186: aload_0
    //   2187: getfield 370	bsh/ParserTokenManager:n	C
    //   2190: iload 10
    //   2192: if_icmpne +105 -> 2297
    //   2195: iload 6
    //   2197: bipush 8
    //   2199: if_icmple +98 -> 2297
    //   2202: goto +21 -> 2223
    //   2205: lload 35
    //   2207: ldc2_w 728
    //   2210: land
    //   2211: lconst_0
    //   2212: lcmp
    //   2213: ifeq +84 -> 2297
    //   2216: iload 6
    //   2218: bipush 8
    //   2220: if_icmple +77 -> 2297
    //   2223: bipush 8
    //   2225: istore 6
    //   2227: goto +70 -> 2297
    //   2230: lload 35
    //   2232: ldc2_w 730
    //   2235: land
    //   2236: lconst_0
    //   2237: lcmp
    //   2238: ifeq +59 -> 2297
    //   2241: goto +12 -> 2253
    //   2244: aload_0
    //   2245: getfield 370	bsh/ParserTokenManager:n	C
    //   2248: bipush 33
    //   2250: if_icmpne +47 -> 2297
    //   2253: bipush 21
    //   2255: istore 40
    //   2257: bipush 23
    //   2259: istore 41
    //   2261: goto -124 -> 2137
    //   2264: lload 35
    //   2266: ldc2_w 752
    //   2269: land
    //   2270: lconst_0
    //   2271: lcmp
    //   2272: ifne +6 -> 2278
    //   2275: goto +22 -> 2297
    //   2278: iload 6
    //   2280: bipush 6
    //   2282: if_icmple +10 -> 2292
    //   2285: bipush 6
    //   2287: istore 6
    //   2289: goto +3 -> 2292
    //   2292: aload_0
    //   2293: iconst_0
    //   2294: invokespecial 700	bsh/ParserTokenManager:a	(I)V
    //   2297: iload 5
    //   2299: iload 7
    //   2301: if_icmpne +6 -> 2307
    //   2304: goto +1295 -> 3599
    //   2307: bipush 63
    //   2309: istore 11
    //   2311: goto -2227 -> 84
    //   2314: aload_0
    //   2315: getfield 370	bsh/ParserTokenManager:n	C
    //   2318: sipush 128
    //   2321: if_icmpge +674 -> 2995
    //   2324: lconst_1
    //   2325: bipush 63
    //   2327: aload_0
    //   2328: getfield 370	bsh/ParserTokenManager:n	C
    //   2331: iand
    //   2332: lshl
    //   2333: lstore 26
    //   2335: aload_0
    //   2336: getfield 341	bsh/ParserTokenManager:v	[I
    //   2339: astore 28
    //   2341: iinc 5 -1
    //   2344: aload 28
    //   2346: iload 5
    //   2348: iaload
    //   2349: lookupswitch	default:+203->2552, 2:+620->2969, 6:+582->2931, 9:+557->2906, 12:+535->2884, 15:+510->2859, 17:+490->2839, 19:+470->2819, 20:+456->2805, 26:+434->2783, 27:+414->2763, 28:+400->2749, 35:+582->2931, 40:+378->2727, 44:+356->2705, 48:+334->2683, 52:+316->2665, 53:+280->2629, 57:+258->2607, 62:+239->2588, 64:+228->2577, 65:+228->2577, 68:+213->2562, 70:+206->2555, 71:+206->2555
    //   2552: goto +433 -> 2985
    //   2555: bipush 71
    //   2557: istore 34
    //   2559: goto +7 -> 2566
    //   2562: bipush 68
    //   2564: istore 34
    //   2566: aload_0
    //   2567: iload 34
    //   2569: bipush 69
    //   2571: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   2574: goto +411 -> 2985
    //   2577: bipush 65
    //   2579: istore 33
    //   2581: bipush 63
    //   2583: istore 32
    //   2585: goto +11 -> 2596
    //   2588: bipush 63
    //   2590: istore 32
    //   2592: bipush 62
    //   2594: istore 33
    //   2596: aload_0
    //   2597: iload 33
    //   2599: iload 32
    //   2601: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   2604: goto +381 -> 2985
    //   2607: iload 6
    //   2609: bipush 7
    //   2611: if_icmple +7 -> 2618
    //   2614: bipush 7
    //   2616: istore 6
    //   2618: aload_0
    //   2619: bipush 18
    //   2621: bipush 20
    //   2623: invokespecial 735	bsh/ParserTokenManager:b	(II)V
    //   2626: goto +359 -> 2985
    //   2629: lload 26
    //   2631: ldc2_w 754
    //   2634: land
    //   2635: lconst_0
    //   2636: lcmp
    //   2637: ifne +6 -> 2643
    //   2640: goto +345 -> 2985
    //   2643: iload 6
    //   2645: bipush 60
    //   2647: if_icmple +7 -> 2654
    //   2650: bipush 60
    //   2652: istore 6
    //   2654: aload_0
    //   2655: bipush 53
    //   2657: bipush 9
    //   2659: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   2662: goto +323 -> 2985
    //   2665: lload 26
    //   2667: ldc2_w 756
    //   2670: land
    //   2671: lconst_0
    //   2672: lcmp
    //   2673: ifeq +312 -> 2985
    //   2676: bipush 53
    //   2678: istore 31
    //   2680: goto +280 -> 2960
    //   2683: lload 26
    //   2685: ldc2_w 758
    //   2688: land
    //   2689: lconst_0
    //   2690: lcmp
    //   2691: ifeq +294 -> 2985
    //   2694: bipush 55
    //   2696: istore 29
    //   2698: bipush 56
    //   2700: istore 30
    //   2702: goto +275 -> 2977
    //   2705: lload 26
    //   2707: ldc2_w 758
    //   2710: land
    //   2711: lconst_0
    //   2712: lcmp
    //   2713: ifeq +272 -> 2985
    //   2716: bipush 53
    //   2718: istore 29
    //   2720: bipush 54
    //   2722: istore 30
    //   2724: goto +253 -> 2977
    //   2727: lload 26
    //   2729: ldc2_w 758
    //   2732: land
    //   2733: lconst_0
    //   2734: lcmp
    //   2735: ifeq +250 -> 2985
    //   2738: bipush 51
    //   2740: istore 29
    //   2742: bipush 52
    //   2744: istore 30
    //   2746: goto +231 -> 2977
    //   2749: lload 26
    //   2751: ldc2_w 760
    //   2754: land
    //   2755: lconst_0
    //   2756: lcmp
    //   2757: ifeq +228 -> 2985
    //   2760: goto +34 -> 2794
    //   2763: aload_0
    //   2764: getfield 370	bsh/ParserTokenManager:n	C
    //   2767: bipush 92
    //   2769: if_icmpne +216 -> 2985
    //   2772: bipush 48
    //   2774: istore 29
    //   2776: bipush 50
    //   2778: istore 30
    //   2780: goto +197 -> 2977
    //   2783: lload 26
    //   2785: ldc2_w 762
    //   2788: land
    //   2789: lconst_0
    //   2790: lcmp
    //   2791: ifeq +194 -> 2985
    //   2794: aload_0
    //   2795: iload 10
    //   2797: bipush 12
    //   2799: invokespecial 733	bsh/ParserTokenManager:d	(II)V
    //   2802: goto +183 -> 2985
    //   2805: lload 26
    //   2807: ldc2_w 760
    //   2810: land
    //   2811: lconst_0
    //   2812: lcmp
    //   2813: ifeq +172 -> 2985
    //   2816: goto +34 -> 2850
    //   2819: aload_0
    //   2820: getfield 370	bsh/ParserTokenManager:n	C
    //   2823: bipush 92
    //   2825: if_icmpne +160 -> 2985
    //   2828: bipush 45
    //   2830: istore 29
    //   2832: bipush 47
    //   2834: istore 30
    //   2836: goto +141 -> 2977
    //   2839: lload 26
    //   2841: ldc2_w 762
    //   2844: land
    //   2845: lconst_0
    //   2846: lcmp
    //   2847: ifeq +138 -> 2985
    //   2850: aload_0
    //   2851: bipush 18
    //   2853: invokespecial 700	bsh/ParserTokenManager:a	(I)V
    //   2856: goto +129 -> 2985
    //   2859: lload 26
    //   2861: ldc2_w 764
    //   2864: land
    //   2865: lconst_0
    //   2866: lcmp
    //   2867: ifeq +118 -> 2985
    //   2870: iload 6
    //   2872: bipush 64
    //   2874: if_icmple +111 -> 2985
    //   2877: bipush 64
    //   2879: istore 6
    //   2881: goto +104 -> 2985
    //   2884: lload 26
    //   2886: ldc2_w 758
    //   2889: land
    //   2890: lconst_0
    //   2891: lcmp
    //   2892: ifeq +93 -> 2985
    //   2895: bipush 43
    //   2897: istore 29
    //   2899: bipush 44
    //   2901: istore 30
    //   2903: goto +74 -> 2977
    //   2906: lload 26
    //   2908: ldc2_w 766
    //   2911: land
    //   2912: lconst_0
    //   2913: lcmp
    //   2914: ifeq +71 -> 2985
    //   2917: iload 6
    //   2919: bipush 60
    //   2921: if_icmple +64 -> 2985
    //   2924: bipush 60
    //   2926: istore 6
    //   2928: goto +57 -> 2985
    //   2931: lload 26
    //   2933: ldc2_w 768
    //   2936: land
    //   2937: lconst_0
    //   2938: lcmp
    //   2939: ifne +6 -> 2945
    //   2942: goto +43 -> 2985
    //   2945: iload 6
    //   2947: bipush 69
    //   2949: if_icmple +7 -> 2956
    //   2952: bipush 69
    //   2954: istore 6
    //   2956: bipush 35
    //   2958: istore 31
    //   2960: aload_0
    //   2961: iload 31
    //   2963: invokespecial 700	bsh/ParserTokenManager:a	(I)V
    //   2966: goto +19 -> 2985
    //   2969: bipush 21
    //   2971: istore 29
    //   2973: bipush 23
    //   2975: istore 30
    //   2977: aload_0
    //   2978: iload 29
    //   2980: iload 30
    //   2982: invokespecial 735	bsh/ParserTokenManager:b	(II)V
    //   2985: iload 5
    //   2987: iload 7
    //   2989: if_icmpne -654 -> 2335
    //   2992: goto -688 -> 2304
    //   2995: aload_0
    //   2996: getfield 370	bsh/ParserTokenManager:n	C
    //   2999: bipush 8
    //   3001: ishr
    //   3002: istore 12
    //   3004: iload 12
    //   3006: bipush 6
    //   3008: ishr
    //   3009: istore 13
    //   3011: lconst_1
    //   3012: iload 12
    //   3014: bipush 63
    //   3016: iand
    //   3017: lshl
    //   3018: lstore 14
    //   3020: sipush 255
    //   3023: aload_0
    //   3024: getfield 370	bsh/ParserTokenManager:n	C
    //   3027: iand
    //   3028: bipush 6
    //   3030: ishr
    //   3031: istore 16
    //   3033: lconst_1
    //   3034: bipush 63
    //   3036: aload_0
    //   3037: getfield 370	bsh/ParserTokenManager:n	C
    //   3040: iand
    //   3041: lshl
    //   3042: lstore 17
    //   3044: iload 6
    //   3046: istore 19
    //   3048: aload_0
    //   3049: getfield 341	bsh/ParserTokenManager:v	[I
    //   3052: astore 20
    //   3054: iinc 5 -1
    //   3057: aload 20
    //   3059: iload 5
    //   3061: iaload
    //   3062: lookupswitch	default:+122->3184, 0:+488->3550, 2:+461->3523, 6:+397->3459, 17:+351->3413, 26:+324->3386, 34:+285->3347, 35:+285->3347, 57:+244->3306, 62:+209->3271, 64:+179->3241, 65:+179->3241, 68:+148->3210, 70:+125->3187, 71:+125->3187
    //   3184: goto +404 -> 3588
    //   3187: iload 12
    //   3189: iload 13
    //   3191: iload 16
    //   3193: lload 14
    //   3195: lload 17
    //   3197: invokestatic 771	bsh/ParserTokenManager:b	(IIIJJ)Z
    //   3200: ifeq -16 -> 3184
    //   3203: bipush 71
    //   3205: istore 25
    //   3207: goto +23 -> 3230
    //   3210: iload 12
    //   3212: iload 13
    //   3214: iload 16
    //   3216: lload 14
    //   3218: lload 17
    //   3220: invokestatic 771	bsh/ParserTokenManager:b	(IIIJJ)Z
    //   3223: ifeq -39 -> 3184
    //   3226: bipush 68
    //   3228: istore 25
    //   3230: aload_0
    //   3231: iload 25
    //   3233: bipush 69
    //   3235: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   3238: goto -54 -> 3184
    //   3241: iload 12
    //   3243: iload 13
    //   3245: iload 16
    //   3247: lload 14
    //   3249: lload 17
    //   3251: invokestatic 771	bsh/ParserTokenManager:b	(IIIJJ)Z
    //   3254: ifeq +14 -> 3268
    //   3257: bipush 65
    //   3259: istore 24
    //   3261: bipush 63
    //   3263: istore 23
    //   3265: goto +30 -> 3295
    //   3268: goto +252 -> 3520
    //   3271: bipush 63
    //   3273: istore 23
    //   3275: iload 12
    //   3277: iload 13
    //   3279: iload 16
    //   3281: lload 14
    //   3283: lload 17
    //   3285: invokestatic 771	bsh/ParserTokenManager:b	(IIIJJ)Z
    //   3288: ifeq +232 -> 3520
    //   3291: bipush 62
    //   3293: istore 24
    //   3295: aload_0
    //   3296: iload 24
    //   3298: iload 23
    //   3300: invokespecial 727	bsh/ParserTokenManager:c	(II)V
    //   3303: goto +217 -> 3520
    //   3306: iload 12
    //   3308: iload 13
    //   3310: iload 16
    //   3312: lload 14
    //   3314: lload 17
    //   3316: invokestatic 771	bsh/ParserTokenManager:b	(IIIJJ)Z
    //   3319: ifne +6 -> 3325
    //   3322: goto +198 -> 3520
    //   3325: iload 19
    //   3327: bipush 7
    //   3329: if_icmple +7 -> 3336
    //   3332: bipush 7
    //   3334: istore 19
    //   3336: aload_0
    //   3337: bipush 18
    //   3339: bipush 20
    //   3341: invokespecial 735	bsh/ParserTokenManager:b	(II)V
    //   3344: goto +176 -> 3520
    //   3347: iload 12
    //   3349: iload 13
    //   3351: iload 16
    //   3353: lload 14
    //   3355: lload 17
    //   3357: invokestatic 773	bsh/ParserTokenManager:c	(IIIJJ)Z
    //   3360: ifne +6 -> 3366
    //   3363: goto +157 -> 3520
    //   3366: iload 19
    //   3368: bipush 69
    //   3370: if_icmple +7 -> 3377
    //   3373: bipush 69
    //   3375: istore 19
    //   3377: aload_0
    //   3378: bipush 35
    //   3380: invokespecial 700	bsh/ParserTokenManager:a	(I)V
    //   3383: goto +137 -> 3520
    //   3386: iload 12
    //   3388: iload 13
    //   3390: iload 16
    //   3392: lload 14
    //   3394: lload 17
    //   3396: invokestatic 771	bsh/ParserTokenManager:b	(IIIJJ)Z
    //   3399: ifeq +121 -> 3520
    //   3402: aload_0
    //   3403: iload 10
    //   3405: bipush 12
    //   3407: invokespecial 735	bsh/ParserTokenManager:b	(II)V
    //   3410: goto +110 -> 3520
    //   3413: iload 12
    //   3415: iload 13
    //   3417: iload 16
    //   3419: lload 14
    //   3421: lload 17
    //   3423: invokestatic 771	bsh/ParserTokenManager:b	(IIIJJ)Z
    //   3426: ifeq +94 -> 3520
    //   3429: aload_0
    //   3430: getfield 341	bsh/ParserTokenManager:v	[I
    //   3433: astore 21
    //   3435: aload_0
    //   3436: getfield 579	bsh/ParserTokenManager:q	I
    //   3439: istore 22
    //   3441: aload_0
    //   3442: iload 22
    //   3444: iconst_1
    //   3445: iadd
    //   3446: putfield 579	bsh/ParserTokenManager:q	I
    //   3449: aload 21
    //   3451: iload 22
    //   3453: bipush 18
    //   3455: iastore
    //   3456: goto +64 -> 3520
    //   3459: iload 12
    //   3461: iload 13
    //   3463: iload 16
    //   3465: lload 14
    //   3467: lload 17
    //   3469: invokestatic 775	bsh/ParserTokenManager:a	(IIIJJ)Z
    //   3472: ifeq +22 -> 3494
    //   3475: iload 19
    //   3477: bipush 6
    //   3479: if_icmple +10 -> 3489
    //   3482: bipush 6
    //   3484: istore 19
    //   3486: goto +3 -> 3489
    //   3489: aload_0
    //   3490: iconst_0
    //   3491: invokespecial 700	bsh/ParserTokenManager:a	(I)V
    //   3494: iload 12
    //   3496: iload 13
    //   3498: iload 16
    //   3500: lload 14
    //   3502: lload 17
    //   3504: invokestatic 773	bsh/ParserTokenManager:c	(IIIJJ)Z
    //   3507: ifeq +13 -> 3520
    //   3510: iload 19
    //   3512: bipush 69
    //   3514: if_icmple -137 -> 3377
    //   3517: goto -144 -> 3373
    //   3520: goto +68 -> 3588
    //   3523: iload 12
    //   3525: iload 13
    //   3527: iload 16
    //   3529: lload 14
    //   3531: lload 17
    //   3533: invokestatic 771	bsh/ParserTokenManager:b	(IIIJJ)Z
    //   3536: ifeq -16 -> 3520
    //   3539: aload_0
    //   3540: bipush 21
    //   3542: bipush 23
    //   3544: invokespecial 735	bsh/ParserTokenManager:b	(II)V
    //   3547: goto -27 -> 3520
    //   3550: iload 12
    //   3552: iload 13
    //   3554: iload 16
    //   3556: lload 14
    //   3558: lload 17
    //   3560: invokestatic 775	bsh/ParserTokenManager:a	(IIIJJ)Z
    //   3563: ifne +6 -> 3569
    //   3566: goto -46 -> 3520
    //   3569: iload 19
    //   3571: bipush 6
    //   3573: if_icmple +10 -> 3583
    //   3576: bipush 6
    //   3578: istore 19
    //   3580: goto +3 -> 3583
    //   3583: aload_0
    //   3584: iconst_0
    //   3585: invokespecial 700	bsh/ParserTokenManager:a	(I)V
    //   3588: iload 5
    //   3590: iload 7
    //   3592: if_icmpne +83 -> 3675
    //   3595: iload 19
    //   3597: istore 6
    //   3599: iload 6
    //   3601: ldc_w 719
    //   3604: if_icmpeq +20 -> 3624
    //   3607: aload_0
    //   3608: iload 6
    //   3610: putfield 357	bsh/ParserTokenManager:t	I
    //   3613: aload_0
    //   3614: iload 4
    //   3616: putfield 359	bsh/ParserTokenManager:s	I
    //   3619: ldc_w 719
    //   3622: istore 6
    //   3624: iinc 4 1
    //   3627: aload_0
    //   3628: getfield 579	bsh/ParserTokenManager:q	I
    //   3631: istore 5
    //   3633: aload_0
    //   3634: iload 7
    //   3636: putfield 579	bsh/ParserTokenManager:q	I
    //   3639: bipush 74
    //   3641: iload 7
    //   3643: isub
    //   3644: istore 7
    //   3646: iload 5
    //   3648: iload 7
    //   3650: if_icmpne +6 -> 3656
    //   3653: iload 4
    //   3655: ireturn
    //   3656: aload_0
    //   3657: aload_0
    //   3658: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   3661: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   3664: putfield 370	bsh/ParserTokenManager:n	C
    //   3667: iconst_1
    //   3668: istore_3
    //   3669: goto -3640 -> 29
    //   3672: iload 4
    //   3674: ireturn
    //   3675: bipush 10
    //   3677: istore 10
    //   3679: goto -631 -> 3048
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	3682	0	this	ParserTokenManager
    //   0	3682	1	paramInt1	int
    //   0	3682	2	paramInt2	int
    //   14	3655	3	i1	int
    //   16	3657	4	i2	int
    //   19	3632	5	i3	int
    //   24	3599	6	i4	int
    //   27	3624	7	i5	int
    //   35	14	8	i6	int
    //   59	15	9	i7	int
    //   63	3615	10	i8	int
    //   67	2243	11	i9	int
    //   3002	549	12	i10	int
    //   3009	544	13	i11	int
    //   3018	539	14	l1	long
    //   3031	524	16	i12	int
    //   3042	517	17	l2	long
    //   3046	550	19	i13	int
    //   3052	6	20	arrayOfInt1	int[]
    //   3433	17	21	arrayOfInt2	int[]
    //   3439	13	22	i14	int
    //   3263	36	23	i15	int
    //   3259	38	24	i16	int
    //   3205	27	25	i17	int
    //   2333	599	26	l3	long
    //   2339	6	28	arrayOfInt3	int[]
    //   2696	283	29	i18	int
    //   2700	281	30	i19	int
    //   2678	284	31	i20	int
    //   2583	17	32	i21	int
    //   2579	19	33	i22	int
    //   2557	11	34	i23	int
    //   82	2183	35	l4	long
    //   88	6	37	arrayOfInt4	int[]
    //   98	7	38	i24	int
    //   102	1711	39	i25	int
    //   2131	125	40	i26	int
    //   2135	125	41	i27	int
    //   2161	17	42	arrayOfInt5	int[]
    //   2167	13	43	i28	int
    //   2054	17	44	arrayOfInt6	int[]
    //   2060	13	45	i29	int
    //   1974	63	46	i30	int
    //   933	939	47	i31	int
    //   633	1159	48	i32	int
    //   637	1157	49	i33	int
    //   1129	603	50	i34	int
    //   1556	17	51	arrayOfInt7	int[]
    //   1562	13	52	i35	int
    //   1476	40	53	i36	int
    //   1378	17	54	arrayOfInt8	int[]
    //   1384	13	55	i37	int
    //   524	752	56	i38	int
    //   816	17	57	arrayOfInt9	int[]
    //   822	13	58	i39	int
    //   697	17	59	arrayOfInt10	int[]
    //   703	13	60	i40	int
    //   617	42	61	i41	int
    //   3672	1	61	localIOException	IOException
    //   508	50	62	i42	int
    //   432	17	63	arrayOfInt11	int[]
    //   438	13	64	i43	int
    // Exception table:
    //   from	to	target	type
    //   3656	3667	3672	java/io/IOException
  }
  
  /* Error */
  private final int e(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 5
    //   5: lload 5
    //   7: lconst_0
    //   8: lcmp
    //   9: ifne +13 -> 22
    //   12: aload_0
    //   13: bipush 24
    //   15: lconst_0
    //   16: lconst_0
    //   17: lload_1
    //   18: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   21: ireturn
    //   22: aload_0
    //   23: aload_0
    //   24: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   27: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   30: putfield 370	bsh/ParserTokenManager:n	C
    //   33: aload_0
    //   34: getfield 370	bsh/ParserTokenManager:n	C
    //   37: bipush 103
    //   39: if_icmpeq +14 -> 53
    //   42: aload_0
    //   43: bipush 25
    //   45: lconst_0
    //   46: lconst_0
    //   47: lload 5
    //   49: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   52: ireturn
    //   53: aload_0
    //   54: lload 5
    //   56: ldc2_w 421
    //   59: invokespecial 777	bsh/ParserTokenManager:f	(JJ)I
    //   62: ireturn
    //   63: aload_0
    //   64: bipush 25
    //   66: lconst_0
    //   67: lconst_0
    //   68: lload 5
    //   70: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   73: pop
    //   74: bipush 26
    //   76: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	ParserTokenManager
    //   0	77	1	paramLong1	long
    //   0	77	3	paramLong2	long
    //   63	1	4	localIOException	IOException
    //   3	66	5	l1	long
    // Exception table:
    //   from	to	target	type
    //   22	33	63	java/io/IOException
  }
  
  /* Error */
  private final int e(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 9
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 11
    //   12: lload 9
    //   14: lload 11
    //   16: lor
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +14 -> 33
    //   22: aload_0
    //   23: bipush 15
    //   25: lconst_0
    //   26: lload_1
    //   27: lload 5
    //   29: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   32: ireturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   38: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   41: putfield 370	bsh/ParserTokenManager:n	C
    //   44: aload_0
    //   45: getfield 370	bsh/ParserTokenManager:n	C
    //   48: istore 14
    //   50: iload 14
    //   52: bipush 110
    //   54: if_icmpeq +57 -> 111
    //   57: iload 14
    //   59: tableswitch	default:+21->80, 103:+39->98, 104:+24->83
    //   80: goto +52 -> 132
    //   83: aload_0
    //   84: lload 9
    //   86: ldc2_w 524
    //   89: lload 11
    //   91: ldc2_w 421
    //   94: invokespecial 779	bsh/ParserTokenManager:f	(JJJJ)I
    //   97: ireturn
    //   98: aload_0
    //   99: lload 9
    //   101: lconst_0
    //   102: lload 11
    //   104: ldc2_w 526
    //   107: invokespecial 779	bsh/ParserTokenManager:f	(JJJJ)I
    //   110: ireturn
    //   111: lload 11
    //   113: ldc2_w 465
    //   116: land
    //   117: lconst_0
    //   118: lcmp
    //   119: ifeq +13 -> 132
    //   122: aload_0
    //   123: bipush 17
    //   125: sipush 129
    //   128: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   131: ireturn
    //   132: aload_0
    //   133: bipush 16
    //   135: lconst_0
    //   136: lload 9
    //   138: lload 11
    //   140: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   143: ireturn
    //   144: aload_0
    //   145: bipush 16
    //   147: lconst_0
    //   148: lload 9
    //   150: lload 11
    //   152: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   155: pop
    //   156: bipush 17
    //   158: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	ParserTokenManager
    //   0	159	1	paramLong1	long
    //   0	159	3	paramLong2	long
    //   0	159	5	paramLong3	long
    //   0	159	7	paramLong4	long
    //   144	1	8	localIOException	IOException
    //   3	146	9	l1	long
    //   10	141	11	l2	long
    //   48	10	14	i1	int
    // Exception table:
    //   from	to	target	type
    //   33	44	144	java/io/IOException
  }
  
  /* Error */
  private final int e(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +14 -> 47
    //   36: aload_0
    //   37: iconst_4
    //   38: lload_1
    //   39: lload 5
    //   41: lload 9
    //   43: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   46: ireturn
    //   47: aload_0
    //   48: aload_0
    //   49: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   52: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   55: putfield 370	bsh/ParserTokenManager:n	C
    //   58: aload_0
    //   59: getfield 370	bsh/ParserTokenManager:n	C
    //   62: lookupswitch	default:+106->168, 95:+387->449, 97:+371->433, 99:+355->417, 101:+295->357, 102:+279->341, 108:+263->325, 110:+241->303, 111:+225->287, 115:+185->247, 116:+147->209, 117:+131->193, 121:+109->171
    //   168: goto +299 -> 467
    //   171: lload 13
    //   173: ldc2_w 685
    //   176: land
    //   177: lconst_0
    //   178: lcmp
    //   179: ifeq +288 -> 467
    //   182: aload_0
    //   183: bipush 6
    //   185: bipush 28
    //   187: bipush 35
    //   189: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   192: ireturn
    //   193: aload_0
    //   194: lload 13
    //   196: ldc2_w 534
    //   199: lload 15
    //   201: lconst_0
    //   202: lload 19
    //   204: lconst_0
    //   205: invokespecial 781	bsh/ParserTokenManager:f	(JJJJJJ)I
    //   208: ireturn
    //   209: lload 13
    //   211: ldc2_w 560
    //   214: land
    //   215: lconst_0
    //   216: lcmp
    //   217: ifeq +14 -> 231
    //   220: aload_0
    //   221: bipush 6
    //   223: bipush 20
    //   225: bipush 35
    //   227: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   230: ireturn
    //   231: aload_0
    //   232: lload 13
    //   234: ldc2_w 715
    //   237: lload 15
    //   239: lconst_0
    //   240: lload 19
    //   242: lconst_0
    //   243: invokespecial 781	bsh/ParserTokenManager:f	(JJJJJJ)I
    //   246: ireturn
    //   247: lload 13
    //   249: ldc2_w 437
    //   252: land
    //   253: lconst_0
    //   254: lcmp
    //   255: ifeq +14 -> 269
    //   258: aload_0
    //   259: bipush 6
    //   261: bipush 25
    //   263: bipush 35
    //   265: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   268: ireturn
    //   269: aload_0
    //   270: lload 13
    //   272: lconst_0
    //   273: lload 15
    //   275: ldc2_w 782
    //   278: lload 19
    //   280: ldc2_w 465
    //   283: invokespecial 781	bsh/ParserTokenManager:f	(JJJJJJ)I
    //   286: ireturn
    //   287: aload_0
    //   288: lload 13
    //   290: ldc2_w 374
    //   293: lload 15
    //   295: lconst_0
    //   296: lload 19
    //   298: lconst_0
    //   299: invokespecial 781	bsh/ParserTokenManager:f	(JJJJJJ)I
    //   302: ireturn
    //   303: lload 13
    //   305: ldc2_w 784
    //   308: land
    //   309: lconst_0
    //   310: lcmp
    //   311: ifeq +156 -> 467
    //   314: aload_0
    //   315: bipush 6
    //   317: bipush 11
    //   319: bipush 35
    //   321: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   324: ireturn
    //   325: aload_0
    //   326: lload 13
    //   328: ldc2_w 505
    //   331: lload 15
    //   333: lconst_0
    //   334: lload 19
    //   336: lconst_0
    //   337: invokespecial 781	bsh/ParserTokenManager:f	(JJJJJJ)I
    //   340: ireturn
    //   341: aload_0
    //   342: lload 13
    //   344: ldc2_w 564
    //   347: lload 15
    //   349: lconst_0
    //   350: lload 19
    //   352: lconst_0
    //   353: invokespecial 781	bsh/ParserTokenManager:f	(JJJJJJ)I
    //   356: ireturn
    //   357: lload 13
    //   359: ldc2_w 566
    //   362: land
    //   363: lconst_0
    //   364: lcmp
    //   365: ifeq +14 -> 379
    //   368: aload_0
    //   369: bipush 6
    //   371: bipush 42
    //   373: bipush 35
    //   375: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   378: ireturn
    //   379: lload 13
    //   381: ldc2_w 632
    //   384: land
    //   385: lconst_0
    //   386: lcmp
    //   387: ifeq +14 -> 401
    //   390: aload_0
    //   391: bipush 6
    //   393: bipush 43
    //   395: bipush 35
    //   397: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   400: ireturn
    //   401: aload_0
    //   402: lload 13
    //   404: ldc2_w 786
    //   407: lload 15
    //   409: lconst_0
    //   410: lload 19
    //   412: lconst_0
    //   413: invokespecial 781	bsh/ParserTokenManager:f	(JJJJJJ)I
    //   416: ireturn
    //   417: aload_0
    //   418: lload 13
    //   420: ldc2_w 788
    //   423: lload 15
    //   425: lconst_0
    //   426: lload 19
    //   428: lconst_0
    //   429: invokespecial 781	bsh/ParserTokenManager:f	(JJJJJJ)I
    //   432: ireturn
    //   433: aload_0
    //   434: lload 13
    //   436: ldc2_w 515
    //   439: lload 15
    //   441: lconst_0
    //   442: lload 19
    //   444: lconst_0
    //   445: invokespecial 781	bsh/ParserTokenManager:f	(JJJJJJ)I
    //   448: ireturn
    //   449: aload_0
    //   450: lload 13
    //   452: lconst_0
    //   453: lload 15
    //   455: ldc2_w 447
    //   458: lload 19
    //   460: ldc2_w 449
    //   463: invokespecial 781	bsh/ParserTokenManager:f	(JJJJJJ)I
    //   466: ireturn
    //   467: aload_0
    //   468: iconst_5
    //   469: lload 13
    //   471: lload 15
    //   473: lload 19
    //   475: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   478: ireturn
    //   479: aload_0
    //   480: iconst_5
    //   481: lload 13
    //   483: lload 15
    //   485: lload 19
    //   487: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   490: pop
    //   491: bipush 6
    //   493: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	494	0	this	ParserTokenManager
    //   0	494	1	paramLong1	long
    //   0	494	3	paramLong2	long
    //   0	494	5	paramLong3	long
    //   0	494	7	paramLong4	long
    //   0	494	9	paramLong5	long
    //   0	494	11	paramLong6	long
    //   479	1	11	localIOException	IOException
    //   3	479	13	l1	long
    //   10	474	15	l2	long
    //   17	10	17	l3	long
    //   24	462	19	l4	long
    // Exception table:
    //   from	to	target	type
    //   47	58	479	java/io/IOException
  }
  
  /* Error */
  private final int f(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 5
    //   5: lload 5
    //   7: lconst_0
    //   8: lcmp
    //   9: ifne +13 -> 22
    //   12: aload_0
    //   13: bipush 25
    //   15: lconst_0
    //   16: lconst_0
    //   17: lload_1
    //   18: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   21: ireturn
    //   22: aload_0
    //   23: aload_0
    //   24: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   27: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   30: putfield 370	bsh/ParserTokenManager:n	C
    //   33: aload_0
    //   34: getfield 370	bsh/ParserTokenManager:n	C
    //   37: bipush 110
    //   39: if_icmpeq +6 -> 45
    //   42: goto +24 -> 66
    //   45: lload 5
    //   47: ldc2_w 421
    //   50: land
    //   51: lconst_0
    //   52: lcmp
    //   53: ifeq +13 -> 66
    //   56: aload_0
    //   57: bipush 27
    //   59: sipush 133
    //   62: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   65: ireturn
    //   66: aload_0
    //   67: bipush 26
    //   69: lconst_0
    //   70: lconst_0
    //   71: lload 5
    //   73: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   76: ireturn
    //   77: aload_0
    //   78: bipush 26
    //   80: lconst_0
    //   81: lconst_0
    //   82: lload 5
    //   84: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   87: pop
    //   88: bipush 27
    //   90: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	ParserTokenManager
    //   0	91	1	paramLong1	long
    //   0	91	3	paramLong2	long
    //   77	1	4	localIOException	IOException
    //   3	80	5	l1	long
    // Exception table:
    //   from	to	target	type
    //   22	33	77	java/io/IOException
  }
  
  /* Error */
  private final int f(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 9
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 11
    //   12: lload 9
    //   14: lload 11
    //   16: lor
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +14 -> 33
    //   22: aload_0
    //   23: bipush 16
    //   25: lconst_0
    //   26: lload_1
    //   27: lload 5
    //   29: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   32: ireturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   38: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   41: putfield 370	bsh/ParserTokenManager:n	C
    //   44: aload_0
    //   45: getfield 370	bsh/ParserTokenManager:n	C
    //   48: istore 14
    //   50: iload 14
    //   52: bipush 105
    //   54: if_icmpeq +46 -> 100
    //   57: iload 14
    //   59: bipush 110
    //   61: if_icmpeq +6 -> 67
    //   64: goto +24 -> 88
    //   67: lload 11
    //   69: ldc2_w 526
    //   72: land
    //   73: lconst_0
    //   74: lcmp
    //   75: ifeq +13 -> 88
    //   78: aload_0
    //   79: bipush 18
    //   81: sipush 131
    //   84: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   87: ireturn
    //   88: aload_0
    //   89: bipush 17
    //   91: lconst_0
    //   92: lload 9
    //   94: lload 11
    //   96: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   99: ireturn
    //   100: aload_0
    //   101: lload 9
    //   103: ldc2_w 524
    //   106: lload 11
    //   108: ldc2_w 421
    //   111: invokespecial 791	bsh/ParserTokenManager:g	(JJJJ)I
    //   114: ireturn
    //   115: aload_0
    //   116: bipush 17
    //   118: lconst_0
    //   119: lload 9
    //   121: lload 11
    //   123: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   126: pop
    //   127: bipush 18
    //   129: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	ParserTokenManager
    //   0	130	1	paramLong1	long
    //   0	130	3	paramLong2	long
    //   0	130	5	paramLong3	long
    //   0	130	7	paramLong4	long
    //   115	1	8	localIOException	IOException
    //   3	117	9	l1	long
    //   10	112	11	l2	long
    //   48	14	14	i1	int
    // Exception table:
    //   from	to	target	type
    //   33	44	115	java/io/IOException
  }
  
  /* Error */
  private final int f(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +14 -> 47
    //   36: aload_0
    //   37: iconst_5
    //   38: lload_1
    //   39: lload 5
    //   41: lload 9
    //   43: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   46: ireturn
    //   47: aload_0
    //   48: aload_0
    //   49: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   52: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   55: putfield 370	bsh/ParserTokenManager:n	C
    //   58: aload_0
    //   59: getfield 370	bsh/ParserTokenManager:n	C
    //   62: istore 22
    //   64: iload 22
    //   66: bipush 99
    //   68: if_icmpeq +284 -> 352
    //   71: iload 22
    //   73: bipush 101
    //   75: if_icmpeq +215 -> 290
    //   78: iload 22
    //   80: bipush 110
    //   82: if_icmpeq +192 -> 274
    //   85: iload 22
    //   87: bipush 112
    //   89: if_icmpeq +150 -> 239
    //   92: iload 22
    //   94: tableswitch	default:+22->116, 104:+127->221, 105:+111->205
    //   116: iload 22
    //   118: tableswitch	default:+26->144, 115:+69->187, 116:+47->165, 117:+29->147
    //   144: goto +117 -> 261
    //   147: aload_0
    //   148: lload 13
    //   150: lconst_0
    //   151: lload 15
    //   153: ldc2_w 524
    //   156: lload 19
    //   158: ldc2_w 421
    //   161: invokespecial 793	bsh/ParserTokenManager:g	(JJJJJJ)I
    //   164: ireturn
    //   165: lload 13
    //   167: ldc2_w 477
    //   170: land
    //   171: lconst_0
    //   172: lcmp
    //   173: ifeq +88 -> 261
    //   176: aload_0
    //   177: bipush 7
    //   179: bipush 10
    //   181: bipush 35
    //   183: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   186: ireturn
    //   187: aload_0
    //   188: lload 13
    //   190: lconst_0
    //   191: lload 15
    //   193: ldc2_w 794
    //   196: lload 19
    //   198: ldc2_w 526
    //   201: invokespecial 793	bsh/ParserTokenManager:g	(JJJJJJ)I
    //   204: ireturn
    //   205: aload_0
    //   206: lload 13
    //   208: lconst_0
    //   209: lload 15
    //   211: ldc2_w 548
    //   214: lload 19
    //   216: lconst_0
    //   217: invokespecial 793	bsh/ParserTokenManager:g	(JJJJJJ)I
    //   220: ireturn
    //   221: aload_0
    //   222: lload 13
    //   224: lconst_0
    //   225: lload 15
    //   227: ldc2_w 564
    //   230: lload 19
    //   232: ldc2_w 465
    //   235: invokespecial 793	bsh/ParserTokenManager:g	(JJJJJJ)I
    //   238: ireturn
    //   239: lload 13
    //   241: ldc2_w 564
    //   244: land
    //   245: lconst_0
    //   246: lcmp
    //   247: ifeq +14 -> 261
    //   250: aload_0
    //   251: bipush 7
    //   253: bipush 49
    //   255: bipush 35
    //   257: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   260: ireturn
    //   261: aload_0
    //   262: bipush 6
    //   264: lload 13
    //   266: lload 15
    //   268: lload 19
    //   270: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   273: ireturn
    //   274: aload_0
    //   275: lload 13
    //   277: ldc2_w 796
    //   280: lload 15
    //   282: lconst_0
    //   283: lload 19
    //   285: lconst_0
    //   286: invokespecial 793	bsh/ParserTokenManager:g	(JJJJJJ)I
    //   289: ireturn
    //   290: lload 13
    //   292: ldc2_w 534
    //   295: land
    //   296: lconst_0
    //   297: lcmp
    //   298: ifeq +14 -> 312
    //   301: aload_0
    //   302: bipush 7
    //   304: bipush 19
    //   306: bipush 35
    //   308: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   311: ireturn
    //   312: lload 13
    //   314: ldc2_w 505
    //   317: land
    //   318: lconst_0
    //   319: lcmp
    //   320: ifeq +14 -> 334
    //   323: aload_0
    //   324: bipush 7
    //   326: bipush 58
    //   328: bipush 35
    //   330: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   333: ireturn
    //   334: aload_0
    //   335: lload 13
    //   337: ldc2_w 798
    //   340: lload 15
    //   342: ldc2_w 479
    //   345: lload 19
    //   347: lconst_0
    //   348: invokespecial 793	bsh/ParserTokenManager:g	(JJJJJJ)I
    //   351: ireturn
    //   352: aload_0
    //   353: lload 13
    //   355: ldc2_w 515
    //   358: lload 15
    //   360: lconst_0
    //   361: lload 19
    //   363: lconst_0
    //   364: invokespecial 793	bsh/ParserTokenManager:g	(JJJJJJ)I
    //   367: ireturn
    //   368: aload_0
    //   369: bipush 6
    //   371: lload 13
    //   373: lload 15
    //   375: lload 19
    //   377: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   380: pop
    //   381: bipush 7
    //   383: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	384	0	this	ParserTokenManager
    //   0	384	1	paramLong1	long
    //   0	384	3	paramLong2	long
    //   0	384	5	paramLong3	long
    //   0	384	7	paramLong4	long
    //   0	384	9	paramLong5	long
    //   0	384	11	paramLong6	long
    //   368	1	12	localIOException	IOException
    //   3	369	13	l1	long
    //   10	364	15	l2	long
    //   17	10	17	l3	long
    //   24	352	19	l4	long
    //   62	55	22	i1	int
    // Exception table:
    //   from	to	target	type
    //   47	58	368	java/io/IOException
  }
  
  /* Error */
  private final int g(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 9
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 11
    //   12: lload 9
    //   14: lload 11
    //   16: lor
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +14 -> 33
    //   22: aload_0
    //   23: bipush 17
    //   25: lconst_0
    //   26: lload_1
    //   27: lload 5
    //   29: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   32: ireturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   38: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   41: putfield 370	bsh/ParserTokenManager:n	C
    //   44: aload_0
    //   45: getfield 370	bsh/ParserTokenManager:n	C
    //   48: bipush 102
    //   50: if_icmpeq +15 -> 65
    //   53: aload_0
    //   54: bipush 18
    //   56: lconst_0
    //   57: lload 9
    //   59: lload 11
    //   61: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   64: ireturn
    //   65: aload_0
    //   66: lload 9
    //   68: ldc2_w 524
    //   71: lload 11
    //   73: ldc2_w 421
    //   76: invokespecial 801	bsh/ParserTokenManager:h	(JJJJ)I
    //   79: ireturn
    //   80: aload_0
    //   81: bipush 18
    //   83: lconst_0
    //   84: lload 9
    //   86: lload 11
    //   88: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   91: pop
    //   92: bipush 19
    //   94: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	ParserTokenManager
    //   0	95	1	paramLong1	long
    //   0	95	3	paramLong2	long
    //   0	95	5	paramLong3	long
    //   0	95	7	paramLong4	long
    //   80	1	7	localIOException	IOException
    //   3	82	9	l1	long
    //   10	77	11	l2	long
    // Exception table:
    //   from	to	target	type
    //   33	44	80	java/io/IOException
  }
  
  /* Error */
  private final int g(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +15 -> 48
    //   36: aload_0
    //   37: bipush 6
    //   39: lload_1
    //   40: lload 5
    //   42: lload 9
    //   44: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   47: ireturn
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   53: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   56: putfield 370	bsh/ParserTokenManager:n	C
    //   59: aload_0
    //   60: getfield 370	bsh/ParserTokenManager:n	C
    //   63: lookupswitch	default:+81->144, 95:+254->317, 100:+232->295, 101:+210->273, 103:+194->257, 104:+176->239, 105:+156->219, 110:+138->201, 111:+122->185, 116:+84->147
    //   144: goto +189 -> 333
    //   147: lload 13
    //   149: ldc2_w 485
    //   152: land
    //   153: lconst_0
    //   154: lcmp
    //   155: ifeq +14 -> 169
    //   158: aload_0
    //   159: bipush 8
    //   161: bipush 52
    //   163: bipush 35
    //   165: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   168: ireturn
    //   169: aload_0
    //   170: lload 13
    //   172: ldc2_w 544
    //   175: lload 15
    //   177: lconst_0
    //   178: lload 19
    //   180: lconst_0
    //   181: invokespecial 803	bsh/ParserTokenManager:h	(JJJJJJ)I
    //   184: ireturn
    //   185: aload_0
    //   186: lload 13
    //   188: ldc2_w 660
    //   191: lload 15
    //   193: lconst_0
    //   194: lload 19
    //   196: lconst_0
    //   197: invokespecial 803	bsh/ParserTokenManager:h	(JJJJJJ)I
    //   200: ireturn
    //   201: aload_0
    //   202: lload 13
    //   204: lconst_0
    //   205: lload 15
    //   207: ldc2_w 524
    //   210: lload 19
    //   212: ldc2_w 421
    //   215: invokespecial 803	bsh/ParserTokenManager:h	(JJJJJJ)I
    //   218: ireturn
    //   219: aload_0
    //   220: lload 13
    //   222: ldc2_w 374
    //   225: lload 15
    //   227: ldc2_w 804
    //   230: lload 19
    //   232: ldc2_w 465
    //   235: invokespecial 803	bsh/ParserTokenManager:h	(JJJJJJ)I
    //   238: ireturn
    //   239: aload_0
    //   240: lload 13
    //   242: lconst_0
    //   243: lload 15
    //   245: ldc2_w 374
    //   248: lload 19
    //   250: ldc2_w 526
    //   253: invokespecial 803	bsh/ParserTokenManager:h	(JJJJJJ)I
    //   256: ireturn
    //   257: aload_0
    //   258: lload 13
    //   260: lconst_0
    //   261: lload 15
    //   263: ldc2_w 548
    //   266: lload 19
    //   268: lconst_0
    //   269: invokespecial 803	bsh/ParserTokenManager:h	(JJJJJJ)I
    //   272: ireturn
    //   273: lload 13
    //   275: ldc2_w 515
    //   278: land
    //   279: lconst_0
    //   280: lcmp
    //   281: ifeq +52 -> 333
    //   284: aload_0
    //   285: bipush 8
    //   287: bipush 37
    //   289: bipush 35
    //   291: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   294: ireturn
    //   295: lload 13
    //   297: ldc2_w 715
    //   300: land
    //   301: lconst_0
    //   302: lcmp
    //   303: ifeq +30 -> 333
    //   306: aload_0
    //   307: bipush 8
    //   309: bipush 44
    //   311: bipush 35
    //   313: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   316: ireturn
    //   317: aload_0
    //   318: lload 13
    //   320: lconst_0
    //   321: lload 15
    //   323: ldc2_w 479
    //   326: lload 19
    //   328: lconst_0
    //   329: invokespecial 803	bsh/ParserTokenManager:h	(JJJJJJ)I
    //   332: ireturn
    //   333: aload_0
    //   334: bipush 7
    //   336: lload 13
    //   338: lload 15
    //   340: lload 19
    //   342: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   345: ireturn
    //   346: aload_0
    //   347: bipush 7
    //   349: lload 13
    //   351: lload 15
    //   353: lload 19
    //   355: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   358: pop
    //   359: bipush 8
    //   361: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	362	0	this	ParserTokenManager
    //   0	362	1	paramLong1	long
    //   0	362	3	paramLong2	long
    //   0	362	5	paramLong3	long
    //   0	362	7	paramLong4	long
    //   0	362	9	paramLong5	long
    //   0	362	11	paramLong6	long
    //   346	1	11	localIOException	IOException
    //   3	347	13	l1	long
    //   10	342	15	l2	long
    //   17	10	17	l3	long
    //   24	330	19	l4	long
    // Exception table:
    //   from	to	target	type
    //   48	59	346	java/io/IOException
  }
  
  /* Error */
  private final int h(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 9
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 11
    //   12: lload 9
    //   14: lload 11
    //   16: lor
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +14 -> 33
    //   22: aload_0
    //   23: bipush 18
    //   25: lconst_0
    //   26: lload_1
    //   27: lload 5
    //   29: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   32: ireturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   38: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   41: putfield 370	bsh/ParserTokenManager:n	C
    //   44: aload_0
    //   45: getfield 370	bsh/ParserTokenManager:n	C
    //   48: bipush 116
    //   50: if_icmpeq +15 -> 65
    //   53: aload_0
    //   54: bipush 19
    //   56: lconst_0
    //   57: lload 9
    //   59: lload 11
    //   61: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   64: ireturn
    //   65: lload 9
    //   67: ldc2_w 524
    //   70: land
    //   71: lconst_0
    //   72: lcmp
    //   73: ifeq +15 -> 88
    //   76: aload_0
    //   77: bipush 117
    //   79: putfield 357	bsh/ParserTokenManager:t	I
    //   82: aload_0
    //   83: bipush 20
    //   85: putfield 359	bsh/ParserTokenManager:s	I
    //   88: aload_0
    //   89: lload 9
    //   91: lconst_0
    //   92: lload 11
    //   94: ldc2_w 421
    //   97: invokespecial 807	bsh/ParserTokenManager:i	(JJJJ)I
    //   100: ireturn
    //   101: aload_0
    //   102: bipush 19
    //   104: lconst_0
    //   105: lload 9
    //   107: lload 11
    //   109: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   112: pop
    //   113: bipush 20
    //   115: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	ParserTokenManager
    //   0	116	1	paramLong1	long
    //   0	116	3	paramLong2	long
    //   0	116	5	paramLong3	long
    //   0	116	7	paramLong4	long
    //   101	1	7	localIOException	IOException
    //   3	103	9	l1	long
    //   10	98	11	l2	long
    // Exception table:
    //   from	to	target	type
    //   33	44	101	java/io/IOException
  }
  
  /* Error */
  private final int h(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +15 -> 48
    //   36: aload_0
    //   37: bipush 7
    //   39: lload_1
    //   40: lload 5
    //   42: lload 9
    //   44: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   47: ireturn
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   53: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   56: putfield 370	bsh/ParserTokenManager:n	C
    //   59: aload_0
    //   60: getfield 370	bsh/ParserTokenManager:n	C
    //   63: lookupswitch	default:+73->136, 97:+242->305, 102:+202->265, 103:+186->249, 105:+168->231, 110:+148->211, 111:+132->195, 115:+92->155, 122:+76->139
    //   136: goto +185 -> 321
    //   139: aload_0
    //   140: lload 13
    //   142: ldc2_w 374
    //   145: lload 15
    //   147: lconst_0
    //   148: lload 19
    //   150: lconst_0
    //   151: invokespecial 809	bsh/ParserTokenManager:i	(JJJJJJ)I
    //   154: ireturn
    //   155: lload 13
    //   157: ldc2_w 544
    //   160: land
    //   161: lconst_0
    //   162: lcmp
    //   163: ifeq +14 -> 177
    //   166: aload_0
    //   167: bipush 9
    //   169: bipush 33
    //   171: bipush 35
    //   173: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   176: ireturn
    //   177: aload_0
    //   178: lload 13
    //   180: lconst_0
    //   181: lload 15
    //   183: ldc2_w 524
    //   186: lload 19
    //   188: ldc2_w 421
    //   191: invokespecial 809	bsh/ParserTokenManager:i	(JJJJJJ)I
    //   194: ireturn
    //   195: aload_0
    //   196: lload 13
    //   198: lconst_0
    //   199: lload 15
    //   201: ldc2_w 568
    //   204: lload 19
    //   206: lconst_0
    //   207: invokespecial 809	bsh/ParserTokenManager:i	(JJJJJJ)I
    //   210: ireturn
    //   211: lload 15
    //   213: ldc2_w 548
    //   216: land
    //   217: lconst_0
    //   218: lcmp
    //   219: ifeq +102 -> 321
    //   222: aload_0
    //   223: bipush 9
    //   225: bipush 125
    //   227: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   230: ireturn
    //   231: aload_0
    //   232: lload 13
    //   234: lconst_0
    //   235: lload 15
    //   237: ldc2_w 374
    //   240: lload 19
    //   242: ldc2_w 526
    //   245: invokespecial 809	bsh/ParserTokenManager:i	(JJJJJJ)I
    //   248: ireturn
    //   249: aload_0
    //   250: lload 13
    //   252: lconst_0
    //   253: lload 15
    //   255: ldc2_w 594
    //   258: lload 19
    //   260: lconst_0
    //   261: invokespecial 809	bsh/ParserTokenManager:i	(JJJJJJ)I
    //   264: ireturn
    //   265: lload 13
    //   267: ldc2_w 660
    //   270: land
    //   271: lconst_0
    //   272: lcmp
    //   273: ifeq +14 -> 287
    //   276: aload_0
    //   277: bipush 9
    //   279: bipush 35
    //   281: bipush 35
    //   283: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   286: ireturn
    //   287: aload_0
    //   288: lload 13
    //   290: lconst_0
    //   291: lload 15
    //   293: ldc2_w 564
    //   296: lload 19
    //   298: ldc2_w 465
    //   301: invokespecial 809	bsh/ParserTokenManager:i	(JJJJJJ)I
    //   304: ireturn
    //   305: aload_0
    //   306: lload 13
    //   308: lconst_0
    //   309: lload 15
    //   311: ldc2_w 632
    //   314: lload 19
    //   316: lconst_0
    //   317: invokespecial 809	bsh/ParserTokenManager:i	(JJJJJJ)I
    //   320: ireturn
    //   321: aload_0
    //   322: bipush 8
    //   324: lload 13
    //   326: lload 15
    //   328: lload 19
    //   330: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   333: ireturn
    //   334: aload_0
    //   335: bipush 8
    //   337: lload 13
    //   339: lload 15
    //   341: lload 19
    //   343: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   346: pop
    //   347: bipush 9
    //   349: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	350	0	this	ParserTokenManager
    //   0	350	1	paramLong1	long
    //   0	350	3	paramLong2	long
    //   0	350	5	paramLong3	long
    //   0	350	7	paramLong4	long
    //   0	350	9	paramLong5	long
    //   0	350	11	paramLong6	long
    //   334	1	11	localIOException	IOException
    //   3	335	13	l1	long
    //   10	330	15	l2	long
    //   17	10	17	l3	long
    //   24	318	19	l4	long
    // Exception table:
    //   from	to	target	type
    //   48	59	334	java/io/IOException
  }
  
  /* Error */
  private final int i(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 9
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 11
    //   12: lload 9
    //   14: lload 11
    //   16: lor
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +14 -> 33
    //   22: aload_0
    //   23: bipush 19
    //   25: lconst_0
    //   26: lload_1
    //   27: lload 5
    //   29: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   32: ireturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   38: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   41: putfield 370	bsh/ParserTokenManager:n	C
    //   44: aload_0
    //   45: getfield 370	bsh/ParserTokenManager:n	C
    //   48: bipush 95
    //   50: if_icmpeq +14 -> 64
    //   53: aload_0
    //   54: bipush 20
    //   56: lconst_0
    //   57: lconst_0
    //   58: lload 11
    //   60: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   63: ireturn
    //   64: aload_0
    //   65: lload 11
    //   67: ldc2_w 421
    //   70: invokespecial 811	bsh/ParserTokenManager:a	(JJ)I
    //   73: ireturn
    //   74: aload_0
    //   75: bipush 20
    //   77: lconst_0
    //   78: lconst_0
    //   79: lload 11
    //   81: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   84: pop
    //   85: bipush 21
    //   87: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	ParserTokenManager
    //   0	88	1	paramLong1	long
    //   0	88	3	paramLong2	long
    //   0	88	5	paramLong3	long
    //   0	88	7	paramLong4	long
    //   74	1	7	localIOException	IOException
    //   3	10	9	l1	long
    //   10	70	11	l2	long
    // Exception table:
    //   from	to	target	type
    //   33	44	74	java/io/IOException
  }
  
  /* Error */
  private final int i(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +15 -> 48
    //   36: aload_0
    //   37: bipush 8
    //   39: lload_1
    //   40: lload 5
    //   42: lload 9
    //   44: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   47: ireturn
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   53: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   56: putfield 370	bsh/ParserTokenManager:n	C
    //   59: aload_0
    //   60: getfield 370	bsh/ParserTokenManager:n	C
    //   63: istore 22
    //   65: iload 22
    //   67: bipush 105
    //   69: if_icmpeq +192 -> 261
    //   72: iload 22
    //   74: bipush 110
    //   76: if_icmpeq +149 -> 225
    //   79: iload 22
    //   81: bipush 114
    //   83: if_icmpeq +109 -> 192
    //   86: iload 22
    //   88: bipush 116
    //   90: if_icmpeq +63 -> 153
    //   93: iload 22
    //   95: tableswitch	default:+21->116, 101:+42->137, 102:+24->119
    //   116: goto +96 -> 212
    //   119: aload_0
    //   120: lload 13
    //   122: lconst_0
    //   123: lload 15
    //   125: ldc2_w 374
    //   128: lload 19
    //   130: ldc2_w 526
    //   133: invokespecial 813	bsh/ParserTokenManager:j	(JJJJJJ)I
    //   136: ireturn
    //   137: aload_0
    //   138: lload 13
    //   140: ldc2_w 374
    //   143: lload 15
    //   145: lconst_0
    //   146: lload 19
    //   148: lconst_0
    //   149: invokespecial 813	bsh/ParserTokenManager:j	(JJJJJJ)I
    //   152: ireturn
    //   153: lload 15
    //   155: ldc2_w 564
    //   158: land
    //   159: lconst_0
    //   160: lcmp
    //   161: ifeq +15 -> 176
    //   164: aload_0
    //   165: bipush 113
    //   167: putfield 357	bsh/ParserTokenManager:t	I
    //   170: aload_0
    //   171: bipush 10
    //   173: putfield 359	bsh/ParserTokenManager:s	I
    //   176: aload_0
    //   177: lload 13
    //   179: lconst_0
    //   180: lload 15
    //   182: lconst_0
    //   183: lload 19
    //   185: ldc2_w 465
    //   188: invokespecial 813	bsh/ParserTokenManager:j	(JJJJJJ)I
    //   191: ireturn
    //   192: lload 15
    //   194: ldc2_w 568
    //   197: land
    //   198: lconst_0
    //   199: lcmp
    //   200: ifeq +12 -> 212
    //   203: aload_0
    //   204: bipush 10
    //   206: bipush 109
    //   208: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   211: ireturn
    //   212: aload_0
    //   213: bipush 9
    //   215: lload 13
    //   217: lload 15
    //   219: lload 19
    //   221: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   224: ireturn
    //   225: lload 15
    //   227: ldc2_w 594
    //   230: land
    //   231: lconst_0
    //   232: lcmp
    //   233: ifeq +12 -> 245
    //   236: aload_0
    //   237: bipush 10
    //   239: bipush 123
    //   241: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   244: ireturn
    //   245: aload_0
    //   246: lload 13
    //   248: lconst_0
    //   249: lload 15
    //   251: ldc2_w 632
    //   254: lload 19
    //   256: lconst_0
    //   257: invokespecial 813	bsh/ParserTokenManager:j	(JJJJJJ)I
    //   260: ireturn
    //   261: aload_0
    //   262: lload 13
    //   264: lconst_0
    //   265: lload 15
    //   267: ldc2_w 524
    //   270: lload 19
    //   272: ldc2_w 421
    //   275: invokespecial 813	bsh/ParserTokenManager:j	(JJJJJJ)I
    //   278: ireturn
    //   279: aload_0
    //   280: bipush 9
    //   282: lload 13
    //   284: lload 15
    //   286: lload 19
    //   288: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   291: pop
    //   292: bipush 10
    //   294: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	295	0	this	ParserTokenManager
    //   0	295	1	paramLong1	long
    //   0	295	3	paramLong2	long
    //   0	295	5	paramLong3	long
    //   0	295	7	paramLong4	long
    //   0	295	9	paramLong5	long
    //   0	295	11	paramLong6	long
    //   279	1	12	localIOException	IOException
    //   3	280	13	l1	long
    //   10	275	15	l2	long
    //   17	10	17	l3	long
    //   24	263	19	l4	long
    //   63	31	22	i1	int
    // Exception table:
    //   from	to	target	type
    //   48	59	279	java/io/IOException
  }
  
  /* Error */
  private final int j(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +15 -> 48
    //   36: aload_0
    //   37: bipush 9
    //   39: lload_1
    //   40: lload 5
    //   42: lload 9
    //   44: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   47: ireturn
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   53: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   56: putfield 370	bsh/ParserTokenManager:n	C
    //   59: aload_0
    //   60: getfield 370	bsh/ParserTokenManager:n	C
    //   63: istore 22
    //   65: iload 22
    //   67: bipush 95
    //   69: if_icmpeq +139 -> 208
    //   72: iload 22
    //   74: bipush 100
    //   76: if_icmpeq +77 -> 153
    //   79: iload 22
    //   81: bipush 103
    //   83: if_icmpeq +52 -> 135
    //   86: iload 22
    //   88: bipush 116
    //   90: if_icmpeq +6 -> 96
    //   93: goto +102 -> 195
    //   96: lload 15
    //   98: ldc2_w 374
    //   101: land
    //   102: lconst_0
    //   103: lcmp
    //   104: ifeq +15 -> 119
    //   107: aload_0
    //   108: bipush 115
    //   110: putfield 357	bsh/ParserTokenManager:t	I
    //   113: aload_0
    //   114: bipush 11
    //   116: putfield 359	bsh/ParserTokenManager:s	I
    //   119: aload_0
    //   120: lload 13
    //   122: lconst_0
    //   123: lload 15
    //   125: lconst_0
    //   126: lload 19
    //   128: ldc2_w 526
    //   131: invokespecial 815	bsh/ParserTokenManager:k	(JJJJJJ)I
    //   134: ireturn
    //   135: aload_0
    //   136: lload 13
    //   138: lconst_0
    //   139: lload 15
    //   141: ldc2_w 524
    //   144: lload 19
    //   146: ldc2_w 421
    //   149: invokespecial 815	bsh/ParserTokenManager:k	(JJJJJJ)I
    //   152: ireturn
    //   153: lload 13
    //   155: ldc2_w 374
    //   158: land
    //   159: lconst_0
    //   160: lcmp
    //   161: ifeq +14 -> 175
    //   164: aload_0
    //   165: bipush 11
    //   167: bipush 51
    //   169: bipush 35
    //   171: invokespecial 474	bsh/ParserTokenManager:a	(III)I
    //   174: ireturn
    //   175: lload 15
    //   177: ldc2_w 632
    //   180: land
    //   181: lconst_0
    //   182: lcmp
    //   183: ifeq +12 -> 195
    //   186: aload_0
    //   187: bipush 11
    //   189: bipush 107
    //   191: invokespecial 431	bsh/ParserTokenManager:a	(II)I
    //   194: ireturn
    //   195: aload_0
    //   196: bipush 10
    //   198: lload 13
    //   200: lload 15
    //   202: lload 19
    //   204: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   207: ireturn
    //   208: aload_0
    //   209: lload 13
    //   211: lconst_0
    //   212: lload 15
    //   214: lconst_0
    //   215: lload 19
    //   217: ldc2_w 465
    //   220: invokespecial 815	bsh/ParserTokenManager:k	(JJJJJJ)I
    //   223: ireturn
    //   224: aload_0
    //   225: bipush 10
    //   227: lload 13
    //   229: lload 15
    //   231: lload 19
    //   233: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   236: pop
    //   237: bipush 11
    //   239: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	this	ParserTokenManager
    //   0	240	1	paramLong1	long
    //   0	240	3	paramLong2	long
    //   0	240	5	paramLong3	long
    //   0	240	7	paramLong4	long
    //   0	240	9	paramLong5	long
    //   0	240	11	paramLong6	long
    //   224	1	12	localIOException	IOException
    //   3	225	13	l1	long
    //   10	220	15	l2	long
    //   17	10	17	l3	long
    //   24	208	19	l4	long
    //   63	28	22	i1	int
    // Exception table:
    //   from	to	target	type
    //   48	59	224	java/io/IOException
  }
  
  /* Error */
  private final int k(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    // Byte code:
    //   0: lload_3
    //   1: lload_1
    //   2: land
    //   3: lstore 13
    //   5: lload 7
    //   7: lload 5
    //   9: land
    //   10: lstore 15
    //   12: lload 13
    //   14: lload 15
    //   16: lor
    //   17: lstore 17
    //   19: lload 11
    //   21: lload 9
    //   23: land
    //   24: lstore 19
    //   26: lload 17
    //   28: lload 19
    //   30: lor
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +15 -> 48
    //   36: aload_0
    //   37: bipush 10
    //   39: lload_1
    //   40: lload 5
    //   42: lload 9
    //   44: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   47: ireturn
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 347	bsh/ParserTokenManager:m	Lbsh/JavaCharStream;
    //   53: invokevirtual 368	bsh/JavaCharStream:readChar	()C
    //   56: putfield 370	bsh/ParserTokenManager:n	C
    //   59: aload_0
    //   60: getfield 370	bsh/ParserTokenManager:n	C
    //   63: istore 22
    //   65: iload 22
    //   67: bipush 95
    //   69: if_icmpeq +57 -> 126
    //   72: iload 22
    //   74: bipush 97
    //   76: if_icmpeq +37 -> 113
    //   79: iload 22
    //   81: bipush 110
    //   83: if_icmpeq +15 -> 98
    //   86: aload_0
    //   87: bipush 11
    //   89: lconst_0
    //   90: lload 15
    //   92: lload 19
    //   94: invokespecial 420	bsh/ParserTokenManager:b	(IJJJ)I
    //   97: ireturn
    //   98: aload_0
    //   99: lload 15
    //   101: ldc2_w 524
    //   104: lload 19
    //   106: ldc2_w 421
    //   109: invokespecial 817	bsh/ParserTokenManager:a	(JJJJ)I
    //   112: ireturn
    //   113: aload_0
    //   114: lload 15
    //   116: lconst_0
    //   117: lload 19
    //   119: ldc2_w 465
    //   122: invokespecial 817	bsh/ParserTokenManager:a	(JJJJ)I
    //   125: ireturn
    //   126: aload_0
    //   127: lload 15
    //   129: lconst_0
    //   130: lload 19
    //   132: ldc2_w 526
    //   135: invokespecial 817	bsh/ParserTokenManager:a	(JJJJ)I
    //   138: ireturn
    //   139: aload_0
    //   140: bipush 11
    //   142: lconst_0
    //   143: lload 15
    //   145: lload 19
    //   147: invokespecial 426	bsh/ParserTokenManager:a	(IJJJ)I
    //   150: pop
    //   151: bipush 12
    //   153: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	this	ParserTokenManager
    //   0	154	1	paramLong1	long
    //   0	154	3	paramLong2	long
    //   0	154	5	paramLong3	long
    //   0	154	7	paramLong4	long
    //   0	154	9	paramLong5	long
    //   0	154	11	paramLong6	long
    //   139	1	12	localIOException	IOException
    //   3	10	13	l1	long
    //   10	134	15	l2	long
    //   17	10	17	l3	long
    //   24	122	19	l4	long
    //   63	21	22	i1	int
    // Exception table:
    //   from	to	target	type
    //   48	59	139	java/io/IOException
  }
  
  public void ReInit(JavaCharStream paramJavaCharStream)
  {
    this.q = 0;
    this.s = 0;
    this.o = this.p;
    this.m = paramJavaCharStream;
    c();
  }
  
  public void ReInit(JavaCharStream paramJavaCharStream, int paramInt)
  {
    ReInit(paramJavaCharStream);
    SwitchTo(paramInt);
  }
  
  public void SwitchTo(int paramInt)
  {
    if ((paramInt < 1) && (paramInt >= 0))
    {
      this.o = paramInt;
      return;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("Error: Ignoring invalid lexical state : ");
    localStringBuffer.append(paramInt);
    localStringBuffer.append(". State unchanged.");
    throw new TokenMgrError(localStringBuffer.toString(), 2);
  }
  
  protected Token a()
  {
    Token localToken = Token.newToken(this.t);
    localToken.kind = this.t;
    String str = jjstrLiteralImages[this.t];
    if (str == null) {
      str = this.m.GetImage();
    }
    localToken.image = str;
    localToken.beginLine = this.m.getBeginLine();
    localToken.beginColumn = this.m.getBeginColumn();
    localToken.endLine = this.m.getEndLine();
    localToken.endColumn = this.m.getEndColumn();
    return localToken;
  }
  
  public Token getNextToken()
  {
    Object localObject = null;
    for (;;)
    {
      try
      {
        this.n = this.m.BeginToken();
        this.t = Integer.MAX_VALUE;
        this.s = 0;
        i1 = b();
        if (this.t == Integer.MAX_VALUE) {
          continue;
        }
        if (1 + this.s < i1) {
          this.m.backup(i1 - this.s - 1);
        }
        if ((j[(this.t >> 6)] & 1L << (0x3F & this.t)) == 0L) {
          continue;
        }
      }
      catch (IOException localIOException2)
      {
        int i1;
        Token localToken1;
        Token localToken2;
        int i2;
        int i3;
        int i5;
        int i6;
        String str1;
        boolean bool;
        int i4;
        String str2;
        TokenMgrError localTokenMgrError;
        this.t = 0;
        tmpTernaryOp = localIOException2;
        continue;
      }
      localToken1 = a();
      localToken1.specialToken = ((Token)localObject);
      return localToken1;
      if ((l[(this.t >> 6)] & 1L << (0x3F & this.t)) != 0L)
      {
        localToken2 = a();
        if (localObject != null)
        {
          localToken2.specialToken = ((Token)localObject);
          ((Token)localObject).next = localToken2;
        }
        localObject = localToken2;
      }
    }
    i2 = this.m.getEndLine();
    i3 = this.m.getEndColumn();
    try
    {
      this.m.readChar();
      this.m.backup(1);
      i5 = i2;
      i6 = i3;
      str1 = null;
      bool = false;
    }
    catch (IOException localIOException1)
    {
      str1 = "";
      str1 = i1 <= 1 ? localIOException1 : this.m.GetImage();
      if ((this.n != '\n') && (this.n != '\r'))
      {
        i4 = i3 + 1;
      }
      else
      {
        i2++;
        i4 = 0;
      }
      i5 = i2;
      i6 = i4;
      bool = true;
    }
    if (!bool)
    {
      this.m.backup(1);
      if (i1 <= 1) {
        str1 = "";
      } else {
        str1 = this.m.GetImage();
      }
    }
    str2 = str1;
    localTokenMgrError = new TokenMgrError(bool, this.o, i5, i6, str2, this.n, 0);
    throw localTokenMgrError;
  }
  
  public void setDebugStream(PrintStream paramPrintStream)
  {
    this.debugStream = paramPrintStream;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\ParserTokenManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */