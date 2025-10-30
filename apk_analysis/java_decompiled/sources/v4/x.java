package v4;

import F4.y;
import android.util.LruCache;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x extends LruCache {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f23893a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c cVar) {
        super(20);
        this.f23893a = cVar;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z9, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (!z9) {
            return;
        }
        ArrayList arrayList = this.f23893a.f23796g;
        y.h(arrayList);
        arrayList.add(num);
    }
}
