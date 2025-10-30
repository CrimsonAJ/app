package D4;

import F4.AbstractC0126e;
import F4.C0127f;
import F4.C0131j;
import F4.C0132k;
import F4.C0133l;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import f5.AbstractC1176h;
import f5.C1185q;
import f5.InterfaceC1171c;
import java.util.Locale;
import l6.AbstractC1570b;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class z implements InterfaceC1171c, V3.h {

    /* renamed from: a, reason: collision with root package name */
    public long f1905a;

    /* renamed from: b, reason: collision with root package name */
    public long f1906b;

    /* renamed from: c, reason: collision with root package name */
    public int f1907c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1908d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1909e;

    public z(C0088g c0088g, int i9, C0083b c0083b, long j, long j4) {
        this.f1908d = c0088g;
        this.f1907c = i9;
        this.f1909e = c0083b;
        this.f1905a = j;
        this.f1906b = j4;
    }

    public static C0127f a(t tVar, AbstractC0126e abstractC0126e, int i9) {
        C0127f c0127f;
        F4.F f9 = abstractC0126e.f2389w;
        if (f9 == null) {
            c0127f = null;
        } else {
            c0127f = f9.f2340d;
        }
        if (c0127f != null && c0127f.f2392b) {
            int[] iArr = c0127f.f2394d;
            int i10 = 0;
            if (iArr == null) {
                int[] iArr2 = c0127f.f2396f;
                if (iArr2 != null) {
                    while (i10 < iArr2.length) {
                        if (iArr2[i10] == i9) {
                            return null;
                        }
                        i10++;
                    }
                }
            } else {
                while (i10 < iArr.length) {
                    if (iArr[i10] != i9) {
                        i10++;
                    }
                }
            }
            if (tVar.f1891p < c0127f.f2395e) {
                return c0127f;
            }
        }
        return null;
    }

    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h abstractC1176h) {
        boolean z9;
        int i9;
        int i10;
        int i11;
        int i12;
        long j;
        long j4;
        if (((C0088g) this.f1908d).b()) {
            C0133l c0133l = (C0133l) C0132k.c().f2424a;
            if (c0133l == null || c0133l.f2426b) {
                t tVar = (t) ((C0088g) this.f1908d).j.get((C0083b) this.f1909e);
                if (tVar != null) {
                    Object obj = tVar.f1882f;
                    if (obj instanceof AbstractC0126e) {
                        AbstractC0126e abstractC0126e = (AbstractC0126e) obj;
                        boolean z10 = true;
                        int i13 = 0;
                        if (this.f1905a > 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i14 = abstractC0126e.f2384r;
                        int i15 = 100;
                        if (c0133l != null) {
                            z9 &= c0133l.f2427c;
                            int i16 = c0133l.f2428d;
                            int i17 = c0133l.f2429e;
                            i9 = c0133l.f2425a;
                            if (abstractC0126e.f2389w != null && !abstractC0126e.g()) {
                                C0127f a5 = a(tVar, abstractC0126e, this.f1907c);
                                if (a5 != null) {
                                    if (!a5.f2393c || this.f1905a <= 0) {
                                        z10 = false;
                                    }
                                    i17 = a5.f2395e;
                                    z9 = z10;
                                } else {
                                    return;
                                }
                            }
                            i11 = i16;
                            i10 = i17;
                        } else {
                            i9 = 0;
                            i10 = 100;
                            i11 = 5000;
                        }
                        C0088g c0088g = (C0088g) this.f1908d;
                        int i18 = -1;
                        if (abstractC1176h.j()) {
                            i12 = 0;
                        } else {
                            if (!((C1185q) abstractC1176h).f17438d) {
                                Exception f9 = abstractC1176h.f();
                                if (f9 instanceof C4.e) {
                                    Status status = ((C4.e) f9).f1568a;
                                    i15 = status.f14660a;
                                    B4.b bVar = status.f14663d;
                                    if (bVar != null) {
                                        i13 = bVar.f685b;
                                        i12 = i15;
                                    }
                                } else {
                                    i12 = 101;
                                    i13 = -1;
                                }
                            }
                            i12 = i15;
                            i13 = -1;
                        }
                        if (z9) {
                            long j9 = this.f1905a;
                            long j10 = this.f1906b;
                            long currentTimeMillis = System.currentTimeMillis();
                            i18 = (int) (SystemClock.elapsedRealtime() - j10);
                            j4 = currentTimeMillis;
                            j = j9;
                        } else {
                            j = 0;
                            j4 = 0;
                        }
                        int i19 = i18;
                        c0088g.getClass();
                        A a9 = new A(new C0131j(this.f1907c, i12, i13, j, j4, null, null, i14, i19), i9, i11, i10);
                        T4.d dVar = c0088g.f1855n;
                        dVar.sendMessage(dVar.obtainMessage(18, a9));
                    }
                }
            }
        }
    }

    @Override // V3.h
    public void b(long j, long j4) {
        this.f1905a = j;
        this.f1906b = j4;
    }

    @Override // V3.h
    public void c(long j) {
        this.f1905a = j;
    }

    @Override // V3.h
    public void d(A4.r rVar, long j, int i9, boolean z9) {
        int a5;
        ((q3.u) this.f1909e).getClass();
        int i10 = this.f1907c;
        if (i10 != -1 && i9 != (a5 = U3.i.a(i10))) {
            int i11 = l4.y.f20553a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", "Received RTP packet with unexpected sequence number. Expected: " + a5 + "; received: " + i9 + ".");
        }
        long w7 = AbstractC1570b.w(this.f1906b, j, this.f1905a, ((U3.l) this.f1908d).f7399b);
        int e8 = rVar.e();
        ((q3.u) this.f1909e).c(e8, rVar);
        ((q3.u) this.f1909e).d(w7, 1, e8, 0, null);
        this.f1907c = i9;
    }

    @Override // V3.h
    public void e(InterfaceC1907l interfaceC1907l, int i9) {
        q3.u u9 = interfaceC1907l.u(i9, 1);
        this.f1909e = u9;
        u9.e(((U3.l) this.f1908d).f7400c);
    }

    public z(U3.l lVar) {
        this.f1908d = lVar;
        this.f1905a = -9223372036854775807L;
        this.f1906b = 0L;
        this.f1907c = -1;
    }
}
