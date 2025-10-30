package co.notix;

import android.content.Context;
import java.util.ArrayList;
import l6.C1574f;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public final y8 f11836a;

    /* renamed from: b, reason: collision with root package name */
    public final g8.a f11837b;

    public ab(d9 contextProvider) {
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        this.f11836a = contextProvider;
        this.f11837b = g8.e.a();
    }

    public final C1574f a() {
        ArrayList arrayList;
        Object obj;
        String string = ((d9) this.f11836a).a().getString(R.string.notix_public_app_name);
        kotlin.jvm.internal.h.d(string, "context.getString(R.string.notix_public_app_name)");
        synchronized (C1574f.f20585k) {
            arrayList = new ArrayList(C1574f.f20586l.values());
        }
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i9);
            i9++;
            C1574f c1574f = (C1574f) obj;
            c1574f.a();
            if (kotlin.jvm.internal.h.a(c1574f.f20588b, string)) {
                break;
            }
        }
        return (C1574f) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:12:0x004c, B:14:0x0052), top: B:11:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, E7.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof co.notix.za
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.za r0 = (co.notix.za) r0
            int r1 = r0.f13652f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13652f = r1
            goto L18
        L13:
            co.notix.za r0 = new co.notix.za
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f13650d
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13652f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r5 = r0.f13649c
            g8.a r1 = r0.f13648b
            co.notix.ab r0 = r0.f13647a
            a.AbstractC0485a.A(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a.AbstractC0485a.A(r7)
            g8.a r7 = r4.f11837b
            r0.f13647a = r4
            r0.f13648b = r7
            r0.f13649c = r5
            r0.f13652f = r3
            java.lang.Object r0 = r7.d(r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r4
            r1 = r7
        L4b:
            r7 = 0
            l6.f r2 = r0.a()     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L59
            l6.f r2 = r0.a(r5)     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r5 = move-exception
            goto L5d
        L59:
            r1.a(r7)
            return r2
        L5d:
            r1.a(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ab.b(long, E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r5, E7.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof co.notix.ya
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.ya r0 = (co.notix.ya) r0
            int r1 = r0.f13593c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13593c = r1
            goto L18
        L13:
            co.notix.ya r0 = new co.notix.ya
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f13591a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13593c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            a.AbstractC0485a.A(r7)
            r0.f13593c = r3
            java.lang.Object r7 = r4.b(r5, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            l6.f r7 = (l6.C1574f) r7
            java.lang.Class<com.google.firebase.messaging.FirebaseMessaging> r5 = com.google.firebase.messaging.FirebaseMessaging.class
            java.lang.Object r5 = r7.b(r5)
            java.lang.String r6 = "getFirebaseApp(senderId)…aseMessaging::class.java)"
            kotlin.jvm.internal.h.d(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ab.a(long, E7.d):java.lang.Object");
    }

    public final C1574f a(long j) {
        Context a5 = ((d9) this.f11836a).a();
        String string = a5.getString(R.string.notix_public_app_name);
        kotlin.jvm.internal.h.d(string, "context.getString(R.string.notix_public_app_name)");
        String string2 = a5.getString(R.string.notix_public_app_id);
        kotlin.jvm.internal.h.d(string2, "context.getString(R.string.notix_public_app_id)");
        String string3 = a5.getString(R.string.notix_public_api_key);
        kotlin.jvm.internal.h.d(string3, "context.getString(R.string.notix_public_api_key)");
        String string4 = a5.getString(R.string.notix_public_project_id);
        kotlin.jvm.internal.h.d(string4, "context.getString(R.stri….notix_public_project_id)");
        String valueOf = String.valueOf(j);
        F4.y.f(string2, "ApplicationId must be set.");
        F4.y.f(string3, "ApiKey must be set.");
        return C1574f.g(a5, string, new l6.i(string2, string3, null, null, valueOf, null, string4));
    }
}
