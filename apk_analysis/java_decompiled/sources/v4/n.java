package v4;

import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends s {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f23871A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ h f23872B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Object f23873C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(h hVar, Object obj, int i9) {
        super(hVar, false);
        this.f23871A = i9;
        this.f23873C = obj;
        this.f23872B = hVar;
    }

    @Override // v4.s
    public final void N() {
        Object obj = this.f23873C;
        h hVar = this.f23872B;
        switch (this.f23871A) {
            case 0:
                y4.n nVar = hVar.f23849c;
                y4.o O8 = O();
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long n7 = nVar.n();
                long j = ((t4.o) obj).f23223a;
                try {
                    jSONObject.put("requestId", n7);
                    jSONObject.put("type", "SEEK");
                    jSONObject.put("mediaSessionId", nVar.B());
                    Pattern pattern = y4.a.f24915a;
                    jSONObject.put("currentTime", j / 1000.0d);
                } catch (JSONException unused) {
                }
                nVar.o(n7, jSONObject.toString());
                nVar.f24944g = Long.valueOf(j);
                nVar.f24950n.a(n7, new y4.l(nVar, O8, 0));
                return;
            default:
                y4.o O9 = O();
                y4.n nVar2 = hVar.f23849c;
                nVar2.getClass();
                long[] jArr = (long[]) obj;
                JSONObject jSONObject2 = new JSONObject();
                long n9 = nVar2.n();
                try {
                    jSONObject2.put("requestId", n9);
                    jSONObject2.put("type", "EDIT_TRACKS_INFO");
                    jSONObject2.put("mediaSessionId", nVar2.B());
                    JSONArray jSONArray = new JSONArray();
                    for (int i9 = 0; i9 < jArr.length; i9++) {
                        jSONArray.put(i9, jArr[i9]);
                    }
                    jSONObject2.put("activeTrackIds", jSONArray);
                } catch (JSONException unused2) {
                }
                nVar2.o(n9, jSONObject2.toString());
                nVar2.f24954r.a(n9, O9);
                return;
        }
    }
}
