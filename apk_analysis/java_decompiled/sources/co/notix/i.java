package co.notix;

import android.graphics.Bitmap;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f12416a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12417b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f12418c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12419d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f12420e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12421f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12422g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12423h;

    public i(String title, String description, Bitmap image, String str, Bitmap bitmap, String str2, String targetUrl, String impressionData) {
        kotlin.jvm.internal.h.e(title, "title");
        kotlin.jvm.internal.h.e(description, "description");
        kotlin.jvm.internal.h.e(image, "image");
        kotlin.jvm.internal.h.e(targetUrl, "targetUrl");
        kotlin.jvm.internal.h.e(impressionData, "impressionData");
        this.f12416a = title;
        this.f12417b = description;
        this.f12418c = image;
        this.f12419d = str;
        this.f12420e = bitmap;
        this.f12421f = str2;
        this.f12422g = targetUrl;
        this.f12423h = impressionData;
    }

    @Override // co.notix.g
    public final String a() {
        return this.f12423h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (kotlin.jvm.internal.h.a(this.f12416a, iVar.f12416a) && kotlin.jvm.internal.h.a(this.f12417b, iVar.f12417b) && kotlin.jvm.internal.h.a(this.f12418c, iVar.f12418c) && kotlin.jvm.internal.h.a(this.f12419d, iVar.f12419d) && kotlin.jvm.internal.h.a(this.f12420e, iVar.f12420e) && kotlin.jvm.internal.h.a(this.f12421f, iVar.f12421f) && kotlin.jvm.internal.h.a(this.f12422g, iVar.f12422g) && kotlin.jvm.internal.h.a(this.f12423h, iVar.f12423h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f12418c.hashCode() + h.a(this.f12417b, this.f12416a.hashCode() * 31, 31)) * 31;
        String str = this.f12419d;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        Bitmap bitmap = this.f12420e;
        if (bitmap == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bitmap.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str2 = this.f12421f;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return this.f12423h.hashCode() + h.a(this.f12422g, (i11 + i9) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdContentBmp(title=");
        sb.append(this.f12416a);
        sb.append(", description=");
        sb.append(this.f12417b);
        sb.append(", image=");
        sb.append(this.f12418c);
        sb.append(", imageUrl=");
        sb.append(this.f12419d);
        sb.append(", icon=");
        sb.append(this.f12420e);
        sb.append(", iconUrl=");
        sb.append(this.f12421f);
        sb.append(", targetUrl=");
        sb.append(this.f12422g);
        sb.append(", impressionData=");
        return AbstractC0953k1.p(sb, this.f12423h, ')');
    }
}
