package t4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import i5.C1381b;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p extends G4.a {
    public static final Parcelable.Creator<p> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public MediaInfo f23224a;

    /* renamed from: b, reason: collision with root package name */
    public long f23225b;

    /* renamed from: c, reason: collision with root package name */
    public int f23226c;

    /* renamed from: d, reason: collision with root package name */
    public double f23227d;

    /* renamed from: e, reason: collision with root package name */
    public int f23228e;

    /* renamed from: f, reason: collision with root package name */
    public int f23229f;

    /* renamed from: g, reason: collision with root package name */
    public long f23230g;

    /* renamed from: h, reason: collision with root package name */
    public long f23231h;

    /* renamed from: i, reason: collision with root package name */
    public double f23232i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f23233k;

    /* renamed from: l, reason: collision with root package name */
    public int f23234l;

    /* renamed from: m, reason: collision with root package name */
    public int f23235m;

    /* renamed from: n, reason: collision with root package name */
    public String f23236n;

    /* renamed from: o, reason: collision with root package name */
    public JSONObject f23237o;

    /* renamed from: p, reason: collision with root package name */
    public int f23238p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f23240r;

    /* renamed from: s, reason: collision with root package name */
    public C2013c f23241s;

    /* renamed from: t, reason: collision with root package name */
    public s f23242t;

    /* renamed from: u, reason: collision with root package name */
    public j f23243u;

    /* renamed from: v, reason: collision with root package name */
    public m f23244v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23245w;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f23239q = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f23246x = new SparseArray();

    static {
        F4.y.f("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new C1381b(24);
    }

    public p(MediaInfo mediaInfo, long j, int i9, double d9, int i10, int i11, long j4, long j9, double d10, boolean z9, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z10, C2013c c2013c, s sVar, j jVar, m mVar) {
        this.f23224a = mediaInfo;
        this.f23225b = j;
        this.f23226c = i9;
        this.f23227d = d9;
        this.f23228e = i10;
        this.f23229f = i11;
        this.f23230g = j4;
        this.f23231h = j9;
        this.f23232i = d10;
        this.j = z9;
        this.f23233k = jArr;
        this.f23234l = i12;
        this.f23235m = i13;
        this.f23236n = str;
        if (str != null) {
            try {
                this.f23237o = new JSONObject(this.f23236n);
            } catch (JSONException unused) {
                this.f23237o = null;
                this.f23236n = null;
            }
        } else {
            this.f23237o = null;
        }
        this.f23238p = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            i(arrayList);
        }
        this.f23240r = z10;
        this.f23241s = c2013c;
        this.f23242t = sVar;
        this.f23243u = jVar;
        this.f23244v = mVar;
        boolean z11 = false;
        if (mVar != null && mVar.j) {
            z11 = true;
        }
        this.f23245w = z11;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (this.f23237o != null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (pVar.f23237o != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z9 == z10 && this.f23225b == pVar.f23225b && this.f23226c == pVar.f23226c && this.f23227d == pVar.f23227d && this.f23228e == pVar.f23228e && this.f23229f == pVar.f23229f && this.f23230g == pVar.f23230g && this.f23232i == pVar.f23232i && this.j == pVar.j && this.f23234l == pVar.f23234l && this.f23235m == pVar.f23235m && this.f23238p == pVar.f23238p && Arrays.equals(this.f23233k, pVar.f23233k) && y4.a.e(Long.valueOf(this.f23231h), Long.valueOf(pVar.f23231h)) && y4.a.e(this.f23239q, pVar.f23239q) && y4.a.e(this.f23224a, pVar.f23224a) && (((jSONObject = this.f23237o) == null || (jSONObject2 = pVar.f23237o) == null || K4.c.a(jSONObject, jSONObject2)) && this.f23240r == pVar.f23240r && y4.a.e(this.f23241s, pVar.f23241s) && y4.a.e(this.f23242t, pVar.f23242t) && y4.a.e(this.f23243u, pVar.f23243u) && F4.y.k(this.f23244v, pVar.f23244v) && this.f23245w == pVar.f23245w)) {
                }
            }
            return false;
        }
        return true;
    }

    public final n f(int i9) {
        Integer num = (Integer) this.f23246x.get(i9);
        if (num == null) {
            return null;
        }
        return (n) this.f23239q.get(num.intValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x022b, code lost:
    
        if (r15 != 3) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x022f, code lost:
    
        if (r2 != 2) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0232, code lost:
    
        if (r3 == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x01aa, code lost:
    
        if (r33.f23233k != null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x038f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x044a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x03bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x036e A[Catch: JSONException -> 0x0379, TryCatch #1 {JSONException -> 0x0379, blocks: (B:379:0x0348, B:381:0x036e, B:382:0x036f), top: B:378:0x0348 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, t4.m] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, t4.l] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(org.json.JSONObject r34, int r35) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.p.g(org.json.JSONObject, int):int");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23224a, Long.valueOf(this.f23225b), Integer.valueOf(this.f23226c), Double.valueOf(this.f23227d), Integer.valueOf(this.f23228e), Integer.valueOf(this.f23229f), Long.valueOf(this.f23230g), Long.valueOf(this.f23231h), Double.valueOf(this.f23232i), Boolean.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.f23233k)), Integer.valueOf(this.f23234l), Integer.valueOf(this.f23235m), String.valueOf(this.f23237o), Integer.valueOf(this.f23238p), this.f23239q, Boolean.valueOf(this.f23240r), this.f23241s, this.f23242t, this.f23243u, this.f23244v});
    }

    public final void i(ArrayList arrayList) {
        ArrayList arrayList2 = this.f23239q;
        arrayList2.clear();
        SparseArray sparseArray = this.f23246x;
        sparseArray.clear();
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                n nVar = (n) arrayList.get(i9);
                arrayList2.add(nVar);
                sparseArray.put(nVar.f23215b, Integer.valueOf(i9));
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        JSONObject jSONObject2 = this.f23237o;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f23236n = jSONObject;
        int R2 = s8.n.R(parcel, 20293);
        s8.n.L(parcel, 2, this.f23224a, i9);
        long j = this.f23225b;
        s8.n.V(parcel, 3, 8);
        parcel.writeLong(j);
        int i10 = this.f23226c;
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(i10);
        double d9 = this.f23227d;
        s8.n.V(parcel, 5, 8);
        parcel.writeDouble(d9);
        int i11 = this.f23228e;
        s8.n.V(parcel, 6, 4);
        parcel.writeInt(i11);
        int i12 = this.f23229f;
        s8.n.V(parcel, 7, 4);
        parcel.writeInt(i12);
        long j4 = this.f23230g;
        s8.n.V(parcel, 8, 8);
        parcel.writeLong(j4);
        long j9 = this.f23231h;
        s8.n.V(parcel, 9, 8);
        parcel.writeLong(j9);
        double d10 = this.f23232i;
        s8.n.V(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z9 = this.j;
        s8.n.V(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        s8.n.K(parcel, 12, this.f23233k);
        int i13 = this.f23234l;
        s8.n.V(parcel, 13, 4);
        parcel.writeInt(i13);
        int i14 = this.f23235m;
        s8.n.V(parcel, 14, 4);
        parcel.writeInt(i14);
        s8.n.M(parcel, 15, this.f23236n);
        int i15 = this.f23238p;
        s8.n.V(parcel, 16, 4);
        parcel.writeInt(i15);
        s8.n.P(parcel, 17, this.f23239q);
        boolean z10 = this.f23240r;
        s8.n.V(parcel, 18, 4);
        parcel.writeInt(z10 ? 1 : 0);
        s8.n.L(parcel, 19, this.f23241s, i9);
        s8.n.L(parcel, 20, this.f23242t, i9);
        s8.n.L(parcel, 21, this.f23243u, i9);
        s8.n.L(parcel, 22, this.f23244v, i9);
        s8.n.U(parcel, R2);
    }
}
