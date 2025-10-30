package b5;

import android.os.Bundle;

/* renamed from: b5.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0664s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11303c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11306f;

    public /* synthetic */ RunnableC0664s0(Object obj, Object obj2, Object obj3, Object obj4, long j, int i9) {
        this.f11301a = i9;
        this.f11302b = obj2;
        this.f11303c = obj3;
        this.f11305e = obj4;
        this.f11304d = j;
        this.f11306f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11301a) {
            case 0:
                String str = (String) this.f11303c;
                BinderC0672w0 binderC0672w0 = (BinderC0672w0) this.f11306f;
                String str2 = (String) this.f11302b;
                if (str2 == null) {
                    J1 j12 = binderC0672w0.f11339e;
                    j12.K().l0();
                    String str3 = j12.f10741Z;
                    if (str3 == null || str3.equals(str)) {
                        j12.f10741Z = str;
                        j12.Y = null;
                        return;
                    }
                    return;
                }
                C0612a1 c0612a1 = new C0612a1(this.f11304d, (String) this.f11305e, str2);
                J1 j13 = binderC0672w0.f11339e;
                j13.K().l0();
                String str4 = j13.f10741Z;
                if (str4 != null) {
                    str4.equals(str);
                }
                j13.f10741Z = str;
                j13.Y = c0612a1;
                return;
            case 1:
                Object obj = this.f11305e;
                ((S0) this.f11306f).G0(this.f11304d, obj, (String) this.f11302b, (String) this.f11303c);
                return;
            default:
                Bundle bundle = (Bundle) this.f11302b;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                C0621d1 c0621d1 = (C0621d1) this.f11306f;
                P1 p12 = ((C0650n0) c0621d1.f1707a).f11231l;
                C0650n0.d(p12);
                c0621d1.q0((C0612a1) this.f11303c, (C0612a1) this.f11305e, this.f11304d, true, p12.p0("screen_view", bundle, null, false));
                return;
        }
    }
}
