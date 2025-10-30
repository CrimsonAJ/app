package Y2;

import P5.F;
import P5.S;
import android.net.Uri;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.C1446b0;
import j3.O;
import j3.P;
import j3.T;
import j3.U;
import j3.V;
import j3.Y;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f8611a;

    /* renamed from: b, reason: collision with root package name */
    public String f8612b;

    /* renamed from: c, reason: collision with root package name */
    public Comparable f8613c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8614d = new O();

    /* renamed from: e, reason: collision with root package name */
    public Object f8615e = new r(6);

    /* renamed from: f, reason: collision with root package name */
    public Object f8616f = Collections.EMPTY_LIST;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f8617g = S.f5926e;

    /* renamed from: h, reason: collision with root package name */
    public Object f8618h;

    /* renamed from: i, reason: collision with root package name */
    public Object f8619i;
    public Object j;

    /* JADX WARN: Type inference failed for: r0v4, types: [R3.t, java.lang.Object] */
    public h() {
        ?? obj = new Object();
        obj.f6651a = -9223372036854775807L;
        obj.f6652b = -9223372036854775807L;
        obj.f6653c = -9223372036854775807L;
        obj.f6654d = -3.4028235E38f;
        obj.f6655e = -3.4028235E38f;
        this.f8619i = obj;
        this.j = V.f19480c;
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f8618h;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public i b() {
        String str;
        if (this.f8611a == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((m) this.f8615e) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f8616f) == null) {
            str = AbstractC0953k1.n(str, " eventMillis");
        }
        if (((Long) this.f8617g) == null) {
            str = AbstractC0953k1.n(str, " uptimeMillis");
        }
        if (((HashMap) this.f8618h) == null) {
            str = AbstractC0953k1.n(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new i(this.f8611a, (Integer) this.f8613c, (m) this.f8615e, ((Long) this.f8616f).longValue(), ((Long) this.f8617g).longValue(), (HashMap) this.f8618h, (Integer) this.f8614d, this.f8612b, (byte[]) this.f8619i, (byte[]) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [j3.P, j3.Q] */
    public Y c() {
        boolean z9;
        U u9;
        r rVar = (r) this.f8615e;
        if (((Uri) rVar.f8648b) != null && ((UUID) rVar.f8647a) == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC1566a.m(z9);
        Uri uri = (Uri) this.f8613c;
        j3.S s9 = null;
        if (uri != null) {
            String str = this.f8612b;
            r rVar2 = (r) this.f8615e;
            if (((UUID) rVar2.f8647a) != null) {
                s9 = new j3.S(rVar2);
            }
            u9 = new U(uri, str, s9, (List) this.f8616f, (F) this.f8617g);
        } else {
            u9 = null;
        }
        String str2 = this.f8611a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        O o9 = (O) this.f8614d;
        o9.getClass();
        ?? p9 = new P(o9);
        T a5 = ((R3.t) this.f8619i).a();
        C1446b0 c1446b0 = (C1446b0) this.f8618h;
        if (c1446b0 == null) {
            c1446b0 = C1446b0.f19533Z;
        }
        return new Y(str3, p9, u9, a5, c1446b0, (V) this.j);
    }
}
