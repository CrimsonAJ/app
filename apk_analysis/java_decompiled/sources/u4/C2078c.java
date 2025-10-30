package u4;

import a.AbstractC0485a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import t4.C2010B;
import v4.C2108a;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2078c extends G4.a {
    public static final Parcelable.Creator<C2078c> CREATOR;

    /* renamed from: s, reason: collision with root package name */
    public static final C2075A f23655s = new C2075A(false);

    /* renamed from: t, reason: collision with root package name */
    public static final B f23656t = new B(0);

    /* renamed from: u, reason: collision with root package name */
    public static final C2108a f23657u;

    /* renamed from: a, reason: collision with root package name */
    public final String f23658a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23659b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23660c;

    /* renamed from: d, reason: collision with root package name */
    public final t4.i f23661d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23662e;

    /* renamed from: f, reason: collision with root package name */
    public final C2108a f23663f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23664g;

    /* renamed from: h, reason: collision with root package name */
    public final double f23665h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f23666i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f23667k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f23668l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f23669m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f23670n;

    /* renamed from: o, reason: collision with root package name */
    public final C2075A f23671o;

    /* renamed from: p, reason: collision with root package name */
    public B f23672p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f23673q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f23674r;

    static {
        new v4.f(v4.f.f23812g0, v4.f.f23813h0, 10000L, null, AbstractC0485a.B("smallIconDrawableResId"), AbstractC0485a.B("stopLiveStreamDrawableResId"), AbstractC0485a.B("pauseDrawableResId"), AbstractC0485a.B("playDrawableResId"), AbstractC0485a.B("skipNextDrawableResId"), AbstractC0485a.B("skipPrevDrawableResId"), AbstractC0485a.B("forwardDrawableResId"), AbstractC0485a.B("forward10DrawableResId"), AbstractC0485a.B("forward30DrawableResId"), AbstractC0485a.B("rewindDrawableResId"), AbstractC0485a.B("rewind10DrawableResId"), AbstractC0485a.B("rewind30DrawableResId"), AbstractC0485a.B("disconnectDrawableResId"), AbstractC0485a.B("notificationImageSizeDimenResId"), AbstractC0485a.B("castingToDeviceStringResId"), AbstractC0485a.B("stopLiveStreamStringResId"), AbstractC0485a.B("pauseStringResId"), AbstractC0485a.B("playStringResId"), AbstractC0485a.B("skipNextStringResId"), AbstractC0485a.B("skipPrevStringResId"), AbstractC0485a.B("forwardStringResId"), AbstractC0485a.B("forward10StringResId"), AbstractC0485a.B("forward30StringResId"), AbstractC0485a.B("rewindStringResId"), AbstractC0485a.B("rewind10StringResId"), AbstractC0485a.B("rewind30StringResId"), AbstractC0485a.B("disconnectStringResId"), null, false, false);
        f23657u = new C2108a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new C2010B(4);
    }

    public C2078c(String str, ArrayList arrayList, boolean z9, t4.i iVar, boolean z10, C2108a c2108a, boolean z11, double d9, boolean z12, boolean z13, boolean z14, ArrayList arrayList2, boolean z15, boolean z16, C2075A c2075a, B b9, boolean z17, boolean z18) {
        this.f23658a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.f23659b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f23660c = z9;
        this.f23661d = iVar == null ? new t4.i() : iVar;
        this.f23662e = z10;
        this.f23663f = c2108a;
        this.f23664g = z11;
        this.f23665h = d9;
        this.f23666i = z12;
        this.j = z13;
        this.f23667k = z14;
        this.f23668l = arrayList2;
        this.f23669m = z15;
        this.f23670n = z16;
        this.f23671o = c2075a;
        this.f23672p = b9;
        this.f23673q = z17;
        this.f23674r = z18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 2, this.f23658a);
        s8.n.N(parcel, 3, Collections.unmodifiableList(this.f23659b));
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f23660c ? 1 : 0);
        s8.n.L(parcel, 5, this.f23661d, i9);
        s8.n.V(parcel, 6, 4);
        parcel.writeInt(this.f23662e ? 1 : 0);
        s8.n.L(parcel, 7, this.f23663f, i9);
        s8.n.V(parcel, 8, 4);
        parcel.writeInt(this.f23664g ? 1 : 0);
        s8.n.V(parcel, 9, 8);
        parcel.writeDouble(this.f23665h);
        s8.n.V(parcel, 10, 4);
        parcel.writeInt(this.f23666i ? 1 : 0);
        s8.n.V(parcel, 11, 4);
        parcel.writeInt(this.j ? 1 : 0);
        s8.n.V(parcel, 12, 4);
        parcel.writeInt(this.f23667k ? 1 : 0);
        s8.n.N(parcel, 13, Collections.unmodifiableList(this.f23668l));
        s8.n.V(parcel, 14, 4);
        parcel.writeInt(this.f23669m ? 1 : 0);
        s8.n.V(parcel, 15, 4);
        parcel.writeInt(0);
        s8.n.V(parcel, 16, 4);
        parcel.writeInt(this.f23670n ? 1 : 0);
        s8.n.L(parcel, 17, this.f23671o, i9);
        s8.n.L(parcel, 18, this.f23672p, i9);
        s8.n.V(parcel, 19, 4);
        parcel.writeInt(this.f23673q ? 1 : 0);
        s8.n.V(parcel, 20, 4);
        parcel.writeInt(this.f23674r ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
