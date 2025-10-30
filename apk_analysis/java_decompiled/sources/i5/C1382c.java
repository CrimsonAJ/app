package i5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: i5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1382c implements Parcelable {
    public static final Parcelable.Creator<C1382c> CREATOR = new C1381b(0);

    /* renamed from: A, reason: collision with root package name */
    public Integer f18668A;

    /* renamed from: B, reason: collision with root package name */
    public Integer f18669B;

    /* renamed from: C, reason: collision with root package name */
    public Integer f18670C;

    /* renamed from: D, reason: collision with root package name */
    public Boolean f18671D;

    /* renamed from: a, reason: collision with root package name */
    public int f18672a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f18673b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f18674c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f18675d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f18676e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f18677f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f18678g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f18679h;
    public String j;

    /* renamed from: n, reason: collision with root package name */
    public Locale f18684n;

    /* renamed from: o, reason: collision with root package name */
    public String f18685o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f18686p;

    /* renamed from: q, reason: collision with root package name */
    public int f18687q;

    /* renamed from: r, reason: collision with root package name */
    public int f18688r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f18689s;

    /* renamed from: u, reason: collision with root package name */
    public Integer f18691u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f18692v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f18693w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f18694x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f18695y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f18696z;

    /* renamed from: i, reason: collision with root package name */
    public int f18680i = 255;

    /* renamed from: k, reason: collision with root package name */
    public int f18681k = -2;

    /* renamed from: l, reason: collision with root package name */
    public int f18682l = -2;

    /* renamed from: m, reason: collision with root package name */
    public int f18683m = -2;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f18690t = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String str;
        parcel.writeInt(this.f18672a);
        parcel.writeSerializable(this.f18673b);
        parcel.writeSerializable(this.f18674c);
        parcel.writeSerializable(this.f18675d);
        parcel.writeSerializable(this.f18676e);
        parcel.writeSerializable(this.f18677f);
        parcel.writeSerializable(this.f18678g);
        parcel.writeSerializable(this.f18679h);
        parcel.writeInt(this.f18680i);
        parcel.writeString(this.j);
        parcel.writeInt(this.f18681k);
        parcel.writeInt(this.f18682l);
        parcel.writeInt(this.f18683m);
        String str2 = this.f18685o;
        String str3 = null;
        if (str2 != null) {
            str = str2.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        CharSequence charSequence = this.f18686p;
        if (charSequence != null) {
            str3 = charSequence.toString();
        }
        parcel.writeString(str3);
        parcel.writeInt(this.f18687q);
        parcel.writeSerializable(this.f18689s);
        parcel.writeSerializable(this.f18691u);
        parcel.writeSerializable(this.f18692v);
        parcel.writeSerializable(this.f18693w);
        parcel.writeSerializable(this.f18694x);
        parcel.writeSerializable(this.f18695y);
        parcel.writeSerializable(this.f18696z);
        parcel.writeSerializable(this.f18670C);
        parcel.writeSerializable(this.f18668A);
        parcel.writeSerializable(this.f18669B);
        parcel.writeSerializable(this.f18690t);
        parcel.writeSerializable(this.f18684n);
        parcel.writeSerializable(this.f18671D);
    }
}
