package Q;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f6016a;

    /* renamed from: b, reason: collision with root package name */
    public final g f6017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6018c;

    public a(int i9, g gVar, int i10) {
        this.f6016a = i9;
        this.f6017b = gVar;
        this.f6018c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f6016a);
        this.f6017b.f6035a.performAction(this.f6018c, bundle);
    }
}
