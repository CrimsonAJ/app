package com.google.android.gms.cast;

import G4.a;
import K4.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i5.C1381b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s8.n;
import t4.C2011a;
import t4.C2012b;
import t4.k;
import t4.q;
import t4.r;

/* loaded from: classes.dex */
public class MediaInfo extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final String f14608a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14610c;

    /* renamed from: d, reason: collision with root package name */
    public final k f14611d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14612e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f14613f;

    /* renamed from: g, reason: collision with root package name */
    public final q f14614g;

    /* renamed from: h, reason: collision with root package name */
    public String f14615h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f14616i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14617k;

    /* renamed from: l, reason: collision with root package name */
    public final r f14618l;

    /* renamed from: m, reason: collision with root package name */
    public final long f14619m;

    /* renamed from: n, reason: collision with root package name */
    public final String f14620n;

    /* renamed from: o, reason: collision with root package name */
    public final String f14621o;

    /* renamed from: p, reason: collision with root package name */
    public final String f14622p;

    /* renamed from: q, reason: collision with root package name */
    public final String f14623q;

    /* renamed from: r, reason: collision with root package name */
    public final JSONObject f14624r;

    static {
        Pattern pattern = y4.a.f24915a;
        CREATOR = new C1381b(17);
    }

    public MediaInfo(String str, int i9, String str2, k kVar, long j, ArrayList arrayList, q qVar, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, r rVar, long j4, String str5, String str6, String str7, String str8) {
        this.f14608a = str;
        this.f14609b = i9;
        this.f14610c = str2;
        this.f14611d = kVar;
        this.f14612e = j;
        this.f14613f = arrayList;
        this.f14614g = qVar;
        this.f14615h = str3;
        if (str3 != null) {
            try {
                this.f14624r = new JSONObject(this.f14615h);
            } catch (JSONException unused) {
                this.f14624r = null;
                this.f14615h = null;
            }
        } else {
            this.f14624r = null;
        }
        this.f14616i = arrayList2;
        this.j = arrayList3;
        this.f14617k = str4;
        this.f14618l = rVar;
        this.f14619m = j4;
        this.f14620n = str5;
        this.f14621o = str6;
        this.f14622p = str7;
        this.f14623q = str8;
        if (this.f14608a == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this != obj) {
            if (obj instanceof MediaInfo) {
                MediaInfo mediaInfo = (MediaInfo) obj;
                JSONObject jSONObject = this.f14624r;
                if (jSONObject != null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                JSONObject jSONObject2 = mediaInfo.f14624r;
                if (jSONObject2 != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z9 == z10 && ((jSONObject == null || jSONObject2 == null || c.a(jSONObject, jSONObject2)) && y4.a.e(this.f14608a, mediaInfo.f14608a) && this.f14609b == mediaInfo.f14609b && y4.a.e(this.f14610c, mediaInfo.f14610c) && y4.a.e(this.f14611d, mediaInfo.f14611d) && this.f14612e == mediaInfo.f14612e && y4.a.e(this.f14613f, mediaInfo.f14613f) && y4.a.e(this.f14614g, mediaInfo.f14614g) && y4.a.e(this.f14616i, mediaInfo.f14616i) && y4.a.e(this.j, mediaInfo.j) && y4.a.e(this.f14617k, mediaInfo.f14617k) && y4.a.e(this.f14618l, mediaInfo.f14618l) && this.f14619m == mediaInfo.f14619m && y4.a.e(this.f14620n, mediaInfo.f14620n) && y4.a.e(this.f14621o, mediaInfo.f14621o) && y4.a.e(this.f14622p, mediaInfo.f14622p) && y4.a.e(this.f14623q, mediaInfo.f14623q))) {
                }
            }
            return false;
        }
        return true;
    }

    public final JSONObject f() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f14608a);
            jSONObject.putOpt("contentUrl", this.f14621o);
            int i9 = this.f14609b;
            if (i9 != 1) {
                if (i9 != 2) {
                    str = "NONE";
                } else {
                    str = "LIVE";
                }
            } else {
                str = "BUFFERED";
            }
            jSONObject.put("streamType", str);
            String str2 = this.f14610c;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            k kVar = this.f14611d;
            if (kVar != null) {
                jSONObject.put("metadata", kVar.k());
            }
            long j = this.f14612e;
            if (j <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                Pattern pattern = y4.a.f24915a;
                jSONObject.put("duration", j / 1000.0d);
            }
            ArrayList arrayList = this.f14613f;
            int i10 = 0;
            if (arrayList != null) {
                JSONArray jSONArray = new JSONArray();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    jSONArray.put(((MediaTrack) obj).f());
                }
                jSONObject.put("tracks", jSONArray);
            }
            q qVar = this.f14614g;
            if (qVar != null) {
                jSONObject.put("textTrackStyle", qVar.f());
            }
            JSONObject jSONObject2 = this.f14624r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str3 = this.f14617k;
            if (str3 != null) {
                jSONObject.put("entity", str3);
            }
            if (this.f14616i != null) {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList2 = this.f14616i;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    jSONArray2.put(((C2012b) obj2).f());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.j != null) {
                JSONArray jSONArray3 = new JSONArray();
                ArrayList arrayList3 = this.j;
                int size3 = arrayList3.size();
                while (i10 < size3) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    jSONArray3.put(((C2011a) obj3).f());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            r rVar = this.f14618l;
            if (rVar != null) {
                jSONObject.put("vmapAdsRequest", rVar.f());
            }
            long j4 = this.f14619m;
            if (j4 != -1) {
                Pattern pattern2 = y4.a.f24915a;
                jSONObject.put("startAbsoluteTime", j4 / 1000.0d);
            }
            jSONObject.putOpt("atvEntity", this.f14620n);
            String str4 = this.f14622p;
            if (str4 != null) {
                jSONObject.put("hlsSegmentFormat", str4);
            }
            String str5 = this.f14623q;
            if (str5 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str5);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9 A[LOOP:0: B:4:0x0024->B:11:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b2 A[LOOP:1: B:18:0x00e7->B:24:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(org.json.JSONObject r43) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.g(org.json.JSONObject):void");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14608a, Integer.valueOf(this.f14609b), this.f14610c, this.f14611d, Long.valueOf(this.f14612e), String.valueOf(this.f14624r), this.f14613f, this.f14614g, this.f14616i, this.j, this.f14617k, this.f14618l, Long.valueOf(this.f14619m), this.f14620n, this.f14622p, this.f14623q});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        List unmodifiableList;
        JSONObject jSONObject2 = this.f14624r;
        List list = null;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f14615h = jSONObject;
        int R2 = n.R(parcel, 20293);
        String str = this.f14608a;
        if (str == null) {
            str = "";
        }
        n.M(parcel, 2, str);
        n.V(parcel, 3, 4);
        parcel.writeInt(this.f14609b);
        n.M(parcel, 4, this.f14610c);
        n.L(parcel, 5, this.f14611d, i9);
        n.V(parcel, 6, 8);
        parcel.writeLong(this.f14612e);
        n.P(parcel, 7, this.f14613f);
        n.L(parcel, 8, this.f14614g, i9);
        n.M(parcel, 9, this.f14615h);
        ArrayList arrayList = this.f14616i;
        if (arrayList == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        n.P(parcel, 10, unmodifiableList);
        ArrayList arrayList2 = this.j;
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
        }
        n.P(parcel, 11, list);
        n.M(parcel, 12, this.f14617k);
        n.L(parcel, 13, this.f14618l, i9);
        n.V(parcel, 14, 8);
        parcel.writeLong(this.f14619m);
        n.M(parcel, 15, this.f14620n);
        n.M(parcel, 16, this.f14621o);
        n.M(parcel, 17, this.f14622p);
        n.M(parcel, 18, this.f14623q);
        n.U(parcel, R2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaInfo(org.json.JSONObject r47) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.<init>(org.json.JSONObject):void");
    }
}
