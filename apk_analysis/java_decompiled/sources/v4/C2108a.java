package v4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import t4.C2010B;

/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2108a extends G4.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23781a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23782b;

    /* renamed from: c, reason: collision with root package name */
    public final p f23783c;

    /* renamed from: d, reason: collision with root package name */
    public final f f23784d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23785e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23786f;

    /* renamed from: g, reason: collision with root package name */
    public static final y4.b f23780g = new y4.b("CastMediaOptions", null);
    public static final Parcelable.Creator<C2108a> CREATOR = new C2010B(5);

    /* JADX WARN: Multi-variable type inference failed */
    public C2108a(String str, String str2, IBinder iBinder, f fVar, boolean z9, boolean z10) {
        p aVar;
        this.f23781a = str;
        this.f23782b = str2;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof p) {
                aVar = (p) queryLocalInterface;
            } else {
                aVar = new S4.a(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 3);
            }
        }
        this.f23783c = aVar;
        this.f23784d = fVar;
        this.f23785e = z9;
        this.f23786f = z10;
    }

    public final void f() {
        p pVar = this.f23783c;
        if (pVar != null) {
            try {
                Parcel f12 = pVar.f1(pVar.Q(), 2);
                N4.a h12 = N4.b.h1(f12.readStrongBinder());
                f12.recycle();
                if (N4.b.i1(h12) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e8) {
                f23780g.a(e8, "Unable to call %s on %s.", "getWrappedClientObject", p.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        IBinder iBinder;
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 2, this.f23781a);
        s8.n.M(parcel, 3, this.f23782b);
        p pVar = this.f23783c;
        if (pVar == null) {
            iBinder = null;
        } else {
            iBinder = pVar.f6929f;
        }
        s8.n.H(parcel, 4, iBinder);
        s8.n.L(parcel, 5, this.f23784d, i9);
        s8.n.V(parcel, 6, 4);
        parcel.writeInt(this.f23785e ? 1 : 0);
        s8.n.V(parcel, 7, 4);
        parcel.writeInt(this.f23786f ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
