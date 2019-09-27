package com.nirenr.screencapture;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileUtil
{
  public static final String SCREENCAPTURE_PATH;
  public static final String SCREENSHOT_NAME = "Screenshot";
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ScreenCapture");
    localStringBuilder.append(File.separator);
    localStringBuilder.append("Screenshots");
    localStringBuilder.append(File.separator);
    SCREENCAPTURE_PATH = localStringBuilder.toString();
  }
  
  public static String getAppPath(Context paramContext)
  {
    if ("mounted".equals(Environment.getExternalStorageState())) {}
    for (File localFile = Environment.getExternalStorageDirectory();; localFile = paramContext.getFilesDir()) {
      return localFile.toString();
    }
  }
  
  public static String getScreenShots(Context paramContext)
  {
    StringBuffer localStringBuffer = new StringBuffer(getAppPath(paramContext));
    localStringBuffer.append(File.separator);
    localStringBuffer.append(SCREENCAPTURE_PATH);
    File localFile = new File(localStringBuffer.toString());
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    return localStringBuffer.toString();
  }
  
  public static String getScreenShotsName(Context paramContext)
  {
    String str = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss", Locale.CHINESE).format(new Date());
    StringBuffer localStringBuffer = new StringBuffer(getScreenShots(paramContext));
    localStringBuffer.append("Screenshot");
    localStringBuffer.append("_");
    localStringBuffer.append(str);
    localStringBuffer.append(".png");
    return localStringBuffer.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\nirenr\screencapture\FileUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */