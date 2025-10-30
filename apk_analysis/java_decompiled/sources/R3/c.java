package R3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import l4.y;

/* loaded from: classes.dex */
public final class c implements M3.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f6585a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6586b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6587c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6588d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6589e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6590f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6591g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6592h;

    /* renamed from: i, reason: collision with root package name */
    public final u f6593i;
    public final t j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f6594k;

    /* renamed from: l, reason: collision with root package name */
    public final i f6595l;

    /* renamed from: m, reason: collision with root package name */
    public final List f6596m;

    public c(long j, long j4, long j9, boolean z9, long j10, long j11, long j12, long j13, i iVar, u uVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f6585a = j;
        this.f6586b = j4;
        this.f6587c = j9;
        this.f6588d = z9;
        this.f6589e = j10;
        this.f6590f = j11;
        this.f6591g = j12;
        this.f6592h = j13;
        this.f6595l = iVar;
        this.f6593i = uVar;
        this.f6594k = uri;
        this.j = tVar;
        this.f6596m = arrayList;
    }

    @Override // M3.a
    public final Object a(List list) {
        long j;
        long j4;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new M3.b());
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        int i9 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i9 >= this.f6596m.size()) {
                break;
            }
            if (((M3.b) linkedList.peek()).f4778a != i9) {
                long c3 = c(i9);
                if (c3 != -9223372036854775807L) {
                    j9 += c3;
                }
            } else {
                h b9 = b(i9);
                List list2 = b9.f6617c;
                M3.b bVar = (M3.b) linkedList.poll();
                int i10 = bVar.f4778a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = bVar.f4779b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f6577c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(bVar.f4780c));
                        bVar = (M3.b) linkedList.poll();
                        if (bVar.f4778a != i10) {
                            break;
                        }
                    } while (bVar.f4779b == i11);
                    j4 = j9;
                    arrayList2.add(new a(aVar.f6575a, aVar.f6576b, arrayList3, aVar.f6578d, aVar.f6579e, aVar.f6580f));
                    if (bVar.f4778a != i10) {
                        break;
                    }
                    j9 = j4;
                }
                linkedList.addFirst(bVar);
                arrayList.add(new h(b9.f6615a, b9.f6616b - j4, arrayList2, b9.f6618d));
                j9 = j4;
            }
            i9++;
        }
        long j10 = j9;
        long j11 = this.f6586b;
        if (j11 != -9223372036854775807L) {
            j = j11 - j10;
        }
        t tVar = this.j;
        Uri uri = this.f6594k;
        return new c(this.f6585a, j, this.f6587c, this.f6588d, this.f6589e, this.f6590f, this.f6591g, this.f6592h, this.f6595l, this.f6593i, tVar, uri, arrayList);
    }

    public final h b(int i9) {
        return (h) this.f6596m.get(i9);
    }

    public final long c(int i9) {
        long j;
        long j4;
        List list = this.f6596m;
        if (i9 == list.size() - 1) {
            j = this.f6586b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j4 = ((h) list.get(i9)).f6616b;
        } else {
            j = ((h) list.get(i9 + 1)).f6616b;
            j4 = ((h) list.get(i9)).f6616b;
        }
        return j - j4;
    }

    public final long d(int i9) {
        return y.H(c(i9));
    }
}
