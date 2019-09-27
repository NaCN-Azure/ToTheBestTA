package android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a.a.a.a.a.a.a;
import com.luajava.LuaException;
import com.luajava.LuaFunction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListAdapter<T>
  extends BaseAdapter
  implements Filterable
{
  private ArrayList<T> a;
  private final Object b = new Object();
  private int c;
  private int d;
  private int e = 0;
  private boolean f = true;
  private Context g;
  private ArrayList<T> h;
  private ArrayListAdapter<T>.ArrayFilter i;
  private LayoutInflater j;
  private LuaFunction k;
  
  public ArrayListAdapter(Context paramContext)
  {
    a(paramContext, 17367043, 0, new ArrayList());
  }
  
  public ArrayListAdapter(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, 0, new ArrayList());
  }
  
  public ArrayListAdapter(Context paramContext, int paramInt1, int paramInt2)
  {
    a(paramContext, paramInt1, paramInt2, new ArrayList());
  }
  
  public ArrayListAdapter(Context paramContext, int paramInt1, int paramInt2, List<T> paramList)
  {
    a(paramContext, paramInt1, paramInt2, paramList);
  }
  
  public ArrayListAdapter(Context paramContext, int paramInt1, int paramInt2, T[] paramArrayOfT)
  {
    a(paramContext, paramInt1, paramInt2, Arrays.asList(paramArrayOfT));
  }
  
  public ArrayListAdapter(Context paramContext, int paramInt, List<T> paramList)
  {
    a(paramContext, paramInt, 0, paramList);
  }
  
  public ArrayListAdapter(Context paramContext, int paramInt, T[] paramArrayOfT)
  {
    a(paramContext, paramInt, 0, Arrays.asList(paramArrayOfT));
  }
  
  public ArrayListAdapter(Context paramContext, List<T> paramList)
  {
    a(paramContext, 17367043, 0, paramList);
  }
  
  public ArrayListAdapter(Context paramContext, T[] paramArrayOfT)
  {
    a(paramContext, 17367043, 0, Arrays.asList(paramArrayOfT));
  }
  
  /* Error */
  private View a(int paramInt1, View paramView, ViewGroup paramViewGroup, int paramInt2)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +15 -> 16
    //   4: aload_0
    //   5: getfield 67	android/widget/ArrayListAdapter:j	Landroid/view/LayoutInflater;
    //   8: iload 4
    //   10: aload_3
    //   11: iconst_0
    //   12: invokevirtual 73	android/view/LayoutInflater:inflate	(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 40	android/widget/ArrayListAdapter:e	I
    //   20: ifne +12 -> 32
    //   23: aload_2
    //   24: checkcast 75	android/widget/TextView
    //   27: astore 7
    //   29: goto +16 -> 45
    //   32: aload_2
    //   33: aload_0
    //   34: getfield 40	android/widget/ArrayListAdapter:e	I
    //   37: invokevirtual 81	android/view/View:findViewById	(I)Landroid/view/View;
    //   40: checkcast 75	android/widget/TextView
    //   43: astore 7
    //   45: aload_0
    //   46: iload_1
    //   47: invokevirtual 85	android/widget/ArrayListAdapter:getItem	(I)Ljava/lang/Object;
    //   50: astore 8
    //   52: aload 8
    //   54: instanceof 87
    //   57: ifeq +19 -> 76
    //   60: aload 8
    //   62: checkcast 87	java/lang/CharSequence
    //   65: astore 9
    //   67: aload 7
    //   69: aload 9
    //   71: invokevirtual 91	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   74: aload_2
    //   75: areturn
    //   76: aload 8
    //   78: invokevirtual 95	java/lang/Object:toString	()Ljava/lang/String;
    //   81: astore 9
    //   83: goto -16 -> 67
    //   86: astore 5
    //   88: ldc 97
    //   90: ldc 99
    //   92: invokestatic 104	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   95: pop
    //   96: new 106	java/lang/IllegalStateException
    //   99: dup
    //   100: ldc 108
    //   102: aload 5
    //   104: invokespecial 111	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   107: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	ArrayListAdapter
    //   0	108	1	paramInt1	int
    //   0	108	2	paramView	View
    //   0	108	3	paramViewGroup	ViewGroup
    //   0	108	4	paramInt2	int
    //   86	17	5	localClassCastException	ClassCastException
    //   27	41	7	localTextView	TextView
    //   50	27	8	localObject1	Object
    //   65	17	9	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   16	29	86	java/lang/ClassCastException
    //   32	45	86	java/lang/ClassCastException
  }
  
  private void a(Context paramContext, int paramInt1, int paramInt2, List<T> paramList)
  {
    this.g = paramContext;
    this.j = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    this.d = paramInt1;
    this.c = paramInt1;
    this.a = new ArrayList(paramList);
    this.e = paramInt2;
  }
  
  public static ArrayListAdapter<CharSequence> createFromResource(Context paramContext, int paramInt1, int paramInt2)
  {
    return new ArrayListAdapter(paramContext, paramInt2, paramContext.getResources().getTextArray(paramInt1));
  }
  
  public void add(T paramT)
  {
    synchronized (this.b)
    {
      if (this.h != null) {}
      for (ArrayList localArrayList = this.h;; localArrayList = this.a)
      {
        localArrayList.add(paramT);
        break;
      }
      if (this.f) {
        notifyDataSetChanged();
      }
      return;
    }
  }
  
  public void addAll(Collection<? extends T> paramCollection)
  {
    synchronized (this.b)
    {
      if (this.h != null) {}
      for (ArrayList localArrayList = this.h;; localArrayList = this.a)
      {
        localArrayList.addAll(paramCollection);
        break;
      }
      if (this.f) {
        notifyDataSetChanged();
      }
      return;
    }
  }
  
  public void addAll(T... paramVarArgs)
  {
    synchronized (this.b)
    {
      if (this.h != null) {}
      for (ArrayList localArrayList = this.h;; localArrayList = this.a)
      {
        Collections.addAll(localArrayList, paramVarArgs);
        break;
      }
      if (this.f) {
        notifyDataSetChanged();
      }
      return;
    }
  }
  
  public void clear()
  {
    synchronized (this.b)
    {
      if (this.h != null) {}
      for (ArrayList localArrayList = this.h;; localArrayList = this.a)
      {
        localArrayList.clear();
        break;
      }
      if (this.f) {
        notifyDataSetChanged();
      }
      return;
    }
  }
  
  public void filter(CharSequence paramCharSequence)
  {
    getFilter().filter(paramCharSequence);
  }
  
  public Context getContext()
  {
    return this.g;
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public Object getData()
  {
    return this.a;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return a(paramInt, paramView, paramViewGroup, this.d);
  }
  
  public Filter getFilter()
  {
    if (this.i == null) {
      this.i = new ArrayFilter(null);
    }
    return this.i;
  }
  
  public T getItem(int paramInt)
  {
    return (T)this.a.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt + 1;
  }
  
  public int getPosition(T paramT)
  {
    return this.a.indexOf(paramT);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return a(paramInt, paramView, paramViewGroup, this.c);
  }
  
  public void insert(int paramInt, T paramT)
  {
    synchronized (this.b)
    {
      if (this.h != null) {}
      for (ArrayList localArrayList = this.h;; localArrayList = this.a)
      {
        localArrayList.add(paramInt, paramT);
        break;
      }
      if (this.f) {
        notifyDataSetChanged();
      }
      return;
    }
  }
  
  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    this.f = true;
  }
  
  public void remove(int paramInt)
  {
    synchronized (this.b)
    {
      if (this.h != null) {}
      for (ArrayList localArrayList = this.h;; localArrayList = this.a)
      {
        localArrayList.remove(paramInt);
        break;
      }
      if (this.f) {
        notifyDataSetChanged();
      }
      return;
    }
  }
  
  public void remove(T paramT)
  {
    synchronized (this.b)
    {
      if (this.h != null) {}
      for (ArrayList localArrayList = this.h;; localArrayList = this.a)
      {
        localArrayList.remove(paramT);
        break;
      }
      if (this.f) {
        notifyDataSetChanged();
      }
      return;
    }
  }
  
  public void setDropDownViewResource(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void setFilter(LuaFunction paramLuaFunction)
  {
    this.k = paramLuaFunction;
  }
  
  public void setNotifyOnChange(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void sort(Comparator<? super T> paramComparator)
  {
    synchronized (this.b)
    {
      if (this.h != null) {}
      for (ArrayList localArrayList = this.h;; localArrayList = this.a)
      {
        Collections.sort(localArrayList, paramComparator);
        break;
      }
      if (this.f) {
        notifyDataSetChanged();
      }
      return;
    }
  }
  
  private class ArrayFilter
    extends Filter
  {
    private ArrayFilter() {}
    
    protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
    {
      Filter.FilterResults localFilterResults = new Filter.FilterResults();
      if (ArrayListAdapter.a(ArrayListAdapter.this) == null) {
        synchronized (ArrayListAdapter.b(ArrayListAdapter.this))
        {
          ArrayListAdapter.a(ArrayListAdapter.this, new ArrayList(ArrayListAdapter.c(ArrayListAdapter.this)));
        }
      }
      if (TextUtils.isEmpty(paramCharSequence))
      {
        localFilterResults.values = new ArrayList(ArrayListAdapter.a(ArrayListAdapter.this));
        localFilterResults.count = ArrayListAdapter.a(ArrayListAdapter.this).size();
        ArrayListAdapter.a(ArrayListAdapter.this, null);
        return localFilterResults;
      }
      LuaFunction localLuaFunction1 = ArrayListAdapter.d(ArrayListAdapter.this);
      int i = 0;
      if (localLuaFunction1 != null)
      {
        ArrayList localArrayList1 = new ArrayList();
        try
        {
          LuaFunction localLuaFunction2 = ArrayListAdapter.d(ArrayListAdapter.this);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = new ArrayList(ArrayListAdapter.a(ArrayListAdapter.this));
          arrayOfObject[1] = localArrayList1;
          arrayOfObject[2] = paramCharSequence;
          localLuaFunction2.call(arrayOfObject);
        }
        catch (LuaException localLuaException)
        {
          a.a(localLuaException);
        }
        localFilterResults.values = localArrayList1;
        localFilterResults.count = localArrayList1.size();
        return localFilterResults;
      }
      int j;
      if ((paramCharSequence != null) && (paramCharSequence.length() != 0))
      {
        String str = paramCharSequence.toString().toLowerCase();
        synchronized (ArrayListAdapter.b(ArrayListAdapter.this))
        {
          ArrayList localArrayList3 = new ArrayList(ArrayListAdapter.a(ArrayListAdapter.this));
          int k = localArrayList3.size();
          ArrayList localArrayList4 = new ArrayList();
          while (i < k)
          {
            Object localObject5 = localArrayList3.get(i);
            if (localObject5.toString().toLowerCase().contains(str)) {
              localArrayList4.add(localObject5);
            }
            i++;
          }
          localFilterResults.values = localArrayList4;
          j = localArrayList4.size();
        }
      }
      synchronized (ArrayListAdapter.b(ArrayListAdapter.this))
      {
        ArrayList localArrayList2 = new ArrayList(ArrayListAdapter.a(ArrayListAdapter.this));
        localFilterResults.values = localArrayList2;
        j = localArrayList2.size();
        localFilterResults.count = j;
        return localFilterResults;
      }
    }
    
    protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
    {
      ArrayListAdapter.b(ArrayListAdapter.this, (ArrayList)paramFilterResults.values);
      if (paramFilterResults.count > 0)
      {
        ArrayListAdapter.this.notifyDataSetChanged();
        return;
      }
      ArrayListAdapter.this.notifyDataSetInvalidated();
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\android\widget\ArrayListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */