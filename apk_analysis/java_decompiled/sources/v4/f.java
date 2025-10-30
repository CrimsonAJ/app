package v4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.AbstractC0807c0;
import com.google.android.gms.internal.cast.C0799a0;
import com.google.android.gms.internal.cast.C0823g0;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t4.C2010B;

/* loaded from: classes.dex */
public final class f extends G4.a {
    public static final Parcelable.Creator<f> CREATOR;

    /* renamed from: g0, reason: collision with root package name */
    public static final C0823g0 f23812g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final int[] f23813h0;

    /* renamed from: A, reason: collision with root package name */
    public final int f23814A;

    /* renamed from: B, reason: collision with root package name */
    public final int f23815B;

    /* renamed from: C, reason: collision with root package name */
    public final int f23816C;

    /* renamed from: D, reason: collision with root package name */
    public final int f23817D;

    /* renamed from: X, reason: collision with root package name */
    public final int f23818X;
    public final v Y;

    /* renamed from: Z, reason: collision with root package name */
    public final boolean f23819Z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23820a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f23821b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23822c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23823d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23824e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23825f;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f23826f0;

    /* renamed from: g, reason: collision with root package name */
    public final int f23827g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23828h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23829i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f23830k;

    /* renamed from: l, reason: collision with root package name */
    public final int f23831l;

    /* renamed from: m, reason: collision with root package name */
    public final int f23832m;

    /* renamed from: n, reason: collision with root package name */
    public final int f23833n;

    /* renamed from: o, reason: collision with root package name */
    public final int f23834o;

    /* renamed from: p, reason: collision with root package name */
    public final int f23835p;

    /* renamed from: q, reason: collision with root package name */
    public final int f23836q;

    /* renamed from: r, reason: collision with root package name */
    public final int f23837r;

    /* renamed from: s, reason: collision with root package name */
    public final int f23838s;

    /* renamed from: t, reason: collision with root package name */
    public final int f23839t;

    /* renamed from: u, reason: collision with root package name */
    public final int f23840u;

    /* renamed from: v, reason: collision with root package name */
    public final int f23841v;

    /* renamed from: w, reason: collision with root package name */
    public final int f23842w;

    /* renamed from: x, reason: collision with root package name */
    public final int f23843x;

    /* renamed from: y, reason: collision with root package name */
    public final int f23844y;

    /* renamed from: z, reason: collision with root package name */
    public final int f23845z;

    static {
        C0799a0 c0799a0 = AbstractC0807c0.f14818b;
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        for (int i9 = 0; i9 < 2; i9++) {
            if (objArr[i9] == null) {
                throw new NullPointerException(AbstractC0953k1.j(i9, "at index "));
            }
        }
        f23812g0 = AbstractC0807c0.g(2, objArr);
        f23813h0 = new int[]{0, 1};
        CREATOR = new C2010B(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List list, int[] iArr, long j, String str, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, IBinder iBinder, boolean z9, boolean z10) {
        v aVar;
        this.f23820a = new ArrayList(list);
        this.f23821b = Arrays.copyOf(iArr, iArr.length);
        this.f23822c = j;
        this.f23823d = str;
        this.f23824e = i9;
        this.f23825f = i10;
        this.f23827g = i11;
        this.f23828h = i12;
        this.f23829i = i13;
        this.j = i14;
        this.f23830k = i15;
        this.f23831l = i16;
        this.f23832m = i17;
        this.f23833n = i18;
        this.f23834o = i19;
        this.f23835p = i20;
        this.f23836q = i21;
        this.f23837r = i22;
        this.f23838s = i23;
        this.f23839t = i24;
        this.f23840u = i25;
        this.f23841v = i26;
        this.f23842w = i27;
        this.f23843x = i28;
        this.f23844y = i29;
        this.f23845z = i30;
        this.f23814A = i31;
        this.f23815B = i32;
        this.f23816C = i33;
        this.f23817D = i34;
        this.f23818X = i35;
        this.f23819Z = z9;
        this.f23826f0 = z10;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof v) {
                aVar = (v) queryLocalInterface;
            } else {
                aVar = new S4.a(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 3);
            }
        }
        this.Y = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        IBinder iBinder;
        int R2 = s8.n.R(parcel, 20293);
        s8.n.N(parcel, 2, this.f23820a);
        int[] iArr = this.f23821b;
        s8.n.I(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        s8.n.V(parcel, 4, 8);
        parcel.writeLong(this.f23822c);
        s8.n.M(parcel, 5, this.f23823d);
        s8.n.V(parcel, 6, 4);
        parcel.writeInt(this.f23824e);
        s8.n.V(parcel, 7, 4);
        parcel.writeInt(this.f23825f);
        s8.n.V(parcel, 8, 4);
        parcel.writeInt(this.f23827g);
        s8.n.V(parcel, 9, 4);
        parcel.writeInt(this.f23828h);
        s8.n.V(parcel, 10, 4);
        parcel.writeInt(this.f23829i);
        s8.n.V(parcel, 11, 4);
        parcel.writeInt(this.j);
        s8.n.V(parcel, 12, 4);
        parcel.writeInt(this.f23830k);
        s8.n.V(parcel, 13, 4);
        parcel.writeInt(this.f23831l);
        s8.n.V(parcel, 14, 4);
        parcel.writeInt(this.f23832m);
        s8.n.V(parcel, 15, 4);
        parcel.writeInt(this.f23833n);
        s8.n.V(parcel, 16, 4);
        parcel.writeInt(this.f23834o);
        s8.n.V(parcel, 17, 4);
        parcel.writeInt(this.f23835p);
        s8.n.V(parcel, 18, 4);
        parcel.writeInt(this.f23836q);
        s8.n.V(parcel, 19, 4);
        parcel.writeInt(this.f23837r);
        s8.n.V(parcel, 20, 4);
        parcel.writeInt(this.f23838s);
        s8.n.V(parcel, 21, 4);
        parcel.writeInt(this.f23839t);
        s8.n.V(parcel, 22, 4);
        parcel.writeInt(this.f23840u);
        s8.n.V(parcel, 23, 4);
        parcel.writeInt(this.f23841v);
        s8.n.V(parcel, 24, 4);
        parcel.writeInt(this.f23842w);
        s8.n.V(parcel, 25, 4);
        parcel.writeInt(this.f23843x);
        s8.n.V(parcel, 26, 4);
        parcel.writeInt(this.f23844y);
        s8.n.V(parcel, 27, 4);
        parcel.writeInt(this.f23845z);
        s8.n.V(parcel, 28, 4);
        parcel.writeInt(this.f23814A);
        s8.n.V(parcel, 29, 4);
        parcel.writeInt(this.f23815B);
        s8.n.V(parcel, 30, 4);
        parcel.writeInt(this.f23816C);
        s8.n.V(parcel, 31, 4);
        parcel.writeInt(this.f23817D);
        s8.n.V(parcel, 32, 4);
        parcel.writeInt(this.f23818X);
        v vVar = this.Y;
        if (vVar == null) {
            iBinder = null;
        } else {
            iBinder = vVar.f6929f;
        }
        s8.n.H(parcel, 33, iBinder);
        s8.n.V(parcel, 34, 4);
        parcel.writeInt(this.f23819Z ? 1 : 0);
        s8.n.V(parcel, 35, 4);
        parcel.writeInt(this.f23826f0 ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
