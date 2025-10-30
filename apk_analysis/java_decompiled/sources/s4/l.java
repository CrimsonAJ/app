package s4;

import A3.E;
import C4.r;
import D4.o;
import D4.w;
import F4.y;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import f5.C1177i;
import org.json.JSONException;
import q4.AbstractC1912a;

/* loaded from: classes.dex */
public final class l extends S4.c {

    /* renamed from: f, reason: collision with root package name */
    public final RevocationBoundService f22735f;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.f22735f = revocationBoundService;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, D4.a] */
    /* JADX WARN: Type inference failed for: r3v0, types: [C4.j, com.google.android.gms.internal.cast.L] */
    @Override // S4.c
    public final boolean f1(int i9, Parcel parcel, Parcel parcel2) {
        boolean z9;
        BasePendingResult basePendingResult;
        String d9;
        RevocationBoundService revocationBoundService = this.f22735f;
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            h1();
            i.U(revocationBoundService).V();
            return true;
        }
        h1();
        C1955b a5 = C1955b.a(revocationBoundService);
        GoogleSignInAccount b9 = a5.b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f14556k;
        if (b9 != null) {
            String d10 = a5.d("defaultGoogleSignInAccount");
            if (!TextUtils.isEmpty(d10) && (d9 = a5.d(C1955b.f("googleSignInOptions", d10))) != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.f(d9);
                } catch (JSONException unused) {
                }
            }
            googleSignInOptions = null;
        }
        GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        y.h(googleSignInOptions2);
        ?? jVar = new C4.j(this.f22735f, null, AbstractC1912a.f22359a, googleSignInOptions2, new C4.i(new Object(), Looper.getMainLooper()));
        if (b9 != null) {
            if (jVar.e() == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            h.f22732a.f("Revoking access", new Object[0]);
            Context context = jVar.f1578a;
            String d11 = C1955b.a(context).d("refreshToken");
            h.b(context);
            if (z9) {
                if (d11 == null) {
                    E e8 = RunnableC1956c.f22716c;
                    Status status = new Status(4, null, null, null);
                    y.a("Status code must not be SUCCESS", !status.f());
                    BasePendingResult rVar = new r(status);
                    rVar.J(status);
                    basePendingResult = rVar;
                } else {
                    RunnableC1956c runnableC1956c = new RunnableC1956c(d11);
                    new Thread(runnableC1956c).start();
                    basePendingResult = runnableC1956c.f22718b;
                }
            } else {
                w wVar = jVar.f1585h;
                g gVar = new g(wVar, 1);
                wVar.b(gVar);
                basePendingResult = gVar;
            }
            basePendingResult.D(new o(basePendingResult, new C1177i(), new F5.e(5)));
        } else {
            jVar.d();
        }
        return true;
    }

    public final void h1() {
        if (K4.b.e(this.f22735f, Binder.getCallingUid())) {
        } else {
            throw new SecurityException(A0.a.m("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }
}
