package t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import i5.C1381b;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends G4.a {
    public static final Parcelable.Creator<n> CREATOR = new C1381b(23);

    /* renamed from: a, reason: collision with root package name */
    public MediaInfo f23214a;

    /* renamed from: b, reason: collision with root package name */
    public int f23215b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23216c;

    /* renamed from: d, reason: collision with root package name */
    public double f23217d;

    /* renamed from: e, reason: collision with root package name */
    public double f23218e;

    /* renamed from: f, reason: collision with root package name */
    public double f23219f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f23220g;

    /* renamed from: h, reason: collision with root package name */
    public String f23221h;

    /* renamed from: i, reason: collision with root package name */
    public JSONObject f23222i;

    public n(MediaInfo mediaInfo, int i9, boolean z9, double d9, double d10, double d11, long[] jArr, String str) {
        this.f23214a = mediaInfo;
        this.f23215b = i9;
        this.f23216c = z9;
        this.f23217d = d9;
        this.f23218e = d10;
        this.f23219f = d11;
        this.f23220g = jArr;
        this.f23221h = str;
        if (str == null) {
            this.f23222i = null;
            return;
        }
        try {
            this.f23222i = new JSONObject(this.f23221h);
        } catch (JSONException unused) {
            this.f23222i = null;
            this.f23221h = null;
        }
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        JSONObject jSONObject = this.f23222i;
        if (jSONObject != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        JSONObject jSONObject2 = nVar.f23222i;
        if (jSONObject2 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 != z10) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || K4.c.a(jSONObject, jSONObject2)) && y4.a.e(this.f23214a, nVar.f23214a) && this.f23215b == nVar.f23215b && this.f23216c == nVar.f23216c && (((Double.isNaN(this.f23217d) && Double.isNaN(nVar.f23217d)) || this.f23217d == nVar.f23217d) && this.f23218e == nVar.f23218e && this.f23219f == nVar.f23219f && Arrays.equals(this.f23220g, nVar.f23220g))) {
            return true;
        }
        return false;
    }

    public final boolean f(JSONObject jSONObject) {
        boolean z9;
        long[] jArr;
        boolean z10;
        int i9;
        boolean z11 = false;
        if (jSONObject.has("media")) {
            this.f23214a = new MediaInfo(jSONObject.getJSONObject("media"));
            z9 = true;
        } else {
            z9 = false;
        }
        if (jSONObject.has("itemId") && this.f23215b != (i9 = jSONObject.getInt("itemId"))) {
            this.f23215b = i9;
            z9 = true;
        }
        if (jSONObject.has("autoplay") && this.f23216c != (z10 = jSONObject.getBoolean("autoplay"))) {
            this.f23216c = z10;
            z9 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.f23217d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.f23217d) > 1.0E-7d)) {
            this.f23217d = optDouble;
            z9 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d9 = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d9 - this.f23218e) > 1.0E-7d) {
                this.f23218e = d9;
                z9 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d10 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d10 - this.f23219f) > 1.0E-7d) {
                this.f23219f = d10;
                z9 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArray.getLong(i10);
            }
            long[] jArr2 = this.f23220g;
            if (jArr2 != null && jArr2.length == length) {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f23220g[i11] == jArr[i11]) {
                    }
                }
            }
            z11 = true;
            break;
        } else {
            jArr = null;
        }
        if (z11) {
            this.f23220g = jArr;
            z9 = true;
        }
        if (jSONObject.has("customData")) {
            this.f23222i = jSONObject.getJSONObject("customData");
            return true;
        }
        return z9;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f23214a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.f());
            }
            int i9 = this.f23215b;
            if (i9 != 0) {
                jSONObject.put("itemId", i9);
            }
            jSONObject.put("autoplay", this.f23216c);
            if (!Double.isNaN(this.f23217d)) {
                jSONObject.put("startTime", this.f23217d);
            }
            double d9 = this.f23218e;
            if (d9 != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d9);
            }
            jSONObject.put("preloadTime", this.f23219f);
            if (this.f23220g != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.f23220g) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f23222i;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23214a, Integer.valueOf(this.f23215b), Boolean.valueOf(this.f23216c), Double.valueOf(this.f23217d), Double.valueOf(this.f23218e), Double.valueOf(this.f23219f), Integer.valueOf(Arrays.hashCode(this.f23220g)), String.valueOf(this.f23222i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        JSONObject jSONObject2 = this.f23222i;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f23221h = jSONObject;
        int R2 = s8.n.R(parcel, 20293);
        s8.n.L(parcel, 2, this.f23214a, i9);
        int i10 = this.f23215b;
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(i10);
        boolean z9 = this.f23216c;
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(z9 ? 1 : 0);
        double d9 = this.f23217d;
        s8.n.V(parcel, 5, 8);
        parcel.writeDouble(d9);
        double d10 = this.f23218e;
        s8.n.V(parcel, 6, 8);
        parcel.writeDouble(d10);
        double d11 = this.f23219f;
        s8.n.V(parcel, 7, 8);
        parcel.writeDouble(d11);
        s8.n.K(parcel, 8, this.f23220g);
        s8.n.M(parcel, 9, this.f23221h);
        s8.n.U(parcel, R2);
    }

    public n(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        f(jSONObject);
    }
}
