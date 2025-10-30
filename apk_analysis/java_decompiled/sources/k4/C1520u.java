package k4;

import java.util.Map;

/* renamed from: k4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1520u implements O5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20121a;

    @Override // O5.j
    public final boolean apply(Object obj) {
        switch (this.f20121a) {
            case 0:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
            default:
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
        }
    }
}
