package O4;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class l extends S4.a {
    public final N4.a j1(N4.b bVar, String str, int i9, N4.b bVar2) {
        Parcel Q7 = Q();
        V4.a.c(Q7, bVar);
        Q7.writeString(str);
        Q7.writeInt(i9);
        V4.a.c(Q7, bVar2);
        Parcel g9 = g(Q7, 2);
        N4.a h12 = N4.b.h1(g9.readStrongBinder());
        g9.recycle();
        return h12;
    }

    public final N4.a k1(N4.b bVar, String str, int i9, N4.b bVar2) {
        Parcel Q7 = Q();
        V4.a.c(Q7, bVar);
        Q7.writeString(str);
        Q7.writeInt(i9);
        V4.a.c(Q7, bVar2);
        Parcel g9 = g(Q7, 3);
        N4.a h12 = N4.b.h1(g9.readStrongBinder());
        g9.recycle();
        return h12;
    }
}
