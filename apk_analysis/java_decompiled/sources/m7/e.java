package m7;

import i7.C1387b;
import java.util.regex.Pattern;
import k7.InterfaceC1525a;

/* loaded from: classes.dex */
public final class e implements o {

    /* renamed from: a, reason: collision with root package name */
    public final T6.e f20878a;

    /* renamed from: b, reason: collision with root package name */
    public final C1387b f20879b;

    /* renamed from: c, reason: collision with root package name */
    public final g f20880c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1525a f20881d;

    /* renamed from: e, reason: collision with root package name */
    public final g8.d f20882e;

    public e(E7.i backgroundDispatcher, T6.e firebaseInstallationsApi, C1387b appInfo, g configsFetcher, InterfaceC1525a lazySettingsCache) {
        kotlin.jvm.internal.h.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.h.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.h.e(appInfo, "appInfo");
        kotlin.jvm.internal.h.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.h.e(lazySettingsCache, "lazySettingsCache");
        this.f20878a = firebaseInstallationsApi;
        this.f20879b = appInfo;
        this.f20880c = configsFetcher;
        this.f20881d = lazySettingsCache;
        this.f20882e = g8.e.a();
    }

    public static String f(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.h.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.h.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override // m7.o
    public final Boolean a() {
        h hVar = e().f20917b;
        if (hVar != null) {
            return hVar.f20890a;
        }
        kotlin.jvm.internal.h.h("sessionConfigs");
        throw null;
    }

    @Override // m7.o
    public final Double b() {
        h hVar = e().f20917b;
        if (hVar != null) {
            return hVar.f20891b;
        }
        kotlin.jvm.internal.h.h("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:25:0x004f, B:26:0x00ac, B:28:0x00b8, B:31:0x00c1, B:38:0x0087, B:40:0x0091, B:43:0x009a), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:25:0x004f, B:26:0x00ac, B:28:0x00b8, B:31:0x00c1, B:38:0x0087, B:40:0x0091, B:43:0x009a), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:25:0x004f, B:26:0x00ac, B:28:0x00b8, B:31:0x00c1, B:38:0x0087, B:40:0x0091, B:43:0x009a), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #0 {all -> 0x0053, blocks: (B:25:0x004f, B:26:0x00ac, B:28:0x00b8, B:31:0x00c1, B:38:0x0087, B:40:0x0091, B:43:0x009a), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r4v3, types: [m7.d, G7.j] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    @Override // m7.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(E7.d r27) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.e.c(E7.d):java.lang.Object");
    }

    @Override // m7.o
    public final X7.a d() {
        h hVar = e().f20917b;
        if (hVar != null) {
            Integer num = hVar.f20892c;
            if (num == null) {
                return null;
            }
            int i9 = X7.a.f8474d;
            return new X7.a(Z0.a.A(num.intValue(), X7.c.SECONDS));
        }
        kotlin.jvm.internal.h.h("sessionConfigs");
        throw null;
    }

    public final n e() {
        Object obj = this.f20881d.get();
        kotlin.jvm.internal.h.d(obj, "lazySettingsCache.get()");
        return (n) obj;
    }
}
