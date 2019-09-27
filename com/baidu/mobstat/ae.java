package com.baidu.mobstat;

import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

class ae
  extends ContextWrapper
{
  public ae()
  {
    super(null);
  }
  
  public File getDatabasePath(String paramString)
  {
    if (!"mounted".equals(cs.a())) {
      return null;
    }
    String str1 = Environment.getExternalStorageDirectory().getAbsolutePath();
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append(str1);
    localStringBuilder1.append(File.separator);
    localStringBuilder1.append("backups/system");
    String str2 = localStringBuilder1.toString();
    File localFile1 = new File(str2);
    if (!localFile1.exists()) {
      localFile1.mkdirs();
    }
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(str2);
    localStringBuilder2.append(File.separator);
    localStringBuilder2.append(paramString);
    File localFile2 = new File(localStringBuilder2.toString());
    if (!localFile2.exists()) {
      try
      {
        localFile2.createNewFile();
      }
      catch (IOException localIOException)
      {
        bd.b(localIOException);
      }
    }
    if (localFile2.exists()) {
      return localFile2;
    }
    return null;
  }
  
  public SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    File localFile = getDatabasePath(paramString);
    if ((localFile != null) && (localFile.canWrite())) {
      return SQLiteDatabase.openOrCreateDatabase(localFile, null);
    }
    throw new RuntimeException("db path is null or path can not be write");
  }
  
  public SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    File localFile = getDatabasePath(paramString);
    if ((localFile != null) && (localFile.canWrite())) {
      return SQLiteDatabase.openOrCreateDatabase(localFile, null);
    }
    throw new RuntimeException("db path is null or path can not be write");
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */