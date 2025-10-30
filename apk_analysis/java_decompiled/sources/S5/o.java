package S5;

import D4.J;
import D4.x;
import F4.y;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.widget.ProgressBar;
import b5.ServiceConnectionC0626f0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.measurement.B;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6963a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6964b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6965c;

    public o(ServiceConnectionC0626f0 serviceConnectionC0626f0, B b9, ServiceConnectionC0626f0 serviceConnectionC0626f02) {
        this.f6963a = 16;
        this.f6964b = b9;
        this.f6965c = serviceConnectionC0626f0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [A4.p, java.lang.Exception] */
    private final void a() {
        A4.n nVar = (A4.n) this.f6964b;
        int i9 = ((A4.o) this.f6965c).f372a;
        synchronized (nVar) {
            A4.o oVar = (A4.o) nVar.f370e.get(i9);
            if (oVar != 0) {
                Log.w("MessengerIpcClient", "Timing out request: " + i9);
                nVar.f370e.remove(i9);
                oVar.b(new Exception("Timed out waiting for response", null));
                nVar.c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [D4.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [D4.h, java.lang.Object] */
    private final void b() {
        Object[] objArr;
        int i9 = 0;
        Object[] objArr2 = 0;
        if (((D4.p) this.f6965c).f1869b) {
            B4.b bVar = ((J) this.f6964b).f1826b;
            if (bVar.f685b != 0 && bVar.f686c != null) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (objArr != false) {
                D4.p pVar = (D4.p) this.f6965c;
                ?? r42 = pVar.f1868a;
                Activity a5 = pVar.a();
                PendingIntent pendingIntent = bVar.f686c;
                y.h(pendingIntent);
                int i10 = ((J) this.f6964b).f1825a;
                int i11 = GoogleApiActivity.f14651b;
                Intent intent = new Intent(a5, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", false);
                r42.a(intent, 1);
                return;
            }
            D4.p pVar2 = (D4.p) this.f6965c;
            if (pVar2.f1872e.a(bVar.f685b, pVar2.a(), null) != null) {
                D4.p pVar3 = (D4.p) this.f6965c;
                pVar3.f1872e.g(pVar3.a(), pVar3.f1868a, bVar.f685b, (D4.p) this.f6965c);
                return;
            }
            if (bVar.f685b == 18) {
                D4.p pVar4 = (D4.p) this.f6965c;
                B4.f fVar = pVar4.f1872e;
                Activity a9 = pVar4.a();
                fVar.getClass();
                ProgressBar progressBar = new ProgressBar(a9, null, R.attr.progressBarStyleLarge);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(a9);
                builder.setView(progressBar);
                builder.setMessage(F4.o.b(a9, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                B4.f.e(a9, create, "GooglePlayServicesUpdatingDialog", pVar4);
                D4.p pVar5 = (D4.p) this.f6965c;
                Context applicationContext = pVar5.a().getApplicationContext();
                A1.g gVar = new A1.g(this, create, 9, objArr2 == true ? 1 : 0);
                pVar5.f1872e.getClass();
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                x xVar = new x(gVar);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 33) {
                    if (i12 >= 33) {
                        i9 = 2;
                    }
                    applicationContext.registerReceiver(xVar, intentFilter, i9);
                } else {
                    applicationContext.registerReceiver(xVar, intentFilter);
                }
                xVar.f1903b = applicationContext;
                if (!B4.h.b(applicationContext)) {
                    D4.p pVar6 = (D4.p) this.f6965c;
                    pVar6.f1870c.set(null);
                    T4.d dVar = pVar6.f1874g.f1855n;
                    dVar.sendMessage(dVar.obtainMessage(3));
                    if (create.isShowing()) {
                        create.dismiss();
                    }
                    synchronized (xVar) {
                        try {
                            Context context = xVar.f1903b;
                            if (context != null) {
                                context.unregisterReceiver(xVar);
                            }
                            xVar.f1903b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            }
            D4.p pVar7 = (D4.p) this.f6965c;
            int i13 = ((J) this.f6964b).f1825a;
            pVar7.f1870c.set(null);
            pVar7.f1874g.h(bVar, i13);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:201|(2:203|(10:262|227|(1:229)|230|231|232|233|234|235|(5:241|(1:243)(1:251)|(1:247)|(1:249)|250)))(1:263)|207|(4:209|(2:212|(2:214|215))|260|215)(1:261)|(5:217|(1:219)(1:258)|220|(1:222)|223)(1:259)|224|(1:226)(1:257)|227|(0)|230|231|232|233|234|235|(2:237|239)|241|(0)(0)|(2:245|247)|(0)|250) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:18|(1:20)(9:364|365|366|367|(1:369)(2:390|(4:392|371|372|(32:374|(1:376)(1:388)|377|378|380|381|382|22|23|(4:27|(1:29)(1:362)|30|(22:32|33|(2:35|(2:37|(2:39|(2:41|(2:43|(2:45|(1:47)(1:355))(1:356))(1:357))(1:358))(1:359))(1:360))(1:361)|48|(1:50)|51|52|(1:54)(1:351)|55|(6:59|(1:61)(1:69)|62|(3:64|65|66)|68|66)|(3:71|(1:73)(1:76)|74)|77|78|(1:80)(2:348|(8:350|(3:341|342|(6:344|(5:85|(1:87)(3:332|(3:335|(1:337)(1:338)|333)|339)|(1:89)(1:331)|90|(10:92|(2:94|(1:96)(1:97))|98|(1:100)|101|(2:103|(4:105|106|(1:108)|(39:326|110|(1:112)|113|(1:115)(2:321|(1:323)(1:324))|116|(1:118)|119|(2:318|(22:320|(1:138)|139|(1:141)|142|(2:268|(4:274|(2:281|(2:282|(1:289)(2:284|(2:286|287)(1:288))))(0)|290|(13:299|148|(3:264|(1:266)|267)|152|(1:154)|155|(1:159)|160|(3:162|(7:164|(1:166)(1:199)|167|(1:169)|170|(4:174|(1:176)|177|(1:179))|180)(1:200)|181)(21:201|(2:203|(10:262|227|(1:229)|230|231|232|233|234|235|(5:241|(1:243)(1:251)|(1:247)|(1:249)|250)))(1:263)|207|(4:209|(2:212|(2:214|215))|260|215)(1:261)|(5:217|(1:219)(1:258)|220|(1:222)|223)(1:259)|224|(1:226)(1:257)|227|(0)|230|231|232|233|234|235|(2:237|239)|241|(0)(0)|(2:245|247)|(0)|250)|182|(3:184|(1:186)(1:195)|(5:188|(1:190)|191|(1:193)|194))|196|197))(1:273))(1:146)|147|148|(1:150)|264|(0)|267|152|(0)|155|(2:157|159)|160|(0)(0)|182|(0)|196|197))(1:122)|123|(3:300|301|(3:310|(3:313|(1:315)(1:316)|311)|317))(1:135)|136|(0)|139|(0)|142|(1:144)|268|(1:271)|274|(4:277|279|281|(3:282|(0)(0)|288))(0)|290|(19:293|295|297|299|148|(0)|264|(0)|267|152|(0)|155|(0)|160|(0)(0)|182|(0)|196|197)|147|148|(0)|264|(0)|267|152|(0)|155|(0)|160|(0)(0)|182|(0)|196|197)(38:327|119|(0)|318|(0)|123|(4:125|127|129|133)|300|301|(6:303|306|308|310|(1:311)|317)|136|(0)|139|(0)|142|(0)|268|(0)|274|(0)(0)|290|(0)|147|148|(0)|264|(0)|267|152|(0)|155|(0)|160|(0)(0)|182|(0)|196|197)))|328|106|(0)|(0)(0))(2:329|330))|340|(0)(0)|90|(0)(0)))|83|(0)|340|(0)(0)|90|(0)(0)))|81|(0)|83|(0)|340|(0)(0)|90|(0)(0)))|363|33|(0)(0)|48|(0)|51|52|(0)(0)|55|(7:57|59|(0)(0)|62|(0)|68|66)|(0)|77|78|(0)(0)|81|(0)|83|(0)|340|(0)(0)|90|(0)(0))))|370|371|372|(0))|21|22|23|(5:25|27|(0)(0)|30|(0))|363|33|(0)(0)|48|(0)|51|52|(0)(0)|55|(0)|(0)|77|78|(0)(0)|81|(0)|83|(0)|340|(0)(0)|90|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:364|(2:365|366)|367|(1:369)(2:390|(4:392|371|372|(32:374|(1:376)(1:388)|377|378|380|381|382|22|23|(4:27|(1:29)(1:362)|30|(22:32|33|(2:35|(2:37|(2:39|(2:41|(2:43|(2:45|(1:47)(1:355))(1:356))(1:357))(1:358))(1:359))(1:360))(1:361)|48|(1:50)|51|52|(1:54)(1:351)|55|(6:59|(1:61)(1:69)|62|(3:64|65|66)|68|66)|(3:71|(1:73)(1:76)|74)|77|78|(1:80)(2:348|(8:350|(3:341|342|(6:344|(5:85|(1:87)(3:332|(3:335|(1:337)(1:338)|333)|339)|(1:89)(1:331)|90|(10:92|(2:94|(1:96)(1:97))|98|(1:100)|101|(2:103|(4:105|106|(1:108)|(39:326|110|(1:112)|113|(1:115)(2:321|(1:323)(1:324))|116|(1:118)|119|(2:318|(22:320|(1:138)|139|(1:141)|142|(2:268|(4:274|(2:281|(2:282|(1:289)(2:284|(2:286|287)(1:288))))(0)|290|(13:299|148|(3:264|(1:266)|267)|152|(1:154)|155|(1:159)|160|(3:162|(7:164|(1:166)(1:199)|167|(1:169)|170|(4:174|(1:176)|177|(1:179))|180)(1:200)|181)(21:201|(2:203|(10:262|227|(1:229)|230|231|232|233|234|235|(5:241|(1:243)(1:251)|(1:247)|(1:249)|250)))(1:263)|207|(4:209|(2:212|(2:214|215))|260|215)(1:261)|(5:217|(1:219)(1:258)|220|(1:222)|223)(1:259)|224|(1:226)(1:257)|227|(0)|230|231|232|233|234|235|(2:237|239)|241|(0)(0)|(2:245|247)|(0)|250)|182|(3:184|(1:186)(1:195)|(5:188|(1:190)|191|(1:193)|194))|196|197))(1:273))(1:146)|147|148|(1:150)|264|(0)|267|152|(0)|155|(2:157|159)|160|(0)(0)|182|(0)|196|197))(1:122)|123|(3:300|301|(3:310|(3:313|(1:315)(1:316)|311)|317))(1:135)|136|(0)|139|(0)|142|(1:144)|268|(1:271)|274|(4:277|279|281|(3:282|(0)(0)|288))(0)|290|(19:293|295|297|299|148|(0)|264|(0)|267|152|(0)|155|(0)|160|(0)(0)|182|(0)|196|197)|147|148|(0)|264|(0)|267|152|(0)|155|(0)|160|(0)(0)|182|(0)|196|197)(38:327|119|(0)|318|(0)|123|(4:125|127|129|133)|300|301|(6:303|306|308|310|(1:311)|317)|136|(0)|139|(0)|142|(0)|268|(0)|274|(0)(0)|290|(0)|147|148|(0)|264|(0)|267|152|(0)|155|(0)|160|(0)(0)|182|(0)|196|197)))|328|106|(0)|(0)(0))(2:329|330))|340|(0)(0)|90|(0)(0)))|83|(0)|340|(0)(0)|90|(0)(0)))|81|(0)|83|(0)|340|(0)(0)|90|(0)(0)))|363|33|(0)(0)|48|(0)|51|52|(0)(0)|55|(7:57|59|(0)(0)|62|(0)|68|66)|(0)|77|78|(0)(0)|81|(0)|83|(0)|340|(0)(0)|90|(0)(0))))|370|371|372|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0472, code lost:
    
        if (r4.u1() == 1) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x094d, code lost:
    
        r2 = r22;
        r0 = r2.f11103w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0959, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.m()) == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x095b, code lost:
    
        b5.C0650n0.f(r21);
        r6 = r21;
        r6.f10974i.b("Remote config removed with active feature rollouts");
        r11 = null;
        r0.n(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x096c, code lost:
    
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x02c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x02e1, code lost:
    
        b5.C0650n0.f(r15);
        r15.f10971f.d(b5.V.t0(r8), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0196, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0623 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0647 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0678 A[EDGE_INSN: B:289:0x0678->B:290:0x0678 BREAK  A[LOOP:0: B:282:0x0663->B:288:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0686 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a59  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0323 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0179 A[Catch: NameNotFoundException -> 0x0196, TryCatch #1 {NameNotFoundException -> 0x0196, blocks: (B:372:0x016e, B:374:0x0179, B:376:0x0185), top: B:371:0x016e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0299 A[Catch: IllegalStateException -> 0x02c2, TryCatch #4 {IllegalStateException -> 0x02c2, blocks: (B:52:0x0284, B:55:0x0290, B:57:0x0299, B:59:0x029f, B:62:0x02ae, B:65:0x02b9, B:66:0x02bf, B:69:0x02aa, B:71:0x02c6, B:73:0x02d7, B:74:0x02dc, B:76:0x02da), top: B:51:0x0284 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02aa A[Catch: IllegalStateException -> 0x02c2, TryCatch #4 {IllegalStateException -> 0x02c2, blocks: (B:52:0x0284, B:55:0x0290, B:57:0x0299, B:59:0x029f, B:62:0x02ae, B:65:0x02b9, B:66:0x02bf, B:69:0x02aa, B:71:0x02c6, B:73:0x02d7, B:74:0x02dc, B:76:0x02da), top: B:51:0x0284 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c6 A[Catch: IllegalStateException -> 0x02c2, TryCatch #4 {IllegalStateException -> 0x02c2, blocks: (B:52:0x0284, B:55:0x0290, B:57:0x0299, B:59:0x029f, B:62:0x02ae, B:65:0x02b9, B:66:0x02bf, B:69:0x02aa, B:71:0x02c6, B:73:0x02d7, B:74:0x02dc, B:76:0x02da), top: B:51:0x0284 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a2  */
    /* JADX WARN: Type inference failed for: r0v4, types: [b5.q, b5.x0] */
    /* JADX WARN: Type inference failed for: r0v44, types: [D.n, b5.B, b5.X0] */
    /* JADX WARN: Type inference failed for: r2v29, types: [b5.L0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c() {
        /*
            Method dump skipped, instructions count: 2673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.o.c():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v6, types: [S5.p] */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [S4.a] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.o.run():void");
    }

    public String toString() {
        switch (this.f6963a) {
            case 0:
                android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(o.class.getSimpleName(), 11);
                O0.c cVar = new O0.c(2, false);
                ((O0.c) yVar.f9333d).f5264c = cVar;
                yVar.f9333d = cVar;
                cVar.f5263b = (O0.c) this.f6965c;
                return yVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o(Object obj, int i9, Object obj2) {
        this.f6963a = i9;
        this.f6964b = obj;
        this.f6965c = obj2;
    }

    public /* synthetic */ o(Object obj, Object obj2, int i9, boolean z9) {
        this.f6963a = i9;
        this.f6965c = obj;
        this.f6964b = obj2;
    }
}
