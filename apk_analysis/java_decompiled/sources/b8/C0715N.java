package b8;

import Y7.C0464h;
import c8.AbstractC0792b;
import c8.AbstractC0794d;

/* renamed from: b8.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715N extends AbstractC0794d {

    /* renamed from: a, reason: collision with root package name */
    public long f11444a;

    /* renamed from: b, reason: collision with root package name */
    public C0464h f11445b;

    @Override // c8.AbstractC0794d
    public final boolean a(AbstractC0792b abstractC0792b) {
        C0713L c0713l = (C0713L) abstractC0792b;
        if (this.f11444a >= 0) {
            return false;
        }
        long j = c0713l.f11438i;
        if (j < c0713l.j) {
            c0713l.j = j;
        }
        this.f11444a = j;
        return true;
    }

    @Override // c8.AbstractC0794d
    public final E7.d[] b(AbstractC0792b abstractC0792b) {
        long j = this.f11444a;
        this.f11444a = -1L;
        this.f11445b = null;
        return ((C0713L) abstractC0792b).s(j);
    }
}
