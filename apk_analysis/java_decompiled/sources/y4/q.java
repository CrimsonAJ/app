package y4;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C;
import f5.C1177i;

/* loaded from: classes.dex */
public final class q extends S4.c implements f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1177i f24971g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i9, C1177i c1177i) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 2);
        this.f24970f = i9;
        this.f24971g = c1177i;
    }

    @Override // y4.f
    public final void K(Bundle bundle) {
        switch (this.f24970f) {
            case 0:
                this.f24971g.b(bundle);
                return;
            case 1:
                this.f24971g.b(bundle);
                return;
            default:
                this.f24971g.b(bundle);
                return;
        }
    }

    @Override // S4.c
    public final boolean g1(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 == 1) {
            Bundle bundle = (Bundle) C.a(parcel, Bundle.CREATOR);
            C.b(parcel);
            K(bundle);
            return true;
        }
        return false;
    }
}
