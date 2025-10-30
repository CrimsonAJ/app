package l8;

import java.io.Closeable;
import java.util.ArrayList;
import x8.I;

/* loaded from: classes.dex */
public final class e implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f20629a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20630b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f20631c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f20632d;

    public e(g gVar, String key, long j, ArrayList arrayList, long[] lengths) {
        kotlin.jvm.internal.h.e(key, "key");
        kotlin.jvm.internal.h.e(lengths, "lengths");
        this.f20632d = gVar;
        this.f20629a = key;
        this.f20630b = j;
        this.f20631c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f20631c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            k8.c.d((I) obj);
        }
    }
}
