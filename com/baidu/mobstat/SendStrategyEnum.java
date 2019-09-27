package com.baidu.mobstat;

public enum SendStrategyEnum
{
  static
  {
    SendStrategyEnum[] arrayOfSendStrategyEnum = new SendStrategyEnum[3];
    arrayOfSendStrategyEnum[0] = APP_START;
    arrayOfSendStrategyEnum[1] = ONCE_A_DAY;
    arrayOfSendStrategyEnum[2] = SET_TIME_INTERVAL;
    a = arrayOfSendStrategyEnum;
  }
  
  private SendStrategyEnum() {}
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\SendStrategyEnum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */