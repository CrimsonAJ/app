package b5;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractBinderC1015x;
import com.google.android.gms.internal.measurement.AbstractC1020y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: b5.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0672w0 extends AbstractBinderC1015x implements G {

    /* renamed from: e, reason: collision with root package name */
    public final J1 f11339e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f11340f;

    /* renamed from: g, reason: collision with root package name */
    public String f11341g;

    public BinderC0672w0(J1 j12) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        F4.y.h(j12);
        this.f11339e = j12;
        this.f11341g = null;
    }

    @Override // b5.G
    public final void C(Q1 q12) {
        F4.y.e(q12.f10901a);
        F4.y.h(q12.f10920u);
        g(new RunnableC0656p0(this, q12, 1));
    }

    @Override // b5.G
    public final String D0(Q1 q12) {
        f1(q12);
        J1 j12 = this.f11339e;
        try {
            return (String) j12.K().r0(new CallableC0661r0(j12, 2, q12)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            V A2 = j12.A();
            A2.f10971f.d(V.t0(q12.f10901a), e8, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // b5.G
    public final void L0(Q1 q12) {
        String str = q12.f10901a;
        F4.y.e(str);
        g1(str, false);
        Q(new RunnableC0656p0(this, q12, 5));
    }

    @Override // b5.G
    public final void P0(Q1 q12, C0619d c0619d) {
        if (!this.f11339e.h0().y0(null, E.f10617Q0)) {
            return;
        }
        f1(q12);
        Q(new A4.j(this, q12, c0619d, 4));
    }

    public final void Q(Runnable runnable) {
        J1 j12 = this.f11339e;
        if (j12.K().x0()) {
            runnable.run();
        } else {
            j12.K().v0(runnable);
        }
    }

    @Override // b5.G
    public final void R0(M1 m12, Q1 q12) {
        F4.y.h(m12);
        f1(q12);
        Q(new A4.j(this, m12, q12, 8, false));
    }

    @Override // b5.G
    public final List S(String str, String str2, Q1 q12) {
        f1(q12);
        String str3 = q12.f10901a;
        F4.y.h(str3);
        J1 j12 = this.f11339e;
        try {
            return (List) j12.K().r0(new CallableC0668u0(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e8) {
            j12.A().f10971f.c(e8, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // b5.G
    public final void U(Q1 q12) {
        f1(q12);
        Q(new RunnableC0656p0(this, q12, 3));
    }

    @Override // b5.G
    public final void W(Q1 q12, B1 b12, K k5) {
        J1 j12 = this.f11339e;
        if (!j12.h0().y0(null, E.f10617Q0)) {
            try {
                k5.a1(new C1(Collections.EMPTY_LIST));
                j12.A().f10978n.b("[sgtm] Client upload is not enabled on the service side.");
                return;
            } catch (RemoteException e8) {
                j12.A().f10974i.c(e8, "[sgtm] UploadBatchesCallback failed.");
                return;
            }
        }
        f1(q12);
        String str = q12.f10901a;
        F4.y.h(str);
        j12.K().v0(new RunnableC0659q0((Object) this, (Serializable) str, (G4.a) b12, (Object) k5, 0));
    }

    @Override // b5.G
    public final void W0(C0622e c0622e, Q1 q12) {
        F4.y.h(c0622e);
        F4.y.h(c0622e.f11075c);
        f1(q12);
        C0622e c0622e2 = new C0622e(c0622e);
        c0622e2.f11073a = q12.f10901a;
        Q(new A4.j(this, c0622e2, q12, 5, false));
    }

    @Override // b5.G
    public final void Y(Q1 q12) {
        f1(q12);
        Q(new RunnableC0656p0(this, q12, 4));
    }

    @Override // b5.G
    public final void Z0(long j, String str, String str2, String str3) {
        Q(new RunnableC0664s0(this, str2, str3, str, j, 0));
    }

    @Override // b5.G
    public final void a0(Q1 q12) {
        F4.y.e(q12.f10901a);
        F4.y.h(q12.f10920u);
        g(new RunnableC0656p0(this, q12, 6));
    }

    @Override // b5.G
    public final List b1(String str, String str2, boolean z9, Q1 q12) {
        f1(q12);
        String str3 = q12.f10901a;
        F4.y.h(str3);
        J1 j12 = this.f11339e;
        try {
            List<N1> list = (List) j12.K().r0(new CallableC0668u0(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (N1 n12 : list) {
                if (!z9 && P1.f1(n12.f10818c)) {
                }
                arrayList.add(new M1(n12));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            Object obj = e;
            V A2 = j12.A();
            A2.f10971f.d(V.t0(str3), obj, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e9) {
            e = e9;
            Object obj2 = e;
            V A22 = j12.A();
            A22.f10971f.d(V.t0(str3), obj2, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r8v7, types: [S4.a] */
    /* JADX WARN: Type inference failed for: r8v9, types: [S4.a] */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1015x
    public final boolean d(int i9, Parcel parcel, Parcel parcel2) {
        ?? r62;
        List list;
        J1 j12 = this.f11339e;
        ArrayList arrayList = null;
        I i10 = null;
        K k5 = null;
        boolean z9 = false;
        boolean z10 = false;
        int i11 = 1;
        switch (i9) {
            case 1:
                C0665t c0665t = (C0665t) AbstractC1020y.a(parcel, C0665t.CREATOR);
                Q1 q12 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                z0(c0665t, q12);
                parcel2.writeNoException();
                return true;
            case 2:
                M1 m12 = (M1) AbstractC1020y.a(parcel, M1.CREATOR);
                Q1 q13 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                R0(m12, q13);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                Q1 q14 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                m0(q14);
                parcel2.writeNoException();
                return true;
            case 5:
                C0665t c0665t2 = (C0665t) AbstractC1020y.a(parcel, C0665t.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                AbstractC1020y.b(parcel);
                F4.y.h(c0665t2);
                F4.y.e(readString);
                g1(readString, true);
                Q(new A4.j(this, c0665t2, readString, 7, false));
                parcel2.writeNoException();
                return true;
            case 6:
                Q1 q15 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                Y(q15);
                parcel2.writeNoException();
                return true;
            case 7:
                Q1 q16 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                if (parcel.readInt() != 0) {
                    r62 = true;
                } else {
                    r62 = false;
                }
                AbstractC1020y.b(parcel);
                f1(q16);
                String str = q16.f10901a;
                F4.y.h(str);
                try {
                    List<N1> list2 = (List) j12.K().r0(new CallableC0661r0(this, z9 ? 1 : 0, str)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (N1 n12 : list2) {
                        if (r62 == false && P1.f1(n12.f10818c)) {
                        }
                        arrayList2.add(new M1(n12));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e8) {
                    e = e8;
                    j12.A().f10971f.d(V.t0(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e9) {
                    e = e9;
                    j12.A().f10971f.d(V.t0(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C0665t c0665t3 = (C0665t) AbstractC1020y.a(parcel, C0665t.CREATOR);
                String readString2 = parcel.readString();
                AbstractC1020y.b(parcel);
                byte[] v8 = v(c0665t3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(v8);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                AbstractC1020y.b(parcel);
                Z0(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                Q1 q17 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                String D02 = D0(q17);
                parcel2.writeNoException();
                parcel2.writeString(D02);
                return true;
            case 12:
                C0622e c0622e = (C0622e) AbstractC1020y.a(parcel, C0622e.CREATOR);
                Q1 q18 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                W0(c0622e, q18);
                parcel2.writeNoException();
                return true;
            case 13:
                C0622e c0622e2 = (C0622e) AbstractC1020y.a(parcel, C0622e.CREATOR);
                AbstractC1020y.b(parcel);
                F4.y.h(c0622e2);
                F4.y.h(c0622e2.f11075c);
                F4.y.e(c0622e2.f11073a);
                g1(c0622e2.f11073a, true);
                Q(new S5.o(this, new C0622e(c0622e2), 18, z9));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = AbstractC1020y.f15693a;
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                Q1 q19 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                List b12 = b1(readString6, readString7, z9, q19);
                parcel2.writeNoException();
                parcel2.writeTypedList(b12);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC1020y.f15693a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                AbstractC1020y.b(parcel);
                List e12 = e1(readString8, readString9, readString10, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(e12);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Q1 q110 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                List S8 = S(readString11, readString12, q110);
                parcel2.writeNoException();
                parcel2.writeTypedList(S8);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                AbstractC1020y.b(parcel);
                List x02 = x0(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(x02);
                return true;
            case 18:
                Q1 q111 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                L0(q111);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                Q1 q112 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                s0(bundle, q112);
                parcel2.writeNoException();
                return true;
            case 20:
                Q1 q113 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                a0(q113);
                parcel2.writeNoException();
                return true;
            case 21:
                Q1 q114 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                C0634i f02 = f0(q114);
                parcel2.writeNoException();
                if (f02 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                f02.writeToParcel(parcel2, 1);
                return true;
            case 24:
                Q1 q115 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                AbstractC1020y.b(parcel);
                f1(q115);
                String str2 = q115.f10901a;
                F4.y.h(str2);
                if (j12.h0().y0(null, E.f10661i1)) {
                    try {
                        list = (List) j12.K().s0(new CallableC0670v0(this, q115, bundle2, z9 ? 1 : 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                        j12.A().f10971f.d(V.t0(str2), e10, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) j12.K().r0(new CallableC0670v0(this, q115, bundle2, i11)).get();
                    } catch (InterruptedException | ExecutionException e11) {
                        j12.A().f10971f.d(V.t0(str2), e11, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                Q1 q116 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                o(q116);
                parcel2.writeNoException();
                return true;
            case 26:
                Q1 q117 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                C(q117);
                parcel2.writeNoException();
                return true;
            case 27:
                Q1 q118 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                AbstractC1020y.b(parcel);
                U(q118);
                parcel2.writeNoException();
                return true;
            case 29:
                Q1 q119 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                B1 b13 = (B1) AbstractC1020y.a(parcel, B1.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    if (queryLocalInterface instanceof K) {
                        k5 = (K) queryLocalInterface;
                    } else {
                        k5 = new S4.a(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 4);
                    }
                }
                AbstractC1020y.b(parcel);
                W(q119, b13, k5);
                parcel2.writeNoException();
                return true;
            case 30:
                Q1 q120 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                C0619d c0619d = (C0619d) AbstractC1020y.a(parcel, C0619d.CREATOR);
                AbstractC1020y.b(parcel);
                P0(q120, c0619d);
                parcel2.writeNoException();
                return true;
            case 31:
                Q1 q121 = (Q1) AbstractC1020y.a(parcel, Q1.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    if (queryLocalInterface2 instanceof I) {
                        i10 = (I) queryLocalInterface2;
                    } else {
                        i10 = new S4.a(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 4);
                    }
                }
                AbstractC1020y.b(parcel);
                m(q121, bundle3, i10);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // b5.G
    public final List e1(String str, String str2, String str3, boolean z9) {
        g1(str, true);
        J1 j12 = this.f11339e;
        try {
            List<N1> list = (List) j12.K().r0(new CallableC0668u0(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (N1 n12 : list) {
                if (!z9 && P1.f1(n12.f10818c)) {
                }
                arrayList.add(new M1(n12));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            Object obj = e;
            V A2 = j12.A();
            A2.f10971f.d(V.t0(str), obj, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e9) {
            e = e9;
            Object obj2 = e;
            V A22 = j12.A();
            A22.f10971f.d(V.t0(str), obj2, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // b5.G
    public final C0634i f0(Q1 q12) {
        f1(q12);
        String str = q12.f10901a;
        F4.y.e(str);
        J1 j12 = this.f11339e;
        try {
            return (C0634i) j12.K().s0(new CallableC0661r0(this, 1, q12)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            V A2 = j12.A();
            A2.f10971f.d(V.t0(str), e8, "Failed to get consent. appId");
            return new C0634i(null);
        }
    }

    public final void f1(Q1 q12) {
        F4.y.h(q12);
        String str = q12.f10901a;
        F4.y.e(str);
        g1(str, false);
        this.f11339e.b().U0(q12.f10902b, q12.f10915p);
    }

    public final void g(Runnable runnable) {
        J1 j12 = this.f11339e;
        if (j12.K().x0()) {
            runnable.run();
        } else {
            j12.K().w0(runnable);
        }
    }

    public final void g1(String str, boolean z9) {
        boolean isEmpty = TextUtils.isEmpty(str);
        J1 j12 = this.f11339e;
        if (!isEmpty) {
            if (z9) {
                try {
                    if (this.f11340f == null) {
                        boolean z10 = true;
                        if (!"com.google.android.gms".equals(this.f11341g) && !K4.b.e(j12.f10755l.f11221a, Binder.getCallingUid()) && !B4.i.a(j12.f10755l.f11221a).b(Binder.getCallingUid())) {
                            z10 = false;
                        }
                        this.f11340f = Boolean.valueOf(z10);
                    }
                    if (this.f11340f.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e8) {
                    j12.A().f10971f.c(V.t0(str), "Measurement Service called with invalid calling package. appId");
                    throw e8;
                }
            }
            if (this.f11341g == null) {
                Context context = j12.f10755l.f11221a;
                int callingUid = Binder.getCallingUid();
                int i9 = B4.h.f702e;
                if (K4.b.g(callingUid, context, str)) {
                    this.f11341g = str;
                }
            }
            if (str.equals(this.f11341g)) {
                return;
            }
            throw new SecurityException("Unknown calling package name '" + str + "'.");
        }
        j12.A().f10971f.b("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void h1(C0665t c0665t, Q1 q12) {
        J1 j12 = this.f11339e;
        j12.e();
        j12.l(c0665t, q12);
    }

    @Override // b5.G
    public final void m(Q1 q12, Bundle bundle, I i9) {
        f1(q12);
        String str = q12.f10901a;
        F4.y.h(str);
        this.f11339e.K().v0(new RunnableC0653o0(this, q12, bundle, i9, str));
    }

    @Override // b5.G
    public final void m0(Q1 q12) {
        f1(q12);
        Q(new RunnableC0656p0(this, q12, 2));
    }

    @Override // b5.G
    public final void o(Q1 q12) {
        F4.y.e(q12.f10901a);
        F4.y.h(q12.f10920u);
        g(new RunnableC0656p0(this, q12, 0));
    }

    @Override // b5.G
    public final void s0(Bundle bundle, Q1 q12) {
        f1(q12);
        String str = q12.f10901a;
        F4.y.h(str);
        Q(new RunnableC0659q0(this, bundle, str, q12));
    }

    @Override // b5.G
    public final byte[] v(C0665t c0665t, String str) {
        F4.y.e(str);
        F4.y.h(c0665t);
        g1(str, true);
        J1 j12 = this.f11339e;
        V A2 = j12.A();
        C0650n0 c0650n0 = j12.f10755l;
        O o9 = c0650n0.f11232m;
        String str2 = c0665t.f11309a;
        A2.f10977m.c(o9.d(str2), "Log and bundle. event");
        j12.S().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) j12.K().s0(new Q4.b(this, c0665t, str)).get();
            if (bArr == null) {
                j12.A().f10971f.c(V.t0(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            j12.S().getClass();
            j12.A().f10977m.e("Log and bundle processed. event, size, time_ms", c0650n0.f11232m.d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e8) {
            e = e8;
            V A9 = j12.A();
            A9.f10971f.e("Failed to log and bundle. appId, event, error", V.t0(str), c0650n0.f11232m.d(str2), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            V A92 = j12.A();
            A92.f10971f.e("Failed to log and bundle. appId, event, error", V.t0(str), c0650n0.f11232m.d(str2), e);
            return null;
        }
    }

    @Override // b5.G
    public final List x0(String str, String str2, String str3) {
        g1(str, true);
        J1 j12 = this.f11339e;
        try {
            return (List) j12.K().r0(new CallableC0668u0(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e8) {
            j12.A().f10971f.c(e8, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // b5.G
    public final void z0(C0665t c0665t, Q1 q12) {
        F4.y.h(c0665t);
        f1(q12);
        Q(new A4.j(this, c0665t, q12, 6, false));
    }
}
