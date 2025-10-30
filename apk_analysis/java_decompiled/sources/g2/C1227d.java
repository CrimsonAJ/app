package g2;

import J1.AbstractC0165c;
import N3.C0261l;
import N3.C0262m;
import android.media.AudioManager;
import android.widget.ArrayAdapter;
import androidx.fragment.app.FragmentContainerView;
import co.notix.R;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.internal.measurement.Y1;
import i0.AbstractComponentCallbacksC1366v;
import i0.InterfaceC1332I;
import j3.C1441D;
import j3.C1460k;
import j3.C1465p;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import k4.C1499E;
import l4.AbstractC1566a;
import u4.C2077b;

/* renamed from: g2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1227d implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17662b;

    public /* synthetic */ C1227d(PlayerActivity playerActivity, int i9) {
        this.f17661a = i9;
        this.f17662b = playerActivity;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [q3.h, java.lang.Object] */
    @Override // O7.a
    public final Object invoke() {
        A7.n nVar = A7.n.f558a;
        int i9 = 1;
        final PlayerActivity playerActivity = this.f17662b;
        switch (this.f17661a) {
            case 0:
                int i10 = PlayerActivity.f13798w0;
                return C2077b.a(playerActivity.getApplicationContext());
            case 1:
                int i11 = PlayerActivity.f13798w0;
                return new o3.e(playerActivity.X(), new Q6.f(12));
            case 2:
                int i12 = PlayerActivity.f13798w0;
                d0.w wVar = new d0.w(2);
                i8.D d9 = new i8.D();
                d9.d(wVar);
                d9.a(new B2.l(i9, playerActivity));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                d9.b(30L);
                return new i8.E(d9);
            case 3:
                int i13 = PlayerActivity.f13798w0;
                Y1.p(playerActivity);
                return nVar;
            case 4:
                C1499E c1499e = new C1499E((i8.E) playerActivity.f13805i0.getValue());
                e1.q qVar = new e1.q(2);
                C1465p c1465p = new C1465p(playerActivity);
                C0262m c0262m = new C0262m(c1499e, new Object());
                c0262m.d(qVar);
                AbstractC1566a.m(!c1465p.f19718r);
                c1465p.f19705d = new C0261l(2, c0262m);
                C1460k c1460k = new C1460k(playerActivity);
                AbstractC1566a.m(!c1465p.f19718r);
                c1465p.f19704c = new C0261l(1, c1460k);
                AbstractC1566a.m(!c1465p.f19718r);
                c1465p.f19713m = 10000L;
                AbstractC1566a.m(!c1465p.f19718r);
                c1465p.f19712l = 10000L;
                AbstractC1566a.m(!c1465p.f19718r);
                c1465p.f19718r = true;
                return new C1441D(c1465p);
            case 5:
                int i14 = PlayerActivity.f13798w0;
                Object systemService = playerActivity.getSystemService("audio");
                kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                return (AudioManager) systemService;
            case 6:
                int i15 = PlayerActivity.f13798w0;
                ((D.n) playerActivity.Z()).f(true);
                return nVar;
            case 7:
                int i16 = PlayerActivity.f13798w0;
                ((D.n) playerActivity.Z()).f(true);
                return nVar;
            case 8:
                int i17 = PlayerActivity.f13798w0;
                return new C1225b(new C1229f(playerActivity, 6));
            case 9:
                int i18 = PlayerActivity.f13798w0;
                return new C1225b(new C1229f(playerActivity, 7));
            case R.styleable.GradientColor_android_endX /* 10 */:
                int i19 = PlayerActivity.f13798w0;
                return new ArrayAdapter(playerActivity, R.layout.item_spinner);
            case R.styleable.GradientColor_android_endY /* 11 */:
                int i20 = PlayerActivity.f13798w0;
                return new c0(new C1229f(playerActivity, 8));
            default:
                int i21 = PlayerActivity.f13798w0;
                return new InterfaceC1332I() { // from class: g2.m
                    @Override // i0.InterfaceC1332I
                    public final /* synthetic */ void a(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, boolean z9) {
                    }

                    @Override // i0.InterfaceC1332I
                    public final void b() {
                        int i22;
                        PlayerActivity playerActivity2 = PlayerActivity.this;
                        AbstractC0165c abstractC0165c = playerActivity2.f13799D;
                        if (abstractC0165c != null) {
                            FragmentContainerView containerComment = abstractC0165c.f3844D;
                            kotlin.jvm.internal.h.d(containerComment, "containerComment");
                            ArrayList arrayList = playerActivity2.P().f18199d;
                            int i23 = 0;
                            if (arrayList != null) {
                                i22 = arrayList.size();
                            } else {
                                i22 = 0;
                            }
                            if (i22 <= 0) {
                                i23 = 8;
                            }
                            containerComment.setVisibility(i23);
                            return;
                        }
                        kotlin.jvm.internal.h.h("binding");
                        throw null;
                    }

                    @Override // i0.InterfaceC1332I
                    public final /* synthetic */ void c(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, boolean z9) {
                    }
                };
        }
    }
}
