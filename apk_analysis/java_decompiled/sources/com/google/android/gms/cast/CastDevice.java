package com.google.android.gms.cast;

import G4.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import e1.q;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import s8.n;
import t4.C2010B;
import y4.d;

/* loaded from: classes.dex */
public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new C2010B(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f14583a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14584b;

    /* renamed from: c, reason: collision with root package name */
    public final InetAddress f14585c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14586d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14587e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14588f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14589g;

    /* renamed from: h, reason: collision with root package name */
    public final List f14590h;

    /* renamed from: i, reason: collision with root package name */
    public final q f14591i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14592k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14593l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14594m;

    /* renamed from: n, reason: collision with root package name */
    public final String f14595n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f14596o;

    /* renamed from: p, reason: collision with root package name */
    public final String f14597p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f14598q;

    /* renamed from: r, reason: collision with root package name */
    public final d f14599r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f14600s;

    /* renamed from: t, reason: collision with root package name */
    public final Boolean f14601t;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i9, ArrayList arrayList, int i10, int i11, String str6, String str7, int i12, String str8, byte[] bArr, String str9, boolean z9, d dVar, Integer num, Boolean bool) {
        this.f14583a = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f14584b = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f14585c = InetAddress.getByName(str2);
            } catch (UnknownHostException e8) {
                Log.i("CastDevice", "Unable to convert host address (" + this.f14584b + ") to ipaddress: " + e8.getMessage());
            }
        }
        this.f14586d = str3 == null ? "" : str3;
        this.f14587e = str4 == null ? "" : str4;
        this.f14588f = str5 == null ? "" : str5;
        this.f14589g = i9;
        this.f14590h = arrayList == null ? new ArrayList() : arrayList;
        this.j = i11;
        this.f14592k = str6 == null ? "" : str6;
        this.f14593l = str7;
        this.f14594m = i12;
        this.f14595n = str8;
        this.f14596o = bArr;
        this.f14597p = str9;
        this.f14598q = z9;
        this.f14599r = dVar;
        this.f14600s = num;
        this.f14601t = bool;
        this.f14591i = new q(i10);
    }

    public static CastDevice g(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle != null && (classLoader = CastDevice.class.getClassLoader()) != null) {
            bundle.setClassLoader(classLoader);
            return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
        }
        return null;
    }

    public final boolean equals(Object obj) {
        int i9;
        int i10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.f14583a;
        if (str == null) {
            if (castDevice.f14583a == null) {
                return true;
            }
            return false;
        }
        if (y4.a.e(str, castDevice.f14583a) && y4.a.e(this.f14585c, castDevice.f14585c) && y4.a.e(this.f14587e, castDevice.f14587e) && y4.a.e(this.f14586d, castDevice.f14586d)) {
            String str2 = this.f14588f;
            String str3 = castDevice.f14588f;
            if (y4.a.e(str2, str3) && (i10 = this.f14589g) == (i9 = castDevice.f14589g) && y4.a.e(this.f14590h, castDevice.f14590h) && this.f14591i.f17061a == castDevice.f14591i.f17061a && this.j == castDevice.j && y4.a.e(this.f14592k, castDevice.f14592k) && y4.a.e(Integer.valueOf(this.f14594m), Integer.valueOf(castDevice.f14594m)) && y4.a.e(this.f14595n, castDevice.f14595n) && y4.a.e(this.f14593l, castDevice.f14593l) && y4.a.e(str2, str3) && i10 == i9) {
                byte[] bArr = castDevice.f14596o;
                byte[] bArr2 = this.f14596o;
                if (((bArr2 == null && bArr == null) || Arrays.equals(bArr2, bArr)) && y4.a.e(this.f14597p, castDevice.f14597p) && this.f14598q == castDevice.f14598q && y4.a.e(k(), castDevice.k()) && y4.a.e(Boolean.valueOf(o()), Boolean.valueOf(castDevice.o()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        String str = this.f14583a;
        if (str.startsWith("__cast_nearby__")) {
            return str.substring(16);
        }
        return str;
    }

    public final int hashCode() {
        String str = this.f14583a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final int i() {
        q qVar = this.f14591i;
        if (!qVar.l(64)) {
            if (!qVar.m()) {
                if (qVar.n()) {
                    return 5;
                }
                if (!qVar.l(1)) {
                    return 1;
                }
                return 2;
            }
            return 3;
        }
        return 4;
    }

    public final d k() {
        d dVar = this.f14599r;
        if (dVar == null && this.f14591i.n()) {
            return new d(1, false, false, null, null, null, null, null, false);
        }
        return dVar;
    }

    public final boolean o() {
        Boolean bool = this.f14601t;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i9 = this.j;
        if (i9 != -1 && (i9 & 2) > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        q qVar = this.f14591i;
        if (qVar.l(64)) {
            str = "[dynamic group]";
        } else if (qVar.m()) {
            str = "[static group]";
        } else if (qVar.n()) {
            str = "[speaker pair]";
        } else {
            str = "";
        }
        if (qVar.l(262144)) {
            str = str.concat("[cast connect]");
        }
        Locale locale = Locale.ROOT;
        Pattern pattern = y4.a.f24915a;
        String str2 = this.f14586d;
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            if (length <= 2) {
                if (length == 2) {
                    str2 = "xx";
                } else {
                    str2 = "x";
                }
            } else {
                str2 = String.format(locale, "%c%d%c", Character.valueOf(str2.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str2.charAt(length - 1)));
            }
        }
        StringBuilder r5 = AbstractC0953k1.r("\"", str2, "\" (");
        r5.append(this.f14583a);
        r5.append(") ");
        r5.append(str);
        return r5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.M(parcel, 2, this.f14583a);
        n.M(parcel, 3, this.f14584b);
        n.M(parcel, 4, this.f14586d);
        n.M(parcel, 5, this.f14587e);
        n.M(parcel, 6, this.f14588f);
        n.V(parcel, 7, 4);
        parcel.writeInt(this.f14589g);
        n.P(parcel, 8, Collections.unmodifiableList(this.f14590h));
        int i10 = this.f14591i.f17061a;
        n.V(parcel, 9, 4);
        parcel.writeInt(i10);
        n.V(parcel, 10, 4);
        parcel.writeInt(this.j);
        n.M(parcel, 11, this.f14592k);
        n.M(parcel, 12, this.f14593l);
        n.V(parcel, 13, 4);
        parcel.writeInt(this.f14594m);
        n.M(parcel, 14, this.f14595n);
        n.G(parcel, 15, this.f14596o);
        n.M(parcel, 16, this.f14597p);
        n.V(parcel, 17, 4);
        parcel.writeInt(this.f14598q ? 1 : 0);
        n.L(parcel, 18, k(), i9);
        Integer num = this.f14600s;
        if (num != null) {
            n.V(parcel, 19, 4);
            parcel.writeInt(num.intValue());
        }
        n.E(parcel, 20, Boolean.valueOf(o()));
        n.U(parcel, R2);
    }
}
