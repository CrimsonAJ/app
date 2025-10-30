package j3;

import java.io.IOException;

/* loaded from: classes.dex */
public class j0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19659b;

    public j0(String str, Exception exc, boolean z9, int i9) {
        super(str, exc);
        this.f19658a = z9;
        this.f19659b = i9;
    }

    public static j0 a(String str, Exception exc) {
        return new j0(str, exc, true, 1);
    }

    public static j0 b(String str, Exception exc) {
        return new j0(str, exc, true, 4);
    }

    public static j0 c(String str) {
        return new j0(str, null, false, 1);
    }
}
