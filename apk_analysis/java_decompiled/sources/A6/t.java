package A6;

import F4.y;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.opengl.Matrix;
import android.os.Bundle;
import b5.C0623e0;
import com.google.firebase.messaging.FirebaseMessaging;
import j3.M;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import l3.C1556e;
import l6.C1574f;
import v1.C2094b;
import v1.C2096d;
import v1.C2098f;
import x8.C2182b;
import x8.G;
import x8.w;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f539a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f540b;

    /* renamed from: c, reason: collision with root package name */
    public Object f541c;

    /* renamed from: d, reason: collision with root package name */
    public Object f542d;

    public t(C0623e0 c0623e0, String str) {
        this.f542d = c0623e0;
        y.e(str);
        this.f540b = str;
    }

    public static void e(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f9 = fArr2[10];
        float f10 = fArr2[8];
        float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
        float f11 = fArr2[10] / sqrt;
        fArr[0] = f11;
        float f12 = fArr2[8];
        fArr[2] = f12 / sqrt;
        fArr[8] = (-f12) / sqrt;
        fArr[10] = f11;
    }

    public void a() {
        l8.g gVar = (l8.g) this.f542d;
        synchronized (gVar) {
            try {
                if (!this.f539a) {
                    if (kotlin.jvm.internal.h.a(((l8.d) this.f540b).f20626g, this)) {
                        gVar.d(this, false);
                    }
                    this.f539a = true;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b(M m9, C1556e c1556e) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(m9.f19435l);
        int i9 = m9.f19448y;
        if (equals && i9 == 16) {
            i9 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(l4.y.n(i9));
        int i10 = m9.f19449z;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        canBeSpatialized = ((Spatializer) this.f540b).canBeSpatialized((AudioAttributes) c1556e.a().f17433b, channelMask.build());
        return canBeSpatialized;
    }

    public void c() {
        l8.g gVar = (l8.g) this.f542d;
        synchronized (gVar) {
            try {
                if (!this.f539a) {
                    if (kotlin.jvm.internal.h.a(((l8.d) this.f540b).f20626g, this)) {
                        gVar.d(this, true);
                    }
                    this.f539a = true;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z9) {
        C2098f c2098f = (C2098f) this.f542d;
        synchronized (c2098f) {
            try {
                if (!this.f539a) {
                    if (kotlin.jvm.internal.h.a(((C2094b) this.f540b).f23734g, this)) {
                        C2098f.a(c2098f, this, z9);
                    }
                    this.f539a = true;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        l8.d dVar = (l8.d) this.f540b;
        if (kotlin.jvm.internal.h.a(dVar.f20626g, this)) {
            l8.g gVar = (l8.g) this.f542d;
            if (gVar.j) {
                gVar.d(this, false);
            } else {
                dVar.f20625f = true;
            }
        }
    }

    public x8.y g(int i9) {
        x8.y yVar;
        C2098f c2098f = (C2098f) this.f542d;
        synchronized (c2098f) {
            if (!this.f539a) {
                ((boolean[]) this.f541c)[i9] = true;
                Object obj = ((C2094b) this.f540b).f23731d.get(i9);
                C2096d c2096d = c2098f.f23757p;
                x8.y yVar2 = (x8.y) obj;
                if (!c2096d.e(yVar2)) {
                    H1.f.a(c2096d.j(yVar2));
                }
                yVar = (x8.y) obj;
            } else {
                throw new IllegalStateException("editor is closed");
            }
        }
        return yVar;
    }

    public synchronized void h() {
        try {
            if (this.f539a) {
                return;
            }
            Boolean k5 = k();
            this.f541c = k5;
            if (k5 == null) {
                X0.k kVar = new X0.k(13);
                s6.j jVar = (s6.j) ((P6.c) this.f540b);
                jVar.a(jVar.f22772c, kVar);
            }
            this.f539a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean i() {
        boolean h7;
        try {
            h();
            Boolean bool = (Boolean) this.f541c;
            if (bool != null) {
                h7 = bool.booleanValue();
            } else {
                h7 = ((FirebaseMessaging) this.f542d).f16443a.h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return h7;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, x8.G] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, x8.G] */
    public G j(int i9) {
        C2182b c2182b;
        int i10 = 1;
        l8.g gVar = (l8.g) this.f542d;
        synchronized (gVar) {
            try {
                if (!this.f539a) {
                    if (!kotlin.jvm.internal.h.a(((l8.d) this.f540b).f20626g, this)) {
                        return new Object();
                    }
                    if (!((l8.d) this.f540b).f20624e) {
                        boolean[] zArr = (boolean[]) this.f541c;
                        kotlin.jvm.internal.h.b(zArr);
                        zArr[i9] = true;
                    }
                    File file = (File) ((l8.d) this.f540b).f20623d.get(i9);
                    try {
                        kotlin.jvm.internal.h.e(file, "file");
                        try {
                            Logger logger = w.f24682a;
                            c2182b = new C2182b(new FileOutputStream(file, false), i10, new Object());
                        } catch (FileNotFoundException unused) {
                            file.getParentFile().mkdirs();
                            Logger logger2 = w.f24682a;
                            c2182b = new C2182b(new FileOutputStream(file, false), i10, new Object());
                        }
                        return new l8.h(c2182b, new A0.b(gVar, 3, this));
                    } catch (FileNotFoundException unused2) {
                        return new Object();
                    }
                }
                throw new IllegalStateException("Check failed.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Boolean k() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        C1574f c1574f = ((FirebaseMessaging) this.f542d).f16443a;
        c1574f.a();
        Context context = c1574f.f20587a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public boolean l(String str, String str2) {
        synchronized (this) {
            try {
                if (!((e) ((AtomicMarkableReference) this.f540b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f540b;
                atomicMarkableReference.set((e) atomicMarkableReference.getReference(), true);
                s sVar = new s(0, this);
                AtomicReference atomicReference = (AtomicReference) this.f541c;
                while (!atomicReference.compareAndSet(null, sVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((z6.d) ((E6.e) this.f542d).f1969c).f25506b.a(sVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String m() {
        if (!this.f539a) {
            this.f539a = true;
            this.f541c = ((C0623e0) this.f542d).q0().getString((String) this.f540b, null);
        }
        return (String) this.f541c;
    }

    public void n(String str) {
        SharedPreferences.Editor edit = ((C0623e0) this.f542d).q0().edit();
        edit.putString((String) this.f540b, str);
        edit.apply();
        this.f541c = str;
    }

    public t() {
        this.f540b = new float[16];
        this.f541c = new float[16];
        this.f542d = new K5.p();
    }

    public t(Context context, String str, Q0.b callback, boolean z9) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f540b = context;
        this.f541c = str;
        this.f542d = callback;
        this.f539a = z9;
    }

    public t(E6.e eVar, boolean z9) {
        this.f542d = eVar;
        this.f541c = new AtomicReference(null);
        this.f539a = z9;
        this.f540b = new AtomicMarkableReference(new e(z9 ? 8192 : 1024), false);
    }

    public t(int i9) {
        this.f540b = new ReentrantLock();
        this.f541c = new long[i9];
        this.f542d = new boolean[i9];
    }

    public t(C2098f c2098f, C2094b c2094b) {
        this.f542d = c2098f;
        this.f540b = c2094b;
        c2098f.getClass();
        this.f541c = new boolean[2];
    }

    public t(FirebaseMessaging firebaseMessaging, P6.c cVar) {
        this.f542d = firebaseMessaging;
        this.f540b = cVar;
    }

    public t(l8.g gVar, l8.d dVar) {
        boolean[] zArr;
        this.f542d = gVar;
        this.f540b = dVar;
        if (dVar.f20624e) {
            zArr = null;
        } else {
            gVar.getClass();
            zArr = new boolean[2];
        }
        this.f541c = zArr;
    }

    public t(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.f540b = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f539a = immersiveAudioLevel != 0;
    }
}
