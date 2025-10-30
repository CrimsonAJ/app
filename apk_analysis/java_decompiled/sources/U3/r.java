package U3;

import N3.c0;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import k4.M;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f7430a;

    /* renamed from: b, reason: collision with root package name */
    public final M f7431b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f7432c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7433d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f7435f;

    public r(s sVar, u uVar, int i9, InterfaceC0397d interfaceC0397d) {
        this.f7435f = sVar;
        this.f7430a = new q(sVar, uVar, i9, interfaceC0397d);
        this.f7431b = new M(AbstractC0953k1.j(i9, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        c0 c0Var = new c0(sVar.f7436a, null, null);
        this.f7432c = c0Var;
        c0Var.f5059f = sVar.f7438c;
    }

    public final void a() {
        if (!this.f7433d) {
            this.f7430a.f7427b.f7365h = true;
            this.f7433d = true;
            s sVar = this.f7435f;
            sVar.f7450p = true;
            int i9 = 0;
            while (true) {
                ArrayList arrayList = sVar.f7440e;
                if (i9 < arrayList.size()) {
                    sVar.f7450p = ((r) arrayList.get(i9)).f7433d & sVar.f7450p;
                    i9++;
                } else {
                    return;
                }
            }
        }
    }
}
