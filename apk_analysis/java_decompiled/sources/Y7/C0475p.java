package Y7;

import java.util.concurrent.CancellationException;

/* renamed from: Y7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8832a;

    /* renamed from: b, reason: collision with root package name */
    public final C0460f f8833b;

    /* renamed from: c, reason: collision with root package name */
    public final O7.l f8834c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8835d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f8836e;

    public C0475p(Object obj, C0460f c0460f, O7.l lVar, Object obj2, Throwable th) {
        this.f8832a = obj;
        this.f8833b = c0460f;
        this.f8834c = lVar;
        this.f8835d = obj2;
        this.f8836e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0475p a(C0475p c0475p, C0460f c0460f, CancellationException cancellationException, int i9) {
        Object obj = c0475p.f8832a;
        if ((i9 & 2) != 0) {
            c0460f = c0475p.f8833b;
        }
        C0460f c0460f2 = c0460f;
        O7.l lVar = c0475p.f8834c;
        Object obj2 = c0475p.f8835d;
        CancellationException cancellationException2 = cancellationException;
        if ((i9 & 16) != 0) {
            cancellationException2 = c0475p.f8836e;
        }
        c0475p.getClass();
        return new C0475p(obj, c0460f2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0475p)) {
            return false;
        }
        C0475p c0475p = (C0475p) obj;
        if (kotlin.jvm.internal.h.a(this.f8832a, c0475p.f8832a) && kotlin.jvm.internal.h.a(this.f8833b, c0475p.f8833b) && kotlin.jvm.internal.h.a(this.f8834c, c0475p.f8834c) && kotlin.jvm.internal.h.a(this.f8835d, c0475p.f8835d) && kotlin.jvm.internal.h.a(this.f8836e, c0475p.f8836e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i9 = 0;
        Object obj = this.f8832a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        C0460f c0460f = this.f8833b;
        if (c0460f == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0460f.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        O7.l lVar = this.f8834c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Object obj2 = this.f8835d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Throwable th = this.f8836e;
        if (th != null) {
            i9 = th.hashCode();
        }
        return i13 + i9;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f8832a + ", cancelHandler=" + this.f8833b + ", onCancellation=" + this.f8834c + ", idempotentResume=" + this.f8835d + ", cancelCause=" + this.f8836e + ')';
    }

    public /* synthetic */ C0475p(Object obj, C0460f c0460f, O7.l lVar, CancellationException cancellationException, int i9) {
        this(obj, (i9 & 2) != 0 ? null : c0460f, (i9 & 4) != 0 ? null : lVar, (Object) null, (i9 & 16) != 0 ? null : cancellationException);
    }
}
