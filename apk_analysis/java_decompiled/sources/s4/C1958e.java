package s4;

import D4.t;
import F4.AbstractC0129h;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import b6.C0693o;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import r4.C1926a;

/* renamed from: s4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1958e extends AbstractC0129h {

    /* renamed from: A, reason: collision with root package name */
    public final GoogleSignInOptions f22728A;

    public C1958e(Context context, Looper looper, C0693o c0693o, GoogleSignInOptions googleSignInOptions, t tVar, t tVar2) {
        super(context, looper, 91, c0693o, tVar, tVar2);
        C1926a c1926a;
        if (googleSignInOptions != null) {
            c1926a = new C1926a(googleSignInOptions);
        } else {
            c1926a = new C1926a();
        }
        byte[] bArr = new byte[16];
        S4.b.f6931a.nextBytes(bArr);
        c1926a.f22628i = Base64.encodeToString(bArr, 11);
        Set<Scope> set = (Set) c0693o.f11384c;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = c1926a.f22620a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.f14561p;
        HashSet hashSet2 = c1926a.f22620a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.f14560o;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (c1926a.f22623d && (c1926a.f22625f == null || !hashSet2.isEmpty())) {
            c1926a.f22620a.add(GoogleSignInOptions.f14559n);
        }
        this.f22728A = new GoogleSignInOptions(3, new ArrayList(hashSet2), c1926a.f22625f, c1926a.f22623d, c1926a.f22621b, c1926a.f22622c, c1926a.f22624e, c1926a.f22626g, c1926a.f22627h, c1926a.f22628i);
    }

    @Override // F4.AbstractC0126e, C4.c
    public final int f() {
        return 12451000;
    }

    @Override // F4.AbstractC0126e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof k) {
            return (k) queryLocalInterface;
        }
        return new S4.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 0);
    }

    @Override // F4.AbstractC0126e
    public final String v() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // F4.AbstractC0126e
    public final String w() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
