package y4;

import android.os.Parcel;
import co.notix.R;
import com.google.android.gms.internal.cast.C;
import t4.C2014d;

/* loaded from: classes.dex */
public abstract class h extends S4.c implements i {
    public h() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 2);
    }

    @Override // S4.c
    public final boolean g1(int i9, Parcel parcel, Parcel parcel2) {
        boolean z9 = false;
        switch (i9) {
            case 1:
                int readInt = parcel.readInt();
                C.b(parcel);
                A0(readInt);
                return true;
            case 2:
                C2014d c2014d = (C2014d) C.a(parcel, C2014d.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                C.b(parcel);
                T(c2014d, readString, readString2, z9);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                C.b(parcel);
                k(readInt2);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i10 = C.f14693a;
                parcel.readInt();
                C.b(parcel);
                h0();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                C.b(parcel);
                G0(readString3, readString4);
                return true;
            case 6:
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                C.b(parcel);
                Q0(readString5, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                C.b(parcel);
                E(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                C.b(parcel);
                J0(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                C.b(parcel);
                a(readInt5);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                C.b(parcel);
                p(readLong, readInt6);
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                parcel.readString();
                long readLong2 = parcel.readLong();
                C.b(parcel);
                T0(readLong2);
                return true;
            case 12:
                c cVar = (c) C.a(parcel, c.CREATOR);
                C.b(parcel);
                l0(cVar);
                return true;
            case 13:
                e eVar = (e) C.a(parcel, e.CREATOR);
                C.b(parcel);
                X0(eVar);
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                C.b(parcel);
                B(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                C.b(parcel);
                u0(readInt8);
                return true;
            default:
                return false;
        }
    }
}
