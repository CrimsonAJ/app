package s4;

import A3.E;
import C4.m;
import D4.C0088g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final E f22732a = new E("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f22732a.f("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static void b(Context context) {
        i.U(context).V();
        Iterator it = m.a().iterator();
        if (!it.hasNext()) {
            synchronized (C0088g.f1841r) {
                try {
                    C0088g c0088g = C0088g.f1842s;
                    if (c0088g != null) {
                        c0088g.f1851i.incrementAndGet();
                        T4.d dVar = c0088g.f1855n;
                        dVar.sendMessageAtFrontOfQueue(dVar.obtainMessage(10));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ((m) it.next()).getClass();
        throw new UnsupportedOperationException();
    }
}
