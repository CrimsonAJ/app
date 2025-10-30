package P4;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class a implements c, IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f5888e;

    public a(IBinder iBinder) {
        this.f5888e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5888e;
    }
}
