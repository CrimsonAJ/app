package C5;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.Y1;

/* loaded from: classes.dex */
public final class b extends Y1 {

    /* renamed from: n, reason: collision with root package name */
    public final Typeface f1592n;

    /* renamed from: o, reason: collision with root package name */
    public final a f1593o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1594p;

    public b(a aVar, Typeface typeface) {
        this.f1592n = typeface;
        this.f1593o = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void w(int i9) {
        if (!this.f1594p) {
            this.f1593o.r(this.f1592n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void x(Typeface typeface, boolean z9) {
        if (!this.f1594p) {
            this.f1593o.r(typeface);
        }
    }
}
