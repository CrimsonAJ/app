package androidx.mediarouter.app;

import java.util.Comparator;

/* renamed from: androidx.mediarouter.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C0567c f10067b = new C0567c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0567c f10068c = new C0567c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0567c f10069d = new C0567c(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10070a;

    public /* synthetic */ C0567c(int i9) {
        this.f10070a = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10070a) {
            case 0:
                return ((t0.C) obj).f22843d.compareToIgnoreCase(((t0.C) obj2).f22843d);
            case 1:
                return ((t0.C) obj).f22843d.compareToIgnoreCase(((t0.C) obj2).f22843d);
            default:
                return ((t0.C) obj).f22843d.compareToIgnoreCase(((t0.C) obj2).f22843d);
        }
    }
}
