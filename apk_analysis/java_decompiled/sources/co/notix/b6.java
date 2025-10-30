package co.notix;

import N3.E;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes.dex */
public final class b6 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f11913a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(j6 j6Var) {
        super(1);
        this.f11913a = j6Var;
    }

    public final void a(List colors) {
        kotlin.jvm.internal.h.e(colors, "colors");
        A7.h hVar = (A7.h) B7.k.p0(colors);
        A7.h hVar2 = (A7.h) B7.k.p0(colors);
        j6 j6Var = this.f11913a;
        j6Var.runOnUiThread(new E(j6Var, hVar, hVar2, 2));
    }

    @Override // O7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((List) obj);
        return A7.n.f558a;
    }

    public static final void a(j6 this$0, A7.h textColors, A7.h buttonColors) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        kotlin.jvm.internal.h.e(textColors, "$textColors");
        kotlin.jvm.internal.h.e(buttonColors, "$buttonColors");
        j6.a(this$0, (i) this$0.c(), textColors);
        j6.a(this$0, this$0.j, buttonColors);
        View.OnClickListener b9 = this$0.b(((i) this$0.c()).f12422g);
        Object value = this$0.f12522k.getValue();
        kotlin.jvm.internal.h.d(value, "<get-image>(...)");
        ((ImageView) value).setOnClickListener(b9);
        Object value2 = this$0.f12523l.getValue();
        kotlin.jvm.internal.h.d(value2, "<get-background>(...)");
        ((ImageView) value2).setOnClickListener(b9);
        Object value3 = this$0.f12525n.getValue();
        kotlin.jvm.internal.h.d(value3, "<get-titleText>(...)");
        ((TextView) value3).setOnClickListener(b9);
        Object value4 = this$0.f12529r.getValue();
        kotlin.jvm.internal.h.d(value4, "<get-descriptionText>(...)");
        ((TextView) value4).setOnClickListener(b9);
        if (this$0.j != null) {
            Object value5 = this$0.f12531t.getValue();
            kotlin.jvm.internal.h.d(value5, "<get-button>(...)");
            ((TextView) value5).setOnClickListener(b9);
        }
    }
}
