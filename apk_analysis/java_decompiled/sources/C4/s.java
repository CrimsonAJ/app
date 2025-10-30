package C4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator {

    /* renamed from: b, reason: collision with root package name */
    public static final s f1590b = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1591a;

    public /* synthetic */ s(int i9) {
        this.f1591a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1591a) {
            case 0:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() == -204102970) {
                    int f02 = s8.e.f0(parcel);
                    g gVar = null;
                    while (parcel.dataPosition() < f02) {
                        int readInt = parcel.readInt();
                        if (((char) readInt) != 1) {
                            s8.e.e0(parcel, readInt);
                        } else {
                            gVar = (g) s8.e.n(parcel, readInt, g.CREATOR);
                        }
                    }
                    s8.e.w(parcel, f02);
                    return new f(gVar);
                }
                parcel.setDataPosition(dataPosition - 4);
                return f.f1569b;
            case 1:
                int f03 = s8.e.f0(parcel);
                int i9 = 0;
                boolean z9 = true;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < f03) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    s8.e.e0(parcel, readInt2);
                                } else {
                                    z9 = s8.e.P(parcel, readInt2);
                                }
                            } else {
                                i11 = s8.e.T(parcel, readInt2);
                            }
                        } else {
                            i10 = s8.e.T(parcel, readInt2);
                        }
                    } else {
                        i9 = s8.e.T(parcel, readInt2);
                    }
                }
                s8.e.w(parcel, f03);
                return new g(i9, i10, i11, z9);
            case 2:
                int f04 = s8.e.f0(parcel);
                String str = null;
                int i12 = 0;
                while (parcel.dataPosition() < f04) {
                    int readInt3 = parcel.readInt();
                    char c9 = (char) readInt3;
                    if (c9 != 1) {
                        if (c9 != 2) {
                            s8.e.e0(parcel, readInt3);
                        } else {
                            str = s8.e.o(parcel, readInt3);
                        }
                    } else {
                        i12 = s8.e.T(parcel, readInt3);
                    }
                }
                s8.e.w(parcel, f04);
                return new Scope(i12, str);
            default:
                int f05 = s8.e.f0(parcel);
                String str2 = null;
                B4.b bVar = null;
                int i13 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < f05) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    s8.e.e0(parcel, readInt4);
                                } else {
                                    bVar = (B4.b) s8.e.n(parcel, readInt4, B4.b.CREATOR);
                                }
                            } else {
                                pendingIntent = (PendingIntent) s8.e.n(parcel, readInt4, PendingIntent.CREATOR);
                            }
                        } else {
                            str2 = s8.e.o(parcel, readInt4);
                        }
                    } else {
                        i13 = s8.e.T(parcel, readInt4);
                    }
                }
                s8.e.w(parcel, f05);
                return new Status(i13, str2, pendingIntent, bVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.f1591a) {
            case 0:
                return new f[i9];
            case 1:
                return new g[i9];
            case 2:
                return new Scope[i9];
            default:
                return new Status[i9];
        }
    }
}
