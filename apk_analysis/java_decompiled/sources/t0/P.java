package t0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f22895b;

    public /* synthetic */ P(Q q9, int i9) {
        this.f22894a = i9;
        this.f22895b = q9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22894a) {
            case 0:
                SparseArray sparseArray = this.f22895b.f22903h;
                int size = sparseArray.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((T) sparseArray.valueAt(i9)).getClass();
                    T.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                Q q9 = this.f22895b;
                W w7 = q9.f22904i;
                if (w7.f22929n == q9) {
                    w7.j();
                    return;
                }
                return;
        }
    }
}
