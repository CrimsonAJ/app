package M4;

import A6.t;
import N3.E;
import Q0.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import d0.InterfaceC1090h;
import d0.ThreadFactoryC1083a;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class b implements InterfaceC1090h, Q0.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4790a;

    public /* synthetic */ b(Context context, boolean z9) {
        this.f4790a = context;
    }

    @Override // d0.InterfaceC1090h
    public void a(Z0.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1083a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new E(this, aVar, threadPoolExecutor, 4));
    }

    public ApplicationInfo b(int i9, String str) {
        return this.f4790a.getPackageManager().getApplicationInfo(str, i9);
    }

    public PackageInfo c(int i9, String str) {
        return this.f4790a.getPackageManager().getPackageInfo(str, i9);
    }

    public boolean d() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f4790a;
        if (callingUid == myUid) {
            return a.u(context);
        }
        if (K4.b.d() && (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    @Override // Q0.c
    public d e(t tVar) {
        Context context = this.f4790a;
        Q0.b callback = (Q0.b) tVar.f542d;
        h.e(callback, "callback");
        String str = (String) tVar.f541c;
        if (str != null && str.length() != 0) {
            t tVar2 = new t(context, str, callback, true);
            return new R0.h((Context) tVar2.f540b, (String) tVar2.f541c, (Q0.b) tVar2.f542d, tVar2.f539a);
        }
        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
    }

    public b(Context context) {
        this.f4790a = context.getApplicationContext();
    }
}
