package com.android.cglib.dx;

import com.android.cglib.dx.c.b.b;
import com.android.cglib.dx.c.b.f;
import com.android.cglib.dx.c.b.g;
import com.android.cglib.dx.d.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Label
{
  final List<f> a = new ArrayList();
  Code b;
  boolean c = false;
  List<Label> d = Collections.emptyList();
  Label e;
  Label f;
  int g = -1;
  
  boolean a()
  {
    return this.a.isEmpty();
  }
  
  void b()
  {
    for (int i = 0; i < this.d.size(); i++) {
      while (((Label)this.d.get(i)).a()) {
        this.d.set(i, ((Label)this.d.get(i)).e);
      }
    }
    while ((this.e != null) && (this.e.a())) {
      this.e = this.e.e;
    }
    while ((this.f != null) && (this.f.a())) {
      this.f = this.f.e;
    }
  }
  
  b c()
  {
    g localg = new g(this.a.size());
    for (int i = 0; i < this.a.size(); i++) {
      localg.a(i, (f)this.a.get(i));
    }
    localg.e();
    int j = -1;
    k localk = new k();
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      localk.b(((Label)localIterator.next()).g);
    }
    if (this.e != null)
    {
      j = this.e.g;
      localk.b(j);
    }
    if (this.f != null) {
      localk.b(this.f.g);
    }
    localk.e();
    return new b(this.g, localg, localk, j);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\Label.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */