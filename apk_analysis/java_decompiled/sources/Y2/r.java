package Y2;

import B6.u0;
import B7.u;
import F4.y;
import P5.F;
import P5.S;
import P5.X;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import co.notix.R;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.internal.cast.B;
import com.google.android.gms.internal.cast.C0816e1;
import com.google.android.gms.internal.cast.C0818f;
import com.google.android.gms.internal.cast.C0824g1;
import com.google.android.gms.internal.cast.C0828h1;
import com.google.android.gms.internal.cast.D;
import com.google.android.gms.internal.cast.E0;
import com.google.android.gms.internal.cast.F0;
import com.google.android.gms.internal.cast.N0;
import com.google.android.gms.internal.cast.O0;
import com.google.android.gms.internal.cast.P0;
import com.google.android.gms.internal.cast.Q0;
import com.google.android.gms.internal.cast.R0;
import com.google.android.gms.internal.cast.S0;
import com.google.android.gms.internal.cast.S1;
import com.google.android.gms.internal.cast.T0;
import com.google.android.gms.internal.cast.T1;
import com.google.android.gms.internal.cast.U0;
import com.google.android.gms.internal.cast.V0;
import com.google.android.gms.internal.cast.W0;
import com.google.android.gms.internal.cast.X0;
import com.google.android.gms.internal.cast.Y;
import com.google.android.gms.internal.cast.Y0;
import com.google.android.gms.internal.cast.i3;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d3.C1119a;
import f4.C1163a;
import f4.C1166d;
import f4.C1167e;
import f5.C1183o;
import i8.C1418h;
import i8.G;
import i8.InterfaceC1420j;
import i8.J;
import i8.L;
import i8.w;
import i8.x;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import l6.AbstractC1570b;
import m0.AbstractC1579b;
import o4.C1696b;
import o4.C1698d;
import o4.InterfaceC1695a;
import u4.C2079d;
import w4.AsyncTaskC2140b;
import z1.C2234a;

