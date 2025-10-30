package s6;

import A6.r;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import t6.EnumC2026k;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final c7.l f22754h = new c7.l(2);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22755a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f22756b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22757c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f22758d;

    /* renamed from: e, reason: collision with root package name */
    public final j f22759e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f22760f;

    /* renamed from: g, reason: collision with root package name */
    public final d0.o f22761g;

    public e(ArrayList arrayList, ArrayList arrayList2, d0.o oVar) {
        int i9 = 0;
        EnumC2026k enumC2026k = EnumC2026k.f23318a;
        this.f22755a = new HashMap();
        this.f22756b = new HashMap();
        this.f22757c = new HashMap();
        this.f22758d = new HashSet();
        this.f22760f = new AtomicReference();
        j jVar = new j();
        this.f22759e = jVar;
        this.f22761g = oVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C1962b.c(jVar, j.class, P6.c.class, P6.b.class));
        arrayList3.add(C1962b.c(this, e.class, new Class[0]));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            C1962b c1962b = (C1962b) obj;
            if (c1962b != null) {
                arrayList3.add(c1962b);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((S6.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f22761g.k(componentRegistrar));
                        it.remove();
                    }
                } catch (k e8) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e8);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C1962b) it2.next()).f22748b.toArray();
                int length = array.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        Object obj3 = array[i12];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f22758d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f22758d.add(obj3.toString());
                        }
                        i12++;
                    }
                }
            }
            if (this.f22755a.isEmpty()) {
                O4.h.q(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f22755a.keySet());
                arrayList6.addAll(arrayList3);
                O4.h.q(arrayList6);
            }
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                C1962b c1962b2 = (C1962b) obj4;
                this.f22755a.put(c1962b2, new l(new Q6.c(this, 2, c1962b2)));
            }
            arrayList5.addAll(f(arrayList3));
            arrayList5.addAll(j());
            c();
        }
        int size4 = arrayList5.size();
        while (i9 < size4) {
            Object obj5 = arrayList5.get(i9);
            i9++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f22760f.get();
        if (bool != null) {
            a(this.f22755a, bool.booleanValue());
        }
    }

    public final void a(HashMap hashMap, boolean z9) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            C1962b c1962b = (C1962b) entry.getKey();
            S6.b bVar = (S6.b) entry.getValue();
            int i9 = c1962b.f22750d;
            if (i9 == 1 || (i9 == 2 && z9)) {
                bVar.get();
            }
        }
        j jVar = this.f22759e;
        synchronized (jVar) {
            arrayDeque = jVar.f22771b;
            if (arrayDeque != null) {
                jVar.f22771b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw A0.a.h(it);
            }
        }
    }

    @Override // s6.c
    public final Object b(Class cls) {
        return d(p.a(cls));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [s6.m, java.lang.Object] */
    public final void c() {
        boolean z9;
        for (C1962b c1962b : this.f22755a.keySet()) {
            for (h hVar : c1962b.f22749c) {
                if (hVar.f22768b == 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                p pVar = hVar.f22767a;
                if (z9) {
                    HashMap hashMap = this.f22757c;
                    if (!hashMap.containsKey(pVar)) {
                        Set set = Collections.EMPTY_SET;
                        ?? obj = new Object();
                        obj.f22777b = null;
                        obj.f22776a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.f22776a.addAll(set);
                        hashMap.put(pVar, obj);
                    }
                }
                HashMap hashMap2 = this.f22756b;
                if (hashMap2.containsKey(pVar)) {
                    continue;
                } else {
                    int i9 = hVar.f22768b;
                    if (i9 != 1) {
                        if (i9 != 2) {
                            hashMap2.put(pVar, new n(n.f22778c, n.f22779d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + c1962b + ": " + pVar);
                    }
                }
            }
        }
    }

    @Override // s6.c
    public final Object d(p pVar) {
        S6.b i9 = i(pVar);
        if (i9 == null) {
            return null;
        }
        return i9.get();
    }

    @Override // s6.c
    public final Set e(p pVar) {
        S6.b bVar;
        synchronized (this) {
            bVar = (m) this.f22757c.get(pVar);
            if (bVar == null) {
                bVar = f22754h;
            }
        }
        return (Set) bVar.get();
    }

    public final ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C1962b c1962b = (C1962b) obj;
            if (c1962b.f22751e == 0) {
                S6.b bVar = (S6.b) this.f22755a.get(c1962b);
                for (p pVar : c1962b.f22748b) {
                    HashMap hashMap = this.f22756b;
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, bVar);
                    } else {
                        arrayList2.add(new r((n) ((S6.b) hashMap.get(pVar)), 24, bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // s6.c
    public final n g(p pVar) {
        S6.b i9 = i(pVar);
        if (i9 == null) {
            return new n(n.f22778c, n.f22779d);
        }
        if (i9 instanceof n) {
            return (n) i9;
        }
        return new n(null, i9);
    }

    @Override // s6.c
    public final S6.b h(Class cls) {
        return i(p.a(cls));
    }

    @Override // s6.c
    public final synchronized S6.b i(p pVar) {
        Z0.a.d(pVar, "Null interface requested.");
        return (S6.b) this.f22756b.get(pVar);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [s6.m, java.lang.Object] */
    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f22755a.entrySet()) {
            C1962b c1962b = (C1962b) entry.getKey();
            if (c1962b.f22751e != 0) {
                S6.b bVar = (S6.b) entry.getValue();
                for (p pVar : c1962b.f22748b) {
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, new HashSet());
                    }
                    ((Set) hashMap.get(pVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f22757c;
            if (!hashMap2.containsKey(key)) {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ?? obj = new Object();
                obj.f22777b = null;
                obj.f22776a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f22776a.addAll(set);
                hashMap2.put(pVar2, obj);
            } else {
                m mVar = (m) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new r(mVar, 25, (S6.b) it.next()));
                }
            }
        }
        return arrayList;
    }
}
