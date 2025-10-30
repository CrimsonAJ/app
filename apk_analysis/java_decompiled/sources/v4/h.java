package v4;

import F4.y;
import android.os.Looper;
import android.text.TextUtils;
import b5.G1;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import i.G;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import t4.C2009A;

/* loaded from: classes.dex */
public final class h implements t4.f {

    /* renamed from: k, reason: collision with root package name */
    public static final y4.b f23846k = new y4.b("RemoteMediaClient", null);

    /* renamed from: c, reason: collision with root package name */
    public final y4.n f23849c;

    /* renamed from: d, reason: collision with root package name */
    public final q f23850d;

    /* renamed from: e, reason: collision with root package name */
    public final c f23851e;

    /* renamed from: f, reason: collision with root package name */
    public C2009A f23852f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f23853g = new CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f23854h = new CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f23855i = new ConcurrentHashMap();
    public final ConcurrentHashMap j = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Object f23847a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final T4.d f23848b = new T4.d(Looper.getMainLooper(), 4);

    static {
        String str = y4.n.f24941y;
    }

    public h(y4.n nVar) {
        q qVar = new q(this);
        this.f23850d = qVar;
        this.f23849c = nVar;
        nVar.f24945h = new G(18, this);
        nVar.f8441c = qVar;
        this.f23851e = new c(this);
    }

    public static D4.m r() {
        D4.m mVar = new D4.m(null, 1);
        mVar.J(new r(new Status(17, null, null, null), 0));
        return mVar;
    }

