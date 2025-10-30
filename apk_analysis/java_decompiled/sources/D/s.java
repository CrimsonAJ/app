package D;

import android.app.Notification;
import android.os.Parcel;
import b.C0580a;
import b.InterfaceC0582c;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f1708a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1709b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1710c;

    /* renamed from: d, reason: collision with root package name */
    public final Notification f1711d;

    public s(String str, int i9, String str2, Notification notification) {
        this.f1708a = str;
        this.f1709b = i9;
        this.f1710c = str2;
        this.f1711d = notification;
    }

    public final void a(InterfaceC0582c interfaceC0582c) {
        String str = this.f1708a;
        int i9 = this.f1709b;
        String str2 = this.f1710c;
        C0580a c0580a = (C0580a) interfaceC0582c;
        c0580a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0582c.f10455c);
            obtain.writeString(str);
            obtain.writeInt(i9);
            obtain.writeString(str2);
            Notification notification = this.f1711d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0580a.f10453e.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f1708a);
        sb.append(", id:");
        sb.append(this.f1709b);
        sb.append(", tag:");
        return AbstractC0953k1.q(sb, this.f1710c, "]");
    }
}
