package g2;

import L1.C0219a;
import android.os.Bundle;
import androidx.lifecycle.h0;
import com.anilab.android.ui.player.PlayerActivity;
import d.AbstractActivityC1071l;
import i.AbstractActivityC1322h;
import k4.C1499E;
import k4.C1521v;
import m0.C1580c;
import m0.C1581d;
import u7.C2089e;
import u7.InterfaceC2085a;
import v7.C2114b;
import v7.C2116d;
import x7.InterfaceC2180b;

/* renamed from: g2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1226c extends AbstractActivityC1322h implements InterfaceC2180b {

    /* renamed from: A, reason: collision with root package name */
    public volatile C2114b f17655A;

    /* renamed from: B, reason: collision with root package name */
    public final Object f17656B = new Object();

    /* renamed from: C, reason: collision with root package name */
    public boolean f17657C = false;

    /* renamed from: z, reason: collision with root package name */
    public com.google.firebase.messaging.u f17658z;

    public AbstractActivityC1226c() {
        J(new C0219a((PlayerActivity) this, 1));
    }

    public final C2114b S() {
        if (this.f17655A == null) {
            synchronized (this.f17656B) {
                try {
                    if (this.f17655A == null) {
                        this.f17655A = new C2114b((AbstractActivityC1322h) this);
                    }
                } finally {
                }
            }
        }
        return this.f17655A;
    }

    @Override // x7.InterfaceC2180b
    public final Object e() {
        return S().e();
    }

    @Override // d.AbstractActivityC1071l, androidx.lifecycle.InterfaceC0550k
    public final h0 j() {
        h0 j = super.j();
        C1499E a5 = ((I1.e) ((InterfaceC2085a) v4.e.p(InterfaceC2085a.class, this))).a();
        j.getClass();
        return new C2089e((C1521v) a5.f19985b, j, (A1.g) a5.f19986c);
    }

    @Override // i0.AbstractActivityC1369y, d.AbstractActivityC1071l, D.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC2180b) {
            C2114b c2114b = (C2114b) S().f23905d;
            com.google.firebase.messaging.u uVar = ((C2116d) new android.support.v4.media.session.y(c2114b.f23904c, new C1580c(2, (AbstractActivityC1071l) c2114b.f23905d)).J(C2116d.class)).f23908e;
            this.f17658z = uVar;
            if (((C1581d) uVar.f16512a) == null) {
                uVar.f16512a = p();
            }
        }
    }

    @Override // i.AbstractActivityC1322h, i0.AbstractActivityC1369y, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.google.firebase.messaging.u uVar = this.f17658z;
        if (uVar != null) {
            uVar.f16512a = null;
        }
    }
}
