package bsh;

import java.io.PrintStream;
import java.io.Reader;

public abstract interface ConsoleInterface
{
  public abstract void error(Object paramObject);
  
  public abstract PrintStream getErr();
  
  public abstract Reader getIn();
  
  public abstract PrintStream getOut();
  
  public abstract void print(Object paramObject);
  
  public abstract void println(Object paramObject);
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\ConsoleInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */