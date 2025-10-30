package s6;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1961a {

    /* renamed from: a, reason: collision with root package name */
    public String f22740a = null;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f22741b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f22742c;

    /* renamed from: d, reason: collision with root package name */
    public int f22743d;

    /* renamed from: e, reason: collision with root package name */
    public int f22744e;

    /* renamed from: f, reason: collision with root package name */
    public d f22745f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f22746g;

    public C1961a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f22741b = hashSet;
        this.f22742c = new HashSet();
        this.f22743d = 0;
        this.f22744e = 0;
        this.f22746g = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            Z0.a.d(cls2, "Null interface");
            this.f22741b.add(p.a(cls2));
        }
    }

    public final void a(h hVar) {
        if (!this.f22741b.contains(hVar.f22767a)) {
            this.f22742c.add(hVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final C1962b b() {
        boolean z9;
        if (this.f22745f != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return new C1962b(this.f22740a, new HashSet(this.f22741b), new HashSet(this.f22742c), this.f22743d, this.f22744e, this.f22745f, this.f22746g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i9) {
        boolean z9;
        if (this.f22743d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f22743d = i9;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public C1961a(p pVar, p[] pVarArr) {
        HashSet hashSet = new HashSet();
        this.f22741b = hashSet;
        this.f22742c = new HashSet();
        this.f22743d = 0;
        this.f22744e = 0;
        this.f22746g = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            Z0.a.d(pVar2, "Null interface");
        }
        Collections.addAll(this.f22741b, pVarArr);
    }
}
