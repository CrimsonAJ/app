package Q2;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Y extends FrameLayout implements P {

    /* renamed from: a, reason: collision with root package name */
    public final C0360c f6201a;

    /* renamed from: b, reason: collision with root package name */
    public final W f6202b;

    /* renamed from: c, reason: collision with root package name */
    public List f6203c;

    /* renamed from: d, reason: collision with root package name */
    public C0361d f6204d;

    /* renamed from: e, reason: collision with root package name */
    public float f6205e;

    /* renamed from: f, reason: collision with root package name */
    public int f6206f;

    /* renamed from: g, reason: collision with root package name */
    public float f6207g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, android.webkit.WebView, Q2.W] */
    public Y(Context context) {
        super(context, null);
        this.f6203c = Collections.EMPTY_LIST;
        this.f6204d = C0361d.f6217g;
        this.f6205e = 0.0533f;
        this.f6206f = 0;
        this.f6207g = 0.08f;
        C0360c c0360c = new C0360c(context);
        this.f6201a = c0360c;
        ?? webView = new WebView(context, null);
        this.f6202b = webView;
        webView.setBackgroundColor(0);
        addView(c0360c);
        addView(webView);
    }

    @Override // Q2.P
    public final void a(List list, C0361d c0361d, float f9, int i9, float f10) {
        this.f6204d = c0361d;
        this.f6205e = f9;
        this.f6206f = i9;
        this.f6207g = f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Y3.b bVar = (Y3.b) list.get(i10);
            if (bVar.f8682d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f6203c.isEmpty() || !arrayList2.isEmpty()) {
            this.f6203c = arrayList2;
            c();
        }
        this.f6201a.a(arrayList, c0361d, f9, i9, f10);
        invalidate();
    }

    public final String b(int i9, float f9) {
        float x5 = Z0.a.x(f9, i9, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (x5 == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(x5 / getContext().getResources().getDisplayMetrics().density)};
        int i10 = l4.y.f20553a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x04c2, code lost:
    
        if (((android.text.style.TypefaceSpan) r8).getFamily() != null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0206, code lost:
    
        if (r28 != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0209, code lost:
    
        r30 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x020c, code lost:
    
        if (r28 != 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x054b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.Y.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        if (z9 && !this.f6203c.isEmpty()) {
            c();
        }
    }
}
