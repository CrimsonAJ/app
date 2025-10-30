package P3;

import A4.r;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.M;
import k4.InterfaceC1510j;
import l4.y;
import q3.C1904i;
import q3.t;
import q3.u;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final int f5823a;

    /* renamed from: b, reason: collision with root package name */
    public final M f5824b;

    /* renamed from: c, reason: collision with root package name */
    public final C1904i f5825c = new C1904i();

    /* renamed from: d, reason: collision with root package name */
    public M f5826d;

    /* renamed from: e, reason: collision with root package name */
    public u f5827e;

    /* renamed from: f, reason: collision with root package name */
    public long f5828f;

    public c(int i9, int i10, M m9) {
        this.f5823a = i10;
        this.f5824b = m9;
    }

    @Override // q3.u
    public final int a(InterfaceC1510j interfaceC1510j, int i9, boolean z9) {
        u uVar = this.f5827e;
        int i10 = y.f20553a;
        return uVar.a(interfaceC1510j, i9, z9);
    }

    @Override // q3.u
    public final void b(int i9, r rVar) {
        u uVar = this.f5827e;
        int i10 = y.f20553a;
        uVar.c(i9, rVar);
    }

    @Override // q3.u
    public final /* synthetic */ void c(int i9, r rVar) {
        AbstractC0953k1.a(this, rVar, i9);
    }

    @Override // q3.u
    public final void d(long j, int i9, int i10, int i11, t tVar) {
        long j4 = this.f5828f;
        if (j4 != -9223372036854775807L && j >= j4) {
            this.f5827e = this.f5825c;
        }
        u uVar = this.f5827e;
        int i12 = y.f20553a;
        uVar.d(j, i9, i10, i11, tVar);
    }

    @Override // q3.u
    public final void e(M m9) {
        M m10 = this.f5824b;
        if (m10 != null) {
            m9 = m9.c(m10);
        }
        this.f5826d = m9;
        u uVar = this.f5827e;
        int i9 = y.f20553a;
        uVar.e(m9);
    }
}
