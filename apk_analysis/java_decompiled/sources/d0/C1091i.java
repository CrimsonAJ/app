package d0;

import android.os.Handler;
import android.os.Looper;
import b5.C0675y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s.C1936f;

/* renamed from: d0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091i {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile C1091i f16642k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f16643a;

    /* renamed from: b, reason: collision with root package name */
    public final C1936f f16644b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f16645c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f16646d;

    /* renamed from: e, reason: collision with root package name */
    public final C1088f f16647e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1090h f16648f;

    /* renamed from: g, reason: collision with root package name */
    public final C0675y f16649g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16650h;

    /* renamed from: i, reason: collision with root package name */
    public final C1086d f16651i;

    public C1091i(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f16643a = reentrantReadWriteLock;
        this.f16645c = 3;
        InterfaceC1090h interfaceC1090h = (InterfaceC1090h) qVar.f2042b;
        this.f16648f = interfaceC1090h;
        int i9 = qVar.f2041a;
        this.f16650h = i9;
        this.f16651i = (C1086d) qVar.f2043c;
        this.f16646d = new Handler(Looper.getMainLooper());
        this.f16644b = new C1936f(0);
        this.f16649g = new C0675y(29);
        C1088f c1088f = new C1088f(this);
        this.f16647e = c1088f;
        reentrantReadWriteLock.writeLock().lock();
        if (i9 == 0) {
            try {
                this.f16645c = 0;
            } catch (Throwable th) {
                this.f16643a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC1090h.a(new C1087e(c1088f));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static C1091i a() {
        C1091i c1091i;
        boolean z9;
        synchronized (j) {
            try {
                c1091i = f16642k;
                if (c1091i != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c1091i;
    }

    public final int b() {
        this.f16643a.readLock().lock();
        try {
            return this.f16645c;
        } finally {
            this.f16643a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z9;
        if (this.f16650h == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (b() != 1) {
                this.f16643a.writeLock().lock();
                try {
                    if (this.f16645c == 0) {
                        return;
                    }
                    this.f16645c = 0;
                    this.f16643a.writeLock().unlock();
                    C1088f c1088f = this.f16647e;
                    C1091i c1091i = (C1091i) c1088f.f16641c;
                    try {
                        c1091i.f16648f.a(new C1087e(c1088f));
                        return;
                    } catch (Throwable th) {
                        c1091i.d(th);
                        return;
                    }
                } finally {
                    this.f16643a.writeLock().unlock();
                }
            }
            return;
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f16643a.writeLock().lock();
        try {
            this.f16645c = 2;
            arrayList.addAll(this.f16644b);
            this.f16644b.clear();
            this.f16643a.writeLock().unlock();
            this.f16646d.post(new D4.s(arrayList, this.f16645c, th));
        } catch (Throwable th2) {
            this.f16643a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:28:0x005d, B:31:0x0062, B:33:0x0066, B:35:0x0073, B:37:0x0092, B:39:0x009c, B:41:0x009f, B:43:0x00a2, B:45:0x00b2, B:46:0x00b5), top: B:27:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [d0.y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C1091i.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(AbstractC1089g abstractC1089g) {
        s8.e.g(abstractC1089g, "initCallback cannot be null");
        this.f16643a.writeLock().lock();
        try {
            if (this.f16645c != 1 && this.f16645c != 2) {
                this.f16644b.add(abstractC1089g);
                this.f16643a.writeLock().unlock();
            }
            this.f16646d.post(new D4.s(Arrays.asList(abstractC1089g), this.f16645c, (Throwable) null));
            this.f16643a.writeLock().unlock();
        } catch (Throwable th) {
            this.f16643a.writeLock().unlock();
            throw th;
        }
    }
}
