package D0;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1755b;

    public /* synthetic */ e(Context context, int i9) {
        this.f1754a = i9;
        this.f1755b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f1754a
            switch(r0) {
                case 0: goto L97;
                case 1: goto L88;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L85
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.f1755b
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto L85
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L5e
            s.f r0 = i.l.f18079g
            r0.getClass()
            s.a r2 = new s.a
            r2.<init>(r0)
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            i.l r0 = (i.l) r0
            if (r0 == 0) goto L2d
            i.w r0 = (i.w) r0
            android.content.Context r0 = r0.f18130k
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r0.getSystemService(r5)
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 == 0) goto L63
            android.os.LocaleList r0 = i.k.a(r0)
            L.g r2 = new L.g
            L.j r6 = new L.j
            r6.<init>(r0)
            r2.<init>(r6)
            goto L65
        L5e:
            L.g r2 = i.l.f18075c
            if (r2 == 0) goto L63
            goto L65
        L63:
            L.g r2 = L.g.f4446b
        L65:
            L.i r0 = r2.f4447a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7e
            java.lang.String r0 = D.c.e(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto L7e
            android.os.LocaleList r0 = i.j.a(r0)
            i.k.b(r2, r0)
        L7e:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L85:
            i.l.f18078f = r1
            return
        L88:
            C0.e r0 = new C0.e
            r1 = 0
            r0.<init>(r1)
            Q6.f r1 = D0.d.f1745a
            r2 = 0
            android.content.Context r3 = r11.f1755b
            D0.d.s(r3, r0, r1, r2)
            return
        L97:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            D0.e r0 = new D0.e
            android.content.Context r1 = r11.f1755b
            r2 = 1
            r0.<init>(r1, r2)
            r4.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.e.run():void");
    }
}
