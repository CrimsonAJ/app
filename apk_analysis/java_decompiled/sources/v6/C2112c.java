package v6;

import B6.C0011a0;
import B7.k;
import B7.m;
import B7.t;
import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: v6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2112c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2112c f23900a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C2112c f23901b = new Object();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, B6.Z] */
    public static C0011a0 a(C2112c c2112c, String processName, int i9, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        c2112c.getClass();
        h.e(processName, "processName");
        ?? obj = new Object();
        obj.f886a = processName;
        obj.f887b = i9;
        byte b9 = (byte) (obj.f890e | 1);
        obj.f888c = i10;
        obj.f889d = false;
        obj.f890e = (byte) (((byte) (b9 | 2)) | 4);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, B6.Z] */
    public static ArrayList d(Context context) {
        ActivityManager activityManager;
        h.e(context, "context");
        int i9 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = t.f1135a;
        }
        ArrayList n02 = k.n0(list);
        ArrayList arrayList = new ArrayList();
        int size = n02.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = n02.get(i11);
            i11++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i9) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.f0(arrayList, 10));
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            ?? obj3 = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                obj3.f886a = str2;
                obj3.f887b = runningAppProcessInfo.pid;
                byte b9 = (byte) (obj3.f890e | 1);
                obj3.f888c = runningAppProcessInfo.importance;
                obj3.f890e = (byte) (b9 | 2);
                obj3.f889d = h.a(str2, str);
                obj3.f890e = (byte) (obj3.f890e | 4);
                arrayList2.add(obj3.a());
            } else {
                throw new NullPointerException("Null processName");
            }
        }
        return arrayList2;
    }

    public boolean b(int i9) {
        if (4 > i9 && !Log.isLoggable("FirebaseCrashlytics", i9)) {
            return false;
        }
        return true;
    }

    public void c(String str) {
        if (b(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r7 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public B6.D0 e(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.h.e(r7, r0)
            int r0 = android.os.Process.myPid()
            java.util.ArrayList r7 = d(r7)
            int r1 = r7.size()
            r2 = 0
            r3 = r2
        L13:
            if (r3 >= r1) goto L25
            java.lang.Object r4 = r7.get(r3)
            int r3 = r3 + 1
            r5 = r4
            B6.D0 r5 = (B6.D0) r5
            B6.a0 r5 = (B6.C0011a0) r5
            int r5 = r5.f896b
            if (r5 != r0) goto L13
            goto L26
        L25:
            r4 = 0
        L26:
            B6.D0 r4 = (B6.D0) r4
            if (r4 != 0) goto L4e
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r7 <= r1) goto L3a
            java.lang.String r7 = Q.d.k()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            kotlin.jvm.internal.h.d(r7, r1)
            goto L47
        L3a:
            r1 = 28
            java.lang.String r3 = ""
            if (r7 < r1) goto L46
            java.lang.String r7 = C5.f.r()
            if (r7 != 0) goto L47
        L46:
            r7 = r3
        L47:
            r1 = 12
            B6.a0 r7 = a(r6, r7, r0, r2, r1)
            return r7
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.C2112c.e(android.content.Context):B6.D0");
    }

    public void f(String str) {
        if (b(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void g(String str, Exception exc) {
        if (b(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
