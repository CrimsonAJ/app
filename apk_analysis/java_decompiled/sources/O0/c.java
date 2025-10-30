package O0;

import A4.r;
import G2.s;
import N3.c0;
import P.F;
import P.Q;
import P.X;
import T3.j;
import T3.q;
import U3.n;
import Y3.g;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.security.keystore.KeyGenParameterSpec;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.h;
import android.support.v4.media.session.l;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.mediarouter.app.p;
import b5.C0623e0;
import b5.C0650n0;
import b5.C0675y;
import b5.E;
import b5.G1;
import b5.M0;
import b5.S0;
import b5.V;
import b5.x1;
import b6.C0690l;
import b6.C0691m;
import b6.C0692n;
import c2.C0768n;
import d0.m;
import d7.i;
import d7.k;
import e1.t;
import e1.v;
import e1.w;
import f0.C1149a;
import f0.C1157i;
import i.o;
import i0.AbstractActivityC1369y;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1326C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.KeyGenerator;
import k4.C1519t;
import k4.InterfaceC1512l;
import k4.InterfaceC1513m;
import k4.O;
import l1.C1535g;
import l4.AbstractC1566a;
import l4.y;
import l6.C1574f;
import n.AbstractC1595a;
import n.C1599e;
import o.MenuC1656A;
import org.json.JSONException;
import org.json.JSONObject;
import p1.C1847j;
import q3.C1904i;
import q3.u;
import s.C1939i;
import s8.e;
import w.AbstractC2128h;
import z8.C2273w;

