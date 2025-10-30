package v1;

import A6.t;
import java.io.IOException;
import java.util.ArrayList;
import x8.y;

/* renamed from: v1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2094b {

    /* renamed from: a, reason: collision with root package name */
    public final String f23728a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f23729b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23730c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23731d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23732e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23733f;

    /* renamed from: g, reason: collision with root package name */
    public t f23734g;

    /* renamed from: h, reason: collision with root package name */
    public int f23735h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2098f f23736i;

    public C2094b(C2098f c2098f, String str) {
        this.f23736i = c2098f;
        this.f23728a = str;
        c2098f.getClass();
        this.f23729b = new long[2];
        c2098f.getClass();
        this.f23730c = new ArrayList(2);
        c2098f.getClass();
        this.f23731d = new ArrayList(2);
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        c2098f.getClass();
        for (int i9 = 0; i9 < 2; i9++) {
            sb.append(i9);
            this.f23730c.add(this.f23736i.f23743a.e(sb.toString()));
            sb.append(".tmp");
            this.f23731d.add(this.f23736i.f23743a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final C2095c a() {
        if (this.f23732e && this.f23734g == null && !this.f23733f) {
            ArrayList arrayList = this.f23730c;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                C2098f c2098f = this.f23736i;
                if (i9 < size) {
                    if (!c2098f.f23757p.e((y) arrayList.get(i9))) {
                        try {
                            c2098f.S(this);
                            return null;
                        } catch (IOException unused) {
                        }
                    } else {
                        i9++;
                    }
                } else {
                    this.f23735h++;
                    return new C2095c(c2098f, this);
                }
            }
        }
        return null;
    }
}
