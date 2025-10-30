package f1;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import e1.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.C1613j;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17274a = q.j("Schedulers");

    public static void a(e1.b bVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            G6.e v8 = workDatabase.v();
            workDatabase.c();
            try {
                int i9 = Build.VERSION.SDK_INT;
                int i10 = bVar.f17029h;
                if (i9 == 23) {
                    i10 /= 2;
                }
                ArrayList f9 = v8.f(i10);
                ArrayList d9 = v8.d();
                if (f9.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int size = f9.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = f9.get(i11);
                        i11++;
                        v8.o(currentTimeMillis, ((C1613j) obj).f21031a);
                    }
                }
                workDatabase.p();
                workDatabase.m();
                if (f9.size() > 0) {
                    C1613j[] c1613jArr = (C1613j[]) f9.toArray(new C1613j[f9.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC1161c interfaceC1161c = (InterfaceC1161c) it.next();
                        if (interfaceC1161c.f()) {
                            interfaceC1161c.d(c1613jArr);
                        }
                    }
                }
                if (d9.size() > 0) {
                    C1613j[] c1613jArr2 = (C1613j[]) d9.toArray(new C1613j[d9.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1161c interfaceC1161c2 = (InterfaceC1161c) it2.next();
                        if (!interfaceC1161c2.f()) {
                            interfaceC1161c2.d(c1613jArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.m();
                throw th;
            }
        }
    }
}
