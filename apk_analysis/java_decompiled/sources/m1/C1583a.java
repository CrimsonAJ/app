package m1;

import D4.s;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import b5.G1;
import com.google.android.gms.internal.cast.RunnableC0869s;
import e1.j;
import e1.q;
import f1.InterfaceC1159a;
import f1.k;
import j1.C1433c;
import j1.InterfaceC1432b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n1.C1613j;
import u0.z;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583a implements InterfaceC1432b, InterfaceC1159a {
    public static final String j = q.j("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final k f20665a;

    /* renamed from: b, reason: collision with root package name */
    public final G1 f20666b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20667c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public String f20668d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f20669e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f20670f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f20671g;

    /* renamed from: h, reason: collision with root package name */
    public final C1433c f20672h;

    /* renamed from: i, reason: collision with root package name */
    public SystemForegroundService f20673i;

    public C1583a(Context context) {
        k b02 = k.b0(context);
        this.f20665a = b02;
        G1 g12 = b02.f17301k;
        this.f20666b = g12;
        this.f20668d = null;
        this.f20669e = new LinkedHashMap();
        this.f20671g = new HashSet();
        this.f20670f = new HashMap();
        this.f20672h = new C1433c(context, g12, this);
        b02.f17303m.b(this);
    }

    public static Intent b(Context context, String str, j jVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", jVar.f17053a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar.f17054b);
        intent.putExtra("KEY_NOTIFICATION", jVar.f17055c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, j jVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", jVar.f17053a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar.f17054b);
        intent.putExtra("KEY_NOTIFICATION", jVar.f17055c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // f1.InterfaceC1159a
    public final void a(String str, boolean z9) {
        boolean z10;
        Map.Entry entry;
        synchronized (this.f20667c) {
            try {
                C1613j c1613j = (C1613j) this.f20670f.remove(str);
                if (c1613j != null) {
                    z10 = this.f20671g.remove(c1613j);
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f20672h.c(this.f20671g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j jVar = (j) this.f20669e.remove(str);
        if (str.equals(this.f20668d) && this.f20669e.size() > 0) {
            Iterator it = this.f20669e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f20668d = (String) entry.getKey();
            if (this.f20673i != null) {
                j jVar2 = (j) entry.getValue();
                SystemForegroundService systemForegroundService = this.f20673i;
                systemForegroundService.f10442b.post(new RunnableC1584b(systemForegroundService, jVar2.f17053a, jVar2.f17055c, jVar2.f17054b));
                SystemForegroundService systemForegroundService2 = this.f20673i;
                systemForegroundService2.f10442b.post(new s(jVar2.f17053a, 6, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f20673i;
        if (jVar != null && systemForegroundService3 != null) {
            q d9 = q.d();
            String str2 = j;
            int i9 = jVar.f17053a;
            int i10 = jVar.f17054b;
            StringBuilder sb = new StringBuilder("Removing Notification (id: ");
            sb.append(i9);
            sb.append(", workSpecId: ");
            sb.append(str);
            sb.append(" ,notificationType: ");
            d9.a(str2, z.g(sb, i10, ")"), new Throwable[0]);
            systemForegroundService3.f10442b.post(new s(jVar.f17053a, 6, systemForegroundService3));
        }
    }

    @Override // j1.InterfaceC1432b
    public final void c(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                String str = (String) obj;
                q.d().a(j, z.e("Constraints unmet for WorkSpec ", str), new Throwable[0]);
                k kVar = this.f20665a;
                kVar.f17301k.i(new o1.j(kVar, str, true));
            }
        }
    }

    public final void f(Intent intent) {
        int i9 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        q d9 = q.d();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        d9.a(j, z.g(sb, intExtra2, ")"), new Throwable[0]);
        if (notification != null && this.f20673i != null) {
            j jVar = new j(intExtra, notification, intExtra2);
            LinkedHashMap linkedHashMap = this.f20669e;
            linkedHashMap.put(stringExtra, jVar);
            if (TextUtils.isEmpty(this.f20668d)) {
                this.f20668d = stringExtra;
                SystemForegroundService systemForegroundService = this.f20673i;
                systemForegroundService.f10442b.post(new RunnableC1584b(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = this.f20673i;
            systemForegroundService2.f10442b.post(new RunnableC0869s(systemForegroundService2, intExtra, notification, 5));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i9 |= ((j) ((Map.Entry) it.next()).getValue()).f17054b;
                }
                j jVar2 = (j) linkedHashMap.get(this.f20668d);
                if (jVar2 != null) {
                    SystemForegroundService systemForegroundService3 = this.f20673i;
                    systemForegroundService3.f10442b.post(new RunnableC1584b(systemForegroundService3, jVar2.f17053a, jVar2.f17055c, i9));
                }
            }
        }
    }

    public final void g() {
        this.f20673i = null;
        synchronized (this.f20667c) {
            this.f20672h.d();
        }
        this.f20665a.f17303m.f(this);
    }

    @Override // j1.InterfaceC1432b
    public final void e(List list) {
    }
}
