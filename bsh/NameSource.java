package bsh;

public abstract interface NameSource
{
  public abstract void addNameSourceListener(Listener paramListener);
  
  public abstract String[] getAllNames();
  
  public static abstract interface Listener
  {
    public abstract void nameSourceChanged(NameSource paramNameSource);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\NameSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */