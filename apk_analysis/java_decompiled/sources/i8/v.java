package i8;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final P f19155a;

    /* renamed from: b, reason: collision with root package name */
    public final C1424n f19156b;

    /* renamed from: c, reason: collision with root package name */
    public final List f19157c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.l f19158d;

    public v(P p9, C1424n c1424n, List list, O7.a aVar) {
        this.f19155a = p9;
        this.f19156b = c1424n;
        this.f19157c = list;
        this.f19158d = Z0.a.q(new b0.e(1, aVar));
    }

    public final List a() {
        return (List) this.f19158d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (vVar.f19155a == this.f19155a && kotlin.jvm.internal.h.a(vVar.f19156b, this.f19156b) && kotlin.jvm.internal.h.a(vVar.a(), a()) && kotlin.jvm.internal.h.a(vVar.f19157c, this.f19157c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19157c.hashCode() + ((a().hashCode() + ((this.f19156b.hashCode() + ((this.f19155a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a5 = a();
        ArrayList arrayList = new ArrayList(B7.m.f0(a5, 10));
        for (Certificate certificate : a5) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.h.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f19155a);
        sb.append(" cipherSuite=");
        sb.append(this.f19156b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f19157c;
        ArrayList arrayList2 = new ArrayList(B7.m.f0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.h.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
