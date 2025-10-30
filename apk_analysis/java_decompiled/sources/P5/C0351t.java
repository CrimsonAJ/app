package P5;

import java.util.Map;

/* renamed from: P5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351t extends AbstractC0345m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5998a;

    /* renamed from: b, reason: collision with root package name */
    public int f5999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0352u f6000c;

    public C0351t(C0352u c0352u, int i9) {
        this.f6000c = c0352u;
        Object obj = C0352u.j;
        this.f5998a = c0352u.j()[i9];
        this.f5999b = i9;
    }

    public final void a() {
        int i9 = this.f5999b;
        Object obj = this.f5998a;
        C0352u c0352u = this.f6000c;
        if (i9 != -1 && i9 < c0352u.size()) {
            if (M4.a.l(obj, c0352u.j()[this.f5999b])) {
                return;
            }
        }
        Object obj2 = C0352u.j;
        this.f5999b = c0352u.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5998a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0352u c0352u = this.f6000c;
        Map c3 = c0352u.c();
        if (c3 != null) {
            return c3.get(this.f5998a);
        }
        a();
        int i9 = this.f5999b;
        if (i9 == -1) {
            return null;
        }
        return c0352u.k()[i9];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0352u c0352u = this.f6000c;
        Map c3 = c0352u.c();
        Object obj2 = this.f5998a;
        if (c3 != null) {
            return c3.put(obj2, obj);
        }
        a();
        int i9 = this.f5999b;
        if (i9 == -1) {
            c0352u.put(obj2, obj);
            return null;
        }
        Object obj3 = c0352u.k()[i9];
        c0352u.k()[this.f5999b] = obj;
        return obj3;
    }
}
