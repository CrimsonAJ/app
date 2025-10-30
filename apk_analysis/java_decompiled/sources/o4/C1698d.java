package o4;

import F0.C0099c0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import i5.C1381b;

/* renamed from: o4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1698d extends C0099c0 implements InterfaceC1695a {
    public static final Parcelable.Creator<C1698d> CREATOR = new C1381b(3);

    /* renamed from: e, reason: collision with root package name */
    public float f21618e;

    /* renamed from: f, reason: collision with root package name */
    public float f21619f;

    /* renamed from: g, reason: collision with root package name */
    public int f21620g;

    /* renamed from: h, reason: collision with root package name */
    public float f21621h;

    /* renamed from: i, reason: collision with root package name */
    public int f21622i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f21623k;

    /* renamed from: l, reason: collision with root package name */
    public int f21624l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21625m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeFloat(this.f21618e);
        parcel.writeFloat(this.f21619f);
        parcel.writeInt(this.f21620g);
        parcel.writeFloat(this.f21621h);
        parcel.writeInt(this.f21622i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.f21623k);
        parcel.writeInt(this.f21624l);
        parcel.writeByte(this.f21625m ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
