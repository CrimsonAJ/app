package o7;

import java.util.Map;

/* renamed from: o7.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1728t implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public C1728t f21717a;

    /* renamed from: b, reason: collision with root package name */
    public C1728t f21718b;

    /* renamed from: c, reason: collision with root package name */
    public C1728t f21719c;

    /* renamed from: d, reason: collision with root package name */
    public C1728t f21720d;

    /* renamed from: e, reason: collision with root package name */
    public C1728t f21721e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f21722f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21723g;

    /* renamed from: h, reason: collision with root package name */
    public Object f21724h;

    /* renamed from: i, reason: collision with root package name */
    public int f21725i;

    public C1728t() {
        this.f21722f = null;
        this.f21723g = -1;
        this.f21721e = this;
        this.f21720d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f21722f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f21724h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21722f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21724h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Object obj = this.f21722f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f21724h;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        return i9 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f21724h;
        this.f21724h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f21722f + "=" + this.f21724h;
    }

    public C1728t(C1728t c1728t, Object obj, int i9, C1728t c1728t2, C1728t c1728t3) {
        this.f21717a = c1728t;
        this.f21722f = obj;
        this.f21723g = i9;
        this.f21725i = 1;
        this.f21720d = c1728t2;
        this.f21721e = c1728t3;
        c1728t3.f21720d = this;
        c1728t2.f21721e = this;
    }
}
