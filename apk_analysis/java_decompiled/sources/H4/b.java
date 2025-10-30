package H4;

import C4.k;
import C4.l;
import D4.t;
import F4.AbstractC0129h;
import F4.n;
import F4.y;
import S4.e;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b6.C0693o;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.cast.U;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d5.C1127a;
import q4.C1913b;
import s4.C1958e;
import y4.v;
import y4.w;

/* loaded from: classes.dex */
public final class b extends Z0.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3108i;

    public /* synthetic */ b(int i9) {
        this.f3108i = i9;
    }

    @Override // Z0.a
    public C4.c a(Context context, Looper looper, C0693o c0693o, Object obj, k kVar, l lVar) {
        switch (this.f3108i) {
            case 1:
                c0693o.getClass();
                Integer num = (Integer) c0693o.f11387f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C1127a(context, looper, c0693o, bundle, kVar, lVar);
            case 2:
                throw AbstractC0953k1.i(obj);
            case 3:
                return new U(context, looper, c0693o, (t) kVar, (t) lVar);
            case 4:
                return new e(context, looper, c0693o, (C1913b) obj, (t) kVar, (t) lVar);
            case 5:
                return new C1958e(context, looper, c0693o, (GoogleSignInOptions) obj, (t) kVar, (t) lVar);
            case 6:
                t4.e eVar = (t4.e) obj;
                y.i(eVar, "Setting the API options is required.");
                return new w(context, looper, c0693o, eVar.f23179a, 0, eVar.f23181c, eVar.f23182d, (t) kVar, (t) lVar);
            case 7:
                t4.e eVar2 = (t4.e) obj;
                y.i(eVar2, "Setting the API options is required.");
                return new v(context, looper, c0693o, eVar2.f23179a, 0, eVar2.f23180b, eVar2.f23181c, (t) kVar, (t) lVar);
            case 8:
                return new AbstractC0129h(context, looper, 161, c0693o, kVar, lVar);
            default:
                return super.a(context, looper, c0693o, obj, kVar, lVar);
        }
    }

    @Override // Z0.a
    public /* synthetic */ C4.c b(Context context, Looper looper, C0693o c0693o, Object obj, t tVar, t tVar2) {
        switch (this.f3108i) {
            case 0:
                return new d(context, looper, c0693o, (n) obj, tVar, tVar2);
            default:
                return super.b(context, looper, c0693o, obj, tVar, tVar2);
        }
    }
}
