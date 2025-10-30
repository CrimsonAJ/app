package X3;

import N3.o0;
import j3.M;
import j3.j0;
import java.util.ArrayList;
import java.util.LinkedList;
import l4.y;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: e, reason: collision with root package name */
    public final String f8455e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f8456f;

    /* renamed from: g, reason: collision with root package name */
    public int f8457g;

    /* renamed from: h, reason: collision with root package name */
    public String f8458h;

    /* renamed from: i, reason: collision with root package name */
    public long f8459i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public String f8460k;

    /* renamed from: l, reason: collision with root package name */
    public int f8461l;

    /* renamed from: m, reason: collision with root package name */
    public int f8462m;

    /* renamed from: n, reason: collision with root package name */
    public int f8463n;

    /* renamed from: o, reason: collision with root package name */
    public int f8464o;

    /* renamed from: p, reason: collision with root package name */
    public String f8465p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f8466q;

    /* renamed from: r, reason: collision with root package name */
    public long f8467r;

    public h(d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f8455e = str;
        this.f8456f = new LinkedList();
    }

    @Override // X3.d
    public final void a(Object obj) {
        if (obj instanceof M) {
            this.f8456f.add((M) obj);
        }
    }

    @Override // X3.d
    public final Object b() {
        LinkedList linkedList = this.f8456f;
        M[] mArr = new M[linkedList.size()];
        linkedList.toArray(mArr);
        String str = this.f8460k;
        int i9 = this.f8457g;
        String str2 = this.f8458h;
        long j = this.f8459i;
        String str3 = this.j;
        int i10 = this.f8461l;
        int i11 = this.f8462m;
        int i12 = this.f8463n;
        int i13 = this.f8464o;
        String str4 = this.f8465p;
        ArrayList arrayList = this.f8466q;
        long j4 = this.f8467r;
        int i14 = y.f20553a;
        int size = arrayList.size();
        long[] jArr = new long[size];
        if (j >= 1000000 && j % 1000000 == 0) {
            long j9 = j / 1000000;
            for (int i15 = 0; i15 < size; i15++) {
                jArr[i15] = ((Long) arrayList.get(i15)).longValue() / j9;
            }
        } else if (j < 1000000 && 1000000 % j == 0) {
            long j10 = 1000000 / j;
            for (int i16 = 0; i16 < size; i16++) {
                jArr[i16] = ((Long) arrayList.get(i16)).longValue() * j10;
            }
        } else {
            double d9 = 1000000 / j;
            int i17 = 0;
            while (i17 < size) {
                double d10 = d9;
                jArr[i17] = (long) (((Long) arrayList.get(i17)).longValue() * d10);
                i17++;
                d9 = d10;
            }
        }
        return new b(this.f8455e, str, i9, str2, j, str3, i10, i11, i12, i13, str4, mArr, arrayList, jArr, y.O(j4, 1000000L, j));
    }

    @Override // X3.d
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // X3.d
    public final void j(XmlPullParser xmlPullParser) {
        int i9 = 1;
        if ("c".equals(xmlPullParser.getName())) {
            int size = this.f8466q.size();
            long h7 = d.h(xmlPullParser, "t", -9223372036854775807L);
            if (h7 == -9223372036854775807L) {
                if (size == 0) {
                    h7 = 0;
                } else if (this.f8467r != -1) {
                    h7 = this.f8467r + ((Long) this.f8466q.get(size - 1)).longValue();
                } else {
                    throw j0.b("Unable to infer start time", null);
                }
            }
            this.f8466q.add(Long.valueOf(h7));
            this.f8467r = d.h(xmlPullParser, "d", -9223372036854775807L);
            long h9 = d.h(xmlPullParser, "r", 1L);
            if (h9 > 1 && this.f8467r == -9223372036854775807L) {
                throw j0.b("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j = i9;
                if (j < h9) {
                    this.f8466q.add(Long.valueOf((this.f8467r * j) + h7));
                    i9++;
                } else {
                    return;
                }
            }
        } else {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if (!"audio".equalsIgnoreCase(attributeValue)) {
                    if ("video".equalsIgnoreCase(attributeValue)) {
                        i9 = 2;
                    } else if ("text".equalsIgnoreCase(attributeValue)) {
                        i9 = 3;
                    } else {
                        throw j0.b("Invalid key value[" + attributeValue + "]", null);
                    }
                }
                this.f8457g = i9;
                l(Integer.valueOf(i9), "Type");
                if (this.f8457g == 3) {
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                    if (attributeValue2 != null) {
                        this.f8458h = attributeValue2;
                    } else {
                        throw new o0("Subtype", 1);
                    }
                } else {
                    this.f8458h = xmlPullParser.getAttributeValue(null, "Subtype");
                }
                l(this.f8458h, "Subtype");
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
                this.j = attributeValue3;
                l(attributeValue3, "Name");
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
                if (attributeValue4 != null) {
                    this.f8460k = attributeValue4;
                    this.f8461l = d.g(xmlPullParser, "MaxWidth");
                    this.f8462m = d.g(xmlPullParser, "MaxHeight");
                    this.f8463n = d.g(xmlPullParser, "DisplayWidth");
                    this.f8464o = d.g(xmlPullParser, "DisplayHeight");
                    String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
                    this.f8465p = attributeValue5;
                    l(attributeValue5, "Language");
                    long g9 = d.g(xmlPullParser, "TimeScale");
                    this.f8459i = g9;
                    if (g9 == -1) {
                        this.f8459i = ((Long) c("TimeScale")).longValue();
                    }
                    this.f8466q = new ArrayList();
                    return;
                }
                throw new o0("Url", 1);
            }
            throw new o0("Type", 1);
        }
    }
}
