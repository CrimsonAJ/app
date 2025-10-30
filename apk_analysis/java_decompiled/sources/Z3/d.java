package Z3;

import android.text.Layout;
import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final E6.a f9001c = new E6.a(8);

    /* renamed from: a, reason: collision with root package name */
    public final Y3.b f9002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9003b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f9, int i9, float f10, int i10, boolean z9, int i11, int i12) {
        boolean z10;
        int i13;
        if (z9) {
            z10 = true;
            i13 = i11;
        } else {
            z10 = false;
            i13 = -16777216;
        }
        this.f9002a = new Y3.b(spannableStringBuilder, alignment, null, null, f9, 0, i9, f10, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, i13, Integer.MIN_VALUE, 0.0f);
        this.f9003b = i12;
    }
}
