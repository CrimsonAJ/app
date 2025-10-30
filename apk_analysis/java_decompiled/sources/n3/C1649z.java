package n3;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import i.G;
import j3.AbstractC1455g;
import java.util.Map;
import java.util.UUID;
import l4.AbstractC1566a;
import m3.InterfaceC1588a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: n3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1649z implements InterfaceC1645v {

    /* renamed from: d, reason: collision with root package name */
    public static final k8.a f21146d = new k8.a(8);

    /* renamed from: a, reason: collision with root package name */
    public final UUID f21147a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f21148b;

    /* renamed from: c, reason: collision with root package name */
    public int f21149c;

    public C1649z(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = AbstractC1455g.f19617b;
        AbstractC1566a.g("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f21147a = uuid;
        MediaDrm mediaDrm = new MediaDrm((l4.y.f20553a >= 27 || !AbstractC1455g.f19618c.equals(uuid)) ? uuid : uuid2);
        this.f21148b = mediaDrm;
        this.f21149c = 1;
        if (AbstractC1455g.f19619d.equals(uuid) && "ASUS_Z00AD".equals(l4.y.f20556d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // n3.InterfaceC1645v
    public final synchronized void a() {
        int i9 = this.f21149c - 1;
        this.f21149c = i9;
        if (i9 == 0) {
            this.f21148b.release();
        }
    }

    @Override // n3.InterfaceC1645v
    public final void b(byte[] bArr, byte[] bArr2) {
        this.f21148b.restoreKeys(bArr, bArr2);
    }

    @Override // n3.InterfaceC1645v
    public final Map c(byte[] bArr) {
        return this.f21148b.queryKeyStatus(bArr);
    }

    @Override // n3.InterfaceC1645v
    public final void d(byte[] bArr) {
        this.f21148b.closeSession(bArr);
    }

    @Override // n3.InterfaceC1645v
    public final void g(final G g9) {
        this.f21148b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: n3.x
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i9, int i10, byte[] bArr2) {
                C1649z c1649z = C1649z.this;
                G g10 = g9;
                c1649z.getClass();
                C3.e eVar = ((C1628e) g10.f17990b).f21114u;
                eVar.getClass();
                eVar.obtainMessage(i9, bArr).sendToTarget();
            }
        });
    }

    @Override // n3.InterfaceC1645v
    public final byte[] h(byte[] bArr, byte[] bArr2) {
        if (AbstractC1455g.f19618c.equals(this.f21147a) && l4.y.f20553a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(l4.y.m(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    if (i9 != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(O5.e.f5491c);
            } catch (JSONException e8) {
                AbstractC1566a.u("ClearKeyUtil", "Failed to adjust response data: ".concat(l4.y.m(bArr2)), e8);
            }
        }
        return this.f21148b.provideKeyResponse(bArr, bArr2);
    }

    @Override // n3.InterfaceC1645v
    public final C1644u j() {
        MediaDrm.ProvisionRequest provisionRequest = this.f21148b.getProvisionRequest();
        return new C1644u(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // n3.InterfaceC1645v
    public final void k(byte[] bArr, k3.l lVar) {
        if (l4.y.f20553a >= 31) {
            try {
                AbstractC1648y.b(this.f21148b, bArr, lVar);
            } catch (UnsupportedOperationException unused) {
                AbstractC1566a.P("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // n3.InterfaceC1645v
    public final void m(byte[] bArr) {
        this.f21148b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x019f, code lost:
    
        if (r5 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        if ("AFTT".equals(r5) == false) goto L80;
     */
    @Override // n3.InterfaceC1645v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n3.C1643t n(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C1649z.n(byte[], java.util.List, int, java.util.HashMap):n3.t");
    }

    @Override // n3.InterfaceC1645v
    public final int p() {
        return 2;
    }

    @Override // n3.InterfaceC1645v
    public final InterfaceC1588a q(byte[] bArr) {
        boolean z9;
        int i9 = l4.y.f20553a;
        UUID uuid = this.f21147a;
        if (i9 < 21 && AbstractC1455g.f19619d.equals(uuid) && "L3".equals(this.f21148b.getPropertyString("securityLevel"))) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i9 < 27 && AbstractC1455g.f19618c.equals(uuid)) {
            uuid = AbstractC1455g.f19617b;
        }
        return new C1646w(uuid, bArr, z9);
    }

    @Override // n3.InterfaceC1645v
    public final boolean v(String str, byte[] bArr) {
        if (l4.y.f20553a >= 31) {
            return AbstractC1648y.a(this.f21148b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f21147a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // n3.InterfaceC1645v
    public final byte[] w() {
        return this.f21148b.openSession();
    }
}
