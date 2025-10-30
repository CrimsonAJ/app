package co.notix;

import Y7.B;
import android.app.Activity;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class of implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.n f12882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rf f12883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12884c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O7.l f12885d;

    public of(kotlin.jvm.internal.n nVar, rf rfVar, long j, O7.l lVar) {
        this.f12882a = nVar;
        this.f12883b = rfVar;
        this.f12884c = j;
        this.f12885d = lVar;
    }

    @Override // b8.InterfaceC0726f
    public final Object emit(Object obj, E7.d dVar) {
        Activity activity = (Activity) obj;
        if (activity == null) {
            this.f12882a.f20158a = System.currentTimeMillis();
        } else {
            rf rfVar = this.f12883b;
            if (rfVar.f13112f) {
                rfVar.f13112f = false;
            } else if (System.currentTimeMillis() - this.f12882a.f20158a >= this.f12884c && !rf.a(this.f12883b, activity)) {
                B.r(this.f12883b.f13111e.f12782a, null, new nf(this.f12885d, null), 3);
            }
            this.f12882a.f20158a = Long.MAX_VALUE;
        }
        return A7.n.f558a;
    }
}
