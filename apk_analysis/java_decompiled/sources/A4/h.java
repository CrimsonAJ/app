package A4;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f349a;

    public h(IBinder iBinder) {
        this.f349a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                Messenger messenger = this.f349a;
                messenger.getClass();
                IBinder binder = messenger.getBinder();
                Messenger messenger2 = ((h) obj).f349a;
                messenger2.getClass();
                return binder.equals(messenger2.getBinder());
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Messenger messenger = this.f349a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        Messenger messenger = this.f349a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
