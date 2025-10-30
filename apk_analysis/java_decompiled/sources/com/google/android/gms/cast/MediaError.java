package com.google.android.gms.cast;

import G4.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i5.C1381b;
import org.json.JSONObject;
import s8.n;

/* loaded from: classes.dex */
public class MediaError extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new C1381b(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f14602a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14603b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14604c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14605d;

    /* renamed from: e, reason: collision with root package name */
    public String f14606e;

    /* renamed from: f, reason: collision with root package name */
    public final JSONObject f14607f;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.f14602a = str;
        this.f14603b = j;
        this.f14604c = num;
        this.f14605d = str2;
        this.f14607f = jSONObject;
    }

    public static MediaError f(JSONObject jSONObject) {
        Integer num;
        String optString = jSONObject.optString("type", "ERROR");
        long optLong = jSONObject.optLong("requestId");
        JSONObject jSONObject2 = null;
        if (jSONObject.has("detailedErrorCode")) {
            num = Integer.valueOf(jSONObject.optInt("detailedErrorCode"));
        } else {
            num = null;
        }
        String b9 = y4.a.b(jSONObject, "reason");
        if (jSONObject.has("customData")) {
            jSONObject2 = jSONObject.optJSONObject("customData");
        }
        return new MediaError(optString, optLong, num, b9, jSONObject2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        JSONObject jSONObject2 = this.f14607f;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f14606e = jSONObject;
        int R2 = n.R(parcel, 20293);
        n.M(parcel, 2, this.f14602a);
        n.V(parcel, 3, 8);
        parcel.writeLong(this.f14603b);
        Integer num = this.f14604c;
        if (num != null) {
            n.V(parcel, 4, 4);
            parcel.writeInt(num.intValue());
        }
        n.M(parcel, 5, this.f14605d);
        n.M(parcel, 6, this.f14606e);
        n.U(parcel, R2);
    }
}
