package D4;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b6.C0693o;
import c5.AbstractC0778b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import d5.C1127a;
import java.util.Set;
import s4.C1955b;

/* loaded from: classes.dex */
public final class E extends S4.c implements C4.k, C4.l {

    /* renamed from: m, reason: collision with root package name */
    public static final H4.b f1810m = AbstractC0778b.f11660a;

    /* renamed from: f, reason: collision with root package name */
    public final Context f1811f;

    /* renamed from: g, reason: collision with root package name */
    public final T4.d f1812g;

    /* renamed from: h, reason: collision with root package name */
    public final H4.b f1813h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f1814i;
    public final C0693o j;

    /* renamed from: k, reason: collision with root package name */
    public C1127a f1815k;

    /* renamed from: l, reason: collision with root package name */
    public v f1816l;

    public E(Context context, T4.d dVar, C0693o c0693o) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f1811f = context;
        this.f1812g = dVar;
        this.j = c0693o;
        this.f1814i = (Set) c0693o.f11383b;
        this.f1813h = f1810m;
    }

    @Override // C4.k
    public final void Q() {
        GoogleSignInAccount googleSignInAccount;
        boolean z9 = false;
        C1127a c1127a = this.f1815k;
        c1127a.getClass();
        try {
            c1127a.f16870B.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C1955b.a(c1127a.f2370c).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = c1127a.f16872D;
            F4.y.h(num);
            F4.q qVar = new F4.q(2, account, num.intValue(), googleSignInAccount);
            d5.c cVar = (d5.c) c1127a.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(cVar.f6930g);
            int i9 = T4.a.f7205a;
            obtain.writeInt(1);
            int R2 = s8.n.R(obtain, 20293);
            s8.n.V(obtain, 1, 4);
            obtain.writeInt(1);
            s8.n.L(obtain, 2, qVar, 0);
            s8.n.U(obtain, R2);
            obtain.writeStrongBinder(this);
            Parcel obtain2 = Parcel.obtain();
            try {
                cVar.f6929f.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
            } catch (Throwable th) {
                obtain.recycle();
                obtain2.recycle();
                throw th;
            }
        } catch (RemoteException e8) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f1812g.post(new S5.o(this, new d5.e(1, new B4.b(8, null), null), 7, z9));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }

    @Override // C4.l
    public final void d(B4.b bVar) {
        this.f1816l.d(bVar);
    }

    @Override // C4.k
    public final void g(int i9) {
        v vVar = this.f1816l;
        t tVar = (t) ((C0088g) vVar.f1900f).j.get((C0083b) vVar.f1897c);
        if (tVar != null) {
            if (tVar.f1888m) {
                tVar.p(new B4.b(17));
            } else {
                tVar.g(i9);
            }
        }
    }
}
