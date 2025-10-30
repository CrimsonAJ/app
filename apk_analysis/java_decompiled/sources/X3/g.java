package X3;

import N3.o0;
import j3.L;
import j3.M;
import j3.j0;
import java.util.LinkedList;
import l4.AbstractC1566a;
import l4.y;
import n3.C1629f;
import n3.C1630g;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f8447e;

    /* renamed from: f, reason: collision with root package name */
    public int f8448f;

    /* renamed from: g, reason: collision with root package name */
    public int f8449g;

    /* renamed from: h, reason: collision with root package name */
    public long f8450h;

    /* renamed from: i, reason: collision with root package name */
    public long f8451i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f8452k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8453l;

    /* renamed from: m, reason: collision with root package name */
    public a f8454m;

    public g(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f8452k = -1;
        this.f8454m = null;
        this.f8447e = new LinkedList();
    }

    @Override // X3.d
    public final void a(Object obj) {
        boolean z9;
        if (obj instanceof b) {
            this.f8447e.add((b) obj);
            return;
        }
        if (obj instanceof a) {
            if (this.f8454m == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            AbstractC1566a.m(z9);
            this.f8454m = (a) obj;
        }
    }

    @Override // X3.d
    public final Object b() {
        long O8;
        LinkedList linkedList = this.f8447e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        a aVar = this.f8454m;
        if (aVar != null) {
            C1630g c1630g = new C1630g(new C1629f(aVar.f8413a, null, "video/mp4", aVar.f8414b));
            for (int i9 = 0; i9 < size; i9++) {
                b bVar = bVarArr[i9];
                int i10 = bVar.f8416a;
                if (i10 == 2 || i10 == 1) {
                    int i11 = 0;
                    while (true) {
                        M[] mArr = bVar.j;
                        if (i11 < mArr.length) {
                            L a5 = mArr[i11].a();
                            a5.f19405n = c1630g;
                            mArr[i11] = new M(a5);
                            i11++;
                        }
                    }
                }
            }
        }
        int i12 = this.f8448f;
        int i13 = this.f8449g;
        long j = this.f8450h;
        long j4 = this.f8451i;
        long j9 = this.j;
        int i14 = this.f8452k;
        boolean z9 = this.f8453l;
        a aVar2 = this.f8454m;
        long j10 = -9223372036854775807L;
        if (j4 == 0) {
            O8 = -9223372036854775807L;
        } else {
            O8 = y.O(j4, 1000000L, j);
        }
        if (j9 != 0) {
            j10 = y.O(j9, 1000000L, j);
        }
        return new c(i12, i13, O8, j10, i14, z9, aVar2, bVarArr);
    }

    @Override // X3.d
    public final void j(XmlPullParser xmlPullParser) {
        boolean z9;
        this.f8448f = d.i(xmlPullParser, "MajorVersion");
        this.f8449g = d.i(xmlPullParser, "MinorVersion");
        this.f8450h = d.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue != null) {
            try {
                this.f8451i = Long.parseLong(attributeValue);
                this.j = d.h(xmlPullParser, "DVRWindowLength", 0L);
                this.f8452k = d.g(xmlPullParser, "LookaheadCount");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
                if (attributeValue2 != null) {
                    z9 = Boolean.parseBoolean(attributeValue2);
                } else {
                    z9 = false;
                }
                this.f8453l = z9;
                l(Long.valueOf(this.f8450h), "TimeScale");
                return;
            } catch (NumberFormatException e8) {
                throw j0.b(null, e8);
            }
        }
        throw new o0("Duration", 1);
    }
}
