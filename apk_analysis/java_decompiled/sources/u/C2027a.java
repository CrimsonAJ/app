package u;

import java.util.concurrent.CancellationException;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2027a {

    /* renamed from: c, reason: collision with root package name */
    public static final C2027a f23336c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2027a f23337d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23338a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f23339b;

    static {
        if (g.f23352d) {
            f23337d = null;
            f23336c = null;
        } else {
            f23337d = new C2027a(false, null);
            f23336c = new C2027a(true, null);
        }
    }

    public C2027a(boolean z9, CancellationException cancellationException) {
        this.f23338a = z9;
        this.f23339b = cancellationException;
    }
}
