package C5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.gms.internal.measurement.Y1;

/* loaded from: classes.dex */
public final class d extends Y1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f1597n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TextPaint f1598o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y1 f1599p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f1600q;

    public d(e eVar, Context context, TextPaint textPaint, Y1 y12) {
        this.f1600q = eVar;
        this.f1597n = context;
        this.f1598o = textPaint;
        this.f1599p = y12;
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void w(int i9) {
        this.f1599p.w(i9);
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void x(Typeface typeface, boolean z9) {
        this.f1600q.g(this.f1597n, this.f1598o, typeface);
        this.f1599p.x(typeface, z9);
    }
}
