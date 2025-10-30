package t0;

import android.content.ComponentName;
import f5.C1183o;
import java.util.ArrayList;

/* renamed from: t0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1966B {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1986u f22835a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22836b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22837c;

    /* renamed from: d, reason: collision with root package name */
    public final C1183o f22838d;

    /* renamed from: e, reason: collision with root package name */
    public C1987v f22839e;

    public C1966B(AbstractC1986u abstractC1986u, boolean z9) {
        this.f22835a = abstractC1986u;
        this.f22838d = abstractC1986u.f23036b;
        this.f22837c = z9;
    }

    public final C a(String str) {
        ArrayList arrayList = this.f22836b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C c3 = (C) obj;
            if (c3.f22841b.equals(str)) {
                return c3;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.f22838d.f17433b).getPackageName() + " }";
    }
}
