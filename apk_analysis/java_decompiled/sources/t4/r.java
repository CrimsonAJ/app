package t4;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r extends G4.a {
    public static final Parcelable.Creator<r> CREATOR = new C1381b(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f23259a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23260b;

    public r(String str, String str2) {
        this.f23259a = str;
        this.f23260b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (y4.a.e(this.f23259a, rVar.f23259a) && y4.a.e(this.f23260b, rVar.f23260b)) {
            return true;
        }
        return false;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f23259a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f23260b;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23259a, this.f23260b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 2, this.f23259a);
        s8.n.M(parcel, 3, this.f23260b);
        s8.n.U(parcel, R2);
    }
}
