package F4;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class v extends S4.a implements x {
    public final boolean j1() {
        boolean z9;
        Parcel g9 = g(Q(), 7);
        int i9 = V4.a.f7734a;
        if (g9.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        g9.recycle();
        return z9;
    }
}