/* loaded from: classes.dex */
public class c implements q, m, g, w, InterfaceC1512l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5262a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5263b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5264c;

    public /* synthetic */ c(int i9, Object obj) {
        this.f5262a = i9;
        this.f5264c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static O0.c e(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L28 java.lang.Error -> L2b java.io.IOException -> L2d
            O0.c r2 = new O0.c     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            r3 = 6
            r2.<init>(r5, r3, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            return r2
        L22:
            r2 = move-exception
            goto L37
        L24:
            r2 = move-exception
            goto L37
        L26:
            r2 = move-exception
            goto L37
        L28:
            r2 = move-exception
        L29:
            r0 = r1
            goto L37
        L2b:
            r2 = move-exception
            goto L29
        L2d:
            r2 = move-exception
            goto L29
        L2f:
            r2 = move-exception
        L30:
            r5 = r1
            r0 = r5
            goto L37
        L33:
            r2 = move-exception
            goto L30
        L35:
            r2 = move-exception
            goto L30
        L37:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L43
            r0.release()     // Catch: java.io.IOException -> L43
        L43:
            if (r5 == 0) goto L48
            r5.close()     // Catch: java.io.IOException -> L48
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.c.e(android.content.Context):O0.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory A(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.c.A(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: JSONException -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x003d, blocks: (B:5:0x0014, B:7:0x002a, B:8:0x0040, B:13:0x005a, B:22:0x0070, B:24:0x0079, B:26:0x0083, B:28:0x0087, B:30:0x009d, B:31:0x00a4, B:34:0x00a5, B:35:0x00ac, B:37:0x00ad, B:38:0x00b4), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: JSONException -> 0x003d, TryCatch #1 {JSONException -> 0x003d, blocks: (B:5:0x0014, B:7:0x002a, B:8:0x0040, B:13:0x005a, B:22:0x0070, B:24:0x0079, B:26:0x0083, B:28:0x0087, B:30:0x009d, B:31:0x00a4, B:34:0x00a5, B:35:0x00ac, B:37:0x00ad, B:38:0x00b4), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, g7.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g7.C1258d B(d7.e r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = ""
            org.json.JSONArray r3 = r14.f16903g
            long r4 = r14.f16902f
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            r6 = r0
        Le:
            int r7 = r3.length()
            if (r6 >= r7) goto Lbd
            org.json.JSONObject r7 = r3.getJSONObject(r6)     // Catch: org.json.JSONException -> L3d
            java.lang.String r8 = "rolloutId"
            java.lang.String r8 = r7.getString(r8)     // Catch: org.json.JSONException -> L3d
            java.lang.String r9 = "affectedParameterKeys"
            org.json.JSONArray r9 = r7.getJSONArray(r9)     // Catch: org.json.JSONException -> L3d
            int r10 = r9.length()     // Catch: org.json.JSONException -> L3d
            if (r10 <= r1) goto L40
            java.lang.String r10 = "FirebaseRemoteConfig"
            java.lang.String r11 = "Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s"
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: org.json.JSONException -> L3d
            r12[r0] = r8     // Catch: org.json.JSONException -> L3d
            r12[r1] = r9     // Catch: org.json.JSONException -> L3d
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch: org.json.JSONException -> L3d
            android.util.Log.w(r10, r11)     // Catch: org.json.JSONException -> L3d
            goto L40
        L3d:
            r14 = move-exception
            goto Lb5
        L40:
            java.lang.String r9 = r9.optString(r0, r2)     // Catch: org.json.JSONException -> L3d
            java.lang.Object r10 = r13.f5263b     // Catch: org.json.JSONException -> L3d
            d7.d r10 = (d7.d) r10     // Catch: org.json.JSONException -> L3d
            d7.e r10 = r10.c()     // Catch: org.json.JSONException -> L3d
            r11 = 0
            if (r10 != 0) goto L51
        L4f:
            r10 = r11
            goto L57
        L51:
            org.json.JSONObject r10 = r10.f16898b     // Catch: org.json.JSONException -> L4f
            java.lang.String r10 = r10.getString(r9)     // Catch: org.json.JSONException -> L4f
        L57:
            if (r10 == 0) goto L5a
            goto L70
        L5a:
            java.lang.Object r10 = r13.f5264c     // Catch: org.json.JSONException -> L3d
            d7.d r10 = (d7.d) r10     // Catch: org.json.JSONException -> L3d
            d7.e r10 = r10.c()     // Catch: org.json.JSONException -> L3d
            if (r10 != 0) goto L65
            goto L6b
        L65:
            org.json.JSONObject r10 = r10.f16898b     // Catch: org.json.JSONException -> L6b
            java.lang.String r11 = r10.getString(r9)     // Catch: org.json.JSONException -> L6b
        L6b:
            if (r11 == 0) goto L6f
            r10 = r11
            goto L70
        L6f:
            r10 = r2
        L70:
            int r11 = g7.AbstractC1259e.f17780a     // Catch: org.json.JSONException -> L3d
            g7.b r11 = new g7.b     // Catch: org.json.JSONException -> L3d
            r11.<init>()     // Catch: org.json.JSONException -> L3d
            if (r8 == 0) goto Lad
            r11.f17768a = r8     // Catch: org.json.JSONException -> L3d
            java.lang.String r8 = "variantId"
            java.lang.String r7 = r7.getString(r8)     // Catch: org.json.JSONException -> L3d
            if (r7 == 0) goto La5
            r11.f17769b = r7     // Catch: org.json.JSONException -> L3d
            if (r9 == 0) goto L9d
            r11.f17770c = r9     // Catch: org.json.JSONException -> L3d
            r11.f17771d = r10     // Catch: org.json.JSONException -> L3d
            r11.f17772e = r4     // Catch: org.json.JSONException -> L3d
            byte r7 = r11.f17773f     // Catch: org.json.JSONException -> L3d
            r7 = r7 | r1
            byte r7 = (byte) r7     // Catch: org.json.JSONException -> L3d
            r11.f17773f = r7     // Catch: org.json.JSONException -> L3d
            g7.c r7 = r11.a()     // Catch: org.json.JSONException -> L3d
            r14.add(r7)     // Catch: org.json.JSONException -> L3d
            int r6 = r6 + r1
            goto Le
        L9d:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3d
            java.lang.String r0 = "Null parameterKey"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3d
            throw r14     // Catch: org.json.JSONException -> L3d
        La5:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3d
            java.lang.String r0 = "Null variantId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3d
            throw r14     // Catch: org.json.JSONException -> L3d
        Lad:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3d
            java.lang.String r0 = "Null rolloutId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3d
            throw r14     // Catch: org.json.JSONException -> L3d
        Lb5:
            c7.f r0 = new c7.f
            java.lang.String r1 = "Exception parsing rollouts metadata to create RolloutsState."
            r0.<init>(r1, r14)
            throw r0
        Lbd:
            g7.d r0 = new g7.d
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.c.B(d7.e):g7.d");
    }

    public File C() {
        if (((File) this.f5263b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f5263b) == null) {
                        C1574f c1574f = (C1574f) this.f5264c;
                        c1574f.a();
                        this.f5263b = new File(c1574f.f20587a.getFilesDir(), "PersistedInstallation." + ((C1574f) this.f5264c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f5263b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.support.v4.media.session.m, android.support.v4.media.session.l] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.support.v4.media.session.m, android.support.v4.media.session.l] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.support.v4.media.session.m, android.support.v4.media.session.l] */
    public android.support.v4.media.session.m D() {
        MediaController.TransportControls transportControls = ((h) this.f5263b).f9304a.getTransportControls();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            return new l(transportControls);
        }
        if (i9 >= 24) {
            return new l(transportControls);
        }
        return new l(transportControls);
    }

    public void E(U6.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f7528a);
            jSONObject.put("Status", AbstractC2128h.b(bVar.f7529b));
            jSONObject.put("AuthToken", bVar.f7530c);
            jSONObject.put("RefreshToken", bVar.f7531d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f7533f);
            jSONObject.put("ExpiresInSecs", bVar.f7532e);
            jSONObject.put("FisError", bVar.f7534g);
            C1574f c1574f = (C1574f) this.f5264c;
            c1574f.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", c1574f.f20587a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(C())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(long r5, G7.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof O2.F
            if (r0 == 0) goto L13
            r0 = r7
            O2.F r0 = (O2.F) r0
            int r1 = r0.f5306u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5306u = r1
            goto L18
        L13:
            O2.F r0 = new O2.F
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f5304s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f5306u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O0.c r5 = r0.f5303r
            a.AbstractC0485a.A(r7)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            a.AbstractC0485a.A(r7)
            r0.f5303r = r4
            r0.f5306u = r3
            java.lang.Object r7 = r4.f5263b
            C2.E r7 = (C2.E) r7
            r7.getClass()
            o7.y r2 = E2.d.f1935a
            C2.u r2 = new C2.u
            r3 = 0
            r2.<init>(r7, r5, r3)
            java.lang.Object r7 = E2.d.a(r2, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r5 = r4
        L4f:
            v2.c r7 = (v2.AbstractC2103c) r7
            boolean r6 = r7 instanceof v2.C2101a
            if (r6 == 0) goto L5e
            v2.a r7 = (v2.C2101a) r7
            java.lang.Throwable r5 = r7.f23761a
            A7.i r5 = a.AbstractC0485a.h(r5)
            return r5
        L5e:
            boolean r6 = r7 instanceof v2.C2102b
            if (r6 == 0) goto L71
            java.lang.Object r5 = r5.f5264c
            G2.s r5 = (G2.s) r5
            v2.b r7 = (v2.C2102b) r7
            java.lang.Object r6 = r7.f23762a
            com.anilab.data.model.response.MovieResponse r6 = (com.anilab.data.model.response.MovieResponse) r6
            com.anilab.domain.model.Movie r5 = r5.n(r6)
            return r5
        L71:
            A7.b r5 = new A7.b
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.c.F(long, G7.c):java.lang.Object");
    }

    public void G(AbstractC1595a abstractC1595a) {
        C1535g c1535g = (C1535g) this.f5263b;
        ((ActionMode.Callback) c1535g.f20182a).onDestroyActionMode(c1535g.n(abstractC1595a));
        i.w wVar = (i.w) this.f5264c;
        if (wVar.f18153w != null) {
            wVar.f18132l.getDecorView().removeCallbacks(wVar.f18155x);
        }
        if (wVar.f18151v != null) {
            X x5 = wVar.f18157y;
            if (x5 != null) {
                x5.b();
            }
            X a5 = Q.a(wVar.f18151v);
            a5.a(0.0f);
            wVar.f18157y = a5;
            a5.d(new o(2, this));
        }
        wVar.f18149u = null;
        ViewGroup viewGroup = wVar.f18114A;
        WeakHashMap weakHashMap = Q.f5546a;
        F.c(viewGroup);
        wVar.I();
    }

    public void H(Throwable th) {
        int i9 = 1;
        S0 s02 = (S0) this.f5264c;
        s02.l0();
        s02.f10949i = false;
        C0650n0 c0650n0 = (C0650n0) s02.f1707a;
        int i10 = 2;
        if (c0650n0.f11227g.y0(null, E.f10637a1)) {
            String message = th.getMessage();
            s02.f10953n = false;
            if (message != null) {
                if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                        i10 = 3;
                    }
                } else {
                    if (message.contains("Background")) {
                        s02.f10953n = true;
                    }
                    i10 = 1;
                }
            }
        }
        int i11 = i10 - 1;
        x1 x1Var = (x1) this.f5263b;
        V v8 = c0650n0.f11229i;
        if (i11 != 0) {
            if (i11 != 1) {
                C0650n0.f(v8);
                v8.f10971f.d(V.t0(c0650n0.i().r0()), th, "registerTriggerAsync failed. Dropping URI. App ID, Throwable");
                S();
                s02.j = 1;
                s02.z0();
                return;
            }
            s02.J0().add(x1Var);
            if (s02.j > ((Integer) E.f10695w0.a(null)).intValue()) {
                s02.j = 1;
                C0650n0.f(v8);
                v8.f10974i.d(V.t0(c0650n0.i().r0()), V.t0(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
                return;
            }
            C0650n0.f(v8);
            v8.f10974i.e("registerTriggerAsync failed. App ID, delay in seconds, throwable", V.t0(c0650n0.i().r0()), V.t0(String.valueOf(s02.j)), V.t0(th.toString()));
            int i12 = s02.j;
            if (s02.f10950k == null) {
                s02.f10950k = new M0(s02, c0650n0, i9);
            }
            s02.f10950k.c(i12 * 1000);
            int i13 = s02.j;
            s02.j = i13 + i13;
            return;
        }
        C0650n0.f(v8);
        v8.f10974i.d(V.t0(c0650n0.i().r0()), V.t0(th.toString()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable");
        s02.j = 1;
        s02.J0().add(x1Var);
    }

    public boolean I(AbstractC1595a abstractC1595a, o.l lVar) {
        ViewGroup viewGroup = ((i.w) this.f5264c).f18114A;
        WeakHashMap weakHashMap = Q.f5546a;
        F.c(viewGroup);
        C1535g c1535g = (C1535g) this.f5263b;
        C1599e n7 = c1535g.n(abstractC1595a);
        C1939i c1939i = (C1939i) c1535g.f20185d;
        Menu menu = (Menu) c1939i.get(lVar);
        if (menu == null) {
            menu = new MenuC1656A((Context) c1535g.f20183b, lVar);
            c1939i.put(lVar, menu);
        }
        return ((ActionMode.Callback) c1535g.f20182a).onPrepareActionMode(n7, menu);
    }

    @Override // Y3.g
    public int J() {
        return ((long[]) this.f5264c).length;
    }

    public U6.b K() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(C());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i9 = AbstractC2128h.c(5)[optInt];
        if (i9 != 0) {
            if (i9 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new U6.b(optString, i9, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void L(p pVar) {
        if (pVar != null) {
            if (((ConcurrentHashMap) this.f5264c).putIfAbsent(pVar, Boolean.TRUE) != null) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            pVar.f(handler);
            h hVar = (h) this.f5263b;
            hVar.f9304a.registerCallback(pVar.f10114a, handler);
            synchronized (hVar.f9305b) {
                if (hVar.f9308e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(pVar);
                    hVar.f9307d.put(pVar, gVar);
                    pVar.f10116c = gVar;
                    try {
                        hVar.f9308e.a().r(gVar);
                        pVar.e(13, null, null);
                    } catch (RemoteException e8) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e8);
                    }
                } else {
                    pVar.f10116c = null;
                    hVar.f9306c.add(pVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void M(C0690l c0690l) {
        C0691m c0691m = new C0691m(c0690l.f11376a, c6.g.class);
        HashMap hashMap = (HashMap) this.f5263b;
        if (hashMap.containsKey(c0691m)) {
            C0690l c0690l2 = (C0690l) hashMap.get(c0691m);
            if (c0690l2.equals(c0690l) && c0690l.equals(c0690l2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + c0691m);
        }
        hashMap.put(c0691m, c0690l);
    }

    public void N(U5.m mVar) {
        if (mVar != null) {
            Class c3 = mVar.c();
            HashMap hashMap = (HashMap) this.f5264c;
            if (hashMap.containsKey(c3)) {
                U5.m mVar2 = (U5.m) hashMap.get(c3);
                if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
                    return;
                }
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + c3);
            }
            hashMap.put(c3, mVar);
            return;
        }
        throw new NullPointerException("wrapper must be non-null");
    }

    public void O() {
        try {
            ((FileLock) this.f5264c).release();
            ((FileChannel) this.f5263b).close();
        } catch (IOException e8) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e8);
        }
    }

    public void P(e eVar) {
        ((androidx.lifecycle.E) this.f5263b).g(eVar);
        boolean z9 = eVar instanceof v;
        C1847j c1847j = (C1847j) this.f5264c;
        if (z9) {
            c1847j.j((v) eVar);
        } else if (eVar instanceof t) {
            c1847j.k(((t) eVar).f17069e);
        }
    }

    public u Q(int i9) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f5263b;
            if (i10 < iArr.length) {
                if (i9 == iArr[i10]) {
                    return ((c0[]) this.f5264c)[i10];
                }
                i10++;
            } else {
                AbstractC1566a.t("BaseMediaChunkOutput", "Unmatched track of type: " + i9);
                return new C1904i();
            }
        }
    }

    public void R(p pVar) {
        if (pVar != null) {
            if (((ConcurrentHashMap) this.f5264c).remove(pVar) == null) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((h) this.f5263b).b(pVar);
                return;
            } finally {
                pVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void S() {
        C0650n0 c0650n0 = (C0650n0) ((S0) this.f5264c).f1707a;
        C0623e0 c0623e0 = c0650n0.f11228h;
        C0650n0.d(c0623e0);
        SparseArray r0 = c0623e0.r0();
        x1 x1Var = (x1) this.f5263b;
        r0.put(x1Var.f11347c, Long.valueOf(x1Var.f11346b));
        C0623e0 c0623e02 = c0650n0.f11228h;
        C0650n0.d(c0623e02);
        int[] iArr = new int[r0.size()];
        long[] jArr = new long[r0.size()];
        for (int i9 = 0; i9 < r0.size(); i9++) {
            iArr[i9] = r0.keyAt(i9);
            jArr[i9] = ((Long) r0.valueAt(i9)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c0623e02.f11095o.A(bundle);
    }

    @Override // Y3.g
    public int a(long j) {
        long[] jArr = (long[]) this.f5264c;
        int b9 = y.b(jArr, j, false);
        if (b9 < jArr.length) {
            return b9;
        }
        return -1;
    }

    @Override // d0.m
    public Object b() {
        return (d0.y) this.f5263b;
    }

    @Override // k4.InterfaceC1512l
    public InterfaceC1513m c() {
        return new C1519t((Context) this.f5263b, ((r) this.f5264c).c());
    }

    @Override // d0.m
    public boolean d(CharSequence charSequence, int i9, int i10, d0.u uVar) {
        Spannable spannableString;
        if ((uVar.f16680c & 4) > 0) {
            return true;
        }
        if (((d0.y) this.f5263b) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f5263b = new d0.y(spannableString);
        }
        ((C0675y) this.f5264c).getClass();
        ((d0.y) this.f5263b).setSpan(new d0.v(uVar), i9, i10, 33);
        return true;
    }

    public synchronized void f() {
        if (!((LinkedHashSet) this.f5263b).isEmpty()) {
            ((k) this.f5264c).e(0L);
        }
    }

    @Override // T3.q
    public O g(T3.m mVar, j jVar) {
        ((F5.e) this.f5263b).getClass();
        return new C2273w(new T3.p(mVar, jVar), (List) this.f5264c);
    }

    public G6.a h() {
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.f5264c;
        if (keyGenParameterSpec != null) {
            Object obj = d.f5265a;
            if (keyGenParameterSpec.getKeySize() == 256) {
                if (Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                    if (keyGenParameterSpec.getPurposes() == 3) {
                        if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                            if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                            }
                            synchronized (d.f5265a) {
                                String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                keyStore.load(null);
                                if (!keyStore.containsAlias(keystoreAlias)) {
                                    try {
                                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                        keyGenerator.init(keyGenParameterSpec);
                                        keyGenerator.generateKey();
                                    } catch (ProviderException e8) {
                                        throw new GeneralSecurityException(e8.getMessage(), e8);
                                    }
                                }
                            }
                            return new G6.a((KeyGenParameterSpec) this.f5264c, keyGenParameterSpec.getKeystoreAlias());
                        }
                        throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                    }
                    throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
                }
                throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
            }
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
    }

    @Override // T3.q
    public O i() {
        return new C2273w(((F5.e) this.f5263b).i(), (List) this.f5264c);
    }

    public void j() {
        this.f5263b = null;
        this.f5264c = null;
    }

    public void k(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public void l(boolean z9) {
        AbstractC1336M abstractC1336M = (AbstractC1336M) this.f5264c;
        AbstractActivityC1369y abstractActivityC1369y = abstractC1336M.f18215u.f18427o;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = abstractC1336M.f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    @Override // Y3.g
    public long m(int i9) {
        boolean z9;
        boolean z10 = false;
        if (i9 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        long[] jArr = (long[]) this.f5264c;
        if (i9 < jArr.length) {
            z10 = true;
        }
        AbstractC1566a.h(z10);
        return jArr[i9];
    }

    public void n(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public void o(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public void p(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public void q(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public void r(boolean z9) {
        AbstractC1336M abstractC1336M = (AbstractC1336M) this.f5264c;
        AbstractActivityC1369y abstractActivityC1369y = abstractC1336M.f18215u.f18427o;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = abstractC1336M.f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public void s(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public void t(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public String toString() {
        switch (this.f5262a) {
            case 3:
                return "Bounds{lower=" + ((H.c) this.f5263b) + " upper=" + ((H.c) this.f5264c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public void v(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    @Override // Y3.g
    public List w(long j) {
        Y3.b bVar;
        int e8 = y.e((long[]) this.f5264c, j, false);
        if (e8 != -1 && (bVar = ((Y3.b[]) this.f5263b)[e8]) != Y3.b.f8677r) {
            return Collections.singletonList(bVar);
        }
        return Collections.EMPTY_LIST;
    }

    public void x(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public void y(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, View view, boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v2 != null) {
            abstractComponentCallbacksC1366v2.o().f18207m.y(abstractComponentCallbacksC1366v, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
                AbstractC1336M abstractC1336M = (AbstractC1336M) this.f5264c;
                if (abstractComponentCallbacksC1366v == ((AbstractComponentCallbacksC1366v) g12.f10717b)) {
                    c cVar = abstractC1336M.f18207m;
                    synchronized (((CopyOnWriteArrayList) cVar.f5263b)) {
                        try {
                            int size = ((CopyOnWriteArrayList) cVar.f5263b).size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size) {
                                    break;
                                }
                                if (((C1326C) ((CopyOnWriteArrayList) cVar.f5263b).get(i9)).f18167a == g12) {
                                    ((CopyOnWriteArrayList) cVar.f5263b).remove(i9);
                                    break;
                                }
                                i9++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    C0768n c0768n = (C0768n) g12.f10719d;
                    FrameLayout frameLayout = (FrameLayout) g12.f10718c;
                    c0768n.getClass();
                    C0768n.n(view, frameLayout);
                } else {
                    continue;
                }
            }
        }
    }

    public void z(boolean z9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((AbstractC1336M) this.f5264c).f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            abstractComponentCallbacksC1366v.o().f18207m.z(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5263b).iterator();
        while (it.hasNext()) {
            C1326C c1326c = (C1326C) it.next();
            if (z9) {
                c1326c.getClass();
            } else {
                G1 g12 = c1326c.f18167a;
            }
        }
    }

    public /* synthetic */ c(int i9, boolean z9) {
        this.f5262a = i9;
    }

    public /* synthetic */ c(Object obj, int i9, Object obj2) {
        this.f5262a = i9;
        this.f5263b = obj;
        this.f5264c = obj2;
    }

    public /* synthetic */ c(Object obj, int i9, boolean z9) {
        this.f5262a = i9;
        this.f5264c = null;
        this.f5263b = obj;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i9, boolean z9) {
        this.f5262a = i9;
        this.f5264c = obj;
        this.f5263b = obj2;
    }

    public c(C2.E movieRepository, s movieMapper) {
        this.f5262a = 1;
        kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
        kotlin.jvm.internal.h.e(movieMapper, "movieMapper");
        this.f5263b = movieRepository;
        this.f5264c = movieMapper;
    }

    public c(int i9) {
        this.f5262a = i9;
        switch (i9) {
            case 17:
                this.f5263b = new Rect();
                this.f5264c = new Rect();
                return;
            case 24:
                this.f5263b = new androidx.lifecycle.E();
                this.f5264c = new Object();
                P(w.f17071W);
                return;
            default:
                this.f5263b = new HashMap();
                this.f5264c = new HashMap();
                return;
        }
    }

    public c(C0692n c0692n) {
        this.f5262a = 16;
        this.f5263b = new HashMap(c0692n.f11380a);
        this.f5264c = new HashMap(c0692n.f11381b);
    }

    public c(S6.b bVar) {
        this.f5262a = 20;
        this.f5264c = Collections.synchronizedMap(new HashMap());
        this.f5263b = bVar;
    }

    public c(AbstractC1336M abstractC1336M) {
        this.f5262a = 27;
        this.f5263b = new CopyOnWriteArrayList();
        this.f5264c = abstractC1336M;
    }

    public c(C1574f c1574f, T6.e eVar, i iVar, d7.d dVar, Context context, d7.m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f5262a = 19;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f5263b = linkedHashSet;
        this.f5264c = new k(c1574f, eVar, iVar, dVar, context, linkedHashSet, mVar, scheduledExecutorService);
    }

    public c(Animator animator) {
        this.f5262a = 26;
        this.f5263b = null;
        this.f5264c = animator;
    }

    public c(Context context, int i9) {
        this.f5262a = i9;
        switch (i9) {
            case 29:
                r rVar = new r(3, false);
                this.f5263b = context.getApplicationContext();
                this.f5264c = rVar;
                return;
            default:
                context.getApplicationContext();
                this.f5263b = "_androidx_security_master_key_";
                return;
        }
    }

    public c(Context context, android.support.v4.media.session.y yVar) {
        this.f5262a = 10;
        this.f5264c = new ConcurrentHashMap();
        if (yVar != null) {
            MediaSessionCompat$Token mediaSessionCompat$Token = ((android.support.v4.media.session.t) yVar.f9331b).f9319b;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f5263b = new h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f5263b = new h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("session must not be null");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.text.Editable$Factory, f0.a] */
    public c(EditText editText) {
        this.f5262a = 23;
        this.f5263b = editText;
        C1157i c1157i = new C1157i(editText);
        this.f5264c = c1157i;
        editText.addTextChangedListener(c1157i);
        if (C1149a.f17243b == null) {
            synchronized (C1149a.f17242a) {
                try {
                    if (C1149a.f17243b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            C1149a.f17244c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1149a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C1149a.f17243b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C1149a.f17243b);
    }

    public c(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f5262a = 10;
        this.f5264c = new ConcurrentHashMap();
        if (mediaSessionCompat$Token != null) {
            this.f5263b = new h(context, mediaSessionCompat$Token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public c(n nVar) {
        this.f5262a = 7;
        this.f5264c = nVar;
        this.f5263b = y.l(null);
    }
}
