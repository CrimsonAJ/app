package Y3;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import j3.InterfaceC1453f;
import java.util.Arrays;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class b implements InterfaceC1453f {

    /* renamed from: r, reason: collision with root package name */
    public static final b f8677r = new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);

    /* renamed from: s, reason: collision with root package name */
    public static final X0.k f8678s = new X0.k(4);

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f8679a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f8680b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f8681c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f8682d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8683e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8684f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8685g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8686h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8687i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f8688k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8689l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8690m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8691n;

    /* renamed from: o, reason: collision with root package name */
    public final float f8692o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8693p;

    /* renamed from: q, reason: collision with root package name */
    public final float f8694q;

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f9, int i9, int i10, float f10, int i11, int i12, float f11, float f12, float f13, boolean z9, int i13, int i14, float f14) {
        boolean z10;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC1566a.h(z10);
        }
        if (charSequence instanceof Spanned) {
            this.f8679a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f8679a = charSequence.toString();
        } else {
            this.f8679a = null;
        }
        this.f8680b = alignment;
        this.f8681c = alignment2;
        this.f8682d = bitmap;
        this.f8683e = f9;
        this.f8684f = i9;
        this.f8685g = i10;
        this.f8686h = f10;
        this.f8687i = i11;
        this.j = f12;
        this.f8688k = f13;
        this.f8689l = z9;
        this.f8690m = i13;
        this.f8691n = i12;
        this.f8692o = f11;
        this.f8693p = i14;
        this.f8694q = f14;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y3.a, java.lang.Object] */
    public final a a() {
        ?? obj = new Object();
        obj.f8661a = this.f8679a;
        obj.f8662b = this.f8682d;
        obj.f8663c = this.f8680b;
        obj.f8664d = this.f8681c;
        obj.f8665e = this.f8683e;
        obj.f8666f = this.f8684f;
        obj.f8667g = this.f8685g;
        obj.f8668h = this.f8686h;
        obj.f8669i = this.f8687i;
        obj.j = this.f8691n;
        obj.f8670k = this.f8692o;
        obj.f8671l = this.j;
        obj.f8672m = this.f8688k;
        obj.f8673n = this.f8689l;
        obj.f8674o = this.f8690m;
        obj.f8675p = this.f8693p;
        obj.f8676q = this.f8694q;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f8679a, bVar.f8679a) && this.f8680b == bVar.f8680b && this.f8681c == bVar.f8681c) {
                Bitmap bitmap = bVar.f8682d;
                Bitmap bitmap2 = this.f8682d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f8683e == bVar.f8683e && this.f8684f == bVar.f8684f && this.f8685g == bVar.f8685g && this.f8686h == bVar.f8686h && this.f8687i == bVar.f8687i && this.j == bVar.j && this.f8688k == bVar.f8688k && this.f8689l == bVar.f8689l && this.f8690m == bVar.f8690m && this.f8691n == bVar.f8691n && this.f8692o == bVar.f8692o && this.f8693p == bVar.f8693p && this.f8694q == bVar.f8694q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8679a, this.f8680b, this.f8681c, this.f8682d, Float.valueOf(this.f8683e), Integer.valueOf(this.f8684f), Integer.valueOf(this.f8685g), Float.valueOf(this.f8686h), Integer.valueOf(this.f8687i), Float.valueOf(this.j), Float.valueOf(this.f8688k), Boolean.valueOf(this.f8689l), Integer.valueOf(this.f8690m), Integer.valueOf(this.f8691n), Float.valueOf(this.f8692o), Integer.valueOf(this.f8693p), Float.valueOf(this.f8694q)});
    }
}
