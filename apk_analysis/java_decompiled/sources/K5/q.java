package K5;

import P.Q;
import a.AbstractC0485a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import b5.G1;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f4357a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f4358b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f4359c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f4360d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f4361e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f4362f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f4363g;

    /* renamed from: h, reason: collision with root package name */
    public final p f4364h;

    /* renamed from: i, reason: collision with root package name */
    public int f4365i;
    public final LinkedHashSet j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f4366k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f4367l;

    /* renamed from: m, reason: collision with root package name */
    public int f4368m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f4369n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f4370o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f4371p;

    /* renamed from: q, reason: collision with root package name */
    public final AppCompatTextView f4372q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4373r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f4374s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f4375t;

    /* renamed from: u, reason: collision with root package name */
    public C3.v f4376u;

    /* renamed from: v, reason: collision with root package name */
    public final m f4377v;

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, K5.p] */
    public q(TextInputLayout textInputLayout, G1 g12) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i9 = 0;
        this.f4365i = 0;
        this.j = new LinkedHashSet();
        this.f4377v = new m(this);
        n nVar = new n(this);
        this.f4375t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f4357a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f4358b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a5 = a(this, from, R.id.text_input_error_icon);
        this.f4359c = a5;
        CheckableImageButton a9 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f4363g = a9;
        ?? obj = new Object();
        obj.f4355c = new SparseArray();
        obj.f4356d = this;
        TypedArray typedArray = (TypedArray) g12.f10718c;
        obj.f4353a = typedArray.getResourceId(28, 0);
        obj.f4354b = typedArray.getResourceId(52, 0);
        this.f4364h = obj;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f4372q = appCompatTextView;
        TypedArray typedArray2 = (TypedArray) g12.f10718c;
        if (typedArray2.hasValue(38)) {
            this.f4360d = D1.q(getContext(), g12, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f4361e = w5.p.k(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(g12.o(37));
        }
        a5.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = Q.f5546a;
        a5.setImportantForAccessibility(2);
        a5.setClickable(false);
        a5.setPressable(false);
        a5.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f4366k = D1.q(getContext(), g12, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f4367l = w5.p.k(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && a9.getContentDescription() != (text = typedArray2.getText(27))) {
                a9.setContentDescription(text);
            }
            a9.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f4366k = D1.q(getContext(), g12, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f4367l = w5.p.k(typedArray2.getInt(55, -1), null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (a9.getContentDescription() != text2) {
                a9.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f4368m) {
                this.f4368m = dimensionPixelSize;
                a9.setMinimumWidth(dimensionPixelSize);
                a9.setMinimumHeight(dimensionPixelSize);
                a5.setMinimumWidth(dimensionPixelSize);
                a5.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray2.hasValue(31)) {
                ImageView.ScaleType m9 = O4.h.m(typedArray2.getInt(31, -1));
                this.f4369n = m9;
                a9.setScaleType(m9);
                a5.setScaleType(m9);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray2.getResourceId(72, 0));
            if (typedArray2.hasValue(73)) {
                appCompatTextView.setTextColor(g12.n(73));
            }
            CharSequence text3 = typedArray2.getText(71);
            this.f4371p = TextUtils.isEmpty(text3) ? null : text3;
            appCompatTextView.setText(text3);
            n();
            frameLayout.addView(a9);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a5);
            textInputLayout.f16175C0.add(nVar);
            if (textInputLayout.f16203d != null) {
                nVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new o(i9, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i9) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i9);
        if (D1.C(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r fVar;
        int i9 = this.f4365i;
        p pVar = this.f4364h;
        SparseArray sparseArray = (SparseArray) pVar.f4355c;
        r rVar = (r) sparseArray.get(i9);
        if (rVar == null) {
            q qVar = (q) pVar.f4356d;
            if (i9 != -1) {
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 == 3) {
                                fVar = new l(qVar);
                            } else {
                                throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Invalid end icon mode: "));
                            }
                        } else {
                            fVar = new e(qVar);
                        }
                    } else {
                        fVar = new y(qVar, pVar.f4354b);
                    }
                } else {
                    fVar = new f(qVar, 1);
                }
            } else {
                fVar = new f(qVar, 0);
            }
            sparseArray.append(i9, fVar);
            return fVar;
        }
        return rVar;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.f4363g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = Q.f5546a;
        return this.f4372q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        if (this.f4358b.getVisibility() == 0 && this.f4363g.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f4359c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z9) {
        boolean z10;
        boolean isActivated;
        boolean z11;
        r b9 = b();
        boolean k5 = b9.k();
        CheckableImageButton checkableImageButton = this.f4363g;
        boolean z12 = true;
        if (k5 && (z11 = checkableImageButton.f16074d) != b9.l()) {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        } else {
            z10 = false;
        }
        if ((b9 instanceof l) && (isActivated = checkableImageButton.isActivated()) != b9.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z12 = z10;
        }
        if (!z9 && !z12) {
            return;
        }
        O4.h.E(this.f4357a, checkableImageButton, this.f4366k);
    }

    public final void g(int i9) {
        boolean z9;
        Drawable drawable;
        if (this.f4365i == i9) {
            return;
        }
        r b9 = b();
        C3.v vVar = this.f4376u;
        AccessibilityManager accessibilityManager = this.f4375t;
        if (vVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new Q.b(vVar));
        }
        CharSequence charSequence = null;
        this.f4376u = null;
        b9.s();
        this.f4365i = i9;
        Iterator it = this.j.iterator();
        if (!it.hasNext()) {
            if (i9 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            h(z9);
            r b10 = b();
            int i10 = this.f4364h.f4353a;
            if (i10 == 0) {
                i10 = b10.d();
            }
            if (i10 != 0) {
                drawable = AbstractC0485a.q(getContext(), i10);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f4363g;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f4357a;
            if (drawable != null) {
                O4.h.c(textInputLayout, checkableImageButton, this.f4366k, this.f4367l);
                O4.h.E(textInputLayout, checkableImageButton, this.f4366k);
            }
            int c3 = b10.c();
            if (c3 != 0) {
                charSequence = getResources().getText(c3);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b10.k());
            if (b10.i(textInputLayout.getBoxBackgroundMode())) {
                b10.r();
                C3.v h7 = b10.h();
                this.f4376u = h7;
                if (h7 != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    if (isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new Q.b(this.f4376u));
                    }
                }
                View.OnClickListener f9 = b10.f();
                View.OnLongClickListener onLongClickListener = this.f4370o;
                checkableImageButton.setOnClickListener(f9);
                O4.h.G(checkableImageButton, onLongClickListener);
                EditText editText = this.f4374s;
                if (editText != null) {
                    b10.m(editText);
                    j(b10);
                }
                O4.h.c(textInputLayout, checkableImageButton, this.f4366k, this.f4367l);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i9);
        }
        throw A0.a.h(it);
    }

    public final void h(boolean z9) {
        int i9;
        if (d() != z9) {
            if (z9) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            this.f4363g.setVisibility(i9);
            k();
            m();
            this.f4357a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4359c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        O4.h.c(this.f4357a, checkableImageButton, this.f4360d, this.f4361e);
    }

    public final void j(r rVar) {
        if (this.f4374s != null) {
            if (rVar.e() != null) {
                this.f4374s.setOnFocusChangeListener(rVar.e());
            }
            if (rVar.g() != null) {
                this.f4363g.setOnFocusChangeListener(rVar.g());
            }
        }
    }

    public final void k() {
        int i9;
        boolean z9;
        int i10 = 8;
        if (this.f4363g.getVisibility() == 0 && !e()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f4358b.setVisibility(i9);
        if (this.f4371p != null && !this.f4373r) {
            z9 = false;
        } else {
            z9 = 8;
        }
        if (d() || e() || !z9) {
            i10 = 0;
        }
        setVisibility(i10);
    }

    public final void l() {
        int i9;
        CheckableImageButton checkableImageButton = this.f4359c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f4357a;
        if (drawable != null && textInputLayout.j.f4406q && textInputLayout.m()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        checkableImageButton.setVisibility(i9);
        k();
        m();
        if (this.f4365i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i9;
        TextInputLayout textInputLayout = this.f4357a;
        if (textInputLayout.f16203d == null) {
            return;
        }
        if (!d() && !e()) {
            EditText editText = textInputLayout.f16203d;
            WeakHashMap weakHashMap = Q.f5546a;
            i9 = editText.getPaddingEnd();
        } else {
            i9 = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f16203d.getPaddingTop();
        int paddingBottom = textInputLayout.f16203d.getPaddingBottom();
        WeakHashMap weakHashMap2 = Q.f5546a;
        this.f4372q.setPaddingRelative(dimensionPixelSize, paddingTop, i9, paddingBottom);
    }

    public final void n() {
        int i9;
        AppCompatTextView appCompatTextView = this.f4372q;
        int visibility = appCompatTextView.getVisibility();
        boolean z9 = false;
        if (this.f4371p != null && !this.f4373r) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        if (visibility != i9) {
            r b9 = b();
            if (i9 == 0) {
                z9 = true;
            }
            b9.p(z9);
        }
        k();
        appCompatTextView.setVisibility(i9);
        this.f4357a.q();
    }
}
