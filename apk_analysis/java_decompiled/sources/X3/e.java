package X3;

import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import y3.AbstractC2214j;
import y3.p;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f8443e;

    /* renamed from: f, reason: collision with root package name */
    public UUID f8444f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f8445g;

    @Override // X3.d
    public final Object b() {
        UUID uuid = this.f8444f;
        byte[] a5 = AbstractC2214j.a(uuid, null, this.f8445g);
        byte[] bArr = this.f8445g;
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < bArr.length; i9 += 2) {
            sb.append((char) bArr[i9]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        byte b9 = decode[0];
        decode[0] = decode[3];
        decode[3] = b9;
        byte b10 = decode[1];
        decode[1] = decode[2];
        decode[2] = b10;
        byte b11 = decode[4];
        decode[4] = decode[5];
        decode[5] = b11;
        byte b12 = decode[6];
        decode[6] = decode[7];
        decode[7] = b12;
        return new a(uuid, a5, new p[]{new p(true, null, 8, decode, 0, 0, null)});
    }

    @Override // X3.d
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // X3.d
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f8443e = false;
        }
    }

    @Override // X3.d
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f8443e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f8444f = UUID.fromString(attributeValue);
        }
    }

    @Override // X3.d
    public final void k(XmlPullParser xmlPullParser) {
        if (this.f8443e) {
            this.f8445g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
