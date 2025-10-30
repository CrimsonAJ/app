package l4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n3.C1635l;

/* loaded from: classes.dex */
public final class c implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20487a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20488b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Set f20489c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    public List f20490d = Collections.EMPTY_LIST;

    public final int b(C1635l c1635l) {
        int i9;
        synchronized (this.f20487a) {
            try {
                if (this.f20488b.containsKey(c1635l)) {
                    i9 = ((Integer) this.f20488b.get(c1635l)).intValue();
                } else {
                    i9 = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i9;
    }

    public final void c(C1635l c1635l) {
        synchronized (this.f20487a) {
            try {
                Integer num = (Integer) this.f20488b.get(c1635l);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f20490d);
                arrayList.remove(c1635l);
                this.f20490d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f20488b.remove(c1635l);
                    HashSet hashSet = new HashSet(this.f20489c);
                    hashSet.remove(c1635l);
                    this.f20489c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f20488b.put(c1635l, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f20487a) {
            it = this.f20490d.iterator();
        }
        return it;
    }
}
