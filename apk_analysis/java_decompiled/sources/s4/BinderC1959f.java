package s4;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: s4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1959f extends S4.c implements j {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f22730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1959f(g gVar, int i9) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
        this.f22729f = i9;
        this.f22730g = gVar;
    }

    @Override // s4.j
    public void V0(Status status) {
        switch (this.f22729f) {
            case 1:
                this.f22730g.J(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // S4.c
    public final boolean f1(int i9, Parcel parcel, Parcel parcel2) {
        switch (i9) {
            case 101:
                S4.d.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) S4.d.a(parcel, Status.CREATOR);
                S4.d.b(parcel);
                y(status);
                break;
            case 103:
                Status status2 = (Status) S4.d.a(parcel, Status.CREATOR);
                S4.d.b(parcel);
                V0(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // s4.j
    public void y(Status status) {
        switch (this.f22729f) {
            case 0:
                this.f22730g.J(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
