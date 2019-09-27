package com.baidu.mobstat;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.widget.Button;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

class bf
{
  private static final bf b = new bf();
  private HashSet<String> a = new HashSet();
  private boolean c;
  private boolean d;
  
  private View.AccessibilityDelegate a(View paramView)
  {
    try
    {
      View.AccessibilityDelegate localAccessibilityDelegate = (View.AccessibilityDelegate)paramView.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(paramView, new Object[0]);
      return localAccessibilityDelegate;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      cz.b("getAccessibilityDelegate threw an exception when called.", localInvocationTargetException);
    }
    catch (NoSuchMethodException|IllegalAccessException localNoSuchMethodException) {}
    return null;
  }
  
  public static bf a()
  {
    return b;
  }
  
  /* Error */
  private String a(View paramView, Activity paramActivity)
  {
    // Byte code:
    //   0: ldc 65
    //   2: astore_3
    //   3: aload_1
    //   4: ifnonnull +5 -> 9
    //   7: aload_3
    //   8: areturn
    //   9: aload_2
    //   10: invokevirtual 71	android/app/Activity:getWindow	()Landroid/view/Window;
    //   13: invokevirtual 77	android/view/Window:getDecorView	()Landroid/view/View;
    //   16: ldc 78
    //   18: invokevirtual 84	android/view/View:findViewById	(I)Landroid/view/View;
    //   21: checkcast 86	android/view/ViewGroup
    //   24: iconst_0
    //   25: invokevirtual 89	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   28: checkcast 86	android/view/ViewGroup
    //   31: astore 4
    //   33: goto +6 -> 39
    //   36: aconst_null
    //   37: astore 4
    //   39: new 91	java/util/ArrayList
    //   42: dup
    //   43: invokespecial 92	java/util/ArrayList:<init>	()V
    //   46: astore 5
    //   48: aload 5
    //   50: aload_1
    //   51: invokevirtual 36	java/lang/Object:getClass	()Ljava/lang/Class;
    //   54: invokevirtual 96	java/lang/Class:getName	()Ljava/lang/String;
    //   57: invokevirtual 100	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   60: pop
    //   61: aload_1
    //   62: ifnull +20 -> 82
    //   65: aload_1
    //   66: aload 4
    //   68: if_acmpeq +14 -> 82
    //   71: aload_1
    //   72: invokevirtual 104	android/view/View:getParent	()Landroid/view/ViewParent;
    //   75: checkcast 80	android/view/View
    //   78: astore_1
    //   79: goto -31 -> 48
    //   82: iconst_m1
    //   83: aload 5
    //   85: invokevirtual 108	java/util/ArrayList:size	()I
    //   88: iadd
    //   89: istore 7
    //   91: iload 7
    //   93: iflt +55 -> 148
    //   96: new 110	java/lang/StringBuilder
    //   99: dup
    //   100: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   103: astore 8
    //   105: aload 8
    //   107: aload_3
    //   108: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload 8
    //   114: aload 5
    //   116: iload 7
    //   118: invokevirtual 119	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   121: checkcast 121	java/lang/String
    //   124: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload 8
    //   130: ldc 123
    //   132: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload 8
    //   138: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: astore_3
    //   142: iinc 7 -1
    //   145: goto -54 -> 91
    //   148: aload_3
    //   149: ldc 123
    //   151: invokevirtual 130	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   154: ifeq +15 -> 169
    //   157: aload_3
    //   158: iconst_0
    //   159: iconst_m1
    //   160: aload_3
    //   161: invokevirtual 133	java/lang/String:length	()I
    //   164: iadd
    //   165: invokevirtual 137	java/lang/String:substring	(II)Ljava/lang/String;
    //   168: astore_3
    //   169: aload_3
    //   170: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	this	bf
    //   0	171	1	paramView	View
    //   0	171	2	paramActivity	Activity
    //   2	168	3	str	String
    //   31	36	4	localViewGroup	ViewGroup
    //   46	69	5	localArrayList	java.util.ArrayList
    //   89	54	7	i	int
    //   36	1	8	localException	Exception
    //   103	34	8	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   9	33	36	java/lang/Exception
  }
  
