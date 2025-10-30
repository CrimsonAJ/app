package o7;

import android.os.Bundle;
import java.util.ArrayList;
import t0.C1988w;

/* renamed from: o7.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1730v {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f21735a = new ArrayList();

    public C1988w a() {
        if (this.f21735a == null) {
            return C1988w.f23046c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f21735a);
        return new C1988w(bundle, this.f21735a);
    }
}
