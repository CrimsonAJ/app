package H3;

import I3.e;
import I3.f;
import I3.k;
import I3.l;
import I3.m;
import I3.n;
import I3.o;
import K3.i;
import K3.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import co.notix.R;
import java.util.ArrayList;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3098a;

    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View$BaseSavedState, java.lang.Object, S.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$BaseSavedState, H5.c, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3098a) {
            case 0:
                return new c(parcel);
            case 1:
                return new d(parcel);
            case 2:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f3114a = parcel.readFloat();
                baseSavedState.f3115b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                baseSavedState.f3116c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                baseSavedState.f3117d = parcel.readFloat();
                baseSavedState.f3118e = parcel.createBooleanArray()[0];
                return baseSavedState;
            case 3:
                h.e(parcel, "parcel");
                return new I2.c(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new I3.a(parcel);
            case 5:
                return new I3.b(parcel);
            case 6:
                return new I3.c(parcel);
            case 7:
                return new I3.d(parcel);
            case 8:
                return new e(parcel);
            case 9:
                return new f(parcel);
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new k(parcel);
            case R.styleable.GradientColor_android_endY /* 11 */:
                return new l(parcel);
            case 12:
                return new m(parcel);
            case 13:
                return new n(parcel);
            case 14:
                return new o(parcel);
            case 15:
                return new J3.a(parcel);
            case 16:
                return new J3.b(parcel);
            case 17:
                ArrayList arrayList2 = new ArrayList();
                parcel.readList(arrayList2, J3.c.class.getClassLoader());
                return new J3.d(arrayList2);
            case 18:
                return new J3.c(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 19:
                return new J3.e(parcel);
            case 20:
                return new K3.a(parcel);
            case 21:
                return new K3.e(parcel);
            case 22:
                return new Object();
            case 23:
                return new i(parcel);
            case 24:
                return new j(parcel.readLong(), parcel.readLong());
            case 25:
                return new G3.b(parcel);
            case 26:
                return new M3.b(parcel);
            case 27:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f6694a = parcel.readInt();
                return baseSavedState2;
            case 28:
                return new V0.j(parcel);
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f3098a) {
            case 0:
                return new c[i9];
            case 1:
                return new d[i9];
            case 2:
                return new H5.c[i9];
            case 3:
                return new I2.c[i9];
            case 4:
                return new I3.a[i9];
            case 5:
                return new I3.b[i9];
            case 6:
                return new I3.c[i9];
            case 7:
                return new I3.d[i9];
            case 8:
                return new e[i9];
            case 9:
                return new f[i9];
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new k[i9];
            case R.styleable.GradientColor_android_endY /* 11 */:
                return new l[i9];
            case 12:
                return new m[i9];
            case 13:
                return new n[i9];
            case 14:
                return new o[i9];
            case 15:
                return new J3.a[i9];
            case 16:
                return new J3.b[i9];
            case 17:
                return new J3.d[i9];
            case 18:
                return new J3.c[i9];
            case 19:
                return new J3.e[i9];
            case 20:
                return new K3.a[i9];
            case 21:
                return new K3.e[i9];
            case 22:
                return new K3.f[i9];
            case 23:
                return new i[i9];
            case 24:
                return new j[i9];
            case 25:
                return new L3.a[i9];
            case 26:
                return new M3.b[i9];
            case 27:
                return new S.h[i9];
            case 28:
                return new V0.j[i9];
            default:
                return new ParcelImpl[i9];
        }
    }
}
