package J5;

import P.Q;
import a.AbstractC0485a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b7.C0701c;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.tabs.TabLayout;
import i5.C1380a;
import java.util.WeakHashMap;
import o1.C1671f;
import w5.p;

/* loaded from: classes.dex */
public final class h extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f4207l = 0;

    /* renamed from: a, reason: collision with root package name */
    public f f4208a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f4209b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f4210c;

    /* renamed from: d, reason: collision with root package name */
    public View f4211d;

    /* renamed from: e, reason: collision with root package name */
    public C1380a f4212e;

    /* renamed from: f, reason: collision with root package name */
    public View f4213f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f4214g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f4215h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f4216i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TabLayout f4217k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TabLayout tabLayout, Context context) {
        super(context);
        C1671f c1671f;
        int i9 = 14;
        this.f4217k = tabLayout;
        this.j = 2;
        d(context);
        int i10 = tabLayout.f16135e;
        WeakHashMap weakHashMap = Q.f5546a;
        setPaddingRelative(i10, tabLayout.f16136f, tabLayout.f16138g, tabLayout.f16140h);
        setGravity(17);
        setOrientation(!tabLayout.f16130D ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            c1671f = new C1671f(i9, L.d.e(context2));
        } else {
            c1671f = new C1671f(i9, (Object) null);
        }
        Q.o(this, c1671f);
    }

    private C1380a getBadge() {
        return this.f4212e;
    }

    private C1380a getOrCreateBadge() {
        if (this.f4212e == null) {
            this.f4212e = new C1380a(getContext(), null);
        }
        b();
        C1380a c1380a = this.f4212e;
        if (c1380a != null) {
            return c1380a;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a() {
        if (this.f4212e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f4211d;
            if (view != null) {
                C1380a c1380a = this.f4212e;
                if (c1380a != null) {
                    if (c1380a.d() != null) {
                        c1380a.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(c1380a);
                    }
                }
                this.f4211d = null;
            }
        }
    }

    public final void b() {
        f fVar;
        if (this.f4212e != null) {
            if (this.f4213f != null) {
                a();
                return;
            }
            ImageView imageView = this.f4210c;
            if (imageView != null && (fVar = this.f4208a) != null && fVar.f4198a != null) {
                if (this.f4211d != imageView) {
                    a();
                    ImageView imageView2 = this.f4210c;
                    if (this.f4212e != null && imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                            viewGroup.setClipToPadding(false);
                        }
                        C1380a c1380a = this.f4212e;
                        Rect rect = new Rect();
                        imageView2.getDrawingRect(rect);
                        c1380a.setBounds(rect);
                        c1380a.i(imageView2, null);
                        if (c1380a.d() != null) {
                            c1380a.d().setForeground(c1380a);
                        } else {
                            imageView2.getOverlay().add(c1380a);
                        }
                        this.f4211d = imageView2;
                        return;
                    }
                    return;
                }
                c(imageView);
                return;
            }
            TextView textView = this.f4209b;
            if (textView != null && this.f4208a != null) {
                if (this.f4211d != textView) {
                    a();
                    TextView textView2 = this.f4209b;
                    if (this.f4212e != null && textView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.setClipChildren(false);
                            viewGroup2.setClipToPadding(false);
                        }
                        C1380a c1380a2 = this.f4212e;
                        Rect rect2 = new Rect();
                        textView2.getDrawingRect(rect2);
                        c1380a2.setBounds(rect2);
                        c1380a2.i(textView2, null);
                        if (c1380a2.d() != null) {
                            c1380a2.d().setForeground(c1380a2);
                        } else {
                            textView2.getOverlay().add(c1380a2);
                        }
                        this.f4211d = textView2;
                        return;
                    }
                    return;
                }
                c(textView);
                return;
            }
            a();
        }
    }

    public final void c(View view) {
        C1380a c1380a = this.f4212e;
        if (c1380a != null && view == this.f4211d) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            c1380a.setBounds(rect);
            c1380a.i(view, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [J5.h, android.view.View] */
    public final void d(Context context) {
        TabLayout tabLayout = this.f4217k;
        int i9 = tabLayout.f16160t;
        GradientDrawable gradientDrawable = null;
        if (i9 != 0) {
            Drawable q9 = AbstractC0485a.q(context, i9);
            this.f4216i = q9;
            if (q9 != null && q9.isStateful()) {
                this.f4216i.setState(getDrawableState());
            }
        } else {
            this.f4216i = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        if (tabLayout.f16151n != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList a5 = D5.a.a(tabLayout.f16151n);
            boolean z9 = tabLayout.f16143i0;
            if (z9) {
                gradientDrawable2 = null;
            }
            if (!z9) {
                gradientDrawable = gradientDrawable3;
            }
            gradientDrawable2 = new RippleDrawable(a5, gradientDrawable2, gradientDrawable);
        }
        WeakHashMap weakHashMap = Q.f5546a;
        setBackground(gradientDrawable2);
        tabLayout.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z9;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4216i;
        if (drawable != null && drawable.isStateful()) {
            z9 = this.f4216i.setState(drawableState);
        } else {
            z9 = false;
        }
        if (z9) {
            invalidate();
            this.f4217k.invalidate();
        }
    }

    public final void e() {
        View view;
        int i9;
        ViewParent parent;
        f fVar = this.f4208a;
        if (fVar != null) {
            view = fVar.f4202e;
        } else {
            view = null;
        }
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f4213f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f4213f);
                }
                addView(view);
            }
            this.f4213f = view;
            TextView textView = this.f4209b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f4210c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f4210c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f4214g = textView2;
            if (textView2 != null) {
                this.j = textView2.getMaxLines();
            }
            this.f4215h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f4213f;
            if (view3 != null) {
                removeView(view3);
                this.f4213f = null;
            }
            this.f4214g = null;
            this.f4215h = null;
        }
        if (this.f4213f == null) {
            if (this.f4210c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(co.notix.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f4210c = imageView2;
                addView(imageView2, 0);
            }
            if (this.f4209b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(co.notix.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f4209b = textView3;
                addView(textView3);
                this.j = this.f4209b.getMaxLines();
            }
            TextView textView4 = this.f4209b;
            TabLayout tabLayout = this.f4217k;
            textView4.setTextAppearance(tabLayout.f16142i);
            if (isSelected() && (i9 = tabLayout.f16145k) != -1) {
                this.f4209b.setTextAppearance(i9);
            } else {
                this.f4209b.setTextAppearance(tabLayout.j);
            }
            ColorStateList colorStateList = tabLayout.f16147l;
            if (colorStateList != null) {
                this.f4209b.setTextColor(colorStateList);
            }
            f(this.f4209b, this.f4210c, true);
            b();
            ImageView imageView3 = this.f4210c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new g(this, imageView3));
            }
            TextView textView5 = this.f4209b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new g(this, textView5));
            }
        } else {
            TextView textView6 = this.f4214g;
            if (textView6 != null || this.f4215h != null) {
                f(textView6, this.f4215h, false);
            }
        }
        if (fVar != null && !TextUtils.isEmpty(fVar.f4200c)) {
            setContentDescription(fVar.f4200c);
        }
    }

    public final void f(TextView textView, ImageView imageView, boolean z9) {
        Drawable drawable;
        CharSequence charSequence;
        boolean z10;
        int i9;
        CharSequence charSequence2;
        int i10;
        Drawable drawable2;
        f fVar = this.f4208a;
        CharSequence charSequence3 = null;
        if (fVar != null && (drawable2 = fVar.f4198a) != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        TabLayout tabLayout = this.f4217k;
        if (drawable != null) {
            drawable.setTintList(tabLayout.f16149m);
            PorterDuff.Mode mode = tabLayout.f16157q;
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        f fVar2 = this.f4208a;
        if (fVar2 != null) {
            charSequence = fVar2.f4199b;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (!isEmpty) {
                this.f4208a.getClass();
                z10 = true;
            } else {
                z10 = false;
            }
            if (!isEmpty) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            textView.setText(charSequence2);
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z10 = false;
        }
        if (z9 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z10 && imageView.getVisibility() == 0) {
                i9 = (int) p.e(getContext(), 8);
            } else {
                i9 = 0;
            }
            if (tabLayout.f16130D) {
                if (i9 != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(i9);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i9 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i9;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        f fVar3 = this.f4208a;
        if (fVar3 != null) {
            charSequence3 = fVar3.f4200c;
        }
        if (Build.VERSION.SDK_INT > 23) {
            if (isEmpty) {
                charSequence = charSequence3;
            }
            D1.J(this, charSequence);
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.f4209b, this.f4210c, this.f4213f};
        int i9 = 0;
        int i10 = 0;
        boolean z9 = false;
        for (int i11 = 0; i11 < 3; i11++) {
            View view = viewArr[i11];
            if (view != null && view.getVisibility() == 0) {
                if (z9) {
                    i10 = Math.min(i10, view.getTop());
                } else {
                    i10 = view.getTop();
                }
                if (z9) {
                    i9 = Math.max(i9, view.getBottom());
                } else {
                    i9 = view.getBottom();
                }
                z9 = true;
            }
        }
        return i9 - i10;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f4209b, this.f4210c, this.f4213f};
        int i9 = 0;
        int i10 = 0;
        boolean z9 = false;
        for (int i11 = 0; i11 < 3; i11++) {
            View view = viewArr[i11];
            if (view != null && view.getVisibility() == 0) {
                if (z9) {
                    i10 = Math.min(i10, view.getLeft());
                } else {
                    i10 = view.getLeft();
                }
                if (z9) {
                    i9 = Math.max(i9, view.getRight());
                } else {
                    i9 = view.getRight();
                }
                z9 = true;
            }
        }
        return i9 - i10;
    }

    public f getTab() {
        return this.f4208a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1380a c1380a = this.f4212e;
        if (c1380a != null && c1380a.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.f4212e.c());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0701c.I(isSelected(), 0, 1, this.f4208a.f4201d, 1).f11404b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) Q.e.f6020e.f6030a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(co.notix.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        TabLayout tabLayout = this.f4217k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i9 = View.MeasureSpec.makeMeasureSpec(tabLayout.f16161u, Integer.MIN_VALUE);
        }
        super.onMeasure(i9, i10);
        if (this.f4209b != null) {
            float f9 = tabLayout.f16158r;
            int i11 = this.j;
            ImageView imageView = this.f4210c;
            if (imageView != null && imageView.getVisibility() == 0) {
                i11 = 1;
            } else {
                TextView textView = this.f4209b;
                if (textView != null && textView.getLineCount() > 1) {
                    f9 = tabLayout.f16159s;
                }
            }
            float textSize = this.f4209b.getTextSize();
            int lineCount = this.f4209b.getLineCount();
            int maxLines = this.f4209b.getMaxLines();
            if (f9 != textSize || (maxLines >= 0 && i11 != maxLines)) {
                if (tabLayout.f16129C == 1 && f9 > textSize && lineCount == 1) {
                    Layout layout = this.f4209b.getLayout();
                    if (layout != null) {
                        if ((f9 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f4209b.setTextSize(0, f9);
                this.f4209b.setMaxLines(i11);
                super.onMeasure(i9, i10);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f4208a != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            f fVar = this.f4208a;
            TabLayout tabLayout = fVar.f4203f;
            if (tabLayout != null) {
                tabLayout.k(fVar, true);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        return performClick;
    }

    @Override // android.view.View
    public void setSelected(boolean z9) {
        isSelected();
        super.setSelected(z9);
        TextView textView = this.f4209b;
        if (textView != null) {
            textView.setSelected(z9);
        }
        ImageView imageView = this.f4210c;
        if (imageView != null) {
            imageView.setSelected(z9);
        }
        View view = this.f4213f;
        if (view != null) {
            view.setSelected(z9);
        }
    }

    public void setTab(f fVar) {
        boolean z9;
        if (fVar != this.f4208a) {
            this.f4208a = fVar;
            e();
            f fVar2 = this.f4208a;
            if (fVar2 != null && fVar2.a()) {
                z9 = true;
            } else {
                z9 = false;
            }
            setSelected(z9);
        }
    }
}
