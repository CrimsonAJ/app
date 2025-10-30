package t4;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q extends G4.a {
    public static final Parcelable.Creator<q> CREATOR = new C1381b(27);

    /* renamed from: a, reason: collision with root package name */
    public float f23247a;

    /* renamed from: b, reason: collision with root package name */
    public int f23248b;

    /* renamed from: c, reason: collision with root package name */
    public int f23249c;

    /* renamed from: d, reason: collision with root package name */
    public int f23250d;

    /* renamed from: e, reason: collision with root package name */
    public int f23251e;

    /* renamed from: f, reason: collision with root package name */
    public int f23252f;

    /* renamed from: g, reason: collision with root package name */
    public int f23253g;

    /* renamed from: h, reason: collision with root package name */
    public int f23254h;

    /* renamed from: i, reason: collision with root package name */
    public String f23255i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f23256k;

    /* renamed from: l, reason: collision with root package name */
    public String f23257l;

    /* renamed from: m, reason: collision with root package name */
    public JSONObject f23258m;

    public q(float f9, int i9, int i10, int i11, int i12, int i13, int i14, int i15, String str, int i16, int i17, String str2) {
        this.f23247a = f9;
        this.f23248b = i9;
        this.f23249c = i10;
        this.f23250d = i11;
        this.f23251e = i12;
        this.f23252f = i13;
        this.f23253g = i14;
        this.f23254h = i15;
        this.f23255i = str;
        this.j = i16;
        this.f23256k = i17;
        this.f23257l = str2;
        if (str2 != null) {
            try {
                this.f23258m = new JSONObject(this.f23257l);
                return;
            } catch (JSONException unused) {
                this.f23258m = null;
                this.f23257l = null;
                return;
            }
        }
        this.f23258m = null;
    }

    public static final int g(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String i(int i9) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i9)), Integer.valueOf(Color.green(i9)), Integer.valueOf(Color.blue(i9)), Integer.valueOf(Color.alpha(i9)));
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        JSONObject jSONObject = this.f23258m;
        if (jSONObject != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        JSONObject jSONObject2 = qVar.f23258m;
        if (jSONObject2 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 != z10) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || K4.c.a(jSONObject, jSONObject2)) && this.f23247a == qVar.f23247a && this.f23248b == qVar.f23248b && this.f23249c == qVar.f23249c && this.f23250d == qVar.f23250d && this.f23251e == qVar.f23251e && this.f23252f == qVar.f23252f && this.f23253g == qVar.f23253g && this.f23254h == qVar.f23254h && y4.a.e(this.f23255i, qVar.f23255i) && this.j == qVar.j && this.f23256k == qVar.f23256k) {
            return true;
        }
        return false;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.f23247a);
            int i9 = this.f23248b;
            if (i9 != 0) {
                jSONObject.put("foregroundColor", i(i9));
            }
            int i10 = this.f23249c;
            if (i10 != 0) {
                jSONObject.put("backgroundColor", i(i10));
            }
            int i11 = this.f23250d;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                jSONObject.put("edgeType", "DEPRESSED");
                            }
                        } else {
                            jSONObject.put("edgeType", "RAISED");
                        }
                    } else {
                        jSONObject.put("edgeType", "DROP_SHADOW");
                    }
                } else {
                    jSONObject.put("edgeType", "OUTLINE");
                }
            } else {
                jSONObject.put("edgeType", "NONE");
            }
            int i12 = this.f23251e;
            if (i12 != 0) {
                jSONObject.put("edgeColor", i(i12));
            }
            int i13 = this.f23252f;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        jSONObject.put("windowType", "ROUNDED_CORNERS");
                    }
                } else {
                    jSONObject.put("windowType", "NORMAL");
                }
            } else {
                jSONObject.put("windowType", "NONE");
            }
            int i14 = this.f23253g;
            if (i14 != 0) {
                jSONObject.put("windowColor", i(i14));
            }
            if (this.f23252f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f23254h);
            }
            String str = this.f23255i;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.j) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i15 = this.f23256k;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            jSONObject.put("fontStyle", "BOLD_ITALIC");
                        }
                    } else {
                        jSONObject.put("fontStyle", "ITALIC");
                    }
                } else {
                    jSONObject.put("fontStyle", "BOLD");
                }
            } else {
                jSONObject.put("fontStyle", "NORMAL");
            }
            JSONObject jSONObject2 = this.f23258m;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23247a), Integer.valueOf(this.f23248b), Integer.valueOf(this.f23249c), Integer.valueOf(this.f23250d), Integer.valueOf(this.f23251e), Integer.valueOf(this.f23252f), Integer.valueOf(this.f23253g), Integer.valueOf(this.f23254h), this.f23255i, Integer.valueOf(this.j), Integer.valueOf(this.f23256k), String.valueOf(this.f23258m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        JSONObject jSONObject2 = this.f23258m;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f23257l = jSONObject;
        int R2 = s8.n.R(parcel, 20293);
        float f9 = this.f23247a;
        s8.n.V(parcel, 2, 4);
        parcel.writeFloat(f9);
        int i10 = this.f23248b;
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(i10);
        int i11 = this.f23249c;
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(i11);
        int i12 = this.f23250d;
        s8.n.V(parcel, 5, 4);
        parcel.writeInt(i12);
        int i13 = this.f23251e;
        s8.n.V(parcel, 6, 4);
        parcel.writeInt(i13);
        int i14 = this.f23252f;
        s8.n.V(parcel, 7, 4);
        parcel.writeInt(i14);
        int i15 = this.f23253g;
        s8.n.V(parcel, 8, 4);
        parcel.writeInt(i15);
        int i16 = this.f23254h;
        s8.n.V(parcel, 9, 4);
        parcel.writeInt(i16);
        s8.n.M(parcel, 10, this.f23255i);
        int i17 = this.j;
        s8.n.V(parcel, 11, 4);
        parcel.writeInt(i17);
        int i18 = this.f23256k;
        s8.n.V(parcel, 12, 4);
        parcel.writeInt(i18);
        s8.n.M(parcel, 13, this.f23257l);
        s8.n.U(parcel, R2);
    }
}
