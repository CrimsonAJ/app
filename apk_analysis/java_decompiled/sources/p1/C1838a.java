package p1;

import java.util.concurrent.CancellationException;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1838a {

    /* renamed from: c, reason: collision with root package name */
    public static final C1838a f22107c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1838a f22108d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22109a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f22110b;

    static {
        if (AbstractC1845h.f22127d) {
            f22108d = null;
            f22107c = null;
        } else {
            f22108d = new C1838a(false, null);
            f22107c = new C1838a(true, null);
        }
    }

    public C1838a(boolean z9, CancellationException cancellationException) {
        this.f22109a = z9;
        this.f22110b = cancellationException;
    }
}
