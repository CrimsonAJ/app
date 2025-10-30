package n0;

import androidx.lifecycle.F;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.firebase.messaging.u;
import s4.C1957d;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602b implements F {

    /* renamed from: a, reason: collision with root package name */
    public final u f21004a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21005b = false;

    public C1602b(C1957d c1957d, u uVar) {
        this.f21004a = uVar;
    }

    @Override // androidx.lifecycle.F
    public final void a(Object obj) {
        this.f21005b = true;
        u uVar = this.f21004a;
        uVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) uVar.f16512a;
        signInHubActivity.setResult(signInHubActivity.f14579B, signInHubActivity.f14580C);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.f21004a.toString();
    }
}
