package s4;

import C4.o;
import D4.InterfaceC0086e;
import D4.w;
import F4.y;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import q4.AbstractC1912a;

/* loaded from: classes.dex */
public final class g extends BasePendingResult implements InterfaceC0086e {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f22731x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w wVar, int i9) {
        super(wVar);
        this.f22731x = i9;
        y.i(wVar, "GoogleApiClient must not be null");
        y.i(AbstractC1912a.f22359a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ o F(Status status) {
        int i9 = this.f22731x;
        return status;
    }

    public final void N(C4.c cVar) {
        switch (this.f22731x) {
            case 0:
                C1958e c1958e = (C1958e) cVar;
                k kVar = (k) c1958e.u();
                BinderC1959f binderC1959f = new BinderC1959f(this, 0);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(kVar.f6930g);
                int i9 = S4.d.f6933a;
                obtain.writeStrongBinder(binderC1959f);
                GoogleSignInOptions googleSignInOptions = c1958e.f22728A;
                if (googleSignInOptions == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    googleSignInOptions.writeToParcel(obtain, 0);
                }
                kVar.d(obtain, 102);
                return;
            default:
                C1958e c1958e2 = (C1958e) cVar;
                k kVar2 = (k) c1958e2.u();
                BinderC1959f binderC1959f2 = new BinderC1959f(this, 1);
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(kVar2.f6930g);
                int i10 = S4.d.f6933a;
                obtain2.writeStrongBinder(binderC1959f2);
                GoogleSignInOptions googleSignInOptions2 = c1958e2.f22728A;
                if (googleSignInOptions2 == null) {
                    obtain2.writeInt(0);
                } else {
                    obtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(obtain2, 0);
                }
                kVar2.d(obtain2, 103);
                return;
        }
    }

    public final void O(Status status) {
        y.a("Failed result must not be success", !status.f());
        J(F(status));
    }
}
