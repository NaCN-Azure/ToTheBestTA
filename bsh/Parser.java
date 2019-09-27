package bsh;

import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.Reader;

public class Parser
  implements ParserConstants, ParserTreeConstants
{
  protected JJTParserState a = new JJTParserState();
  boolean b = false;
  JavaCharStream c;
  private int d;
  private Token e;
  private Token f;
  private int g;
  private boolean h;
  private final LookaheadSuccess i = new LookaheadSuccess(null);
  public Token jj_nt;
  public boolean lookingAhead = false;
  public Token token;
  public ParserTokenManager token_source;
  
  public Parser(ParserTokenManager paramParserTokenManager)
  {
    this.token_source = paramParserTokenManager;
    this.token = new Token();
    this.d = -1;
  }
  
  public Parser(InputStream paramInputStream)
  {
    this.c = new JavaCharStream(paramInputStream, 1, 1);
    this.token_source = new ParserTokenManager(this.c);
    this.token = new Token();
    this.d = -1;
  }
  
  public Parser(Reader paramReader)
  {
    this.c = new JavaCharStream(paramReader, 1, 1);
    this.token_source = new ParserTokenManager(this.c);
    this.token = new Token();
    this.d = -1;
  }
  
  private final boolean A()
  {
    if (w()) {
      return true;
    }
    Token localToken = this.e;
    if (i()) {
      this.e = localToken;
    }
    return false;
  }
  
  private final boolean A(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = da();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean B()
  {
    return cH();
  }
  
  private final boolean B(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = dg();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean C()
  {
    if (cQ()) {
      return true;
    }
    return G(78);
  }
  
  private final boolean C(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = cs();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean D()
  {
    return f();
  }
  
  private final boolean D(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = bU();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean E()
  {
    return f();
  }
  
  private final boolean E(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = bz();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final Token F(int paramInt)
  {
    Token localToken1 = this.token;
    if (localToken1.next != null)
    {
      this.token = this.token.next;
    }
    else
    {
      Token localToken2 = this.token;
      Token localToken3 = this.token_source.getNextToken();
      localToken2.next = localToken3;
      this.token = localToken3;
    }
    this.d = -1;
    if (this.token.kind == paramInt) {
      return this.token;
    }
    this.token = localToken1;
    throw generateParseException();
  }
  
  private final boolean F()
  {
    Token localToken = this.e;
    if (G())
    {
      this.e = localToken;
      if (E())
      {
        this.e = localToken;
        if (G(78))
        {
          this.e = localToken;
          if (C())
          {
            this.e = localToken;
            if (B())
            {
              this.e = localToken;
              if (z())
              {
                this.e = localToken;
                if (y())
                {
                  this.e = localToken;
                  if (x())
                  {
                    this.e = localToken;
                    this.lookingAhead = true;
                    this.h = a();
                    this.lookingAhead = false;
                    if ((!this.h) || (v()))
                    {
                      this.e = localToken;
                      if (t())
                      {
                        this.e = localToken;
                        if (s())
                        {
                          this.e = localToken;
                          if (r())
                          {
                            this.e = localToken;
                            if (p())
                            {
                              this.e = localToken;
                              if (n())
                              {
                                this.e = localToken;
                                if (m())
                                {
                                  this.e = localToken;
                                  if (l()) {
                                    return true;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  private final boolean G()
  {
    return h();
  }
  
  private final boolean G(int paramInt)
  {
    if (this.e == this.f)
    {
      this.g -= 1;
      if (this.e.next == null)
      {
        Token localToken2 = this.e;
        Token localToken3 = this.token_source.getNextToken();
        localToken2.next = localToken3;
        this.e = localToken3;
        this.f = localToken3;
      }
      else
      {
        Token localToken1 = this.e.next;
        this.e = localToken1;
        this.f = localToken1;
      }
    }
    else
    {
      this.e = this.e.next;
    }
    if (this.e.kind != paramInt) {
      return true;
    }
    if ((this.g == 0) && (this.e == this.f)) {
      throw this.i;
    }
    return false;
  }
  
  private final boolean H()
  {
    Token localToken = this.e;
    if (G(81))
    {
      this.e = localToken;
      if (G(120))
      {
        this.e = localToken;
        if (G(121))
        {
          this.e = localToken;
          if (G(127))
          {
            this.e = localToken;
            if (G(118))
            {
              this.e = localToken;
              if (G(119))
              {
                this.e = localToken;
                if (G(122))
                {
                  this.e = localToken;
                  if (G(126))
                  {
                    this.e = localToken;
                    if (G(124))
                    {
                      this.e = localToken;
                      if (G(128))
                      {
                        this.e = localToken;
                        if (G(129))
                        {
                          this.e = localToken;
                          if (G(130))
                          {
                            this.e = localToken;
                            if (G(131))
                            {
                              this.e = localToken;
                              if (G(132))
                              {
                                this.e = localToken;
                                if (G(133)) {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  private final boolean I()
  {
    if (G(79)) {
      return true;
    }
    return af();
  }
  
  private final boolean J()
  {
    if (G(76)) {
      return true;
    }
    return G(77);
  }
  
  private final boolean K()
  {
    if (ae()) {
      return true;
    }
    Token localToken = this.e;
    if (D()) {
      this.e = localToken;
    }
    return false;
  }
  
  private final boolean L()
  {
    if (J()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!J());
    this.e = localToken;
    return aQ();
  }
  
  private final boolean M()
  {
    if (cc()) {
      return true;
    }
    return H();
  }
  
  private final boolean N()
  {
    if (G(76)) {
      return true;
    }
    return G(77);
  }
  
  private final boolean O()
  {
    return S();
  }
  
  private final boolean P()
  {
    if (G(76)) {
      return true;
    }
    if (U()) {
      return true;
    }
    return G(77);
  }
  
  private final boolean Q()
  {
    if (cc()) {
      return true;
    }
    if (H()) {
      return true;
    }
    return U();
  }
  
  private final boolean R()
  {
    if (P()) {
      return true;
    }
    Token localToken1;
    do
    {
      localToken1 = this.e;
    } while (!P());
    this.e = localToken1;
    Token localToken2;
    do
    {
      localToken2 = this.e;
    } while (!N());
    this.e = localToken2;
    return false;
  }
  
  private final boolean S()
  {
    Token localToken = this.e;
    if (R())
    {
      this.e = localToken;
      if (L()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean T()
  {
    return A();
  }
  
  private final boolean U()
  {
    Token localToken = this.e;
    if (V())
    {
      this.e = localToken;
      if (T()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean V()
  {
    return Q();
  }
  
  private final boolean W()
  {
    if (G(40)) {
      return true;
    }
    if (af()) {
      return true;
    }
    Token localToken = this.e;
    if (O())
    {
      this.e = localToken;
      if (K()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean X()
  {
    if (G(40)) {
      return true;
    }
    if (as()) {
      return true;
    }
    return S();
  }
  
  private final boolean Y()
  {
    Token localToken = this.e;
    if (X())
    {
      this.e = localToken;
      if (W()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean Z()
  {
    if (G(79)) {
      return true;
    }
    return U();
  }
  
  private final boolean a(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = cG();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean aA()
  {
    return as();
  }
  
  private final boolean aB()
  {
    if (G(79)) {
      return true;
    }
    return aL();
  }
  
  private final boolean aC()
  {
    return G(67);
  }
  
  private final boolean aD()
  {
    Token localToken1 = this.e;
    if (aA())
    {
      this.e = localToken1;
      if (ao()) {
        return true;
      }
    }
    Token localToken2;
    do
    {
      localToken2 = this.e;
    } while (!ay());
    this.e = localToken2;
    return false;
  }
  
  private final boolean aE()
  {
    return G(66);
  }
  
  private final boolean aF()
  {
    if (G(28)) {
      return true;
    }
    return f();
  }
  
  private final boolean aG()
  {
    if (G(79)) {
      return true;
    }
    return aX();
  }
  
  private final boolean aH()
  {
    if (G(16)) {
      return true;
    }
    if (G(72)) {
      return true;
    }
    if (aL()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    return f();
  }
  
  private final boolean aI()
  {
    return G(69);
  }
  
  private final boolean aJ()
  {
    if (aD()) {
      return true;
    }
    return G(69);
  }
  
  private final boolean aK()
  {
    if (aL()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!aB());
    this.e = localToken;
    return false;
  }
  
  private final boolean aL()
  {
    Token localToken = this.e;
    if (aJ())
    {
      this.e = localToken;
      if (aI()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean aM()
  {
    if (G(56)) {
      return true;
    }
    if (f()) {
      return true;
    }
    Token localToken1;
    do
    {
      localToken1 = this.e;
    } while (!aH());
    this.e = localToken1;
    Token localToken2 = this.e;
    if (aF()) {
      this.e = localToken2;
    }
    return false;
  }
  
  private final boolean aN()
  {
    if (G(72)) {
      return true;
    }
    Token localToken = this.e;
    if (aK()) {
      this.e = localToken;
    }
    return G(73);
  }
  
  private final boolean aO()
  {
    if (aX()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!aG());
    this.e = localToken;
    return false;
  }
  
  private final boolean aP()
  {
    return G(64);
  }
  
  private final boolean aQ()
  {
    if (G(74)) {
      return true;
    }
    Token localToken1 = this.e;
    if (aO()) {
      this.e = localToken1;
    }
    Token localToken2 = this.e;
    if (G(79)) {
      this.e = localToken2;
    }
    return G(75);
  }
  
  private final boolean aR()
  {
    if (G(80)) {
      return true;
    }
    return G(104);
  }
  
  private final boolean aS()
  {
    if (G(53)) {
      return true;
    }
    if (U()) {
      return true;
    }
    return G(78);
  }
  
  private final boolean aT()
  {
    if (G(81)) {
      return true;
    }
    return aX();
  }
  
  private final boolean aU()
  {
    return U();
  }
  
  private final boolean aV()
  {
    return U();
  }
  
  private final boolean aW()
  {
    return aQ();
  }
  
  private final boolean aX()
  {
    Token localToken = this.e;
    if (aW())
    {
      this.e = localToken;
      if (aU()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean aY()
  {
    if (G(51)) {
      return true;
    }
    if (G(72)) {
      return true;
    }
    if (U()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    return f();
  }
  
  private final boolean aZ()
  {
    if (G(79)) {
      return true;
    }
    return bf();
  }
  
  private final boolean aa()
  {
    if (af()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!I());
    this.e = localToken;
    return false;
  }
  
  private final boolean ab()
  {
    if (U()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!Z());
    this.e = localToken;
    return false;
  }
  
  private final boolean ac()
  {
    return ab();
  }
  
  private final boolean ad()
  {
    if (G(80)) {
      return true;
    }
    return G(69);
  }
  
  private final boolean ae()
  {
    if (G(72)) {
      return true;
    }
    Token localToken = this.e;
    if (ac()) {
      this.e = localToken;
    }
    return G(73);
  }
  
  private final boolean af()
  {
    if (G(69)) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!ad());
    this.e = localToken;
    return false;
  }
  
  private final boolean ag()
  {
    return G(22);
  }
  
  private final boolean ah()
  {
    return G(29);
  }
  
  private final boolean ai()
  {
    return G(26);
  }
  
  private final boolean aj()
  {
    return G(38);
  }
  
  private final boolean ak()
  {
    return G(36);
  }
  
  private final boolean al()
  {
    return G(55);
  }
  
  private final boolean am()
  {
    Token localToken = this.e;
    if (al())
    {
      this.e = localToken;
      if (ai()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean an()
  {
    return G(47);
  }
  
  private final boolean ao()
  {
    return af();
  }
  
  private final boolean ap()
  {
    return G(14);
  }
  
  private final boolean aq()
  {
    return G(17);
  }
  
  private final boolean ar()
  {
    return G(11);
  }
  
  private final boolean as()
  {
    Token localToken = this.e;
    if (ar())
    {
      this.e = localToken;
      if (aq())
      {
        this.e = localToken;
        if (ap())
        {
          this.e = localToken;
          if (an())
          {
            this.e = localToken;
            if (ak())
            {
              this.e = localToken;
              if (aj())
              {
                this.e = localToken;
                if (ah())
                {
                  this.e = localToken;
                  if (ag()) {
                    return true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  private final boolean at()
  {
    return G(57);
  }
  
  private final boolean au()
  {
    return aD();
  }
  
  private final boolean av()
  {
    Token localToken = this.e;
    if (aw())
    {
      this.e = localToken;
      if (au()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean aw()
  {
    return G(57);
  }
  
  private final boolean ax()
  {
    return G(41);
  }
  
  private final boolean ay()
  {
    if (G(76)) {
      return true;
    }
    return G(77);
  }
  
  private final boolean az()
  {
    return am();
  }
  
  private final boolean b()
  {
    return bY();
  }
  
  private final boolean b(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = bt();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean bA()
  {
    return bW();
  }
  
  private final boolean bB()
  {
    return G(69);
  }
  
  private final boolean bC()
  {
    if (av()) {
      return true;
    }
    return G(69);
  }
  
  private final boolean bD()
  {
    if (cu()) {
      return true;
    }
    Token localToken1 = this.e;
    if (bB())
    {
      this.e = localToken1;
      if (bC()) {
        return true;
      }
    }
    if (aN()) {
      return true;
    }
    Token localToken2 = this.e;
    if (bx()) {
      this.e = localToken2;
    }
    Token localToken3 = this.e;
    if (bu())
    {
      this.e = localToken3;
      if (G(78)) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean bE()
  {
    return bm();
  }
  
  private final boolean bF()
  {
    return af();
  }
  
  private final boolean bG()
  {
    return bq();
  }
  
  private final boolean bH()
  {
    Token localToken = this.e;
    if (bG())
    {
      this.e = localToken;
      if (bE()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean bI()
  {
    return aD();
  }
  
  private final boolean bJ()
  {
    return bw();
  }
  
  private final boolean bK()
  {
    return G(37);
  }
  
  private final boolean bL()
  {
    return bW();
  }
  
  private final boolean bM()
  {
    return Y();
  }
  
  private final boolean bN()
  {
    if (G(72)) {
      return true;
    }
    if (U()) {
      return true;
    }
    return G(73);
  }
  
  private final boolean bO()
  {
    if (G(30)) {
      return true;
    }
    if (G(72)) {
      return true;
    }
    if (aD()) {
      return true;
    }
    if (G(69)) {
      return true;
    }
    if (G(89)) {
      return true;
    }
    if (U()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    return F();
  }
  
  private final boolean bP()
  {
    if (G(23)) {
      return true;
    }
    return F();
  }
  
  private final boolean bQ()
  {
    if (G(33)) {
      return true;
    }
    return aa();
  }
  
  private final boolean bR()
  {
    Token localToken = this.e;
    if (bS())
    {
      this.e = localToken;
      if (bN())
      {
        this.e = localToken;
        if (bM())
        {
          this.e = localToken;
          if (bL())
          {
            this.e = localToken;
            if (bI())
            {
              this.e = localToken;
              if (bF()) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  private final boolean bS()
  {
    return bc();
  }
  
  private final boolean bT()
  {
    if (G(25)) {
      return true;
    }
    return af();
  }
  
  private final boolean bU()
  {
    if (G(30)) {
      return true;
    }
    if (G(72)) {
      return true;
    }
    if (G(69)) {
      return true;
    }
    if (G(89)) {
      return true;
    }
    if (U()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    return F();
  }
  
  private final boolean bV()
  {
    Token localToken = this.e;
    if (bU())
    {
      this.e = localToken;
      if (bO()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean bW()
  {
    if (af()) {
      return true;
    }
    return ae();
  }
  
  private final boolean bX()
  {
    return bH();
  }
  
  private final boolean bY()
  {
    if (cu()) {
      return true;
    }
    Token localToken1 = this.e;
    if (G(13))
    {
      this.e = localToken1;
      if (bK()) {
        return true;
      }
    }
    if (G(69)) {
      return true;
    }
    Token localToken2 = this.e;
    if (bT()) {
      this.e = localToken2;
    }
    Token localToken3 = this.e;
    if (bQ()) {
      this.e = localToken3;
    }
    return f();
  }
  
  private final boolean bZ()
  {
    if (G(72)) {
      return true;
    }
    return as();
  }
  
  private final boolean ba()
  {
    if (G(79)) {
      return true;
    }
    return cQ();
  }
  
  private final boolean bb()
  {
    if (G(46)) {
      return true;
    }
    Token localToken = this.e;
    if (aV()) {
      this.e = localToken;
    }
    return G(78);
  }
  
  private final boolean bc()
  {
    Token localToken = this.e;
    if (bd())
    {
      this.e = localToken;
      if (aP())
      {
        this.e = localToken;
        if (aE())
        {
          this.e = localToken;
          if (aC())
          {
            this.e = localToken;
            if (az())
            {
              this.e = localToken;
              if (ax())
              {
                this.e = localToken;
                if (at()) {
                  return true;
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  private final boolean bd()
  {
    return G(60);
  }
  
  private final boolean be()
  {
    return ae();
  }
  
  private final boolean bf()
  {
    if (G(69)) {
      return true;
    }
    Token localToken = this.e;
    if (aT()) {
      this.e = localToken;
    }
    return false;
  }
  
  private final boolean bg()
  {
    return bc();
  }
  
  private final boolean bh()
  {
    if (G(19)) {
      return true;
    }
    Token localToken = this.e;
    if (G(69)) {
      this.e = localToken;
    }
    return G(78);
  }
  
  private final boolean bi()
  {
    if (G(12)) {
      return true;
    }
    Token localToken = this.e;
    if (G(69)) {
      this.e = localToken;
    }
    return G(78);
  }
  
  private final boolean bj()
  {
    return bm();
  }
  
  private final boolean bk()
  {
    if (G(34)) {
      return true;
    }
    if (G(104)) {
      return true;
    }
    return G(78);
  }
  
  private final boolean bl()
  {
    if (G(74)) {
      return true;
    }
    if (U()) {
      return true;
    }
    return G(75);
  }
  
  private final boolean bm()
  {
    if (cQ()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!ba());
    this.e = localToken;
    return false;
  }
  
  private final boolean bn()
  {
    if (G(80)) {
      return true;
    }
    if (G(69)) {
      return true;
    }
    Token localToken = this.e;
    if (be()) {
      this.e = localToken;
    }
    return false;
  }
  
  private final boolean bo()
  {
    Token localToken1 = this.e;
    if (G(48)) {
      this.e = localToken1;
    }
    if (G(34)) {
      return true;
    }
    if (af()) {
      return true;
    }
    Token localToken2 = this.e;
    if (aR()) {
      this.e = localToken2;
    }
    return G(78);
  }
  
  private final boolean bp()
  {
    Token localToken = this.e;
    if (bo())
    {
      this.e = localToken;
      if (bk()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean bq()
  {
    if (cu()) {
      return true;
    }
    if (aD()) {
      return true;
    }
    if (bf()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!aZ());
    this.e = localToken;
    return false;
  }
  
  private final boolean br()
  {
    if (G(76)) {
      return true;
    }
    if (U()) {
      return true;
    }
    return G(77);
  }
  
  private final boolean bs()
  {
    if (G(42)) {
      return true;
    }
    return af();
  }
  
  private final boolean bt()
  {
    if (G(69)) {
      return true;
    }
    return G(72);
  }
  
  private final boolean bu()
  {
    return f();
  }
  
  private final boolean bv()
  {
    if (G(80)) {
      return true;
    }
    return G(13);
  }
  
  private final boolean bw()
  {
    Token localToken = this.e;
    if (bv())
    {
      this.e = localToken;
      if (br())
      {
        this.e = localToken;
        if (bn())
        {
          this.e = localToken;
          if (bl()) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private final boolean bx()
  {
    if (G(54)) {
      return true;
    }
    return aa();
  }
  
  private final boolean by()
  {
    if (aD()) {
      return true;
    }
    if (G(80)) {
      return true;
    }
    return G(13);
  }
  
  private final boolean bz()
  {
    if (cu()) {
      return true;
    }
    if (aD()) {
      return true;
    }
    return G(69);
  }
  
  private final boolean c()
  {
    Token localToken = this.e;
    if (b())
    {
      this.e = localToken;
      if (jdMethod_do())
      {
        this.e = localToken;
        if (dm())
        {
          this.e = localToken;
          if (dj())
          {
            this.e = localToken;
            if (dg())
            {
              this.e = localToken;
              if (dd())
              {
                this.e = localToken;
                if (db())
                {
                  this.e = localToken;
                  if (cY()) {
                    return true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  private final boolean c(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = bo();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean cA()
  {
    Token localToken = this.e;
    if (G(87))
    {
      this.e = localToken;
      if (G(86)) {
        return true;
      }
    }
    return cO();
  }
  
  private final boolean cB()
  {
    Token localToken = this.e;
    if (cA())
    {
      this.e = localToken;
      if (cy())
      {
        this.e = localToken;
        if (cx()) {
          return true;
        }
      }
    }
    return false;
  }
  
  private final boolean cC()
  {
    if (G(15)) {
      return true;
    }
    if (U()) {
      return true;
    }
    return G(89);
  }
  
  private final boolean cD()
  {
    Token localToken = this.e;
    if (cC())
    {
      this.e = localToken;
      if (cz()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean cE()
  {
    if (cD()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!cs());
    this.e = localToken;
    return false;
  }
  
  private final boolean cF()
  {
    if (G(101)) {
      return true;
    }
    return cc();
  }
  
  private final boolean cG()
  {
    return c();
  }
  
  private final boolean cH()
  {
    if (G(50)) {
      return true;
    }
    if (G(72)) {
      return true;
    }
    if (U()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    if (G(74)) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!cE());
    this.e = localToken;
    return G(75);
  }
  
  private final boolean cI()
  {
    Token localToken = this.e;
    if (G(104))
    {
      this.e = localToken;
      if (G(105))
      {
        this.e = localToken;
        if (G(111)) {
          return true;
        }
      }
    }
    return cO();
  }
  
  private final boolean cJ()
  {
    if (G(100)) {
      return true;
    }
    return cc();
  }
  
  private final boolean cK()
  {
    return cB();
  }
  
  private final boolean cL()
  {
    return cF();
  }
  
  private final boolean cM()
  {
    return cJ();
  }
  
  private final boolean cN()
  {
    Token localToken = this.e;
    if (G(102))
    {
      this.e = localToken;
      if (G(103)) {
        return true;
      }
    }
    return cO();
  }
  
  private final boolean cO()
  {
    Token localToken = this.e;
    if (cN())
    {
      this.e = localToken;
      if (cM())
      {
        this.e = localToken;
        if (cL())
        {
          this.e = localToken;
          if (cK()) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private final boolean cP()
  {
    if (G(54)) {
      return true;
    }
    return aa();
  }
  
  private final boolean cQ()
  {
    return U();
  }
  
  private final boolean cR()
  {
    if (cO()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!cI());
    this.e = localToken;
    return false;
  }
  
  private final boolean cS()
  {
    Token localToken = this.e;
    if (G(102))
    {
      this.e = localToken;
      if (G(103)) {
        return true;
      }
    }
    return cR();
  }
  
  private final boolean cT()
  {
    if (cR()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!cS());
    this.e = localToken;
    return false;
  }
  
  private final boolean cU()
  {
    return G(68);
  }
  
  private final boolean cV()
  {
    Token localToken = this.e;
    if (G(112))
    {
      this.e = localToken;
      if (G(113))
      {
        this.e = localToken;
        if (G(114))
        {
          this.e = localToken;
          if (G(115))
          {
            this.e = localToken;
            if (G(116))
            {
              this.e = localToken;
              if (G(117)) {
                return true;
              }
            }
          }
        }
      }
    }
    return cT();
  }
  
  private final boolean cW()
  {
    Token localToken = this.e;
    if (G(90))
    {
      this.e = localToken;
      if (G(95)) {
        return true;
      }
    }
    return dh();
  }
  
  private final boolean cX()
  {
    if (cT()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!cV());
    this.e = localToken;
    return false;
  }
  
  private final boolean cY()
  {
    return cU();
  }
  
  private final boolean cZ()
  {
    Token localToken = this.e;
    if (G(84))
    {
      this.e = localToken;
      if (G(85))
      {
        this.e = localToken;
        if (G(82))
        {
          this.e = localToken;
          if (G(83))
          {
            this.e = localToken;
            if (G(91))
            {
              this.e = localToken;
              if (G(92))
              {
                this.e = localToken;
                if (G(93))
                {
                  this.e = localToken;
                  if (G(94)) {
                    return true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return cX();
  }
  
  private final boolean ca()
  {
    return bj();
  }
  
  private final boolean cb()
  {
    return U();
  }
  
  private final boolean cc()
  {
    if (bR()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!bJ());
    this.e = localToken;
    return false;
  }
  
  private final boolean cd()
  {
    if (G(72)) {
      return true;
    }
    if (aD()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    return cB();
  }
  
  private final boolean ce()
  {
    if (G(72)) {
      return true;
    }
    if (aD()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    return cO();
  }
  
  private final boolean cf()
  {
    if (G(30)) {
      return true;
    }
    if (G(72)) {
      return true;
    }
    Token localToken1 = this.e;
    if (bX()) {
      this.e = localToken1;
    }
    if (G(78)) {
      return true;
    }
    Token localToken2 = this.e;
    if (cb()) {
      this.e = localToken2;
    }
    if (G(78)) {
      return true;
    }
    Token localToken3 = this.e;
    if (ca()) {
      this.e = localToken3;
    }
    if (G(73)) {
      return true;
    }
    return F();
  }
  
  private final boolean cg()
  {
    Token localToken = this.e;
    if (ce())
    {
      this.e = localToken;
      if (cd()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean ch()
  {
    if (cc()) {
      return true;
    }
    Token localToken = this.e;
    if (G(100))
    {
      this.e = localToken;
      if (G(101)) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean ci()
  {
    return cc();
  }
  
  private final boolean cj()
  {
    if (G(21)) {
      return true;
    }
    if (F()) {
      return true;
    }
    if (G(59)) {
      return true;
    }
    if (G(72)) {
      return true;
    }
    if (U()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    return G(78);
  }
  
  private final boolean ck()
  {
    if (G(72)) {
      return true;
    }
    if (af()) {
      return true;
    }
    return G(76);
  }
  
  private final boolean cl()
  {
    if (cc()) {
      return true;
    }
    Token localToken = this.e;
    if (G(100))
    {
      this.e = localToken;
      if (G(101)) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean cm()
  {
    Token localToken = this.e;
    if (cl())
    {
      this.e = localToken;
      if (ci()) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean cn()
  {
    Token localToken = this.e;
    if (G(43))
    {
      this.e = localToken;
      if (G(44))
      {
        this.e = localToken;
        if (G(45))
        {
          this.e = localToken;
          if (G(51))
          {
            this.e = localToken;
            if (G(27))
            {
              this.e = localToken;
              if (G(39))
              {
                this.e = localToken;
                if (G(52))
                {
                  this.e = localToken;
                  if (G(58))
                  {
                    this.e = localToken;
                    if (G(10))
                    {
                      this.e = localToken;
                      if (G(48))
                      {
                        this.e = localToken;
                        if (G(49)) {
                          return true;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  private final boolean co()
  {
    if (G(59)) {
      return true;
    }
    if (G(72)) {
      return true;
    }
    if (U()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    return F();
  }
  
  private final boolean cp()
  {
    if (G(72)) {
      return true;
    }
    if (af()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    Token localToken = this.e;
    if (G(87))
    {
      this.e = localToken;
      if (G(86))
      {
        this.e = localToken;
        if (G(72))
        {
          this.e = localToken;
          if (G(69))
          {
            this.e = localToken;
            if (G(40))
            {
              this.e = localToken;
              if (bg()) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  private final boolean cq()
  {
    if (G(72)) {
      return true;
    }
    if (af()) {
      return true;
    }
    if (G(76)) {
      return true;
    }
    return G(77);
  }
  
  private final boolean cr()
  {
    return cv();
  }
  
  private final boolean cs()
  {
    return c();
  }
  
  private final boolean ct()
  {
    if (G(32)) {
      return true;
    }
    if (G(72)) {
      return true;
    }
    if (U()) {
      return true;
    }
    if (G(73)) {
      return true;
    }
    if (F()) {
      return true;
    }
    Token localToken = this.e;
    if (bP()) {
      this.e = localToken;
    }
    return false;
  }
  
  private final boolean cu()
  {
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!cn());
    this.e = localToken;
    return false;
  }
  
  private final boolean cv()
  {
    Token localToken = this.e;
    if (cw())
    {
      this.e = localToken;
      if (cq())
      {
        this.e = localToken;
        if (cp()) {
          return true;
        }
      }
    }
    return false;
  }
  
  private final boolean cw()
  {
    if (G(72)) {
      return true;
    }
    return as();
  }
  
  private final boolean cx()
  {
    return cm();
  }
  
  private final boolean cy()
  {
    return cg();
  }
  
  private final boolean cz()
  {
    if (G(20)) {
      return true;
    }
    return G(89);
  }
  
  private final boolean d()
  {
    return c();
  }
  
  private final boolean d(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = aG();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean da()
  {
    if (cu()) {
      return true;
    }
    if (aD()) {
      return true;
    }
    return G(69);
  }
  
  private final boolean db()
  {
    return bs();
  }
  
  private final boolean dc()
  {
    if (cX()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!cZ());
    this.e = localToken;
    return false;
  }
  
  private final boolean dd()
  {
    return bp();
  }
  
  private final boolean de()
  {
    if (cu()) {
      return true;
    }
    if (G(69)) {
      return true;
    }
    if (aN()) {
      return true;
    }
    Token localToken = this.e;
    if (cP()) {
      this.e = localToken;
    }
    return G(74);
  }
  
  private final boolean df()
  {
    if (G(35)) {
      return true;
    }
    return aD();
  }
  
  private final boolean dg()
  {
    return F();
  }
  
  private final boolean dh()
  {
    if (dc()) {
      return true;
    }
    Token localToken = this.e;
    if (df()) {
      this.e = localToken;
    }
    return false;
  }
  
  private final boolean di()
  {
    if (cu()) {
      return true;
    }
    if (av()) {
      return true;
    }
    if (G(69)) {
      return true;
    }
    return G(72);
  }
  
  private final boolean dj()
  {
    if (bq()) {
      return true;
    }
    return G(78);
  }
  
  private final boolean dk()
  {
    if (cu()) {
      return true;
    }
    Token localToken = this.e;
    if (G(13))
    {
      this.e = localToken;
      if (G(37)) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean dl()
  {
    if (G(110)) {
      return true;
    }
    return e();
  }
  
  private final boolean dm()
  {
    return bD();
  }
  
  private final boolean dn()
  {
    if (dh()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!cW());
    this.e = localToken;
    return false;
  }
  
  private final boolean jdMethod_do()
  {
    return bD();
  }
  
  private final boolean dp()
  {
    Token localToken = this.e;
    if (G(106))
    {
      this.e = localToken;
      if (G(107)) {
        return true;
      }
    }
    return dn();
  }
  
  private final int dq()
  {
    Token localToken1 = this.token.next;
    this.jj_nt = localToken1;
    Token localToken3;
    if (localToken1 == null)
    {
      Token localToken2 = this.token;
      localToken3 = this.token_source.getNextToken();
      localToken2.next = localToken3;
    }
    for (int j = localToken3.kind;; j = this.jj_nt.kind)
    {
      this.d = j;
      return j;
    }
  }
  
  private final boolean e()
  {
    if (dn()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!dp());
    this.e = localToken;
    return false;
  }
  
  private final boolean e(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = aJ();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean f()
  {
    if (G(74)) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!d());
    this.e = localToken;
    return G(75);
  }
  
  private final boolean f(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = ay();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean g()
  {
    if (e()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!dl());
    this.e = localToken;
    return false;
  }
  
  private final boolean g(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = ad();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean h()
  {
    if (G(69)) {
      return true;
    }
    if (G(89)) {
      return true;
    }
    return F();
  }
  
  private final boolean h(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = M();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean i()
  {
    if (G(88)) {
      return true;
    }
    if (U()) {
      return true;
    }
    if (G(89)) {
      return true;
    }
    return A();
  }
  
  private final boolean i(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = cr();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean j()
  {
    Token localToken = this.e;
    if (G(108))
    {
      this.e = localToken;
      if (G(109)) {
        return true;
      }
    }
    return g();
  }
  
  private final boolean j(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = cw();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean k()
  {
    if (g()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!j());
    this.e = localToken;
    return false;
  }
  
  private final boolean k(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = ck();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean l()
  {
    return aM();
  }
  
  private final boolean l(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = ch();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean m()
  {
    return aS();
  }
  
  private final boolean m(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = bZ();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  public static void main(String[] paramArrayOfString)
  {
    int j = 0;
    int k;
    if (paramArrayOfString[0].equals("-p"))
    {
      j = 1;
      k = 1;
    }
    else
    {
      k = 0;
    }
    if (j >= paramArrayOfString.length) {
      return;
    }
    Parser localParser = new Parser(new FileReader(paramArrayOfString[j]));
    localParser.setRetainComments(true);
    for (;;)
    {
      if (localParser.Line())
      {
        j++;
        break;
      }
      if (k != 0) {
        System.out.println(localParser.popNode());
      }
    }
  }
  
  private final boolean n()
  {
    return aY();
  }
  
  private final boolean n(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = bA();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean o()
  {
    Token localToken = this.e;
    if (G(98))
    {
      this.e = localToken;
      if (G(99)) {
        return true;
      }
    }
    return k();
  }
  
  private final boolean o(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = by();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean p()
  {
    return bb();
  }
  
  private final boolean p(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = bv();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean q()
  {
    if (k()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!o());
    this.e = localToken;
    return false;
  }
  
  private final boolean q(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = D();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean r()
  {
    return bh();
  }
  
  private final boolean r(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = X();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean s()
  {
    return bi();
  }
  
  private final boolean s(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = P();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean t()
  {
    return bV();
  }
  
  private final boolean t(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = N();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean u()
  {
    Token localToken = this.e;
    if (G(96))
    {
      this.e = localToken;
      if (G(97)) {
        return true;
      }
    }
    return q();
  }
  
  private final boolean u(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = R();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean v()
  {
    return cf();
  }
  
  private final boolean v(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = G();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean w()
  {
    if (q()) {
      return true;
    }
    Token localToken;
    do
    {
      localToken = this.e;
    } while (!u());
    this.e = localToken;
    return false;
  }
  
  private final boolean w(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = d();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean x()
  {
    return cj();
  }
  
  private final boolean x(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = dk();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean y()
  {
    return co();
  }
  
  private final boolean y(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = di();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  private final boolean z()
  {
    return ct();
  }
  
  private final boolean z(int paramInt)
  {
    this.g = paramInt;
    Token localToken = this.token;
    this.e = localToken;
    this.f = localToken;
    boolean bool1 = true;
    try
    {
      boolean bool2 = de();
      bool1 ^= bool2;
    }
    catch (LookaheadSuccess localLookaheadSuccess) {}
    return bool1;
  }
  
  public final void AdditiveExpression()
  {
    MultiplicativeExpression();
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      switch (j)
      {
      default: 
        return;
      }
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      int m;
      switch (k)
      {
      default: 
        F(-1);
        throw new ParseException();
      case 103: 
        m = 103;
        break;
      case 102: 
        m = 102;
      }
      Token localToken = F(m);
      MultiplicativeExpression();
      BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
      int n = 1;
      this.a.c(localBSHBinaryExpression);
      a(localBSHBinaryExpression);
      try
      {
        this.a.a(localBSHBinaryExpression, 2);
        n = 0;
        b(localBSHBinaryExpression);
        localBSHBinaryExpression.kind = localToken.kind;
      }
      finally
      {
        if (n != 0)
        {
          this.a.a(localBSHBinaryExpression, 2);
          b(localBSHBinaryExpression);
        }
      }
    }
  }
  
  /* Error */
  public final void AllocationExpression()
  {
    // Byte code:
    //   0: new 839	bsh/BSHAllocationExpression
    //   3: dup
    //   4: bipush 23
    //   6: invokespecial 840	bsh/BSHAllocationExpression:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: iconst_2
    //   25: invokespecial 842	bsh/Parser:r	(I)Z
    //   28: ifeq +21 -> 49
    //   31: aload_0
    //   32: bipush 40
    //   34: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   37: pop
    //   38: aload_0
    //   39: invokevirtual 845	bsh/Parser:PrimitiveType	()V
    //   42: aload_0
    //   43: invokevirtual 848	bsh/Parser:ArrayDimensions	()V
    //   46: goto +125 -> 171
    //   49: aload_0
    //   50: getfield 58	bsh/Parser:d	I
    //   53: iconst_m1
    //   54: if_icmpne +12 -> 66
    //   57: aload_0
    //   58: invokespecial 813	bsh/Parser:dq	()I
    //   61: istore 5
    //   63: goto +9 -> 72
    //   66: aload_0
    //   67: getfield 58	bsh/Parser:d	I
    //   70: istore 5
    //   72: iload 5
    //   74: bipush 40
    //   76: if_icmpeq +17 -> 93
    //   79: aload_0
    //   80: iconst_m1
    //   81: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   84: pop
    //   85: new 817	bsh/ParseException
    //   88: dup
    //   89: invokespecial 818	bsh/ParseException:<init>	()V
    //   92: athrow
    //   93: aload_0
    //   94: bipush 40
    //   96: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   99: pop
    //   100: aload_0
    //   101: invokevirtual 851	bsh/Parser:AmbiguousName	()V
    //   104: aload_0
    //   105: getfield 58	bsh/Parser:d	I
    //   108: iconst_m1
    //   109: if_icmpne +12 -> 121
    //   112: aload_0
    //   113: invokespecial 813	bsh/Parser:dq	()I
    //   116: istore 8
    //   118: goto +9 -> 127
    //   121: aload_0
    //   122: getfield 58	bsh/Parser:d	I
    //   125: istore 8
    //   127: iload 8
    //   129: bipush 72
    //   131: if_icmpeq +24 -> 155
    //   134: iload 8
    //   136: bipush 76
    //   138: if_icmpeq -96 -> 42
    //   141: aload_0
    //   142: iconst_m1
    //   143: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   146: pop
    //   147: new 817	bsh/ParseException
    //   150: dup
    //   151: invokespecial 818	bsh/ParseException:<init>	()V
    //   154: athrow
    //   155: aload_0
    //   156: invokevirtual 854	bsh/Parser:Arguments	()V
    //   159: aload_0
    //   160: iconst_2
    //   161: invokespecial 856	bsh/Parser:q	(I)Z
    //   164: ifeq +7 -> 171
    //   167: aload_0
    //   168: invokevirtual 859	bsh/Parser:Block	()V
    //   171: aload_0
    //   172: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   175: aload_1
    //   176: iconst_1
    //   177: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   180: aload_0
    //   181: aload_1
    //   182: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   185: return
    //   186: astore 4
    //   188: iconst_1
    //   189: istore_3
    //   190: goto +45 -> 235
    //   193: astore_2
    //   194: aload_0
    //   195: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   198: aload_1
    //   199: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   202: iconst_0
    //   203: istore_3
    //   204: aload_2
    //   205: instanceof 865
    //   208: ifeq +8 -> 216
    //   211: aload_2
    //   212: checkcast 865	java/lang/RuntimeException
    //   215: athrow
    //   216: aload_2
    //   217: instanceof 817
    //   220: ifeq +8 -> 228
    //   223: aload_2
    //   224: checkcast 817	bsh/ParseException
    //   227: athrow
    //   228: aload_2
    //   229: checkcast 867	java/lang/Error
    //   232: athrow
    //   233: astore 4
    //   235: iload_3
    //   236: ifeq +17 -> 253
    //   239: aload_0
    //   240: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   243: aload_1
    //   244: iconst_1
    //   245: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   248: aload_0
    //   249: aload_1
    //   250: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   253: aload 4
    //   255: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	256	0	this	Parser
    //   9	241	1	localBSHAllocationExpression	BSHAllocationExpression
    //   193	36	2	localThrowable	Throwable
    //   189	47	3	j	int
    //   186	1	4	localObject1	Object
    //   233	21	4	localObject2	Object
    //   61	16	5	k	int
    //   116	23	8	m	int
    // Exception table:
    //   from	to	target	type
    //   23	42	186	finally
    //   42	46	186	finally
    //   49	63	186	finally
    //   66	72	186	finally
    //   79	93	186	finally
    //   93	118	186	finally
    //   121	127	186	finally
    //   141	155	186	finally
    //   155	171	186	finally
    //   194	202	186	finally
    //   23	42	193	java/lang/Throwable
    //   42	46	193	java/lang/Throwable
    //   49	63	193	java/lang/Throwable
    //   66	72	193	java/lang/Throwable
    //   79	93	193	java/lang/Throwable
    //   93	118	193	java/lang/Throwable
    //   121	127	193	java/lang/Throwable
    //   141	155	193	java/lang/Throwable
    //   155	171	193	java/lang/Throwable
    //   204	216	233	finally
    //   216	228	233	finally
    //   228	233	233	finally
  }
  
  public final void AmbiguousName()
  {
    BSHAmbiguousName localBSHAmbiguousName = new BSHAmbiguousName(12);
    this.a.c(localBSHAmbiguousName);
    a(localBSHAmbiguousName);
    try
    {
      StringBuffer localStringBuffer1 = new StringBuffer(F(69).image);
      while (g(2))
      {
        F(80);
        Token localToken = F(69);
        StringBuffer localStringBuffer2 = new StringBuffer();
        localStringBuffer2.append(".");
        localStringBuffer2.append(localToken.image);
        localStringBuffer1.append(localStringBuffer2.toString());
      }
      this.a.a(localBSHAmbiguousName, true);
      int j;
      try
      {
        b(localBSHAmbiguousName);
        localBSHAmbiguousName.text = localStringBuffer1.toString();
        return;
      }
      finally
      {
        Object localObject1 = localObject3;
        j = 0;
      }
      if (j == 0) {
        break label162;
      }
    }
    finally
    {
      j = 1;
    }
    this.a.a(localBSHAmbiguousName, true);
    b(localBSHAmbiguousName);
    label162:
    throw ((Throwable)localObject2);
  }
  
  public final void AndExpression()
  {
    EqualityExpression();
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      switch (j)
      {
      default: 
        return;
      }
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      int m;
      switch (k)
      {
      default: 
        F(-1);
        throw new ParseException();
      case 107: 
        m = 107;
        break;
      case 106: 
        m = 106;
      }
      Token localToken = F(m);
      EqualityExpression();
      BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
      int n = 1;
      this.a.c(localBSHBinaryExpression);
      a(localBSHBinaryExpression);
      try
      {
        this.a.a(localBSHBinaryExpression, 2);
        n = 0;
        b(localBSHBinaryExpression);
        localBSHBinaryExpression.kind = localToken.kind;
      }
      finally
      {
        if (n != 0)
        {
          this.a.a(localBSHBinaryExpression, 2);
          b(localBSHBinaryExpression);
        }
      }
    }
  }
  
  public final void ArgumentList()
  {
    for (;;)
    {
      Expression();
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      if (j != 79) {
        return;
      }
      F(79);
    }
  }
  
  /* Error */
  public final void Arguments()
  {
    // Byte code:
    //   0: new 903	bsh/BSHArguments
    //   3: dup
    //   4: bipush 22
    //   6: invokespecial 904	bsh/BSHArguments:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: bipush 72
    //   26: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   29: pop
    //   30: aload_0
    //   31: getfield 58	bsh/Parser:d	I
    //   34: iconst_m1
    //   35: if_icmpne +12 -> 47
    //   38: aload_0
    //   39: invokespecial 813	bsh/Parser:dq	()I
    //   42: istore 6
    //   44: goto +108 -> 152
    //   47: aload_0
    //   48: getfield 58	bsh/Parser:d	I
    //   51: istore 6
    //   53: goto +99 -> 152
    //   56: aload_0
    //   57: invokevirtual 906	bsh/Parser:ArgumentList	()V
    //   60: aload_0
    //   61: bipush 73
    //   63: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   66: pop
    //   67: aload_0
    //   68: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   71: aload_1
    //   72: iconst_1
    //   73: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   76: aload_0
    //   77: aload_1
    //   78: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   81: return
    //   82: astore 4
    //   84: iconst_1
    //   85: istore_3
    //   86: goto +45 -> 131
    //   89: astore_2
    //   90: aload_0
    //   91: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   94: aload_1
    //   95: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   98: iconst_0
    //   99: istore_3
    //   100: aload_2
    //   101: instanceof 865
    //   104: ifeq +8 -> 112
    //   107: aload_2
    //   108: checkcast 865	java/lang/RuntimeException
    //   111: athrow
    //   112: aload_2
    //   113: instanceof 817
    //   116: ifeq +8 -> 124
    //   119: aload_2
    //   120: checkcast 817	bsh/ParseException
    //   123: athrow
    //   124: aload_2
    //   125: checkcast 867	java/lang/Error
    //   128: athrow
    //   129: astore 4
    //   131: iload_3
    //   132: ifeq +17 -> 149
    //   135: aload_0
    //   136: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   139: aload_1
    //   140: iconst_1
    //   141: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   144: aload_0
    //   145: aload_1
    //   146: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   149: aload 4
    //   151: athrow
    //   152: iload 6
    //   154: lookupswitch	default:+210->364, 11:+-98->56, 14:+-98->56, 17:+-98->56, 22:+-98->56, 26:+-98->56, 29:+-98->56, 36:+-98->56, 38:+-98->56, 40:+-98->56, 41:+-98->56, 47:+-98->56, 55:+-98->56, 57:+-98->56, 60:+-98->56, 64:+-98->56, 66:+-98->56, 67:+-98->56, 69:+-98->56, 72:+-98->56, 86:+-98->56, 87:+-98->56, 100:+-98->56, 101:+-98->56, 102:+-98->56, 103:+-98->56
    //   364: goto -304 -> 60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	367	0	this	Parser
    //   9	137	1	localBSHArguments	BSHArguments
    //   89	36	2	localThrowable	Throwable
    //   85	47	3	j	int
    //   82	1	4	localObject1	Object
    //   129	21	4	localObject2	Object
    //   42	111	6	k	int
    // Exception table:
    //   from	to	target	type
    //   23	44	82	finally
    //   47	53	82	finally
    //   56	60	82	finally
    //   60	67	82	finally
    //   90	98	82	finally
    //   23	44	89	java/lang/Throwable
    //   47	53	89	java/lang/Throwable
    //   56	60	89	java/lang/Throwable
    //   60	67	89	java/lang/Throwable
    //   100	112	129	finally
    //   112	124	129	finally
    //   124	129	129	finally
  }
  
  /* Error */
  public final void ArrayDimensions()
  {
    // Byte code:
    //   0: new 908	bsh/BSHArrayDimensions
    //   3: dup
    //   4: bipush 24
    //   6: invokespecial 909	bsh/BSHArrayDimensions:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: iconst_2
    //   25: invokespecial 911	bsh/Parser:u	(I)Z
    //   28: ifeq +65 -> 93
    //   31: aload_0
    //   32: bipush 76
    //   34: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   37: pop
    //   38: aload_0
    //   39: invokevirtual 901	bsh/Parser:Expression	()V
    //   42: aload_0
    //   43: bipush 77
    //   45: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   48: pop
    //   49: aload_1
    //   50: invokevirtual 914	bsh/BSHArrayDimensions:addDefinedDimension	()V
    //   53: aload_0
    //   54: iconst_2
    //   55: invokespecial 916	bsh/Parser:s	(I)Z
    //   58: ifeq +6 -> 64
    //   61: goto -30 -> 31
    //   64: aload_0
    //   65: iconst_2
    //   66: invokespecial 918	bsh/Parser:t	(I)Z
    //   69: ifeq +120 -> 189
    //   72: aload_0
    //   73: bipush 76
    //   75: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   78: pop
    //   79: aload_0
    //   80: bipush 77
    //   82: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   85: pop
    //   86: aload_1
    //   87: invokevirtual 921	bsh/BSHArrayDimensions:addUndefinedDimension	()V
    //   90: goto -26 -> 64
    //   93: aload_0
    //   94: getfield 58	bsh/Parser:d	I
    //   97: iconst_m1
    //   98: if_icmpne +12 -> 110
    //   101: aload_0
    //   102: invokespecial 813	bsh/Parser:dq	()I
    //   105: istore 9
    //   107: goto +9 -> 116
    //   110: aload_0
    //   111: getfield 58	bsh/Parser:d	I
    //   114: istore 9
    //   116: iload 9
    //   118: bipush 76
    //   120: if_icmpeq +17 -> 137
    //   123: aload_0
    //   124: iconst_m1
    //   125: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   128: pop
    //   129: new 817	bsh/ParseException
    //   132: dup
    //   133: invokespecial 818	bsh/ParseException:<init>	()V
    //   136: athrow
    //   137: aload_0
    //   138: bipush 76
    //   140: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   143: pop
    //   144: aload_0
    //   145: bipush 77
    //   147: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   150: pop
    //   151: aload_1
    //   152: invokevirtual 921	bsh/BSHArrayDimensions:addUndefinedDimension	()V
    //   155: aload_0
    //   156: getfield 58	bsh/Parser:d	I
    //   159: iconst_m1
    //   160: if_icmpne +12 -> 172
    //   163: aload_0
    //   164: invokespecial 813	bsh/Parser:dq	()I
    //   167: istore 13
    //   169: goto +9 -> 178
    //   172: aload_0
    //   173: getfield 58	bsh/Parser:d	I
    //   176: istore 13
    //   178: iload 13
    //   180: bipush 76
    //   182: if_icmpeq -45 -> 137
    //   185: aload_0
    //   186: invokevirtual 924	bsh/Parser:ArrayInitializer	()V
    //   189: aload_0
    //   190: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   193: aload_1
    //   194: iconst_1
    //   195: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   198: aload_0
    //   199: aload_1
    //   200: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   203: return
    //   204: astore 4
    //   206: iconst_1
    //   207: istore_3
    //   208: goto +45 -> 253
    //   211: astore_2
    //   212: aload_0
    //   213: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   216: aload_1
    //   217: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   220: iconst_0
    //   221: istore_3
    //   222: aload_2
    //   223: instanceof 865
    //   226: ifeq +8 -> 234
    //   229: aload_2
    //   230: checkcast 865	java/lang/RuntimeException
    //   233: athrow
    //   234: aload_2
    //   235: instanceof 817
    //   238: ifeq +8 -> 246
    //   241: aload_2
    //   242: checkcast 817	bsh/ParseException
    //   245: athrow
    //   246: aload_2
    //   247: checkcast 867	java/lang/Error
    //   250: athrow
    //   251: astore 4
    //   253: iload_3
    //   254: ifeq +17 -> 271
    //   257: aload_0
    //   258: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   261: aload_1
    //   262: iconst_1
    //   263: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   266: aload_0
    //   267: aload_1
    //   268: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   271: aload 4
    //   273: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	274	0	this	Parser
    //   9	259	1	localBSHArrayDimensions	BSHArrayDimensions
    //   211	36	2	localThrowable	Throwable
    //   207	47	3	j	int
    //   204	1	4	localObject1	Object
    //   251	21	4	localObject2	Object
    //   105	16	9	k	int
    //   167	16	13	m	int
    // Exception table:
    //   from	to	target	type
    //   23	31	204	finally
    //   31	61	204	finally
    //   64	90	204	finally
    //   93	107	204	finally
    //   110	116	204	finally
    //   123	137	204	finally
    //   137	169	204	finally
    //   172	178	204	finally
    //   185	189	204	finally
    //   212	220	204	finally
    //   23	31	211	java/lang/Throwable
    //   31	61	211	java/lang/Throwable
    //   64	90	211	java/lang/Throwable
    //   93	107	211	java/lang/Throwable
    //   110	116	211	java/lang/Throwable
    //   123	137	211	java/lang/Throwable
    //   137	169	211	java/lang/Throwable
    //   172	178	211	java/lang/Throwable
    //   185	189	211	java/lang/Throwable
    //   222	234	251	finally
    //   234	246	251	finally
    //   246	251	251	finally
  }
  
  /* Error */
  public final void ArrayInitializer()
  {
    // Byte code:
    //   0: new 926	bsh/BSHArrayInitializer
    //   3: dup
    //   4: bipush 6
    //   6: invokespecial 927	bsh/BSHArrayInitializer:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: bipush 74
    //   26: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   29: pop
    //   30: aload_0
    //   31: getfield 58	bsh/Parser:d	I
    //   34: iconst_m1
    //   35: if_icmpne +12 -> 47
    //   38: aload_0
    //   39: invokespecial 813	bsh/Parser:dq	()I
    //   42: istore 6
    //   44: goto +159 -> 203
    //   47: aload_0
    //   48: getfield 58	bsh/Parser:d	I
    //   51: istore 6
    //   53: goto +150 -> 203
    //   56: aload_0
    //   57: invokevirtual 930	bsh/Parser:VariableInitializer	()V
    //   60: aload_0
    //   61: iconst_2
    //   62: invokespecial 932	bsh/Parser:d	(I)Z
    //   65: ifeq +13 -> 78
    //   68: aload_0
    //   69: bipush 79
    //   71: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   74: pop
    //   75: goto -19 -> 56
    //   78: aload_0
    //   79: getfield 58	bsh/Parser:d	I
    //   82: iconst_m1
    //   83: if_icmpne +12 -> 95
    //   86: aload_0
    //   87: invokespecial 813	bsh/Parser:dq	()I
    //   90: istore 7
    //   92: goto +335 -> 427
    //   95: aload_0
    //   96: getfield 58	bsh/Parser:d	I
    //   99: istore 7
    //   101: goto +326 -> 427
    //   104: aload_0
    //   105: bipush 79
    //   107: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   110: pop
    //   111: aload_0
    //   112: bipush 75
    //   114: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   117: pop
    //   118: aload_0
    //   119: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   122: aload_1
    //   123: iconst_1
    //   124: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   127: aload_0
    //   128: aload_1
    //   129: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   132: return
    //   133: astore 4
    //   135: iconst_1
    //   136: istore_3
    //   137: goto +45 -> 182
    //   140: astore_2
    //   141: aload_0
    //   142: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   145: aload_1
    //   146: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   149: iconst_0
    //   150: istore_3
    //   151: aload_2
    //   152: instanceof 865
    //   155: ifeq +8 -> 163
    //   158: aload_2
    //   159: checkcast 865	java/lang/RuntimeException
    //   162: athrow
    //   163: aload_2
    //   164: instanceof 817
    //   167: ifeq +8 -> 175
    //   170: aload_2
    //   171: checkcast 817	bsh/ParseException
    //   174: athrow
    //   175: aload_2
    //   176: checkcast 867	java/lang/Error
    //   179: athrow
    //   180: astore 4
    //   182: iload_3
    //   183: ifeq +17 -> 200
    //   186: aload_0
    //   187: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   190: aload_1
    //   191: iconst_1
    //   192: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   195: aload_0
    //   196: aload_1
    //   197: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   200: aload 4
    //   202: athrow
    //   203: iload 6
    //   205: lookupswitch	default:+219->424, 11:+-149->56, 14:+-149->56, 17:+-149->56, 22:+-149->56, 26:+-149->56, 29:+-149->56, 36:+-149->56, 38:+-149->56, 40:+-149->56, 41:+-149->56, 47:+-149->56, 55:+-149->56, 57:+-149->56, 60:+-149->56, 64:+-149->56, 66:+-149->56, 67:+-149->56, 69:+-149->56, 72:+-149->56, 74:+-149->56, 86:+-149->56, 87:+-149->56, 100:+-149->56, 101:+-149->56, 102:+-149->56, 103:+-149->56
    //   424: goto -346 -> 78
    //   427: iload 7
    //   429: bipush 79
    //   431: if_icmpeq -327 -> 104
    //   434: goto -323 -> 111
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	437	0	this	Parser
    //   9	188	1	localBSHArrayInitializer	BSHArrayInitializer
    //   140	36	2	localThrowable	Throwable
    //   136	47	3	j	int
    //   133	1	4	localObject1	Object
    //   180	21	4	localObject2	Object
    //   42	162	6	k	int
    //   90	342	7	m	int
    // Exception table:
    //   from	to	target	type
    //   23	44	133	finally
    //   47	53	133	finally
    //   56	75	133	finally
    //   78	92	133	finally
    //   95	101	133	finally
    //   104	111	133	finally
    //   111	118	133	finally
    //   141	149	133	finally
    //   23	44	140	java/lang/Throwable
    //   47	53	140	java/lang/Throwable
    //   56	75	140	java/lang/Throwable
    //   78	92	140	java/lang/Throwable
    //   95	101	140	java/lang/Throwable
    //   104	111	140	java/lang/Throwable
    //   111	118	140	java/lang/Throwable
    //   151	163	180	finally
    //   163	175	180	finally
    //   175	180	180	finally
  }
  
  /* Error */
  public final void Assignment()
  {
    // Byte code:
    //   0: new 935	bsh/BSHAssignment
    //   3: dup
    //   4: bipush 13
    //   6: invokespecial 936	bsh/BSHAssignment:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: invokevirtual 939	bsh/Parser:PrimaryExpression	()V
    //   27: aload_1
    //   28: aload_0
    //   29: invokevirtual 942	bsh/Parser:AssignmentOperator	()I
    //   32: putfield 945	bsh/BSHAssignment:operator	I
    //   35: aload_0
    //   36: invokevirtual 901	bsh/Parser:Expression	()V
    //   39: aload_0
    //   40: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   43: aload_1
    //   44: iconst_1
    //   45: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   48: aload_0
    //   49: aload_1
    //   50: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   53: return
    //   54: astore 4
    //   56: iconst_1
    //   57: istore_3
    //   58: goto +45 -> 103
    //   61: astore_2
    //   62: aload_0
    //   63: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   66: aload_1
    //   67: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   70: iconst_0
    //   71: istore_3
    //   72: aload_2
    //   73: instanceof 865
    //   76: ifeq +8 -> 84
    //   79: aload_2
    //   80: checkcast 865	java/lang/RuntimeException
    //   83: athrow
    //   84: aload_2
    //   85: instanceof 817
    //   88: ifeq +8 -> 96
    //   91: aload_2
    //   92: checkcast 817	bsh/ParseException
    //   95: athrow
    //   96: aload_2
    //   97: checkcast 867	java/lang/Error
    //   100: athrow
    //   101: astore 4
    //   103: iload_3
    //   104: ifeq +17 -> 121
    //   107: aload_0
    //   108: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   111: aload_1
    //   112: iconst_1
    //   113: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   116: aload_0
    //   117: aload_1
    //   118: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   121: aload 4
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	this	Parser
    //   9	109	1	localBSHAssignment	BSHAssignment
    //   61	36	2	localThrowable	Throwable
    //   57	47	3	j	int
    //   54	1	4	localObject1	Object
    //   101	21	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   23	39	54	finally
    //   62	70	54	finally
    //   23	39	61	java/lang/Throwable
    //   72	84	101	finally
    //   84	96	101	finally
    //   96	101	101	finally
  }
  
  public final int AssignmentOperator()
  {
    int j;
    if (this.d == -1) {
      j = dq();
    } else {
      j = this.d;
    }
    int k = 81;
    if (j != k)
    {
      k = 124;
      if (j != k)
      {
        int m;
        switch (j)
        {
        default: 
          switch (j)
          {
          default: 
            F(-1);
            throw new ParseException();
          case 133: 
            m = 133;
            break;
          case 132: 
            m = 132;
            break;
          case 131: 
            m = 131;
            break;
          case 130: 
            m = 130;
            break;
          case 129: 
            m = 129;
            break;
          case 128: 
            m = 128;
            break;
          case 127: 
            m = 127;
            break;
          case 126: 
            m = 126;
          }
          break;
        case 122: 
          m = 122;
          break;
        case 121: 
          m = 121;
          break;
        case 120: 
          m = 120;
          break;
        case 119: 
          m = 119;
          break;
        case 118: 
          m = 118;
        }
        F(m);
        break label244;
      }
    }
    F(k);
    label244:
    return getToken(0).kind;
  }
  
  /* Error */
  public final void Block()
  {
    // Byte code:
    //   0: new 950	bsh/BSHBlock
    //   3: dup
    //   4: bipush 25
    //   6: invokespecial 951	bsh/BSHBlock:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: bipush 74
    //   26: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   29: pop
    //   30: aload_0
    //   31: iconst_1
    //   32: invokespecial 953	bsh/Parser:w	(I)Z
    //   35: ifeq +10 -> 45
    //   38: aload_0
    //   39: invokevirtual 956	bsh/Parser:BlockStatement	()V
    //   42: goto -12 -> 30
    //   45: aload_0
    //   46: bipush 75
    //   48: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   51: pop
    //   52: aload_0
    //   53: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   56: aload_1
    //   57: iconst_1
    //   58: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   61: aload_0
    //   62: aload_1
    //   63: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   66: return
    //   67: astore 4
    //   69: iconst_1
    //   70: istore_3
    //   71: goto +45 -> 116
    //   74: astore_2
    //   75: aload_0
    //   76: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   79: aload_1
    //   80: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   83: iconst_0
    //   84: istore_3
    //   85: aload_2
    //   86: instanceof 865
    //   89: ifeq +8 -> 97
    //   92: aload_2
    //   93: checkcast 865	java/lang/RuntimeException
    //   96: athrow
    //   97: aload_2
    //   98: instanceof 817
    //   101: ifeq +8 -> 109
    //   104: aload_2
    //   105: checkcast 817	bsh/ParseException
    //   108: athrow
    //   109: aload_2
    //   110: checkcast 867	java/lang/Error
    //   113: athrow
    //   114: astore 4
    //   116: iload_3
    //   117: ifeq +17 -> 134
    //   120: aload_0
    //   121: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   124: aload_1
    //   125: iconst_1
    //   126: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   129: aload_0
    //   130: aload_1
    //   131: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   134: aload 4
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	Parser
    //   9	122	1	localBSHBlock	BSHBlock
    //   74	36	2	localThrowable	Throwable
    //   70	47	3	j	int
    //   67	1	4	localObject1	Object
    //   114	21	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   23	30	67	finally
    //   30	42	67	finally
    //   45	52	67	finally
    //   75	83	67	finally
    //   23	30	74	java/lang/Throwable
    //   30	42	74	java/lang/Throwable
    //   45	52	74	java/lang/Throwable
    //   85	97	114	finally
    //   97	109	114	finally
    //   109	114	114	finally
  }
  
  public final void BlockStatement()
  {
    if (x(Integer.MAX_VALUE))
    {
      ClassDeclaration();
      return;
    }
    if (y(Integer.MAX_VALUE)) {}
    while (z(Integer.MAX_VALUE))
    {
      MethodDeclaration();
      return;
    }
    if (A(Integer.MAX_VALUE))
    {
      TypedVariableDeclaration();
      F(78);
      return;
    }
    if (B(1))
    {
      Statement();
      return;
    }
    int j;
    if (this.d == -1) {
      j = dq();
    } else {
      j = this.d;
    }
    if (j != 34) {
      if (j != 42)
      {
        if (j != 48)
        {
          if (j != 68)
          {
            F(-1);
            throw new ParseException();
          }
          FormalComment();
        }
      }
      else
      {
        PackageDeclaration();
        return;
      }
    }
    ImportDeclaration();
  }
  
  public final boolean BooleanLiteral()
  {
    int j;
    if (this.d == -1) {
      j = dq();
    } else {
      j = this.d;
    }
    if (j != 26)
    {
      if (j != 55)
      {
        F(-1);
        throw new ParseException();
      }
      F(55);
      return true;
    }
    F(26);
    return false;
  }
  
  public final void BreakStatement()
  {
    BSHReturnStatement localBSHReturnStatement = new BSHReturnStatement(35);
    this.a.c(localBSHReturnStatement);
    a(localBSHReturnStatement);
    int k;
    try
    {
      F(12);
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
    }
    finally
    {
      j = 1;
    }
    F(69);
    for (;;)
    {
      F(78);
      this.a.a(localBSHReturnStatement, true);
      int j;
      try
      {
        b(localBSHReturnStatement);
        localBSHReturnStatement.kind = 12;
        return;
      }
      finally
      {
        j = 0;
      }
      if (j != 0)
      {
        this.a.a(localBSHReturnStatement, true);
        b(localBSHReturnStatement);
      }
      throw ((Throwable)localObject2);
      if (k == 69) {
        break;
      }
    }
  }
  
  /* Error */
  public final void CastExpression()
  {
    // Byte code:
    //   0: new 997	bsh/BSHCastExpression
    //   3: dup
    //   4: bipush 17
    //   6: invokespecial 998	bsh/BSHCastExpression:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: ldc_w 957
    //   27: invokespecial 1000	bsh/Parser:m	(I)Z
    //   30: ifeq +28 -> 58
    //   33: aload_0
    //   34: bipush 72
    //   36: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   39: pop
    //   40: aload_0
    //   41: invokevirtual 1003	bsh/Parser:Type	()V
    //   44: aload_0
    //   45: bipush 73
    //   47: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   50: pop
    //   51: aload_0
    //   52: invokevirtual 1006	bsh/Parser:UnaryExpression	()V
    //   55: goto +69 -> 124
    //   58: aload_0
    //   59: getfield 58	bsh/Parser:d	I
    //   62: iconst_m1
    //   63: if_icmpne +12 -> 75
    //   66: aload_0
    //   67: invokespecial 813	bsh/Parser:dq	()I
    //   70: istore 5
    //   72: goto +9 -> 81
    //   75: aload_0
    //   76: getfield 58	bsh/Parser:d	I
    //   79: istore 5
    //   81: iload 5
    //   83: bipush 72
    //   85: if_icmpeq +17 -> 102
    //   88: aload_0
    //   89: iconst_m1
    //   90: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   93: pop
    //   94: new 817	bsh/ParseException
    //   97: dup
    //   98: invokespecial 818	bsh/ParseException:<init>	()V
    //   101: athrow
    //   102: aload_0
    //   103: bipush 72
    //   105: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   108: pop
    //   109: aload_0
    //   110: invokevirtual 1003	bsh/Parser:Type	()V
    //   113: aload_0
    //   114: bipush 73
    //   116: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   119: pop
    //   120: aload_0
    //   121: invokevirtual 1009	bsh/Parser:UnaryExpressionNotPlusMinus	()V
    //   124: aload_0
    //   125: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   128: aload_1
    //   129: iconst_1
    //   130: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   133: aload_0
    //   134: aload_1
    //   135: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   138: return
    //   139: astore 4
    //   141: iconst_1
    //   142: istore_3
    //   143: goto +45 -> 188
    //   146: astore_2
    //   147: aload_0
    //   148: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   151: aload_1
    //   152: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   155: iconst_0
    //   156: istore_3
    //   157: aload_2
    //   158: instanceof 865
    //   161: ifeq +8 -> 169
    //   164: aload_2
    //   165: checkcast 865	java/lang/RuntimeException
    //   168: athrow
    //   169: aload_2
    //   170: instanceof 817
    //   173: ifeq +8 -> 181
    //   176: aload_2
    //   177: checkcast 817	bsh/ParseException
    //   180: athrow
    //   181: aload_2
    //   182: checkcast 867	java/lang/Error
    //   185: athrow
    //   186: astore 4
    //   188: iload_3
    //   189: ifeq +17 -> 206
    //   192: aload_0
    //   193: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   196: aload_1
    //   197: iconst_1
    //   198: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   201: aload_0
    //   202: aload_1
    //   203: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   206: aload 4
    //   208: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	this	Parser
    //   9	194	1	localBSHCastExpression	BSHCastExpression
    //   146	36	2	localThrowable	Throwable
    //   142	47	3	j	int
    //   139	1	4	localObject1	Object
    //   186	21	4	localObject2	Object
    //   70	16	5	k	int
    // Exception table:
    //   from	to	target	type
    //   23	55	139	finally
    //   58	72	139	finally
    //   75	81	139	finally
    //   88	102	139	finally
    //   102	124	139	finally
    //   147	155	139	finally
    //   23	55	146	java/lang/Throwable
    //   58	72	146	java/lang/Throwable
    //   75	81	146	java/lang/Throwable
    //   88	102	146	java/lang/Throwable
    //   102	124	146	java/lang/Throwable
    //   157	169	186	finally
    //   169	181	186	finally
    //   181	186	186	finally
  }
  
  public final void CastLookahead()
  {
    if (j(2))
    {
      F(72);
      PrimitiveType();
      return;
    }
    int m;
    if (k(Integer.MAX_VALUE))
    {
      F(72);
      AmbiguousName();
      F(76);
      m = 77;
    }
    for (;;)
    {
      F(m);
      return;
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      if (j != 72)
      {
        F(-1);
        throw new ParseException();
      }
      F(72);
      AmbiguousName();
      F(73);
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      switch (k)
      {
      default: 
        F(-1);
        throw new ParseException();
      case 87: 
        m = 87;
        break;
      case 86: 
        m = 86;
        break;
      case 72: 
        F(72);
        return;
      case 69: 
        m = 69;
        break;
      case 40: 
        m = 40;
      }
    }
    Literal();
  }
  
  /* Error */
  public final void ClassDeclaration()
  {
    // Byte code:
    //   0: new 1019	bsh/BSHClassDeclaration
    //   3: dup
    //   4: iconst_1
    //   5: invokespecial 1020	bsh/BSHClassDeclaration:<init>	(I)V
    //   8: astore_1
    //   9: aload_0
    //   10: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   13: aload_1
    //   14: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   22: aload_0
    //   23: iconst_0
    //   24: iconst_0
    //   25: invokevirtual 1024	bsh/Parser:Modifiers	(IZ)Lbsh/Modifiers;
    //   28: astore 8
    //   30: aload_0
    //   31: getfield 58	bsh/Parser:d	I
    //   34: iconst_m1
    //   35: if_icmpne +12 -> 47
    //   38: aload_0
    //   39: invokespecial 813	bsh/Parser:dq	()I
    //   42: istore 9
    //   44: goto +9 -> 53
    //   47: aload_0
    //   48: getfield 58	bsh/Parser:d	I
    //   51: istore 9
    //   53: iload 9
    //   55: bipush 13
    //   57: if_icmpeq +39 -> 96
    //   60: iload 9
    //   62: bipush 37
    //   64: if_icmpeq +17 -> 81
    //   67: aload_0
    //   68: iconst_m1
    //   69: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   72: pop
    //   73: new 817	bsh/ParseException
    //   76: dup
    //   77: invokespecial 818	bsh/ParseException:<init>	()V
    //   80: athrow
    //   81: aload_0
    //   82: bipush 37
    //   84: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   87: pop
    //   88: aload_1
    //   89: iconst_1
    //   90: putfield 1026	bsh/BSHClassDeclaration:e	Z
    //   93: goto +10 -> 103
    //   96: aload_0
    //   97: bipush 13
    //   99: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   102: pop
    //   103: aload_0
    //   104: bipush 69
    //   106: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   109: astore 11
    //   111: aload_0
    //   112: getfield 58	bsh/Parser:d	I
    //   115: iconst_m1
    //   116: if_icmpne +12 -> 128
    //   119: aload_0
    //   120: invokespecial 813	bsh/Parser:dq	()I
    //   123: istore 12
    //   125: goto +218 -> 343
    //   128: aload_0
    //   129: getfield 58	bsh/Parser:d	I
    //   132: istore 12
    //   134: goto +209 -> 343
    //   137: aload_0
    //   138: bipush 25
    //   140: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   143: pop
    //   144: aload_0
    //   145: invokevirtual 851	bsh/Parser:AmbiguousName	()V
    //   148: aload_1
    //   149: iconst_1
    //   150: putfield 1028	bsh/BSHClassDeclaration:d	Z
    //   153: aload_0
    //   154: getfield 58	bsh/Parser:d	I
    //   157: iconst_m1
    //   158: if_icmpne +12 -> 170
    //   161: aload_0
    //   162: invokespecial 813	bsh/Parser:dq	()I
    //   165: istore 14
    //   167: goto +186 -> 353
    //   170: aload_0
    //   171: getfield 58	bsh/Parser:d	I
    //   174: istore 14
    //   176: goto +177 -> 353
    //   179: aload_0
    //   180: bipush 33
    //   182: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   185: pop
    //   186: aload_1
    //   187: aload_0
    //   188: invokevirtual 1031	bsh/Parser:NameList	()I
    //   191: putfield 1033	bsh/BSHClassDeclaration:c	I
    //   194: aload_0
    //   195: invokevirtual 859	bsh/Parser:Block	()V
    //   198: aload_0
    //   199: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   202: aload_1
    //   203: iconst_1
    //   204: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   207: aload_0
    //   208: aload_1
    //   209: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   212: aload_1
    //   213: aload 8
    //   215: putfield 1036	bsh/BSHClassDeclaration:b	Lbsh/Modifiers;
    //   218: aload_1
    //   219: aload 11
    //   221: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   224: putfield 1038	bsh/BSHClassDeclaration:a	Ljava/lang/String;
    //   227: return
    //   228: astore 16
    //   230: aload 16
    //   232: astore 7
    //   234: iconst_0
    //   235: istore_3
    //   236: goto +86 -> 322
    //   239: astore_2
    //   240: iconst_0
    //   241: istore_3
    //   242: goto +13 -> 255
    //   245: astore 7
    //   247: iconst_1
    //   248: istore_3
    //   249: goto +73 -> 322
    //   252: astore_2
    //   253: iconst_1
    //   254: istore_3
    //   255: iload_3
    //   256: ifeq +17 -> 273
    //   259: aload_0
    //   260: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   263: aload_1
    //   264: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   267: iconst_0
    //   268: istore 5
    //   270: goto +14 -> 284
    //   273: aload_0
    //   274: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   277: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   280: pop
    //   281: iload_3
    //   282: istore 5
    //   284: aload_2
    //   285: instanceof 865
    //   288: ifeq +8 -> 296
    //   291: aload_2
    //   292: checkcast 865	java/lang/RuntimeException
    //   295: athrow
    //   296: aload_2
    //   297: instanceof 817
    //   300: ifeq +8 -> 308
    //   303: aload_2
    //   304: checkcast 817	bsh/ParseException
    //   307: athrow
    //   308: aload_2
    //   309: checkcast 867	java/lang/Error
    //   312: athrow
    //   313: astore 6
    //   315: iload 5
    //   317: istore_3
    //   318: aload 6
    //   320: astore 7
    //   322: iload_3
    //   323: ifeq +17 -> 340
    //   326: aload_0
    //   327: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   330: aload_1
    //   331: iconst_1
    //   332: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   335: aload_0
    //   336: aload_1
    //   337: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   340: aload 7
    //   342: athrow
    //   343: iload 12
    //   345: bipush 25
    //   347: if_icmpeq -210 -> 137
    //   350: goto -197 -> 153
    //   353: iload 14
    //   355: bipush 33
    //   357: if_icmpeq -178 -> 179
    //   360: goto -166 -> 194
    //   363: astore 7
    //   365: goto -43 -> 322
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	368	0	this	Parser
    //   8	329	1	localBSHClassDeclaration	BSHClassDeclaration
    //   239	1	2	localThrowable1	Throwable
    //   252	57	2	localThrowable2	Throwable
    //   235	88	3	j	int
    //   268	48	5	k	int
    //   313	6	6	localObject1	Object
    //   232	1	7	localObject2	Object
    //   245	1	7	localObject3	Object
    //   320	21	7	localObject4	Object
    //   363	1	7	localObject5	Object
    //   28	186	8	localModifiers	Modifiers
    //   42	23	9	m	int
    //   109	111	11	localToken	Token
    //   123	225	12	n	int
    //   165	193	14	i1	int
    //   228	3	16	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   207	227	228	finally
    //   207	227	239	java/lang/Throwable
    //   22	44	245	finally
    //   47	53	245	finally
    //   67	81	245	finally
    //   81	93	245	finally
    //   96	103	245	finally
    //   103	125	245	finally
    //   128	134	245	finally
    //   137	153	245	finally
    //   153	167	245	finally
    //   170	176	245	finally
    //   179	194	245	finally
    //   194	207	245	finally
    //   22	44	252	java/lang/Throwable
    //   47	53	252	java/lang/Throwable
    //   67	81	252	java/lang/Throwable
    //   81	93	252	java/lang/Throwable
    //   96	103	252	java/lang/Throwable
    //   103	125	252	java/lang/Throwable
    //   128	134	252	java/lang/Throwable
    //   137	153	252	java/lang/Throwable
    //   153	167	252	java/lang/Throwable
    //   170	176	252	java/lang/Throwable
    //   179	194	252	java/lang/Throwable
    //   194	207	252	java/lang/Throwable
    //   284	296	313	finally
    //   296	308	313	finally
    //   308	313	313	finally
    //   259	267	363	finally
    //   273	281	363	finally
  }
  
  public final void ConditionalAndExpression()
  {
    InclusiveOrExpression();
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      switch (j)
      {
      default: 
        return;
      }
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      int m;
      switch (k)
      {
      default: 
        F(-1);
        throw new ParseException();
      case 99: 
        m = 99;
        break;
      case 98: 
        m = 98;
      }
      Token localToken = F(m);
      InclusiveOrExpression();
      BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
      int n = 1;
      this.a.c(localBSHBinaryExpression);
      a(localBSHBinaryExpression);
      try
      {
        this.a.a(localBSHBinaryExpression, 2);
        n = 0;
        b(localBSHBinaryExpression);
        localBSHBinaryExpression.kind = localToken.kind;
      }
      finally
      {
        if (n != 0)
        {
          this.a.a(localBSHBinaryExpression, 2);
          b(localBSHBinaryExpression);
        }
      }
    }
  }
  
  /* Error */
  public final void ConditionalExpression()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 1049	bsh/Parser:ConditionalOrExpression	()V
    //   4: aload_0
    //   5: getfield 58	bsh/Parser:d	I
    //   8: iconst_m1
    //   9: if_icmpne +11 -> 20
    //   12: aload_0
    //   13: invokespecial 813	bsh/Parser:dq	()I
    //   16: istore_1
    //   17: goto +8 -> 25
    //   20: aload_0
    //   21: getfield 58	bsh/Parser:d	I
    //   24: istore_1
    //   25: iload_1
    //   26: bipush 88
    //   28: if_icmpeq +4 -> 32
    //   31: return
    //   32: aload_0
    //   33: bipush 88
    //   35: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   38: pop
    //   39: aload_0
    //   40: invokevirtual 901	bsh/Parser:Expression	()V
    //   43: aload_0
    //   44: bipush 89
    //   46: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   49: pop
    //   50: new 1051	bsh/BSHTernaryExpression
    //   53: dup
    //   54: bipush 14
    //   56: invokespecial 1052	bsh/BSHTernaryExpression:<init>	(I)V
    //   59: astore 4
    //   61: iconst_1
    //   62: istore 5
    //   64: aload_0
    //   65: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   68: aload 4
    //   70: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   73: aload_0
    //   74: aload 4
    //   76: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   79: aload_0
    //   80: invokevirtual 1054	bsh/Parser:ConditionalExpression	()V
    //   83: aload_0
    //   84: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   87: aload 4
    //   89: iconst_3
    //   90: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   93: aload_0
    //   94: aload 4
    //   96: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   99: return
    //   100: astore 8
    //   102: goto +65 -> 167
    //   105: astore 6
    //   107: aload_0
    //   108: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   111: aload 4
    //   113: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   116: iconst_0
    //   117: istore 5
    //   119: aload 6
    //   121: instanceof 865
    //   124: istore 7
    //   126: iconst_0
    //   127: istore 5
    //   129: iload 7
    //   131: ifeq +9 -> 140
    //   134: aload 6
    //   136: checkcast 865	java/lang/RuntimeException
    //   139: athrow
    //   140: aload 6
    //   142: instanceof 817
    //   145: istore 9
    //   147: iconst_0
    //   148: istore 5
    //   150: iload 9
    //   152: ifeq +9 -> 161
    //   155: aload 6
    //   157: checkcast 817	bsh/ParseException
    //   160: athrow
    //   161: aload 6
    //   163: checkcast 867	java/lang/Error
    //   166: athrow
    //   167: iload 5
    //   169: ifeq +19 -> 188
    //   172: aload_0
    //   173: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   176: aload 4
    //   178: iconst_3
    //   179: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   182: aload_0
    //   183: aload 4
    //   185: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   188: aload 8
    //   190: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	this	Parser
    //   16	13	1	j	int
    //   59	125	4	localBSHTernaryExpression	BSHTernaryExpression
    //   62	106	5	k	int
    //   105	57	6	localThrowable	Throwable
    //   124	6	7	bool1	boolean
    //   100	89	8	localObject	Object
    //   145	6	9	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   79	83	100	finally
    //   107	116	100	finally
    //   119	126	100	finally
    //   134	140	100	finally
    //   140	147	100	finally
    //   155	161	100	finally
    //   161	167	100	finally
    //   79	83	105	java/lang/Throwable
  }
  
  public final void ConditionalOrExpression()
  {
    ConditionalAndExpression();
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      switch (j)
      {
      default: 
        return;
      }
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      int m;
      switch (k)
      {
      default: 
        F(-1);
        throw new ParseException();
      case 97: 
        m = 97;
        break;
      case 96: 
        m = 96;
      }
      Token localToken = F(m);
      ConditionalAndExpression();
      BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
      int n = 1;
      this.a.c(localBSHBinaryExpression);
      a(localBSHBinaryExpression);
      try
      {
        this.a.a(localBSHBinaryExpression, 2);
        n = 0;
        b(localBSHBinaryExpression);
        localBSHBinaryExpression.kind = localToken.kind;
      }
      finally
      {
        if (n != 0)
        {
          this.a.a(localBSHBinaryExpression, 2);
          b(localBSHBinaryExpression);
        }
      }
    }
  }
  
  public final void ContinueStatement()
  {
    BSHReturnStatement localBSHReturnStatement = new BSHReturnStatement(35);
    this.a.c(localBSHReturnStatement);
    a(localBSHReturnStatement);
    int k;
    try
    {
      F(19);
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
    }
    finally
    {
      j = 1;
    }
    F(69);
    for (;;)
    {
      F(78);
      this.a.a(localBSHReturnStatement, true);
      int j;
      try
      {
        b(localBSHReturnStatement);
        localBSHReturnStatement.kind = 19;
        return;
      }
      finally
      {
        j = 0;
      }
      if (j != 0)
      {
        this.a.a(localBSHReturnStatement, true);
        b(localBSHReturnStatement);
      }
      throw ((Throwable)localObject2);
      if (k == 69) {
        break;
      }
    }
  }
  
  /* Error */
  public final void DoStatement()
  {
    // Byte code:
    //   0: new 1060	bsh/BSHWhileStatement
    //   3: dup
    //   4: bipush 30
    //   6: invokespecial 1061	bsh/BSHWhileStatement:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: bipush 21
    //   28: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   31: pop
    //   32: aload_0
    //   33: invokevirtual 979	bsh/Parser:Statement	()V
    //   36: aload_0
    //   37: bipush 59
    //   39: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   42: pop
    //   43: aload_0
    //   44: bipush 72
    //   46: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   49: pop
    //   50: aload_0
    //   51: invokevirtual 901	bsh/Parser:Expression	()V
    //   54: aload_0
    //   55: bipush 73
    //   57: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   60: pop
    //   61: aload_0
    //   62: bipush 78
    //   64: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   67: pop
    //   68: aload_0
    //   69: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   72: aload_1
    //   73: iconst_1
    //   74: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   77: aload_0
    //   78: aload_1
    //   79: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   82: aload_1
    //   83: iconst_1
    //   84: putfield 1064	bsh/BSHWhileStatement:isDoStatement	Z
    //   87: return
    //   88: astore_3
    //   89: iconst_0
    //   90: istore 4
    //   92: goto +14 -> 106
    //   95: astore 6
    //   97: iconst_1
    //   98: istore_2
    //   99: goto +67 -> 166
    //   102: astore_3
    //   103: iconst_1
    //   104: istore 4
    //   106: iload 4
    //   108: ifeq +16 -> 124
    //   111: aload_0
    //   112: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   115: aload_1
    //   116: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   119: iconst_0
    //   120: istore_2
    //   121: goto +14 -> 135
    //   124: aload_0
    //   125: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   128: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   131: pop
    //   132: iload 4
    //   134: istore_2
    //   135: aload_3
    //   136: instanceof 865
    //   139: ifeq +8 -> 147
    //   142: aload_3
    //   143: checkcast 865	java/lang/RuntimeException
    //   146: athrow
    //   147: aload_3
    //   148: instanceof 817
    //   151: ifeq +8 -> 159
    //   154: aload_3
    //   155: checkcast 817	bsh/ParseException
    //   158: athrow
    //   159: aload_3
    //   160: checkcast 867	java/lang/Error
    //   163: athrow
    //   164: astore 6
    //   166: iload_2
    //   167: ifeq +17 -> 184
    //   170: aload_0
    //   171: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   174: aload_1
    //   175: iconst_1
    //   176: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   179: aload_0
    //   180: aload_1
    //   181: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   184: aload 6
    //   186: athrow
    //   187: astore 6
    //   189: iload 4
    //   191: istore_2
    //   192: goto -26 -> 166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	195	0	this	Parser
    //   9	172	1	localBSHWhileStatement	BSHWhileStatement
    //   24	168	2	j	int
    //   88	1	3	localThrowable1	Throwable
    //   102	58	3	localThrowable2	Throwable
    //   90	100	4	k	int
    //   95	1	6	localObject1	Object
    //   164	21	6	localObject2	Object
    //   187	1	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   77	87	88	java/lang/Throwable
    //   25	77	95	finally
    //   25	77	102	java/lang/Throwable
    //   77	87	164	finally
    //   135	147	164	finally
    //   147	159	164	finally
    //   159	164	164	finally
    //   111	119	187	finally
    //   124	132	187	finally
  }
  
  public final void EmptyStatement()
  {
    F(78);
  }
  
  /* Error */
  public final void EnhancedForStatement()
  {
    // Byte code:
    //   0: new 1068	bsh/BSHEnhancedForStatement
    //   3: dup
    //   4: bipush 32
    //   6: invokespecial 1069	bsh/BSHEnhancedForStatement:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: iconst_4
    //   27: invokespecial 1071	bsh/Parser:D	(I)Z
    //   30: ifeq +82 -> 112
    //   33: aload_0
    //   34: bipush 30
    //   36: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   39: pop
    //   40: aload_0
    //   41: bipush 72
    //   43: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   46: pop
    //   47: aload_0
    //   48: bipush 69
    //   50: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   53: astore 17
    //   55: aload_0
    //   56: bipush 89
    //   58: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   61: pop
    //   62: aload_0
    //   63: invokevirtual 901	bsh/Parser:Expression	()V
    //   66: aload_0
    //   67: bipush 73
    //   69: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   72: pop
    //   73: aload_0
    //   74: invokevirtual 979	bsh/Parser:Statement	()V
    //   77: aload_0
    //   78: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   81: aload_1
    //   82: iconst_1
    //   83: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   86: aload_0
    //   87: aload_1
    //   88: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   91: aload 17
    //   93: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   96: astore 14
    //   98: aload_1
    //   99: aload 14
    //   101: putfield 1072	bsh/BSHEnhancedForStatement:a	Ljava/lang/String;
    //   104: return
    //   105: astore_3
    //   106: iconst_0
    //   107: istore 4
    //   109: goto +130 -> 239
    //   112: aload_0
    //   113: getfield 58	bsh/Parser:d	I
    //   116: iconst_m1
    //   117: if_icmpne +12 -> 129
    //   120: aload_0
    //   121: invokespecial 813	bsh/Parser:dq	()I
    //   124: istore 7
    //   126: goto +9 -> 135
    //   129: aload_0
    //   130: getfield 58	bsh/Parser:d	I
    //   133: istore 7
    //   135: iload 7
    //   137: bipush 30
    //   139: if_icmpeq +17 -> 156
    //   142: aload_0
    //   143: iconst_m1
    //   144: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   147: pop
    //   148: new 817	bsh/ParseException
    //   151: dup
    //   152: invokespecial 818	bsh/ParseException:<init>	()V
    //   155: athrow
    //   156: aload_0
    //   157: bipush 30
    //   159: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   162: pop
    //   163: aload_0
    //   164: bipush 72
    //   166: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   169: pop
    //   170: aload_0
    //   171: invokevirtual 1003	bsh/Parser:Type	()V
    //   174: aload_0
    //   175: bipush 69
    //   177: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   180: astore 11
    //   182: aload_0
    //   183: bipush 89
    //   185: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   188: pop
    //   189: aload_0
    //   190: invokevirtual 901	bsh/Parser:Expression	()V
    //   193: aload_0
    //   194: bipush 73
    //   196: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   199: pop
    //   200: aload_0
    //   201: invokevirtual 979	bsh/Parser:Statement	()V
    //   204: aload_0
    //   205: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   208: aload_1
    //   209: iconst_1
    //   210: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   213: aload_0
    //   214: aload_1
    //   215: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   218: aload 11
    //   220: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   223: astore 14
    //   225: goto -127 -> 98
    //   228: astore 6
    //   230: iconst_1
    //   231: istore_2
    //   232: goto +67 -> 299
    //   235: astore_3
    //   236: iconst_1
    //   237: istore 4
    //   239: iload 4
    //   241: ifeq +16 -> 257
    //   244: aload_0
    //   245: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   248: aload_1
    //   249: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   252: iconst_0
    //   253: istore_2
    //   254: goto +14 -> 268
    //   257: aload_0
    //   258: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   261: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   264: pop
    //   265: iload 4
    //   267: istore_2
    //   268: aload_3
    //   269: instanceof 865
    //   272: ifeq +8 -> 280
    //   275: aload_3
    //   276: checkcast 865	java/lang/RuntimeException
    //   279: athrow
    //   280: aload_3
    //   281: instanceof 817
    //   284: ifeq +8 -> 292
    //   287: aload_3
    //   288: checkcast 817	bsh/ParseException
    //   291: athrow
    //   292: aload_3
    //   293: checkcast 867	java/lang/Error
    //   296: athrow
    //   297: astore 6
    //   299: iload_2
    //   300: ifeq +17 -> 317
    //   303: aload_0
    //   304: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   307: aload_1
    //   308: iconst_1
    //   309: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   312: aload_0
    //   313: aload_1
    //   314: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   317: aload 6
    //   319: athrow
    //   320: astore 6
    //   322: iload 4
    //   324: istore_2
    //   325: goto -26 -> 299
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	328	0	this	Parser
    //   9	305	1	localBSHEnhancedForStatement	BSHEnhancedForStatement
    //   24	301	2	j	int
    //   105	1	3	localThrowable1	Throwable
    //   235	58	3	localThrowable2	Throwable
    //   107	216	4	k	int
    //   228	1	6	localObject1	Object
    //   297	21	6	localObject2	Object
    //   320	1	6	localObject3	Object
    //   124	16	7	m	int
    //   180	39	11	localToken1	Token
    //   96	128	14	str	String
    //   53	39	17	localToken2	Token
    // Exception table:
    //   from	to	target	type
    //   86	98	105	java/lang/Throwable
    //   98	104	105	java/lang/Throwable
    //   213	225	105	java/lang/Throwable
    //   25	86	228	finally
    //   112	126	228	finally
    //   129	135	228	finally
    //   142	156	228	finally
    //   156	213	228	finally
    //   25	86	235	java/lang/Throwable
    //   112	126	235	java/lang/Throwable
    //   129	135	235	java/lang/Throwable
    //   142	156	235	java/lang/Throwable
    //   156	213	235	java/lang/Throwable
    //   86	98	297	finally
    //   98	104	297	finally
    //   213	225	297	finally
    //   268	280	297	finally
    //   280	292	297	finally
    //   292	297	297	finally
    //   244	252	320	finally
    //   257	265	320	finally
  }
  
  public final void EqualityExpression()
  {
    InstanceOfExpression();
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      if ((j != 90) && (j != 95)) {
        return;
      }
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      Token localToken;
      if (k != 90)
      {
        if (k != 95)
        {
          F(-1);
          throw new ParseException();
        }
        localToken = F(95);
      }
      else
      {
        localToken = F(90);
      }
      InstanceOfExpression();
      BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
      int m = 1;
      this.a.c(localBSHBinaryExpression);
      a(localBSHBinaryExpression);
      try
      {
        this.a.a(localBSHBinaryExpression, 2);
        m = 0;
        b(localBSHBinaryExpression);
        localBSHBinaryExpression.kind = localToken.kind;
      }
      finally
      {
        if (m != 0)
        {
          this.a.a(localBSHBinaryExpression, 2);
          b(localBSHBinaryExpression);
        }
      }
    }
  }
  
  public final void ExclusiveOrExpression()
  {
    AndExpression();
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      if (j != 110) {
        return;
      }
      Token localToken = F(110);
      AndExpression();
      BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
      int k = 1;
      this.a.c(localBSHBinaryExpression);
      a(localBSHBinaryExpression);
      try
      {
        this.a.a(localBSHBinaryExpression, 2);
        k = 0;
        b(localBSHBinaryExpression);
        localBSHBinaryExpression.kind = localToken.kind;
      }
      finally
      {
        if (k != 0)
        {
          this.a.a(localBSHBinaryExpression, 2);
          b(localBSHBinaryExpression);
        }
      }
    }
  }
  
  public final void Expression()
  {
    if (h(Integer.MAX_VALUE))
    {
      Assignment();
      return;
    }
    int j;
    if (this.d == -1) {
      j = dq();
    } else {
      j = this.d;
    }
    switch (j)
    {
    default: 
      F(-1);
      throw new ParseException();
    }
    ConditionalExpression();
  }
  
  public final void ForInit()
  {
    if (E(Integer.MAX_VALUE))
    {
      TypedVariableDeclaration();
      return;
    }
    int j;
    if (this.d == -1) {
      j = dq();
    } else {
      j = this.d;
    }
    switch (j)
    {
    default: 
      F(-1);
      throw new ParseException();
    }
    StatementExpressionList();
  }
  
  /* Error */
  public final void ForStatement()
  {
    // Byte code:
    //   0: new 1091	bsh/BSHForStatement
    //   3: dup
    //   4: bipush 31
    //   6: invokespecial 1092	bsh/BSHForStatement:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: bipush 30
    //   26: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   29: pop
    //   30: aload_0
    //   31: bipush 72
    //   33: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   36: pop
    //   37: aload_0
    //   38: getfield 58	bsh/Parser:d	I
    //   41: iconst_m1
    //   42: if_icmpne +12 -> 54
    //   45: aload_0
    //   46: invokespecial 813	bsh/Parser:dq	()I
    //   49: istore 7
    //   51: goto +201 -> 252
    //   54: aload_0
    //   55: getfield 58	bsh/Parser:d	I
    //   58: istore 7
    //   60: goto +192 -> 252
    //   63: aload_0
    //   64: invokevirtual 1094	bsh/Parser:ForInit	()V
    //   67: aload_1
    //   68: iconst_1
    //   69: putfield 1097	bsh/BSHForStatement:hasForInit	Z
    //   72: aload_0
    //   73: bipush 78
    //   75: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   78: pop
    //   79: aload_0
    //   80: getfield 58	bsh/Parser:d	I
    //   83: iconst_m1
    //   84: if_icmpne +12 -> 96
    //   87: aload_0
    //   88: invokespecial 813	bsh/Parser:dq	()I
    //   91: istore 9
    //   93: goto +462 -> 555
    //   96: aload_0
    //   97: getfield 58	bsh/Parser:d	I
    //   100: istore 9
    //   102: goto +453 -> 555
    //   105: aload_0
    //   106: invokevirtual 901	bsh/Parser:Expression	()V
    //   109: aload_1
    //   110: iconst_1
    //   111: putfield 1100	bsh/BSHForStatement:hasExpression	Z
    //   114: aload_0
    //   115: bipush 78
    //   117: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   120: pop
    //   121: aload_0
    //   122: getfield 58	bsh/Parser:d	I
    //   125: iconst_m1
    //   126: if_icmpne +12 -> 138
    //   129: aload_0
    //   130: invokespecial 813	bsh/Parser:dq	()I
    //   133: istore 11
    //   135: goto +636 -> 771
    //   138: aload_0
    //   139: getfield 58	bsh/Parser:d	I
    //   142: istore 11
    //   144: goto +627 -> 771
    //   147: aload_0
    //   148: invokevirtual 1103	bsh/Parser:ForUpdate	()V
    //   151: aload_1
    //   152: iconst_1
    //   153: putfield 1106	bsh/BSHForStatement:hasForUpdate	Z
    //   156: aload_0
    //   157: bipush 73
    //   159: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   162: pop
    //   163: aload_0
    //   164: invokevirtual 979	bsh/Parser:Statement	()V
    //   167: aload_0
    //   168: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   171: aload_1
    //   172: iconst_1
    //   173: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   176: aload_0
    //   177: aload_1
    //   178: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   181: return
    //   182: astore 4
    //   184: iconst_1
    //   185: istore_3
    //   186: goto +45 -> 231
    //   189: astore_2
    //   190: aload_0
    //   191: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   194: aload_1
    //   195: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   198: iconst_0
    //   199: istore_3
    //   200: aload_2
    //   201: instanceof 865
    //   204: ifeq +8 -> 212
    //   207: aload_2
    //   208: checkcast 865	java/lang/RuntimeException
    //   211: athrow
    //   212: aload_2
    //   213: instanceof 817
    //   216: ifeq +8 -> 224
    //   219: aload_2
    //   220: checkcast 817	bsh/ParseException
    //   223: athrow
    //   224: aload_2
    //   225: checkcast 867	java/lang/Error
    //   228: athrow
    //   229: astore 4
    //   231: iload_3
    //   232: ifeq +17 -> 249
    //   235: aload_0
    //   236: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   239: aload_1
    //   240: iconst_1
    //   241: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   244: aload_0
    //   245: aload_1
    //   246: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   249: aload 4
    //   251: athrow
    //   252: iload 7
    //   254: lookupswitch	default:+298->552, 10:+-191->63, 11:+-191->63, 14:+-191->63, 17:+-191->63, 22:+-191->63, 26:+-191->63, 27:+-191->63, 29:+-191->63, 36:+-191->63, 38:+-191->63, 39:+-191->63, 40:+-191->63, 41:+-191->63, 43:+-191->63, 44:+-191->63, 45:+-191->63, 47:+-191->63, 48:+-191->63, 49:+-191->63, 51:+-191->63, 52:+-191->63, 55:+-191->63, 57:+-191->63, 58:+-191->63, 60:+-191->63, 64:+-191->63, 66:+-191->63, 67:+-191->63, 69:+-191->63, 72:+-191->63, 86:+-191->63, 87:+-191->63, 100:+-191->63, 101:+-191->63, 102:+-191->63, 103:+-191->63
    //   552: goto -480 -> 72
    //   555: iload 9
    //   557: lookupswitch	default:+211->768, 11:+-452->105, 14:+-452->105, 17:+-452->105, 22:+-452->105, 26:+-452->105, 29:+-452->105, 36:+-452->105, 38:+-452->105, 40:+-452->105, 41:+-452->105, 47:+-452->105, 55:+-452->105, 57:+-452->105, 60:+-452->105, 64:+-452->105, 66:+-452->105, 67:+-452->105, 69:+-452->105, 72:+-452->105, 86:+-452->105, 87:+-452->105, 100:+-452->105, 101:+-452->105, 102:+-452->105, 103:+-452->105
    //   768: goto -654 -> 114
    //   771: iload 11
    //   773: lookupswitch	default:+211->984, 11:+-626->147, 14:+-626->147, 17:+-626->147, 22:+-626->147, 26:+-626->147, 29:+-626->147, 36:+-626->147, 38:+-626->147, 40:+-626->147, 41:+-626->147, 47:+-626->147, 55:+-626->147, 57:+-626->147, 60:+-626->147, 64:+-626->147, 66:+-626->147, 67:+-626->147, 69:+-626->147, 72:+-626->147, 86:+-626->147, 87:+-626->147, 100:+-626->147, 101:+-626->147, 102:+-626->147, 103:+-626->147
    //   984: goto -828 -> 156
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	987	0	this	Parser
    //   9	237	1	localBSHForStatement	BSHForStatement
    //   189	36	2	localThrowable	Throwable
    //   185	47	3	j	int
    //   182	1	4	localObject1	Object
    //   229	21	4	localObject2	Object
    //   49	204	7	k	int
    //   91	465	9	m	int
    //   133	639	11	n	int
    // Exception table:
    //   from	to	target	type
    //   23	51	182	finally
    //   54	60	182	finally
    //   63	72	182	finally
    //   72	93	182	finally
    //   96	102	182	finally
    //   105	114	182	finally
    //   114	135	182	finally
    //   138	144	182	finally
    //   147	156	182	finally
    //   156	167	182	finally
    //   190	198	182	finally
    //   23	51	189	java/lang/Throwable
    //   54	60	189	java/lang/Throwable
    //   63	72	189	java/lang/Throwable
    //   72	93	189	java/lang/Throwable
    //   96	102	189	java/lang/Throwable
    //   105	114	189	java/lang/Throwable
    //   114	135	189	java/lang/Throwable
    //   138	144	189	java/lang/Throwable
    //   147	156	189	java/lang/Throwable
    //   156	167	189	java/lang/Throwable
    //   200	212	229	finally
    //   212	224	229	finally
    //   224	229	229	finally
  }
  
  public final void ForUpdate()
  {
    StatementExpressionList();
  }
  
  public final void FormalComment()
  {
    BSHFormalComment localBSHFormalComment = new BSHFormalComment(26);
    this.a.c(localBSHFormalComment);
    a(localBSHFormalComment);
    int j = 1;
    try
    {
      Token localToken = F(68);
      this.a.a(localBSHFormalComment, this.b);
      j = 0;
      b(localBSHFormalComment);
      localBSHFormalComment.text = localToken.image;
      return;
    }
    finally
    {
      if (j != 0)
      {
        this.a.a(localBSHFormalComment, this.b);
        b(localBSHFormalComment);
      }
    }
  }
  
  /* Error */
  public final void FormalParameter()
  {
    // Byte code:
    //   0: new 1113	bsh/BSHFormalParameter
    //   3: dup
    //   4: bipush 8
    //   6: invokespecial 1114	bsh/BSHFormalParameter:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: iconst_2
    //   27: invokespecial 1116	bsh/Parser:e	(I)Z
    //   30: ifeq +50 -> 80
    //   33: aload_0
    //   34: invokevirtual 1003	bsh/Parser:Type	()V
    //   37: aload_0
    //   38: bipush 69
    //   40: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   43: astore 11
    //   45: aload_0
    //   46: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   49: aload_1
    //   50: iconst_1
    //   51: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   54: aload_0
    //   55: aload_1
    //   56: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   59: aload 11
    //   61: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   64: astore 10
    //   66: aload_1
    //   67: aload 10
    //   69: putfield 1119	bsh/BSHFormalParameter:name	Ljava/lang/String;
    //   72: return
    //   73: astore_3
    //   74: iconst_0
    //   75: istore 4
    //   77: goto +90 -> 167
    //   80: aload_0
    //   81: getfield 58	bsh/Parser:d	I
    //   84: iconst_m1
    //   85: if_icmpne +12 -> 97
    //   88: aload_0
    //   89: invokespecial 813	bsh/Parser:dq	()I
    //   92: istore 7
    //   94: goto +9 -> 103
    //   97: aload_0
    //   98: getfield 58	bsh/Parser:d	I
    //   101: istore 7
    //   103: iload 7
    //   105: bipush 69
    //   107: if_icmpeq +17 -> 124
    //   110: aload_0
    //   111: iconst_m1
    //   112: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   115: pop
    //   116: new 817	bsh/ParseException
    //   119: dup
    //   120: invokespecial 818	bsh/ParseException:<init>	()V
    //   123: athrow
    //   124: aload_0
    //   125: bipush 69
    //   127: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   130: astore 9
    //   132: aload_0
    //   133: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   136: aload_1
    //   137: iconst_1
    //   138: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   141: aload_0
    //   142: aload_1
    //   143: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   146: aload 9
    //   148: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   151: astore 10
    //   153: goto -87 -> 66
    //   156: astore 6
    //   158: iconst_1
    //   159: istore_2
    //   160: goto +67 -> 227
    //   163: astore_3
    //   164: iconst_1
    //   165: istore 4
    //   167: iload 4
    //   169: ifeq +16 -> 185
    //   172: aload_0
    //   173: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   176: aload_1
    //   177: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   180: iconst_0
    //   181: istore_2
    //   182: goto +14 -> 196
    //   185: aload_0
    //   186: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   189: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   192: pop
    //   193: iload 4
    //   195: istore_2
    //   196: aload_3
    //   197: instanceof 865
    //   200: ifeq +8 -> 208
    //   203: aload_3
    //   204: checkcast 865	java/lang/RuntimeException
    //   207: athrow
    //   208: aload_3
    //   209: instanceof 817
    //   212: ifeq +8 -> 220
    //   215: aload_3
    //   216: checkcast 817	bsh/ParseException
    //   219: athrow
    //   220: aload_3
    //   221: checkcast 867	java/lang/Error
    //   224: athrow
    //   225: astore 6
    //   227: iload_2
    //   228: ifeq +17 -> 245
    //   231: aload_0
    //   232: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   235: aload_1
    //   236: iconst_1
    //   237: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   240: aload_0
    //   241: aload_1
    //   242: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   245: aload 6
    //   247: athrow
    //   248: astore 6
    //   250: iload 4
    //   252: istore_2
    //   253: goto -26 -> 227
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	256	0	this	Parser
    //   9	233	1	localBSHFormalParameter	BSHFormalParameter
    //   24	229	2	j	int
    //   73	1	3	localThrowable1	Throwable
    //   163	58	3	localThrowable2	Throwable
    //   75	176	4	k	int
    //   156	1	6	localObject1	Object
    //   225	21	6	localObject2	Object
    //   248	1	6	localObject3	Object
    //   92	16	7	m	int
    //   130	17	9	localToken1	Token
    //   64	88	10	str	String
    //   43	17	11	localToken2	Token
    // Exception table:
    //   from	to	target	type
    //   54	66	73	java/lang/Throwable
    //   66	72	73	java/lang/Throwable
    //   141	153	73	java/lang/Throwable
    //   25	54	156	finally
    //   80	94	156	finally
    //   97	103	156	finally
    //   110	124	156	finally
    //   124	141	156	finally
    //   25	54	163	java/lang/Throwable
    //   80	94	163	java/lang/Throwable
    //   97	103	163	java/lang/Throwable
    //   110	124	163	java/lang/Throwable
    //   124	141	163	java/lang/Throwable
    //   54	66	225	finally
    //   66	72	225	finally
    //   141	153	225	finally
    //   196	208	225	finally
    //   208	220	225	finally
    //   220	225	225	finally
    //   172	180	248	finally
    //   185	193	248	finally
  }
  
  /* Error */
  public final void FormalParameters()
  {
    // Byte code:
    //   0: new 1122	bsh/BSHFormalParameters
    //   3: dup
    //   4: bipush 7
    //   6: invokespecial 1123	bsh/BSHFormalParameters:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: bipush 72
    //   26: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   29: pop
    //   30: aload_0
    //   31: getfield 58	bsh/Parser:d	I
    //   34: iconst_m1
    //   35: if_icmpne +12 -> 47
    //   38: aload_0
    //   39: invokespecial 813	bsh/Parser:dq	()I
    //   42: istore 6
    //   44: goto +144 -> 188
    //   47: aload_0
    //   48: getfield 58	bsh/Parser:d	I
    //   51: istore 6
    //   53: goto +135 -> 188
    //   56: aload_0
    //   57: invokevirtual 1125	bsh/Parser:FormalParameter	()V
    //   60: aload_0
    //   61: getfield 58	bsh/Parser:d	I
    //   64: iconst_m1
    //   65: if_icmpne +12 -> 77
    //   68: aload_0
    //   69: invokespecial 813	bsh/Parser:dq	()I
    //   72: istore 7
    //   74: goto +180 -> 254
    //   77: aload_0
    //   78: getfield 58	bsh/Parser:d	I
    //   81: istore 7
    //   83: goto +171 -> 254
    //   86: aload_0
    //   87: bipush 73
    //   89: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   92: pop
    //   93: aload_0
    //   94: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   97: aload_1
    //   98: iconst_1
    //   99: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   102: aload_0
    //   103: aload_1
    //   104: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   107: return
    //   108: aload_0
    //   109: bipush 79
    //   111: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   114: pop
    //   115: goto -59 -> 56
    //   118: astore 4
    //   120: iconst_1
    //   121: istore_3
    //   122: goto +45 -> 167
    //   125: astore_2
    //   126: aload_0
    //   127: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   130: aload_1
    //   131: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   134: iconst_0
    //   135: istore_3
    //   136: aload_2
    //   137: instanceof 865
    //   140: ifeq +8 -> 148
    //   143: aload_2
    //   144: checkcast 865	java/lang/RuntimeException
    //   147: athrow
    //   148: aload_2
    //   149: instanceof 817
    //   152: ifeq +8 -> 160
    //   155: aload_2
    //   156: checkcast 817	bsh/ParseException
    //   159: athrow
    //   160: aload_2
    //   161: checkcast 867	java/lang/Error
    //   164: athrow
    //   165: astore 4
    //   167: iload_3
    //   168: ifeq +17 -> 185
    //   171: aload_0
    //   172: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   175: aload_1
    //   176: iconst_1
    //   177: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   180: aload_0
    //   181: aload_1
    //   182: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   185: aload 4
    //   187: athrow
    //   188: iload 6
    //   190: bipush 11
    //   192: if_icmpeq -136 -> 56
    //   195: iload 6
    //   197: bipush 14
    //   199: if_icmpeq -143 -> 56
    //   202: iload 6
    //   204: bipush 17
    //   206: if_icmpeq -150 -> 56
    //   209: iload 6
    //   211: bipush 22
    //   213: if_icmpeq -157 -> 56
    //   216: iload 6
    //   218: bipush 29
    //   220: if_icmpeq -164 -> 56
    //   223: iload 6
    //   225: bipush 36
    //   227: if_icmpeq -171 -> 56
    //   230: iload 6
    //   232: bipush 38
    //   234: if_icmpeq -178 -> 56
    //   237: iload 6
    //   239: bipush 47
    //   241: if_icmpeq -185 -> 56
    //   244: iload 6
    //   246: bipush 69
    //   248: if_icmpeq -192 -> 56
    //   251: goto -165 -> 86
    //   254: iload 7
    //   256: bipush 79
    //   258: if_icmpeq -150 -> 108
    //   261: goto -175 -> 86
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	264	0	this	Parser
    //   9	173	1	localBSHFormalParameters	BSHFormalParameters
    //   125	36	2	localThrowable	Throwable
    //   121	47	3	j	int
    //   118	1	4	localObject1	Object
    //   165	21	4	localObject2	Object
    //   42	207	6	k	int
    //   72	187	7	m	int
    // Exception table:
    //   from	to	target	type
    //   23	44	118	finally
    //   47	53	118	finally
    //   56	74	118	finally
    //   77	83	118	finally
    //   86	93	118	finally
    //   108	115	118	finally
    //   126	134	118	finally
    //   23	44	125	java/lang/Throwable
    //   47	53	125	java/lang/Throwable
    //   56	74	125	java/lang/Throwable
    //   77	83	125	java/lang/Throwable
    //   86	93	125	java/lang/Throwable
    //   108	115	125	java/lang/Throwable
    //   136	148	165	finally
    //   148	160	165	finally
    //   160	165	165	finally
  }
  
  /* Error */
  public final void IfStatement()
  {
    // Byte code:
    //   0: new 1128	bsh/BSHIfStatement
    //   3: dup
    //   4: bipush 29
    //   6: invokespecial 1129	bsh/BSHIfStatement:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: bipush 32
    //   26: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   29: pop
    //   30: aload_0
    //   31: bipush 72
    //   33: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   36: pop
    //   37: aload_0
    //   38: invokevirtual 901	bsh/Parser:Expression	()V
    //   41: aload_0
    //   42: bipush 73
    //   44: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   47: pop
    //   48: aload_0
    //   49: invokevirtual 979	bsh/Parser:Statement	()V
    //   52: aload_0
    //   53: getfield 58	bsh/Parser:d	I
    //   56: iconst_m1
    //   57: if_icmpne +12 -> 69
    //   60: aload_0
    //   61: invokespecial 813	bsh/Parser:dq	()I
    //   64: istore 8
    //   66: goto +108 -> 174
    //   69: aload_0
    //   70: getfield 58	bsh/Parser:d	I
    //   73: istore 8
    //   75: goto +99 -> 174
    //   78: aload_0
    //   79: bipush 23
    //   81: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   84: pop
    //   85: aload_0
    //   86: invokevirtual 979	bsh/Parser:Statement	()V
    //   89: aload_0
    //   90: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   93: aload_1
    //   94: iconst_1
    //   95: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   98: aload_0
    //   99: aload_1
    //   100: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   103: return
    //   104: astore 4
    //   106: iconst_1
    //   107: istore_3
    //   108: goto +45 -> 153
    //   111: astore_2
    //   112: aload_0
    //   113: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   116: aload_1
    //   117: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   120: iconst_0
    //   121: istore_3
    //   122: aload_2
    //   123: instanceof 865
    //   126: ifeq +8 -> 134
    //   129: aload_2
    //   130: checkcast 865	java/lang/RuntimeException
    //   133: athrow
    //   134: aload_2
    //   135: instanceof 817
    //   138: ifeq +8 -> 146
    //   141: aload_2
    //   142: checkcast 817	bsh/ParseException
    //   145: athrow
    //   146: aload_2
    //   147: checkcast 867	java/lang/Error
    //   150: athrow
    //   151: astore 4
    //   153: iload_3
    //   154: ifeq +17 -> 171
    //   157: aload_0
    //   158: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   161: aload_1
    //   162: iconst_1
    //   163: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   166: aload_0
    //   167: aload_1
    //   168: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   171: aload 4
    //   173: athrow
    //   174: iload 8
    //   176: bipush 23
    //   178: if_icmpeq -100 -> 78
    //   181: goto -92 -> 89
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	this	Parser
    //   9	159	1	localBSHIfStatement	BSHIfStatement
    //   111	36	2	localThrowable	Throwable
    //   107	47	3	j	int
    //   104	1	4	localObject1	Object
    //   151	21	4	localObject2	Object
    //   64	115	8	k	int
    // Exception table:
    //   from	to	target	type
    //   23	66	104	finally
    //   69	75	104	finally
    //   78	89	104	finally
    //   112	120	104	finally
    //   23	66	111	java/lang/Throwable
    //   69	75	111	java/lang/Throwable
    //   78	89	111	java/lang/Throwable
    //   122	134	151	finally
    //   134	146	151	finally
    //   146	151	151	finally
  }
  
  /* Error */
  public final void ImportDeclaration()
  {
    // Byte code:
    //   0: new 1131	bsh/BSHImportDeclaration
    //   3: dup
    //   4: iconst_4
    //   5: invokespecial 1132	bsh/BSHImportDeclaration:<init>	(I)V
    //   8: astore_1
    //   9: aload_0
    //   10: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   13: aload_1
    //   14: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   22: iconst_0
    //   23: istore_2
    //   24: aload_0
    //   25: iconst_3
    //   26: invokespecial 1134	bsh/Parser:c	(I)Z
    //   29: ifeq +135 -> 164
    //   32: aload_0
    //   33: getfield 58	bsh/Parser:d	I
    //   36: iconst_m1
    //   37: if_icmpne +12 -> 49
    //   40: aload_0
    //   41: invokespecial 813	bsh/Parser:dq	()I
    //   44: istore 12
    //   46: goto +302 -> 348
    //   49: aload_0
    //   50: getfield 58	bsh/Parser:d	I
    //   53: istore 12
    //   55: goto +293 -> 348
    //   58: aload_0
    //   59: bipush 48
    //   61: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   64: astore 13
    //   66: aload_0
    //   67: bipush 34
    //   69: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   72: pop
    //   73: aload_0
    //   74: invokevirtual 851	bsh/Parser:AmbiguousName	()V
    //   77: aload_0
    //   78: getfield 58	bsh/Parser:d	I
    //   81: iconst_m1
    //   82: if_icmpne +12 -> 94
    //   85: aload_0
    //   86: invokespecial 813	bsh/Parser:dq	()I
    //   89: istore 15
    //   91: goto +270 -> 361
    //   94: aload_0
    //   95: getfield 58	bsh/Parser:d	I
    //   98: istore 15
    //   100: goto +261 -> 361
    //   103: aload_0
    //   104: bipush 80
    //   106: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   109: astore 16
    //   111: aload_0
    //   112: bipush 104
    //   114: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   117: pop
    //   118: aload_0
    //   119: bipush 78
    //   121: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   124: pop
    //   125: aload_0
    //   126: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   129: aload_1
    //   130: iconst_1
    //   131: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   134: aload_0
    //   135: aload_1
    //   136: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   139: iconst_0
    //   140: istore_2
    //   141: aload 13
    //   143: ifnull +8 -> 151
    //   146: aload_1
    //   147: iconst_1
    //   148: putfield 1137	bsh/BSHImportDeclaration:staticImport	Z
    //   151: iconst_0
    //   152: istore_2
    //   153: aload 16
    //   155: ifnull +93 -> 248
    //   158: aload_1
    //   159: iconst_1
    //   160: putfield 1140	bsh/BSHImportDeclaration:importPackage	Z
    //   163: return
    //   164: aload_0
    //   165: getfield 58	bsh/Parser:d	I
    //   168: iconst_m1
    //   169: if_icmpne +12 -> 181
    //   172: aload_0
    //   173: invokespecial 813	bsh/Parser:dq	()I
    //   176: istore 7
    //   178: goto +9 -> 187
    //   181: aload_0
    //   182: getfield 58	bsh/Parser:d	I
    //   185: istore 7
    //   187: iload 7
    //   189: bipush 34
    //   191: if_icmpeq +17 -> 208
    //   194: aload_0
    //   195: iconst_m1
    //   196: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   199: pop
    //   200: new 817	bsh/ParseException
    //   203: dup
    //   204: invokespecial 818	bsh/ParseException:<init>	()V
    //   207: athrow
    //   208: aload_0
    //   209: bipush 34
    //   211: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   214: pop
    //   215: aload_0
    //   216: bipush 104
    //   218: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   221: pop
    //   222: aload_0
    //   223: bipush 78
    //   225: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   228: pop
    //   229: aload_0
    //   230: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   233: aload_1
    //   234: iconst_1
    //   235: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   238: aload_0
    //   239: aload_1
    //   240: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   243: aload_1
    //   244: iconst_1
    //   245: putfield 1143	bsh/BSHImportDeclaration:superImport	Z
    //   248: return
    //   249: astore_3
    //   250: iconst_0
    //   251: istore 4
    //   253: goto +14 -> 267
    //   256: astore 6
    //   258: iconst_1
    //   259: istore_2
    //   260: goto +67 -> 327
    //   263: astore_3
    //   264: iconst_1
    //   265: istore 4
    //   267: iload 4
    //   269: ifeq +16 -> 285
    //   272: aload_0
    //   273: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   276: aload_1
    //   277: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   280: iconst_0
    //   281: istore_2
    //   282: goto +14 -> 296
    //   285: aload_0
    //   286: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   289: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   292: pop
    //   293: iload 4
    //   295: istore_2
    //   296: aload_3
    //   297: instanceof 865
    //   300: ifeq +8 -> 308
    //   303: aload_3
    //   304: checkcast 865	java/lang/RuntimeException
    //   307: athrow
    //   308: aload_3
    //   309: instanceof 817
    //   312: ifeq +8 -> 320
    //   315: aload_3
    //   316: checkcast 817	bsh/ParseException
    //   319: athrow
    //   320: aload_3
    //   321: checkcast 867	java/lang/Error
    //   324: athrow
    //   325: astore 6
    //   327: iload_2
    //   328: ifeq +17 -> 345
    //   331: aload_0
    //   332: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   335: aload_1
    //   336: iconst_1
    //   337: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   340: aload_0
    //   341: aload_1
    //   342: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   345: aload 6
    //   347: athrow
    //   348: iload 12
    //   350: bipush 48
    //   352: if_icmpeq -294 -> 58
    //   355: aconst_null
    //   356: astore 13
    //   358: goto -292 -> 66
    //   361: iload 15
    //   363: bipush 80
    //   365: if_icmpeq -262 -> 103
    //   368: aconst_null
    //   369: astore 16
    //   371: goto -253 -> 118
    //   374: astore 6
    //   376: iload 4
    //   378: istore_2
    //   379: goto -52 -> 327
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	382	0	this	Parser
    //   8	334	1	localBSHImportDeclaration	BSHImportDeclaration
    //   23	356	2	j	int
    //   249	1	3	localThrowable1	Throwable
    //   263	58	3	localThrowable2	Throwable
    //   251	126	4	k	int
    //   256	1	6	localObject1	Object
    //   325	21	6	localObject2	Object
    //   374	1	6	localObject3	Object
    //   176	16	7	m	int
    //   44	309	12	n	int
    //   64	293	13	localToken1	Token
    //   89	277	15	i1	int
    //   109	261	16	localToken2	Token
    // Exception table:
    //   from	to	target	type
    //   134	139	249	java/lang/Throwable
    //   146	151	249	java/lang/Throwable
    //   158	163	249	java/lang/Throwable
    //   238	248	249	java/lang/Throwable
    //   24	46	256	finally
    //   49	55	256	finally
    //   58	66	256	finally
    //   66	91	256	finally
    //   94	100	256	finally
    //   103	118	256	finally
    //   118	134	256	finally
    //   164	178	256	finally
    //   181	187	256	finally
    //   194	208	256	finally
    //   208	238	256	finally
    //   24	46	263	java/lang/Throwable
    //   49	55	263	java/lang/Throwable
    //   58	66	263	java/lang/Throwable
    //   66	91	263	java/lang/Throwable
    //   94	100	263	java/lang/Throwable
    //   103	118	263	java/lang/Throwable
    //   118	134	263	java/lang/Throwable
    //   164	178	263	java/lang/Throwable
    //   181	187	263	java/lang/Throwable
    //   194	208	263	java/lang/Throwable
    //   208	238	263	java/lang/Throwable
    //   134	139	325	finally
    //   146	151	325	finally
    //   158	163	325	finally
    //   238	248	325	finally
    //   296	308	325	finally
    //   308	320	325	finally
    //   320	325	325	finally
    //   272	280	374	finally
    //   285	293	374	finally
  }
  
  public final void InclusiveOrExpression()
  {
    ExclusiveOrExpression();
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      switch (j)
      {
      default: 
        return;
      }
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      int m;
      switch (k)
      {
      default: 
        F(-1);
        throw new ParseException();
      case 109: 
        m = 109;
        break;
      case 108: 
        m = 108;
      }
      Token localToken = F(m);
      ExclusiveOrExpression();
      BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
      int n = 1;
      this.a.c(localBSHBinaryExpression);
      a(localBSHBinaryExpression);
      try
      {
        this.a.a(localBSHBinaryExpression, 2);
        n = 0;
        b(localBSHBinaryExpression);
        localBSHBinaryExpression.kind = localToken.kind;
      }
      finally
      {
        if (n != 0)
        {
          this.a.a(localBSHBinaryExpression, 2);
          b(localBSHBinaryExpression);
        }
      }
    }
  }
  
  public final void InstanceOfExpression()
  {
    RelationalExpression();
    int j;
    if (this.d == -1) {
      j = dq();
    } else {
      j = this.d;
    }
    if (j != 35) {
      return;
    }
    Token localToken = F(35);
    Type();
    BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
    int k = 1;
    this.a.c(localBSHBinaryExpression);
    a(localBSHBinaryExpression);
    try
    {
      this.a.a(localBSHBinaryExpression, 2);
      k = 0;
      b(localBSHBinaryExpression);
      localBSHBinaryExpression.kind = localToken.kind;
      return;
    }
    finally
    {
      if (k != 0)
      {
        this.a.a(localBSHBinaryExpression, 2);
        b(localBSHBinaryExpression);
      }
    }
  }
  
  public final void LabeledStatement()
  {
    F(69);
    F(89);
    Statement();
  }
  
  public final boolean Line()
  {
    int j;
    if (this.d == -1) {
      j = dq();
    } else {
      j = this.d;
    }
    if (j != 0)
    {
      if (a(1))
      {
        BlockStatement();
        return false;
      }
      F(-1);
      throw new ParseException();
    }
    F(0);
    Interpreter.debug("End of File!");
    return true;
  }
  
  /* Error */
  public final void Literal()
  {
    // Byte code:
    //   0: new 1164	bsh/BSHLiteral
    //   3: dup
    //   4: bipush 21
    //   6: invokespecial 1165	bsh/BSHLiteral:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: getfield 58	bsh/Parser:d	I
    //   29: iconst_m1
    //   30: if_icmpne +12 -> 42
    //   33: aload_0
    //   34: invokespecial 813	bsh/Parser:dq	()I
    //   37: istore 9
    //   39: goto +678 -> 717
    //   42: aload_0
    //   43: getfield 58	bsh/Parser:d	I
    //   46: istore 9
    //   48: goto +669 -> 717
    //   51: aload_0
    //   52: iconst_m1
    //   53: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   56: pop
    //   57: new 817	bsh/ParseException
    //   60: dup
    //   61: invokespecial 818	bsh/ParseException:<init>	()V
    //   64: athrow
    //   65: aload_0
    //   66: bipush 67
    //   68: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   71: astore 26
    //   73: aload_0
    //   74: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   77: aload_1
    //   78: iconst_1
    //   79: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   82: aload_0
    //   83: aload_1
    //   84: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   87: aload_1
    //   88: aload 26
    //   90: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   93: iconst_1
    //   94: aload 26
    //   96: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   99: invokevirtual 1168	java/lang/String:length	()I
    //   102: iconst_1
    //   103: isub
    //   104: invokevirtual 1172	java/lang/String:substring	(II)Ljava/lang/String;
    //   107: invokevirtual 1174	bsh/BSHLiteral:a	(Ljava/lang/String;)V
    //   110: return
    //   111: new 872	java/lang/StringBuffer
    //   114: dup
    //   115: invokespecial 880	java/lang/StringBuffer:<init>	()V
    //   118: astore 27
    //   120: aload 27
    //   122: ldc_w 1176
    //   125: invokevirtual 886	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   128: pop
    //   129: aload 27
    //   131: aload 26
    //   133: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   136: invokevirtual 886	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   139: pop
    //   140: aload_0
    //   141: aload 27
    //   143: invokevirtual 890	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   146: invokevirtual 1179	bsh/Parser:a	(Ljava/lang/String;)Lbsh/ParseException;
    //   149: athrow
    //   150: aload_0
    //   151: bipush 66
    //   153: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   156: astore 22
    //   158: aload_0
    //   159: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   162: aload_1
    //   163: iconst_1
    //   164: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   167: aload_0
    //   168: aload_1
    //   169: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   172: aload_1
    //   173: aload 22
    //   175: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   178: iconst_1
    //   179: aload 22
    //   181: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   184: invokevirtual 1168	java/lang/String:length	()I
    //   187: iconst_1
    //   188: isub
    //   189: invokevirtual 1172	java/lang/String:substring	(II)Ljava/lang/String;
    //   192: invokevirtual 1182	bsh/BSHLiteral:charSetup	(Ljava/lang/String;)V
    //   195: return
    //   196: new 872	java/lang/StringBuffer
    //   199: dup
    //   200: invokespecial 880	java/lang/StringBuffer:<init>	()V
    //   203: astore 23
    //   205: aload 23
    //   207: ldc_w 1184
    //   210: invokevirtual 886	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   213: pop
    //   214: aload 23
    //   216: aload 22
    //   218: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   221: invokevirtual 886	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   224: pop
    //   225: aload_0
    //   226: aload 23
    //   228: invokevirtual 890	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   231: invokevirtual 1179	bsh/Parser:a	(Ljava/lang/String;)Lbsh/ParseException;
    //   234: athrow
    //   235: aload_0
    //   236: bipush 64
    //   238: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   241: astore 19
    //   243: aload_0
    //   244: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   247: aload_1
    //   248: iconst_1
    //   249: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   252: aload_0
    //   253: aload_1
    //   254: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   257: aload 19
    //   259: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   262: astore 20
    //   264: aload 20
    //   266: aload 20
    //   268: invokevirtual 1168	java/lang/String:length	()I
    //   271: iconst_1
    //   272: isub
    //   273: invokevirtual 1188	java/lang/String:charAt	(I)C
    //   276: istore 21
    //   278: iload 21
    //   280: bipush 102
    //   282: if_icmpeq +56 -> 338
    //   285: iload 21
    //   287: bipush 70
    //   289: if_icmpne +495 -> 784
    //   292: goto +46 -> 338
    //   295: aload 20
    //   297: iconst_0
    //   298: aload 20
    //   300: invokevirtual 1168	java/lang/String:length	()I
    //   303: iconst_1
    //   304: isub
    //   305: invokevirtual 1172	java/lang/String:substring	(II)Ljava/lang/String;
    //   308: astore 20
    //   310: new 1190	bsh/Primitive
    //   313: dup
    //   314: new 1192	java/lang/Double
    //   317: dup
    //   318: aload 20
    //   320: invokespecial 1193	java/lang/Double:<init>	(Ljava/lang/String;)V
    //   323: invokevirtual 1197	java/lang/Double:doubleValue	()D
    //   326: invokespecial 1200	bsh/Primitive:<init>	(D)V
    //   329: astore 11
    //   331: aload_1
    //   332: aload 11
    //   334: putfield 1204	bsh/BSHLiteral:value	Ljava/lang/Object;
    //   337: return
    //   338: new 1190	bsh/Primitive
    //   341: dup
    //   342: new 1206	java/lang/Float
    //   345: dup
    //   346: aload 20
    //   348: iconst_0
    //   349: aload 20
    //   351: invokevirtual 1168	java/lang/String:length	()I
    //   354: iconst_1
    //   355: isub
    //   356: invokevirtual 1172	java/lang/String:substring	(II)Ljava/lang/String;
    //   359: invokespecial 1207	java/lang/Float:<init>	(Ljava/lang/String;)V
    //   362: invokevirtual 1211	java/lang/Float:floatValue	()F
    //   365: invokespecial 1214	bsh/Primitive:<init>	(F)V
    //   368: astore 11
    //   370: goto -39 -> 331
    //   373: aload_0
    //   374: bipush 60
    //   376: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   379: astore 13
    //   381: aload_0
    //   382: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   385: aload_1
    //   386: iconst_1
    //   387: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   390: aload_0
    //   391: aload_1
    //   392: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   395: aload 13
    //   397: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   400: astore 14
    //   402: aload 14
    //   404: aload 14
    //   406: invokevirtual 1168	java/lang/String:length	()I
    //   409: iconst_1
    //   410: isub
    //   411: invokevirtual 1188	java/lang/String:charAt	(I)C
    //   414: istore 15
    //   416: iload 15
    //   418: bipush 108
    //   420: if_icmpeq +69 -> 489
    //   423: iload 15
    //   425: bipush 76
    //   427: if_icmpne +6 -> 433
    //   430: goto +59 -> 489
    //   433: aload_1
    //   434: new 1190	bsh/Primitive
    //   437: dup
    //   438: aload 14
    //   440: invokestatic 1220	java/lang/Integer:decode	(Ljava/lang/String;)Ljava/lang/Integer;
    //   443: invokevirtual 1223	java/lang/Integer:intValue	()I
    //   446: invokespecial 1224	bsh/Primitive:<init>	(I)V
    //   449: putfield 1204	bsh/BSHLiteral:value	Ljava/lang/Object;
    //   452: return
    //   453: new 872	java/lang/StringBuffer
    //   456: dup
    //   457: invokespecial 880	java/lang/StringBuffer:<init>	()V
    //   460: astore 16
    //   462: aload 16
    //   464: ldc_w 1226
    //   467: invokevirtual 886	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   470: pop
    //   471: aload 16
    //   473: aload 14
    //   475: invokevirtual 886	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   478: pop
    //   479: aload_0
    //   480: aload 16
    //   482: invokevirtual 890	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   485: invokevirtual 1179	bsh/Parser:a	(Ljava/lang/String;)Lbsh/ParseException;
    //   488: athrow
    //   489: new 1190	bsh/Primitive
    //   492: dup
    //   493: new 1228	java/lang/Long
    //   496: dup
    //   497: aload 14
    //   499: iconst_0
    //   500: aload 14
    //   502: invokevirtual 1168	java/lang/String:length	()I
    //   505: iconst_1
    //   506: isub
    //   507: invokevirtual 1172	java/lang/String:substring	(II)Ljava/lang/String;
    //   510: invokespecial 1229	java/lang/Long:<init>	(Ljava/lang/String;)V
    //   513: invokevirtual 1233	java/lang/Long:longValue	()J
    //   516: invokespecial 1236	bsh/Primitive:<init>	(J)V
    //   519: astore 11
    //   521: goto -190 -> 331
    //   524: aload_0
    //   525: invokevirtual 1239	bsh/Parser:VoidLiteral	()V
    //   528: aload_0
    //   529: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   532: aload_1
    //   533: iconst_1
    //   534: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   537: aload_0
    //   538: aload_1
    //   539: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   542: getstatic 1243	bsh/Primitive:VOID	Lbsh/Primitive;
    //   545: astore 12
    //   547: aload_1
    //   548: aload 12
    //   550: putfield 1204	bsh/BSHLiteral:value	Ljava/lang/Object;
    //   553: return
    //   554: aload_0
    //   555: invokevirtual 1246	bsh/Parser:NullLiteral	()V
    //   558: aload_0
    //   559: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   562: aload_1
    //   563: iconst_1
    //   564: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   567: aload_0
    //   568: aload_1
    //   569: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   572: getstatic 1249	bsh/Primitive:NULL	Lbsh/Primitive;
    //   575: astore 12
    //   577: goto -30 -> 547
    //   580: aload_0
    //   581: invokevirtual 1251	bsh/Parser:BooleanLiteral	()Z
    //   584: istore 10
    //   586: aload_0
    //   587: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   590: aload_1
    //   591: iconst_1
    //   592: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   595: aload_0
    //   596: aload_1
    //   597: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   600: new 1190	bsh/Primitive
    //   603: dup
    //   604: iload 10
    //   606: invokespecial 1253	bsh/Primitive:<init>	(Z)V
    //   609: astore 11
    //   611: goto -280 -> 331
    //   614: astore_3
    //   615: iconst_0
    //   616: istore 4
    //   618: goto +18 -> 636
    //   621: astore 8
    //   623: aload 8
    //   625: astore 6
    //   627: iconst_1
    //   628: istore_2
    //   629: goto +67 -> 696
    //   632: astore_3
    //   633: iconst_1
    //   634: istore 4
    //   636: iload 4
    //   638: ifeq +16 -> 654
    //   641: aload_0
    //   642: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   645: aload_1
    //   646: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   649: iconst_0
    //   650: istore_2
    //   651: goto +14 -> 665
    //   654: aload_0
    //   655: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   658: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   661: pop
    //   662: iload 4
    //   664: istore_2
    //   665: aload_3
    //   666: instanceof 865
    //   669: ifeq +8 -> 677
    //   672: aload_3
    //   673: checkcast 865	java/lang/RuntimeException
    //   676: athrow
    //   677: aload_3
    //   678: instanceof 817
    //   681: ifeq +8 -> 689
    //   684: aload_3
    //   685: checkcast 817	bsh/ParseException
    //   688: athrow
    //   689: aload_3
    //   690: checkcast 867	java/lang/Error
    //   693: athrow
    //   694: astore 6
    //   696: iload_2
    //   697: ifeq +17 -> 714
    //   700: aload_0
    //   701: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   704: aload_1
    //   705: iconst_1
    //   706: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   709: aload_0
    //   710: aload_1
    //   711: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   714: aload 6
    //   716: athrow
    //   717: iload 9
    //   719: bipush 26
    //   721: if_icmpeq -141 -> 580
    //   724: iload 9
    //   726: bipush 41
    //   728: if_icmpeq -174 -> 554
    //   731: iload 9
    //   733: bipush 55
    //   735: if_icmpeq -155 -> 580
    //   738: iload 9
    //   740: bipush 57
    //   742: if_icmpeq -218 -> 524
    //   745: iload 9
    //   747: bipush 60
    //   749: if_icmpeq -376 -> 373
    //   752: iload 9
    //   754: bipush 64
    //   756: if_icmpeq -521 -> 235
    //   759: iload 9
    //   761: tableswitch	default:+-710->51, 66:+-611->150, 67:+-696->65
    //   784: iload 21
    //   786: bipush 100
    //   788: if_icmpeq -493 -> 295
    //   791: iload 21
    //   793: bipush 68
    //   795: if_icmpne -485 -> 310
    //   798: goto -503 -> 295
    //   801: astore 7
    //   803: aload 7
    //   805: astore 6
    //   807: iload 4
    //   809: istore_2
    //   810: goto -114 -> 696
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	813	0	this	Parser
    //   9	702	1	localBSHLiteral	BSHLiteral
    //   24	786	2	j	int
    //   614	1	3	localThrowable1	Throwable
    //   632	58	3	localThrowable2	Throwable
    //   616	192	4	k	int
    //   625	1	6	localObject1	Object
    //   694	21	6	localObject2	Object
    //   805	1	6	localObject3	Object
    //   801	3	7	localObject4	Object
    //   621	3	8	localObject5	Object
    //   37	723	9	m	int
    //   584	21	10	bool	boolean
    //   329	281	11	localPrimitive1	Primitive
    //   545	31	12	localPrimitive2	Primitive
    //   379	17	13	localToken1	Token
    //   400	101	14	str1	String
    //   414	14	15	n	int
    //   460	21	16	localStringBuffer1	StringBuffer
    //   241	17	19	localToken2	Token
    //   262	88	20	str2	String
    //   276	520	21	i1	int
    //   156	61	22	localToken3	Token
    //   203	24	23	localStringBuffer2	StringBuffer
    //   71	61	26	localToken4	Token
    //   111	1	26	localException1	Exception
    //   118	24	27	localStringBuffer3	StringBuffer
    //   196	1	27	localException2	Exception
    //   453	1	28	localNumberFormatException	NumberFormatException
    // Exception table:
    //   from	to	target	type
    //   87	110	111	java/lang/Exception
    //   172	195	196	java/lang/Exception
    //   433	452	453	java/lang/NumberFormatException
    //   82	87	614	java/lang/Throwable
    //   87	110	614	java/lang/Throwable
    //   111	150	614	java/lang/Throwable
    //   167	172	614	java/lang/Throwable
    //   172	195	614	java/lang/Throwable
    //   196	235	614	java/lang/Throwable
    //   252	278	614	java/lang/Throwable
    //   295	310	614	java/lang/Throwable
    //   310	331	614	java/lang/Throwable
    //   331	337	614	java/lang/Throwable
    //   338	370	614	java/lang/Throwable
    //   390	416	614	java/lang/Throwable
    //   433	452	614	java/lang/Throwable
    //   453	489	614	java/lang/Throwable
    //   489	521	614	java/lang/Throwable
    //   537	547	614	java/lang/Throwable
    //   547	553	614	java/lang/Throwable
    //   567	577	614	java/lang/Throwable
    //   595	611	614	java/lang/Throwable
    //   25	39	621	finally
    //   42	48	621	finally
    //   51	65	621	finally
    //   65	82	621	finally
    //   150	167	621	finally
    //   235	252	621	finally
    //   373	390	621	finally
    //   524	537	621	finally
    //   554	567	621	finally
    //   580	595	621	finally
    //   25	39	632	java/lang/Throwable
    //   42	48	632	java/lang/Throwable
    //   51	65	632	java/lang/Throwable
    //   65	82	632	java/lang/Throwable
    //   150	167	632	java/lang/Throwable
    //   235	252	632	java/lang/Throwable
    //   373	390	632	java/lang/Throwable
    //   524	537	632	java/lang/Throwable
    //   554	567	632	java/lang/Throwable
    //   580	595	632	java/lang/Throwable
    //   82	87	694	finally
    //   87	110	694	finally
    //   111	150	694	finally
    //   167	172	694	finally
    //   172	195	694	finally
    //   196	235	694	finally
    //   252	278	694	finally
    //   295	310	694	finally
    //   310	331	694	finally
    //   331	337	694	finally
    //   338	370	694	finally
    //   390	416	694	finally
    //   433	452	694	finally
    //   453	489	694	finally
    //   489	521	694	finally
    //   537	547	694	finally
    //   547	553	694	finally
    //   567	577	694	finally
    //   595	611	694	finally
    //   665	677	694	finally
    //   677	689	694	finally
    //   689	694	694	finally
    //   641	649	801	finally
    //   654	662	801	finally
  }
  
  /* Error */
  public final void MethodDeclaration()
  {
    // Byte code:
    //   0: new 1255	bsh/BSHMethodDeclaration
    //   3: dup
    //   4: iconst_2
    //   5: invokespecial 1256	bsh/BSHMethodDeclaration:<init>	(I)V
    //   8: astore_1
    //   9: aload_0
    //   10: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   13: aload_1
    //   14: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   22: aload_1
    //   23: aload_0
    //   24: iconst_1
    //   25: iconst_0
    //   26: invokevirtual 1024	bsh/Parser:Modifiers	(IZ)Lbsh/Modifiers;
    //   29: putfield 1259	bsh/BSHMethodDeclaration:modifiers	Lbsh/Modifiers;
    //   32: aload_0
    //   33: ldc_w 957
    //   36: invokespecial 1261	bsh/Parser:b	(I)Z
    //   39: ifeq +23 -> 62
    //   42: aload_0
    //   43: bipush 69
    //   45: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   48: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   51: astore 7
    //   53: aload_1
    //   54: aload 7
    //   56: putfield 1262	bsh/BSHMethodDeclaration:name	Ljava/lang/String;
    //   59: goto +128 -> 187
    //   62: aload_0
    //   63: getfield 58	bsh/Parser:d	I
    //   66: iconst_m1
    //   67: if_icmpne +12 -> 79
    //   70: aload_0
    //   71: invokespecial 813	bsh/Parser:dq	()I
    //   74: istore 6
    //   76: goto +9 -> 85
    //   79: aload_0
    //   80: getfield 58	bsh/Parser:d	I
    //   83: istore 6
    //   85: iload 6
    //   87: bipush 11
    //   89: if_icmpeq +80 -> 169
    //   92: iload 6
    //   94: bipush 14
    //   96: if_icmpeq +73 -> 169
    //   99: iload 6
    //   101: bipush 17
    //   103: if_icmpeq +66 -> 169
    //   106: iload 6
    //   108: bipush 22
    //   110: if_icmpeq +59 -> 169
    //   113: iload 6
    //   115: bipush 29
    //   117: if_icmpeq +52 -> 169
    //   120: iload 6
    //   122: bipush 36
    //   124: if_icmpeq +45 -> 169
    //   127: iload 6
    //   129: bipush 38
    //   131: if_icmpeq +38 -> 169
    //   134: iload 6
    //   136: bipush 47
    //   138: if_icmpeq +31 -> 169
    //   141: iload 6
    //   143: bipush 57
    //   145: if_icmpeq +24 -> 169
    //   148: iload 6
    //   150: bipush 69
    //   152: if_icmpeq +17 -> 169
    //   155: aload_0
    //   156: iconst_m1
    //   157: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   160: pop
    //   161: new 817	bsh/ParseException
    //   164: dup
    //   165: invokespecial 818	bsh/ParseException:<init>	()V
    //   168: athrow
    //   169: aload_0
    //   170: invokevirtual 1265	bsh/Parser:ReturnType	()V
    //   173: aload_0
    //   174: bipush 69
    //   176: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   179: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   182: astore 7
    //   184: goto -131 -> 53
    //   187: aload_0
    //   188: invokevirtual 1267	bsh/Parser:FormalParameters	()V
    //   191: aload_0
    //   192: getfield 58	bsh/Parser:d	I
    //   195: iconst_m1
    //   196: if_icmpne +12 -> 208
    //   199: aload_0
    //   200: invokespecial 813	bsh/Parser:dq	()I
    //   203: istore 8
    //   205: goto +182 -> 387
    //   208: aload_0
    //   209: getfield 58	bsh/Parser:d	I
    //   212: istore 8
    //   214: goto +173 -> 387
    //   217: aload_0
    //   218: bipush 54
    //   220: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   223: pop
    //   224: aload_1
    //   225: aload_0
    //   226: invokevirtual 1031	bsh/Parser:NameList	()I
    //   229: putfield 1269	bsh/BSHMethodDeclaration:f	I
    //   232: aload_0
    //   233: getfield 58	bsh/Parser:d	I
    //   236: iconst_m1
    //   237: if_icmpne +12 -> 249
    //   240: aload_0
    //   241: invokespecial 813	bsh/Parser:dq	()I
    //   244: istore 10
    //   246: goto +9 -> 255
    //   249: aload_0
    //   250: getfield 58	bsh/Parser:d	I
    //   253: istore 10
    //   255: iload 10
    //   257: bipush 74
    //   259: if_icmpeq +34 -> 293
    //   262: iload 10
    //   264: bipush 78
    //   266: if_icmpeq +17 -> 283
    //   269: aload_0
    //   270: iconst_m1
    //   271: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   274: pop
    //   275: new 817	bsh/ParseException
    //   278: dup
    //   279: invokespecial 818	bsh/ParseException:<init>	()V
    //   282: athrow
    //   283: aload_0
    //   284: bipush 78
    //   286: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   289: pop
    //   290: goto +7 -> 297
    //   293: aload_0
    //   294: invokevirtual 859	bsh/Parser:Block	()V
    //   297: aload_0
    //   298: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   301: aload_1
    //   302: iconst_1
    //   303: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   306: aload_0
    //   307: aload_1
    //   308: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   311: return
    //   312: astore 4
    //   314: iconst_1
    //   315: istore 5
    //   317: goto +48 -> 365
    //   320: astore_2
    //   321: aload_0
    //   322: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   325: aload_1
    //   326: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   329: aload_2
    //   330: instanceof 865
    //   333: ifeq +8 -> 341
    //   336: aload_2
    //   337: checkcast 865	java/lang/RuntimeException
    //   340: athrow
    //   341: aload_2
    //   342: instanceof 817
    //   345: ifeq +8 -> 353
    //   348: aload_2
    //   349: checkcast 817	bsh/ParseException
    //   352: athrow
    //   353: aload_2
    //   354: checkcast 867	java/lang/Error
    //   357: athrow
    //   358: astore_3
    //   359: aload_3
    //   360: astore 4
    //   362: iconst_0
    //   363: istore 5
    //   365: iload 5
    //   367: ifeq +17 -> 384
    //   370: aload_0
    //   371: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   374: aload_1
    //   375: iconst_1
    //   376: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   379: aload_0
    //   380: aload_1
    //   381: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   384: aload 4
    //   386: athrow
    //   387: iload 8
    //   389: bipush 54
    //   391: if_icmpeq -174 -> 217
    //   394: goto -162 -> 232
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	397	0	this	Parser
    //   8	373	1	localBSHMethodDeclaration	BSHMethodDeclaration
    //   320	34	2	localThrowable	Throwable
    //   358	2	3	localObject1	Object
    //   312	1	4	localObject2	Object
    //   360	25	4	localObject3	Object
    //   315	51	5	j	int
    //   74	79	6	k	int
    //   51	132	7	str	String
    //   203	189	8	m	int
    //   244	23	10	n	int
    // Exception table:
    //   from	to	target	type
    //   22	53	312	finally
    //   53	59	312	finally
    //   62	76	312	finally
    //   79	85	312	finally
    //   155	169	312	finally
    //   169	184	312	finally
    //   187	205	312	finally
    //   208	214	312	finally
    //   217	232	312	finally
    //   232	246	312	finally
    //   249	255	312	finally
    //   269	283	312	finally
    //   283	290	312	finally
    //   293	297	312	finally
    //   321	329	312	finally
    //   22	53	320	java/lang/Throwable
    //   53	59	320	java/lang/Throwable
    //   62	76	320	java/lang/Throwable
    //   79	85	320	java/lang/Throwable
    //   155	169	320	java/lang/Throwable
    //   169	184	320	java/lang/Throwable
    //   187	205	320	java/lang/Throwable
    //   208	214	320	java/lang/Throwable
    //   217	232	320	java/lang/Throwable
    //   232	246	320	java/lang/Throwable
    //   249	255	320	java/lang/Throwable
    //   269	283	320	java/lang/Throwable
    //   283	290	320	java/lang/Throwable
    //   293	297	320	java/lang/Throwable
    //   329	341	358	finally
    //   341	353	358	finally
    //   353	358	358	finally
  }
  
  /* Error */
  public final void MethodInvocation()
  {
    // Byte code:
    //   0: new 1272	bsh/BSHMethodInvocation
    //   3: dup
    //   4: bipush 19
    //   6: invokespecial 1273	bsh/BSHMethodInvocation:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: invokevirtual 851	bsh/Parser:AmbiguousName	()V
    //   27: aload_0
    //   28: invokevirtual 854	bsh/Parser:Arguments	()V
    //   31: aload_0
    //   32: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   35: aload_1
    //   36: iconst_1
    //   37: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   40: aload_0
    //   41: aload_1
    //   42: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   45: return
    //   46: astore 4
    //   48: iconst_1
    //   49: istore_3
    //   50: goto +45 -> 95
    //   53: astore_2
    //   54: aload_0
    //   55: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   58: aload_1
    //   59: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   62: iconst_0
    //   63: istore_3
    //   64: aload_2
    //   65: instanceof 865
    //   68: ifeq +8 -> 76
    //   71: aload_2
    //   72: checkcast 865	java/lang/RuntimeException
    //   75: athrow
    //   76: aload_2
    //   77: instanceof 817
    //   80: ifeq +8 -> 88
    //   83: aload_2
    //   84: checkcast 817	bsh/ParseException
    //   87: athrow
    //   88: aload_2
    //   89: checkcast 867	java/lang/Error
    //   92: athrow
    //   93: astore 4
    //   95: iload_3
    //   96: ifeq +17 -> 113
    //   99: aload_0
    //   100: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   103: aload_1
    //   104: iconst_1
    //   105: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   108: aload_0
    //   109: aload_1
    //   110: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   113: aload 4
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	Parser
    //   9	101	1	localBSHMethodInvocation	BSHMethodInvocation
    //   53	36	2	localThrowable	Throwable
    //   49	47	3	j	int
    //   46	1	4	localObject1	Object
    //   93	21	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   23	31	46	finally
    //   54	62	46	finally
    //   23	31	53	java/lang/Throwable
    //   64	76	93	finally
    //   76	88	93	finally
    //   88	93	93	finally
  }
  
  public final Modifiers Modifiers(int paramInt, boolean paramBoolean)
  {
    Modifiers localModifiers = null;
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      switch (j)
      {
      default: 
        return localModifiers;
      }
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      int m;
      switch (k)
      {
      default: 
        F(-1);
        throw new ParseException();
      case 58: 
        m = 58;
        break;
      case 52: 
        m = 52;
        break;
      case 51: 
        m = 51;
        break;
      case 49: 
        m = 49;
        break;
      case 48: 
        m = 48;
        break;
      case 45: 
        m = 45;
        break;
      case 44: 
        m = 44;
        break;
      case 43: 
        m = 43;
        break;
      case 39: 
        m = 39;
        break;
      case 27: 
        m = 27;
        break;
      case 10: 
        m = 10;
      }
      F(m);
      if (!paramBoolean) {
        if (localModifiers != null) {}
      }
      try
      {
        localModifiers = new Modifiers();
        localModifiers.addModifier(paramInt, getToken(0).image);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        Object localObject;
        for (;;) {}
      }
    }
    throw a(((IllegalStateException)localObject).getMessage());
  }
  
  public final void MultiplicativeExpression()
  {
    UnaryExpression();
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      if (j != 111) {
        switch (j)
        {
        default: 
          return;
        }
      }
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      Token localToken;
      if (k != 111)
      {
        int n;
        switch (k)
        {
        default: 
          F(-1);
          throw new ParseException();
        case 105: 
          n = 105;
          break;
        case 104: 
          n = 104;
        }
        localToken = F(n);
      }
      else
      {
        localToken = F(111);
      }
      UnaryExpression();
      BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
      int m = 1;
      this.a.c(localBSHBinaryExpression);
      a(localBSHBinaryExpression);
      try
      {
        this.a.a(localBSHBinaryExpression, 2);
        m = 0;
        b(localBSHBinaryExpression);
        localBSHBinaryExpression.kind = localToken.kind;
      }
      finally
      {
        if (m != 0)
        {
          this.a.a(localBSHBinaryExpression, 2);
          b(localBSHBinaryExpression);
        }
      }
    }
  }
  
  public final int NameList()
  {
    AmbiguousName();
    for (int j = 1;; j++)
    {
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      if (k != 79) {
        return j;
      }
      F(79);
      AmbiguousName();
    }
  }
  
  public final void NullLiteral()
  {
    F(41);
  }
  
  /* Error */
  public final void PackageDeclaration()
  {
    // Byte code:
    //   0: new 1287	bsh/BSHPackageDeclaration
    //   3: dup
    //   4: iconst_3
    //   5: invokespecial 1288	bsh/BSHPackageDeclaration:<init>	(I)V
    //   8: astore_1
    //   9: aload_0
    //   10: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   13: aload_1
    //   14: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   22: aload_0
    //   23: bipush 42
    //   25: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   28: pop
    //   29: aload_0
    //   30: invokevirtual 851	bsh/Parser:AmbiguousName	()V
    //   33: aload_0
    //   34: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   37: aload_1
    //   38: iconst_1
    //   39: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   42: aload_0
    //   43: aload_1
    //   44: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   47: return
    //   48: astore 4
    //   50: iconst_1
    //   51: istore_3
    //   52: goto +45 -> 97
    //   55: astore_2
    //   56: aload_0
    //   57: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   60: aload_1
    //   61: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   64: iconst_0
    //   65: istore_3
    //   66: aload_2
    //   67: instanceof 865
    //   70: ifeq +8 -> 78
    //   73: aload_2
    //   74: checkcast 865	java/lang/RuntimeException
    //   77: athrow
    //   78: aload_2
    //   79: instanceof 817
    //   82: ifeq +8 -> 90
    //   85: aload_2
    //   86: checkcast 817	bsh/ParseException
    //   89: athrow
    //   90: aload_2
    //   91: checkcast 867	java/lang/Error
    //   94: athrow
    //   95: astore 4
    //   97: iload_3
    //   98: ifeq +17 -> 115
    //   101: aload_0
    //   102: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   105: aload_1
    //   106: iconst_1
    //   107: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   110: aload_0
    //   111: aload_1
    //   112: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   115: aload 4
    //   117: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	this	Parser
    //   8	104	1	localBSHPackageDeclaration	BSHPackageDeclaration
    //   55	36	2	localThrowable	Throwable
    //   51	47	3	j	int
    //   48	1	4	localObject1	Object
    //   95	21	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   22	33	48	finally
    //   56	64	48	finally
    //   22	33	55	java/lang/Throwable
    //   66	78	95	finally
    //   78	90	95	finally
    //   90	95	95	finally
  }
  
  /* Error */
  public final void PostfixExpression()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 957
    //   4: invokespecial 1291	bsh/Parser:l	(I)Z
    //   7: ifeq +182 -> 189
    //   10: aload_0
    //   11: invokevirtual 939	bsh/Parser:PrimaryExpression	()V
    //   14: aload_0
    //   15: getfield 58	bsh/Parser:d	I
    //   18: iconst_m1
    //   19: if_icmpne +11 -> 30
    //   22: aload_0
    //   23: invokespecial 813	bsh/Parser:dq	()I
    //   26: istore_3
    //   27: goto +8 -> 35
    //   30: aload_0
    //   31: getfield 58	bsh/Parser:d	I
    //   34: istore_3
    //   35: iload_3
    //   36: tableswitch	default:+24->60, 100:+45->81, 101:+38->74
    //   60: aload_0
    //   61: iconst_m1
    //   62: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   65: pop
    //   66: new 817	bsh/ParseException
    //   69: dup
    //   70: invokespecial 818	bsh/ParseException:<init>	()V
    //   73: athrow
    //   74: bipush 101
    //   76: istore 4
    //   78: goto +7 -> 85
    //   81: bipush 100
    //   83: istore 4
    //   85: aload_0
    //   86: iload 4
    //   88: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   91: astore 5
    //   93: new 1293	bsh/BSHUnaryExpression
    //   96: dup
    //   97: bipush 16
    //   99: invokespecial 1294	bsh/BSHUnaryExpression:<init>	(I)V
    //   102: astore 6
    //   104: aload_0
    //   105: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   108: aload 6
    //   110: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   113: aload_0
    //   114: aload 6
    //   116: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   119: aload_0
    //   120: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   123: aload 6
    //   125: iconst_1
    //   126: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   129: aload_0
    //   130: aload 6
    //   132: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   135: aload 6
    //   137: aload 5
    //   139: getfield 131	bsh/Token:kind	I
    //   142: putfield 1295	bsh/BSHUnaryExpression:kind	I
    //   145: aload 6
    //   147: iconst_1
    //   148: putfield 1298	bsh/BSHUnaryExpression:postfix	Z
    //   151: return
    //   152: astore 7
    //   154: iconst_0
    //   155: istore 8
    //   157: goto +8 -> 165
    //   160: astore 7
    //   162: iconst_1
    //   163: istore 8
    //   165: iload 8
    //   167: ifeq +19 -> 186
    //   170: aload_0
    //   171: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   174: aload 6
    //   176: iconst_1
    //   177: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   180: aload_0
    //   181: aload 6
    //   183: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   186: aload 7
    //   188: athrow
    //   189: aload_0
    //   190: getfield 58	bsh/Parser:d	I
    //   193: iconst_m1
    //   194: if_icmpne +11 -> 205
    //   197: aload_0
    //   198: invokespecial 813	bsh/Parser:dq	()I
    //   201: istore_1
    //   202: goto +8 -> 210
    //   205: aload_0
    //   206: getfield 58	bsh/Parser:d	I
    //   209: istore_1
    //   210: iload_1
    //   211: lookupswitch	default:+161->372, 11:+175->386, 14:+175->386, 17:+175->386, 22:+175->386, 26:+175->386, 29:+175->386, 36:+175->386, 38:+175->386, 40:+175->386, 41:+175->386, 47:+175->386, 55:+175->386, 57:+175->386, 60:+175->386, 64:+175->386, 66:+175->386, 67:+175->386, 69:+175->386, 72:+175->386
    //   372: aload_0
    //   373: iconst_m1
    //   374: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   377: pop
    //   378: new 817	bsh/ParseException
    //   381: dup
    //   382: invokespecial 818	bsh/ParseException:<init>	()V
    //   385: athrow
    //   386: aload_0
    //   387: invokevirtual 939	bsh/Parser:PrimaryExpression	()V
    //   390: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	391	0	this	Parser
    //   201	10	1	j	int
    //   26	10	3	k	int
    //   76	11	4	m	int
    //   91	47	5	localToken	Token
    //   102	80	6	localBSHUnaryExpression	BSHUnaryExpression
    //   152	1	7	localObject1	Object
    //   160	27	7	localObject2	Object
    //   155	11	8	n	int
    // Exception table:
    //   from	to	target	type
    //   129	151	152	finally
    //   119	129	160	finally
  }
  
  /* Error */
  public final void PreDecrementExpression()
  {
    // Byte code:
    //   0: aload_0
    //   1: bipush 101
    //   3: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   6: astore_1
    //   7: aload_0
    //   8: invokevirtual 939	bsh/Parser:PrimaryExpression	()V
    //   11: new 1293	bsh/BSHUnaryExpression
    //   14: dup
    //   15: bipush 16
    //   17: invokespecial 1294	bsh/BSHUnaryExpression:<init>	(I)V
    //   20: astore_2
    //   21: aload_0
    //   22: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   25: aload_2
    //   26: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   29: aload_0
    //   30: aload_2
    //   31: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   34: aload_0
    //   35: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   38: aload_2
    //   39: iconst_1
    //   40: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   43: aload_0
    //   44: aload_2
    //   45: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   48: aload_2
    //   49: aload_1
    //   50: getfield 131	bsh/Token:kind	I
    //   53: putfield 1295	bsh/BSHUnaryExpression:kind	I
    //   56: return
    //   57: astore_3
    //   58: iconst_0
    //   59: istore 4
    //   61: goto +7 -> 68
    //   64: astore_3
    //   65: iconst_1
    //   66: istore 4
    //   68: iload 4
    //   70: ifeq +17 -> 87
    //   73: aload_0
    //   74: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   77: aload_2
    //   78: iconst_1
    //   79: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   82: aload_0
    //   83: aload_2
    //   84: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   87: aload_3
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	Parser
    //   6	44	1	localToken	Token
    //   20	64	2	localBSHUnaryExpression	BSHUnaryExpression
    //   57	1	3	localObject1	Object
    //   64	24	3	localObject2	Object
    //   59	10	4	j	int
    // Exception table:
    //   from	to	target	type
    //   43	56	57	finally
    //   34	43	64	finally
  }
  
  /* Error */
  public final void PreIncrementExpression()
  {
    // Byte code:
    //   0: aload_0
    //   1: bipush 100
    //   3: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   6: astore_1
    //   7: aload_0
    //   8: invokevirtual 939	bsh/Parser:PrimaryExpression	()V
    //   11: new 1293	bsh/BSHUnaryExpression
    //   14: dup
    //   15: bipush 16
    //   17: invokespecial 1294	bsh/BSHUnaryExpression:<init>	(I)V
    //   20: astore_2
    //   21: aload_0
    //   22: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   25: aload_2
    //   26: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   29: aload_0
    //   30: aload_2
    //   31: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   34: aload_0
    //   35: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   38: aload_2
    //   39: iconst_1
    //   40: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   43: aload_0
    //   44: aload_2
    //   45: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   48: aload_2
    //   49: aload_1
    //   50: getfield 131	bsh/Token:kind	I
    //   53: putfield 1295	bsh/BSHUnaryExpression:kind	I
    //   56: return
    //   57: astore_3
    //   58: iconst_0
    //   59: istore 4
    //   61: goto +7 -> 68
    //   64: astore_3
    //   65: iconst_1
    //   66: istore 4
    //   68: iload 4
    //   70: ifeq +17 -> 87
    //   73: aload_0
    //   74: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   77: aload_2
    //   78: iconst_1
    //   79: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   82: aload_0
    //   83: aload_2
    //   84: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   87: aload_3
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	Parser
    //   6	44	1	localToken	Token
    //   20	64	2	localBSHUnaryExpression	BSHUnaryExpression
    //   57	1	3	localObject1	Object
    //   64	24	3	localObject2	Object
    //   59	10	4	j	int
    // Exception table:
    //   from	to	target	type
    //   43	56	57	finally
    //   34	43	64	finally
  }
  
  /* Error */
  public final void PrimaryExpression()
  {
    // Byte code:
    //   0: new 1302	bsh/BSHPrimaryExpression
    //   3: dup
    //   4: bipush 18
    //   6: invokespecial 1303	bsh/BSHPrimaryExpression:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: invokevirtual 1306	bsh/Parser:PrimaryPrefix	()V
    //   27: aload_0
    //   28: getfield 58	bsh/Parser:d	I
    //   31: iconst_m1
    //   32: if_icmpne +12 -> 44
    //   35: aload_0
    //   36: invokespecial 813	bsh/Parser:dq	()I
    //   39: istore 5
    //   41: goto +9 -> 50
    //   44: aload_0
    //   45: getfield 58	bsh/Parser:d	I
    //   48: istore 5
    //   50: iload 5
    //   52: bipush 74
    //   54: if_icmpeq +32 -> 86
    //   57: iload 5
    //   59: bipush 76
    //   61: if_icmpeq +25 -> 86
    //   64: iload 5
    //   66: bipush 80
    //   68: if_icmpeq +18 -> 86
    //   71: aload_0
    //   72: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   75: aload_1
    //   76: iconst_1
    //   77: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   80: aload_0
    //   81: aload_1
    //   82: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   85: return
    //   86: aload_0
    //   87: invokevirtual 1309	bsh/Parser:PrimarySuffix	()V
    //   90: goto -63 -> 27
    //   93: astore 4
    //   95: iconst_1
    //   96: istore_3
    //   97: goto +45 -> 142
    //   100: astore_2
    //   101: aload_0
    //   102: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   105: aload_1
    //   106: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   109: iconst_0
    //   110: istore_3
    //   111: aload_2
    //   112: instanceof 865
    //   115: ifeq +8 -> 123
    //   118: aload_2
    //   119: checkcast 865	java/lang/RuntimeException
    //   122: athrow
    //   123: aload_2
    //   124: instanceof 817
    //   127: ifeq +8 -> 135
    //   130: aload_2
    //   131: checkcast 817	bsh/ParseException
    //   134: athrow
    //   135: aload_2
    //   136: checkcast 867	java/lang/Error
    //   139: athrow
    //   140: astore 4
    //   142: iload_3
    //   143: ifeq +17 -> 160
    //   146: aload_0
    //   147: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   150: aload_1
    //   151: iconst_1
    //   152: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   155: aload_0
    //   156: aload_1
    //   157: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   160: aload 4
    //   162: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	this	Parser
    //   9	148	1	localBSHPrimaryExpression	BSHPrimaryExpression
    //   100	36	2	localThrowable	Throwable
    //   96	47	3	j	int
    //   93	1	4	localObject1	Object
    //   140	21	4	localObject2	Object
    //   39	30	5	k	int
    // Exception table:
    //   from	to	target	type
    //   23	27	93	finally
    //   27	41	93	finally
    //   44	50	93	finally
    //   86	90	93	finally
    //   101	109	93	finally
    //   23	27	100	java/lang/Throwable
    //   27	41	100	java/lang/Throwable
    //   44	50	100	java/lang/Throwable
    //   86	90	100	java/lang/Throwable
    //   111	123	140	finally
    //   123	135	140	finally
    //   135	140	140	finally
  }
  
  public final void PrimaryPrefix()
  {
    int j;
    if (this.d == -1) {
      j = dq();
    } else {
      j = this.d;
    }
    switch (j)
    {
    default: 
      if (n(Integer.MAX_VALUE))
      {
        MethodInvocation();
        return;
      }
      break;
    case 72: 
      F(72);
      Expression();
      F(73);
      return;
    case 40: 
      AllocationExpression();
      return;
    case 26: 
    case 41: 
    case 55: 
    case 57: 
    case 60: 
    case 64: 
    case 66: 
    case 67: 
      Literal();
      return;
    }
    if (o(Integer.MAX_VALUE))
    {
      Type();
      return;
    }
    int k;
    if (this.d == -1) {
      k = dq();
    } else {
      k = this.d;
    }
    if (k != 69)
    {
      F(-1);
      throw new ParseException();
    }
    AmbiguousName();
  }
  
  /* Error */
  public final void PrimarySuffix()
  {
    // Byte code:
    //   0: new 1319	bsh/BSHPrimarySuffix
    //   3: dup
    //   4: bipush 20
    //   6: invokespecial 1320	bsh/BSHPrimarySuffix:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: iconst_2
    //   27: invokespecial 1322	bsh/Parser:p	(I)Z
    //   30: ifeq +44 -> 74
    //   33: aload_0
    //   34: bipush 80
    //   36: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   39: pop
    //   40: aload_0
    //   41: bipush 13
    //   43: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   46: pop
    //   47: aload_0
    //   48: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   51: aload_1
    //   52: iconst_1
    //   53: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   56: aload_0
    //   57: aload_1
    //   58: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   61: aload_1
    //   62: iconst_0
    //   63: putfield 1325	bsh/BSHPrimarySuffix:operation	I
    //   66: return
    //   67: astore_3
    //   68: iconst_0
    //   69: istore 4
    //   71: goto +222 -> 293
    //   74: aload_0
    //   75: getfield 58	bsh/Parser:d	I
    //   78: iconst_m1
    //   79: if_icmpne +12 -> 91
    //   82: aload_0
    //   83: invokespecial 813	bsh/Parser:dq	()I
    //   86: istore 7
    //   88: goto +9 -> 97
    //   91: aload_0
    //   92: getfield 58	bsh/Parser:d	I
    //   95: istore 7
    //   97: iload 7
    //   99: bipush 74
    //   101: if_icmpeq +143 -> 244
    //   104: iload 7
    //   106: bipush 76
    //   108: if_icmpeq +98 -> 206
    //   111: iload 7
    //   113: bipush 80
    //   115: if_icmpeq +17 -> 132
    //   118: aload_0
    //   119: iconst_m1
    //   120: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   123: pop
    //   124: new 817	bsh/ParseException
    //   127: dup
    //   128: invokespecial 818	bsh/ParseException:<init>	()V
    //   131: athrow
    //   132: aload_0
    //   133: bipush 80
    //   135: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   138: pop
    //   139: aload_0
    //   140: bipush 69
    //   142: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   145: astore 14
    //   147: aload_0
    //   148: getfield 58	bsh/Parser:d	I
    //   151: iconst_m1
    //   152: if_icmpne +12 -> 164
    //   155: aload_0
    //   156: invokespecial 813	bsh/Parser:dq	()I
    //   159: istore 15
    //   161: goto +213 -> 374
    //   164: aload_0
    //   165: getfield 58	bsh/Parser:d	I
    //   168: istore 15
    //   170: goto +204 -> 374
    //   173: aload_0
    //   174: invokevirtual 854	bsh/Parser:Arguments	()V
    //   177: aload_0
    //   178: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   181: aload_1
    //   182: iconst_1
    //   183: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   186: aload_0
    //   187: aload_1
    //   188: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   191: aload_1
    //   192: iconst_2
    //   193: putfield 1325	bsh/BSHPrimarySuffix:operation	I
    //   196: aload_1
    //   197: aload 14
    //   199: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   202: putfield 1328	bsh/BSHPrimarySuffix:field	Ljava/lang/String;
    //   205: return
    //   206: aload_0
    //   207: bipush 76
    //   209: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   212: pop
    //   213: aload_0
    //   214: invokevirtual 901	bsh/Parser:Expression	()V
    //   217: aload_0
    //   218: bipush 77
    //   220: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   223: pop
    //   224: aload_0
    //   225: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   228: aload_1
    //   229: iconst_1
    //   230: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   233: aload_0
    //   234: aload_1
    //   235: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   238: aload_1
    //   239: iconst_1
    //   240: putfield 1325	bsh/BSHPrimarySuffix:operation	I
    //   243: return
    //   244: aload_0
    //   245: bipush 74
    //   247: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   250: pop
    //   251: aload_0
    //   252: invokevirtual 901	bsh/Parser:Expression	()V
    //   255: aload_0
    //   256: bipush 75
    //   258: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   261: pop
    //   262: aload_0
    //   263: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   266: aload_1
    //   267: iconst_1
    //   268: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   271: aload_0
    //   272: aload_1
    //   273: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   276: aload_1
    //   277: iconst_3
    //   278: putfield 1325	bsh/BSHPrimarySuffix:operation	I
    //   281: return
    //   282: astore 6
    //   284: iconst_1
    //   285: istore_2
    //   286: goto +67 -> 353
    //   289: astore_3
    //   290: iconst_1
    //   291: istore 4
    //   293: iload 4
    //   295: ifeq +16 -> 311
    //   298: aload_0
    //   299: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   302: aload_1
    //   303: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   306: iconst_0
    //   307: istore_2
    //   308: goto +14 -> 322
    //   311: aload_0
    //   312: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   315: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   318: pop
    //   319: iload 4
    //   321: istore_2
    //   322: aload_3
    //   323: instanceof 865
    //   326: ifeq +8 -> 334
    //   329: aload_3
    //   330: checkcast 865	java/lang/RuntimeException
    //   333: athrow
    //   334: aload_3
    //   335: instanceof 817
    //   338: ifeq +8 -> 346
    //   341: aload_3
    //   342: checkcast 817	bsh/ParseException
    //   345: athrow
    //   346: aload_3
    //   347: checkcast 867	java/lang/Error
    //   350: athrow
    //   351: astore 6
    //   353: iload_2
    //   354: ifeq +17 -> 371
    //   357: aload_0
    //   358: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   361: aload_1
    //   362: iconst_1
    //   363: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   366: aload_0
    //   367: aload_1
    //   368: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   371: aload 6
    //   373: athrow
    //   374: iload 15
    //   376: bipush 72
    //   378: if_icmpeq -205 -> 173
    //   381: goto -204 -> 177
    //   384: astore 6
    //   386: iload 4
    //   388: istore_2
    //   389: goto -36 -> 353
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	392	0	this	Parser
    //   9	359	1	localBSHPrimarySuffix	BSHPrimarySuffix
    //   24	365	2	j	int
    //   67	1	3	localThrowable1	Throwable
    //   289	58	3	localThrowable2	Throwable
    //   69	318	4	k	int
    //   282	1	6	localObject1	Object
    //   351	21	6	localObject2	Object
    //   384	1	6	localObject3	Object
    //   86	30	7	m	int
    //   145	53	14	localToken	Token
    //   159	220	15	n	int
    // Exception table:
    //   from	to	target	type
    //   56	66	67	java/lang/Throwable
    //   186	205	67	java/lang/Throwable
    //   233	243	67	java/lang/Throwable
    //   271	281	67	java/lang/Throwable
    //   25	56	282	finally
    //   74	88	282	finally
    //   91	97	282	finally
    //   118	132	282	finally
    //   132	161	282	finally
    //   164	170	282	finally
    //   173	177	282	finally
    //   177	186	282	finally
    //   206	233	282	finally
    //   244	271	282	finally
    //   25	56	289	java/lang/Throwable
    //   74	88	289	java/lang/Throwable
    //   91	97	289	java/lang/Throwable
    //   118	132	289	java/lang/Throwable
    //   132	161	289	java/lang/Throwable
    //   164	170	289	java/lang/Throwable
    //   173	177	289	java/lang/Throwable
    //   177	186	289	java/lang/Throwable
    //   206	233	289	java/lang/Throwable
    //   244	271	289	java/lang/Throwable
    //   56	66	351	finally
    //   186	205	351	finally
    //   233	243	351	finally
    //   271	281	351	finally
    //   322	334	351	finally
    //   334	346	351	finally
    //   346	351	351	finally
    //   298	306	384	finally
    //   311	319	384	finally
  }
  
  public final void PrimitiveType()
  {
    BSHPrimitiveType localBSHPrimitiveType = new BSHPrimitiveType(11);
    this.a.c(localBSHPrimitiveType);
    a(localBSHPrimitiveType);
    try
    {
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      if (k != 11) {
        if (k != 14) {
          if (k != 17) {
            if (k != 22) {
              if (k != 29) {
                if (k != 36) {
                  if (k != 38)
                  {
                    if (k != 47)
                    {
                      F(-1);
                      throw new ParseException();
                    }
                    F(47);
                    this.a.a(localBSHPrimitiveType, true);
                  }
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        try
        {
          b(localBSHPrimitiveType);
          localClass = Short.TYPE;
          localBSHPrimitiveType.type = localClass;
          return;
        }
        finally
        {
          Class localClass;
          j = 0;
          break label361;
        }
        F(38);
        this.a.a(localBSHPrimitiveType, true);
        b(localBSHPrimitiveType);
        localClass = Long.TYPE;
        continue;
        F(36);
        this.a.a(localBSHPrimitiveType, true);
        b(localBSHPrimitiveType);
        localClass = Integer.TYPE;
        continue;
        F(29);
        this.a.a(localBSHPrimitiveType, true);
        b(localBSHPrimitiveType);
        localClass = Float.TYPE;
        continue;
        F(22);
        this.a.a(localBSHPrimitiveType, true);
        b(localBSHPrimitiveType);
        localClass = Double.TYPE;
        continue;
        F(17);
        this.a.a(localBSHPrimitiveType, true);
        b(localBSHPrimitiveType);
        localClass = Character.TYPE;
        continue;
        F(14);
        this.a.a(localBSHPrimitiveType, true);
        b(localBSHPrimitiveType);
        localClass = Byte.TYPE;
        continue;
        F(11);
        this.a.a(localBSHPrimitiveType, true);
        b(localBSHPrimitiveType);
        localClass = Boolean.TYPE;
      }
      int j;
      if (j == 0) {
        break label379;
      }
    }
    finally
    {
      j = 1;
    }
    label361:
    this.a.a(localBSHPrimitiveType, true);
    b(localBSHPrimitiveType);
    label379:
    throw ((Throwable)localObject2);
  }
  
  public void ReInit(ParserTokenManager paramParserTokenManager)
  {
    this.token_source = paramParserTokenManager;
    this.token = new Token();
    this.d = -1;
    this.a.a();
  }
  
  public void ReInit(InputStream paramInputStream)
  {
    this.c.ReInit(paramInputStream, 1, 1);
    this.token_source.ReInit(this.c);
    this.token = new Token();
    this.d = -1;
    this.a.a();
  }
  
  public void ReInit(Reader paramReader)
  {
    this.c.ReInit(paramReader, 1, 1);
    this.token_source.ReInit(this.c);
    this.token = new Token();
    this.d = -1;
    this.a.a();
  }
  
  public final void RelationalExpression()
  {
    ShiftExpression();
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      switch (j)
      {
      default: 
        switch (j)
        {
        default: 
          return;
        }
        break;
      }
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      int m;
      switch (k)
      {
      default: 
        switch (k)
        {
        default: 
          F(-1);
          throw new ParseException();
        case 94: 
          m = 94;
          break;
        case 93: 
          m = 93;
          break;
        case 92: 
          m = 92;
          break;
        case 91: 
          m = 91;
        }
        break;
      case 85: 
        m = 85;
        break;
      case 84: 
        m = 84;
        break;
      case 83: 
        m = 83;
        break;
      case 82: 
        m = 82;
      }
      Token localToken = F(m);
      ShiftExpression();
      BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
      int n = 1;
      this.a.c(localBSHBinaryExpression);
      a(localBSHBinaryExpression);
      try
      {
        this.a.a(localBSHBinaryExpression, 2);
        n = 0;
        b(localBSHBinaryExpression);
        localBSHBinaryExpression.kind = localToken.kind;
      }
      finally
      {
        if (n != 0)
        {
          this.a.a(localBSHBinaryExpression, 2);
          b(localBSHBinaryExpression);
        }
      }
    }
  }
  
  /* Error */
  public final void ReturnStatement()
  {
    // Byte code:
    //   0: new 992	bsh/BSHReturnStatement
    //   3: dup
    //   4: bipush 35
    //   6: invokespecial 993	bsh/BSHReturnStatement:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: bipush 46
    //   26: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   29: pop
    //   30: aload_0
    //   31: getfield 58	bsh/Parser:d	I
    //   34: iconst_m1
    //   35: if_icmpne +12 -> 47
    //   38: aload_0
    //   39: invokespecial 813	bsh/Parser:dq	()I
    //   42: istore 9
    //   44: goto +159 -> 203
    //   47: aload_0
    //   48: getfield 58	bsh/Parser:d	I
    //   51: istore 9
    //   53: goto +150 -> 203
    //   56: aload_0
    //   57: invokevirtual 901	bsh/Parser:Expression	()V
    //   60: aload_0
    //   61: bipush 78
    //   63: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   66: pop
    //   67: aload_0
    //   68: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   71: aload_1
    //   72: iconst_1
    //   73: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   76: aload_0
    //   77: aload_1
    //   78: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   81: aload_1
    //   82: bipush 46
    //   84: putfield 994	bsh/BSHReturnStatement:kind	I
    //   87: return
    //   88: astore 11
    //   90: aload 11
    //   92: astore 7
    //   94: iconst_0
    //   95: istore_3
    //   96: goto +86 -> 182
    //   99: astore_2
    //   100: iconst_0
    //   101: istore_3
    //   102: goto +13 -> 115
    //   105: astore 7
    //   107: iconst_1
    //   108: istore_3
    //   109: goto +73 -> 182
    //   112: astore_2
    //   113: iconst_1
    //   114: istore_3
    //   115: iload_3
    //   116: ifeq +17 -> 133
    //   119: aload_0
    //   120: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   123: aload_1
    //   124: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   127: iconst_0
    //   128: istore 5
    //   130: goto +14 -> 144
    //   133: aload_0
    //   134: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   137: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   140: pop
    //   141: iload_3
    //   142: istore 5
    //   144: aload_2
    //   145: instanceof 865
    //   148: ifeq +8 -> 156
    //   151: aload_2
    //   152: checkcast 865	java/lang/RuntimeException
    //   155: athrow
    //   156: aload_2
    //   157: instanceof 817
    //   160: ifeq +8 -> 168
    //   163: aload_2
    //   164: checkcast 817	bsh/ParseException
    //   167: athrow
    //   168: aload_2
    //   169: checkcast 867	java/lang/Error
    //   172: athrow
    //   173: astore 6
    //   175: iload 5
    //   177: istore_3
    //   178: aload 6
    //   180: astore 7
    //   182: iload_3
    //   183: ifeq +17 -> 200
    //   186: aload_0
    //   187: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   190: aload_1
    //   191: iconst_1
    //   192: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   195: aload_0
    //   196: aload_1
    //   197: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   200: aload 7
    //   202: athrow
    //   203: iload 9
    //   205: lookupswitch	default:+211->416, 11:+-149->56, 14:+-149->56, 17:+-149->56, 22:+-149->56, 26:+-149->56, 29:+-149->56, 36:+-149->56, 38:+-149->56, 40:+-149->56, 41:+-149->56, 47:+-149->56, 55:+-149->56, 57:+-149->56, 60:+-149->56, 64:+-149->56, 66:+-149->56, 67:+-149->56, 69:+-149->56, 72:+-149->56, 86:+-149->56, 87:+-149->56, 100:+-149->56, 101:+-149->56, 102:+-149->56, 103:+-149->56
    //   416: goto -356 -> 60
    //   419: astore 7
    //   421: goto -239 -> 182
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	424	0	this	Parser
    //   9	188	1	localBSHReturnStatement	BSHReturnStatement
    //   99	1	2	localThrowable1	Throwable
    //   112	57	2	localThrowable2	Throwable
    //   95	88	3	j	int
    //   128	48	5	k	int
    //   173	6	6	localObject1	Object
    //   92	1	7	localObject2	Object
    //   105	1	7	localObject3	Object
    //   180	21	7	localObject4	Object
    //   419	1	7	localObject5	Object
    //   42	162	9	m	int
    //   88	3	11	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   76	87	88	finally
    //   76	87	99	java/lang/Throwable
    //   23	44	105	finally
    //   47	53	105	finally
    //   56	60	105	finally
    //   60	76	105	finally
    //   23	44	112	java/lang/Throwable
    //   47	53	112	java/lang/Throwable
    //   56	60	112	java/lang/Throwable
    //   60	76	112	java/lang/Throwable
    //   144	156	173	finally
    //   156	168	173	finally
    //   168	173	173	finally
    //   119	127	419	finally
    //   133	141	419	finally
  }
  
  /* Error */
  public final void ReturnType()
  {
    // Byte code:
    //   0: new 1368	bsh/BSHReturnType
    //   3: dup
    //   4: bipush 10
    //   6: invokespecial 1369	bsh/BSHReturnType:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: getfield 58	bsh/Parser:d	I
    //   27: iconst_m1
    //   28: if_icmpne +12 -> 40
    //   31: aload_0
    //   32: invokespecial 813	bsh/Parser:dq	()I
    //   35: istore 8
    //   37: goto +9 -> 46
    //   40: aload_0
    //   41: getfield 58	bsh/Parser:d	I
    //   44: istore 8
    //   46: iload 8
    //   48: bipush 11
    //   50: if_icmpeq +129 -> 179
    //   53: iload 8
    //   55: bipush 14
    //   57: if_icmpeq +122 -> 179
    //   60: iload 8
    //   62: bipush 17
    //   64: if_icmpeq +115 -> 179
    //   67: iload 8
    //   69: bipush 22
    //   71: if_icmpeq +108 -> 179
    //   74: iload 8
    //   76: bipush 29
    //   78: if_icmpeq +101 -> 179
    //   81: iload 8
    //   83: bipush 36
    //   85: if_icmpeq +94 -> 179
    //   88: iload 8
    //   90: bipush 38
    //   92: if_icmpeq +87 -> 179
    //   95: iload 8
    //   97: bipush 47
    //   99: if_icmpeq +80 -> 179
    //   102: iload 8
    //   104: bipush 57
    //   106: if_icmpeq +24 -> 130
    //   109: iload 8
    //   111: bipush 69
    //   113: if_icmpeq +66 -> 179
    //   116: aload_0
    //   117: iconst_m1
    //   118: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   121: pop
    //   122: new 817	bsh/ParseException
    //   125: dup
    //   126: invokespecial 818	bsh/ParseException:<init>	()V
    //   129: athrow
    //   130: aload_0
    //   131: bipush 57
    //   133: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   136: pop
    //   137: aload_0
    //   138: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   141: aload_1
    //   142: iconst_1
    //   143: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   146: aload_0
    //   147: aload_1
    //   148: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   151: aload_1
    //   152: iconst_1
    //   153: putfield 1372	bsh/BSHReturnType:isVoid	Z
    //   156: iconst_0
    //   157: istore 9
    //   159: goto +27 -> 186
    //   162: astore 11
    //   164: aload 11
    //   166: astore 7
    //   168: iconst_0
    //   169: istore_3
    //   170: goto +113 -> 283
    //   173: astore_2
    //   174: iconst_0
    //   175: istore_3
    //   176: goto +40 -> 216
    //   179: aload_0
    //   180: invokevirtual 1003	bsh/Parser:Type	()V
    //   183: iconst_1
    //   184: istore 9
    //   186: iload 9
    //   188: ifeq +17 -> 205
    //   191: aload_0
    //   192: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   195: aload_1
    //   196: iconst_1
    //   197: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   200: aload_0
    //   201: aload_1
    //   202: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   205: return
    //   206: astore 7
    //   208: iconst_1
    //   209: istore_3
    //   210: goto +73 -> 283
    //   213: astore_2
    //   214: iconst_1
    //   215: istore_3
    //   216: iload_3
    //   217: ifeq +17 -> 234
    //   220: aload_0
    //   221: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   224: aload_1
    //   225: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   228: iconst_0
    //   229: istore 5
    //   231: goto +14 -> 245
    //   234: aload_0
    //   235: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   238: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   241: pop
    //   242: iload_3
    //   243: istore 5
    //   245: aload_2
    //   246: instanceof 865
    //   249: ifeq +8 -> 257
    //   252: aload_2
    //   253: checkcast 865	java/lang/RuntimeException
    //   256: athrow
    //   257: aload_2
    //   258: instanceof 817
    //   261: ifeq +8 -> 269
    //   264: aload_2
    //   265: checkcast 817	bsh/ParseException
    //   268: athrow
    //   269: aload_2
    //   270: checkcast 867	java/lang/Error
    //   273: athrow
    //   274: astore 6
    //   276: iload 5
    //   278: istore_3
    //   279: aload 6
    //   281: astore 7
    //   283: iload_3
    //   284: ifeq +17 -> 301
    //   287: aload_0
    //   288: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   291: aload_1
    //   292: iconst_1
    //   293: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   296: aload_0
    //   297: aload_1
    //   298: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   301: aload 7
    //   303: athrow
    //   304: astore 7
    //   306: goto -23 -> 283
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	this	Parser
    //   9	289	1	localBSHReturnType	BSHReturnType
    //   173	1	2	localThrowable1	Throwable
    //   213	57	2	localThrowable2	Throwable
    //   169	115	3	j	int
    //   229	48	5	k	int
    //   274	6	6	localObject1	Object
    //   166	1	7	localObject2	Object
    //   206	1	7	localObject3	Object
    //   281	21	7	localObject4	Object
    //   304	1	7	localObject5	Object
    //   35	79	8	m	int
    //   157	30	9	n	int
    //   162	3	11	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   146	156	162	finally
    //   146	156	173	java/lang/Throwable
    //   23	37	206	finally
    //   40	46	206	finally
    //   116	130	206	finally
    //   130	146	206	finally
    //   179	183	206	finally
    //   23	37	213	java/lang/Throwable
    //   40	46	213	java/lang/Throwable
    //   116	130	213	java/lang/Throwable
    //   130	146	213	java/lang/Throwable
    //   179	183	213	java/lang/Throwable
    //   245	257	274	finally
    //   257	269	274	finally
    //   269	274	274	finally
    //   220	228	304	finally
    //   234	242	304	finally
  }
  
  public final void ShiftExpression()
  {
    AdditiveExpression();
    for (;;)
    {
      int j;
      if (this.d == -1) {
        j = dq();
      } else {
        j = this.d;
      }
      switch (j)
      {
      default: 
        return;
      }
      int k;
      if (this.d == -1) {
        k = dq();
      } else {
        k = this.d;
      }
      int m;
      switch (k)
      {
      default: 
        F(-1);
        throw new ParseException();
      case 117: 
        m = 117;
        break;
      case 116: 
        m = 116;
        break;
      case 115: 
        m = 115;
        break;
      case 114: 
        m = 114;
        break;
      case 113: 
        m = 113;
        break;
      case 112: 
        m = 112;
      }
      Token localToken = F(m);
      AdditiveExpression();
      BSHBinaryExpression localBSHBinaryExpression = new BSHBinaryExpression(15);
      int n = 1;
      this.a.c(localBSHBinaryExpression);
      a(localBSHBinaryExpression);
      try
      {
        this.a.a(localBSHBinaryExpression, 2);
        n = 0;
        b(localBSHBinaryExpression);
        localBSHBinaryExpression.kind = localToken.kind;
      }
      finally
      {
        if (n != 0)
        {
          this.a.a(localBSHBinaryExpression, 2);
          b(localBSHBinaryExpression);
        }
      }
    }
  }
  
  public final void Statement()
  {
    if (v(2))
    {
      LabeledStatement();
      return;
    }
    int j;
    if (this.d == -1) {
      j = dq();
    } else {
      j = this.d;
    }
    switch (j)
    {
    default: 
      if (a())
      {
        ForStatement();
        return;
      }
      break;
    case 78: 
      EmptyStatement();
      return;
    case 74: 
      Block();
      return;
    case 59: 
      WhileStatement();
      return;
    case 50: 
      SwitchStatement();
      return;
    case 32: 
      IfStatement();
      return;
    case 21: 
      DoStatement();
      return;
    case 11: 
    case 14: 
    case 17: 
    case 22: 
    case 26: 
    case 29: 
    case 36: 
    case 38: 
    case 40: 
    case 41: 
    case 47: 
    case 55: 
    case 57: 
    case 60: 
    case 64: 
    case 66: 
    case 67: 
    case 69: 
    case 72: 
    case 86: 
    case 87: 
    case 100: 
    case 101: 
    case 102: 
    case 103: 
      StatementExpression();
      F(78);
      return;
    }
    int k;
    if (this.d == -1) {
      k = dq();
    } else {
      k = this.d;
    }
    if (k != 12)
    {
      if (k != 19)
      {
        if (k != 30)
        {
          if (k != 46)
          {
            if (k != 51)
            {
              if (k != 53)
              {
                if (k != 56)
                {
                  F(-1);
                  throw new ParseException();
                }
                TryStatement();
                return;
              }
              ThrowStatement();
              return;
            }
            SynchronizedStatement();
            return;
          }
          ReturnStatement();
          return;
        }
        EnhancedForStatement();
        return;
      }
      ContinueStatement();
      return;
    }
    BreakStatement();
  }
  
  public final void StatementExpression()
  {
    Expression();
  }
  
  /* Error */
  public final void StatementExpressionList()
  {
    // Byte code:
    //   0: new 1414	bsh/BSHStatementExpressionList
    //   3: dup
    //   4: bipush 34
    //   6: invokespecial 1415	bsh/BSHStatementExpressionList:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: invokevirtual 1395	bsh/Parser:StatementExpression	()V
    //   27: aload_0
    //   28: getfield 58	bsh/Parser:d	I
    //   31: iconst_m1
    //   32: if_icmpne +12 -> 44
    //   35: aload_0
    //   36: invokespecial 813	bsh/Parser:dq	()I
    //   39: istore 5
    //   41: goto +9 -> 50
    //   44: aload_0
    //   45: getfield 58	bsh/Parser:d	I
    //   48: istore 5
    //   50: iload 5
    //   52: bipush 79
    //   54: if_icmpeq +18 -> 72
    //   57: aload_0
    //   58: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   61: aload_1
    //   62: iconst_1
    //   63: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   66: aload_0
    //   67: aload_1
    //   68: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   71: return
    //   72: aload_0
    //   73: bipush 79
    //   75: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   78: pop
    //   79: aload_0
    //   80: invokevirtual 1395	bsh/Parser:StatementExpression	()V
    //   83: goto -56 -> 27
    //   86: astore 4
    //   88: iconst_1
    //   89: istore_3
    //   90: goto +45 -> 135
    //   93: astore_2
    //   94: aload_0
    //   95: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   98: aload_1
    //   99: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   102: iconst_0
    //   103: istore_3
    //   104: aload_2
    //   105: instanceof 865
    //   108: ifeq +8 -> 116
    //   111: aload_2
    //   112: checkcast 865	java/lang/RuntimeException
    //   115: athrow
    //   116: aload_2
    //   117: instanceof 817
    //   120: ifeq +8 -> 128
    //   123: aload_2
    //   124: checkcast 817	bsh/ParseException
    //   127: athrow
    //   128: aload_2
    //   129: checkcast 867	java/lang/Error
    //   132: athrow
    //   133: astore 4
    //   135: iload_3
    //   136: ifeq +17 -> 153
    //   139: aload_0
    //   140: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   143: aload_1
    //   144: iconst_1
    //   145: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   148: aload_0
    //   149: aload_1
    //   150: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   153: aload 4
    //   155: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	this	Parser
    //   9	141	1	localBSHStatementExpressionList	BSHStatementExpressionList
    //   93	36	2	localThrowable	Throwable
    //   89	47	3	j	int
    //   86	1	4	localObject1	Object
    //   133	21	4	localObject2	Object
    //   39	16	5	k	int
    // Exception table:
    //   from	to	target	type
    //   23	27	86	finally
    //   27	41	86	finally
    //   44	50	86	finally
    //   72	83	86	finally
    //   94	102	86	finally
    //   23	27	93	java/lang/Throwable
    //   27	41	93	java/lang/Throwable
    //   44	50	93	java/lang/Throwable
    //   72	83	93	java/lang/Throwable
    //   104	116	133	finally
    //   116	128	133	finally
    //   128	133	133	finally
  }
  
  /* Error */
  public final void SwitchLabel()
  {
    // Byte code:
    //   0: new 1418	bsh/BSHSwitchLabel
    //   3: dup
    //   4: bipush 28
    //   6: invokespecial 1419	bsh/BSHSwitchLabel:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: getfield 58	bsh/Parser:d	I
    //   27: iconst_m1
    //   28: if_icmpne +12 -> 40
    //   31: aload_0
    //   32: invokespecial 813	bsh/Parser:dq	()I
    //   35: istore 8
    //   37: goto +9 -> 46
    //   40: aload_0
    //   41: getfield 58	bsh/Parser:d	I
    //   44: istore 8
    //   46: iload 8
    //   48: bipush 15
    //   50: if_icmpeq +80 -> 130
    //   53: iload 8
    //   55: bipush 20
    //   57: if_icmpeq +17 -> 74
    //   60: aload_0
    //   61: iconst_m1
    //   62: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   65: pop
    //   66: new 817	bsh/ParseException
    //   69: dup
    //   70: invokespecial 818	bsh/ParseException:<init>	()V
    //   73: athrow
    //   74: aload_0
    //   75: bipush 20
    //   77: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   80: pop
    //   81: aload_0
    //   82: bipush 89
    //   84: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   87: pop
    //   88: aload_0
    //   89: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   92: aload_1
    //   93: iconst_1
    //   94: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   97: aload_0
    //   98: aload_1
    //   99: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   102: aload_1
    //   103: iconst_1
    //   104: putfield 1421	bsh/BSHSwitchLabel:a	Z
    //   107: iconst_0
    //   108: istore 11
    //   110: goto +41 -> 151
    //   113: astore 15
    //   115: aload 15
    //   117: astore 7
    //   119: iconst_0
    //   120: istore_3
    //   121: goto +127 -> 248
    //   124: astore_2
    //   125: iconst_0
    //   126: istore_3
    //   127: goto +54 -> 181
    //   130: aload_0
    //   131: bipush 15
    //   133: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   136: pop
    //   137: aload_0
    //   138: invokevirtual 901	bsh/Parser:Expression	()V
    //   141: aload_0
    //   142: bipush 89
    //   144: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   147: pop
    //   148: iconst_1
    //   149: istore 11
    //   151: iload 11
    //   153: ifeq +17 -> 170
    //   156: aload_0
    //   157: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   160: aload_1
    //   161: iconst_1
    //   162: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   165: aload_0
    //   166: aload_1
    //   167: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   170: return
    //   171: astore 7
    //   173: iconst_1
    //   174: istore_3
    //   175: goto +73 -> 248
    //   178: astore_2
    //   179: iconst_1
    //   180: istore_3
    //   181: iload_3
    //   182: ifeq +17 -> 199
    //   185: aload_0
    //   186: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   189: aload_1
    //   190: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   193: iconst_0
    //   194: istore 5
    //   196: goto +14 -> 210
    //   199: aload_0
    //   200: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   203: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   206: pop
    //   207: iload_3
    //   208: istore 5
    //   210: aload_2
    //   211: instanceof 865
    //   214: ifeq +8 -> 222
    //   217: aload_2
    //   218: checkcast 865	java/lang/RuntimeException
    //   221: athrow
    //   222: aload_2
    //   223: instanceof 817
    //   226: ifeq +8 -> 234
    //   229: aload_2
    //   230: checkcast 817	bsh/ParseException
    //   233: athrow
    //   234: aload_2
    //   235: checkcast 867	java/lang/Error
    //   238: athrow
    //   239: astore 6
    //   241: iload 5
    //   243: istore_3
    //   244: aload 6
    //   246: astore 7
    //   248: iload_3
    //   249: ifeq +17 -> 266
    //   252: aload_0
    //   253: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   256: aload_1
    //   257: iconst_1
    //   258: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   261: aload_0
    //   262: aload_1
    //   263: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   266: aload 7
    //   268: athrow
    //   269: astore 7
    //   271: goto -23 -> 248
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	274	0	this	Parser
    //   9	254	1	localBSHSwitchLabel	BSHSwitchLabel
    //   124	1	2	localThrowable1	Throwable
    //   178	57	2	localThrowable2	Throwable
    //   120	129	3	j	int
    //   194	48	5	k	int
    //   239	6	6	localObject1	Object
    //   117	1	7	localObject2	Object
    //   171	1	7	localObject3	Object
    //   246	21	7	localObject4	Object
    //   269	1	7	localObject5	Object
    //   35	23	8	m	int
    //   108	44	11	n	int
    //   113	3	15	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   97	107	113	finally
    //   97	107	124	java/lang/Throwable
    //   23	37	171	finally
    //   40	46	171	finally
    //   60	74	171	finally
    //   74	97	171	finally
    //   130	148	171	finally
    //   23	37	178	java/lang/Throwable
    //   40	46	178	java/lang/Throwable
    //   60	74	178	java/lang/Throwable
    //   74	97	178	java/lang/Throwable
    //   130	148	178	java/lang/Throwable
    //   210	222	239	finally
    //   222	234	239	finally
    //   234	239	239	finally
    //   185	193	269	finally
    //   199	207	269	finally
  }
  
  /* Error */
  public final void SwitchStatement()
  {
    // Byte code:
    //   0: new 1423	bsh/BSHSwitchStatement
    //   3: dup
    //   4: bipush 27
    //   6: invokespecial 1424	bsh/BSHSwitchStatement:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: bipush 50
    //   26: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   29: pop
    //   30: aload_0
    //   31: bipush 72
    //   33: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   36: pop
    //   37: aload_0
    //   38: invokevirtual 901	bsh/Parser:Expression	()V
    //   41: aload_0
    //   42: bipush 73
    //   44: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   47: pop
    //   48: aload_0
    //   49: bipush 74
    //   51: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   54: pop
    //   55: aload_0
    //   56: getfield 58	bsh/Parser:d	I
    //   59: iconst_m1
    //   60: if_icmpne +12 -> 72
    //   63: aload_0
    //   64: invokespecial 813	bsh/Parser:dq	()I
    //   67: istore 9
    //   69: goto +9 -> 78
    //   72: aload_0
    //   73: getfield 58	bsh/Parser:d	I
    //   76: istore 9
    //   78: iload 9
    //   80: bipush 15
    //   82: if_icmpeq +32 -> 114
    //   85: iload 9
    //   87: bipush 20
    //   89: if_icmpeq +25 -> 114
    //   92: aload_0
    //   93: bipush 75
    //   95: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   98: pop
    //   99: aload_0
    //   100: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   103: aload_1
    //   104: iconst_1
    //   105: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   108: aload_0
    //   109: aload_1
    //   110: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   113: return
    //   114: aload_0
    //   115: invokevirtual 1426	bsh/Parser:SwitchLabel	()V
    //   118: aload_0
    //   119: iconst_1
    //   120: invokespecial 1428	bsh/Parser:C	(I)Z
    //   123: ifeq -68 -> 55
    //   126: aload_0
    //   127: invokevirtual 956	bsh/Parser:BlockStatement	()V
    //   130: goto -12 -> 118
    //   133: astore 4
    //   135: iconst_1
    //   136: istore_3
    //   137: goto +45 -> 182
    //   140: astore_2
    //   141: aload_0
    //   142: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   145: aload_1
    //   146: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   149: iconst_0
    //   150: istore_3
    //   151: aload_2
    //   152: instanceof 865
    //   155: ifeq +8 -> 163
    //   158: aload_2
    //   159: checkcast 865	java/lang/RuntimeException
    //   162: athrow
    //   163: aload_2
    //   164: instanceof 817
    //   167: ifeq +8 -> 175
    //   170: aload_2
    //   171: checkcast 817	bsh/ParseException
    //   174: athrow
    //   175: aload_2
    //   176: checkcast 867	java/lang/Error
    //   179: athrow
    //   180: astore 4
    //   182: iload_3
    //   183: ifeq +17 -> 200
    //   186: aload_0
    //   187: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   190: aload_1
    //   191: iconst_1
    //   192: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   195: aload_0
    //   196: aload_1
    //   197: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   200: aload 4
    //   202: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	this	Parser
    //   9	188	1	localBSHSwitchStatement	BSHSwitchStatement
    //   140	36	2	localThrowable	Throwable
    //   136	47	3	j	int
    //   133	1	4	localObject1	Object
    //   180	21	4	localObject2	Object
    //   67	23	9	k	int
    // Exception table:
    //   from	to	target	type
    //   23	55	133	finally
    //   55	69	133	finally
    //   72	78	133	finally
    //   92	99	133	finally
    //   114	118	133	finally
    //   118	130	133	finally
    //   141	149	133	finally
    //   23	55	140	java/lang/Throwable
    //   55	69	140	java/lang/Throwable
    //   72	78	140	java/lang/Throwable
    //   92	99	140	java/lang/Throwable
    //   114	118	140	java/lang/Throwable
    //   118	130	140	java/lang/Throwable
    //   151	163	180	finally
    //   163	175	180	finally
    //   175	180	180	finally
  }
  
  /* Error */
  public final void SynchronizedStatement()
  {
    // Byte code:
    //   0: new 950	bsh/BSHBlock
    //   3: dup
    //   4: bipush 25
    //   6: invokespecial 951	bsh/BSHBlock:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: bipush 51
    //   28: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   31: pop
    //   32: aload_0
    //   33: bipush 72
    //   35: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   38: pop
    //   39: aload_0
    //   40: invokevirtual 901	bsh/Parser:Expression	()V
    //   43: aload_0
    //   44: bipush 73
    //   46: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   49: pop
    //   50: aload_0
    //   51: invokevirtual 859	bsh/Parser:Block	()V
    //   54: aload_0
    //   55: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   58: aload_1
    //   59: iconst_1
    //   60: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   63: aload_0
    //   64: aload_1
    //   65: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   68: aload_1
    //   69: iconst_1
    //   70: putfield 1431	bsh/BSHBlock:isSynchronized	Z
    //   73: return
    //   74: astore_3
    //   75: iconst_0
    //   76: istore 4
    //   78: goto +14 -> 92
    //   81: astore 6
    //   83: iconst_1
    //   84: istore_2
    //   85: goto +67 -> 152
    //   88: astore_3
    //   89: iconst_1
    //   90: istore 4
    //   92: iload 4
    //   94: ifeq +16 -> 110
    //   97: aload_0
    //   98: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   101: aload_1
    //   102: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   105: iconst_0
    //   106: istore_2
    //   107: goto +14 -> 121
    //   110: aload_0
    //   111: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   114: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   117: pop
    //   118: iload 4
    //   120: istore_2
    //   121: aload_3
    //   122: instanceof 865
    //   125: ifeq +8 -> 133
    //   128: aload_3
    //   129: checkcast 865	java/lang/RuntimeException
    //   132: athrow
    //   133: aload_3
    //   134: instanceof 817
    //   137: ifeq +8 -> 145
    //   140: aload_3
    //   141: checkcast 817	bsh/ParseException
    //   144: athrow
    //   145: aload_3
    //   146: checkcast 867	java/lang/Error
    //   149: athrow
    //   150: astore 6
    //   152: iload_2
    //   153: ifeq +17 -> 170
    //   156: aload_0
    //   157: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   160: aload_1
    //   161: iconst_1
    //   162: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   165: aload_0
    //   166: aload_1
    //   167: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   170: aload 6
    //   172: athrow
    //   173: astore 6
    //   175: iload 4
    //   177: istore_2
    //   178: goto -26 -> 152
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	181	0	this	Parser
    //   9	158	1	localBSHBlock	BSHBlock
    //   24	154	2	j	int
    //   74	1	3	localThrowable1	Throwable
    //   88	58	3	localThrowable2	Throwable
    //   76	100	4	k	int
    //   81	1	6	localObject1	Object
    //   150	21	6	localObject2	Object
    //   173	1	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   63	73	74	java/lang/Throwable
    //   25	63	81	finally
    //   25	63	88	java/lang/Throwable
    //   63	73	150	finally
    //   121	133	150	finally
    //   133	145	150	finally
    //   145	150	150	finally
    //   97	105	173	finally
    //   110	118	173	finally
  }
  
  /* Error */
  public final void ThrowStatement()
  {
    // Byte code:
    //   0: new 1433	bsh/BSHThrowStatement
    //   3: dup
    //   4: bipush 36
    //   6: invokespecial 1434	bsh/BSHThrowStatement:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: bipush 53
    //   26: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   29: pop
    //   30: aload_0
    //   31: invokevirtual 901	bsh/Parser:Expression	()V
    //   34: aload_0
    //   35: bipush 78
    //   37: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   40: pop
    //   41: aload_0
    //   42: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   45: aload_1
    //   46: iconst_1
    //   47: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   50: aload_0
    //   51: aload_1
    //   52: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   55: return
    //   56: astore 4
    //   58: iconst_1
    //   59: istore_3
    //   60: goto +45 -> 105
    //   63: astore_2
    //   64: aload_0
    //   65: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   68: aload_1
    //   69: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   72: iconst_0
    //   73: istore_3
    //   74: aload_2
    //   75: instanceof 865
    //   78: ifeq +8 -> 86
    //   81: aload_2
    //   82: checkcast 865	java/lang/RuntimeException
    //   85: athrow
    //   86: aload_2
    //   87: instanceof 817
    //   90: ifeq +8 -> 98
    //   93: aload_2
    //   94: checkcast 817	bsh/ParseException
    //   97: athrow
    //   98: aload_2
    //   99: checkcast 867	java/lang/Error
    //   102: athrow
    //   103: astore 4
    //   105: iload_3
    //   106: ifeq +17 -> 123
    //   109: aload_0
    //   110: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   113: aload_1
    //   114: iconst_1
    //   115: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   118: aload_0
    //   119: aload_1
    //   120: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   123: aload 4
    //   125: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	Parser
    //   9	111	1	localBSHThrowStatement	BSHThrowStatement
    //   63	36	2	localThrowable	Throwable
    //   59	47	3	j	int
    //   56	1	4	localObject1	Object
    //   103	21	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   23	41	56	finally
    //   64	72	56	finally
    //   23	41	63	java/lang/Throwable
    //   74	86	103	finally
    //   86	98	103	finally
    //   98	103	103	finally
  }
  
  /* Error */
  public final void TryStatement()
  {
    // Byte code:
    //   0: new 1436	bsh/BSHTryStatement
    //   3: dup
    //   4: bipush 37
    //   6: invokespecial 1437	bsh/BSHTryStatement:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: bipush 56
    //   28: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   31: pop
    //   32: aload_0
    //   33: invokevirtual 859	bsh/Parser:Block	()V
    //   36: iconst_0
    //   37: istore 8
    //   39: aload_0
    //   40: getfield 58	bsh/Parser:d	I
    //   43: iconst_m1
    //   44: if_icmpne +12 -> 56
    //   47: aload_0
    //   48: invokespecial 813	bsh/Parser:dq	()I
    //   51: istore 9
    //   53: goto +9 -> 62
    //   56: aload_0
    //   57: getfield 58	bsh/Parser:d	I
    //   60: istore 9
    //   62: iload 9
    //   64: bipush 16
    //   66: if_icmpeq +77 -> 143
    //   69: aload_0
    //   70: getfield 58	bsh/Parser:d	I
    //   73: iconst_m1
    //   74: if_icmpne +12 -> 86
    //   77: aload_0
    //   78: invokespecial 813	bsh/Parser:dq	()I
    //   81: istore 10
    //   83: goto +187 -> 270
    //   86: aload_0
    //   87: getfield 58	bsh/Parser:d	I
    //   90: istore 10
    //   92: goto +178 -> 270
    //   95: aload_0
    //   96: bipush 28
    //   98: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   101: pop
    //   102: aload_0
    //   103: invokevirtual 859	bsh/Parser:Block	()V
    //   106: iconst_1
    //   107: istore 8
    //   109: aload_0
    //   110: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   113: aload_1
    //   114: iconst_1
    //   115: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   118: aload_0
    //   119: aload_1
    //   120: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   123: iconst_0
    //   124: istore_2
    //   125: iload 8
    //   127: ifne +8 -> 135
    //   130: aload_0
    //   131: invokevirtual 135	bsh/Parser:generateParseException	()Lbsh/ParseException;
    //   134: athrow
    //   135: return
    //   136: astore_3
    //   137: iconst_0
    //   138: istore 4
    //   140: goto +49 -> 189
    //   143: aload_0
    //   144: bipush 16
    //   146: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   149: pop
    //   150: aload_0
    //   151: bipush 72
    //   153: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   156: pop
    //   157: aload_0
    //   158: invokevirtual 1125	bsh/Parser:FormalParameter	()V
    //   161: aload_0
    //   162: bipush 73
    //   164: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   167: pop
    //   168: aload_0
    //   169: invokevirtual 859	bsh/Parser:Block	()V
    //   172: iconst_1
    //   173: istore 8
    //   175: goto -136 -> 39
    //   178: astore 6
    //   180: iconst_1
    //   181: istore_2
    //   182: goto +67 -> 249
    //   185: astore_3
    //   186: iconst_1
    //   187: istore 4
    //   189: iload 4
    //   191: ifeq +16 -> 207
    //   194: aload_0
    //   195: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   198: aload_1
    //   199: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   202: iconst_0
    //   203: istore_2
    //   204: goto +14 -> 218
    //   207: aload_0
    //   208: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   211: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   214: pop
    //   215: iload 4
    //   217: istore_2
    //   218: aload_3
    //   219: instanceof 865
    //   222: ifeq +8 -> 230
    //   225: aload_3
    //   226: checkcast 865	java/lang/RuntimeException
    //   229: athrow
    //   230: aload_3
    //   231: instanceof 817
    //   234: ifeq +8 -> 242
    //   237: aload_3
    //   238: checkcast 817	bsh/ParseException
    //   241: athrow
    //   242: aload_3
    //   243: checkcast 867	java/lang/Error
    //   246: athrow
    //   247: astore 6
    //   249: iload_2
    //   250: ifeq +17 -> 267
    //   253: aload_0
    //   254: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   257: aload_1
    //   258: iconst_1
    //   259: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   262: aload_0
    //   263: aload_1
    //   264: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   267: aload 6
    //   269: athrow
    //   270: iload 10
    //   272: bipush 28
    //   274: if_icmpeq -179 -> 95
    //   277: goto -168 -> 109
    //   280: astore 6
    //   282: iload 4
    //   284: istore_2
    //   285: goto -36 -> 249
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	288	0	this	Parser
    //   9	255	1	localBSHTryStatement	BSHTryStatement
    //   24	261	2	j	int
    //   136	1	3	localThrowable1	Throwable
    //   185	58	3	localThrowable2	Throwable
    //   138	145	4	k	int
    //   178	1	6	localObject1	Object
    //   247	21	6	localObject2	Object
    //   280	1	6	localObject3	Object
    //   37	137	8	m	int
    //   51	16	9	n	int
    //   81	194	10	i1	int
    // Exception table:
    //   from	to	target	type
    //   118	123	136	java/lang/Throwable
    //   130	135	136	java/lang/Throwable
    //   25	36	178	finally
    //   39	53	178	finally
    //   56	62	178	finally
    //   69	83	178	finally
    //   86	92	178	finally
    //   95	106	178	finally
    //   109	118	178	finally
    //   143	172	178	finally
    //   25	36	185	java/lang/Throwable
    //   39	53	185	java/lang/Throwable
    //   56	62	185	java/lang/Throwable
    //   69	83	185	java/lang/Throwable
    //   86	92	185	java/lang/Throwable
    //   95	106	185	java/lang/Throwable
    //   109	118	185	java/lang/Throwable
    //   143	172	185	java/lang/Throwable
    //   118	123	247	finally
    //   130	135	247	finally
    //   218	230	247	finally
    //   230	242	247	finally
    //   242	247	247	finally
    //   194	202	280	finally
    //   207	215	280	finally
  }
  
  /* Error */
  public final void Type()
  {
    // Byte code:
    //   0: new 1439	bsh/BSHType
    //   3: dup
    //   4: bipush 9
    //   6: invokespecial 1440	bsh/BSHType:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: getfield 58	bsh/Parser:d	I
    //   27: iconst_m1
    //   28: if_icmpne +12 -> 40
    //   31: aload_0
    //   32: invokespecial 813	bsh/Parser:dq	()I
    //   35: istore 5
    //   37: goto +9 -> 46
    //   40: aload_0
    //   41: getfield 58	bsh/Parser:d	I
    //   44: istore 5
    //   46: iload 5
    //   48: bipush 11
    //   50: if_icmpeq +80 -> 130
    //   53: iload 5
    //   55: bipush 14
    //   57: if_icmpeq +73 -> 130
    //   60: iload 5
    //   62: bipush 17
    //   64: if_icmpeq +66 -> 130
    //   67: iload 5
    //   69: bipush 22
    //   71: if_icmpeq +59 -> 130
    //   74: iload 5
    //   76: bipush 29
    //   78: if_icmpeq +52 -> 130
    //   81: iload 5
    //   83: bipush 36
    //   85: if_icmpeq +45 -> 130
    //   88: iload 5
    //   90: bipush 38
    //   92: if_icmpeq +38 -> 130
    //   95: iload 5
    //   97: bipush 47
    //   99: if_icmpeq +31 -> 130
    //   102: iload 5
    //   104: bipush 69
    //   106: if_icmpeq +17 -> 123
    //   109: aload_0
    //   110: iconst_m1
    //   111: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   114: pop
    //   115: new 817	bsh/ParseException
    //   118: dup
    //   119: invokespecial 818	bsh/ParseException:<init>	()V
    //   122: athrow
    //   123: aload_0
    //   124: invokevirtual 851	bsh/Parser:AmbiguousName	()V
    //   127: goto +7 -> 134
    //   130: aload_0
    //   131: invokevirtual 845	bsh/Parser:PrimitiveType	()V
    //   134: aload_0
    //   135: iconst_2
    //   136: invokespecial 1442	bsh/Parser:f	(I)Z
    //   139: ifeq +24 -> 163
    //   142: aload_0
    //   143: bipush 76
    //   145: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   148: pop
    //   149: aload_0
    //   150: bipush 77
    //   152: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   155: pop
    //   156: aload_1
    //   157: invokevirtual 1445	bsh/BSHType:addArrayDimension	()V
    //   160: goto -26 -> 134
    //   163: aload_0
    //   164: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   167: aload_1
    //   168: iconst_1
    //   169: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   172: aload_0
    //   173: aload_1
    //   174: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   177: return
    //   178: astore 4
    //   180: iconst_1
    //   181: istore_3
    //   182: goto +45 -> 227
    //   185: astore_2
    //   186: aload_0
    //   187: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   190: aload_1
    //   191: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   194: iconst_0
    //   195: istore_3
    //   196: aload_2
    //   197: instanceof 865
    //   200: ifeq +8 -> 208
    //   203: aload_2
    //   204: checkcast 865	java/lang/RuntimeException
    //   207: athrow
    //   208: aload_2
    //   209: instanceof 817
    //   212: ifeq +8 -> 220
    //   215: aload_2
    //   216: checkcast 817	bsh/ParseException
    //   219: athrow
    //   220: aload_2
    //   221: checkcast 867	java/lang/Error
    //   224: athrow
    //   225: astore 4
    //   227: iload_3
    //   228: ifeq +17 -> 245
    //   231: aload_0
    //   232: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   235: aload_1
    //   236: iconst_1
    //   237: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   240: aload_0
    //   241: aload_1
    //   242: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   245: aload 4
    //   247: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	Parser
    //   9	233	1	localBSHType	BSHType
    //   185	36	2	localThrowable	Throwable
    //   181	47	3	j	int
    //   178	1	4	localObject1	Object
    //   225	21	4	localObject2	Object
    //   35	72	5	k	int
    // Exception table:
    //   from	to	target	type
    //   23	37	178	finally
    //   40	46	178	finally
    //   109	123	178	finally
    //   123	127	178	finally
    //   130	134	178	finally
    //   134	160	178	finally
    //   186	194	178	finally
    //   23	37	185	java/lang/Throwable
    //   40	46	185	java/lang/Throwable
    //   109	123	185	java/lang/Throwable
    //   123	127	185	java/lang/Throwable
    //   130	134	185	java/lang/Throwable
    //   134	160	185	java/lang/Throwable
    //   196	208	225	finally
    //   208	220	225	finally
    //   220	225	225	finally
  }
  
  /* Error */
  public final void TypedVariableDeclaration()
  {
    // Byte code:
    //   0: new 1447	bsh/BSHTypedVariableDeclaration
    //   3: dup
    //   4: bipush 33
    //   6: invokespecial 1448	bsh/BSHTypedVariableDeclaration:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: iconst_2
    //   27: iconst_0
    //   28: invokevirtual 1024	bsh/Parser:Modifiers	(IZ)Lbsh/Modifiers;
    //   31: astore 7
    //   33: aload_0
    //   34: invokevirtual 1003	bsh/Parser:Type	()V
    //   37: aload_0
    //   38: invokevirtual 1451	bsh/Parser:VariableDeclarator	()V
    //   41: aload_0
    //   42: getfield 58	bsh/Parser:d	I
    //   45: iconst_m1
    //   46: if_icmpne +12 -> 58
    //   49: aload_0
    //   50: invokespecial 813	bsh/Parser:dq	()I
    //   53: istore 8
    //   55: goto +9 -> 64
    //   58: aload_0
    //   59: getfield 58	bsh/Parser:d	I
    //   62: istore 8
    //   64: iload 8
    //   66: bipush 79
    //   68: if_icmpeq +31 -> 99
    //   71: aload_0
    //   72: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   75: aload_1
    //   76: iconst_1
    //   77: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   80: aload_0
    //   81: aload_1
    //   82: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   85: aload_1
    //   86: aload 7
    //   88: putfield 1452	bsh/BSHTypedVariableDeclaration:modifiers	Lbsh/Modifiers;
    //   91: return
    //   92: astore_3
    //   93: iconst_0
    //   94: istore 4
    //   96: goto +24 -> 120
    //   99: aload_0
    //   100: bipush 79
    //   102: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   105: pop
    //   106: goto -69 -> 37
    //   109: astore 6
    //   111: iconst_1
    //   112: istore_2
    //   113: goto +67 -> 180
    //   116: astore_3
    //   117: iconst_1
    //   118: istore 4
    //   120: iload 4
    //   122: ifeq +16 -> 138
    //   125: aload_0
    //   126: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   129: aload_1
    //   130: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   133: iconst_0
    //   134: istore_2
    //   135: goto +14 -> 149
    //   138: aload_0
    //   139: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   142: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   145: pop
    //   146: iload 4
    //   148: istore_2
    //   149: aload_3
    //   150: instanceof 865
    //   153: ifeq +8 -> 161
    //   156: aload_3
    //   157: checkcast 865	java/lang/RuntimeException
    //   160: athrow
    //   161: aload_3
    //   162: instanceof 817
    //   165: ifeq +8 -> 173
    //   168: aload_3
    //   169: checkcast 817	bsh/ParseException
    //   172: athrow
    //   173: aload_3
    //   174: checkcast 867	java/lang/Error
    //   177: athrow
    //   178: astore 6
    //   180: iload_2
    //   181: ifeq +17 -> 198
    //   184: aload_0
    //   185: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   188: aload_1
    //   189: iconst_1
    //   190: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   193: aload_0
    //   194: aload_1
    //   195: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   198: aload 6
    //   200: athrow
    //   201: astore 6
    //   203: iload 4
    //   205: istore_2
    //   206: goto -26 -> 180
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	this	Parser
    //   9	186	1	localBSHTypedVariableDeclaration	BSHTypedVariableDeclaration
    //   24	182	2	j	int
    //   92	1	3	localThrowable1	Throwable
    //   116	58	3	localThrowable2	Throwable
    //   94	110	4	k	int
    //   109	1	6	localObject1	Object
    //   178	21	6	localObject2	Object
    //   201	1	6	localObject3	Object
    //   31	56	7	localModifiers	Modifiers
    //   53	16	8	m	int
    // Exception table:
    //   from	to	target	type
    //   80	91	92	java/lang/Throwable
    //   25	37	109	finally
    //   37	55	109	finally
    //   58	64	109	finally
    //   71	80	109	finally
    //   99	106	109	finally
    //   25	37	116	java/lang/Throwable
    //   37	55	116	java/lang/Throwable
    //   58	64	116	java/lang/Throwable
    //   71	80	116	java/lang/Throwable
    //   99	106	116	java/lang/Throwable
    //   80	91	178	finally
    //   149	161	178	finally
    //   161	173	178	finally
    //   173	178	178	finally
    //   125	133	201	finally
    //   138	146	201	finally
  }
  
  /* Error */
  public final void UnaryExpression()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 58	bsh/Parser:d	I
    //   4: iconst_m1
    //   5: if_icmpne +11 -> 16
    //   8: aload_0
    //   9: invokespecial 813	bsh/Parser:dq	()I
    //   12: istore_1
    //   13: goto +8 -> 21
    //   16: aload_0
    //   17: getfield 58	bsh/Parser:d	I
    //   20: istore_1
    //   21: iload_1
    //   22: lookupswitch	default:+210->232, 11:+404->426, 14:+404->426, 17:+404->426, 22:+404->426, 26:+404->426, 29:+404->426, 36:+404->426, 38:+404->426, 40:+404->426, 41:+404->426, 47:+404->426, 55:+404->426, 57:+404->426, 60:+404->426, 64:+404->426, 66:+404->426, 67:+404->426, 69:+404->426, 72:+404->426, 86:+404->426, 87:+404->426, 100:+399->421, 101:+394->416, 102:+224->246, 103:+224->246
    //   232: aload_0
    //   233: iconst_m1
    //   234: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   237: pop
    //   238: new 817	bsh/ParseException
    //   241: dup
    //   242: invokespecial 818	bsh/ParseException:<init>	()V
    //   245: athrow
    //   246: aload_0
    //   247: getfield 58	bsh/Parser:d	I
    //   250: iconst_m1
    //   251: if_icmpne +11 -> 262
    //   254: aload_0
    //   255: invokespecial 813	bsh/Parser:dq	()I
    //   258: istore_2
    //   259: goto +8 -> 267
    //   262: aload_0
    //   263: getfield 58	bsh/Parser:d	I
    //   266: istore_2
    //   267: iload_2
    //   268: tableswitch	default:+24->292, 102:+44->312, 103:+38->306
    //   292: aload_0
    //   293: iconst_m1
    //   294: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   297: pop
    //   298: new 817	bsh/ParseException
    //   301: dup
    //   302: invokespecial 818	bsh/ParseException:<init>	()V
    //   305: athrow
    //   306: bipush 103
    //   308: istore_3
    //   309: goto +6 -> 315
    //   312: bipush 102
    //   314: istore_3
    //   315: aload_0
    //   316: iload_3
    //   317: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   320: astore 4
    //   322: aload_0
    //   323: invokevirtual 1006	bsh/Parser:UnaryExpression	()V
    //   326: new 1293	bsh/BSHUnaryExpression
    //   329: dup
    //   330: bipush 16
    //   332: invokespecial 1294	bsh/BSHUnaryExpression:<init>	(I)V
    //   335: astore 5
    //   337: aload_0
    //   338: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   341: aload 5
    //   343: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   346: aload_0
    //   347: aload 5
    //   349: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   352: aload_0
    //   353: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   356: aload 5
    //   358: iconst_1
    //   359: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   362: aload_0
    //   363: aload 5
    //   365: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   368: aload 5
    //   370: aload 4
    //   372: getfield 131	bsh/Token:kind	I
    //   375: putfield 1295	bsh/BSHUnaryExpression:kind	I
    //   378: return
    //   379: astore 6
    //   381: iconst_0
    //   382: istore 7
    //   384: goto +8 -> 392
    //   387: astore 6
    //   389: iconst_1
    //   390: istore 7
    //   392: iload 7
    //   394: ifeq +19 -> 413
    //   397: aload_0
    //   398: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   401: aload 5
    //   403: iconst_1
    //   404: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   407: aload_0
    //   408: aload 5
    //   410: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   413: aload 6
    //   415: athrow
    //   416: aload_0
    //   417: invokevirtual 1454	bsh/Parser:PreDecrementExpression	()V
    //   420: return
    //   421: aload_0
    //   422: invokevirtual 1456	bsh/Parser:PreIncrementExpression	()V
    //   425: return
    //   426: aload_0
    //   427: invokevirtual 1009	bsh/Parser:UnaryExpressionNotPlusMinus	()V
    //   430: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	431	0	this	Parser
    //   12	10	1	j	int
    //   258	10	2	k	int
    //   308	9	3	m	int
    //   320	51	4	localToken	Token
    //   335	74	5	localBSHUnaryExpression	BSHUnaryExpression
    //   379	1	6	localObject1	Object
    //   387	27	6	localObject2	Object
    //   382	11	7	n	int
    // Exception table:
    //   from	to	target	type
    //   362	378	379	finally
    //   352	362	387	finally
  }
  
  /* Error */
  public final void UnaryExpressionNotPlusMinus()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 58	bsh/Parser:d	I
    //   4: iconst_m1
    //   5: if_icmpne +11 -> 16
    //   8: aload_0
    //   9: invokespecial 813	bsh/Parser:dq	()I
    //   12: istore_1
    //   13: goto +8 -> 21
    //   16: aload_0
    //   17: getfield 58	bsh/Parser:d	I
    //   20: istore_1
    //   21: iload_1
    //   22: tableswitch	default:+22->44, 86:+37->59, 87:+37->59
    //   44: aload_0
    //   45: ldc_w 957
    //   48: invokespecial 1458	bsh/Parser:i	(I)Z
    //   51: ifeq +177 -> 228
    //   54: aload_0
    //   55: invokevirtual 1460	bsh/Parser:CastExpression	()V
    //   58: return
    //   59: aload_0
    //   60: getfield 58	bsh/Parser:d	I
    //   63: iconst_m1
    //   64: if_icmpne +11 -> 75
    //   67: aload_0
    //   68: invokespecial 813	bsh/Parser:dq	()I
    //   71: istore_2
    //   72: goto +8 -> 80
    //   75: aload_0
    //   76: getfield 58	bsh/Parser:d	I
    //   79: istore_2
    //   80: iload_2
    //   81: tableswitch	default:+23->104, 86:+43->124, 87:+37->118
    //   104: aload_0
    //   105: iconst_m1
    //   106: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   109: pop
    //   110: new 817	bsh/ParseException
    //   113: dup
    //   114: invokespecial 818	bsh/ParseException:<init>	()V
    //   117: athrow
    //   118: bipush 87
    //   120: istore_3
    //   121: goto +6 -> 127
    //   124: bipush 86
    //   126: istore_3
    //   127: aload_0
    //   128: iload_3
    //   129: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   132: astore 4
    //   134: aload_0
    //   135: invokevirtual 1006	bsh/Parser:UnaryExpression	()V
    //   138: new 1293	bsh/BSHUnaryExpression
    //   141: dup
    //   142: bipush 16
    //   144: invokespecial 1294	bsh/BSHUnaryExpression:<init>	(I)V
    //   147: astore 5
    //   149: aload_0
    //   150: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   153: aload 5
    //   155: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   158: aload_0
    //   159: aload 5
    //   161: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   164: aload_0
    //   165: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   168: aload 5
    //   170: iconst_1
    //   171: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   174: aload_0
    //   175: aload 5
    //   177: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   180: aload 5
    //   182: aload 4
    //   184: getfield 131	bsh/Token:kind	I
    //   187: putfield 1295	bsh/BSHUnaryExpression:kind	I
    //   190: return
    //   191: astore 6
    //   193: iconst_0
    //   194: istore 7
    //   196: goto +8 -> 204
    //   199: astore 6
    //   201: iconst_1
    //   202: istore 7
    //   204: iload 7
    //   206: ifeq +19 -> 225
    //   209: aload_0
    //   210: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   213: aload 5
    //   215: iconst_1
    //   216: invokevirtual 831	bsh/JJTParserState:a	(Lbsh/Node;I)V
    //   219: aload_0
    //   220: aload 5
    //   222: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   225: aload 6
    //   227: athrow
    //   228: aload_0
    //   229: getfield 58	bsh/Parser:d	I
    //   232: iconst_m1
    //   233: if_icmpne +12 -> 245
    //   236: aload_0
    //   237: invokespecial 813	bsh/Parser:dq	()I
    //   240: istore 9
    //   242: goto +9 -> 251
    //   245: aload_0
    //   246: getfield 58	bsh/Parser:d	I
    //   249: istore 9
    //   251: iload 9
    //   253: lookupswitch	default:+163->416, 11:+177->430, 14:+177->430, 17:+177->430, 22:+177->430, 26:+177->430, 29:+177->430, 36:+177->430, 38:+177->430, 40:+177->430, 41:+177->430, 47:+177->430, 55:+177->430, 57:+177->430, 60:+177->430, 64:+177->430, 66:+177->430, 67:+177->430, 69:+177->430, 72:+177->430
    //   416: aload_0
    //   417: iconst_m1
    //   418: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   421: pop
    //   422: new 817	bsh/ParseException
    //   425: dup
    //   426: invokespecial 818	bsh/ParseException:<init>	()V
    //   429: athrow
    //   430: aload_0
    //   431: invokevirtual 1462	bsh/Parser:PostfixExpression	()V
    //   434: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	435	0	this	Parser
    //   12	10	1	j	int
    //   71	10	2	k	int
    //   120	9	3	m	int
    //   132	51	4	localToken	Token
    //   147	74	5	localBSHUnaryExpression	BSHUnaryExpression
    //   191	1	6	localObject1	Object
    //   199	27	6	localObject2	Object
    //   194	11	7	n	int
    //   240	12	9	i1	int
    // Exception table:
    //   from	to	target	type
    //   174	190	191	finally
    //   164	174	199	finally
  }
  
  /* Error */
  public final void VariableDeclarator()
  {
    // Byte code:
    //   0: new 1464	bsh/BSHVariableDeclarator
    //   3: dup
    //   4: iconst_5
    //   5: invokespecial 1465	bsh/BSHVariableDeclarator:<init>	(I)V
    //   8: astore_1
    //   9: aload_0
    //   10: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   13: aload_1
    //   14: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   22: iconst_0
    //   23: istore_2
    //   24: aload_0
    //   25: bipush 69
    //   27: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   30: astore 7
    //   32: aload_0
    //   33: getfield 58	bsh/Parser:d	I
    //   36: iconst_m1
    //   37: if_icmpne +12 -> 49
    //   40: aload_0
    //   41: invokespecial 813	bsh/Parser:dq	()I
    //   44: istore 8
    //   46: goto +146 -> 192
    //   49: aload_0
    //   50: getfield 58	bsh/Parser:d	I
    //   53: istore 8
    //   55: goto +137 -> 192
    //   58: aload_0
    //   59: bipush 81
    //   61: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   64: pop
    //   65: aload_0
    //   66: invokevirtual 930	bsh/Parser:VariableInitializer	()V
    //   69: aload_0
    //   70: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   73: aload_1
    //   74: iconst_1
    //   75: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   78: aload_0
    //   79: aload_1
    //   80: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   83: aload_1
    //   84: aload 7
    //   86: getfield 876	bsh/Token:image	Ljava/lang/String;
    //   89: putfield 1466	bsh/BSHVariableDeclarator:name	Ljava/lang/String;
    //   92: return
    //   93: astore_3
    //   94: iconst_0
    //   95: istore 4
    //   97: goto +14 -> 111
    //   100: astore 6
    //   102: iconst_1
    //   103: istore_2
    //   104: goto +67 -> 171
    //   107: astore_3
    //   108: iconst_1
    //   109: istore 4
    //   111: iload 4
    //   113: ifeq +16 -> 129
    //   116: aload_0
    //   117: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   120: aload_1
    //   121: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   124: iconst_0
    //   125: istore_2
    //   126: goto +14 -> 140
    //   129: aload_0
    //   130: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   133: invokevirtual 1041	bsh/JJTParserState:c	()Lbsh/Node;
    //   136: pop
    //   137: iload 4
    //   139: istore_2
    //   140: aload_3
    //   141: instanceof 865
    //   144: ifeq +8 -> 152
    //   147: aload_3
    //   148: checkcast 865	java/lang/RuntimeException
    //   151: athrow
    //   152: aload_3
    //   153: instanceof 817
    //   156: ifeq +8 -> 164
    //   159: aload_3
    //   160: checkcast 817	bsh/ParseException
    //   163: athrow
    //   164: aload_3
    //   165: checkcast 867	java/lang/Error
    //   168: athrow
    //   169: astore 6
    //   171: iload_2
    //   172: ifeq +17 -> 189
    //   175: aload_0
    //   176: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   179: aload_1
    //   180: iconst_1
    //   181: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   184: aload_0
    //   185: aload_1
    //   186: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   189: aload 6
    //   191: athrow
    //   192: iload 8
    //   194: bipush 81
    //   196: if_icmpeq -138 -> 58
    //   199: goto -130 -> 69
    //   202: astore 6
    //   204: iload 4
    //   206: istore_2
    //   207: goto -36 -> 171
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	210	0	this	Parser
    //   8	178	1	localBSHVariableDeclarator	BSHVariableDeclarator
    //   23	184	2	j	int
    //   93	1	3	localThrowable1	Throwable
    //   107	58	3	localThrowable2	Throwable
    //   95	110	4	k	int
    //   100	1	6	localObject1	Object
    //   169	21	6	localObject2	Object
    //   202	1	6	localObject3	Object
    //   30	55	7	localToken	Token
    //   44	153	8	m	int
    // Exception table:
    //   from	to	target	type
    //   78	92	93	java/lang/Throwable
    //   24	46	100	finally
    //   49	55	100	finally
    //   58	69	100	finally
    //   69	78	100	finally
    //   24	46	107	java/lang/Throwable
    //   49	55	107	java/lang/Throwable
    //   58	69	107	java/lang/Throwable
    //   69	78	107	java/lang/Throwable
    //   78	92	169	finally
    //   140	152	169	finally
    //   152	164	169	finally
    //   164	169	169	finally
    //   116	124	202	finally
    //   129	137	202	finally
  }
  
  public final void VariableInitializer()
  {
    int j;
    if (this.d == -1) {
      j = dq();
    } else {
      j = this.d;
    }
    switch (j)
    {
    default: 
      F(-1);
      throw new ParseException();
    case 74: 
      ArrayInitializer();
      return;
    }
    Expression();
  }
  
  public final void VoidLiteral()
  {
    F(57);
  }
  
  /* Error */
  public final void WhileStatement()
  {
    // Byte code:
    //   0: new 1060	bsh/BSHWhileStatement
    //   3: dup
    //   4: bipush 30
    //   6: invokespecial 1061	bsh/BSHWhileStatement:<init>	(I)V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   14: aload_1
    //   15: invokevirtual 826	bsh/JJTParserState:c	(Lbsh/Node;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 828	bsh/Parser:a	(Lbsh/Node;)V
    //   23: aload_0
    //   24: bipush 59
    //   26: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   29: pop
    //   30: aload_0
    //   31: bipush 72
    //   33: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   36: pop
    //   37: aload_0
    //   38: invokevirtual 901	bsh/Parser:Expression	()V
    //   41: aload_0
    //   42: bipush 73
    //   44: invokespecial 815	bsh/Parser:F	(I)Lbsh/Token;
    //   47: pop
    //   48: aload_0
    //   49: invokevirtual 979	bsh/Parser:Statement	()V
    //   52: aload_0
    //   53: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   56: aload_1
    //   57: iconst_1
    //   58: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   61: aload_0
    //   62: aload_1
    //   63: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   66: return
    //   67: astore 4
    //   69: iconst_1
    //   70: istore_3
    //   71: goto +45 -> 116
    //   74: astore_2
    //   75: aload_0
    //   76: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   79: aload_1
    //   80: invokevirtual 863	bsh/JJTParserState:b	(Lbsh/Node;)V
    //   83: iconst_0
    //   84: istore_3
    //   85: aload_2
    //   86: instanceof 865
    //   89: ifeq +8 -> 97
    //   92: aload_2
    //   93: checkcast 865	java/lang/RuntimeException
    //   96: athrow
    //   97: aload_2
    //   98: instanceof 817
    //   101: ifeq +8 -> 109
    //   104: aload_2
    //   105: checkcast 817	bsh/ParseException
    //   108: athrow
    //   109: aload_2
    //   110: checkcast 867	java/lang/Error
    //   113: athrow
    //   114: astore 4
    //   116: iload_3
    //   117: ifeq +17 -> 134
    //   120: aload_0
    //   121: getfield 38	bsh/Parser:a	Lbsh/JJTParserState;
    //   124: aload_1
    //   125: iconst_1
    //   126: invokevirtual 862	bsh/JJTParserState:a	(Lbsh/Node;Z)V
    //   129: aload_0
    //   130: aload_1
    //   131: invokevirtual 833	bsh/Parser:b	(Lbsh/Node;)V
    //   134: aload 4
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	Parser
    //   9	122	1	localBSHWhileStatement	BSHWhileStatement
    //   74	36	2	localThrowable	Throwable
    //   70	47	3	j	int
    //   67	1	4	localObject1	Object
    //   114	21	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   23	52	67	finally
    //   75	83	67	finally
    //   23	52	74	java/lang/Throwable
    //   85	97	114	finally
    //   97	109	114	finally
    //   109	114	114	finally
  }
  
  ParseException a(String paramString)
  {
    Token localToken = this.token;
    int j = localToken.beginLine;
    int k = localToken.beginColumn;
    if (localToken.kind == 0) {
      ParserConstants.tokenImage[0];
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("Parse error at line ");
    localStringBuffer.append(j);
    localStringBuffer.append(", column ");
    localStringBuffer.append(k);
    localStringBuffer.append(" : ");
    localStringBuffer.append(paramString);
    return new ParseException(localStringBuffer.toString());
  }
  
  void a(Node paramNode)
  {
    ((SimpleNode)paramNode).j = getToken(1);
  }
  
  void a(Reader paramReader)
  {
    ReInit(paramReader);
  }
  
  boolean a()
  {
    if (getToken(1).kind != 30) {
      return false;
    }
    int j = 3;
    if (getToken(2).kind != 72) {
      return false;
    }
    for (;;)
    {
      int k = j + 1;
      int m = getToken(j).kind;
      if (m == 0) {
        break label70;
      }
      if (m == 78) {
        break label68;
      }
      if (m == 89) {
        break;
      }
      j = k;
    }
    return false;
    label68:
    return true;
    label70:
    return false;
  }
  
  void b(Node paramNode)
  {
    ((SimpleNode)paramNode).k = getToken(0);
  }
  
  void b(Reader paramReader)
  {
    this.c.ReInit(paramReader, this.c.getEndLine(), this.c.getEndColumn());
  }
  
  public final void disable_tracing() {}
  
  public final void enable_tracing() {}
  
  public ParseException generateParseException()
  {
    Token localToken = this.token.next;
    int j = localToken.beginLine;
    int k = localToken.beginColumn;
    String str;
    if (localToken.kind == 0) {
      str = ParserConstants.tokenImage[0];
    } else {
      str = localToken.image;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("Parse error at line ");
    localStringBuffer.append(j);
    localStringBuffer.append(", column ");
    localStringBuffer.append(k);
    localStringBuffer.append(".  Encountered: ");
    localStringBuffer.append(str);
    return new ParseException(localStringBuffer.toString());
  }
  
  public final Token getNextToken()
  {
    if (this.token.next != null)
    {
      this.token = this.token.next;
    }
    else
    {
      Token localToken1 = this.token;
      Token localToken2 = this.token_source.getNextToken();
      localToken1.next = localToken2;
      this.token = localToken2;
    }
    this.d = -1;
    return this.token;
  }
  
  public final Token getToken(int paramInt)
  {
    Object localObject;
    if (this.lookingAhead) {
      localObject = this.e;
    } else {
      localObject = this.token;
    }
    for (int j = 0;; j++)
    {
      if (j >= paramInt) {
        return (Token)localObject;
      }
      if (((Token)localObject).next != null)
      {
        localObject = ((Token)localObject).next;
      }
      else
      {
        Token localToken = this.token_source.getNextToken();
        ((Token)localObject).next = localToken;
        localObject = localToken;
      }
    }
  }
  
  public SimpleNode popNode()
  {
    if (this.a.d() > 0) {
      return (SimpleNode)this.a.c();
    }
    return null;
  }
  
  public void setRetainComments(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  private static final class LookaheadSuccess
    extends Error
  {
    private LookaheadSuccess() {}
    
    LookaheadSuccess(Parser.1 param1)
    {
      this();
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\Parser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */