package K5;

import P.Q;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import co.notix.R;
import com.google.android.material.textfield.TextInputLayout;
import h5.AbstractC1281a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f4336e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4337f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f4338g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f4339h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewOnClickListenerC0215a f4340i;
    public final ViewOnFocusChangeListenerC0216b j;

    /* renamed from: k, reason: collision with root package name */
    public final C3.v f4341k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4342l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4343m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4344n;

    /* renamed from: o, reason: collision with root package name */
    public long f4345o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f4346p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f4347q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f4348r;

    public l(q qVar) {
        super(qVar);
        int i9 = 1;
        this.f4340i = new ViewOnClickListenerC0215a(i9, this);
        this.j = new ViewOnFocusChangeListenerC0216b(this, i9);
        this.f4341k = new C3.v(2, this);
        this.f4345o = Long.MAX_VALUE;
        this.f4337f = Z0.a.y(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f4336e = Z0.a.y(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f4338g = Z0.a.z(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1281a.f17925a);
    }

    @Override // K5.r
    public final void a() {
        if (this.f4346p.isTouchExplorationEnabled() && M4.a.t(this.f4339h) && !this.f4381d.hasFocus()) {
            this.f4339h.dismissDropDown();
        }
        this.f4339h.post(new A6.s(5, this));
    }

    @Override // K5.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // K5.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // K5.r
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // K5.r
    public final View.OnClickListener f() {
        return this.f4340i;
    }

    @Override // K5.r
    public final C3.v h() {
        return this.f4341k;
    }

    @Override // K5.r
    public final boolean i(int i9) {
        if (i9 != 0) {
            return true;
        }
        return false;
    }

    @Override // K5.r
    public final boolean j() {
        return this.f4342l;
    }

    @Override // K5.r
    public final boolean l() {
        return this.f4344n;
    }

    @Override // K5.r
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f4339h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: K5.j
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z9;
                    l lVar = l.this;
                    lVar.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - lVar.f4345o;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            lVar.f4343m = false;
                        }
                        lVar.u();
                        lVar.f4343m = true;
                        lVar.f4345o = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.f4339h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: K5.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    l lVar = l.this;
                    lVar.f4343m = true;
                    lVar.f4345o = System.currentTimeMillis();
                    lVar.t(false);
                }
            });
            this.f4339h.setThreshold(0);
            TextInputLayout textInputLayout = this.f4378a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!M4.a.t(editText) && this.f4346p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = Q.f5546a;
                this.f4381d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // K5.r
    public final void n(Q.g gVar) {
        boolean e8;
        if (!M4.a.t(this.f4339h)) {
            gVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            e8 = gVar.f6035a.isShowingHintText();
        } else {
            e8 = gVar.e(4);
        }
        if (e8) {
            gVar.k(null);
        }
    }

    @Override // K5.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z9;
        if (this.f4346p.isEnabled() && !M4.a.t(this.f4339h)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f4344n && !this.f4339h.isPopupShowing()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z9) {
                u();
                this.f4343m = true;
                this.f4345o = System.currentTimeMillis();
            }
        }
    }

    @Override // K5.r
    public final void r() {
        int i9 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f4338g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f4337f);
        ofFloat.addUpdateListener(new i(i9, this));
        this.f4348r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f4336e);
        ofFloat2.addUpdateListener(new i(i9, this));
        this.f4347q = ofFloat2;
        ofFloat2.addListener(new A5.t(3, this));
        this.f4346p = (AccessibilityManager) this.f4380c.getSystemService("accessibility");
    }

    @Override // K5.r
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f4339h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f4339h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z9) {
        if (this.f4344n != z9) {
            this.f4344n = z9;
            this.f4348r.cancel();
            this.f4347q.start();
        }
    }

    public final void u() {
        boolean z9;
        if (this.f4339h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f4345o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            this.f4343m = false;
        }
        if (!this.f4343m) {
            t(!this.f4344n);
            if (this.f4344n) {
                this.f4339h.requestFocus();
                this.f4339h.showDropDown();
                return;
            } else {
                this.f4339h.dismissDropDown();
                return;
            }
        }
        this.f4343m = false;
    }
}
