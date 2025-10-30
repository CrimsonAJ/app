package co.notix;

import a.AbstractC0485a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.C0718Q;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v5 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final A7.e f13333a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.e f13334b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.e f13335c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.e f13336d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.e f13337e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        kotlin.jvm.internal.h.e(context, "context");
        this.f13333a = Z0.a.q(new r5(this));
        this.f13334b = Z0.a.q(new q5(this));
        this.f13335c = Z0.a.q(new u5(this));
        this.f13336d = Z0.a.q(new t5(this));
        this.f13337e = Z0.a.q(new s5(this));
    }

    private final ImageView getIvImage() {
        Object value = this.f13334b.getValue();
        kotlin.jvm.internal.h.d(value, "<get-ivImage>(...)");
        return (ImageView) value;
    }

    private final View getLlContainer() {
        Object value = this.f13333a.getValue();
        kotlin.jvm.internal.h.d(value, "<get-llContainer>(...)");
        return (View) value;
    }

    private final TextView getTvAdLabel() {
        Object value = this.f13337e.getValue();
        kotlin.jvm.internal.h.d(value, "<get-tvAdLabel>(...)");
        return (TextView) value;
    }

    private final TextView getTvDescription() {
        Object value = this.f13336d.getValue();
        kotlin.jvm.internal.h.d(value, "<get-tvDescription>(...)");
        return (TextView) value;
    }

    private final TextView getTvTitle() {
        Object value = this.f13335c.getValue();
        kotlin.jvm.internal.h.d(value, "<get-tvTitle>(...)");
        return (TextView) value;
    }

    public final void a(i adContent, int i9, int i10, kg onClick) {
        int i11;
        kotlin.jvm.internal.h.e(adContent, "adContent");
        kotlin.jvm.internal.h.e(onClick, "onClick");
        setBackground(new ColorDrawable(-1));
        Object obj = ((float) i9) > ((float) i10) * 1.5f ? o5.f12860a : p5.f12928a;
        if (kotlin.jvm.internal.h.a(obj, o5.f12860a)) {
            i11 = R.layout.notix_layout_banner_horizontal;
        } else {
            if (!kotlin.jvm.internal.h.a(obj, p5.f12928a)) {
                throw new RuntimeException();
            }
            i11 = R.layout.notix_layout_banner_vertical;
        }
        View.inflate(getContext(), i11, this);
        ImageView ivImage = getIvImage();
        ivImage.setImageBitmap(adContent.f12418c);
        ivImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ivImage.setMaxWidth((int) (h9.a(Integer.valueOf(i9)) * 0.43d));
        ivImage.setMaxHeight((int) (h9.a(Integer.valueOf(i10)) * 0.8d));
        ivImage.setAdjustViewBounds(true);
        getTvTitle().setText(adContent.f12416a);
        getTvDescription().setText(adContent.f12417b);
        setOnClickListener(new I5.k(adContent, 13, onClick));
    }

    public static final void a(i adContent, O7.a onClick, View view) {
        Object obj;
        kotlin.jvm.internal.h.e(adContent, "$adContent");
        kotlin.jvm.internal.h.e(onClick, "$onClick");
        tf tfVar = uf.f13293a;
        tfVar.getClass();
        vf vfVar = tfVar.f13226b;
        vfVar.getClass();
        y8 y8Var = vfVar.f13359c;
        f state = f.RESUMED;
        d9 d9Var = (d9) y8Var;
        d9Var.getClass();
        kotlin.jvm.internal.h.e(state, "state");
        Activity a5 = d9.a((WeakHashMap) ((C0718Q) d9Var.f12078b).h(), state);
        if (a5 != null) {
            String url = adContent.f12422g;
            kotlin.jvm.internal.h.e(url, "url");
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                a5.startActivity(intent);
                obj = intent;
            } catch (Throwable th) {
                obj = AbstractC0485a.h(th);
            }
            Throwable a9 = A7.j.a(obj);
            if (a9 == null) {
                md.f12779a.b("successfully started activity with url: ".concat(url));
            } else {
                kd kdVar = md.f12779a;
                StringBuilder r5 = AbstractC0953k1.r("couldn't start activity with url=", url, ", error=");
                r5.append(a9.getMessage());
                kdVar.a(r5.toString(), a9);
            }
        }
        onClick.invoke();
    }
}
