package v4;

import F4.y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o extends s {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ double f23874A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ h f23875B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, double d9) {
        super(hVar, false);
        this.f23874A = d9;
        this.f23875B = hVar;
    }

    @Override // v4.s
    public final void N() {
        y4.n nVar = this.f23875B.f23849c;
        y4.o O8 = O();
        double d9 = this.f23874A;
        if (nVar.f24943f != null) {
            JSONObject jSONObject = new JSONObject();
            long n7 = nVar.n();
            try {
                jSONObject.put("requestId", n7);
                jSONObject.put("type", "SET_PLAYBACK_RATE");
                jSONObject.put("playbackRate", d9);
                y.i(nVar.f24943f, "mediaStatus should not be null");
                jSONObject.put("mediaSessionId", nVar.f24943f.f23225b);
            } catch (JSONException unused) {
            }
            nVar.o(n7, jSONObject.toString());
            nVar.f24960x.a(n7, O8);
            return;
        }
        throw new Exception();
    }
}
