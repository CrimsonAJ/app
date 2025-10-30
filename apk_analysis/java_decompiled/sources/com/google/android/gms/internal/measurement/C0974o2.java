package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s.C1939i;

/* renamed from: com.google.android.gms.internal.measurement.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974o2 implements InterfaceC0993s2 {

    /* renamed from: b, reason: collision with root package name */
    public static final Z1 f15558b = new Z1(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f15559a;

    public /* synthetic */ C0974o2(Object obj) {
        this.f15559a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [s.i] */
    public Object a() {
        HashMap hashMap;
        C1027z1 c1027z1 = (C1027z1) this.f15559a;
        ContentResolver contentResolver = c1027z1.f15703a;
        Uri uri = c1027z1.f15704b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor query = acquireUnstableContentProviderClient.query(uri, C1027z1.f15702i, null, null, null);
            try {
                if (query == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                if (count <= 256) {
                    hashMap = new C1939i(count);
                } else {
                    hashMap = new HashMap(count, 1.0f);
                }
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                if (!query.isAfterLast()) {
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map2 = Collections.EMPTY_MAP;
                    query.close();
                    return map2;
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (RemoteException e8) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e8);
            return Collections.EMPTY_MAP;
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0993s2
    public A2 b(Class cls) {
        for (int i9 = 0; i9 < 2; i9++) {
            InterfaceC0993s2 interfaceC0993s2 = ((InterfaceC0993s2[]) this.f15559a)[i9];
            if (interfaceC0993s2.c(cls)) {
                return interfaceC0993s2.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0993s2
    public boolean c(Class cls) {
        for (int i9 = 0; i9 < 2; i9++) {
            if (((InterfaceC0993s2[]) this.f15559a)[i9].c(cls)) {
                return true;
            }
        }
        return false;
    }

    public void d(int i9, Object obj, B2 b22) {
        U1 u12 = (U1) this.f15559a;
        u12.M(i9, 3);
        b22.e((N1) obj, u12.j);
        u12.M(i9, 4);
    }

    public void e(int i9, Object obj, B2 b22) {
        N1 n12 = (N1) obj;
        U1 u12 = (U1) this.f15559a;
        u12.O((i9 << 3) | 2);
        u12.O(n12.a(b22));
        b22.e(n12, u12.j);
    }

    public C0974o2(int i9) {
        switch (i9) {
            case 1:
                this.f15559a = new HashMap();
                return;
            default:
                C1023y2 c1023y2 = C1023y2.f15696c;
                C0974o2 c0974o2 = new C0974o2(new InterfaceC0993s2[]{Z1.f15427b, f15558b});
                Charset charset = AbstractC0944i2.f15502a;
                this.f15559a = c0974o2;
                return;
        }
    }

    public C0974o2(U1 u12) {
        Charset charset = AbstractC0944i2.f15502a;
        this.f15559a = u12;
        u12.j = this;
    }
}
