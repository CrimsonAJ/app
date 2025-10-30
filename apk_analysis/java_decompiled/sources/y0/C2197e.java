package y0;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: y0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2197e {

    /* renamed from: a, reason: collision with root package name */
    public final int f24747a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24748b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24749c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24751e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24752f;

    /* renamed from: g, reason: collision with root package name */
    public int f24753g;

    /* renamed from: h, reason: collision with root package name */
    public int f24754h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f24755i;

    public C2197e(int i9, int i10) {
        this.f24747a = Color.red(i9);
        this.f24748b = Color.green(i9);
        this.f24749c = Color.blue(i9);
        this.f24750d = i9;
        this.f24751e = i10;
    }

    public final void a() {
        int h7;
        int h9;
        if (!this.f24752f) {
            int i9 = this.f24750d;
            int e8 = H.a.e(-1, 4.5f, i9);
            int e9 = H.a.e(-1, 3.0f, i9);
            if (e8 != -1 && e9 != -1) {
                this.f24754h = H.a.h(-1, e8);
                this.f24753g = H.a.h(-1, e9);
                this.f24752f = true;
                return;
            }
            int e10 = H.a.e(-16777216, 4.5f, i9);
            int e11 = H.a.e(-16777216, 3.0f, i9);
            if (e10 != -1 && e11 != -1) {
                this.f24754h = H.a.h(-16777216, e10);
                this.f24753g = H.a.h(-16777216, e11);
                this.f24752f = true;
                return;
            }
            if (e8 != -1) {
                h7 = H.a.h(-1, e8);
            } else {
                h7 = H.a.h(-16777216, e10);
            }
            this.f24754h = h7;
            if (e9 != -1) {
                h9 = H.a.h(-1, e9);
            } else {
                h9 = H.a.h(-16777216, e11);
            }
            this.f24753g = h9;
            this.f24752f = true;
        }
    }

    public final float[] b() {
        if (this.f24755i == null) {
            this.f24755i = new float[3];
        }
        H.a.a(this.f24747a, this.f24748b, this.f24749c, this.f24755i);
        return this.f24755i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2197e.class == obj.getClass()) {
            C2197e c2197e = (C2197e) obj;
            if (this.f24751e == c2197e.f24751e && this.f24750d == c2197e.f24750d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24750d * 31) + this.f24751e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C2197e.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f24750d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.f24751e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.f24753g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.f24754h));
        sb.append(']');
        return sb.toString();
    }
}
