package A1;

import B4.r;
import F0.F;
import F0.x0;
import F0.y0;
import F4.C0127f;
import F4.C0128g;
import F4.C0131j;
import F4.C0133l;
import F4.C0134m;
import F4.q;
import H2.s;
import H2.z;
import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import co.notix.R;
import com.anilab.domain.model.FilterConfig;
import com.anilab.domain.model.Genre;
import com.anilab.domain.model.LatestVersion;
import com.anilab.domain.model.Movie;
import com.anilab.domain.model.MovieDownload;
import com.anilab.domain.model.Shortcut;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import s8.n;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5a;

    public /* synthetic */ a(int i9) {
        this.f5a = i9;
    }

    public static void a(C0128g c0128g, Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 1, 4);
        parcel.writeInt(c0128g.f2399a);
        n.V(parcel, 2, 4);
        parcel.writeInt(c0128g.f2400b);
        n.V(parcel, 3, 4);
        parcel.writeInt(c0128g.f2401c);
        n.M(parcel, 4, c0128g.f2402d);
        n.H(parcel, 5, c0128g.f2403e);
        n.O(parcel, 6, c0128g.f2404f, i9);
        n.F(parcel, 7, c0128g.f2405g);
        n.L(parcel, 8, c0128g.f2406h, i9);
        n.O(parcel, 10, c0128g.f2407i, i9);
        n.O(parcel, 11, c0128g.j, i9);
        n.V(parcel, 12, 4);
        parcel.writeInt(c0128g.f2408k ? 1 : 0);
        n.V(parcel, 13, 4);
        parcel.writeInt(c0128g.f2409l);
        boolean z9 = c0128g.f2410m;
        n.V(parcel, 14, 4);
        parcel.writeInt(z9 ? 1 : 0);
        n.M(parcel, 15, c0128g.f2411n);
        n.U(parcel, R2);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [F4.F, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [F0.F, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, F0.x0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, F0.y0] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        switch (this.f5a) {
            case 0:
                String readString = parcel.readString();
                kotlin.jvm.internal.h.b(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i9 = 0; i9 < readInt; i9++) {
                    String readString2 = parcel.readString();
                    kotlin.jvm.internal.h.b(readString2);
                    String readString3 = parcel.readString();
                    kotlin.jvm.internal.h.b(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new b(readString, linkedHashMap);
            case 1:
                int f02 = s8.e.f0(parcel);
                PendingIntent pendingIntent = null;
                int i10 = 0;
                int i11 = 0;
                String str = null;
                while (parcel.dataPosition() < f02) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    s8.e.e0(parcel, readInt2);
                                } else {
                                    str = s8.e.o(parcel, readInt2);
                                }
                            } else {
                                pendingIntent = (PendingIntent) s8.e.n(parcel, readInt2, PendingIntent.CREATOR);
                            }
                        } else {
                            i11 = s8.e.T(parcel, readInt2);
                        }
                    } else {
                        i10 = s8.e.T(parcel, readInt2);
                    }
                }
                s8.e.w(parcel, f02);
                return new B4.b(i10, i11, pendingIntent, str);
            case 2:
                int f03 = s8.e.f0(parcel);
                long j = -1;
                int i12 = 0;
                String str2 = null;
                while (parcel.dataPosition() < f03) {
                    int readInt3 = parcel.readInt();
                    char c9 = (char) readInt3;
                    if (c9 != 1) {
                        if (c9 != 2) {
                            if (c9 != 3) {
                                s8.e.e0(parcel, readInt3);
                            } else {
                                j = s8.e.U(parcel, readInt3);
                            }
                        } else {
                            i12 = s8.e.T(parcel, readInt3);
                        }
                    } else {
                        str2 = s8.e.o(parcel, readInt3);
                    }
                }
                s8.e.w(parcel, f03);
                return new B4.d(j, str2, i12);
            case 3:
                int f04 = s8.e.f0(parcel);
                boolean z15 = false;
                int i13 = 0;
                String str3 = null;
                int i14 = 0;
                while (parcel.dataPosition() < f04) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    s8.e.e0(parcel, readInt4);
                                } else {
                                    i13 = s8.e.T(parcel, readInt4);
                                }
                            } else {
                                i14 = s8.e.T(parcel, readInt4);
                            }
                        } else {
                            str3 = s8.e.o(parcel, readInt4);
                        }
                    } else {
                        z15 = s8.e.P(parcel, readInt4);
                    }
                }
                s8.e.w(parcel, f04);
                return new r(i14, i13, str3, z15);
            case 4:
                String readString4 = parcel.readString();
                readString4.getClass();
                return new E3.a(parcel.readInt(), readString4);
            case 5:
                int f05 = s8.e.f0(parcel);
                int i15 = 0;
                int i16 = 0;
                Uri uri = null;
                int i17 = 0;
                while (parcel.dataPosition() < f05) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    s8.e.e0(parcel, readInt5);
                                } else {
                                    i16 = s8.e.T(parcel, readInt5);
                                }
                            } else {
                                i17 = s8.e.T(parcel, readInt5);
                            }
                        } else {
                            uri = (Uri) s8.e.n(parcel, readInt5, Uri.CREATOR);
                        }
                    } else {
                        i15 = s8.e.T(parcel, readInt5);
                    }
                }
                s8.e.w(parcel, f05);
                return new E4.a(i15, uri, i17, i16);
            case 6:
                ?? obj = new Object();
                obj.f2020a = parcel.readInt();
                obj.f2021b = parcel.readInt();
                boolean z16 = true;
                if (parcel.readInt() != 1) {
                    z16 = false;
                }
                obj.f2022c = z16;
                return obj;
            case 7:
                ?? obj2 = new Object();
                obj2.f2285a = parcel.readInt();
                obj2.f2286b = parcel.readInt();
                boolean z17 = true;
                if (parcel.readInt() != 1) {
                    z17 = false;
                }
                obj2.f2288d = z17;
                int readInt6 = parcel.readInt();
                if (readInt6 > 0) {
                    int[] iArr = new int[readInt6];
                    obj2.f2287c = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj2;
            case 8:
                ?? obj3 = new Object();
                obj3.f2294a = parcel.readInt();
                obj3.f2295b = parcel.readInt();
                int readInt7 = parcel.readInt();
                obj3.f2296c = readInt7;
                if (readInt7 > 0) {
                    int[] iArr2 = new int[readInt7];
                    obj3.f2297d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt8 = parcel.readInt();
                obj3.f2298e = readInt8;
                if (readInt8 > 0) {
                    int[] iArr3 = new int[readInt8];
                    obj3.f2299f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z18 = false;
                if (parcel.readInt() == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                obj3.f2301h = z9;
                if (parcel.readInt() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                obj3.f2302i = z10;
                if (parcel.readInt() == 1) {
                    z18 = true;
                }
                obj3.j = z18;
                obj3.f2300g = parcel.readArrayList(x0.class.getClassLoader());
                return obj3;
            case 9:
                return new F3.a(parcel);
            case R.styleable.GradientColor_android_endX /* 10 */:
                int f06 = s8.e.f0(parcel);
                ArrayList arrayList = null;
                int i18 = 0;
                while (parcel.dataPosition() < f06) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            s8.e.e0(parcel, readInt9);
                        } else {
                            arrayList = s8.e.s(parcel, readInt9, C0131j.CREATOR);
                        }
                    } else {
                        i18 = s8.e.T(parcel, readInt9);
                    }
                }
                s8.e.w(parcel, f06);
                return new C0134m(arrayList, i18);
            case R.styleable.GradientColor_android_endY /* 11 */:
                int f07 = s8.e.f0(parcel);
                int i19 = -1;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                String str4 = null;
                String str5 = null;
                long j4 = 0;
                long j9 = 0;
                while (parcel.dataPosition() < f07) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i20 = s8.e.T(parcel, readInt10);
                            break;
                        case 2:
                            i21 = s8.e.T(parcel, readInt10);
                            break;
                        case 3:
                            i22 = s8.e.T(parcel, readInt10);
                            break;
                        case 4:
                            j4 = s8.e.U(parcel, readInt10);
                            break;
                        case 5:
                            j9 = s8.e.U(parcel, readInt10);
                            break;
                        case 6:
                            str4 = s8.e.o(parcel, readInt10);
                            break;
                        case 7:
                            str5 = s8.e.o(parcel, readInt10);
                            break;
                        case '\b':
                            i23 = s8.e.T(parcel, readInt10);
                            break;
                        case '\t':
                            i19 = s8.e.T(parcel, readInt10);
                            break;
                        default:
                            s8.e.e0(parcel, readInt10);
                            break;
                    }
                }
                s8.e.w(parcel, f07);
                return new C0131j(i20, i21, i22, j4, j9, str4, str5, i23, i19);
            case 12:
                int f08 = s8.e.f0(parcel);
                Account account = null;
                int i24 = 0;
                int i25 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < f08) {
                    int readInt11 = parcel.readInt();
                    char c13 = (char) readInt11;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                if (c13 != 4) {
                                    s8.e.e0(parcel, readInt11);
                                } else {
                                    googleSignInAccount = (GoogleSignInAccount) s8.e.n(parcel, readInt11, GoogleSignInAccount.CREATOR);
                                }
                            } else {
                                i25 = s8.e.T(parcel, readInt11);
                            }
                        } else {
                            account = (Account) s8.e.n(parcel, readInt11, Account.CREATOR);
                        }
                    } else {
                        i24 = s8.e.T(parcel, readInt11);
                    }
                }
                s8.e.w(parcel, f08);
                return new q(i24, account, i25, googleSignInAccount);
            case 13:
                int f09 = s8.e.f0(parcel);
                int i26 = 0;
                boolean z19 = false;
                boolean z20 = false;
                IBinder iBinder = null;
                B4.b bVar = null;
                while (parcel.dataPosition() < f09) {
                    int readInt12 = parcel.readInt();
                    char c14 = (char) readInt12;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            if (c14 != 3) {
                                if (c14 != 4) {
                                    if (c14 != 5) {
                                        s8.e.e0(parcel, readInt12);
                                    } else {
                                        z20 = s8.e.P(parcel, readInt12);
                                    }
                                } else {
                                    z19 = s8.e.P(parcel, readInt12);
                                }
                            } else {
                                bVar = (B4.b) s8.e.n(parcel, readInt12, B4.b.CREATOR);
                            }
                        } else {
                            iBinder = s8.e.S(parcel, readInt12);
                        }
                    } else {
                        i26 = s8.e.T(parcel, readInt12);
                    }
                }
                s8.e.w(parcel, f09);
                return new F4.r(i26, iBinder, bVar, z19, z20);
            case 14:
                int f010 = s8.e.f0(parcel);
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                boolean z21 = false;
                boolean z22 = false;
                while (parcel.dataPosition() < f010) {
                    int readInt13 = parcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 != 1) {
                        if (c15 != 2) {
                            if (c15 != 3) {
                                if (c15 != 4) {
                                    if (c15 != 5) {
                                        s8.e.e0(parcel, readInt13);
                                    } else {
                                        i29 = s8.e.T(parcel, readInt13);
                                    }
                                } else {
                                    i28 = s8.e.T(parcel, readInt13);
                                }
                            } else {
                                z22 = s8.e.P(parcel, readInt13);
                            }
                        } else {
                            z21 = s8.e.P(parcel, readInt13);
                        }
                    } else {
                        i27 = s8.e.T(parcel, readInt13);
                    }
                }
                s8.e.w(parcel, f010);
                return new C0133l(i27, i28, i29, z21, z22);
            case 15:
                return new BinderWrapper(parcel);
            case 16:
                int f011 = s8.e.f0(parcel);
                Bundle bundle = null;
                C0127f c0127f = null;
                int i30 = 0;
                B4.d[] dVarArr = null;
                while (parcel.dataPosition() < f011) {
                    int readInt14 = parcel.readInt();
                    char c16 = (char) readInt14;
                    if (c16 != 1) {
                        if (c16 != 2) {
                            if (c16 != 3) {
                                if (c16 != 4) {
                                    s8.e.e0(parcel, readInt14);
                                } else {
                                    c0127f = (C0127f) s8.e.n(parcel, readInt14, C0127f.CREATOR);
                                }
                            } else {
                                i30 = s8.e.T(parcel, readInt14);
                            }
                        } else {
                            dVarArr = (B4.d[]) s8.e.r(parcel, readInt14, B4.d.CREATOR);
                        }
                    } else {
                        bundle = s8.e.i(parcel, readInt14);
                    }
                }
                s8.e.w(parcel, f011);
                ?? obj4 = new Object();
                obj4.f2337a = bundle;
                obj4.f2338b = dVarArr;
                obj4.f2339c = i30;
                obj4.f2340d = c0127f;
                return obj4;
            case 17:
                int f012 = s8.e.f0(parcel);
                C0133l c0133l = null;
                int[] iArr4 = null;
                int[] iArr5 = null;
                boolean z23 = false;
                boolean z24 = false;
                int i31 = 0;
                while (parcel.dataPosition() < f012) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            c0133l = (C0133l) s8.e.n(parcel, readInt15, C0133l.CREATOR);
                            break;
                        case 2:
                            z23 = s8.e.P(parcel, readInt15);
                            break;
                        case 3:
                            z24 = s8.e.P(parcel, readInt15);
                            break;
                        case 4:
                            iArr4 = s8.e.k(parcel, readInt15);
                            break;
                        case 5:
                            i31 = s8.e.T(parcel, readInt15);
                            break;
                        case 6:
                            iArr5 = s8.e.k(parcel, readInt15);
                            break;
                        default:
                            s8.e.e0(parcel, readInt15);
                            break;
                    }
                }
                s8.e.w(parcel, f012);
                return new C0127f(c0133l, z23, z24, iArr4, i31, iArr5);
            case 18:
                int f013 = s8.e.f0(parcel);
                Scope[] scopeArr = C0128g.f2397o;
                Bundle bundle2 = new Bundle();
                B4.d[] dVarArr2 = C0128g.f2398p;
                B4.d[] dVarArr3 = dVarArr2;
                String str6 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str7 = null;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                boolean z25 = false;
                int i35 = 0;
                boolean z26 = false;
                while (parcel.dataPosition() < f013) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i32 = s8.e.T(parcel, readInt16);
                            break;
                        case 2:
                            i33 = s8.e.T(parcel, readInt16);
                            break;
                        case 3:
                            i34 = s8.e.T(parcel, readInt16);
                            break;
                        case 4:
                            str6 = s8.e.o(parcel, readInt16);
                            break;
                        case 5:
                            iBinder2 = s8.e.S(parcel, readInt16);
                            break;
                        case 6:
                            scopeArr = (Scope[]) s8.e.r(parcel, readInt16, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = s8.e.i(parcel, readInt16);
                            break;
                        case '\b':
                            account2 = (Account) s8.e.n(parcel, readInt16, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            s8.e.e0(parcel, readInt16);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            dVarArr2 = (B4.d[]) s8.e.r(parcel, readInt16, B4.d.CREATOR);
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            dVarArr3 = (B4.d[]) s8.e.r(parcel, readInt16, B4.d.CREATOR);
                            break;
                        case '\f':
                            z25 = s8.e.P(parcel, readInt16);
                            break;
                        case '\r':
                            i35 = s8.e.T(parcel, readInt16);
                            break;
                        case 14:
                            z26 = s8.e.P(parcel, readInt16);
                            break;
                        case 15:
                            str7 = s8.e.o(parcel, readInt16);
                            break;
                    }
                }
                s8.e.w(parcel, f013);
                return new C0128g(i32, i33, i34, str6, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z25, i35, z26, str7);
            case 19:
                return new G3.a(parcel);
            case 20:
                return new G3.b(parcel);
            case 21:
                kotlin.jvm.internal.h.e(parcel, "parcel");
                return new H2.j(parcel.readString(), parcel.readString());
            case 22:
                kotlin.jvm.internal.h.e(parcel, "parcel");
                return new FilterConfig(parcel.readString(), parcel.readString());
            case 23:
                kotlin.jvm.internal.h.e(parcel, "parcel");
                long readLong = parcel.readLong();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new Genre(readLong, readString5, readString6, z11);
            case 24:
                kotlin.jvm.internal.h.e(parcel, "parcel");
                String readString7 = parcel.readString();
                int readInt17 = parcel.readInt();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                return new LatestVersion(readString7, readInt17, readString8, readString9, z12);
            case 25:
                kotlin.jvm.internal.h.e(parcel, "parcel");
                long readLong2 = parcel.readLong();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                int readInt18 = parcel.readInt();
                J2.b valueOf = J2.b.valueOf(parcel.readString());
                String readString14 = parcel.readString();
                int readInt19 = parcel.readInt();
                int readInt20 = parcel.readInt();
                int readInt21 = parcel.readInt();
                double readDouble = parcel.readDouble();
                long readLong3 = parcel.readLong();
                int readInt22 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt22);
                for (int i36 = 0; i36 != readInt22; i36++) {
                    arrayList2.add(Genre.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int readInt23 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt23);
                int i37 = 0;
                while (i37 != readInt23) {
                    arrayList3.add(z.CREATOR.createFromParcel(parcel));
                    i37++;
                    readInt23 = readInt23;
                }
                double readDouble2 = parcel.readDouble();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                return new Movie(readLong2, readString10, readString11, createStringArrayList, readString12, readString13, readInt18, valueOf, readString14, readInt19, readInt20, readInt21, readDouble, readLong3, arrayList2, z13, arrayList3, readDouble2, readString15, readString16, z14);
            case 26:
                kotlin.jvm.internal.h.e(parcel, "parcel");
                String readString17 = parcel.readString();
                J2.c valueOf2 = J2.c.valueOf(parcel.readString());
                String readString18 = parcel.readString();
                int readInt24 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt24);
                for (int i38 = 0; i38 != readInt24; i38++) {
                    arrayList4.add(I2.c.CREATOR.createFromParcel(parcel));
                }
                return new MovieDownload(readString17, valueOf2, readString18, arrayList4);
            case 27:
                kotlin.jvm.internal.h.e(parcel, "parcel");
                return new s(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 28:
                kotlin.jvm.internal.h.e(parcel, "parcel");
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                int readInt25 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt25);
                boolean z27 = false;
                for (int i39 = 0; i39 != readInt25; i39++) {
                    arrayList5.add(H2.j.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() != 0) {
                    z27 = true;
                }
                return new Shortcut(readString19, readString20, arrayList5, z27);
            default:
                kotlin.jvm.internal.h.e(parcel, "parcel");
                return new z(parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f5a) {
            case 0:
                return new b[i9];
            case 1:
                return new B4.b[i9];
            case 2:
                return new B4.d[i9];
            case 3:
                return new r[i9];
            case 4:
                return new E3.a[i9];
            case 5:
                return new E4.a[i9];
            case 6:
                return new F[i9];
            case 7:
                return new x0[i9];
            case 8:
                return new y0[i9];
            case 9:
                return new F3.a[i9];
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new C0134m[i9];
            case R.styleable.GradientColor_android_endY /* 11 */:
                return new C0131j[i9];
            case 12:
                return new q[i9];
            case 13:
                return new F4.r[i9];
            case 14:
                return new C0133l[i9];
            case 15:
                return new BinderWrapper[i9];
            case 16:
                return new F4.F[i9];
            case 17:
                return new C0127f[i9];
            case 18:
                return new C0128g[i9];
            case 19:
                return new G3.a[i9];
            case 20:
                return new G3.b[i9];
            case 21:
                return new H2.j[i9];
            case 22:
                return new FilterConfig[i9];
            case 23:
                return new Genre[i9];
            case 24:
                return new LatestVersion[i9];
            case 25:
                return new Movie[i9];
            case 26:
                return new MovieDownload[i9];
            case 27:
                return new s[i9];
            case 28:
                return new Shortcut[i9];
            default:
                return new z[i9];
        }
    }
}
