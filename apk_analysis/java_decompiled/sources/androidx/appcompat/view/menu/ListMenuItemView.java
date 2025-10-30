package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import b5.G1;
import co.notix.R;
import h.AbstractC1260a;
import o.n;
import o.y;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public n f9348a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f9349b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f9350c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f9351d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f9352e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f9353f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f9354g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f9355h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f9356i;
    public final Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9357k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f9358l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9359m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f9360n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f9361o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f9362p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9363q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        G1 w7 = G1.w(getContext(), attributeSet, AbstractC1260a.f17821r, R.attr.listMenuViewStyle);
        this.j = w7.o(5);
        TypedArray typedArray = (TypedArray) w7.f10718c;
        this.f9357k = typedArray.getResourceId(1, -1);
        this.f9359m = typedArray.getBoolean(7, false);
        this.f9358l = context;
        this.f9360n = w7.o(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f9361o = obtainStyledAttributes.hasValue(0);
        w7.y();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f9362p == null) {
            this.f9362p = LayoutInflater.from(getContext());
        }
        return this.f9362p;
    }

    private void setSubMenuArrowVisible(boolean z9) {
        int i9;
        ImageView imageView = this.f9354g;
        if (imageView != null) {
            if (z9) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            imageView.setVisibility(i9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // o.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(o.n r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(o.n):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f9355h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9355h.getLayoutParams();
            rect.top = this.f9355h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    @Override // o.y
    public n getItemData() {
        return this.f9348a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f9351d = textView;
        int i9 = this.f9357k;
        if (i9 != -1) {
            textView.setTextAppearance(this.f9358l, i9);
        }
        this.f9353f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f9354g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f9360n);
        }
        this.f9355h = (ImageView) findViewById(R.id.group_divider);
        this.f9356i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.f9349b != null && this.f9359m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9349b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i9, i10);
    }

    public void setCheckable(boolean z9) {
        CompoundButton compoundButton;
        View view;
        if (z9 || this.f9350c != null || this.f9352e != null) {
            if ((this.f9348a.f21426x & 4) != 0) {
                if (this.f9350c == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.f9350c = radioButton;
                    LinearLayout linearLayout = this.f9356i;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f9350c;
                view = this.f9352e;
            } else {
                if (this.f9352e == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.f9352e = checkBox;
                    LinearLayout linearLayout2 = this.f9356i;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f9352e;
                view = this.f9350c;
            }
            if (z9) {
                compoundButton.setChecked(this.f9348a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f9352e;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f9350c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z9) {
        CompoundButton compoundButton;
        if ((this.f9348a.f21426x & 4) != 0) {
            if (this.f9350c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f9350c = radioButton;
                LinearLayout linearLayout = this.f9356i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f9350c;
        } else {
            if (this.f9352e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f9352e = checkBox;
                LinearLayout linearLayout2 = this.f9356i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f9352e;
        }
        compoundButton.setChecked(z9);
    }

    public void setForceShowIcon(boolean z9) {
        this.f9363q = z9;
        this.f9359m = z9;
    }

    public void setGroupDividerEnabled(boolean z9) {
        int i9;
        ImageView imageView = this.f9355h;
        if (imageView != null) {
            if (!this.f9361o && z9) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            imageView.setVisibility(i9);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f9348a.f21416n.getClass();
        boolean z9 = this.f9363q;
        if (z9 || this.f9359m) {
            ImageView imageView = this.f9349b;
            if (imageView != null || drawable != null || this.f9359m) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.f9349b = imageView2;
                    LinearLayout linearLayout = this.f9356i;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable == null && !this.f9359m) {
                    this.f9349b.setVisibility(8);
                    return;
                }
                ImageView imageView3 = this.f9349b;
                if (!z9) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.f9349b.getVisibility() != 0) {
                    this.f9349b.setVisibility(0);
                }
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f9351d.setText(charSequence);
            if (this.f9351d.getVisibility() != 0) {
                this.f9351d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f9351d.getVisibility() != 8) {
            this.f9351d.setVisibility(8);
        }
    }
}
