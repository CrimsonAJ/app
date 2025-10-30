package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class V implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15318a;

    public /* synthetic */ V(int i9) {
        this.f15318a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f15318a) {
            case 0:
                int f02 = s8.e.f0(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                Bundle bundle = null;
                String str4 = null;
                boolean z9 = false;
                long j = 0;
                long j4 = 0;
                while (parcel.dataPosition() < f02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            j = s8.e.U(parcel, readInt);
                            break;
                        case 2:
                            j4 = s8.e.U(parcel, readInt);
                            break;
                        case 3:
                            z9 = s8.e.P(parcel, readInt);
                            break;
                        case 4:
                            str = s8.e.o(parcel, readInt);
                            break;
                        case 5:
                            str2 = s8.e.o(parcel, readInt);
                            break;
                        case 6:
                            str3 = s8.e.o(parcel, readInt);
                            break;
                        case 7:
                            bundle = s8.e.i(parcel, readInt);
                            break;
                        case '\b':
                            str4 = s8.e.o(parcel, readInt);
                            break;
                        default:
                            s8.e.e0(parcel, readInt);
                            break;
                    }
                }
                s8.e.w(parcel, f02);
                return new U(j, j4, z9, str, str2, str3, bundle, str4);
            default:
                int f03 = s8.e.f0(parcel);
                String str5 = null;
                int i9 = 0;
                Intent intent = null;
                while (parcel.dataPosition() < f03) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                s8.e.e0(parcel, readInt2);
                            } else {
                                intent = (Intent) s8.e.n(parcel, readInt2, Intent.CREATOR);
                            }
                        } else {
                            str5 = s8.e.o(parcel, readInt2);
                        }
                    } else {
                        i9 = s8.e.T(parcel, readInt2);
                    }
                }
                s8.e.w(parcel, f03);
                return new W(i9, str5, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.f15318a) {
            case 0:
                return new U[i9];
            default:
                return new W[i9];
        }
    }
}
