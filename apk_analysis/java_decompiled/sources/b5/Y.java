package b5;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10990a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final URL f10991b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10992c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10993d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10994e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f10995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D.n f10996g;

    public Y(Z z9, String str, URL url, byte[] bArr, Map map, X x5) {
        this.f10996g = z9;
        F4.y.e(str);
        F4.y.h(url);
        this.f10991b = url;
        this.f10992c = bArr;
        this.f10994e = x5;
        this.f10993d = str;
        this.f10995f = map;
    }

    public void a(int i9, IOException iOException, byte[] bArr, Map map) {
        C0647m0 c0647m0 = ((C0650n0) ((W0) this.f10996g).f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new V0(this, i9, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0287: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:648), block:B:178:0x0285 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x028a: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:651), block:B:175:0x0289 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.Y.run():void");
    }

    public Y(W0 w02, String str, URL url, byte[] bArr, HashMap hashMap, U0 u02) {
        this.f10996g = w02;
        F4.y.e(str);
        this.f10991b = url;
        this.f10992c = bArr;
        this.f10994e = u02;
        this.f10993d = str;
        this.f10995f = hashMap;
    }
}
