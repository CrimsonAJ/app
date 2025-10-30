package j3;

import android.net.Uri;
import android.os.Bundle;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import k3.C1494j;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final /* synthetic */ class Z implements InterfaceC1451e, l4.i, l4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19497a;

    public /* synthetic */ Z(int i9) {
        this.f19497a = i9;
    }

    @Override // l4.j
    public void a(Object obj, l4.f fVar) {
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [j3.a0, java.lang.Object] */
    @Override // j3.InterfaceC1451e
    public InterfaceC1453f c(Bundle bundle) {
        Integer num;
        byte[] bArr;
        Bundle bundle2;
        Bundle bundle3;
        boolean z9;
        boolean z10;
        boolean z11;
        O3.b bVar;
        Y y9;
        T t7;
        P5.S x5;
        boolean z12 = false;
        switch (this.f19497a) {
            case 0:
                ?? obj = new Object();
                obj.f19506a = bundle.getCharSequence(Integer.toString(0, 36));
                obj.f19507b = bundle.getCharSequence(Integer.toString(1, 36));
                obj.f19508c = bundle.getCharSequence(Integer.toString(2, 36));
                obj.f19509d = bundle.getCharSequence(Integer.toString(3, 36));
                obj.f19510e = bundle.getCharSequence(Integer.toString(4, 36));
                obj.f19511f = bundle.getCharSequence(Integer.toString(5, 36));
                obj.f19512g = bundle.getCharSequence(Integer.toString(6, 36));
                byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
                if (bundle.containsKey(Integer.toString(29, 36))) {
                    num = Integer.valueOf(bundle.getInt(Integer.toString(29, 36)));
                } else {
                    num = null;
                }
                if (byteArray == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) byteArray.clone();
                }
                obj.j = bArr;
                obj.f19515k = num;
                obj.f19516l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
                obj.f19527w = bundle.getCharSequence(Integer.toString(22, 36));
                obj.f19528x = bundle.getCharSequence(Integer.toString(23, 36));
                obj.f19529y = bundle.getCharSequence(Integer.toString(24, 36));
                obj.f19502B = bundle.getCharSequence(Integer.toString(27, 36));
                obj.f19503C = bundle.getCharSequence(Integer.toString(28, 36));
                obj.f19504D = bundle.getCharSequence(Integer.toString(30, 36));
                obj.f19505E = bundle.getBundle(Integer.toString(1000, 36));
                boolean containsKey = bundle.containsKey(Integer.toString(8, 36));
                Z z13 = v0.f19754a;
                if (containsKey && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
                    obj.f19513h = (v0) z13.c(bundle3);
                }
                if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
                    obj.f19514i = (v0) z13.c(bundle2);
                }
                if (bundle.containsKey(Integer.toString(12, 36))) {
                    obj.f19517m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
                }
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    obj.f19518n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
                }
                if (bundle.containsKey(Integer.toString(14, 36))) {
                    obj.f19519o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
                }
                if (bundle.containsKey(Integer.toString(15, 36))) {
                    obj.f19520p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
                }
                if (bundle.containsKey(Integer.toString(16, 36))) {
                    obj.f19521q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
                }
                if (bundle.containsKey(Integer.toString(17, 36))) {
                    obj.f19522r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
                }
                if (bundle.containsKey(Integer.toString(18, 36))) {
                    obj.f19523s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
                }
                if (bundle.containsKey(Integer.toString(19, 36))) {
                    obj.f19524t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
                }
                if (bundle.containsKey(Integer.toString(20, 36))) {
                    obj.f19525u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
                }
                if (bundle.containsKey(Integer.toString(21, 36))) {
                    obj.f19526v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
                }
                if (bundle.containsKey(Integer.toString(25, 36))) {
                    obj.f19530z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
                }
                if (bundle.containsKey(Integer.toString(26, 36))) {
                    obj.f19501A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
                }
                return new C1446b0(obj);
            case 1:
                if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
                    z12 = true;
                }
                AbstractC1566a.h(z12);
                float f9 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                if (f9 == -1.0f) {
                    return new k0();
                }
                return new k0(f9);
            case 2:
                int i9 = bundle.getInt(Integer.toString(0, 36), -1);
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 == 3) {
                                if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                AbstractC1566a.h(z10);
                                if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                                    return new A0(bundle.getBoolean(Integer.toString(2, 36), false));
                                }
                                return new A0();
                            }
                            throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Unknown RatingType: "));
                        }
                        if (bundle.getInt(Integer.toString(0, 36), -1) == 2) {
                            z12 = true;
                        }
                        AbstractC1566a.h(z12);
                        int i10 = bundle.getInt(Integer.toString(1, 36), 5);
                        float f10 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                        if (f10 == -1.0f) {
                            return new y0(i10);
                        }
                        return new y0(i10, f10);
                    }
                    if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
                        z12 = true;
                    }
                    AbstractC1566a.h(z12);
                    float f11 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                    if (f11 == -1.0f) {
                        return new k0();
                    }
                    return new k0(f11);
                }
                if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.h(z9);
                if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                    return new N(bundle.getBoolean(Integer.toString(2, 36), false));
                }
                return new N();
            case 3:
                if (bundle.getInt(Integer.toString(0, 36), -1) == 2) {
                    z12 = true;
                }
                AbstractC1566a.h(z12);
                int i11 = bundle.getInt(Integer.toString(1, 36), 5);
                float f12 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                if (f12 == -1.0f) {
                    return new y0(i11);
                }
                return new y0(i11, f12);
            case 4:
                if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC1566a.h(z11);
                if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                    return new A0(bundle.getBoolean(Integer.toString(2, 36), false));
                }
                return new A0();
            case 5:
                int i12 = bundle.getInt(Integer.toString(0, 36), 0);
                long j = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
                long j4 = bundle.getLong(Integer.toString(2, 36), 0L);
                boolean z14 = bundle.getBoolean(Integer.toString(3, 36));
                Bundle bundle4 = bundle.getBundle(Integer.toString(4, 36));
                if (bundle4 != null) {
                    bVar = (O3.b) O3.b.f5453h.c(bundle4);
                } else {
                    bVar = O3.b.f5451f;
                }
                O3.b bVar2 = bVar;
                C0 c02 = new C0();
                c02.h(null, null, i12, j, j4, bVar2, z14);
                return c02;
            case 6:
                Bundle bundle5 = bundle.getBundle(Integer.toString(1, 36));
                if (bundle5 != null) {
                    y9 = (Y) Y.f19490h.c(bundle5);
                } else {
                    y9 = null;
                }
                long j9 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
                long j10 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
                long j11 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
                boolean z15 = bundle.getBoolean(Integer.toString(5, 36), false);
                boolean z16 = bundle.getBoolean(Integer.toString(6, 36), false);
                Bundle bundle6 = bundle.getBundle(Integer.toString(7, 36));
                if (bundle6 != null) {
                    t7 = new T(bundle6.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle6.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle6.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle6.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle6.getFloat(Integer.toString(4, 36), -3.4028235E38f));
                } else {
                    t7 = null;
                }
                boolean z17 = bundle.getBoolean(Integer.toString(8, 36), false);
                long j12 = bundle.getLong(Integer.toString(9, 36), 0L);
                long j13 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
                int i13 = bundle.getInt(Integer.toString(11, 36), 0);
                int i14 = bundle.getInt(Integer.toString(12, 36), 0);
                long j14 = bundle.getLong(Integer.toString(13, 36), 0L);
                D0 d02 = new D0();
                d02.b(D0.f19301s, y9, null, j9, j10, j11, z15, z16, t7, j12, j13, i13, i14, j14);
                d02.f19313l = z17;
                return d02;
            default:
                Bundle bundle7 = bundle.getBundle(Integer.toString(0, 36));
                bundle7.getClass();
                ArrayList parcelableArrayList = bundle7.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList == null) {
                    P5.D d9 = P5.F.f5901b;
                    x5 = P5.S.f5926e;
                } else {
                    x5 = AbstractC1566a.x(M.f19419f0, parcelableArrayList);
                }
                N3.m0 m0Var = new N3.m0(bundle7.getString(Integer.toString(1, 36), ""), (M[]) x5.toArray(new M[0]));
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                int i15 = m0Var.f5164a;
                int[] iArr = new int[i15];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
                boolean[] zArr = new boolean[i15];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new F0(m0Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
        }
    }

    @Override // l4.i
    public void invoke(Object obj) {
        C1494j c1494j = (C1494j) obj;
        switch (this.f19497a) {
            case 8:
                c1494j.getClass();
                return;
            case 9:
                c1494j.getClass();
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                c1494j.getClass();
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
                c1494j.getClass();
                return;
            case 12:
                c1494j.getClass();
                return;
            case 13:
                c1494j.getClass();
                return;
            case 14:
                c1494j.getClass();
                return;
            case 15:
                c1494j.getClass();
                return;
            case 16:
                c1494j.getClass();
                return;
            case 17:
                c1494j.getClass();
                return;
            case 18:
                c1494j.getClass();
                return;
            case 19:
                c1494j.getClass();
                return;
            case 20:
                c1494j.getClass();
                return;
            case 21:
                c1494j.getClass();
                return;
            case 22:
                c1494j.getClass();
                return;
            case 23:
                c1494j.getClass();
                return;
            case 24:
                c1494j.getClass();
                return;
            case 25:
            default:
                c1494j.getClass();
                return;
            case 26:
                c1494j.getClass();
                return;
            case 27:
                c1494j.getClass();
                return;
            case 28:
                c1494j.getClass();
                return;
        }
    }
}
