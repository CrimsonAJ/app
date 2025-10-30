package F4;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* renamed from: F4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128g extends G4.a {
    public static final Parcelable.Creator<C0128g> CREATOR = new A1.a(18);

    /* renamed from: o, reason: collision with root package name */
    public static final Scope[] f2397o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final B4.d[] f2398p = new B4.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f2399a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2401c;

    /* renamed from: d, reason: collision with root package name */
    public String f2402d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f2403e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f2404f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f2405g;

    /* renamed from: h, reason: collision with root package name */
    public Account f2406h;

    /* renamed from: i, reason: collision with root package name */
    public B4.d[] f2407i;
    public B4.d[] j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2408k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2409l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2410m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2411n;

    public C0128g(int i9, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, B4.d[] dVarArr, B4.d[] dVarArr2, boolean z9, int i12, boolean z10, String str2) {
        IInterface aVar;
        Scope[] scopeArr2 = scopeArr == null ? f2397o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        B4.d[] dVarArr3 = f2398p;
        B4.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f2399a = i9;
        this.f2400b = i10;
        this.f2401c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f2402d = "com.google.android.gms";
        } else {
            this.f2402d = str;
        }
        if (i9 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = AbstractBinderC0122a.f2366f;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof InterfaceC0130i) {
                    aVar = (InterfaceC0130i) queryLocalInterface;
                } else {
                    aVar = new S4.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                }
                if (aVar != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            M m9 = (M) aVar;
                            Parcel g9 = m9.g(m9.Q(), 2);
                            Account account3 = (Account) V4.a.a(g9, Account.CREATOR);
                            g9.recycle();
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f2406h = account2;
        } else {
            this.f2403e = iBinder;
            this.f2406h = account;
        }
        this.f2404f = scopeArr2;
        this.f2405g = bundle2;
        this.f2407i = dVarArr4;
        this.j = dVarArr3;
        this.f2408k = z9;
        this.f2409l = i12;
        this.f2410m = z10;
        this.f2411n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        A1.a.a(this, parcel, i9);
    }
}
