package androidx.constraintlayout.widget;

import A4.r;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import co.notix.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import k4.C1499E;
import l3.I;
import org.xmlpull.v1.XmlPullParserException;
import w.C2125e;
import x.C2149d;
import x.C2150e;
import x.C2153h;
import z.AbstractC2223c;
import z.AbstractC2224d;
import z.C2225e;
import z.C2226f;
import z.l;
import z.m;
import z.n;
import z.p;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f9528a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9529b;

    /* renamed from: c, reason: collision with root package name */
    public final C2150e f9530c;

    /* renamed from: d, reason: collision with root package name */
    public int f9531d;

    /* renamed from: e, reason: collision with root package name */
    public int f9532e;

    /* renamed from: f, reason: collision with root package name */
    public int f9533f;

    /* renamed from: g, reason: collision with root package name */
    public int f9534g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9535h;

    /* renamed from: i, reason: collision with root package name */
    public int f9536i;
    public l j;

    /* renamed from: k, reason: collision with root package name */
    public C1499E f9537k;

    /* renamed from: l, reason: collision with root package name */
    public int f9538l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f9539m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f9540n;

    /* renamed from: o, reason: collision with root package name */
    public final I f9541o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9528a = new SparseArray();
        this.f9529b = new ArrayList(4);
        this.f9530c = new C2150e();
        this.f9531d = 0;
        this.f9532e = 0;
        this.f9533f = Integer.MAX_VALUE;
        this.f9534g = Integer.MAX_VALUE;
        this.f9535h = true;
        this.f9536i = 263;
        this.j = null;
        this.f9537k = null;
        this.f9538l = -1;
        this.f9539m = new HashMap();
        this.f9540n = new SparseArray();
        this.f9541o = new I(this);
        c(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z.e, android.view.ViewGroup$MarginLayoutParams] */
    public static C2225e a() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f25219a = -1;
        marginLayoutParams.f25221b = -1;
        marginLayoutParams.f25223c = -1.0f;
        marginLayoutParams.f25225d = -1;
        marginLayoutParams.f25227e = -1;
        marginLayoutParams.f25229f = -1;
        marginLayoutParams.f25231g = -1;
        marginLayoutParams.f25233h = -1;
        marginLayoutParams.f25235i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.f25238k = -1;
        marginLayoutParams.f25240l = -1;
        marginLayoutParams.f25241m = -1;
        marginLayoutParams.f25242n = 0;
        marginLayoutParams.f25243o = 0.0f;
        marginLayoutParams.f25244p = -1;
        marginLayoutParams.f25245q = -1;
        marginLayoutParams.f25246r = -1;
        marginLayoutParams.f25247s = -1;
        marginLayoutParams.f25248t = -1;
        marginLayoutParams.f25249u = -1;
        marginLayoutParams.f25250v = -1;
        marginLayoutParams.f25251w = -1;
        marginLayoutParams.f25252x = -1;
        marginLayoutParams.f25253y = -1;
        marginLayoutParams.f25254z = 0.5f;
        marginLayoutParams.f25195A = 0.5f;
        marginLayoutParams.f25196B = null;
        marginLayoutParams.f25197C = 1;
        marginLayoutParams.f25198D = -1.0f;
        marginLayoutParams.f25199E = -1.0f;
        marginLayoutParams.f25200F = 0;
        marginLayoutParams.f25201G = 0;
        marginLayoutParams.f25202H = 0;
        marginLayoutParams.f25203I = 0;
        marginLayoutParams.f25204J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.f25205L = 0;
        marginLayoutParams.f25206M = 0;
        marginLayoutParams.f25207N = 1.0f;
        marginLayoutParams.f25208O = 1.0f;
        marginLayoutParams.f25209P = -1;
        marginLayoutParams.f25210Q = -1;
        marginLayoutParams.f25211R = -1;
        marginLayoutParams.f25212S = false;
        marginLayoutParams.f25213T = false;
        marginLayoutParams.f25214U = null;
        marginLayoutParams.f25215V = true;
        marginLayoutParams.f25216W = true;
        marginLayoutParams.f25217X = false;
        marginLayoutParams.Y = false;
        marginLayoutParams.f25218Z = false;
        marginLayoutParams.f25220a0 = -1;
        marginLayoutParams.f25222b0 = -1;
        marginLayoutParams.f25224c0 = -1;
        marginLayoutParams.f25226d0 = -1;
        marginLayoutParams.f25228e0 = -1;
        marginLayoutParams.f25230f0 = -1;
        marginLayoutParams.f25232g0 = 0.5f;
        marginLayoutParams.f25239k0 = new C2149d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public final C2149d b(View view) {
        if (view == this) {
            return this.f9530c;
        }
        if (view == null) {
            return null;
        }
        return ((C2225e) view.getLayoutParams()).f25239k0;
    }

    public final void c(AttributeSet attributeSet, int i9) {
        C2150e c2150e = this.f9530c;
        c2150e.f24364U = this;
        I i10 = this.f9541o;
        c2150e.f24400g0 = i10;
        c2150e.f24399f0.f24661g = i10;
        this.f9528a.put(getId(), this);
        this.j = null;
        boolean z9 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f25352b, i9, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 9) {
                    this.f9531d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9531d);
                } else if (index == 10) {
                    this.f9532e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9532e);
                } else if (index == 7) {
                    this.f9533f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9533f);
                } else if (index == 8) {
                    this.f9534g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9534g);
                } else if (index == 89) {
                    this.f9536i = obtainStyledAttributes.getInt(index, this.f9536i);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f9537k = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        l lVar = new l();
                        this.j = lVar;
                        lVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.f9538l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i12 = this.f9536i;
        c2150e.f24409p0 = i12;
        if ((i12 & 256) == 256) {
            z9 = true;
        }
        C2125e.f23930p = z9;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2225e;
    }

    public final void d(int i9) {
        char c3;
        Context context = getContext();
        C1499E c1499e = new C1499E(26, false);
        c1499e.f19985b = new SparseArray();
        c1499e.f19986c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i9);
        try {
            r rVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                        }
                        c3 = 65535;
                        if (c3 != 0 && c3 != 1) {
                            if (c3 != 2) {
                                if (c3 != 3) {
                                    if (c3 != 4) {
                                        Log.v("ConstraintLayoutStates", "unknown tag " + name);
                                    } else {
                                        c1499e.u(context, xml);
                                    }
                                } else {
                                    C2226f c2226f = new C2226f(context, xml);
                                    if (rVar != null) {
                                        ((ArrayList) rVar.f384c).add(c2226f);
                                    }
                                }
                            } else {
                                rVar = new r(context, xml);
                                ((SparseArray) c1499e.f19985b).put(rVar.f382a, rVar);
                            }
                        }
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
        this.f9537k = c1499e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f9529b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((AbstractC2223c) arrayList.get(i9)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i11 = (int) ((parseInt / 1080.0f) * width);
                        int i12 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f9 = i11;
                        float f10 = i12;
                        float f11 = i11 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f9, f10, f11, f10, paint);
                        float parseInt4 = i12 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f9, parseInt4, paint);
                        canvas.drawLine(f9, parseInt4, f9, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f9, f10, f11, parseInt4, paint);
                        canvas.drawLine(f9, parseInt4, f11, f10, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(x.C2150e r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e(x.e, int, int, int):void");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f9535h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z.e, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i9;
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f25219a = -1;
        marginLayoutParams.f25221b = -1;
        marginLayoutParams.f25223c = -1.0f;
        marginLayoutParams.f25225d = -1;
        marginLayoutParams.f25227e = -1;
        marginLayoutParams.f25229f = -1;
        marginLayoutParams.f25231g = -1;
        marginLayoutParams.f25233h = -1;
        marginLayoutParams.f25235i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.f25238k = -1;
        marginLayoutParams.f25240l = -1;
        marginLayoutParams.f25241m = -1;
        marginLayoutParams.f25242n = 0;
        marginLayoutParams.f25243o = 0.0f;
        marginLayoutParams.f25244p = -1;
        marginLayoutParams.f25245q = -1;
        marginLayoutParams.f25246r = -1;
        marginLayoutParams.f25247s = -1;
        marginLayoutParams.f25248t = -1;
        marginLayoutParams.f25249u = -1;
        marginLayoutParams.f25250v = -1;
        marginLayoutParams.f25251w = -1;
        marginLayoutParams.f25252x = -1;
        marginLayoutParams.f25253y = -1;
        marginLayoutParams.f25254z = 0.5f;
        marginLayoutParams.f25195A = 0.5f;
        marginLayoutParams.f25196B = null;
        marginLayoutParams.f25197C = 1;
        marginLayoutParams.f25198D = -1.0f;
        marginLayoutParams.f25199E = -1.0f;
        marginLayoutParams.f25200F = 0;
        marginLayoutParams.f25201G = 0;
        marginLayoutParams.f25202H = 0;
        marginLayoutParams.f25203I = 0;
        marginLayoutParams.f25204J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.f25205L = 0;
        marginLayoutParams.f25206M = 0;
        marginLayoutParams.f25207N = 1.0f;
        marginLayoutParams.f25208O = 1.0f;
        marginLayoutParams.f25209P = -1;
        marginLayoutParams.f25210Q = -1;
        marginLayoutParams.f25211R = -1;
        marginLayoutParams.f25212S = false;
        marginLayoutParams.f25213T = false;
        marginLayoutParams.f25214U = null;
        marginLayoutParams.f25215V = true;
        marginLayoutParams.f25216W = true;
        marginLayoutParams.f25217X = false;
        marginLayoutParams.Y = false;
        marginLayoutParams.f25218Z = false;
        marginLayoutParams.f25220a0 = -1;
        marginLayoutParams.f25222b0 = -1;
        marginLayoutParams.f25224c0 = -1;
        marginLayoutParams.f25226d0 = -1;
        marginLayoutParams.f25228e0 = -1;
        marginLayoutParams.f25230f0 = -1;
        marginLayoutParams.f25232g0 = 0.5f;
        marginLayoutParams.f25239k0 = new C2149d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f25352b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            int i11 = AbstractC2224d.f25194a.get(index);
            switch (i11) {
                case 1:
                    marginLayoutParams.f25211R = obtainStyledAttributes.getInt(index, marginLayoutParams.f25211R);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25241m);
                    marginLayoutParams.f25241m = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f25241m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f25242n = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25242n);
                    break;
                case 4:
                    float f9 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f25243o) % 360.0f;
                    marginLayoutParams.f25243o = f9;
                    if (f9 < 0.0f) {
                        marginLayoutParams.f25243o = (360.0f - f9) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.f25219a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f25219a);
                    break;
                case 6:
                    marginLayoutParams.f25221b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f25221b);
                    break;
                case 7:
                    marginLayoutParams.f25223c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f25223c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25225d);
                    marginLayoutParams.f25225d = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f25225d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25227e);
                    marginLayoutParams.f25227e = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f25227e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.GradientColor_android_endX /* 10 */:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25229f);
                    marginLayoutParams.f25229f = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f25229f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.GradientColor_android_endY /* 11 */:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25231g);
                    marginLayoutParams.f25231g = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.f25231g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25233h);
                    marginLayoutParams.f25233h = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.f25233h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25235i);
                    marginLayoutParams.f25235i = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f25235i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.j);
                    marginLayoutParams.j = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25238k);
                    marginLayoutParams.f25238k = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f25238k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25240l);
                    marginLayoutParams.f25240l = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f25240l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25244p);
                    marginLayoutParams.f25244p = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f25244p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25245q);
                    marginLayoutParams.f25245q = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f25245q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25246r);
                    marginLayoutParams.f25246r = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f25246r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f25247s);
                    marginLayoutParams.f25247s = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f25247s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f25248t = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25248t);
                    break;
                case 22:
                    marginLayoutParams.f25249u = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25249u);
                    break;
                case 23:
                    marginLayoutParams.f25250v = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25250v);
                    break;
                case 24:
                    marginLayoutParams.f25251w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25251w);
                    break;
                case 25:
                    marginLayoutParams.f25252x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25252x);
                    break;
                case 26:
                    marginLayoutParams.f25253y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25253y);
                    break;
                case 27:
                    marginLayoutParams.f25212S = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f25212S);
                    break;
                case 28:
                    marginLayoutParams.f25213T = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f25213T);
                    break;
                case 29:
                    marginLayoutParams.f25254z = obtainStyledAttributes.getFloat(index, marginLayoutParams.f25254z);
                    break;
                case 30:
                    marginLayoutParams.f25195A = obtainStyledAttributes.getFloat(index, marginLayoutParams.f25195A);
                    break;
                case 31:
                    int i12 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f25202H = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i13 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f25203I = i13;
                    if (i13 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f25204J = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25204J);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f25204J) == -2) {
                            marginLayoutParams.f25204J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f25205L = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25205L);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f25205L) == -2) {
                            marginLayoutParams.f25205L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f25207N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f25207N));
                    marginLayoutParams.f25202H = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.K = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.K);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.K) == -2) {
                            marginLayoutParams.K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f25206M = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25206M);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f25206M) == -2) {
                            marginLayoutParams.f25206M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f25208O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f25208O));
                    marginLayoutParams.f25203I = 2;
                    break;
                default:
                    switch (i11) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            marginLayoutParams.f25196B = string;
                            marginLayoutParams.f25197C = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = marginLayoutParams.f25196B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i9 = 0;
                                } else {
                                    String substring = marginLayoutParams.f25196B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        marginLayoutParams.f25197C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        marginLayoutParams.f25197C = 1;
                                    }
                                    i9 = indexOf + 1;
                                }
                                int indexOf2 = marginLayoutParams.f25196B.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = marginLayoutParams.f25196B.substring(i9, indexOf2);
                                    String substring3 = marginLayoutParams.f25196B.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring2);
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (marginLayoutParams.f25197C == 1) {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = marginLayoutParams.f25196B.substring(i9);
                                    if (substring4.length() > 0) {
                                        Float.parseFloat(substring4);
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            marginLayoutParams.f25198D = obtainStyledAttributes.getFloat(index, marginLayoutParams.f25198D);
                            break;
                        case 46:
                            marginLayoutParams.f25199E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f25199E);
                            break;
                        case 47:
                            marginLayoutParams.f25200F = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f25201G = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f25209P = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f25209P);
                            break;
                        case 50:
                            marginLayoutParams.f25210Q = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f25210Q);
                            break;
                        case 51:
                            marginLayoutParams.f25214U = obtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f9534g;
    }

    public int getMaxWidth() {
        return this.f9533f;
    }

    public int getMinHeight() {
        return this.f9532e;
    }

    public int getMinWidth() {
        return this.f9531d;
    }

    public int getOptimizationLevel() {
        return this.f9530c.f24409p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            C2225e c2225e = (C2225e) childAt.getLayoutParams();
            C2149d c2149d = c2225e.f25239k0;
            if (childAt.getVisibility() != 8 || c2225e.Y || c2225e.f25218Z || isInEditMode) {
                int m9 = c2149d.m();
                int n7 = c2149d.n();
                childAt.layout(m9, n7, c2149d.l() + m9, c2149d.i() + n7);
            }
        }
        ArrayList arrayList = this.f9529b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((AbstractC2223c) arrayList.get(i14)).g();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:272:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0329  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r36, int r37) {
        /*
            Method dump skipped, instructions count: 1613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C2149d b9 = b(view);
        if ((view instanceof n) && !(b9 instanceof C2153h)) {
            C2225e c2225e = (C2225e) view.getLayoutParams();
            C2153h c2153h = new C2153h();
            c2225e.f25239k0 = c2153h;
            c2225e.Y = true;
            c2153h.B(c2225e.f25211R);
        }
        if (view instanceof AbstractC2223c) {
            AbstractC2223c abstractC2223c = (AbstractC2223c) view;
            abstractC2223c.h();
            ((C2225e) view.getLayoutParams()).f25218Z = true;
            ArrayList arrayList = this.f9529b;
            if (!arrayList.contains(abstractC2223c)) {
                arrayList.add(abstractC2223c);
            }
        }
        this.f9528a.put(view.getId(), view);
        this.f9535h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f9528a.remove(view.getId());
        C2149d b9 = b(view);
        this.f9530c.f24397d0.remove(b9);
        b9.f24353I = null;
        this.f9529b.remove(view);
        this.f9535h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f9535h = true;
        super.requestLayout();
    }

    public void setConstraintSet(l lVar) {
        this.j = lVar;
    }

    @Override // android.view.View
    public void setId(int i9) {
        int id = getId();
        SparseArray sparseArray = this.f9528a;
        sparseArray.remove(id);
        super.setId(i9);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i9) {
        if (i9 == this.f9534g) {
            return;
        }
        this.f9534g = i9;
        requestLayout();
    }

    public void setMaxWidth(int i9) {
        if (i9 == this.f9533f) {
            return;
        }
        this.f9533f = i9;
        requestLayout();
    }

    public void setMinHeight(int i9) {
        if (i9 == this.f9532e) {
            return;
        }
        this.f9532e = i9;
        requestLayout();
    }

    public void setMinWidth(int i9) {
        if (i9 == this.f9531d) {
            return;
        }
        this.f9531d = i9;
        requestLayout();
    }

    public void setOnConstraintsChanged(m mVar) {
        C1499E c1499e = this.f9537k;
        if (c1499e != null) {
            c1499e.getClass();
        }
    }

    public void setOptimizationLevel(int i9) {
        boolean z9;
        this.f9536i = i9;
        this.f9530c.f24409p0 = i9;
        if ((i9 & 256) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        C2125e.f23930p = z9;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f9528a = new SparseArray();
        this.f9529b = new ArrayList(4);
        this.f9530c = new C2150e();
        this.f9531d = 0;
        this.f9532e = 0;
        this.f9533f = Integer.MAX_VALUE;
        this.f9534g = Integer.MAX_VALUE;
        this.f9535h = true;
        this.f9536i = 263;
        this.j = null;
        this.f9537k = null;
        this.f9538l = -1;
        this.f9539m = new HashMap();
        this.f9540n = new SparseArray();
        this.f9541o = new I(this);
        c(attributeSet, i9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z.e, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f25219a = -1;
        marginLayoutParams.f25221b = -1;
        marginLayoutParams.f25223c = -1.0f;
        marginLayoutParams.f25225d = -1;
        marginLayoutParams.f25227e = -1;
        marginLayoutParams.f25229f = -1;
        marginLayoutParams.f25231g = -1;
        marginLayoutParams.f25233h = -1;
        marginLayoutParams.f25235i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.f25238k = -1;
        marginLayoutParams.f25240l = -1;
        marginLayoutParams.f25241m = -1;
        marginLayoutParams.f25242n = 0;
        marginLayoutParams.f25243o = 0.0f;
        marginLayoutParams.f25244p = -1;
        marginLayoutParams.f25245q = -1;
        marginLayoutParams.f25246r = -1;
        marginLayoutParams.f25247s = -1;
        marginLayoutParams.f25248t = -1;
        marginLayoutParams.f25249u = -1;
        marginLayoutParams.f25250v = -1;
        marginLayoutParams.f25251w = -1;
        marginLayoutParams.f25252x = -1;
        marginLayoutParams.f25253y = -1;
        marginLayoutParams.f25254z = 0.5f;
        marginLayoutParams.f25195A = 0.5f;
        marginLayoutParams.f25196B = null;
        marginLayoutParams.f25197C = 1;
        marginLayoutParams.f25198D = -1.0f;
        marginLayoutParams.f25199E = -1.0f;
        marginLayoutParams.f25200F = 0;
        marginLayoutParams.f25201G = 0;
        marginLayoutParams.f25202H = 0;
        marginLayoutParams.f25203I = 0;
        marginLayoutParams.f25204J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.f25205L = 0;
        marginLayoutParams.f25206M = 0;
        marginLayoutParams.f25207N = 1.0f;
        marginLayoutParams.f25208O = 1.0f;
        marginLayoutParams.f25209P = -1;
        marginLayoutParams.f25210Q = -1;
        marginLayoutParams.f25211R = -1;
        marginLayoutParams.f25212S = false;
        marginLayoutParams.f25213T = false;
        marginLayoutParams.f25214U = null;
        marginLayoutParams.f25215V = true;
        marginLayoutParams.f25216W = true;
        marginLayoutParams.f25217X = false;
        marginLayoutParams.Y = false;
        marginLayoutParams.f25218Z = false;
        marginLayoutParams.f25220a0 = -1;
        marginLayoutParams.f25222b0 = -1;
        marginLayoutParams.f25224c0 = -1;
        marginLayoutParams.f25226d0 = -1;
        marginLayoutParams.f25228e0 = -1;
        marginLayoutParams.f25230f0 = -1;
        marginLayoutParams.f25232g0 = 0.5f;
        marginLayoutParams.f25239k0 = new C2149d();
        return marginLayoutParams;
    }
}
