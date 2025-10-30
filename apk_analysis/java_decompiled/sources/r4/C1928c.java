package r4;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: r4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1928c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1928c f22631b = new C1928c(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22632a;

    public /* synthetic */ C1928c(int i9) {
        this.f22632a = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f22632a) {
            case 0:
                return ((Scope) obj).f14654b.compareTo(((Scope) obj2).f14654b);
            default:
                return ((Scope) obj).f14654b.compareTo(((Scope) obj2).f14654b);
        }
    }
}