    public static final void x(s sVar) {
        try {
            sVar.P();
        } catch (IllegalArgumentException e8) {
            throw e8;
        } catch (Throwable unused) {
            sVar.J(new r(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long A2;
        synchronized (this.f23847a) {
            y.d();
            A2 = this.f23849c.A();
        }
        return A2;
    }

    public final t4.n b() {
        y.d();
        t4.p d9 = d();
        if (d9 == null) {
            return null;
        }
        return d9.f(d9.f23234l);
    }

    public final MediaInfo c() {
        MediaInfo mediaInfo;
        synchronized (this.f23847a) {
            y.d();
            t4.p pVar = this.f23849c.f24943f;
            if (pVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = pVar.f23224a;
            }
        }
        return mediaInfo;
    }

    public final t4.p d() {
        t4.p pVar;
        synchronized (this.f23847a) {
            y.d();
            pVar = this.f23849c.f24943f;
        }
        return pVar;
    }

    public final int e() {
        int i9;
        synchronized (this.f23847a) {
            y.d();
            t4.p d9 = d();
            if (d9 != null) {
                i9 = d9.f23228e;
            } else {
                i9 = 1;
            }
        }
        return i9;
    }

    public final long f() {
        MediaInfo mediaInfo;
        long j;
        synchronized (this.f23847a) {
            y.d();
            t4.p pVar = this.f23849c.f24943f;
            if (pVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = pVar.f23224a;
            }
            if (mediaInfo != null) {
                j = mediaInfo.f14612e;
            } else {
                j = 0;
            }
        }
        return j;
    }

    public final boolean g() {
        y.d();
        if (!h() && !u() && !l() && !k() && !j()) {
            return false;
        }
        return true;
    }

    public final boolean h() {
        y.d();
        t4.p d9 = d();
        if (d9 != null && d9.f23228e == 4) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        y.d();
        MediaInfo c3 = c();
        if (c3 != null && c3.f14609b == 2) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        y.d();
        t4.p d9 = d();
        if (d9 != null && d9.f23234l != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        int i9;
        y.d();
        t4.p d9 = d();
        if (d9 != null) {
            if (d9.f23228e != 3) {
                if (i()) {
                    synchronized (this.f23847a) {
                        y.d();
                        t4.p d10 = d();
                        if (d10 != null) {
                            i9 = d10.f23229f;
                        } else {
                            i9 = 0;
                        }
                    }
                    if (i9 == 2) {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        y.d();
        t4.p d9 = d();
        if (d9 != null && d9.f23228e == 2) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        y.d();
        t4.p d9 = d();
        if (d9 != null && d9.f23240r) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03e5, code lost:
    
        if (r3 != false) goto L189;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0316 A[Catch: JSONException -> 0x00d8, TryCatch #0 {JSONException -> 0x00d8, blocks: (B:3:0x0019, B:11:0x00a4, B:16:0x00b3, B:17:0x00c0, B:19:0x00c6, B:21:0x00db, B:22:0x00e7, B:24:0x00ed, B:27:0x00f7, B:29:0x0104, B:31:0x0119, B:43:0x0159, B:45:0x016e, B:46:0x018e, B:48:0x0194, B:51:0x019e, B:52:0x01aa, B:54:0x01b0, B:58:0x01ba, B:59:0x01c6, B:61:0x01cc, B:64:0x01d6, B:65:0x01e2, B:67:0x01e8, B:70:0x01f2, B:71:0x01fe, B:73:0x0204, B:88:0x020e, B:90:0x021b, B:92:0x0225, B:93:0x0231, B:95:0x0237, B:100:0x0241, B:101:0x0245, B:103:0x024b, B:105:0x025b, B:107:0x025f, B:108:0x026e, B:110:0x0274, B:114:0x027e, B:115:0x028e, B:117:0x0294, B:120:0x02a4, B:122:0x02ae, B:124:0x02b8, B:125:0x02c8, B:127:0x02ce, B:130:0x02de, B:132:0x02ea, B:134:0x02fb, B:139:0x0316, B:142:0x031b, B:144:0x0362, B:146:0x0366, B:148:0x0375, B:150:0x0379, B:151:0x0382, B:153:0x0386, B:154:0x038c, B:156:0x0390, B:157:0x0393, B:159:0x0397, B:160:0x039a, B:162:0x039e, B:163:0x03a1, B:165:0x03a5, B:167:0x03af, B:169:0x03bf, B:170:0x03c5, B:172:0x03cb, B:174:0x03d5, B:175:0x03d9, B:176:0x03da, B:178:0x03de, B:179:0x03e7, B:180:0x03f9, B:181:0x03fd, B:183:0x0403, B:189:0x0322, B:190:0x0304, B:192:0x030c, B:196:0x03eb), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0366 A[Catch: JSONException -> 0x00d8, TryCatch #0 {JSONException -> 0x00d8, blocks: (B:3:0x0019, B:11:0x00a4, B:16:0x00b3, B:17:0x00c0, B:19:0x00c6, B:21:0x00db, B:22:0x00e7, B:24:0x00ed, B:27:0x00f7, B:29:0x0104, B:31:0x0119, B:43:0x0159, B:45:0x016e, B:46:0x018e, B:48:0x0194, B:51:0x019e, B:52:0x01aa, B:54:0x01b0, B:58:0x01ba, B:59:0x01c6, B:61:0x01cc, B:64:0x01d6, B:65:0x01e2, B:67:0x01e8, B:70:0x01f2, B:71:0x01fe, B:73:0x0204, B:88:0x020e, B:90:0x021b, B:92:0x0225, B:93:0x0231, B:95:0x0237, B:100:0x0241, B:101:0x0245, B:103:0x024b, B:105:0x025b, B:107:0x025f, B:108:0x026e, B:110:0x0274, B:114:0x027e, B:115:0x028e, B:117:0x0294, B:120:0x02a4, B:122:0x02ae, B:124:0x02b8, B:125:0x02c8, B:127:0x02ce, B:130:0x02de, B:132:0x02ea, B:134:0x02fb, B:139:0x0316, B:142:0x031b, B:144:0x0362, B:146:0x0366, B:148:0x0375, B:150:0x0379, B:151:0x0382, B:153:0x0386, B:154:0x038c, B:156:0x0390, B:157:0x0393, B:159:0x0397, B:160:0x039a, B:162:0x039e, B:163:0x03a1, B:165:0x03a5, B:167:0x03af, B:169:0x03bf, B:170:0x03c5, B:172:0x03cb, B:174:0x03d5, B:175:0x03d9, B:176:0x03da, B:178:0x03de, B:179:0x03e7, B:180:0x03f9, B:181:0x03fd, B:183:0x0403, B:189:0x0322, B:190:0x0304, B:192:0x030c, B:196:0x03eb), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0379 A[Catch: JSONException -> 0x00d8, TryCatch #0 {JSONException -> 0x00d8, blocks: (B:3:0x0019, B:11:0x00a4, B:16:0x00b3, B:17:0x00c0, B:19:0x00c6, B:21:0x00db, B:22:0x00e7, B:24:0x00ed, B:27:0x00f7, B:29:0x0104, B:31:0x0119, B:43:0x0159, B:45:0x016e, B:46:0x018e, B:48:0x0194, B:51:0x019e, B:52:0x01aa, B:54:0x01b0, B:58:0x01ba, B:59:0x01c6, B:61:0x01cc, B:64:0x01d6, B:65:0x01e2, B:67:0x01e8, B:70:0x01f2, B:71:0x01fe, B:73:0x0204, B:88:0x020e, B:90:0x021b, B:92:0x0225, B:93:0x0231, B:95:0x0237, B:100:0x0241, B:101:0x0245, B:103:0x024b, B:105:0x025b, B:107:0x025f, B:108:0x026e, B:110:0x0274, B:114:0x027e, B:115:0x028e, B:117:0x0294, B:120:0x02a4, B:122:0x02ae, B:124:0x02b8, B:125:0x02c8, B:127:0x02ce, B:130:0x02de, B:132:0x02ea, B:134:0x02fb, B:139:0x0316, B:142:0x031b, B:144:0x0362, B:146:0x0366, B:148:0x0375, B:150:0x0379, B:151:0x0382, B:153:0x0386, B:154:0x038c, B:156:0x0390, B:157:0x0393, B:159:0x0397, B:160:0x039a, B:162:0x039e, B:163:0x03a1, B:165:0x03a5, B:167:0x03af, B:169:0x03bf, B:170:0x03c5, B:172:0x03cb, B:174:0x03d5, B:175:0x03d9, B:176:0x03da, B:178:0x03de, B:179:0x03e7, B:180:0x03f9, B:181:0x03fd, B:183:0x0403, B:189:0x0322, B:190:0x0304, B:192:0x030c, B:196:0x03eb), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0386 A[Catch: JSONException -> 0x00d8, TryCatch #0 {JSONException -> 0x00d8, blocks: (B:3:0x0019, B:11:0x00a4, B:16:0x00b3, B:17:0x00c0, B:19:0x00c6, B:21:0x00db, B:22:0x00e7, B:24:0x00ed, B:27:0x00f7, B:29:0x0104, B:31:0x0119, B:43:0x0159, B:45:0x016e, B:46:0x018e, B:48:0x0194, B:51:0x019e, B:52:0x01aa, B:54:0x01b0, B:58:0x01ba, B:59:0x01c6, B:61:0x01cc, B:64:0x01d6, B:65:0x01e2, B:67:0x01e8, B:70:0x01f2, B:71:0x01fe, B:73:0x0204, B:88:0x020e, B:90:0x021b, B:92:0x0225, B:93:0x0231, B:95:0x0237, B:100:0x0241, B:101:0x0245, B:103:0x024b, B:105:0x025b, B:107:0x025f, B:108:0x026e, B:110:0x0274, B:114:0x027e, B:115:0x028e, B:117:0x0294, B:120:0x02a4, B:122:0x02ae, B:124:0x02b8, B:125:0x02c8, B:127:0x02ce, B:130:0x02de, B:132:0x02ea, B:134:0x02fb, B:139:0x0316, B:142:0x031b, B:144:0x0362, B:146:0x0366, B:148:0x0375, B:150:0x0379, B:151:0x0382, B:153:0x0386, B:154:0x038c, B:156:0x0390, B:157:0x0393, B:159:0x0397, B:160:0x039a, B:162:0x039e, B:163:0x03a1, B:165:0x03a5, B:167:0x03af, B:169:0x03bf, B:170:0x03c5, B:172:0x03cb, B:174:0x03d5, B:175:0x03d9, B:176:0x03da, B:178:0x03de, B:179:0x03e7, B:180:0x03f9, B:181:0x03fd, B:183:0x0403, B:189:0x0322, B:190:0x0304, B:192:0x030c, B:196:0x03eb), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0390 A[Catch: JSONException -> 0x00d8, TryCatch #0 {JSONException -> 0x00d8, blocks: (B:3:0x0019, B:11:0x00a4, B:16:0x00b3, B:17:0x00c0, B:19:0x00c6, B:21:0x00db, B:22:0x00e7, B:24:0x00ed, B:27:0x00f7, B:29:0x0104, B:31:0x0119, B:43:0x0159, B:45:0x016e, B:46:0x018e, B:48:0x0194, B:51:0x019e, B:52:0x01aa, B:54:0x01b0, B:58:0x01ba, B:59:0x01c6, B:61:0x01cc, B:64:0x01d6, B:65:0x01e2, B:67:0x01e8, B:70:0x01f2, B:71:0x01fe, B:73:0x0204, B:88:0x020e, B:90:0x021b, B:92:0x0225, B:93:0x0231, B:95:0x0237, B:100:0x0241, B:101:0x0245, B:103:0x024b, B:105:0x025b, B:107:0x025f, B:108:0x026e, B:110:0x0274, B:114:0x027e, B:115:0x028e, B:117:0x0294, B:120:0x02a4, B:122:0x02ae, B:124:0x02b8, B:125:0x02c8, B:127:0x02ce, B:130:0x02de, B:132:0x02ea, B:134:0x02fb, B:139:0x0316, B:142:0x031b, B:144:0x0362, B:146:0x0366, B:148:0x0375, B:150:0x0379, B:151:0x0382, B:153:0x0386, B:154:0x038c, B:156:0x0390, B:157:0x0393, B:159:0x0397, B:160:0x039a, B:162:0x039e, B:163:0x03a1, B:165:0x03a5, B:167:0x03af, B:169:0x03bf, B:170:0x03c5, B:172:0x03cb, B:174:0x03d5, B:175:0x03d9, B:176:0x03da, B:178:0x03de, B:179:0x03e7, B:180:0x03f9, B:181:0x03fd, B:183:0x0403, B:189:0x0322, B:190:0x0304, B:192:0x030c, B:196:0x03eb), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0397 A[Catch: JSONException -> 0x00d8, TryCatch #0 {JSONException -> 0x00d8, blocks: (B:3:0x0019, B:11:0x00a4, B:16:0x00b3, B:17:0x00c0, B:19:0x00c6, B:21:0x00db, B:22:0x00e7, B:24:0x00ed, B:27:0x00f7, B:29:0x0104, B:31:0x0119, B:43:0x0159, B:45:0x016e, B:46:0x018e, B:48:0x0194, B:51:0x019e, B:52:0x01aa, B:54:0x01b0, B:58:0x01ba, B:59:0x01c6, B:61:0x01cc, B:64:0x01d6, B:65:0x01e2, B:67:0x01e8, B:70:0x01f2, B:71:0x01fe, B:73:0x0204, B:88:0x020e, B:90:0x021b, B:92:0x0225, B:93:0x0231, B:95:0x0237, B:100:0x0241, B:101:0x0245, B:103:0x024b, B:105:0x025b, B:107:0x025f, B:108:0x026e, B:110:0x0274, B:114:0x027e, B:115:0x028e, B:117:0x0294, B:120:0x02a4, B:122:0x02ae, B:124:0x02b8, B:125:0x02c8, B:127:0x02ce, B:130:0x02de, B:132:0x02ea, B:134:0x02fb, B:139:0x0316, B:142:0x031b, B:144:0x0362, B:146:0x0366, B:148:0x0375, B:150:0x0379, B:151:0x0382, B:153:0x0386, B:154:0x038c, B:156:0x0390, B:157:0x0393, B:159:0x0397, B:160:0x039a, B:162:0x039e, B:163:0x03a1, B:165:0x03a5, B:167:0x03af, B:169:0x03bf, B:170:0x03c5, B:172:0x03cb, B:174:0x03d5, B:175:0x03d9, B:176:0x03da, B:178:0x03de, B:179:0x03e7, B:180:0x03f9, B:181:0x03fd, B:183:0x0403, B:189:0x0322, B:190:0x0304, B:192:0x030c, B:196:0x03eb), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039e A[Catch: JSONException -> 0x00d8, TryCatch #0 {JSONException -> 0x00d8, blocks: (B:3:0x0019, B:11:0x00a4, B:16:0x00b3, B:17:0x00c0, B:19:0x00c6, B:21:0x00db, B:22:0x00e7, B:24:0x00ed, B:27:0x00f7, B:29:0x0104, B:31:0x0119, B:43:0x0159, B:45:0x016e, B:46:0x018e, B:48:0x0194, B:51:0x019e, B:52:0x01aa, B:54:0x01b0, B:58:0x01ba, B:59:0x01c6, B:61:0x01cc, B:64:0x01d6, B:65:0x01e2, B:67:0x01e8, B:70:0x01f2, B:71:0x01fe, B:73:0x0204, B:88:0x020e, B:90:0x021b, B:92:0x0225, B:93:0x0231, B:95:0x0237, B:100:0x0241, B:101:0x0245, B:103:0x024b, B:105:0x025b, B:107:0x025f, B:108:0x026e, B:110:0x0274, B:114:0x027e, B:115:0x028e, B:117:0x0294, B:120:0x02a4, B:122:0x02ae, B:124:0x02b8, B:125:0x02c8, B:127:0x02ce, B:130:0x02de, B:132:0x02ea, B:134:0x02fb, B:139:0x0316, B:142:0x031b, B:144:0x0362, B:146:0x0366, B:148:0x0375, B:150:0x0379, B:151:0x0382, B:153:0x0386, B:154:0x038c, B:156:0x0390, B:157:0x0393, B:159:0x0397, B:160:0x039a, B:162:0x039e, B:163:0x03a1, B:165:0x03a5, B:167:0x03af, B:169:0x03bf, B:170:0x03c5, B:172:0x03cb, B:174:0x03d5, B:175:0x03d9, B:176:0x03da, B:178:0x03de, B:179:0x03e7, B:180:0x03f9, B:181:0x03fd, B:183:0x0403, B:189:0x0322, B:190:0x0304, B:192:0x030c, B:196:0x03eb), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a5 A[Catch: JSONException -> 0x00d8, TryCatch #0 {JSONException -> 0x00d8, blocks: (B:3:0x0019, B:11:0x00a4, B:16:0x00b3, B:17:0x00c0, B:19:0x00c6, B:21:0x00db, B:22:0x00e7, B:24:0x00ed, B:27:0x00f7, B:29:0x0104, B:31:0x0119, B:43:0x0159, B:45:0x016e, B:46:0x018e, B:48:0x0194, B:51:0x019e, B:52:0x01aa, B:54:0x01b0, B:58:0x01ba, B:59:0x01c6, B:61:0x01cc, B:64:0x01d6, B:65:0x01e2, B:67:0x01e8, B:70:0x01f2, B:71:0x01fe, B:73:0x0204, B:88:0x020e, B:90:0x021b, B:92:0x0225, B:93:0x0231, B:95:0x0237, B:100:0x0241, B:101:0x0245, B:103:0x024b, B:105:0x025b, B:107:0x025f, B:108:0x026e, B:110:0x0274, B:114:0x027e, B:115:0x028e, B:117:0x0294, B:120:0x02a4, B:122:0x02ae, B:124:0x02b8, B:125:0x02c8, B:127:0x02ce, B:130:0x02de, B:132:0x02ea, B:134:0x02fb, B:139:0x0316, B:142:0x031b, B:144:0x0362, B:146:0x0366, B:148:0x0375, B:150:0x0379, B:151:0x0382, B:153:0x0386, B:154:0x038c, B:156:0x0390, B:157:0x0393, B:159:0x0397, B:160:0x039a, B:162:0x039e, B:163:0x03a1, B:165:0x03a5, B:167:0x03af, B:169:0x03bf, B:170:0x03c5, B:172:0x03cb, B:174:0x03d5, B:175:0x03d9, B:176:0x03da, B:178:0x03de, B:179:0x03e7, B:180:0x03f9, B:181:0x03fd, B:183:0x0403, B:189:0x0322, B:190:0x0304, B:192:0x030c, B:196:0x03eb), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03de A[Catch: JSONException -> 0x00d8, TryCatch #0 {JSONException -> 0x00d8, blocks: (B:3:0x0019, B:11:0x00a4, B:16:0x00b3, B:17:0x00c0, B:19:0x00c6, B:21:0x00db, B:22:0x00e7, B:24:0x00ed, B:27:0x00f7, B:29:0x0104, B:31:0x0119, B:43:0x0159, B:45:0x016e, B:46:0x018e, B:48:0x0194, B:51:0x019e, B:52:0x01aa, B:54:0x01b0, B:58:0x01ba, B:59:0x01c6, B:61:0x01cc, B:64:0x01d6, B:65:0x01e2, B:67:0x01e8, B:70:0x01f2, B:71:0x01fe, B:73:0x0204, B:88:0x020e, B:90:0x021b, B:92:0x0225, B:93:0x0231, B:95:0x0237, B:100:0x0241, B:101:0x0245, B:103:0x024b, B:105:0x025b, B:107:0x025f, B:108:0x026e, B:110:0x0274, B:114:0x027e, B:115:0x028e, B:117:0x0294, B:120:0x02a4, B:122:0x02ae, B:124:0x02b8, B:125:0x02c8, B:127:0x02ce, B:130:0x02de, B:132:0x02ea, B:134:0x02fb, B:139:0x0316, B:142:0x031b, B:144:0x0362, B:146:0x0366, B:148:0x0375, B:150:0x0379, B:151:0x0382, B:153:0x0386, B:154:0x038c, B:156:0x0390, B:157:0x0393, B:159:0x0397, B:160:0x039a, B:162:0x039e, B:163:0x03a1, B:165:0x03a5, B:167:0x03af, B:169:0x03bf, B:170:0x03c5, B:172:0x03cb, B:174:0x03d5, B:175:0x03d9, B:176:0x03da, B:178:0x03de, B:179:0x03e7, B:180:0x03f9, B:181:0x03fd, B:183:0x0403, B:189:0x0322, B:190:0x0304, B:192:0x030c, B:196:0x03eb), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0373  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.h.n(java.lang.String):void");
    }

    public final void o(g gVar) {
        y.d();
        if (gVar != null) {
            this.f23854h.add(gVar);
        }
    }

    public final void p() {
        y.d();
        int e8 = e();
        if (e8 != 4 && e8 != 2) {
            y.d();
            if (!w()) {
                r();
                return;
            } else {
                x(new k(this, 5));
                return;
            }
        }
        y.d();
        if (!w()) {
            r();
        } else {
            x(new k(this, 3));
        }
    }

    public final int q() {
        t4.n b9;
        if (c() != null && g()) {
            if (h()) {
                return 6;
            }
            if (l()) {
                return 3;
            }
            if (k()) {
                return 2;
            }
            if (j() && (b9 = b()) != null && b9.f23214a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void s() {
        C2009A c2009a = this.f23852f;
        if (c2009a == null) {
            return;
        }
        y.d();
        String str = this.f23849c.f8439a;
        y4.a.c(str);
        HashMap hashMap = c2009a.f23124C;
        synchronized (hashMap) {
            hashMap.put(str, this);
        }
        D4.n g9 = D4.n.g();
        g9.f1864e = new t4.x(c2009a, str, this);
        g9.f1863d = 8413;
        c2009a.c(1, g9.f());
        y.d();
        if (!w()) {
            r();
        } else {
            x(new k(this, 6));
        }
    }

    public final void t(C2009A c2009a) {
        t4.f fVar;
        C2009A c2009a2 = this.f23852f;
        if (c2009a2 != c2009a) {
            if (c2009a2 != null) {
                this.f23849c.z();
                this.f23851e.c();
                y.d();
                String str = this.f23849c.f8439a;
                if (!TextUtils.isEmpty(str)) {
                    HashMap hashMap = c2009a2.f23124C;
                    synchronized (hashMap) {
                        fVar = (t4.f) hashMap.remove(str);
                    }
                    D4.n g9 = D4.n.g();
                    g9.f1864e = new G1(c2009a2, fVar, str, 26, false);
                    g9.f1863d = 8414;
                    c2009a2.c(1, g9.f());
                    this.f23850d.f23876a = null;
                    this.f23848b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f23852f = c2009a;
            if (c2009a != null) {
                this.f23850d.f23876a = c2009a;
            }
        }
    }

    public final boolean u() {
        y.d();
        t4.p d9 = d();
        if (d9 != null && d9.f23228e == 5) {
            return true;
        }
        return false;
    }

    public final void v(HashSet hashSet) {
        HashSet hashSet2 = new HashSet(hashSet);
        if (!l() && !k() && !h() && !u()) {
            if (j()) {
                t4.n b9 = b();
                if (b9 != null && b9.f23214a != null) {
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        ((o3.d) it.next()).f21557a.f21578u = 0L;
                    }
                    return;
                }
                return;
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ((o3.d) it2.next()).f21557a.f21578u = 0L;
            }
            return;
        }
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            o3.d dVar = (o3.d) it3.next();
            long a5 = a();
            f();
            dVar.f21557a.f21578u = a5;
        }
    }

    public final boolean w() {
        if (this.f23852f != null) {
            return true;
        }
        return false;
    }
}
