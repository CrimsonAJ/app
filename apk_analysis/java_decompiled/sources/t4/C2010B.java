package t4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import co.notix.R;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import u0.C2043n;
import u4.C2075A;
import u4.C2078c;
import v4.C2108a;

/* renamed from: t4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2010B implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23144a;

    public /* synthetic */ C2010B(int i9) {
        this.f23144a = i9;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, z5.f] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel inParcel) {
        switch (this.f23144a) {
            case 0:
                int f02 = s8.e.f0(inParcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                ArrayList arrayList = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                byte[] bArr = null;
                String str9 = null;
                y4.d dVar = null;
                Integer num = null;
                Boolean bool = null;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z9 = false;
                int i12 = -1;
                while (inParcel.dataPosition() < f02) {
                    int readInt = inParcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = s8.e.o(inParcel, readInt);
                            break;
                        case 3:
                            str2 = s8.e.o(inParcel, readInt);
                            break;
                        case 4:
                            str3 = s8.e.o(inParcel, readInt);
                            break;
                        case 5:
                            str4 = s8.e.o(inParcel, readInt);
                            break;
                        case 6:
                            str5 = s8.e.o(inParcel, readInt);
                            break;
                        case 7:
                            i9 = s8.e.T(inParcel, readInt);
                            break;
                        case '\b':
                            arrayList = s8.e.s(inParcel, readInt, E4.a.CREATOR);
                            break;
                        case '\t':
                            i10 = s8.e.T(inParcel, readInt);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            i12 = s8.e.T(inParcel, readInt);
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            str6 = s8.e.o(inParcel, readInt);
                            break;
                        case '\f':
                            str7 = s8.e.o(inParcel, readInt);
                            break;
                        case '\r':
                            i11 = s8.e.T(inParcel, readInt);
                            break;
                        case 14:
                            str8 = s8.e.o(inParcel, readInt);
                            break;
                        case 15:
                            bArr = s8.e.j(inParcel, readInt);
                            break;
                        case 16:
                            str9 = s8.e.o(inParcel, readInt);
                            break;
                        case 17:
                            z9 = s8.e.P(inParcel, readInt);
                            break;
                        case 18:
                            dVar = (y4.d) s8.e.n(inParcel, readInt, y4.d.CREATOR);
                            break;
                        case 19:
                            int V8 = s8.e.V(inParcel, readInt);
                            if (V8 == 0) {
                                num = null;
                                break;
                            } else {
                                s8.e.i0(inParcel, V8, 4);
                                num = Integer.valueOf(inParcel.readInt());
                                break;
                            }
                        case 20:
                            bool = s8.e.Q(inParcel, readInt);
                            break;
                        default:
                            s8.e.e0(inParcel, readInt);
                            break;
                    }
                }
                s8.e.w(inParcel, f02);
                return new CastDevice(str, str2, str3, str4, str5, i9, arrayList, i10, i12, str6, str7, i11, str8, bArr, str9, z9, dVar, num, bool);
            case 1:
                kotlin.jvm.internal.h.e(inParcel, "inParcel");
                return new C2043n(inParcel);
            case 2:
                int f03 = s8.e.f0(inParcel);
                boolean z10 = false;
                while (inParcel.dataPosition() < f03) {
                    int readInt2 = inParcel.readInt();
                    if (((char) readInt2) != 2) {
                        s8.e.e0(inParcel, readInt2);
                    } else {
                        z10 = s8.e.P(inParcel, readInt2);
                    }
                }
                s8.e.w(inParcel, f03);
                return new C2075A(z10);
            case 3:
                int f04 = s8.e.f0(inParcel);
                int i13 = 0;
                while (inParcel.dataPosition() < f04) {
                    int readInt3 = inParcel.readInt();
                    if (((char) readInt3) != 2) {
                        s8.e.e0(inParcel, readInt3);
                    } else {
                        i13 = s8.e.T(inParcel, readInt3);
                    }
                }
                s8.e.w(inParcel, f04);
                return new u4.B(i13);
            case 4:
                int f05 = s8.e.f0(inParcel);
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                String str10 = null;
                ArrayList arrayList2 = null;
                i iVar = null;
                C2108a c2108a = null;
                ArrayList arrayList3 = null;
                C2075A c2075a = null;
                u4.B b9 = null;
                double d9 = 0.0d;
                while (inParcel.dataPosition() < f05) {
                    int readInt4 = inParcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str10 = s8.e.o(inParcel, readInt4);
                            break;
                        case 3:
                            arrayList2 = s8.e.p(inParcel, readInt4);
                            break;
                        case 4:
                            z11 = s8.e.P(inParcel, readInt4);
                            break;
                        case 5:
                            iVar = (i) s8.e.n(inParcel, readInt4, i.CREATOR);
                            break;
                        case 6:
                            z12 = s8.e.P(inParcel, readInt4);
                            break;
                        case 7:
                            c2108a = (C2108a) s8.e.n(inParcel, readInt4, C2108a.CREATOR);
                            break;
                        case '\b':
                            z13 = s8.e.P(inParcel, readInt4);
                            break;
                        case '\t':
                            d9 = s8.e.R(inParcel, readInt4);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            z14 = s8.e.P(inParcel, readInt4);
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            z15 = s8.e.P(inParcel, readInt4);
                            break;
                        case '\f':
                            z16 = s8.e.P(inParcel, readInt4);
                            break;
                        case '\r':
                            arrayList3 = s8.e.p(inParcel, readInt4);
                            break;
                        case 14:
                            z17 = s8.e.P(inParcel, readInt4);
                            break;
                        case 15:
                            s8.e.T(inParcel, readInt4);
                            break;
                        case 16:
                            z18 = s8.e.P(inParcel, readInt4);
                            break;
                        case 17:
                            c2075a = (C2075A) s8.e.n(inParcel, readInt4, C2075A.CREATOR);
                            break;
                        case 18:
                            b9 = (u4.B) s8.e.n(inParcel, readInt4, u4.B.CREATOR);
                            break;
                        case 19:
                            z19 = s8.e.P(inParcel, readInt4);
                            break;
                        case 20:
                            z20 = s8.e.P(inParcel, readInt4);
                            break;
                        default:
                            s8.e.e0(inParcel, readInt4);
                            break;
                    }
                }
                s8.e.w(inParcel, f05);
                return new C2078c(str10, arrayList2, z11, iVar, z12, c2108a, z13, d9, z14, z15, z16, arrayList3, z17, z18, c2075a, b9, z19, z20);
            case 5:
                int f06 = s8.e.f0(inParcel);
                boolean z21 = false;
                boolean z22 = false;
                String str11 = null;
                String str12 = null;
                IBinder iBinder = null;
                v4.f fVar = null;
                while (inParcel.dataPosition() < f06) {
                    int readInt5 = inParcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str11 = s8.e.o(inParcel, readInt5);
                            break;
                        case 3:
                            str12 = s8.e.o(inParcel, readInt5);
                            break;
                        case 4:
                            iBinder = s8.e.S(inParcel, readInt5);
                            break;
                        case 5:
                            fVar = (v4.f) s8.e.n(inParcel, readInt5, v4.f.CREATOR);
                            break;
                        case 6:
                            z21 = s8.e.P(inParcel, readInt5);
                            break;
                        case 7:
                            z22 = s8.e.P(inParcel, readInt5);
                            break;
                        default:
                            s8.e.e0(inParcel, readInt5);
                            break;
                    }
                }
                s8.e.w(inParcel, f06);
                return new C2108a(str11, str12, iBinder, fVar, z21, z22);
            case 6:
                int f07 = s8.e.f0(inParcel);
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (inParcel.dataPosition() < f07) {
                    int readInt6 = inParcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 != 2) {
                        if (c3 != 3) {
                            if (c3 != 4) {
                                s8.e.e0(inParcel, readInt6);
                            } else {
                                i16 = s8.e.T(inParcel, readInt6);
                            }
                        } else {
                            i15 = s8.e.T(inParcel, readInt6);
                        }
                    } else {
                        i14 = s8.e.T(inParcel, readInt6);
                    }
                }
                s8.e.w(inParcel, f07);
                return new v4.b(i14, i15, i16);
            case 7:
                int f08 = s8.e.f0(inParcel);
                String str13 = null;
                int i17 = 0;
                String str14 = null;
                while (inParcel.dataPosition() < f08) {
                    int readInt7 = inParcel.readInt();
                    char c9 = (char) readInt7;
                    if (c9 != 2) {
                        if (c9 != 3) {
                            if (c9 != 4) {
                                s8.e.e0(inParcel, readInt7);
                            } else {
                                str14 = s8.e.o(inParcel, readInt7);
                            }
                        } else {
                            i17 = s8.e.T(inParcel, readInt7);
                        }
                    } else {
                        str13 = s8.e.o(inParcel, readInt7);
                    }
                }
                s8.e.w(inParcel, f08);
                return new v4.d(str13, i17, str14);
            case 8:
                int f09 = s8.e.f0(inParcel);
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                int i44 = 0;
                boolean z23 = false;
                boolean z24 = false;
                ArrayList arrayList4 = null;
                int[] iArr = null;
                String str15 = null;
                IBinder iBinder2 = null;
                long j = 0;
                while (inParcel.dataPosition() < f09) {
                    int readInt8 = inParcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            arrayList4 = s8.e.p(inParcel, readInt8);
                            break;
                        case 3:
                            iArr = s8.e.k(inParcel, readInt8);
                            break;
                        case 4:
                            j = s8.e.U(inParcel, readInt8);
                            break;
                        case 5:
                            str15 = s8.e.o(inParcel, readInt8);
                            break;
                        case 6:
                            i18 = s8.e.T(inParcel, readInt8);
                            break;
                        case 7:
                            i19 = s8.e.T(inParcel, readInt8);
                            break;
                        case '\b':
                            i20 = s8.e.T(inParcel, readInt8);
                            break;
                        case '\t':
                            i21 = s8.e.T(inParcel, readInt8);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            i22 = s8.e.T(inParcel, readInt8);
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            i23 = s8.e.T(inParcel, readInt8);
                            break;
                        case '\f':
                            i24 = s8.e.T(inParcel, readInt8);
                            break;
                        case '\r':
                            i25 = s8.e.T(inParcel, readInt8);
                            break;
                        case 14:
                            i26 = s8.e.T(inParcel, readInt8);
                            break;
                        case 15:
                            i27 = s8.e.T(inParcel, readInt8);
                            break;
                        case 16:
                            i28 = s8.e.T(inParcel, readInt8);
                            break;
                        case 17:
                            i29 = s8.e.T(inParcel, readInt8);
                            break;
                        case 18:
                            i30 = s8.e.T(inParcel, readInt8);
                            break;
                        case 19:
                            i31 = s8.e.T(inParcel, readInt8);
                            break;
                        case 20:
                            i32 = s8.e.T(inParcel, readInt8);
                            break;
                        case 21:
                            i33 = s8.e.T(inParcel, readInt8);
                            break;
                        case 22:
                            i34 = s8.e.T(inParcel, readInt8);
                            break;
                        case 23:
                            i35 = s8.e.T(inParcel, readInt8);
                            break;
                        case 24:
                            i36 = s8.e.T(inParcel, readInt8);
                            break;
                        case 25:
                            i37 = s8.e.T(inParcel, readInt8);
                            break;
                        case 26:
                            i38 = s8.e.T(inParcel, readInt8);
                            break;
                        case 27:
                            i39 = s8.e.T(inParcel, readInt8);
                            break;
                        case 28:
                            i40 = s8.e.T(inParcel, readInt8);
                            break;
                        case 29:
                            i41 = s8.e.T(inParcel, readInt8);
                            break;
                        case 30:
                            i42 = s8.e.T(inParcel, readInt8);
                            break;
                        case 31:
                            i43 = s8.e.T(inParcel, readInt8);
                            break;
                        case ' ':
                            i44 = s8.e.T(inParcel, readInt8);
                            break;
                        case '!':
                            iBinder2 = s8.e.S(inParcel, readInt8);
                            break;
                        case '\"':
                            z23 = s8.e.P(inParcel, readInt8);
                            break;
                        case '#':
                            z24 = s8.e.P(inParcel, readInt8);
                            break;
                        default:
                            s8.e.e0(inParcel, readInt8);
                            break;
                    }
                }
                s8.e.w(inParcel, f09);
                return new v4.f(arrayList4, iArr, j, str15, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i43, i44, iBinder2, z23, z24);
            case 9:
                int f010 = s8.e.f0(inParcel);
                int i45 = 0;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                while (inParcel.dataPosition() < f010) {
                    int readInt9 = inParcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            i45 = s8.e.T(inParcel, readInt9);
                            break;
                        case 3:
                            z25 = s8.e.P(inParcel, readInt9);
                            break;
                        case 4:
                            z26 = s8.e.P(inParcel, readInt9);
                            break;
                        case 5:
                            str16 = s8.e.o(inParcel, readInt9);
                            break;
                        case 6:
                            str17 = s8.e.o(inParcel, readInt9);
                            break;
                        case 7:
                            str18 = s8.e.o(inParcel, readInt9);
                            break;
                        case '\b':
                            str19 = s8.e.o(inParcel, readInt9);
                            break;
                        case '\t':
                            str20 = s8.e.o(inParcel, readInt9);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            z27 = s8.e.P(inParcel, readInt9);
                            break;
                        default:
                            s8.e.e0(inParcel, readInt9);
                            break;
                    }
                }
                s8.e.w(inParcel, f010);
                return new y4.d(i45, z25, z26, str16, str17, str18, str19, str20, z27);
            case R.styleable.GradientColor_android_endX /* 10 */:
                int f011 = s8.e.f0(inParcel);
                double d10 = 0.0d;
                C2014d c2014d = null;
                u uVar = null;
                boolean z28 = false;
                int i46 = 0;
                int i47 = 0;
                double d11 = 0.0d;
                while (inParcel.dataPosition() < f011) {
                    int readInt10 = inParcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            d10 = s8.e.R(inParcel, readInt10);
                            break;
                        case 3:
                            z28 = s8.e.P(inParcel, readInt10);
                            break;
                        case 4:
                            i46 = s8.e.T(inParcel, readInt10);
                            break;
                        case 5:
                            c2014d = (C2014d) s8.e.n(inParcel, readInt10, C2014d.CREATOR);
                            break;
                        case 6:
                            i47 = s8.e.T(inParcel, readInt10);
                            break;
                        case 7:
                            uVar = (u) s8.e.n(inParcel, readInt10, u.CREATOR);
                            break;
                        case '\b':
                            d11 = s8.e.R(inParcel, readInt10);
                            break;
                        default:
                            s8.e.e0(inParcel, readInt10);
                            break;
                    }
                }
                s8.e.w(inParcel, f011);
                ?? obj = new Object();
                obj.f24930a = d10;
                obj.f24931b = z28;
                obj.f24932c = i46;
                obj.f24933d = c2014d;
                obj.f24934e = i47;
                obj.f24935f = uVar;
                obj.f24936g = d11;
                return obj;
            case R.styleable.GradientColor_android_endY /* 11 */:
                int f012 = s8.e.f0(inParcel);
                String str21 = null;
                while (inParcel.dataPosition() < f012) {
                    int readInt11 = inParcel.readInt();
                    if (((char) readInt11) != 2) {
                        s8.e.e0(inParcel, readInt11);
                    } else {
                        str21 = s8.e.o(inParcel, readInt11);
                    }
                }
                s8.e.w(inParcel, f012);
                return new y4.c(str21);
            default:
                ?? obj2 = new Object();
                obj2.f25489a = inParcel.readInt();
                obj2.f25490b = (w5.i) inParcel.readParcelable(z5.f.class.getClassLoader());
                return obj2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f23144a) {
            case 0:
                return new CastDevice[i9];
            case 1:
                return new C2043n[i9];
            case 2:
                return new C2075A[i9];
            case 3:
                return new u4.B[i9];
            case 4:
                return new C2078c[i9];
            case 5:
                return new C2108a[i9];
            case 6:
                return new v4.b[i9];
            case 7:
                return new v4.d[i9];
            case 8:
                return new v4.f[i9];
            case 9:
                return new y4.d[i9];
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new y4.e[i9];
            case R.styleable.GradientColor_android_endY /* 11 */:
                return new y4.c[i9];
            default:
                return new z5.f[i9];
        }
    }
}
