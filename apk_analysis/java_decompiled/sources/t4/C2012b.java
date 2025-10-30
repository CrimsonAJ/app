package t4;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2012b extends G4.a {
    public static final Parcelable.Creator<C2012b> CREATOR = new C1381b(14);

    /* renamed from: a, reason: collision with root package name */
    public final long f23157a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23158b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23159c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23160d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f23161e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23162f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23163g;

    public C2012b(long j, String str, long j4, boolean z9, String[] strArr, boolean z10, boolean z11) {
        this.f23157a = j;
        this.f23158b = str;
        this.f23159c = j4;
        this.f23160d = z9;
        this.f23161e = strArr;
        this.f23162f = z10;
        this.f23163g = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2012b)) {
            return false;
        }
        C2012b c2012b = (C2012b) obj;
        if (y4.a.e(this.f23158b, c2012b.f23158b) && this.f23157a == c2012b.f23157a && this.f23159c == c2012b.f23159c && this.f23160d == c2012b.f23160d && Arrays.equals(this.f23161e, c2012b.f23161e) && this.f23162f == c2012b.f23162f && this.f23163g == c2012b.f23163g) {
            return true;
        }
        return false;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f23158b);
            long j = this.f23157a;
            Pattern pattern = y4.a.f24915a;
            jSONObject.put("position", j / 1000.0d);
            jSONObject.put("isWatched", this.f23160d);
            jSONObject.put("isEmbedded", this.f23162f);
            jSONObject.put("duration", this.f23159c / 1000.0d);
            jSONObject.put("expanded", this.f23163g);
            String[] strArr = this.f23161e;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return this.f23158b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 8);
        parcel.writeLong(this.f23157a);
        s8.n.M(parcel, 3, this.f23158b);
        s8.n.V(parcel, 4, 8);
        parcel.writeLong(this.f23159c);
        s8.n.V(parcel, 5, 4);
        parcel.writeInt(this.f23160d ? 1 : 0);
        String[] strArr = this.f23161e;
        if (strArr != null) {
            int R8 = s8.n.R(parcel, 6);
            parcel.writeStringArray(strArr);
            s8.n.U(parcel, R8);
        }
        s8.n.V(parcel, 7, 4);
        parcel.writeInt(this.f23162f ? 1 : 0);
        s8.n.V(parcel, 8, 4);
        parcel.writeInt(this.f23163g ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
