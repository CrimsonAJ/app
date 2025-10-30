package i0;

import java.util.ArrayList;

/* renamed from: i0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334K implements InterfaceC1333J {

    /* renamed from: a, reason: collision with root package name */
    public final String f18176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18177b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18178c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1336M f18179d;

    public C1334K(AbstractC1336M abstractC1336M, String str, int i9, int i10) {
        this.f18179d = abstractC1336M;
        this.f18176a = str;
        this.f18177b = i9;
        this.f18178c = i10;
    }

    @Override // i0.InterfaceC1333J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18179d.f18218x;
        if (abstractComponentCallbacksC1366v != null && this.f18177b < 0 && this.f18176a == null && abstractComponentCallbacksC1366v.l().Q(-1, 0)) {
            return false;
        }
        return this.f18179d.R(arrayList, arrayList2, this.f18176a, this.f18177b, this.f18178c);
    }
}
