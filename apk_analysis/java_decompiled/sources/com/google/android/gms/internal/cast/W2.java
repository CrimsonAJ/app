package com.google.android.gms.internal.cast;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import f5.AbstractC1176h;
import f5.InterfaceC1171c;
import java.nio.charset.Charset;
import t0.C1966B;
import t0.C1971e;
import t0.C1979m;
import t0.HandlerC1968b;
import u4.C2078c;
import u4.C2079d;

/* loaded from: classes.dex */
public final class W2 implements InterfaceC1171c, u4.i, Y2 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0886w0 f14786c = new C0886w0(23);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14787a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14788b;

    public /* synthetic */ W2(int i9, Object obj) {
        this.f14787a = i9;
        this.f14788b = obj;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [t0.E, java.lang.Object] */
    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h abstractC1176h) {
        C2078c c2078c;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13 = false;
        boolean j = abstractC1176h.j();
        y4.b bVar = BinderC0873t.f14981n;
        BinderC0873t binderC0873t = (BinderC0873t) this.f14788b;
        if (j) {
            Bundle bundle = (Bundle) abstractC1176h.g();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (true != z12) {
                str = "not existed";
            } else {
                str = "existed";
            }
            bVar.b("The module-to-client output switcher flag %s", str);
            if (z12) {
                binderC0873t.f14986l = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            }
        }
        boolean z14 = binderC0873t.f14986l;
        if (binderC0873t.f14982g != null && (c2078c = binderC0873t.f14983h) != null) {
            if (z14 && c2078c.f23669m) {
                z9 = true;
            } else {
                z9 = false;
            }
            ?? obj = new Object();
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 30) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj.f22864a = z10;
            if (i9 >= 30) {
                obj.f22864a = z9;
            }
            boolean z15 = c2078c.f23667k;
            if (i9 >= 30) {
                obj.f22866c = z15;
            }
            boolean z16 = c2078c.j;
            if (i9 >= 30) {
                obj.f22865b = z16;
            }
            if (i9 >= 30) {
                obj.f22867d = c2078c.f23674r;
            }
            t0.F f9 = new t0.F(obj);
            t0.D.b();
            C1971e c3 = t0.D.c();
            t0.F f10 = c3.f22982u;
            c3.f22982u = f9;
            boolean h7 = c3.h();
            HandlerC1968b handlerC1968b = c3.f22963a;
            if (h7) {
                if (c3.f22979r == null) {
                    C1979m c1979m = new C1979m(c3.f22969g, new com.google.firebase.messaging.u(c3));
                    c3.f22979r = c1979m;
                    c3.a(c1979m, true);
                    c3.l();
                }
                C1979m c1979m2 = c3.f22979r;
                boolean z17 = f9.f22871d;
                c1979m2.f23012p = z17;
                c1979m2.i();
                t0.X x5 = c3.f22965c;
                x5.f22937f = z17;
                x5.f22934c.post(x5.f22940i);
                if (f10 != null && f10.f22870c) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 != f9.f22870c) {
                    C1979m c1979m3 = c3.f22979r;
                    c1979m3.f23039e = c3.f22958A;
                    if (!c1979m3.f23040f) {
                        c1979m3.f23040f = true;
                        c1979m3.f23037c.sendEmptyMessage(2);
                    }
                }
            } else {
                C1979m c1979m4 = c3.f22979r;
                if (c1979m4 != null) {
                    C1966B d9 = c3.d(c1979m4);
                    if (d9 != null) {
                        t0.D.b();
                        c1979m4.f23038d = null;
                        c1979m4.g(null);
                        c3.n(d9, null);
                        handlerC1968b.b(514, d9);
                        c3.f22973l.remove(d9);
                    }
                    c3.f22979r = null;
                    t0.X x9 = c3.f22965c;
                    x9.f22934c.post(x9.f22940i);
                }
            }
            handlerC1968b.b(769, f9);
            boolean z18 = binderC0873t.f14985k;
            Log.i(bVar.f24917a, bVar.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(z18), Boolean.valueOf(z9), Boolean.valueOf(z15), Boolean.valueOf(z16)));
            C0885w c0885w = binderC0873t.j;
            if (c0885w != null) {
                if (z18 && z9) {
                    z13 = true;
                }
                c0885w.f15078e = z13;
            }
            if (z18 && z9) {
                C0890x0.a(EnumC0894y0.CAST_OUTPUT_SWITCHER_ENABLED);
            }
            if (z15) {
                C0890x0.a(EnumC0894y0.CAST_TRANSFER_TO_LOCAL_ENABLED);
            }
        }
    }

    @Override // u4.i
    public /* bridge */ /* synthetic */ void a(u4.g gVar, int i9) {
        switch (this.f14787a) {
            case 2:
                return;
            default:
                C0870s0 c0870s0 = (C0870s0) this.f14788b;
                c0870s0.f14980h = (C2079d) gVar;
                C0870s0.a(c0870s0, i9);
                return;
        }
    }

    @Override // com.google.android.gms.internal.cast.Y2
    public f3 b(Class cls) {
        for (int i9 = 0; i9 < 2; i9++) {
            Y2 y22 = ((Y2[]) this.f14788b)[i9];
            if (y22.c(cls)) {
                return y22.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.Y2
    public boolean c(Class cls) {
        for (int i9 = 0; i9 < 2; i9++) {
            if (((Y2[]) this.f14788b)[i9].c(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // u4.i
    public /* synthetic */ void d(u4.g gVar) {
        switch (this.f14787a) {
            case 2:
                return;
            default:
                ((C0870s0) this.f14788b).f14980h = (C2079d) gVar;
                return;
        }
    }

    @Override // u4.i
    public void e(u4.g gVar) {
        switch (this.f14787a) {
            case 2:
                return;
            default:
                y4.b bVar = C0870s0.f14972i;
                bVar.b("onSessionStarting", new Object[0]);
                C0870s0 c0870s0 = (C0870s0) this.f14788b;
                c0870s0.f14980h = (C2079d) gVar;
                if (c0870s0.f14979g != null) {
                    Log.w(bVar.f24917a, bVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
                }
                c0870s0.d();
                C0874t0 c0874t0 = c0870s0.f14979g;
                N0 b9 = c0870s0.f14975c.b(c0874t0);
                if (c0874t0.f15004p == 1) {
                    H0 m9 = I0.m(b9.f());
                    m9.e();
                    I0.u((I0) m9.f14748b, 17);
                    b9.h((I0) m9.b());
                }
                c0870s0.f14973a.a((O0) b9.b(), 221);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
    @Override // u4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(u4.g r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.W2.f(u4.g, java.lang.String):void");
    }

    @Override // u4.i
    public void g(u4.g gVar, int i9) {
        switch (this.f14787a) {
            case 2:
                return;
            default:
                C0870s0.f14972i.b("onSessionSuspended with reason = %d", Integer.valueOf(i9));
                C0870s0 c0870s0 = (C0870s0) this.f14788b;
                c0870s0.f14980h = (C2079d) gVar;
                c0870s0.c();
                F4.y.h(c0870s0.f14979g);
                c0870s0.f14973a.a(c0870s0.f14975c.a(c0870s0.f14979g, i9), 225);
                C0870s0.b(c0870s0);
                c0870s0.f14977e.removeCallbacks(c0870s0.f14976d);
                return;
        }
    }

    @Override // u4.i
    public void h(u4.g gVar, String str) {
        Object obj = this.f14788b;
        switch (this.f14787a) {
            case 2:
                y4.b bVar = C0885w.f15073g;
                C0885w c0885w = (C0885w) obj;
                c0885w.getClass();
                bVar.b("onSessionStarted with transferType = %d", 0);
                if (c0885w.f15078e) {
                    boolean z9 = c0885w.f15074a.f23673q;
                }
                c0885w.a();
                return;
            default:
                C0870s0.f14972i.b("onSessionStarted with sessionId = %s", str);
                C0870s0 c0870s0 = (C0870s0) obj;
                c0870s0.f14980h = (C2079d) gVar;
                c0870s0.c();
                C0874t0 c0874t0 = c0870s0.f14979g;
                c0874t0.f14995f = str;
                c0870s0.f14973a.a((O0) c0870s0.f14975c.b(c0874t0).b(), 222);
                C0870s0.b(c0870s0);
                c0870s0.e();
                return;
        }
    }

    @Override // u4.i
    public /* bridge */ /* synthetic */ void i(u4.g gVar, int i9) {
        Object obj = this.f14788b;
        switch (this.f14787a) {
            case 2:
                y4.b bVar = C0885w.f15073g;
                bVar.b("onSessionEnded with error = %d", Integer.valueOf(i9));
                C0885w c0885w = (C0885w) obj;
                c0885w.getClass();
                bVar.b("No need to notify transferred if the transfer type is unknown", new Object[0]);
                c0885w.a();
                return;
            default:
                C0870s0 c0870s0 = (C0870s0) obj;
                c0870s0.f14980h = (C2079d) gVar;
                C0870s0.a(c0870s0, i9);
                return;
        }
    }

    @Override // u4.i
    public void j(u4.g gVar, boolean z9) {
        switch (this.f14787a) {
            case 2:
                return;
            default:
                C0870s0.f14972i.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z9));
                C0870s0 c0870s0 = (C0870s0) this.f14788b;
                c0870s0.f14980h = (C2079d) gVar;
                c0870s0.c();
                F4.y.h(c0870s0.f14979g);
                N0 b9 = c0870s0.f14975c.b(c0870s0.f14979g);
                H0 m9 = I0.m(b9.f());
                m9.e();
                I0.t((I0) m9.f14748b, z9);
                b9.e();
                O0.q((O0) b9.f14748b, (I0) m9.b());
                c0870s0.f14973a.a((O0) b9.b(), 227);
                C0870s0.b(c0870s0);
                c0870s0.e();
                return;
        }
    }

    @Override // u4.i
    public /* bridge */ /* synthetic */ void k(u4.g gVar, int i9) {
        switch (this.f14787a) {
            case 2:
                return;
            default:
                C0870s0 c0870s0 = (C0870s0) this.f14788b;
                c0870s0.f14980h = (C2079d) gVar;
                C0870s0.a(c0870s0, i9);
                return;
        }
    }

    public void l(int i9, Object obj, g3 g3Var) {
        J2 j22 = (J2) this.f14788b;
        j22.D(i9, 3);
        g3Var.a((E2) obj, j22.f14734d);
        j22.D(i9, 4);
    }

    public void m(int i9, Object obj, g3 g3Var) {
        E2 e22 = (E2) obj;
        J2 j22 = (J2) this.f14788b;
        j22.F((i9 << 3) | 2);
        j22.F(e22.a(g3Var));
        g3Var.a(e22, j22.f14734d);
    }

    public W2() {
        this.f14787a = 0;
        d3 d3Var = d3.f14823c;
        W2 w22 = new W2(5, new Y2[]{C0886w0.f15093p, f14786c});
        Charset charset = S2.f14762a;
        this.f14788b = w22;
    }

    public W2(J2 j22) {
        this.f14787a = 4;
        Charset charset = S2.f14762a;
        this.f14788b = j22;
        j22.f14734d = this;
    }
}
