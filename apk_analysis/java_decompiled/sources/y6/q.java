package y6;

import B6.T;
import B6.U;
import B6.V;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import u0.z;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f25100f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f25101g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25102a;

    /* renamed from: b, reason: collision with root package name */
    public final u f25103b;

    /* renamed from: c, reason: collision with root package name */
    public final C2218a f25104c;

    /* renamed from: d, reason: collision with root package name */
    public final A1.g f25105d;

    /* renamed from: e, reason: collision with root package name */
    public final G6.e f25106e;

    static {
        HashMap hashMap = new HashMap();
        f25100f = hashMap;
        z.h(5, hashMap, "armeabi", 6, "armeabi-v7a");
        z.h(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f25101g = "Crashlytics Android SDK/19.4.4";
    }

    public q(Context context, u uVar, C2218a c2218a, A1.g gVar, G6.e eVar) {
        this.f25102a = context;
        this.f25103b = uVar;
        this.f25104c = c2218a;
        this.f25105d = gVar;
        this.f25106e = eVar;
    }

    public static U c(com.google.firebase.messaging.s sVar, int i9) {
        String str = (String) sVar.f16505c;
        int i10 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.f16506d;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) sVar.f16507e;
        if (i9 >= 8) {
            for (com.google.firebase.messaging.s sVar3 = sVar2; sVar3 != null; sVar3 = (com.google.firebase.messaging.s) sVar3.f16507e) {
                i10++;
            }
        }
        int i11 = i10;
        List d9 = d(stackTraceElementArr, 4);
        if (d9 != null) {
            byte b9 = (byte) (0 | 1);
            U u9 = null;
            if (sVar2 != null && i11 == 0) {
                u9 = c(sVar2, i9 + 1);
            }
            if (b9 == 1) {
                return new U(str, (String) sVar.f16504b, d9, u9, i11);
            }
            StringBuilder sb = new StringBuilder();
            if ((b9 & 1) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException(z.f("Missing required properties:", sb));
        }
        throw new NullPointerException("Null frames");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [B6.X, java.lang.Object] */
    public static List d(StackTraceElement[] stackTraceElementArr, int i9) {
        long j;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.f879e = i9;
            obj.f880f = (byte) (obj.f880f | 4);
            long j4 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j4 = stackTraceElement.getLineNumber();
            }
            obj.f875a = j;
            byte b9 = (byte) (obj.f880f | 1);
            obj.f880f = b9;
            if (str != null) {
                obj.f876b = str;
                obj.f877c = fileName;
                obj.f878d = j4;
                obj.f880f = (byte) (b9 | 2);
                arrayList.add(obj.a());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static V e() {
        byte b9 = (byte) 1;
        if (b9 == 1) {
            return new V(0L, "0", "0");
        }
        StringBuilder sb = new StringBuilder();
        if (b9 == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(z.f("Missing required properties:", sb));
    }

    public final List a() {
        byte b9 = (byte) (((byte) (0 | 1)) | 2);
        C2218a c2218a = this.f25104c;
        String str = c2218a.f25026e;
        if (str != null) {
            if (b9 == 3) {
                return Collections.singletonList(new T(0L, 0L, str, c2218a.f25023b));
            }
            StringBuilder sb = new StringBuilder();
            if ((b9 & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((b9 & 2) == 0) {
                sb.append(" size");
            }
            throw new IllegalStateException(z.f("Missing required properties:", sb));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Type inference failed for: r2v9, types: [B6.b0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B6.C0015c0 b(int r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.q.b(int):B6.c0");
    }
}
