package t4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import i5.C1381b;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2011a extends G4.a {
    public static final Parcelable.Creator<C2011a> CREATOR = new C1381b(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f23145a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23146b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23147c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23148d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23149e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23150f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23151g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23152h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23153i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final String f23154k;

    /* renamed from: l, reason: collision with root package name */
    public final r f23155l;

    /* renamed from: m, reason: collision with root package name */
    public final JSONObject f23156m;

    public C2011a(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j4, String str9, r rVar) {
        this.f23145a = str;
        this.f23146b = str2;
        this.f23147c = j;
        this.f23148d = str3;
        this.f23149e = str4;
        this.f23150f = str5;
        this.f23151g = str6;
        this.f23152h = str7;
        this.f23153i = str8;
        this.j = j4;
        this.f23154k = str9;
        this.f23155l = rVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f23156m = new JSONObject(str6);
                return;
            } catch (JSONException e8) {
                Locale locale = Locale.ROOT;
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + e8.getMessage());
                this.f23151g = null;
                this.f23156m = new JSONObject();
                return;
            }
        }
        this.f23156m = new JSONObject();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2011a)) {
            return false;
        }
        C2011a c2011a = (C2011a) obj;
        if (y4.a.e(this.f23145a, c2011a.f23145a) && y4.a.e(this.f23146b, c2011a.f23146b) && this.f23147c == c2011a.f23147c && y4.a.e(this.f23148d, c2011a.f23148d) && y4.a.e(this.f23149e, c2011a.f23149e) && y4.a.e(this.f23150f, c2011a.f23150f) && y4.a.e(this.f23151g, c2011a.f23151g) && y4.a.e(this.f23152h, c2011a.f23152h) && y4.a.e(this.f23153i, c2011a.f23153i) && this.j == c2011a.j && y4.a.e(this.f23154k, c2011a.f23154k) && y4.a.e(this.f23155l, c2011a.f23155l)) {
            return true;
        }
        return false;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f23145a);
            long j = this.f23147c;
            Pattern pattern = y4.a.f24915a;
            jSONObject.put("duration", j / 1000.0d);
            long j4 = this.j;
            if (j4 != -1) {
                jSONObject.put("whenSkippable", j4 / 1000.0d);
            }
            String str = this.f23152h;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f23149e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f23146b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.f23148d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f23150f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f23156m;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f23153i;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f23154k;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            r rVar = this.f23155l;
            if (rVar != null) {
                jSONObject.put("vastAdsRequest", rVar.f());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23145a, this.f23146b, Long.valueOf(this.f23147c), this.f23148d, this.f23149e, this.f23150f, this.f23151g, this.f23152h, this.f23153i, Long.valueOf(this.j), this.f23154k, this.f23155l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 2, this.f23145a);
        s8.n.M(parcel, 3, this.f23146b);
        s8.n.V(parcel, 4, 8);
        parcel.writeLong(this.f23147c);
        s8.n.M(parcel, 5, this.f23148d);
        s8.n.M(parcel, 6, this.f23149e);
        s8.n.M(parcel, 7, this.f23150f);
        s8.n.M(parcel, 8, this.f23151g);
        s8.n.M(parcel, 9, this.f23152h);
        s8.n.M(parcel, 10, this.f23153i);
        s8.n.V(parcel, 11, 8);
        parcel.writeLong(this.j);
        s8.n.M(parcel, 12, this.f23154k);
        s8.n.L(parcel, 13, this.f23155l, i9);
        s8.n.U(parcel, R2);
    }
}
