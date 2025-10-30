package v4;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i extends s {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ t4.n[] f23856A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f23857B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f23858C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ long f23859D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f23860E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t4.n[] nVarArr, int i9, int i10, long j) {
        super(hVar, false);
        this.f23856A = nVarArr;
        this.f23857B = i9;
        this.f23858C = i10;
        this.f23859D = j;
        this.f23860E = hVar;
    }

    @Override // v4.s
    public final void N() {
        String k02;
        boolean z9 = true;
        y4.n nVar = this.f23860E.f23849c;
        y4.o O8 = O();
        int i9 = this.f23858C;
        nVar.getClass();
        t4.n[] nVarArr = this.f23856A;
        int length = nVarArr.length;
        if (length != 0) {
            int i10 = this.f23857B;
            if (i10 >= 0 && i10 < length) {
                long j = this.f23859D;
                if (j != -1 && j < 0) {
                    throw new IllegalArgumentException(AbstractC0953k1.k(j, "playPosition can not be negative: "));
                }
                JSONObject jSONObject = new JSONObject();
                long n7 = nVar.n();
                nVar.j.a(n7, O8);
                try {
                    jSONObject.put("requestId", n7);
                    jSONObject.put("type", "QUEUE_LOAD");
                    JSONArray jSONArray = new JSONArray();
                    for (int i11 = 0; i11 < nVarArr.length; i11++) {
                        jSONArray.put(i11, nVarArr[i11].g());
                    }
                    jSONObject.put("items", jSONArray);
                    k02 = AbstractC1002u1.k0(Integer.valueOf(i9));
                } catch (JSONException unused) {
                }
                if (k02 != null) {
                    jSONObject.put("repeatMode", k02);
                    jSONObject.put("startIndex", i10);
                    if (j != -1) {
                        Pattern pattern = y4.a.f24915a;
                        jSONObject.put("currentTime", j / 1000.0d);
                    }
                    int i12 = nVar.f24946i;
                    if (i12 == -1) {
                        z9 = false;
                    }
                    if (z9) {
                        jSONObject.put("sequenceNumber", i12);
                    }
                    nVar.o(n7, jSONObject.toString());
                    return;
                }
                throw new IllegalArgumentException("Invalid repeat mode: " + i9);
            }
            throw new IllegalArgumentException(AbstractC0953k1.j(i10, "Invalid startIndex: "));
        }
        throw new IllegalArgumentException("items must not be null or empty.");
    }
}
