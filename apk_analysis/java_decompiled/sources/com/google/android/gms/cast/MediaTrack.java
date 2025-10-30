package com.google.android.gms.cast;

import G4.a;
import K4.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i5.C1381b;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s8.n;

/* loaded from: classes.dex */
public final class MediaTrack extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new C1381b(25);

    /* renamed from: a, reason: collision with root package name */
    public final long f14625a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14626b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14627c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14628d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14629e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14630f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14631g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractCollection f14632h;

    /* renamed from: i, reason: collision with root package name */
    public String f14633i;
    public final JSONObject j;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaTrack(long j, int i9, String str, String str2, String str3, String str4, int i10, List list, JSONObject jSONObject) {
        this.f14625a = j;
        this.f14626b = i9;
        this.f14627c = str;
        this.f14628d = str2;
        this.f14629e = str3;
        this.f14630f = str4;
        this.f14631g = i10;
        this.f14632h = (AbstractCollection) list;
        this.j = jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this != obj) {
            if (obj instanceof MediaTrack) {
                MediaTrack mediaTrack = (MediaTrack) obj;
                JSONObject jSONObject = this.j;
                if (jSONObject != null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                JSONObject jSONObject2 = mediaTrack.j;
                if (jSONObject2 != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z9 == z10 && ((jSONObject == null || jSONObject2 == null || c.a(jSONObject, jSONObject2)) && this.f14625a == mediaTrack.f14625a && this.f14626b == mediaTrack.f14626b && y4.a.e(this.f14627c, mediaTrack.f14627c) && y4.a.e(this.f14628d, mediaTrack.f14628d) && y4.a.e(this.f14629e, mediaTrack.f14629e) && y4.a.e(this.f14630f, mediaTrack.f14630f) && this.f14631g == mediaTrack.f14631g && y4.a.e(this.f14632h, mediaTrack.f14632h))) {
                }
            }
            return false;
        }
        return true;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.f14625a);
            int i9 = this.f14626b;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        jSONObject.put("type", "VIDEO");
                    }
                } else {
                    jSONObject.put("type", "AUDIO");
                }
            } else {
                jSONObject.put("type", "TEXT");
            }
            String str = this.f14627c;
            if (str != null) {
                jSONObject.put("trackContentId", str);
            }
            String str2 = this.f14628d;
            if (str2 != null) {
                jSONObject.put("trackContentType", str2);
            }
            String str3 = this.f14629e;
            if (str3 != null) {
                jSONObject.put("name", str3);
            }
            String str4 = this.f14630f;
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("language", str4);
            }
            int i10 = this.f14631g;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                jSONObject.put("subtype", "METADATA");
                            }
                        } else {
                            jSONObject.put("subtype", "CHAPTERS");
                        }
                    } else {
                        jSONObject.put("subtype", "DESCRIPTIONS");
                    }
                } else {
                    jSONObject.put("subtype", "CAPTIONS");
                }
            } else {
                jSONObject.put("subtype", "SUBTITLES");
            }
            AbstractCollection abstractCollection = this.f14632h;
            if (abstractCollection != null) {
                jSONObject.put("roles", new JSONArray((Collection) abstractCollection));
            }
            JSONObject jSONObject2 = this.j;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        Long valueOf = Long.valueOf(this.f14625a);
        Integer valueOf2 = Integer.valueOf(this.f14626b);
        Integer valueOf3 = Integer.valueOf(this.f14631g);
        String valueOf4 = String.valueOf(this.j);
        return Arrays.hashCode(new Object[]{valueOf, valueOf2, this.f14627c, this.f14628d, this.f14629e, this.f14630f, valueOf3, this.f14632h, valueOf4});
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.AbstractCollection, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        JSONObject jSONObject2 = this.j;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f14633i = jSONObject;
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 2, 8);
        parcel.writeLong(this.f14625a);
        n.V(parcel, 3, 4);
        parcel.writeInt(this.f14626b);
        n.M(parcel, 4, this.f14627c);
        n.M(parcel, 5, this.f14628d);
        n.M(parcel, 6, this.f14629e);
        n.M(parcel, 7, this.f14630f);
        n.V(parcel, 8, 4);
        parcel.writeInt(this.f14631g);
        n.N(parcel, 9, this.f14632h);
        n.M(parcel, 10, this.f14633i);
        n.U(parcel, R2);
    }
}
