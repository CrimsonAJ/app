package i4;

import P5.F;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class g extends u {

    /* renamed from: A, reason: collision with root package name */
    public boolean f18530A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f18531B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f18532C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f18533D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f18534E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f18535F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f18536G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f18537H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f18538I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f18539J;
    public boolean K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f18540L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f18541M;

    /* renamed from: N, reason: collision with root package name */
    public final SparseArray f18542N;

    /* renamed from: O, reason: collision with root package name */
    public final SparseBooleanArray f18543O;

    public g(Context context) {
        Point point;
        Point point2;
        String B9;
        String[] split;
        DisplayManager displayManager;
        CaptioningManager captioningManager;
        String locale;
        int i9 = y.f20553a;
        if (i9 >= 19 && ((i9 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f18617t = 1088;
            Locale locale2 = captioningManager.getLocale();
            if (locale2 != null) {
                if (i9 >= 21) {
                    locale = locale2.toLanguageTag();
                } else {
                    locale = locale2.toString();
                }
                this.f18616s = F.s(locale);
            }
        }
        Display display = (i9 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && y.G(context)) {
            if (i9 < 28) {
                B9 = y.B("sys.display-size");
            } else {
                B9 = y.B("vendor.display-size");
            }
            if (!TextUtils.isEmpty(B9)) {
                try {
                    split = B9.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point2 = new Point(parseInt, parseInt2);
                        i(point2.x, point2.y);
                        this.f18542N = new SparseArray();
                        this.f18543O = new SparseBooleanArray();
                        j();
                    }
                }
                AbstractC1566a.t("Util", "Invalid display size: " + B9);
            }
            if ("Sony".equals(y.f20555c) && y.f20556d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                point2 = point;
                i(point2.x, point2.y);
                this.f18542N = new SparseArray();
                this.f18543O = new SparseBooleanArray();
                j();
            }
        }
        point = new Point();
        if (i9 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i9 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        point2 = point;
        i(point2.x, point2.y);
        this.f18542N = new SparseArray();
        this.f18543O = new SparseBooleanArray();
        j();
    }

    @Override // i4.u
    public final v a() {
        return new h(this);
    }

    @Override // i4.u
    public final u b(int i9) {
        super.b(i9);
        return this;
    }

    @Override // i4.u
    public final u d() {
        this.f18618u = -3;
        return this;
    }

    @Override // i4.u
    public final u e(int i9) {
        this.f18599a = Integer.MAX_VALUE;
        this.f18600b = i9;
        return this;
    }

    @Override // i4.u
    public final u f(int i9) {
        this.f18603e = 0;
        this.f18604f = i9;
        return this;
    }

    @Override // i4.u
    public final u g(t tVar) {
        super.g(tVar);
        return this;
    }

    @Override // i4.u
    public final u h(int i9) {
        super.h(i9);
        return this;
    }

    @Override // i4.u
    public final u i(int i9, int i10) {
        super.i(i9, i10);
        return this;
    }

    public final void j() {
        this.f18530A = true;
        this.f18531B = false;
        this.f18532C = true;
        this.f18533D = false;
        this.f18534E = true;
        this.f18535F = false;
        this.f18536G = false;
        this.f18537H = false;
        this.f18538I = false;
        this.f18539J = true;
        this.K = true;
        this.f18540L = false;
        this.f18541M = true;
    }

    public g(h hVar) {
        c(hVar);
        this.f18530A = hVar.f18545B;
        this.f18531B = hVar.f18546C;
        this.f18532C = hVar.f18547D;
        this.f18533D = hVar.f18548X;
        this.f18534E = hVar.Y;
        this.f18535F = hVar.f18549Z;
        this.f18536G = hVar.f18550f0;
        this.f18537H = hVar.f18551g0;
        this.f18538I = hVar.f18552h0;
        this.f18539J = hVar.f18553i0;
        this.K = hVar.f18554j0;
        this.f18540L = hVar.f18555k0;
        this.f18541M = hVar.f18556l0;
        SparseArray sparseArray = new SparseArray();
        int i9 = 0;
        while (true) {
            SparseArray sparseArray2 = hVar.f18557m0;
            if (i9 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i9), new HashMap((Map) sparseArray2.valueAt(i9)));
                i9++;
            } else {
                this.f18542N = sparseArray;
                this.f18543O = hVar.f18558n0.clone();
                return;
            }
        }
    }

    public g() {
        this.f18542N = new SparseArray();
        this.f18543O = new SparseBooleanArray();
        j();
    }
}