  /* Error */
  private void a(Activity paramActivity)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 71	android/app/Activity:getWindow	()Landroid/view/Window;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnonnull +4 -> 10
    //   9: return
    //   10: aload_2
    //   11: invokevirtual 77	android/view/Window:getDecorView	()Landroid/view/View;
    //   14: astore_3
    //   15: aload_3
    //   16: ifnonnull +4 -> 20
    //   19: return
    //   20: aload_3
    //   21: ldc 78
    //   23: invokevirtual 84	android/view/View:findViewById	(I)Landroid/view/View;
    //   26: checkcast 86	android/view/ViewGroup
    //   29: iconst_0
    //   30: invokevirtual 89	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   33: checkcast 86	android/view/ViewGroup
    //   36: astore 4
    //   38: goto +6 -> 44
    //   41: aconst_null
    //   42: astore 4
    //   44: aload 4
    //   46: ifnull +10 -> 56
    //   49: aload_0
    //   50: aload_1
    //   51: aload 4
    //   53: invokespecial 141	com/baidu/mobstat/bf:a	(Landroid/app/Activity;Landroid/view/ViewGroup;)V
    //   56: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	bf
    //   0	57	1	paramActivity	Activity
    //   4	7	2	localWindow	android.view.Window
    //   14	7	3	localView	View
    //   36	16	4	localViewGroup	ViewGroup
    //   41	1	5	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   20	38	41	java/lang/Exception
  }
  
  private void a(Activity paramActivity, View paramView)
  {
    if ((paramView instanceof Button))
    {
      String str = ((Button)paramView).getText().toString();
      if (TextUtils.isEmpty(str)) {
        return;
      }
      a(paramActivity, paramView, str);
    }
  }
  
  private void a(Activity paramActivity, View paramView, String paramString)
  {
    View.AccessibilityDelegate localAccessibilityDelegate = a(paramView);
    bh localbh = new bh(this, paramActivity, paramView, paramString, localAccessibilityDelegate);
    paramView.setAccessibilityDelegate(localbh);
  }
  
  private void a(Activity paramActivity, ViewGroup paramViewGroup)
  {
    for (int i = -1 + paramViewGroup.getChildCount(); i >= 0; i--)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup)) {
        a(paramActivity, (ViewGroup)localView);
      }
      a(paramActivity, localView);
    }
  }
  
  private void a(Activity paramActivity, boolean paramBoolean)
  {
    if ((paramActivity instanceof IIgnoreAutoTrace)) {
      return;
    }
    if (paramBoolean) {
      bv.a().a(paramActivity);
    }
    if (paramBoolean)
    {
      ch.a().a(paramActivity, System.currentTimeMillis(), true);
      return;
    }
    ch.a().a(paramActivity, System.currentTimeMillis(), true, null);
  }
  
  @TargetApi(14)
  private void a(Context paramContext, boolean paramBoolean)
  {
    if (this.d) {
      return;
    }
    if (Build.VERSION.SDK_INT < 14)
    {
      if (paramBoolean) {
        cz.a("module autotrace only support android os version bigger than 4.0");
      }
      return;
    }
    b(paramContext);
    this.d = true;
  }
  
  private void b(Activity paramActivity, View paramView, String paramString)
  {
    bv.a().a(paramActivity);
    String str1 = paramActivity.getClass().getName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append("_");
    localStringBuilder.append(paramView.hashCode());
    String str2 = localStringBuilder.toString();
    synchronized (this.a)
    {
      if (this.a.contains(str2)) {
        return;
      }
      String str3 = a(paramView, paramActivity);
      int i = Config.EventViewType.BUTTON.getValue();
      bm.a().a(paramActivity.getApplicationContext(), paramString, "", 1, System.currentTimeMillis(), str3, str1, i, true);
      return;
    }
  }
  
  /* Error */
  private void b(Context paramContext)
  {
    // Byte code:
    //   0: new 271	com/baidu/mobstat/bg
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 274	com/baidu/mobstat/bg:<init>	(Lcom/baidu/mobstat/bf;)V
    //   8: astore_2
    //   9: aload_1
    //   10: invokevirtual 277	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   13: checkcast 279	android/app/Application
    //   16: aload_2
    //   17: invokevirtual 283	android/app/Application:registerActivityLifecycleCallbacks	(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    //   20: return
    //   21: ldc_w 285
    //   24: invokestatic 221	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   27: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	this	bf
    //   0	28	1	paramContext	Context
    //   8	9	2	localbg	bg
    //   21	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   9	20	21	java/lang/Exception
  }
  
  public void a(Context paramContext)
  {
    a(paramContext, false);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */