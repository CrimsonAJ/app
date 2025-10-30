package T3;

import android.net.Uri;
import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class m extends n {

    /* renamed from: n, reason: collision with root package name */
    public static final m f7141n;

    /* renamed from: d, reason: collision with root package name */
    public final List f7142d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7143e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7144f;

    /* renamed from: g, reason: collision with root package name */
    public final List f7145g;

    /* renamed from: h, reason: collision with root package name */
    public final List f7146h;

    /* renamed from: i, reason: collision with root package name */
    public final List f7147i;
    public final M j;

    /* renamed from: k, reason: collision with root package name */
    public final List f7148k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f7149l;

    /* renamed from: m, reason: collision with root package name */
    public final List f7150m;

    static {
        List list = Collections.EMPTY_LIST;
        f7141n = new m("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public m(String str, List list, List list2, List list3, List list4, List list5, List list6, M m9, List list7, boolean z9, Map map, List list8) {
        super(str, list, z9);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list2.size(); i9++) {
            Uri uri = ((l) list2.get(i9)).f7135a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.f7142d = Collections.unmodifiableList(arrayList);
        this.f7143e = Collections.unmodifiableList(list2);
        this.f7144f = Collections.unmodifiableList(list3);
        this.f7145g = Collections.unmodifiableList(list4);
        this.f7146h = Collections.unmodifiableList(list5);
        this.f7147i = Collections.unmodifiableList(list6);
        this.j = m9;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f7148k = list9;
        this.f7149l = Collections.unmodifiableMap(map);
        this.f7150m = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            Uri uri = ((k) list.get(i9)).f7132a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i9, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    M3.b bVar = (M3.b) list2.get(i11);
                    if (bVar.f4779b == i9 && bVar.f4780c == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    @Override // M3.a
    public final Object a(List list) {
        ArrayList c3 = c(this.f7143e, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new m(this.f7151a, this.f7152b, c3, list2, c(this.f7145g, 1, list), c(this.f7146h, 2, list), list2, this.j, this.f7148k, this.f7153c, this.f7149l, this.f7150m);
    }
}
