package k2;

import J1.K0;
import M1.o;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1483a extends o {

    /* renamed from: u, reason: collision with root package name */
    public final K0 f19877u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1484b f19878v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1483a(C1484b c1484b, K0 k02) {
        super(k02);
        this.f19878v = c1484b;
        this.f19877u = k02;
    }

    @Override // M1.o
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void r(H2.b item) {
        int i9;
        int i10;
        kotlin.jvm.internal.h.e(item, "item");
        Context context = this.f2210a.getContext();
        int c3 = c();
        C1484b c1484b = this.f19878v;
        if (c3 == c1484b.f19881f) {
            i9 = R.color.white;
        } else {
            i9 = R.color.colorTextGray;
        }
        int color = context.getColor(i9);
        K0 k02 = this.f19877u;
        k02.f3708w.setTextColor(color);
        AppCompatTextView appCompatTextView = k02.f3707v;
        appCompatTextView.setTextColor(color);
        k02.f3708w.setText(item.f2982a);
        appCompatTextView.setText(String.valueOf(item.f2983b));
        if (c() == c1484b.f19881f) {
            i10 = R.drawable.background_selected_calendar;
        } else {
            i10 = R.drawable.background_calendar;
        }
        View view = k02.f7853k;
        view.setBackgroundResource(i10);
        view.setOnClickListener(new N1.e(c1484b, this, item, 3));
        k02.c0();
    }
}
