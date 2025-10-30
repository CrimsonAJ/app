package n4;

import A4.r;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.AbstractC1449d;
import j3.M;
import java.nio.ByteBuffer;
import l4.y;

/* renamed from: n4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1651b extends AbstractC1449d {

    /* renamed from: m, reason: collision with root package name */
    public final m3.f f21150m;

    /* renamed from: n, reason: collision with root package name */
    public final r f21151n;

    /* renamed from: o, reason: collision with root package name */
    public long f21152o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC1650a f21153p;

    /* renamed from: q, reason: collision with root package name */
    public long f21154q;

    public C1651b() {
        super(6);
        this.f21150m = new m3.f(1);
        this.f21151n = new r(5, false);
    }

    @Override // j3.AbstractC1449d, j3.s0
    public final void d(int i9, Object obj) {
        if (i9 == 8) {
            this.f21153p = (InterfaceC1650a) obj;
        }
    }

    @Override // j3.AbstractC1449d
    public final String g() {
        return "CameraMotionRenderer";
    }

    @Override // j3.AbstractC1449d
    public final boolean i() {
        return h();
    }

    @Override // j3.AbstractC1449d
    public final boolean j() {
        return true;
    }

    @Override // j3.AbstractC1449d
    public final void k() {
        InterfaceC1650a interfaceC1650a = this.f21153p;
        if (interfaceC1650a != null) {
            interfaceC1650a.c();
        }
    }

    @Override // j3.AbstractC1449d
    public final void m(long j, boolean z9) {
        this.f21154q = Long.MIN_VALUE;
        InterfaceC1650a interfaceC1650a = this.f21153p;
        if (interfaceC1650a != null) {
            interfaceC1650a.c();
        }
    }

    @Override // j3.AbstractC1449d
    public final void q(M[] mArr, long j, long j4) {
        this.f21152o = j4;
    }

    @Override // j3.AbstractC1449d
    public final void s(long j, long j4) {
        float[] fArr;
        while (!h() && this.f21154q < 100000 + j) {
            m3.f fVar = this.f21150m;
            fVar.r();
            O0.c cVar = this.f19585b;
            cVar.j();
            if (r(cVar, fVar, 0) == -4 && !fVar.e(4)) {
                this.f21154q = fVar.f20706f;
                if (this.f21153p != null && !fVar.e(Integer.MIN_VALUE)) {
                    fVar.u();
                    ByteBuffer byteBuffer = fVar.f20704d;
                    int i9 = y.f20553a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        r rVar = this.f21151n;
                        rVar.F(limit, array);
                        rVar.H(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i10 = 0; i10 < 3; i10++) {
                            fArr2[i10] = Float.intBitsToFloat(rVar.k());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f21153p.b(this.f21154q - this.f21152o, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // j3.AbstractC1449d
    public final int w(M m9) {
        if ("application/x-camera-motion".equals(m9.f19435l)) {
            return AbstractC0953k1.e(4, 0, 0);
        }
        return AbstractC0953k1.e(0, 0, 0);
    }
}
