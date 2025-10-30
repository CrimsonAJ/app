package G0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2819b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2820c;

    /* renamed from: f, reason: collision with root package name */
    public Executor f2823f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f2824g;

    /* renamed from: h, reason: collision with root package name */
    public M4.b f2825h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2826i;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2833q;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2821d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2822e = new ArrayList();
    public final B j = B.f2636a;

    /* renamed from: k, reason: collision with root package name */
    public final long f2827k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final C f2828l = new C(0);

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f2829m = new LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f2830n = new LinkedHashSet();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2831o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f2832p = true;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2834r = true;

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.d f2818a = kotlin.jvm.internal.p.a(WorkDatabase.class);

    public z(Context context, String str) {
        this.f2819b = context;
        this.f2820c = str;
    }

    public final void a(K0.a... aVarArr) {
        for (K0.a aVar : aVarArr) {
            LinkedHashSet linkedHashSet = this.f2830n;
            linkedHashSet.add(Integer.valueOf(aVar.f4229a));
            linkedHashSet.add(Integer.valueOf(aVar.f4230b));
        }
        K0.a[] migrations = (K0.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        C c3 = this.f2828l;
        c3.getClass();
        kotlin.jvm.internal.h.e(migrations, "migrations");
        for (K0.a aVar2 : migrations) {
            c3.a(aVar2);
        }
    }
}
