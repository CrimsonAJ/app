package B;

import F0.k0;
import K5.D;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import co.notix.R;
import d1.m;
import i0.C1365u;
import n5.C1654b;
import p.C1776W0;
import w5.C2142b;

/* loaded from: classes.dex */
public final class h implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f583a;

    public /* synthetic */ h(int i9) {
        this.f583a = i9;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View$BaseSavedState, d1.m, java.lang.Object] */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f583a) {
            case 0:
                return new i(parcel, classLoader);
            case 1:
                return new k0(parcel, classLoader);
            case 2:
                return new G5.e(parcel, classLoader);
            case 3:
                return new D(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return U.b.f7245b;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new m(parcel, classLoader);
                }
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f16711a = parcel.readInt();
                baseSavedState.f16712b = parcel.readInt();
                baseSavedState.f16713c = parcel.readParcelable(null);
                return baseSavedState;
            case 6:
                return new C1365u(parcel, classLoader);
            case 7:
                return new m5.b(parcel, classLoader);
            case 8:
                return new C1654b(parcel, classLoader);
            case 9:
                return new C1776W0(parcel, classLoader);
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new C2142b(parcel, classLoader);
            case R.styleable.GradientColor_android_endY /* 11 */:
                return new w5.i(parcel, classLoader);
            default:
                return new z5.j(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f583a) {
            case 0:
                return new i[i9];
            case 1:
                return new k0[i9];
            case 2:
                return new G5.e[i9];
            case 3:
                return new D[i9];
            case 4:
                return new U.b[i9];
            case 5:
                return new m[i9];
            case 6:
                return new C1365u[i9];
            case 7:
                return new m5.b[i9];
            case 8:
                return new C1654b[i9];
            case 9:
                return new C1776W0[i9];
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new C2142b[i9];
            case R.styleable.GradientColor_android_endY /* 11 */:
                return new w5.i[i9];
            default:
                return new z5.j[i9];
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View$BaseSavedState, d1.m, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f583a) {
            case 0:
                return new i(parcel, null);
            case 1:
                return new k0(parcel, null);
            case 2:
                return new G5.e(parcel, null);
            case 3:
                return new D(parcel, null);
            case 4:
                if (parcel.readParcelable(null) == null) {
                    return U.b.f7245b;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new m(parcel, null);
                }
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f16711a = parcel.readInt();
                baseSavedState.f16712b = parcel.readInt();
                baseSavedState.f16713c = parcel.readParcelable(null);
                return baseSavedState;
            case 6:
                return new C1365u(parcel, null);
            case 7:
                return new m5.b(parcel, null);
            case 8:
                return new C1654b(parcel, null);
            case 9:
                return new C1776W0(parcel, null);
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new C2142b(parcel, null);
            case R.styleable.GradientColor_android_endY /* 11 */:
                return new w5.i(parcel, null);
            default:
                return new z5.j(parcel, null);
        }
    }
}
