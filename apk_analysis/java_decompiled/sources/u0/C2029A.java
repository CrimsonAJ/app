package u0;

import android.os.Bundle;

/* renamed from: u0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2029A implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final C f23366a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f23367b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23368c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23369d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23370e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23371f;

    public C2029A(C destination, Bundle bundle, boolean z9, int i9, boolean z10, int i10) {
        kotlin.jvm.internal.h.e(destination, "destination");
        this.f23366a = destination;
        this.f23367b = bundle;
        this.f23368c = z9;
        this.f23369d = i9;
        this.f23370e = z10;
        this.f23371f = i10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2029A other) {
        kotlin.jvm.internal.h.e(other, "other");
        boolean z9 = other.f23368c;
        boolean z10 = this.f23368c;
        if (z10 && !z9) {
            return 1;
        }
        if (!z10 && z9) {
            return -1;
        }
        int i9 = this.f23369d - other.f23369d;
        if (i9 > 0) {
            return 1;
        }
        if (i9 < 0) {
            return -1;
        }
        Bundle bundle = other.f23367b;
        Bundle bundle2 = this.f23367b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            kotlin.jvm.internal.h.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z11 = other.f23370e;
        boolean z12 = this.f23370e;
        if (z12 && !z11) {
            return 1;
        }
        if (!z12 && z11) {
            return -1;
        }
        return this.f23371f - other.f23371f;
    }
}
