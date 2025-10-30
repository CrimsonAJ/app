package B3;

import com.google.android.gms.internal.measurement.Y1;
import q3.C1902g;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class d implements InterfaceC1905j {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1907l f662a;

    /* renamed from: b, reason: collision with root package name */
    public u f663b;

    /* renamed from: c, reason: collision with root package name */
    public int f664c;

    /* renamed from: d, reason: collision with root package name */
    public long f665d;

    /* renamed from: e, reason: collision with root package name */
    public b f666e;

    /* renamed from: f, reason: collision with root package name */
    public int f667f;

    /* renamed from: g, reason: collision with root package name */
    public long f668g;

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        int i9;
        if (j == 0) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        this.f664c = i9;
        b bVar = this.f666e;
        if (bVar != null) {
            bVar.b(j4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0191, code lost:
    
        if (r6 != 65534) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bb  */
    /* JADX WARN: Type inference failed for: r4v5, types: [B3.e, java.lang.Object] */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(q3.InterfaceC1906k r23, c7.C0790j r24) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.d.f(q3.k, c7.j):int");
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f662a = interfaceC1907l;
        this.f663b = interfaceC1907l.u(0, 1);
        interfaceC1907l.i();
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        return Y1.h((C1902g) interfaceC1906k);
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
