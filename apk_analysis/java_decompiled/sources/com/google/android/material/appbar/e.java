package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends U.b {
    public static final Parcelable.Creator<e> CREATOR = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f15798c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15799d;

    /* renamed from: e, reason: collision with root package name */
    public int f15800e;

    /* renamed from: f, reason: collision with root package name */
    public float f15801f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15802g;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z9;
        boolean z10;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f15798c = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15799d = z10;
        this.f15800e = parcel.readInt();
        this.f15801f = parcel.readFloat();
        this.f15802g = parcel.readByte() != 0;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeByte(this.f15798c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15799d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f15800e);
        parcel.writeFloat(this.f15801f);
        parcel.writeByte(this.f15802g ? (byte) 1 : (byte) 0);
    }
}
