package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class F implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14713a;

    public /* synthetic */ F(int i9) {
        this.f14713a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14713a) {
            case 0:
                int f02 = s8.e.f0(parcel);
                String str = null;
                byte[] bArr = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < f02) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                s8.e.e0(parcel, readInt);
                            } else {
                                arrayList = s8.e.l(parcel, readInt);
                            }
                        } else {
                            bArr = s8.e.j(parcel, readInt);
                        }
                    } else {
                        str = s8.e.o(parcel, readInt);
                    }
                }
                s8.e.w(parcel, f02);
                return new G(str, bArr, arrayList);
            case 1:
                int f03 = s8.e.f0(parcel);
                boolean z9 = false;
                ArrayList arrayList2 = null;
                boolean z10 = false;
                while (parcel.dataPosition() < f03) {
                    int readInt2 = parcel.readInt();
                    char c9 = (char) readInt2;
                    if (c9 != 1) {
                        if (c9 != 2) {
                            if (c9 != 3) {
                                s8.e.e0(parcel, readInt2);
                            } else {
                                z10 = s8.e.P(parcel, readInt2);
                            }
                        } else {
                            z9 = s8.e.P(parcel, readInt2);
                        }
                    } else {
                        arrayList2 = s8.e.s(parcel, readInt2, G.CREATOR);
                    }
                }
                s8.e.w(parcel, f03);
                return new H(arrayList2, z9, z10);
            case 2:
                int f04 = s8.e.f0(parcel);
                boolean z11 = false;
                int i9 = 0;
                while (parcel.dataPosition() < f04) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            s8.e.e0(parcel, readInt3);
                        } else {
                            i9 = s8.e.T(parcel, readInt3);
                        }
                    } else {
                        z11 = s8.e.P(parcel, readInt3);
                    }
                }
                s8.e.w(parcel, f04);
                return new I(i9, z11);
            case 3:
                int f05 = s8.e.f0(parcel);
                boolean z12 = false;
                boolean z13 = false;
                int i10 = 0;
                while (parcel.dataPosition() < f05) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                s8.e.e0(parcel, readInt4);
                            } else {
                                i10 = s8.e.T(parcel, readInt4);
                            }
                        } else {
                            z13 = s8.e.P(parcel, readInt4);
                        }
                    } else {
                        z12 = s8.e.P(parcel, readInt4);
                    }
                }
                s8.e.w(parcel, f05);
                return new N(i10, z12, z13);
            default:
                int f06 = s8.e.f0(parcel);
                int i11 = 0;
                boolean z14 = false;
                int i12 = 0;
                boolean z15 = false;
                ArrayList arrayList3 = null;
                String str2 = null;
                while (parcel.dataPosition() < f06) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            i11 = s8.e.T(parcel, readInt5);
                            break;
                        case 3:
                            z14 = s8.e.P(parcel, readInt5);
                            break;
                        case 4:
                            arrayList3 = s8.e.p(parcel, readInt5);
                            break;
                        case 5:
                            i12 = s8.e.T(parcel, readInt5);
                            break;
                        case 6:
                            str2 = s8.e.o(parcel, readInt5);
                            break;
                        case 7:
                            z15 = s8.e.P(parcel, readInt5);
                            break;
                        default:
                            s8.e.e0(parcel, readInt5);
                            break;
                    }
                }
                s8.e.w(parcel, f06);
                return new P(i11, z14, arrayList3, i12, str2, z15);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.f14713a) {
            case 0:
                return new G[i9];
            case 1:
                return new H[i9];
            case 2:
                return new I[i9];
            case 3:
                return new N[i9];
            default:
                return new P[i9];
        }
    }
}
