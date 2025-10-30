package i5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import w5.p;

/* renamed from: i5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1383d {

    /* renamed from: a, reason: collision with root package name */
    public final C1382c f18697a;

    /* renamed from: b, reason: collision with root package name */
    public final C1382c f18698b = new C1382c();

    /* renamed from: c, reason: collision with root package name */
    public final float f18699c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18700d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18701e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18702f;

    /* renamed from: g, reason: collision with root package name */
    public final float f18703g;

    /* renamed from: h, reason: collision with root package name */
    public final float f18704h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18705i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18706k;

    public C1383d(Context context, C1382c c1382c) {
        C1382c c1382c2;
        AttributeSet attributeSet;
        int i9;
        boolean z9;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        int intValue15;
        int intValue16;
        boolean booleanValue;
        Locale locale;
        int next;
        Locale.Category unused;
        if (c1382c == null) {
            c1382c2 = new C1382c();
        } else {
            c1382c2 = c1382c;
        }
        int i10 = c1382c2.f18672a;
        if (i10 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        attributeSet = asAttributeSet;
                        i9 = asAttributeSet.getStyleAttribute();
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e8) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e8);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i9 = 0;
        }
        TypedArray i11 = p.i(context, attributeSet, AbstractC1254a.f17738c, R.attr.badgeStyle, i9 == 0 ? R.style.Widget_MaterialComponents_Badge : i9, new int[0]);
        Resources resources = context.getResources();
        this.f18699c = i11.getDimensionPixelSize(4, -1);
        this.f18705i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f18700d = i11.getDimensionPixelSize(14, -1);
        this.f18701e = i11.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f18703g = i11.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f18702f = i11.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f18704h = i11.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f18706k = i11.getInt(24, 1);
        C1382c c1382c3 = this.f18698b;
        int i12 = c1382c2.f18680i;
        c1382c3.f18680i = i12 == -2 ? 255 : i12;
        int i13 = c1382c2.f18681k;
        if (i13 != -2) {
            c1382c3.f18681k = i13;
        } else if (i11.hasValue(23)) {
            this.f18698b.f18681k = i11.getInt(23, 0);
        } else {
            this.f18698b.f18681k = -1;
        }
        String str = c1382c2.j;
        if (str != null) {
            this.f18698b.j = str;
        } else if (i11.hasValue(7)) {
            this.f18698b.j = i11.getString(7);
        }
        C1382c c1382c4 = this.f18698b;
        c1382c4.f18685o = c1382c2.f18685o;
        CharSequence charSequence = c1382c2.f18686p;
        c1382c4.f18686p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C1382c c1382c5 = this.f18698b;
        int i14 = c1382c2.f18687q;
        c1382c5.f18687q = i14 == 0 ? R.plurals.mtrl_badge_content_description : i14;
        int i15 = c1382c2.f18688r;
        c1382c5.f18688r = i15 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i15;
        Boolean bool = c1382c2.f18690t;
        if (bool != null && !bool.booleanValue()) {
            z9 = false;
        } else {
            z9 = true;
        }
        c1382c5.f18690t = Boolean.valueOf(z9);
        C1382c c1382c6 = this.f18698b;
        int i16 = c1382c2.f18682l;
        c1382c6.f18682l = i16 == -2 ? i11.getInt(21, -2) : i16;
        C1382c c1382c7 = this.f18698b;
        int i17 = c1382c2.f18683m;
        c1382c7.f18683m = i17 == -2 ? i11.getInt(22, -2) : i17;
        C1382c c1382c8 = this.f18698b;
        Integer num = c1382c2.f18676e;
        if (num == null) {
            intValue = i11.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue = num.intValue();
        }
        c1382c8.f18676e = Integer.valueOf(intValue);
        C1382c c1382c9 = this.f18698b;
        Integer num2 = c1382c2.f18677f;
        if (num2 == null) {
            intValue2 = i11.getResourceId(6, 0);
        } else {
            intValue2 = num2.intValue();
        }
        c1382c9.f18677f = Integer.valueOf(intValue2);
        C1382c c1382c10 = this.f18698b;
        Integer num3 = c1382c2.f18678g;
        if (num3 == null) {
            intValue3 = i11.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue3 = num3.intValue();
        }
        c1382c10.f18678g = Integer.valueOf(intValue3);
        C1382c c1382c11 = this.f18698b;
        Integer num4 = c1382c2.f18679h;
        if (num4 == null) {
            intValue4 = i11.getResourceId(16, 0);
        } else {
            intValue4 = num4.intValue();
        }
        c1382c11.f18679h = Integer.valueOf(intValue4);
        C1382c c1382c12 = this.f18698b;
        Integer num5 = c1382c2.f18673b;
        if (num5 == null) {
            intValue5 = D1.p(context, i11, 1).getDefaultColor();
        } else {
            intValue5 = num5.intValue();
        }
        c1382c12.f18673b = Integer.valueOf(intValue5);
        C1382c c1382c13 = this.f18698b;
        Integer num6 = c1382c2.f18675d;
        if (num6 == null) {
            intValue6 = i11.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            intValue6 = num6.intValue();
        }
        c1382c13.f18675d = Integer.valueOf(intValue6);
        Integer num7 = c1382c2.f18674c;
        if (num7 != null) {
            this.f18698b.f18674c = num7;
        } else if (i11.hasValue(9)) {
            this.f18698b.f18674c = Integer.valueOf(D1.p(context, i11, 9).getDefaultColor());
        } else {
            int intValue17 = this.f18698b.f18675d.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue17, AbstractC1254a.f17731Q);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList p9 = D1.p(context, obtainStyledAttributes, 3);
            D1.p(context, obtainStyledAttributes, 4);
            D1.p(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i18 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i18, 0);
            obtainStyledAttributes.getString(i18);
            obtainStyledAttributes.getBoolean(14, false);
            D1.p(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue17, AbstractC1254a.f17717B);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f18698b.f18674c = Integer.valueOf(p9.getDefaultColor());
        }
        C1382c c1382c14 = this.f18698b;
        Integer num8 = c1382c2.f18689s;
        if (num8 == null) {
            intValue7 = i11.getInt(2, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        c1382c14.f18689s = Integer.valueOf(intValue7);
        C1382c c1382c15 = this.f18698b;
        Integer num9 = c1382c2.f18691u;
        if (num9 == null) {
            intValue8 = i11.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            intValue8 = num9.intValue();
        }
        c1382c15.f18691u = Integer.valueOf(intValue8);
        C1382c c1382c16 = this.f18698b;
        Integer num10 = c1382c2.f18692v;
        if (num10 == null) {
            intValue9 = i11.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            intValue9 = num10.intValue();
        }
        c1382c16.f18692v = Integer.valueOf(intValue9);
        C1382c c1382c17 = this.f18698b;
        Integer num11 = c1382c2.f18693w;
        if (num11 == null) {
            intValue10 = i11.getDimensionPixelOffset(18, 0);
        } else {
            intValue10 = num11.intValue();
        }
        c1382c17.f18693w = Integer.valueOf(intValue10);
        C1382c c1382c18 = this.f18698b;
        Integer num12 = c1382c2.f18694x;
        if (num12 == null) {
            intValue11 = i11.getDimensionPixelOffset(25, 0);
        } else {
            intValue11 = num12.intValue();
        }
        c1382c18.f18694x = Integer.valueOf(intValue11);
        C1382c c1382c19 = this.f18698b;
        Integer num13 = c1382c2.f18695y;
        if (num13 == null) {
            intValue12 = i11.getDimensionPixelOffset(19, c1382c19.f18693w.intValue());
        } else {
            intValue12 = num13.intValue();
        }
        c1382c19.f18695y = Integer.valueOf(intValue12);
        C1382c c1382c20 = this.f18698b;
        Integer num14 = c1382c2.f18696z;
        if (num14 == null) {
            intValue13 = i11.getDimensionPixelOffset(26, c1382c20.f18694x.intValue());
        } else {
            intValue13 = num14.intValue();
        }
        c1382c20.f18696z = Integer.valueOf(intValue13);
        C1382c c1382c21 = this.f18698b;
        Integer num15 = c1382c2.f18670C;
        if (num15 == null) {
            intValue14 = i11.getDimensionPixelOffset(20, 0);
        } else {
            intValue14 = num15.intValue();
        }
        c1382c21.f18670C = Integer.valueOf(intValue14);
        C1382c c1382c22 = this.f18698b;
        Integer num16 = c1382c2.f18668A;
        if (num16 == null) {
            intValue15 = 0;
        } else {
            intValue15 = num16.intValue();
        }
        c1382c22.f18668A = Integer.valueOf(intValue15);
        C1382c c1382c23 = this.f18698b;
        Integer num17 = c1382c2.f18669B;
        if (num17 == null) {
            intValue16 = 0;
        } else {
            intValue16 = num17.intValue();
        }
        c1382c23.f18669B = Integer.valueOf(intValue16);
        C1382c c1382c24 = this.f18698b;
        Boolean bool2 = c1382c2.f18671D;
        if (bool2 == null) {
            booleanValue = i11.getBoolean(0, false);
        } else {
            booleanValue = bool2.booleanValue();
        }
        c1382c24.f18671D = Boolean.valueOf(booleanValue);
        i11.recycle();
        Locale locale2 = c1382c2.f18684n;
        if (locale2 == null) {
            C1382c c1382c25 = this.f18698b;
            if (Build.VERSION.SDK_INT >= 24) {
                unused = Locale.Category.FORMAT;
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            c1382c25.f18684n = locale;
        } else {
            this.f18698b.f18684n = locale2;
        }
        this.f18697a = c1382c2;
    }
}
