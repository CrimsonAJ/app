package androidx.databinding;

import W.a;
import W.g;
import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f9617a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f9618b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f9619c = new CopyOnWriteArrayList();

    @Override // W.a
    public final g b(View view, int i9) {
        Iterator it = this.f9618b.iterator();
        while (it.hasNext()) {
            g b9 = ((a) it.next()).b(view, i9);
            if (b9 != null) {
                return b9;
            }
        }
        if (e()) {
            return b(view, i9);
        }
        return null;
    }

    @Override // W.a
    public final g c(View[] viewArr, int i9) {
        Iterator it = this.f9618b.iterator();
        while (it.hasNext()) {
            g c3 = ((a) it.next()).c(viewArr, i9);
            if (c3 != null) {
                return c3;
            }
        }
        if (e()) {
            return c(viewArr, i9);
        }
        return null;
    }

    public final void d(a aVar) {
        if (this.f9617a.add(aVar.getClass())) {
            this.f9618b.add(aVar);
            Iterator it = aVar.a().iterator();
            while (it.hasNext()) {
                d((a) it.next());
            }
        }
    }

    public final boolean e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9619c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (a.class.isAssignableFrom(cls)) {
                    d((a) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z9 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e8) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e8);
            } catch (InstantiationException e9) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e9);
            }
        }
        return z9;
    }
}
