package i7;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i7.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1404t {

    /* renamed from: a, reason: collision with root package name */
    public static final C1405u f18911a = new C1405u(0);

    /* renamed from: b, reason: collision with root package name */
    public static final C1405u f18912b = new C1405u(1);

    /* renamed from: c, reason: collision with root package name */
    public static final b0.g f18913c = new b0.g("session_id");

    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        kotlin.jvm.internal.h.e(context, "context");
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
            list = B7.t.f1135a;
        }
        ArrayList n02 = B7.k.n0(list);
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
        ArrayList arrayList2 = new ArrayList(B7.m.f0(arrayList, 10));
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.h.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new D(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, kotlin.jvm.internal.h.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }
}
