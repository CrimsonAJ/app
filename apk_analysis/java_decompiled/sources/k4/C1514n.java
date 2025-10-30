package k4;

import java.io.IOException;

/* renamed from: k4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1514n extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20070b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f20071a;

    public C1514n(int i9) {
        this.f20071a = i9;
    }

    public C1514n(Exception exc, int i9) {
        super(exc);
        this.f20071a = i9;
    }

    public C1514n(String str, int i9) {
        super(str);
        this.f20071a = i9;
    }

    public C1514n(String str, Exception exc, int i9) {
        super(str, exc);
        this.f20071a = i9;
    }
}
