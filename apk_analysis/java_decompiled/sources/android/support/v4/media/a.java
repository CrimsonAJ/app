package android.support.v4.media;

import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b5.A1;
import b5.B1;
import b5.C0619d;
import b5.C0622e;
import b5.C0634i;
import b5.C0663s;
import b5.C0665t;
import b5.C1;
import b5.M1;
import b5.Q1;
import b5.x1;
import co.notix.R;
import com.google.android.material.datepicker.m;
import com.google.firebase.messaging.r;
import f.C1148a;
import i0.C1331H;
import i0.C1338O;
import i0.C1342T;
import i0.C1346b;
import i0.C1347c;
import java.util.ArrayList;
import kotlin.jvm.internal.h;
import s8.n;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9258a;

    public /* synthetic */ a(int i9) {
        this.f9258a = i9;
    }

    public static void a(C0665t c0665t, Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.M(parcel, 2, c0665t.f11309a);
        n.L(parcel, 3, c0665t.f11310b, i9);
        n.M(parcel, 4, c0665t.f11311c);
        n.V(parcel, 5, 8);
        parcel.writeLong(c0665t.f11312d);
        n.U(parcel, R2);
    }

    public static void b(M1 m12, Parcel parcel) {
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 1, 4);
        parcel.writeInt(m12.f10803a);
        n.M(parcel, 2, m12.f10804b);
        n.V(parcel, 3, 8);
        parcel.writeLong(m12.f10805c);
        Long l9 = m12.f10806d;
        if (l9 != null) {
            n.V(parcel, 4, 8);
            parcel.writeLong(l9.longValue());
        }
        n.M(parcel, 6, m12.f10807e);
        n.M(parcel, 7, m12.f10808f);
        Double d9 = m12.f10809g;
        if (d9 != null) {
            n.V(parcel, 8, 8);
            parcel.writeDouble(d9.doubleValue());
        }
        n.U(parcel, R2);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [c.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [i0.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [i0.O, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [c.a, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel inParcel) {
        long j = 0;
        int i9 = 0;
        Bundle bundle = null;
        B4.b bVar = null;
        ArrayList arrayList = null;
        Intent intent = null;
        Bundle bundle2 = null;
        c.b bVar2 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str = null;
        Bundle bundle3 = null;
        switch (this.f9258a) {
            case 0:
                return new Parcelable(inParcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a(0);

                    /* renamed from: a, reason: collision with root package name */
                    public final int f9238a;

                    /* renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f9239b;

                    {
                        this.f9238a = inParcel.readInt();
                        this.f9239b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f9238a + ", mDescription=" + this.f9239b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i10) {
                        parcel.writeInt(this.f9238a);
                        this.f9239b.writeToParcel(parcel, i10);
                    }
                };
            case 1:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(inParcel));
            case 2:
                return new MediaMetadataCompat(inParcel);
            case 3:
                return new RatingCompat(inParcel.readInt(), inParcel.readFloat());
            case 4:
                int f02 = s8.e.f0(inParcel);
                long j4 = 0;
                long j9 = 0;
                int i10 = 0;
                while (inParcel.dataPosition() < f02) {
                    int readInt = inParcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                s8.e.e0(inParcel, readInt);
                            } else {
                                j9 = s8.e.U(inParcel, readInt);
                            }
                        } else {
                            i10 = s8.e.T(inParcel, readInt);
                        }
                    } else {
                        j4 = s8.e.U(inParcel, readInt);
                    }
                }
                s8.e.w(inParcel, f02);
                return new C0619d(j4, j9, i10);
            case 5:
                int f03 = s8.e.f0(inParcel);
                long j10 = 0;
                long j11 = 0;
                long j12 = 0;
                boolean z9 = false;
                String str2 = null;
                String str3 = null;
                M1 m12 = null;
                String str4 = null;
                C0665t c0665t = null;
                C0665t c0665t2 = null;
                C0665t c0665t3 = null;
                while (inParcel.dataPosition() < f03) {
                    int readInt2 = inParcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str2 = s8.e.o(inParcel, readInt2);
                            break;
                        case 3:
                            str3 = s8.e.o(inParcel, readInt2);
                            break;
                        case 4:
                            m12 = (M1) s8.e.n(inParcel, readInt2, M1.CREATOR);
                            break;
                        case 5:
                            j10 = s8.e.U(inParcel, readInt2);
                            break;
                        case 6:
                            z9 = s8.e.P(inParcel, readInt2);
                            break;
                        case 7:
                            str4 = s8.e.o(inParcel, readInt2);
                            break;
                        case '\b':
                            c0665t = (C0665t) s8.e.n(inParcel, readInt2, C0665t.CREATOR);
                            break;
                        case '\t':
                            j11 = s8.e.U(inParcel, readInt2);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            c0665t2 = (C0665t) s8.e.n(inParcel, readInt2, C0665t.CREATOR);
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            j12 = s8.e.U(inParcel, readInt2);
                            break;
                        case '\f':
                            c0665t3 = (C0665t) s8.e.n(inParcel, readInt2, C0665t.CREATOR);
                            break;
                        default:
                            s8.e.e0(inParcel, readInt2);
                            break;
                    }
                }
                s8.e.w(inParcel, f03);
                return new C0622e(str2, str3, m12, j10, z9, str4, c0665t, j11, c0665t2, j12, c0665t3);
            case 6:
                int f04 = s8.e.f0(inParcel);
                while (inParcel.dataPosition() < f04) {
                    int readInt3 = inParcel.readInt();
                    if (((char) readInt3) != 1) {
                        s8.e.e0(inParcel, readInt3);
                    } else {
                        bundle = s8.e.i(inParcel, readInt3);
                    }
                }
                s8.e.w(inParcel, f04);
                return new C0634i(bundle);
            case 7:
                int f05 = s8.e.f0(inParcel);
                while (inParcel.dataPosition() < f05) {
                    int readInt4 = inParcel.readInt();
                    if (((char) readInt4) != 2) {
                        s8.e.e0(inParcel, readInt4);
                    } else {
                        bundle3 = s8.e.i(inParcel, readInt4);
                    }
                }
                s8.e.w(inParcel, f05);
                return new C0663s(bundle3);
            case 8:
                int f06 = s8.e.f0(inParcel);
                long j13 = 0;
                String str5 = null;
                C0663s c0663s = null;
                String str6 = null;
                while (inParcel.dataPosition() < f06) {
                    int readInt5 = inParcel.readInt();
                    char c9 = (char) readInt5;
                    if (c9 != 2) {
                        if (c9 != 3) {
                            if (c9 != 4) {
                                if (c9 != 5) {
                                    s8.e.e0(inParcel, readInt5);
                                } else {
                                    j13 = s8.e.U(inParcel, readInt5);
                                }
                            } else {
                                str6 = s8.e.o(inParcel, readInt5);
                            }
                        } else {
                            c0663s = (C0663s) s8.e.n(inParcel, readInt5, C0663s.CREATOR);
                        }
                    } else {
                        str5 = s8.e.o(inParcel, readInt5);
                    }
                }
                s8.e.w(inParcel, f06);
                return new C0665t(str5, c0663s, str6, j13);
            case 9:
                int f07 = s8.e.f0(inParcel);
                while (inParcel.dataPosition() < f07) {
                    int readInt6 = inParcel.readInt();
                    char c10 = (char) readInt6;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                s8.e.e0(inParcel, readInt6);
                            } else {
                                i9 = s8.e.T(inParcel, readInt6);
                            }
                        } else {
                            j = s8.e.U(inParcel, readInt6);
                        }
                    } else {
                        str = s8.e.o(inParcel, readInt6);
                    }
                }
                s8.e.w(inParcel, f07);
                return new x1(j, str, i9);
            case R.styleable.GradientColor_android_endX /* 10 */:
                int f08 = s8.e.f0(inParcel);
                long j14 = 0;
                long j15 = 0;
                int i11 = 0;
                byte[] bArr = null;
                String str7 = null;
                Bundle bundle4 = null;
                String str8 = null;
                while (inParcel.dataPosition() < f08) {
                    int readInt7 = inParcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            j14 = s8.e.U(inParcel, readInt7);
                            break;
                        case 2:
                            bArr = s8.e.j(inParcel, readInt7);
                            break;
                        case 3:
                            str7 = s8.e.o(inParcel, readInt7);
                            break;
                        case 4:
                            bundle4 = s8.e.i(inParcel, readInt7);
                            break;
                        case 5:
                            i11 = s8.e.T(inParcel, readInt7);
                            break;
                        case 6:
                            j15 = s8.e.U(inParcel, readInt7);
                            break;
                        case 7:
                            str8 = s8.e.o(inParcel, readInt7);
                            break;
                        default:
                            s8.e.e0(inParcel, readInt7);
                            break;
                    }
                }
                s8.e.w(inParcel, f08);
                return new A1(j14, bArr, str7, bundle4, i11, j15, str8);
            case R.styleable.GradientColor_android_endY /* 11 */:
                int f09 = s8.e.f0(inParcel);
                while (inParcel.dataPosition() < f09) {
                    int readInt8 = inParcel.readInt();
                    if (((char) readInt8) != 1) {
                        s8.e.e0(inParcel, readInt8);
                    } else {
                        arrayList3 = s8.e.l(inParcel, readInt8);
                    }
                }
                s8.e.w(inParcel, f09);
                return new B1(arrayList3);
            case 12:
                int f010 = s8.e.f0(inParcel);
                while (inParcel.dataPosition() < f010) {
                    int readInt9 = inParcel.readInt();
                    if (((char) readInt9) != 1) {
                        s8.e.e0(inParcel, readInt9);
                    } else {
                        arrayList2 = s8.e.s(inParcel, readInt9, A1.CREATOR);
                    }
                }
                s8.e.w(inParcel, f010);
                return new C1(arrayList2);
            case 13:
                int f011 = s8.e.f0(inParcel);
                long j16 = 0;
                int i12 = 0;
                String str9 = null;
                Long l9 = null;
                Float f9 = null;
                String str10 = null;
                String str11 = null;
                Double d9 = null;
                while (inParcel.dataPosition() < f011) {
                    int readInt10 = inParcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i12 = s8.e.T(inParcel, readInt10);
                            break;
                        case 2:
                            str9 = s8.e.o(inParcel, readInt10);
                            break;
                        case 3:
                            j16 = s8.e.U(inParcel, readInt10);
                            break;
                        case 4:
                            int V8 = s8.e.V(inParcel, readInt10);
                            if (V8 == 0) {
                                l9 = null;
                                break;
                            } else {
                                s8.e.i0(inParcel, V8, 8);
                                l9 = Long.valueOf(inParcel.readLong());
                                break;
                            }
                        case 5:
                            int V9 = s8.e.V(inParcel, readInt10);
                            if (V9 == 0) {
                                f9 = null;
                                break;
                            } else {
                                s8.e.i0(inParcel, V9, 4);
                                f9 = Float.valueOf(inParcel.readFloat());
                                break;
                            }
                        case 6:
                            str10 = s8.e.o(inParcel, readInt10);
                            break;
                        case 7:
                            str11 = s8.e.o(inParcel, readInt10);
                            break;
                        case '\b':
                            int V10 = s8.e.V(inParcel, readInt10);
                            if (V10 == 0) {
                                d9 = null;
                                break;
                            } else {
                                s8.e.i0(inParcel, V10, 8);
                                d9 = Double.valueOf(inParcel.readDouble());
                                break;
                            }
                        default:
                            s8.e.e0(inParcel, readInt10);
                            break;
                    }
                }
                s8.e.w(inParcel, f011);
                return new M1(i12, str9, j16, l9, f9, str10, str11, d9);
            case 14:
                int f012 = s8.e.f0(inParcel);
                String str12 = "";
                String str13 = str12;
                String str14 = str13;
                String str15 = str14;
                long j17 = 0;
                long j18 = 0;
                long j19 = 0;
                long j20 = 0;
                long j21 = 0;
                long j22 = 0;
                long j23 = 0;
                int i13 = 100;
                boolean z10 = false;
                int i14 = 0;
                boolean z11 = false;
                boolean z12 = false;
                int i15 = 0;
                int i16 = 0;
                boolean z13 = true;
                boolean z14 = true;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                Boolean bool = null;
                ArrayList arrayList4 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                long j24 = -2147483648L;
                while (inParcel.dataPosition() < f012) {
                    int readInt11 = inParcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            str16 = s8.e.o(inParcel, readInt11);
                            break;
                        case 3:
                            str17 = s8.e.o(inParcel, readInt11);
                            break;
                        case 4:
                            str18 = s8.e.o(inParcel, readInt11);
                            break;
                        case 5:
                            str19 = s8.e.o(inParcel, readInt11);
                            break;
                        case 6:
                            j17 = s8.e.U(inParcel, readInt11);
                            break;
                        case 7:
                            j18 = s8.e.U(inParcel, readInt11);
                            break;
                        case '\b':
                            str20 = s8.e.o(inParcel, readInt11);
                            break;
                        case '\t':
                            z13 = s8.e.P(inParcel, readInt11);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            z10 = s8.e.P(inParcel, readInt11);
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            j24 = s8.e.U(inParcel, readInt11);
                            break;
                        case '\f':
                            str21 = s8.e.o(inParcel, readInt11);
                            break;
                        case '\r':
                        case 17:
                        case 20:
                        case '!':
                        default:
                            s8.e.e0(inParcel, readInt11);
                            break;
                        case 14:
                            j19 = s8.e.U(inParcel, readInt11);
                            break;
                        case 15:
                            i14 = s8.e.T(inParcel, readInt11);
                            break;
                        case 16:
                            z14 = s8.e.P(inParcel, readInt11);
                            break;
                        case 18:
                            z11 = s8.e.P(inParcel, readInt11);
                            break;
                        case 19:
                            str22 = s8.e.o(inParcel, readInt11);
                            break;
                        case 21:
                            bool = s8.e.Q(inParcel, readInt11);
                            break;
                        case 22:
                            j20 = s8.e.U(inParcel, readInt11);
                            break;
                        case 23:
                            arrayList4 = s8.e.p(inParcel, readInt11);
                            break;
                        case 24:
                            str23 = s8.e.o(inParcel, readInt11);
                            break;
                        case 25:
                            str12 = s8.e.o(inParcel, readInt11);
                            break;
                        case 26:
                            str13 = s8.e.o(inParcel, readInt11);
                            break;
                        case 27:
                            str24 = s8.e.o(inParcel, readInt11);
                            break;
                        case 28:
                            z12 = s8.e.P(inParcel, readInt11);
                            break;
                        case 29:
                            j21 = s8.e.U(inParcel, readInt11);
                            break;
                        case 30:
                            i13 = s8.e.T(inParcel, readInt11);
                            break;
                        case 31:
                            str14 = s8.e.o(inParcel, readInt11);
                            break;
                        case ' ':
                            i15 = s8.e.T(inParcel, readInt11);
                            break;
                        case '\"':
                            j22 = s8.e.U(inParcel, readInt11);
                            break;
                        case '#':
                            str25 = s8.e.o(inParcel, readInt11);
                            break;
                        case '$':
                            str15 = s8.e.o(inParcel, readInt11);
                            break;
                        case '%':
                            j23 = s8.e.U(inParcel, readInt11);
                            break;
                        case '&':
                            i16 = s8.e.T(inParcel, readInt11);
                            break;
                    }
                }
                s8.e.w(inParcel, f012);
                return new Q1(str16, str17, str18, str19, j17, j18, str20, z13, z10, j24, str21, j19, i14, z14, z11, str22, bool, j20, arrayList4, str23, str12, str13, str24, z12, j21, i13, str14, i15, j22, str25, str15, j23, i16);
            case 15:
                ?? obj = new Object();
                IBinder readStrongBinder = inParcel.readStrongBinder();
                int i17 = c.c.f11549f;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.f11548d);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof c.b)) {
                        bVar2 = (c.b) queryLocalInterface;
                    } else {
                        ?? obj2 = new Object();
                        obj2.f11547e = readStrongBinder;
                        bVar2 = obj2;
                    }
                }
                obj.f11551a = bVar2;
                return obj;
            case 16:
                return new com.google.android.material.datepicker.b((m) inParcel.readParcelable(m.class.getClassLoader()), (m) inParcel.readParcelable(m.class.getClassLoader()), (com.google.android.material.datepicker.d) inParcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (m) inParcel.readParcelable(m.class.getClassLoader()), inParcel.readInt());
            case 17:
                return new com.google.android.material.datepicker.d(inParcel.readLong());
            case 18:
                return m.a(inParcel.readInt(), inParcel.readInt());
            case 19:
                int f013 = s8.e.f0(inParcel);
                while (inParcel.dataPosition() < f013) {
                    int readInt12 = inParcel.readInt();
                    if (((char) readInt12) != 2) {
                        s8.e.e0(inParcel, readInt12);
                    } else {
                        bundle2 = s8.e.i(inParcel, readInt12);
                    }
                }
                s8.e.w(inParcel, f013);
                return new r(bundle2);
            case 20:
                int f014 = s8.e.f0(inParcel);
                int i18 = 0;
                while (inParcel.dataPosition() < f014) {
                    int readInt13 = inParcel.readInt();
                    char c11 = (char) readInt13;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                s8.e.e0(inParcel, readInt13);
                            } else {
                                intent = (Intent) s8.e.n(inParcel, readInt13, Intent.CREATOR);
                            }
                        } else {
                            i18 = s8.e.T(inParcel, readInt13);
                        }
                    } else {
                        i9 = s8.e.T(inParcel, readInt13);
                    }
                }
                s8.e.w(inParcel, f014);
                return new d5.b(i9, i18, intent);
            case 21:
                int f015 = s8.e.f0(inParcel);
                String str26 = null;
                while (inParcel.dataPosition() < f015) {
                    int readInt14 = inParcel.readInt();
                    char c12 = (char) readInt14;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            s8.e.e0(inParcel, readInt14);
                        } else {
                            str26 = s8.e.o(inParcel, readInt14);
                        }
                    } else {
                        arrayList = s8.e.p(inParcel, readInt14);
                    }
                }
                s8.e.w(inParcel, f015);
                return new d5.d(str26, arrayList);
            case 22:
                int f016 = s8.e.f0(inParcel);
                F4.r rVar = null;
                while (inParcel.dataPosition() < f016) {
                    int readInt15 = inParcel.readInt();
                    char c13 = (char) readInt15;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                s8.e.e0(inParcel, readInt15);
                            } else {
                                rVar = (F4.r) s8.e.n(inParcel, readInt15, F4.r.CREATOR);
                            }
                        } else {
                            bVar = (B4.b) s8.e.n(inParcel, readInt15, B4.b.CREATOR);
                        }
                    } else {
                        i9 = s8.e.T(inParcel, readInt15);
                    }
                }
                s8.e.w(inParcel, f016);
                return new d5.e(i9, bVar, rVar);
            case 23:
                return new C1148a(inParcel);
            case 24:
                h.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                h.b(readParcelable);
                return new f.h((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 25:
                return new C1346b(inParcel);
            case 26:
                return new C1347c(inParcel);
            case 27:
                ?? obj3 = new Object();
                obj3.f18174a = inParcel.readString();
                obj3.f18175b = inParcel.readInt();
                return obj3;
            case 28:
                ?? obj4 = new Object();
                obj4.f18225e = null;
                obj4.f18226f = new ArrayList();
                obj4.f18227g = new ArrayList();
                obj4.f18221a = inParcel.createStringArrayList();
                obj4.f18222b = inParcel.createStringArrayList();
                obj4.f18223c = (C1346b[]) inParcel.createTypedArray(C1346b.CREATOR);
                obj4.f18224d = inParcel.readInt();
                obj4.f18225e = inParcel.readString();
                obj4.f18226f = inParcel.createStringArrayList();
                obj4.f18227g = inParcel.createTypedArrayList(C1347c.CREATOR);
                obj4.f18228h = inParcel.createTypedArrayList(C1331H.CREATOR);
                return obj4;
            default:
                return new C1342T(inParcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f9258a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i9];
            case 1:
                return new MediaDescriptionCompat[i9];
            case 2:
                return new MediaMetadataCompat[i9];
            case 3:
                return new RatingCompat[i9];
            case 4:
                return new C0619d[i9];
            case 5:
                return new C0622e[i9];
            case 6:
                return new C0634i[i9];
            case 7:
                return new C0663s[i9];
            case 8:
                return new C0665t[i9];
            case 9:
                return new x1[i9];
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new A1[i9];
            case R.styleable.GradientColor_android_endY /* 11 */:
                return new B1[i9];
            case 12:
                return new C1[i9];
            case 13:
                return new M1[i9];
            case 14:
                return new Q1[i9];
            case 15:
                return new c.d[i9];
            case 16:
                return new com.google.android.material.datepicker.b[i9];
            case 17:
                return new com.google.android.material.datepicker.d[i9];
            case 18:
                return new m[i9];
            case 19:
                return new r[i9];
            case 20:
                return new d5.b[i9];
            case 21:
                return new d5.d[i9];
            case 22:
                return new d5.e[i9];
            case 23:
                return new C1148a[i9];
            case 24:
                return new f.h[i9];
            case 25:
                return new C1346b[i9];
            case 26:
                return new C1347c[i9];
            case 27:
                return new C1331H[i9];
            case 28:
                return new C1338O[i9];
            default:
                return new C1342T[i9];
        }
    }
}
