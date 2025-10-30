package c1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752a {

    /* renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList f11587a;

    public static void a(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
        } else {
            throw A0.a.h(it);
        }
    }
}
