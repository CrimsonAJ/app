package H1;

import android.widget.ImageView;
import u0.z;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1.c f2947a = new C1.c();

    public static final boolean a(C1.i iVar) {
        ImageView imageView;
        int ordinal = iVar.f1195e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    D1.i iVar2 = iVar.f1211v;
                    if (!(iVar2 instanceof D1.c)) {
                        E1.a aVar = iVar.f1193c;
                        if (!z.i(aVar) || !(iVar2 instanceof D1.f) || (imageView = aVar.f1926b) == null || imageView != ((D1.f) iVar2).f1772a) {
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            return true;
        }
        return false;
    }
}