/* loaded from: classes.dex */
public final class r implements A7.e, Y3.g, InterfaceC1420j, s6.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f8647a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8648b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8649c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8650d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8651e;

    public r(Context context) {
        this(context, new v4.b(-1, 0, 0));
    }

    public static void W(r rVar, D d9) {
        int i9 = d9.f14702e;
        if (i9 == 2 && ((i3) rVar.f8650d) != null) {
            rVar.Y();
        }
        if (i9 == 2) {
            rVar.f8650d = new i3((Y) rVar.f8647a, (String) rVar.f8648b);
        } else {
            rVar.f8650d = rVar.X();
        }
        i3 i3Var = (i3) rVar.f8650d;
        y.h(i3Var);
        d9.f14701d = i3Var.f14878h;
        i3Var.f14872b.add(d9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y2.r, java.lang.Object] */
    public static r t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ?? obj = new Object();
        obj.f8650d = new ArrayDeque();
        obj.f8647a = sharedPreferences;
        obj.f8648b = "topic_operation_queue";
        obj.f8649c = ",";
        obj.f8651e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) obj.f8650d)) {
            try {
                ((ArrayDeque) obj.f8650d).clear();
                String string = ((SharedPreferences) obj.f8647a).getString((String) obj.f8648b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) obj.f8649c)) {
                    String[] split = string.split((String) obj.f8649c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) obj.f8650d).add(str);
                        }
                    }
                    return obj;
                }
                return obj;
            } finally {
            }
        }
    }

    public int A(int i9, InterfaceC1695a interfaceC1695a, int i10) {
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f8647a;
        C1698d c1698d = (C1698d) interfaceC1695a;
        int H8 = flexboxLayoutManager.H() + flexboxLayoutManager.K() + ((ViewGroup.MarginLayoutParams) c1698d).topMargin + ((ViewGroup.MarginLayoutParams) c1698d).bottomMargin + i10;
        int i11 = ((ViewGroup.MarginLayoutParams) c1698d).height;
        int x5 = androidx.recyclerview.widget.a.x(flexboxLayoutManager.f(), flexboxLayoutManager.f10350o, flexboxLayoutManager.f10348m, H8, i11);
        int size = View.MeasureSpec.getSize(x5);
        int i12 = c1698d.f21624l;
        if (size > i12) {
            return View.MeasureSpec.makeMeasureSpec(i12, View.MeasureSpec.getMode(x5));
        }
        int i13 = c1698d.j;
        if (size < i13) {
            return View.MeasureSpec.makeMeasureSpec(i13, View.MeasureSpec.getMode(x5));
        }
        return x5;
    }

    public int B(int i9, InterfaceC1695a interfaceC1695a, int i10) {
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f8647a;
        C1698d c1698d = (C1698d) interfaceC1695a;
        int J8 = flexboxLayoutManager.J() + flexboxLayoutManager.I() + ((ViewGroup.MarginLayoutParams) c1698d).leftMargin + ((ViewGroup.MarginLayoutParams) c1698d).rightMargin + i10;
        int i11 = ((ViewGroup.MarginLayoutParams) c1698d).width;
        int x5 = androidx.recyclerview.widget.a.x(flexboxLayoutManager.e(), flexboxLayoutManager.f10349n, flexboxLayoutManager.f10347l, J8, i11);
        int size = View.MeasureSpec.getSize(x5);
        int i12 = c1698d.f21623k;
        if (size > i12) {
            return View.MeasureSpec.makeMeasureSpec(i12, View.MeasureSpec.getMode(x5));
        }
        int i13 = c1698d.f21622i;
        if (size < i13) {
            return View.MeasureSpec.makeMeasureSpec(i13, View.MeasureSpec.getMode(x5));
        }
        return x5;
    }

    public s6.n C(Class cls) {
        return g(s6.p.a(cls));
    }

    public void D(String name, String value) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        C1183o c1183o = (C1183o) this.f8649c;
        c1183o.getClass();
        u0.h(name);
        u0.i(value, name);
        c1183o.E(name);
        c1183o.x(name, value);
    }

    public void E(View view, C1696b c1696b, int i9, int i10, int i11, int i12) {
        InterfaceC1695a interfaceC1695a = (InterfaceC1695a) view.getLayoutParams();
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f8647a;
        int i13 = flexboxLayoutManager.f14535r;
        C1698d c1698d = (C1698d) interfaceC1695a;
        int i14 = c1698d.f21620g;
        if (i14 != -1) {
            i13 = i14;
        }
        int i15 = c1696b.f21599c;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            return;
                        }
                    } else if (flexboxLayoutManager.f14534q != 2) {
                        int max = Math.max(c1696b.f21604h - view.getBaseline(), ((ViewGroup.MarginLayoutParams) c1698d).topMargin);
                        view.layout(i9, i10 + max, i11, i12 + max);
                        return;
                    } else {
                        int max2 = Math.max(view.getBaseline() + (c1696b.f21604h - view.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) c1698d).bottomMargin);
                        view.layout(i9, i10 - max2, i11, i12 - max2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i15 - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) c1698d).topMargin) - ((ViewGroup.MarginLayoutParams) c1698d).bottomMargin) / 2;
                    if (flexboxLayoutManager.f14534q != 2) {
                        int i16 = i10 + measuredHeight;
                        view.layout(i9, i16, i11, view.getMeasuredHeight() + i16);
                        return;
                    } else {
                        int i17 = i10 - measuredHeight;
                        view.layout(i9, i17, i11, view.getMeasuredHeight() + i17);
                        return;
                    }
                }
            } else {
                if (flexboxLayoutManager.f14534q != 2) {
                    int i18 = i10 + i15;
                    int measuredHeight2 = i18 - view.getMeasuredHeight();
                    int i19 = ((ViewGroup.MarginLayoutParams) c1698d).bottomMargin;
                    view.layout(i9, measuredHeight2 - i19, i11, i18 - i19);
                    return;
                }
                view.layout(i9, view.getMeasuredHeight() + (i10 - i15) + ((ViewGroup.MarginLayoutParams) c1698d).topMargin, i11, view.getMeasuredHeight() + (i12 - i15) + ((ViewGroup.MarginLayoutParams) c1698d).topMargin);
                return;
            }
        }
        if (flexboxLayoutManager.f14534q != 2) {
            int i20 = ((ViewGroup.MarginLayoutParams) c1698d).topMargin;
            view.layout(i9, i10 + i20, i11, i12 + i20);
        } else {
            int i21 = ((ViewGroup.MarginLayoutParams) c1698d).bottomMargin;
            view.layout(i9, i10 - i21, i11, i12 - i21);
        }
    }

    public void F(View view, C1696b c1696b, boolean z9, int i9, int i10, int i11, int i12) {
        InterfaceC1695a interfaceC1695a = (InterfaceC1695a) view.getLayoutParams();
        int i13 = ((FlexboxLayoutManager) this.f8647a).f14535r;
        C1698d c1698d = (C1698d) interfaceC1695a;
        int i14 = c1698d.f21620g;
        if (i14 != -1) {
            i13 = i14;
        }
        int i15 = c1696b.f21599c;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3 && i13 != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((marginLayoutParams.getMarginStart() + (i15 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                    if (!z9) {
                        view.layout(i9 + marginStart, i10, i11 + marginStart, i12);
                        return;
                    } else {
                        view.layout(i9 - marginStart, i10, i11 - marginStart, i12);
                        return;
                    }
                }
            } else {
                if (!z9) {
                    view.layout(((i9 + i15) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) c1698d).rightMargin, i10, ((i11 + i15) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) c1698d).rightMargin, i12);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i9 - i15) + ((ViewGroup.MarginLayoutParams) c1698d).leftMargin, i10, view.getMeasuredWidth() + (i11 - i15) + ((ViewGroup.MarginLayoutParams) c1698d).leftMargin, i12);
                return;
            }
        }
        if (!z9) {
            int i16 = ((ViewGroup.MarginLayoutParams) c1698d).leftMargin;
            view.layout(i9 + i16, i10, i11 + i16, i12);
        } else {
            int i17 = ((ViewGroup.MarginLayoutParams) c1698d).rightMargin;
            view.layout(i9 - i17, i10, i11 - i17, i12);
        }
    }

    public void G(String method, J j) {
        kotlin.jvm.internal.h.e(method, "method");
        if (method.length() > 0) {
            if (j == null) {
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(A0.a.n("method ", method, " must have a request body.").toString());
                }
            } else if (!Z0.a.u(method)) {
                throw new IllegalArgumentException(A0.a.n("method ", method, " must not have a request body.").toString());
            }
            this.f8648b = method;
            this.f8650d = j;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true");
    }

    public String H() {
        String str;
        synchronized (((ArrayDeque) this.f8650d)) {
            str = (String) ((ArrayDeque) this.f8650d).peek();
        }
        return str;
    }

    public boolean I(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.f8650d)) {
            remove = ((ArrayDeque) this.f8650d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f8651e).execute(new A6.s(15, this));
            }
        }
        return remove;
    }

    @Override // Y3.g
    public int J() {
        return ((long[]) this.f8648b).length;
    }

    public void K(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        ((C1183o) this.f8649c).E(name);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, Y2.h] */
    public void L(V2.a aVar, V2.g gVar) {
        j jVar = (j) this.f8647a;
        String str = (String) this.f8648b;
        V2.e eVar = (V2.e) this.f8650d;
        if (eVar != null) {
            V2.c cVar = (V2.c) this.f8649c;
            s sVar = (s) this.f8651e;
            j b9 = jVar.b(aVar.f7656c);
            ?? obj = new Object();
            obj.f8618h = new HashMap();
            obj.f8616f = Long.valueOf(sVar.f8653a.l());
            obj.f8617g = Long.valueOf(sVar.f8654b.l());
            obj.f8611a = str;
            obj.f8615e = new m(cVar, (byte[]) eVar.apply(aVar.f7655b));
            obj.f8613c = aVar.f7654a;
            V2.b bVar = aVar.f7657d;
            if (bVar != null) {
                obj.f8614d = bVar.f7658a;
            }
            i b10 = obj.b();
            C1119a c1119a = (C1119a) sVar.f8655c;
            c1119a.getClass();
            c1119a.f16829b.execute(new A6.q(c1119a, b9, gVar, b10, 2));
            return;
        }
        throw new NullPointerException("Null transformer");
    }

    public Set M(Class cls) {
        return e(s6.p.a(cls));
    }

    public void N(int i9, int i10, C1696b c1696b, int i11, int i12, boolean z9) {
        float f9;
        int i13;
        int i14 = c1696b.f21597a;
        float f10 = c1696b.f21603g;
        float f11 = 0.0f;
        if (f10 > 0.0f && i11 <= i14) {
            float f12 = (i14 - i11) / f10;
            c1696b.f21597a = i12 + c1696b.f21598b;
            if (!z9) {
                c1696b.f21599c = Integer.MIN_VALUE;
            }
            int i15 = 0;
            boolean z10 = false;
            int i16 = 0;
            float f13 = 0.0f;
            while (i15 < c1696b.f21600d) {
                int i17 = c1696b.f21606k + i15;
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f8647a;
                View Y02 = flexboxLayoutManager.Y0(i17);
                if (Y02 == null || Y02.getVisibility() == 8) {
                    f9 = f11;
                } else {
                    InterfaceC1695a interfaceC1695a = (InterfaceC1695a) Y02.getLayoutParams();
                    int i18 = flexboxLayoutManager.f14533p;
                    f9 = f11;
                    if (i18 != 0 && i18 != 1) {
                        int measuredHeight = Y02.getMeasuredHeight();
                        long[] jArr = (long[]) this.f8651e;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i17] >> 32);
                        }
                        int measuredWidth = Y02.getMeasuredWidth();
                        long[] jArr2 = (long[]) this.f8651e;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i17];
                        }
                        if (!((boolean[]) this.f8648b)[i17]) {
                            C1698d c1698d = (C1698d) interfaceC1695a;
                            float f14 = c1698d.f21619f;
                            if (f14 > f9) {
                                float f15 = measuredHeight - (f12 * f14);
                                if (i15 == c1696b.f21600d - 1) {
                                    f15 += f13;
                                    f13 = f9;
                                }
                                int round = Math.round(f15);
                                int i19 = c1698d.j;
                                if (round < i19) {
                                    ((boolean[]) this.f8648b)[i17] = true;
                                    c1696b.f21603g -= f14;
                                    z10 = true;
                                    round = i19;
                                } else {
                                    float f16 = (f15 - round) + f13;
                                    double d9 = f16;
                                    if (d9 > 1.0d) {
                                        round++;
                                        f16 -= 1.0f;
                                    } else if (d9 < -1.0d) {
                                        round--;
                                        f16 += 1.0f;
                                    }
                                    f13 = f16;
                                }
                                int B9 = B(i9, interfaceC1695a, c1696b.f21605i);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                Y02.measure(B9, makeMeasureSpec);
                                measuredWidth = Y02.getMeasuredWidth();
                                int measuredHeight2 = Y02.getMeasuredHeight();
                                S(i17, B9, makeMeasureSpec, Y02);
                                flexboxLayoutManager.k1(Y02, i17);
                                measuredHeight = measuredHeight2;
                                C1698d c1698d2 = (C1698d) interfaceC1695a;
                                i13 = Math.max(i16, flexboxLayoutManager.X0(Y02) + measuredWidth + ((ViewGroup.MarginLayoutParams) c1698d2).leftMargin + ((ViewGroup.MarginLayoutParams) c1698d2).rightMargin);
                                c1696b.f21597a = measuredHeight + ((ViewGroup.MarginLayoutParams) c1698d2).topMargin + ((ViewGroup.MarginLayoutParams) c1698d2).bottomMargin + c1696b.f21597a;
                            }
                        }
                        C1698d c1698d22 = (C1698d) interfaceC1695a;
                        i13 = Math.max(i16, flexboxLayoutManager.X0(Y02) + measuredWidth + ((ViewGroup.MarginLayoutParams) c1698d22).leftMargin + ((ViewGroup.MarginLayoutParams) c1698d22).rightMargin);
                        c1696b.f21597a = measuredHeight + ((ViewGroup.MarginLayoutParams) c1698d22).topMargin + ((ViewGroup.MarginLayoutParams) c1698d22).bottomMargin + c1696b.f21597a;
                    } else {
                        int measuredWidth2 = Y02.getMeasuredWidth();
                        long[] jArr3 = (long[]) this.f8651e;
                        if (jArr3 != null) {
                            measuredWidth2 = (int) jArr3[i17];
                        }
                        int measuredHeight3 = Y02.getMeasuredHeight();
                        long[] jArr4 = (long[]) this.f8651e;
                        if (jArr4 != null) {
                            measuredHeight3 = (int) (jArr4[i17] >> 32);
                        }
                        if (!((boolean[]) this.f8648b)[i17]) {
                            C1698d c1698d3 = (C1698d) interfaceC1695a;
                            float f17 = c1698d3.f21619f;
                            if (f17 > f9) {
                                float f18 = measuredWidth2 - (f12 * f17);
                                if (i15 == c1696b.f21600d - 1) {
                                    f18 += f13;
                                    f13 = f9;
                                }
                                int round2 = Math.round(f18);
                                int i20 = c1698d3.f21622i;
                                if (round2 < i20) {
                                    ((boolean[]) this.f8648b)[i17] = true;
                                    c1696b.f21603g -= f17;
                                    z10 = true;
                                    round2 = i20;
                                } else {
                                    float f19 = (f18 - round2) + f13;
                                    double d10 = f19;
                                    if (d10 > 1.0d) {
                                        round2++;
                                        f19 -= 1.0f;
                                    } else if (d10 < -1.0d) {
                                        round2--;
                                        f19 += 1.0f;
                                    }
                                    f13 = f19;
                                }
                                int A2 = A(i10, interfaceC1695a, c1696b.f21605i);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                Y02.measure(makeMeasureSpec2, A2);
                                int measuredWidth3 = Y02.getMeasuredWidth();
                                int measuredHeight4 = Y02.getMeasuredHeight();
                                S(i17, makeMeasureSpec2, A2, Y02);
                                flexboxLayoutManager.k1(Y02, i17);
                                measuredWidth2 = measuredWidth3;
                                measuredHeight3 = measuredHeight4;
                                C1698d c1698d4 = (C1698d) interfaceC1695a;
                                int max = Math.max(i16, flexboxLayoutManager.X0(Y02) + measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1698d4).topMargin + ((ViewGroup.MarginLayoutParams) c1698d4).bottomMargin);
                                c1696b.f21597a = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c1698d4).leftMargin + ((ViewGroup.MarginLayoutParams) c1698d4).rightMargin + c1696b.f21597a;
                                i13 = max;
                            }
                        }
                        C1698d c1698d42 = (C1698d) interfaceC1695a;
                        int max2 = Math.max(i16, flexboxLayoutManager.X0(Y02) + measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1698d42).topMargin + ((ViewGroup.MarginLayoutParams) c1698d42).bottomMargin);
                        c1696b.f21597a = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c1698d42).leftMargin + ((ViewGroup.MarginLayoutParams) c1698d42).rightMargin + c1696b.f21597a;
                        i13 = max2;
                    }
                    c1696b.f21599c = Math.max(c1696b.f21599c, i13);
                    i16 = i13;
                }
                i15++;
                f11 = f9;
            }
            if (z10 && i14 != c1696b.f21597a) {
                N(i9, i10, c1696b, i11, i12, true);
            }
        }
    }

    public void O(View view, int i9, int i10) {
        int measuredHeight;
        C1698d c1698d = (C1698d) ((InterfaceC1695a) view.getLayoutParams());
        int i11 = (i9 - ((ViewGroup.MarginLayoutParams) c1698d).leftMargin) - ((ViewGroup.MarginLayoutParams) c1698d).rightMargin;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f8647a;
        int min = Math.min(Math.max(i11 - flexboxLayoutManager.X0(view), c1698d.f21622i), c1698d.f21623k);
        long[] jArr = (long[]) this.f8651e;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i10] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        S(i10, makeMeasureSpec2, makeMeasureSpec, view);
        flexboxLayoutManager.k1(view, i10);
    }

    public void P(View view, int i9, int i10) {
        int measuredWidth;
        C1698d c1698d = (C1698d) ((InterfaceC1695a) view.getLayoutParams());
        int i11 = (i9 - ((ViewGroup.MarginLayoutParams) c1698d).topMargin) - ((ViewGroup.MarginLayoutParams) c1698d).bottomMargin;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f8647a;
        int min = Math.min(Math.max(i11 - flexboxLayoutManager.X0(view), c1698d.j), c1698d.f21624l);
        long[] jArr = (long[]) this.f8651e;
        if (jArr != null) {
            measuredWidth = (int) jArr[i10];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        S(i10, makeMeasureSpec, makeMeasureSpec2, view);
        flexboxLayoutManager.k1(view, i10);
    }

    public void Q(int i9) {
        int i10;
        View Y02;
        int i11;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f8647a;
        if (i9 < flexboxLayoutManager.f14542y.b()) {
            int i12 = flexboxLayoutManager.f14533p;
            if (flexboxLayoutManager.f14535r == 4) {
                int[] iArr = (int[]) this.f8649c;
                if (iArr != null) {
                    i10 = iArr[i9];
                } else {
                    i10 = 0;
                }
                List list = flexboxLayoutManager.f14539v;
                int size = list.size();
                while (i10 < size) {
                    C1696b c1696b = (C1696b) list.get(i10);
                    int i13 = c1696b.f21600d;
                    for (int i14 = 0; i14 < i13; i14++) {
                        int i15 = c1696b.f21606k + i14;
                        if (i14 < flexboxLayoutManager.f14542y.b() && (Y02 = flexboxLayoutManager.Y0(i15)) != null && Y02.getVisibility() != 8 && ((i11 = ((C1698d) ((InterfaceC1695a) Y02.getLayoutParams())).f21620g) == -1 || i11 == 4)) {
                            if (i12 != 0 && i12 != 1) {
                                if (i12 != 2 && i12 != 3) {
                                    throw new IllegalArgumentException(AbstractC0953k1.j(i12, "Invalid flex direction: "));
                                }
                                O(Y02, c1696b.f21599c, i15);
                            } else {
                                P(Y02, c1696b.f21599c, i15);
                            }
                        }
                    }
                    i10++;
                }
                return;
            }
            for (C1696b c1696b2 : flexboxLayoutManager.f14539v) {
                ArrayList arrayList = c1696b2.j;
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    Integer num = (Integer) obj;
                    View Y03 = flexboxLayoutManager.Y0(num.intValue());
                    if (i12 != 0 && i12 != 1) {
                        if (i12 != 2 && i12 != 3) {
                            throw new IllegalArgumentException(AbstractC0953k1.j(i12, "Invalid flex direction: "));
                        }
                        O(Y03, c1696b2.f21599c, num.intValue());
                    } else {
                        P(Y03, c1696b2.f21599c, num.intValue());
                    }
                }
            }
        }
    }

    public void R(Class type, Object obj) {
        kotlin.jvm.internal.h.e(type, "type");
        if (obj == null) {
            ((LinkedHashMap) this.f8651e).remove(type);
            return;
        }
        if (((LinkedHashMap) this.f8651e).isEmpty()) {
            this.f8651e = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8651e;
        Object cast = type.cast(obj);
        kotlin.jvm.internal.h.b(cast);
        linkedHashMap.put(type, cast);
    }

    public void S(int i9, int i10, int i11, View view) {
        long[] jArr = (long[]) this.f8650d;
        if (jArr != null) {
            jArr[i9] = (i10 & 4294967295L) | (i11 << 32);
        }
        long[] jArr2 = (long[]) this.f8651e;
        if (jArr2 != null) {
            jArr2[i9] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }

    public void T(String url) {
        kotlin.jvm.internal.h.e(url, "url");
        if (W7.l.L(url, "ws:", true)) {
            String substring = url.substring(3);
            kotlin.jvm.internal.h.d(substring, "this as java.lang.String).substring(startIndex)");
            url = "http:".concat(substring);
        } else if (W7.l.L(url, "wss:", true)) {
            String substring2 = url.substring(4);
            kotlin.jvm.internal.h.d(substring2, "this as java.lang.String).substring(startIndex)");
            url = "https:".concat(substring2);
        }
        kotlin.jvm.internal.h.e(url, "<this>");
        x xVar = new x();
        xVar.e(null, url);
        this.f8647a = xVar.b();
    }

    public void U(Uri uri) {
        int i9;
        if (uri == null) {
            V();
            return;
        }
        if (!uri.equals((Uri) this.f8649c)) {
            V();
            this.f8649c = uri;
            v4.b bVar = (v4.b) this.f8648b;
            int i10 = bVar.f23788b;
            Context context = (Context) this.f8647a;
            if (i10 != 0 && (i9 = bVar.f23789c) != 0) {
                this.f8650d = new AsyncTaskC2140b(context, i10, i9, this);
            } else {
                this.f8650d = new AsyncTaskC2140b(context, 0, 0, this);
            }
            AsyncTaskC2140b asyncTaskC2140b = (AsyncTaskC2140b) this.f8650d;
            y.h(asyncTaskC2140b);
            Uri uri2 = (Uri) this.f8649c;
            y.h(uri2);
            asyncTaskC2140b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void V() {
        AsyncTaskC2140b asyncTaskC2140b = (AsyncTaskC2140b) this.f8650d;
        if (asyncTaskC2140b != null) {
            asyncTaskC2140b.cancel(true);
            this.f8650d = null;
        }
        this.f8649c = null;
    }

    public i3 X() {
        if (((i3) this.f8650d) == null) {
            i3 i3Var = new i3((Y) this.f8647a, (String) this.f8648b);
            this.f8650d = i3Var;
            i3Var.b(1);
        }
        return (i3) this.f8650d;
    }

    public void Y() {
        int i9;
        long j;
        N0 n02;
        char c3;
        int i10 = 1;
        i3 i3Var = (i3) this.f8650d;
        if (i3Var != null) {
            C2079d c2079d = i3Var.j;
            if (c2079d != null) {
                c2079d.f23684l = null;
                i3Var.j = null;
            }
            N0 m9 = O0.m();
            m9.e();
            O0.z((O0) m9.f14748b, i3Var.f14879i);
            String str = i3Var.f14881l;
            if (str != null) {
                m9.e();
                O0.w((O0) m9.f14748b, str);
            }
            S1 l9 = T1.l();
            if (!TextUtils.isEmpty(i3Var.f14883n)) {
                String str2 = i3Var.f14883n;
                m9.e();
                O0.s((O0) m9.f14748b, str2);
                String str3 = i3Var.f14883n;
                l9.e();
                T1.o((T1) l9.f14748b, str3);
            }
            if (!TextUtils.isEmpty(i3Var.f14884o)) {
                String str4 = i3Var.f14884o;
                l9.e();
                T1.p((T1) l9.f14748b, str4);
            }
            if (!TextUtils.isEmpty(i3Var.f14885p)) {
                String str5 = i3Var.f14885p;
                l9.e();
                T1.q((T1) l9.f14748b, str5);
            }
            if (!TextUtils.isEmpty(i3Var.f14886q)) {
                String str6 = i3Var.f14886q;
                l9.e();
                T1.m((T1) l9.f14748b, str6);
            }
            if (!TextUtils.isEmpty(i3Var.f14887r)) {
                String str7 = i3Var.f14887r;
                l9.e();
                T1.n((T1) l9.f14748b, str7);
            }
            if (!TextUtils.isEmpty(i3Var.f14888s)) {
                String str8 = i3Var.f14888s;
                l9.e();
                T1.r((T1) l9.f14748b, str8);
            }
            int i11 = i3Var.f14889t;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                i9 = 1;
                            } else {
                                i9 = 6;
                            }
                        } else {
                            i9 = 5;
                        }
                    } else {
                        i9 = 4;
                    }
                } else {
                    i9 = 3;
                }
            } else {
                i9 = 2;
            }
            l9.e();
            T1.s((T1) l9.f14748b, i9);
            T1 t12 = (T1) l9.b();
            m9.e();
            O0.v((O0) m9.f14748b, t12);
            E0 l10 = F0.l();
            String str9 = i3.f14869w;
            l10.e();
            F0.n((F0) l10.f14748b, str9);
            l10.e();
            F0.m((F0) l10.f14748b, i3Var.f14877g);
            F0 f02 = (F0) l10.b();
            m9.e();
            O0.o((O0) m9.f14748b, f02);
            V0 l11 = W0.l();
            String str10 = (String) i3Var.f14871a.a();
            if (str10 != null) {
                C0824g1 l12 = C0828h1.l();
                l12.e();
                C0828h1.m((C0828h1) l12.f14748b, str10);
                C0828h1 c0828h1 = (C0828h1) l12.b();
                l11.e();
                W0.r((W0) l11.f14748b, c0828h1);
            }
            String str11 = i3Var.f14880k;
            if (str11 != null) {
                try {
                    String replace = str11.replace("-", "");
                    j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e8) {
                    Object[] objArr = {str11};
                    y4.b bVar = i3.f14868v;
                    Log.w(bVar.f24917a, bVar.d("receiverSessionId %s is not valid for hash", objArr), e8);
                    j = 0;
                }
                l11.e();
                W0.t((W0) l11.f14748b, j);
            }
            List<D> list = i3Var.f14872b;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (D d9 : list) {
                    d9.getClass();
                    T0 l13 = U0.l();
                    l13.e();
                    U0.q((U0) l13.f14748b, d9.f14702e);
                    N0 n03 = m9;
                    int i12 = (int) (d9.f14699b - d9.f14701d);
                    l13.e();
                    U0.o((U0) l13.f14748b, i12);
                    l13.e();
                    U0.p((U0) l13.f14748b, i12);
                    Integer num = d9.f14698a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.e();
                        U0.n((U0) l13.f14748b, intValue);
                    }
                    Boolean bool = d9.f14700c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.e();
                        U0.m((U0) l13.f14748b, booleanValue);
                    }
                    arrayList.add((U0) l13.b());
                    m9 = n03;
                }
                n02 = m9;
                l11.e();
                W0.m((W0) l11.f14748b, arrayList);
            } else {
                n02 = m9;
            }
            List list2 = i3Var.f14873c;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                if (!it.hasNext()) {
                    l11.e();
                    W0.p((W0) l11.f14748b, arrayList2);
                } else {
                    throw A0.a.h(it);
                }
            }
            List<B> list3 = i3Var.f14874d;
            if (!list3.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (B b9 : list3) {
                    b9.getClass();
                    P0 l14 = Q0.l();
                    String str12 = b9.f14686a;
                    int i13 = 11;
                    switch (str12.hashCode()) {
                        case -1189611734:
                            if (str12.equals("queueInsert")) {
                                c3 = 11;
                                break;
                            }
                            break;
                        case -1109843021:
                            if (str12.equals("launch")) {
                                c3 = 20;
                                break;
                            }
                            break;
                        case -940430091:
                            if (str12.equals("queueRemove")) {
                                c3 = '\r';
                                break;
                            }
                            break;
                        case -936597225:
                            if (str12.equals("queueFetchItems")) {
                                c3 = 17;
                                break;
                            }
                            break;
                        case -930425472:
                            if (str12.equals("setPlaybackDevices")) {
                                c3 = 21;
                                break;
                            }
                            break;
                        case -921113364:
                            if (str12.equals("volume-mute")) {
                                c3 = 7;
                                break;
                            }
                            break;
                        case -900560382:
                            if (str12.equals("skipAd")) {
                                c3 = 19;
                                break;
                            }
                            break;
                        case -892481550:
                            if (str12.equals("status")) {
                                c3 = '\b';
                                break;
                            }
                            break;
                        case -844665542:
                            if (str12.equals("queueUpdate")) {
                                c3 = '\f';
                                break;
                            }
                            break;
                        case -810883302:
                            if (str12.equals("volume")) {
                                c3 = 5;
                                break;
                            }
                            break;
                        case -402284771:
                            if (str12.equals("setPlaybackRate")) {
                                c3 = 18;
                                break;
                            }
                            break;
                        case 3327206:
                            if (str12.equals("load")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 3363353:
                            if (str12.equals("mute")) {
                                c3 = 6;
                                break;
                            }
                            break;
                        case 3443508:
                            if (str12.equals("play")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 3526264:
                            if (str12.equals("seek")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 3540994:
                            if (str12.equals("stop")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str12.equals("pause")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 525402049:
                            if (str12.equals("queueFetchItemRange")) {
                                c3 = 16;
                                break;
                            }
                            break;
                        case 913357482:
                            if (str12.equals("queueReorder")) {
                                c3 = 14;
                                break;
                            }
                            break;
                        case 1148867366:
                            if (str12.equals("trackStyle")) {
                                c3 = '\n';
                                break;
                            }
                            break;
                        case 1451542318:
                            if (str12.equals("activeTracks")) {
                                c3 = '\t';
                                break;
                            }
                            break;
                        case 1873161788:
                            if (str12.equals("queueFetchItemIds")) {
                                c3 = 15;
                                break;
                            }
                            break;
                    }
                    c3 = 65535;
                    switch (c3) {
                        case 0:
                            i13 = 2;
                            break;
                        case 1:
                            i13 = 3;
                            break;
                        case 2:
                            i13 = 4;
                            break;
                        case 3:
                            i13 = 5;
                            break;
                        case 4:
                            i13 = 6;
                            break;
                        case 5:
                            i13 = 7;
                            break;
                        case 6:
                            i13 = 8;
                            break;
                        case 7:
                            i13 = 9;
                            break;
                        case '\b':
                            i13 = 10;
                            break;
                        case '\t':
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            i13 = 12;
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            i13 = 13;
                            break;
                        case '\f':
                            i13 = 14;
                            break;
                        case '\r':
                            i13 = 15;
                            break;
                        case 14:
                            i13 = 16;
                            break;
                        case 15:
                            i13 = 17;
                            break;
                        case 16:
                            i13 = 18;
                            break;
                        case 17:
                            i13 = 19;
                            break;
                        case 18:
                            i13 = 20;
                            break;
                        case 19:
                            i13 = 21;
                            break;
                        case 20:
                            i13 = 22;
                            break;
                        case 21:
                            i13 = 23;
                            break;
                        default:
                            i13 = 1;
                            break;
                    }
                    l14.e();
                    Q0.q((Q0) l14.f14748b, i13);
                    int i14 = (int) b9.f14687b;
                    l14.e();
                    Q0.n((Q0) l14.f14748b, i14);
                    l14.e();
                    Q0.p((Q0) l14.f14748b, b9.f14688c);
                    int i15 = (int) (b9.f14689d - b9.f14691f);
                    l14.e();
                    Q0.o((Q0) l14.f14748b, i15);
                    int i16 = (int) (b9.f14690e - b9.f14691f);
                    l14.e();
                    Q0.m((Q0) l14.f14748b, i16);
                    arrayList3.add((Q0) l14.b());
                }
                l11.e();
                W0.n((W0) l11.f14748b, arrayList3);
            }
            if (i3Var.f14882m != null) {
                ArrayList arrayList4 = new ArrayList();
                C0816e1 c0816e1 = i3Var.f14882m;
                c0816e1.getClass();
                R0 l15 = S0.l();
                int i17 = c0816e1.f14831c;
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 == 4) {
                                i10 = 5;
                            }
                        } else {
                            i10 = 4;
                        }
                    } else {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
                l15.e();
                S0.n((S0) l15.f14748b, i10);
                int i18 = (int) (c0816e1.f14829a - c0816e1.f14830b);
                l15.e();
                S0.m((S0) l15.f14748b, i18);
                arrayList4.add((S0) l15.b());
                l11.e();
                W0.o((W0) l11.f14748b, arrayList4);
            }
            Map map = i3Var.f14875e;
            if (!map.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (C0818f c0818f : map.values()) {
                    c0818f.getClass();
                    X0 l16 = Y0.l();
                    l16.e();
                    Y0.p((Y0) l16.f14748b, c0818f.f14840e);
                    int i19 = c0818f.f14839d.get();
                    l16.e();
                    Y0.m((Y0) l16.f14748b, i19);
                    int i20 = (int) (c0818f.f14836a - c0818f.f14838c);
                    l16.e();
                    Y0.n((Y0) l16.f14748b, i20);
                    int i21 = (int) (c0818f.f14837b - c0818f.f14838c);
                    l16.e();
                    Y0.o((Y0) l16.f14748b, i21);
                    arrayList5.add((Y0) l16.b());
                }
                l11.e();
                W0.q((W0) l11.f14748b, arrayList5);
            }
            int i22 = i3Var.f14890u;
            l11.e();
            W0.s((W0) l11.f14748b, i22);
            W0 w02 = (W0) l11.b();
            n02.e();
            O0.y((O0) n02.f14748b, w02);
            i3Var.f14876f.a((O0) n02.b(), 233);
            this.f8650d = null;
        }
    }

    @Override // Y3.g
    public int a(long j) {
        long[] jArr = (long[]) this.f8648b;
        int b9 = l4.y.b(jArr, j, false);
        if (b9 < jArr.length) {
            return b9;
        }
        return -1;
    }

    @Override // s6.c
    public Object b(Class cls) {
        if (((Set) this.f8647a).contains(s6.p.a(cls))) {
            Object b9 = ((s6.c) this.f8651e).b(cls);
            if (!cls.equals(P6.b.class)) {
                return b9;
            }
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // i8.InterfaceC1420j
    public void c(n8.g call, L l9) {
        kotlin.jvm.internal.h.e(call, "call");
        ArrayList arrayList = (ArrayList) this.f8651e;
        ArrayList arrayList2 = (ArrayList) this.f8647a;
        ((j8.b) this.f8650d).getClass();
        j8.b.b(l9, (String) this.f8648b, arrayList, arrayList2);
        ((CountDownLatch) this.f8649c).countDown();
    }

    @Override // s6.c
    public Object d(s6.p pVar) {
        if (((Set) this.f8647a).contains(pVar)) {
            return ((s6.c) this.f8651e).d(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + pVar + ".");
    }

    @Override // s6.c
    public Set e(s6.p pVar) {
        if (((Set) this.f8650d).contains(pVar)) {
            return ((s6.c) this.f8651e).e(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + pVar + ">.");
    }

    @Override // i8.InterfaceC1420j
    public void f(n8.g call, IOException iOException) {
        kotlin.jvm.internal.h.e(call, "call");
        ArrayList arrayList = (ArrayList) this.f8647a;
        synchronized (arrayList) {
            arrayList.add(iOException);
        }
        ((CountDownLatch) this.f8649c).countDown();
    }

    @Override // s6.c
    public s6.n g(s6.p pVar) {
        if (((Set) this.f8649c).contains(pVar)) {
            return ((s6.c) this.f8651e).g(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + pVar + ">.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.i, O7.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.i, O7.a] */
    @Override // A7.e
    public Object getValue() {
        e0 e0Var = (e0) this.f8651e;
        if (e0Var == null) {
            e0 J8 = new android.support.v4.media.session.y((j0) ((kotlin.jvm.internal.i) this.f8648b).invoke(), (h0) ((O7.a) this.f8649c).invoke(), (AbstractC1579b) ((kotlin.jvm.internal.i) this.f8650d).invoke()).J(AbstractC1570b.f((kotlin.jvm.internal.d) this.f8647a));
            this.f8651e = J8;
            return J8;
        }
        return e0Var;
    }

    @Override // s6.c
    public S6.b h(Class cls) {
        return i(s6.p.a(cls));
    }

    @Override // s6.c
    public S6.b i(s6.p pVar) {
        if (((Set) this.f8648b).contains(pVar)) {
            return ((s6.c) this.f8651e).i(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + pVar + ">.");
    }

    public void j(w1.f fVar, Class cls) {
        ((ArrayList) this.f8650d).add(new A7.h(fVar, cls));
    }

    public void k(C2234a c2234a, Class cls) {
        ((ArrayList) this.f8648b).add(new A7.h(c2234a, cls));
    }

    public boolean l(String str) {
        boolean add;
        if (!TextUtils.isEmpty(str) && !str.contains((String) this.f8649c)) {
            synchronized (((ArrayDeque) this.f8650d)) {
                add = ((ArrayDeque) this.f8650d).add(str);
                if (add) {
                    ((ScheduledThreadPoolExecutor) this.f8651e).execute(new A6.s(15, this));
                }
            }
            return add;
        }
        return false;
    }

    @Override // Y3.g
    public long m(int i9) {
        return ((long[]) this.f8648b)[i9];
    }

    public void n(String name, String value) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        ((C1183o) this.f8649c).v(name, value);
    }

    public G o() {
        Map unmodifiableMap;
        i8.y yVar = (i8.y) this.f8647a;
        if (yVar != null) {
            String str = (String) this.f8648b;
            w z9 = ((C1183o) this.f8649c).z();
            J j = (J) this.f8650d;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8651e;
            byte[] bArr = k8.c.f20141a;
            kotlin.jvm.internal.h.e(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                unmodifiableMap = u.f1136a;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                kotlin.jvm.internal.h.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new G(yVar, str, z9, j, unmodifiableMap);
        }
        throw new IllegalStateException("url == null");
    }

    public void p(C1418h cacheControl) {
        kotlin.jvm.internal.h.e(cacheControl, "cacheControl");
        String c1418h = cacheControl.toString();
        if (c1418h.length() == 0) {
            K("Cache-Control");
        } else {
            D("Cache-Control", c1418h);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0272, code lost:
    
        if (r6 < (r1 + r5)) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0365  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(Z3.j r25, int r26, int r27, int r28, int r29, int r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.r.q(Z3.j, int, int, int, int, int, java.util.List):void");
    }

    public void r(View view, int i9) {
        boolean z9;
        InterfaceC1695a interfaceC1695a = (InterfaceC1695a) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        C1698d c1698d = (C1698d) interfaceC1695a;
        int i10 = c1698d.f21622i;
        boolean z10 = true;
        if (measuredWidth < i10 || measuredWidth > (i10 = c1698d.f21623k)) {
            measuredWidth = i10;
            z9 = true;
        } else {
            z9 = false;
        }
        int i11 = c1698d.j;
        if (measuredHeight < i11) {
            measuredHeight = i11;
        } else {
            int i12 = c1698d.f21624l;
            if (measuredHeight > i12) {
                measuredHeight = i12;
            } else {
                z10 = z9;
            }
        }
        if (z10) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            S(i9, makeMeasureSpec, makeMeasureSpec2, view);
            ((FlexboxLayoutManager) this.f8647a).k1(view, i9);
        }
    }

    public void s(List list, int i9) {
        int i10 = ((int[]) this.f8649c)[i9];
        if (i10 == -1) {
            i10 = 0;
        }
        if (list.size() > i10) {
            list.subList(i10, list.size()).clear();
        }
        int[] iArr = (int[]) this.f8649c;
        int length = iArr.length - 1;
        if (i9 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i9, length, -1);
        }
        long[] jArr = (long[]) this.f8650d;
        int length2 = jArr.length - 1;
        if (i9 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i9, length2, 0L);
        }
    }

    public void u(int i9, int i10, int i11) {
        int size;
        int I4;
        int J8;
        int i12;
        int i13;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f8647a;
        int b9 = flexboxLayoutManager.f14542y.b();
        boolean[] zArr = (boolean[]) this.f8648b;
        int i14 = 0;
        if (zArr == null) {
            this.f8648b = new boolean[Math.max(b9, 10)];
        } else if (zArr.length < b9) {
            this.f8648b = new boolean[Math.max(zArr.length * 2, b9)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i11 < flexboxLayoutManager.f14542y.b()) {
            int i15 = flexboxLayoutManager.f14533p;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2 && i15 != 3) {
                    throw new IllegalArgumentException(AbstractC0953k1.j(i15, "Invalid flex direction: "));
                }
                int mode = View.MeasureSpec.getMode(i10);
                size = View.MeasureSpec.getSize(i10);
                if (mode != 1073741824) {
                    size = flexboxLayoutManager.Z0();
                }
                I4 = flexboxLayoutManager.K();
                J8 = flexboxLayoutManager.H();
            } else {
                int mode2 = View.MeasureSpec.getMode(i9);
                size = View.MeasureSpec.getSize(i9);
                int Z02 = flexboxLayoutManager.Z0();
                if (mode2 != 1073741824) {
                    size = Math.min(Z02, size);
                }
                I4 = flexboxLayoutManager.I();
                J8 = flexboxLayoutManager.J();
            }
            int i16 = J8 + I4;
            int i17 = size;
            int[] iArr = (int[]) this.f8649c;
            if (iArr != null) {
                i14 = iArr[i11];
            }
            List list = flexboxLayoutManager.f14539v;
            int size2 = list.size();
            while (i14 < size2) {
                C1696b c1696b = (C1696b) list.get(i14);
                int i18 = c1696b.f21597a;
                if (i18 < i17 && c1696b.f21608m) {
                    i12 = i9;
                    i13 = i10;
                    z(i12, i13, c1696b, i17, i16, false);
                } else {
                    i12 = i9;
                    i13 = i10;
                    if (i18 > i17 && c1696b.f21609n) {
                        N(i12, i13, c1696b, i17, i16, false);
                    }
                }
                i14++;
                i9 = i12;
                i10 = i13;
            }
        }
    }

    public void v(int i9) {
        int[] iArr = (int[]) this.f8649c;
        if (iArr == null) {
            this.f8649c = new int[Math.max(i9, 10)];
        } else if (iArr.length < i9) {
            this.f8649c = Arrays.copyOf((int[]) this.f8649c, Math.max(iArr.length * 2, i9));
        }
    }

    @Override // Y3.g
    public List w(long j) {
        C1166d c1166d = (C1166d) this.f8647a;
        ArrayList arrayList = new ArrayList();
        c1166d.g(j, c1166d.f17381h, arrayList);
        TreeMap treeMap = new TreeMap();
        c1166d.i(j, false, c1166d.f17381h, treeMap);
        HashMap hashMap = (HashMap) this.f8650d;
        c1166d.h(j, (Map) this.f8649c, hashMap, c1166d.f17381h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Pair pair = (Pair) obj;
            String str = (String) ((HashMap) this.f8651e).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C1167e c1167e = (C1167e) hashMap.get(pair.first);
                c1167e.getClass();
                arrayList2.add(new Y3.b(null, null, null, decodeByteArray, c1167e.f17388c, 0, c1167e.f17390e, c1167e.f17387b, 0, Integer.MIN_VALUE, -3.4028235E38f, c1167e.f17391f, c1167e.f17392g, false, -16777216, c1167e.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C1167e c1167e2 = (C1167e) hashMap.get(entry.getKey());
            c1167e2.getClass();
            Y3.a aVar = (Y3.a) entry.getValue();
            CharSequence charSequence = aVar.f8661a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C1163a c1163a : (C1163a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1163a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1163a), spannableStringBuilder.getSpanEnd(c1163a), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.f8665e = c1167e2.f17388c;
            aVar.f8666f = c1167e2.f17389d;
            aVar.f8667g = c1167e2.f17390e;
            aVar.f8668h = c1167e2.f17387b;
            aVar.f8671l = c1167e2.f17391f;
            aVar.f8670k = c1167e2.f17394i;
            aVar.j = c1167e2.f17393h;
            aVar.f8675p = c1167e2.j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public void x(int i9) {
        long[] jArr = (long[]) this.f8650d;
        if (jArr == null) {
            this.f8650d = new long[Math.max(i9, 10)];
        } else if (jArr.length < i9) {
            this.f8650d = Arrays.copyOf((long[]) this.f8650d, Math.max(jArr.length * 2, i9));
        }
    }

    public void y(int i9) {
        long[] jArr = (long[]) this.f8651e;
        if (jArr == null) {
            this.f8651e = new long[Math.max(i9, 10)];
        } else if (jArr.length < i9) {
            this.f8651e = Arrays.copyOf((long[]) this.f8651e, Math.max(jArr.length * 2, i9));
        }
    }

    public void z(int i9, int i10, C1696b c1696b, int i11, int i12, boolean z9) {
        int i13;
        int i14;
        float f9;
        float f10;
        int i15;
        double d9;
        boolean z10;
        int i16;
        int i17;
        double d10;
        float f11 = c1696b.f21602f;
        float f12 = 0.0f;
        if (f11 > 0.0f && i11 >= (i13 = c1696b.f21597a)) {
            float f13 = (i11 - i13) / f11;
            c1696b.f21597a = i12 + c1696b.f21598b;
            if (!z9) {
                c1696b.f21599c = Integer.MIN_VALUE;
            }
            int i18 = 0;
            boolean z11 = false;
            int i19 = 0;
            float f14 = 0.0f;
            while (i18 < c1696b.f21600d) {
                int i20 = c1696b.f21606k + i18;
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f8647a;
                View Y02 = flexboxLayoutManager.Y0(i20);
                if (Y02 == null || Y02.getVisibility() == 8) {
                    i14 = i18;
                    f9 = f12;
                    f10 = f13;
                    z11 = z11;
                } else {
                    InterfaceC1695a interfaceC1695a = (InterfaceC1695a) Y02.getLayoutParams();
                    int i21 = flexboxLayoutManager.f14533p;
                    f9 = f12;
                    if (i21 == 0 || i21 == 1) {
                        f10 = f13;
                        boolean z12 = z11;
                        int measuredWidth = Y02.getMeasuredWidth();
                        long[] jArr = (long[]) this.f8651e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i20];
                        }
                        int measuredHeight = Y02.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.f8651e;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i20] >> 32);
                        }
                        if (!((boolean[]) this.f8648b)[i20]) {
                            C1698d c1698d = (C1698d) interfaceC1695a;
                            float f15 = c1698d.f21618e;
                            if (f15 > f9) {
                                float f16 = (f10 * f15) + measuredWidth;
                                if (i18 == c1696b.f21600d - 1) {
                                    f16 += f14;
                                    f14 = f9;
                                }
                                int round = Math.round(f16);
                                int i22 = c1698d.f21623k;
                                if (round > i22) {
                                    ((boolean[]) this.f8648b)[i20] = true;
                                    c1696b.f21602f -= f15;
                                    z10 = true;
                                    round = i22;
                                } else {
                                    float f17 = (f16 - round) + f14;
                                    double d11 = f17;
                                    if (d11 > 1.0d) {
                                        round++;
                                        d9 = d11 - 1.0d;
                                    } else {
                                        if (d11 < -1.0d) {
                                            round--;
                                            d9 = d11 + 1.0d;
                                        }
                                        f14 = f17;
                                        z10 = z12;
                                    }
                                    f17 = (float) d9;
                                    f14 = f17;
                                    z10 = z12;
                                }
                                int A2 = A(i10, interfaceC1695a, c1696b.f21605i);
                                i14 = i18;
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                Y02.measure(makeMeasureSpec, A2);
                                measuredWidth = Y02.getMeasuredWidth();
                                int measuredHeight2 = Y02.getMeasuredHeight();
                                S(i20, makeMeasureSpec, A2, Y02);
                                flexboxLayoutManager.k1(Y02, i20);
                                z12 = z10;
                                measuredHeight = measuredHeight2;
                                C1698d c1698d2 = (C1698d) interfaceC1695a;
                                int max = Math.max(i19, flexboxLayoutManager.X0(Y02) + measuredHeight + ((ViewGroup.MarginLayoutParams) c1698d2).topMargin + ((ViewGroup.MarginLayoutParams) c1698d2).bottomMargin);
                                c1696b.f21597a = measuredWidth + ((ViewGroup.MarginLayoutParams) c1698d2).leftMargin + ((ViewGroup.MarginLayoutParams) c1698d2).rightMargin + c1696b.f21597a;
                                i15 = max;
                                z11 = z12;
                            }
                        }
                        i14 = i18;
                        C1698d c1698d22 = (C1698d) interfaceC1695a;
                        int max2 = Math.max(i19, flexboxLayoutManager.X0(Y02) + measuredHeight + ((ViewGroup.MarginLayoutParams) c1698d22).topMargin + ((ViewGroup.MarginLayoutParams) c1698d22).bottomMargin);
                        c1696b.f21597a = measuredWidth + ((ViewGroup.MarginLayoutParams) c1698d22).leftMargin + ((ViewGroup.MarginLayoutParams) c1698d22).rightMargin + c1696b.f21597a;
                        i15 = max2;
                        z11 = z12;
                    } else {
                        int measuredHeight3 = Y02.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.f8651e;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i20] >> 32);
                        }
                        int measuredWidth2 = Y02.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.f8651e;
                        f10 = f13;
                        boolean z13 = z11;
                        if (jArr4 != null) {
                            measuredWidth2 = (int) jArr4[i20];
                        }
                        if (!((boolean[]) this.f8648b)[i20]) {
                            C1698d c1698d3 = (C1698d) interfaceC1695a;
                            float f18 = c1698d3.f21618e;
                            if (f18 > f9) {
                                float f19 = (f10 * f18) + measuredHeight3;
                                if (i18 == c1696b.f21600d - 1) {
                                    f19 += f14;
                                    f14 = f9;
                                }
                                int round2 = Math.round(f19);
                                int i23 = c1698d3.f21624l;
                                if (round2 > i23) {
                                    ((boolean[]) this.f8648b)[i20] = true;
                                    c1696b.f21602f -= f18;
                                    z13 = true;
                                    i16 = i23;
                                } else {
                                    float f20 = (f19 - round2) + f14;
                                    double d12 = f20;
                                    if (d12 > 1.0d) {
                                        i17 = round2 + 1;
                                        d10 = d12 - 1.0d;
                                    } else if (d12 < -1.0d) {
                                        i17 = round2 - 1;
                                        d10 = d12 + 1.0d;
                                    } else {
                                        i16 = round2;
                                        f14 = f20;
                                    }
                                    i16 = i17;
                                    f14 = (float) d10;
                                }
                                int B9 = B(i9, interfaceC1695a, c1696b.f21605i);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                Y02.measure(B9, makeMeasureSpec2);
                                measuredWidth2 = Y02.getMeasuredWidth();
                                measuredHeight3 = Y02.getMeasuredHeight();
                                S(i20, B9, makeMeasureSpec2, Y02);
                                flexboxLayoutManager.k1(Y02, i20);
                                z11 = z13;
                                C1698d c1698d4 = (C1698d) interfaceC1695a;
                                i15 = Math.max(i19, flexboxLayoutManager.X0(Y02) + measuredWidth2 + ((ViewGroup.MarginLayoutParams) c1698d4).leftMargin + ((ViewGroup.MarginLayoutParams) c1698d4).rightMargin);
                                c1696b.f21597a = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1698d4).topMargin + ((ViewGroup.MarginLayoutParams) c1698d4).bottomMargin + c1696b.f21597a;
                                i14 = i18;
                            }
                        }
                        z11 = z13;
                        C1698d c1698d42 = (C1698d) interfaceC1695a;
                        i15 = Math.max(i19, flexboxLayoutManager.X0(Y02) + measuredWidth2 + ((ViewGroup.MarginLayoutParams) c1698d42).leftMargin + ((ViewGroup.MarginLayoutParams) c1698d42).rightMargin);
                        c1696b.f21597a = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1698d42).topMargin + ((ViewGroup.MarginLayoutParams) c1698d42).bottomMargin + c1696b.f21597a;
                        i14 = i18;
                    }
                    c1696b.f21599c = Math.max(c1696b.f21599c, i15);
                    i19 = i15;
                }
                i18 = i14 + 1;
                f12 = f9;
                f13 = f10;
            }
            if (z11 && i13 != c1696b.f21597a) {
                z(i9, i10, c1696b, i11, i12, true);
            }
        }
    }

    public r(Context context, v4.b bVar) {
        this.f8647a = context;
        this.f8648b = bVar;
        V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(kotlin.jvm.internal.d dVar, O7.a aVar, O7.a aVar2, O7.a aVar3) {
        this.f8647a = dVar;
        this.f8648b = (kotlin.jvm.internal.i) aVar;
        this.f8649c = aVar2;
        this.f8650d = (kotlin.jvm.internal.i) aVar3;
    }

    public r(C1166d c1166d, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f8647a = c1166d;
        this.f8650d = hashMap2;
        this.f8651e = hashMap3;
        this.f8649c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i9 = 0;
        c1166d.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i9] = ((Long) it.next()).longValue();
            i9++;
        }
        this.f8648b = jArr;
    }

    public r(FlexboxLayoutManager flexboxLayoutManager) {
        this.f8647a = flexboxLayoutManager;
    }

    public r(int i9) {
        switch (i9) {
            case 6:
                this.f8649c = X.f5938g;
                P5.D d9 = F.f5901b;
                this.f8650d = S.f5926e;
                return;
            default:
                this.f8651e = new LinkedHashMap();
                this.f8648b = "GET";
                this.f8649c = new C1183o(5);
                return;
        }
    }
}
