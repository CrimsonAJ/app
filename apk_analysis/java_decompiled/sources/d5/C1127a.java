package d5;

import C4.k;
import C4.l;
import F4.AbstractC0129h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b6.C0693o;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127a extends AbstractC0129h implements C4.c {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f16869A;

    /* renamed from: B, reason: collision with root package name */
    public final C0693o f16870B;

    /* renamed from: C, reason: collision with root package name */
    public final Bundle f16871C;

    /* renamed from: D, reason: collision with root package name */
    public final Integer f16872D;

    public C1127a(Context context, Looper looper, C0693o c0693o, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, c0693o, kVar, lVar);
        this.f16869A = true;
        this.f16870B = c0693o;
        this.f16871C = bundle;
        this.f16872D = (Integer) c0693o.f11387f;
    }

    @Override // F4.AbstractC0126e, C4.c
    public final int f() {
        return 12451000;
    }

    @Override // F4.AbstractC0126e, C4.c
    public final boolean m() {
        return this.f16869A;
    }

    @Override // F4.AbstractC0126e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new S4.a(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // F4.AbstractC0126e
    public final Bundle s() {
        C0693o c0693o = this.f16870B;
        boolean equals = this.f2370c.getPackageName().equals((String) c0693o.f11382a);
        Bundle bundle = this.f16871C;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c0693o.f11382a);
        }
        return bundle;
    }

    @Override // F4.AbstractC0126e
    public final String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // F4.AbstractC0126e
    public final String w() {
        return "com.google.android.gms.signin.service.START";
    }
}
