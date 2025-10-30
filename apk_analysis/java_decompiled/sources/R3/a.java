package R3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f6575a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6576b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6577c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6578d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6579e;

    /* renamed from: f, reason: collision with root package name */
    public final List f6580f;

    public a(int i9, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f6575a = i9;
        this.f6576b = i10;
        this.f6577c = Collections.unmodifiableList(arrayList);
        this.f6578d = Collections.unmodifiableList(list);
        this.f6579e = Collections.unmodifiableList(list2);
        this.f6580f = Collections.unmodifiableList(list3);
    }
}
