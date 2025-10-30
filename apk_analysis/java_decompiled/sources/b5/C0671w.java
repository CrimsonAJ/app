package b5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import co.notix.R;
import com.google.android.gms.internal.measurement.C0930f3;
import com.google.android.gms.internal.measurement.C1004u3;
import com.google.android.gms.internal.measurement.H3;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.Q2;
import com.google.android.gms.internal.measurement.U2;
import com.google.android.gms.internal.measurement.W2;
import g5.AbstractC1254a;
import java.util.List;

/* renamed from: b5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0671w implements C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11338a;

    public /* synthetic */ C0671w(int i9) {
        this.f11338a = i9;
    }

    public static C0671w b(Context context, int i9) {
        boolean z9;
        if (i9 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        s8.e.d("Cannot create a CalendarItemStyle with a styleResId of 0", z9);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i9, AbstractC1254a.f17758x);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        com.google.android.gms.internal.measurement.D1.p(context, obtainStyledAttributes, 4);
        com.google.android.gms.internal.measurement.D1.p(context, obtainStyledAttributes, 9);
        com.google.android.gms.internal.measurement.D1.p(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        F5.m.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new F5.a(0)).a();
        obtainStyledAttributes.recycle();
        C0671w c0671w = new C0671w(29);
        s8.e.e(rect.left);
        s8.e.e(rect.top);
        s8.e.e(rect.right);
        s8.e.e(rect.bottom);
        return c0671w;
    }

    @Override // b5.C
    public Object a() {
        switch (this.f11338a) {
            case 0:
                Boolean bool = (Boolean) C1004u3.f15617a.b();
                bool.getClass();
                return bool;
            case 1:
                Boolean bool2 = (Boolean) Q2.f15289b.b();
                bool2.getClass();
                return bool2;
            case 2:
                List list = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15372l0.b()).longValue());
            case 3:
                List list2 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15376n0.b()).longValue());
            case 4:
                List list3 = E.f10635a;
                U2.f15316b.get();
                return (String) W2.f15371l.b();
            case 5:
                List list4 = E.f10635a;
                U2.f15316b.get();
                Long l9 = (Long) W2.f15352b.b();
                l9.getClass();
                return l9;
            case 6:
                List list5 = E.f10635a;
                U2.f15316b.get();
                Long l10 = (Long) W2.f15332G.b();
                l10.getClass();
                return l10;
            case 7:
                List list6 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15333H.b()).longValue());
            case 8:
                List list7 = E.f10635a;
                U2.f15316b.get();
                Long l11 = (Long) W2.f15340P.b();
                l11.getClass();
                return l11;
            case 9:
                List list8 = E.f10635a;
                U2.f15316b.get();
                Long l12 = (Long) W2.f15392y.b();
                l12.getClass();
                return l12;
            case R.styleable.GradientColor_android_endX /* 10 */:
                List list9 = E.f10635a;
                K3.f15248b.get();
                Boolean bool3 = (Boolean) M3.f15272e.b();
                bool3.getClass();
                return bool3;
            case R.styleable.GradientColor_android_endY /* 11 */:
                List list10 = E.f10635a;
                U2.f15316b.get();
                Long l13 = (Long) W2.f15364h.b();
                l13.getClass();
                return l13;
            case 12:
                List list11 = E.f10635a;
                U2.f15316b.get();
                Long l14 = (Long) W2.f15343S.b();
                l14.getClass();
                return l14;
            case 13:
                List list12 = E.f10635a;
                U2.f15316b.get();
                Long l15 = (Long) W2.f15358e.b();
                l15.getClass();
                return l15;
            case 14:
                List list13 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15380p0.b()).longValue());
            case 15:
                List list14 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15373m.b()).longValue());
            case 16:
                List list15 = E.f10635a;
                U2.f15316b.get();
                Long l16 = (Long) W2.f15331F.b();
                l16.getClass();
                return l16;
            case 17:
                List list16 = E.f10635a;
                U2.f15316b.get();
                return (String) W2.f15362g.b();
            case 18:
                List list17 = E.f10635a;
                H3.f15220b.get();
                Long l17 = (Long) J3.f15241b.b();
                l17.getClass();
                return l17;
            case 19:
                List list18 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15381q.b()).longValue());
            case 20:
                List list19 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15356d.b()).longValue());
            case 21:
                List list20 = E.f10635a;
                Boolean bool4 = (Boolean) C0930f3.f15484b.b();
                bool4.getClass();
                return bool4;
            case 22:
                List list21 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15375n.b()).longValue());
            case 23:
                List list22 = E.f10635a;
                U2.f15316b.get();
                return (String) W2.f15348X.b();
            case 24:
                List list23 = E.f10635a;
                U2.f15316b.get();
                return (String) W2.f15387t0.b();
            case 25:
                List list24 = E.f10635a;
                U2.f15316b.get();
                return (String) W2.Y.b();
            case 26:
                List list25 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15344T.b()).longValue());
            case 27:
                List list26 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15386t.b()).longValue());
            default:
                List list27 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15393z.b()).longValue());
        }
    }
}
