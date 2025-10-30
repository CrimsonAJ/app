package C3;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f1563a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        A a5 = this.f1563a;
        return a5.a(obj2) - a5.a(obj);
    }
}
