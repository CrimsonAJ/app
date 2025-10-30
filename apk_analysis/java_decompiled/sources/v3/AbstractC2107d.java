package v3;

import P5.AbstractC0349q;
import P5.C;
import P5.D;
import P5.F;
import P5.S;
import java.util.Arrays;
import l4.AbstractC1566a;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: v3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2107d {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f23777a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f23778b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f23779c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r8 == (-1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Y3.e a(java.lang.String r20) {
        /*
            r0 = 1
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            java.io.StringReader r2 = new java.io.StringReader
            r3 = r20
            r2.<init>(r3)
            r1.setInput(r2)
            r1.next()
            java.lang.String r2 = "x:xmpmeta"
            boolean r3 = l4.AbstractC1566a.E(r1, r2)
            r4 = 0
            if (r3 == 0) goto Lcb
            P5.D r3 = P5.F.f5901b
            P5.S r3 = P5.S.f5926e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L29:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = l4.AbstractC1566a.E(r1, r9)
            if (r9 == 0) goto L97
            java.lang.String[] r3 = v3.AbstractC2107d.f23777a
            r7 = 0
            r8 = r7
        L38:
            r9 = 4
            if (r8 >= r9) goto Lc4
            r10 = r3[r8]
            java.lang.String r10 = l4.AbstractC1566a.y(r1, r10)
            if (r10 == 0) goto L95
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto Lc4
            java.lang.String[] r3 = v3.AbstractC2107d.f23778b
            r8 = r7
        L4c:
            if (r8 >= r9) goto L60
            r10 = r3[r8]
            java.lang.String r10 = l4.AbstractC1566a.y(r1, r10)
            if (r10 == 0) goto L62
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L64
        L60:
            r8 = r5
            goto L64
        L62:
            int r8 = r8 + r0
            goto L4c
        L64:
            java.lang.String[] r3 = v3.AbstractC2107d.f23779c
        L66:
            r10 = 2
            if (r7 >= r10) goto L8f
            r10 = r3[r7]
            java.lang.String r10 = l4.AbstractC1566a.y(r1, r10)
            if (r10 == 0) goto L8d
            long r12 = java.lang.Long.parseLong(r10)
            v3.b r14 = new v3.b
            r15 = 0
            r18 = 0
            java.lang.String r17 = "image/jpeg"
            r14.<init>(r15, r17, r18)
            r3 = r14
            v3.b r11 = new v3.b
            java.lang.String r14 = "video/mp4"
            r11.<init>(r12, r14, r15)
            P5.S r3 = P5.F.t(r3, r11)
            goto L93
        L8d:
            int r7 = r7 + r0
            goto L66
        L8f:
            P5.D r3 = P5.F.f5901b
            P5.S r3 = P5.S.f5926e
        L93:
            r7 = r8
            goto Lb8
        L95:
            int r8 = r8 + r0
            goto L38
        L97:
            java.lang.String r9 = "Container:Directory"
            boolean r9 = l4.AbstractC1566a.E(r1, r9)
            if (r9 == 0) goto La8
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            P5.S r3 = b(r1, r3, r9)
            goto Lb8
        La8:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = l4.AbstractC1566a.E(r1, r9)
            if (r9 == 0) goto Lb8
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            P5.S r3 = b(r1, r3, r9)
        Lb8:
            boolean r9 = l4.AbstractC1566a.D(r1, r2)
            if (r9 == 0) goto L29
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lc5
        Lc4:
            return r4
        Lc5:
            Y3.e r0 = new Y3.e
            r0.<init>(r7, r3)
            return r0
        Lcb:
            java.lang.String r0 = "Couldn't find xmp metadata"
            j3.j0 r0 = j3.j0.a(r0, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.AbstractC2107d.a(java.lang.String):Y3.e");
    }

    public static S b(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        D d9 = F.f5901b;
        AbstractC0349q.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i9 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC1566a.E(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String y9 = AbstractC1566a.y(xmlPullParser, concat3);
                String y10 = AbstractC1566a.y(xmlPullParser, concat4);
                String y11 = AbstractC1566a.y(xmlPullParser, concat5);
                String y12 = AbstractC1566a.y(xmlPullParser, concat6);
                if (y9 != null && y10 != null) {
                    long j4 = 0;
                    if (y11 != null) {
                        j = Long.parseLong(y11);
                    } else {
                        j = 0;
                    }
                    if (y12 != null) {
                        j4 = Long.parseLong(y12);
                    }
                    C2105b c2105b = new C2105b(j, y9, j4);
                    int i10 = i9 + 1;
                    if (objArr.length < i10) {
                        objArr = Arrays.copyOf(objArr, C.e(objArr.length, i10));
                    }
                    objArr[i9] = c2105b;
                    i9 = i10;
                } else {
                    return S.f5926e;
                }
            }
        } while (!AbstractC1566a.D(xmlPullParser, concat2));
        return F.k(i9, objArr);
    }
}
