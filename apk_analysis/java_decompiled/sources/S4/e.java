package S4;

import D4.t;
import F4.AbstractC0129h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import b6.C0693o;
import k4.C1499E;
import q4.C1913b;

/* loaded from: classes.dex */
public final class e extends AbstractC0129h {

    /* renamed from: A, reason: collision with root package name */
    public final C1913b f6934A;

    public e(Context context, Looper looper, C0693o c0693o, C1913b c1913b, t tVar, t tVar2) {
        super(context, looper, 68, c0693o, tVar, tVar2);
        c1913b = c1913b == null ? C1913b.f22360c : c1913b;
        C1499E c1499e = new C1499E(15, false);
        c1499e.f19985b = Boolean.FALSE;
        C1913b c1913b2 = C1913b.f22360c;
        c1913b.getClass();
        c1499e.f19985b = Boolean.valueOf(c1913b.f22361a);
        c1499e.f19986c = c1913b.f22362b;
        byte[] bArr = new byte[16];
        b.f6931a.nextBytes(bArr);
        c1499e.f19986c = Base64.encodeToString(bArr, 11);
        this.f6934A = new C1913b(c1499e);
    }

    @Override // F4.AbstractC0126e, C4.c
    public final int f() {
        return 12800000;
    }

    @Override // F4.AbstractC0126e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new a(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 0);
    }

    @Override // F4.AbstractC0126e
    public final Bundle s() {
        C1913b c1913b = this.f6934A;
        c1913b.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", c1913b.f22361a);
        bundle.putString("log_session_id", c1913b.f22362b);
        return bundle;
    }

    @Override // F4.AbstractC0126e
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // F4.AbstractC0126e
    public final String w() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
