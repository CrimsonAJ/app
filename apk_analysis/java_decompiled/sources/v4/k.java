package v4;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k extends s {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f23864A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ h f23865B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(h hVar, int i9) {
        super(hVar, false);
        this.f23864A = i9;
        this.f23865B = hVar;
    }

    @Override // v4.s
    public final void N() {
        switch (this.f23864A) {
            case 0:
                this.f23865B.f23849c.p(O(), 0, -1L, -1, null);
                return;
            case 1:
                this.f23865B.f23849c.p(O(), 0, -1L, 1, null);
                return;
            case 2:
                y4.n nVar = this.f23865B.f23849c;
                y4.o O8 = O();
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long n7 = nVar.n();
                try {
                    jSONObject.put("requestId", n7);
                    jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject.put("mediaSessionId", nVar.B());
                } catch (JSONException unused) {
                }
                nVar.o(n7, jSONObject.toString());
                nVar.f24957u.a(n7, O8);
                return;
            case 3:
                y4.n nVar2 = this.f23865B.f23849c;
                y4.o O9 = O();
                nVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long n9 = nVar2.n();
                try {
                    jSONObject2.put("requestId", n9);
                    jSONObject2.put("type", "PAUSE");
                    jSONObject2.put("mediaSessionId", nVar2.B());
                } catch (JSONException unused2) {
                }
                nVar2.o(n9, jSONObject2.toString());
                nVar2.f24947k.a(n9, O9);
                return;
            case 4:
                y4.n nVar3 = this.f23865B.f23849c;
                y4.o O10 = O();
                nVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long n10 = nVar3.n();
                try {
                    jSONObject3.put("requestId", n10);
                    jSONObject3.put("type", "STOP");
                    jSONObject3.put("mediaSessionId", nVar3.B());
                } catch (JSONException unused3) {
                }
                nVar3.o(n10, jSONObject3.toString());
                nVar3.f24949m.a(n10, O10);
                return;
            case 5:
                y4.n nVar4 = this.f23865B.f23849c;
                y4.o O11 = O();
                nVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long n11 = nVar4.n();
                try {
                    jSONObject4.put("requestId", n11);
                    jSONObject4.put("type", "PLAY");
                    jSONObject4.put("mediaSessionId", nVar4.B());
                } catch (JSONException unused4) {
                }
                nVar4.o(n11, jSONObject4.toString());
                nVar4.f24948l.a(n11, O11);
                return;
            default:
                y4.n nVar5 = this.f23865B.f23849c;
                y4.o O12 = O();
                nVar5.getClass();
                JSONObject jSONObject5 = new JSONObject();
                long n12 = nVar5.n();
                try {
                    jSONObject5.put("requestId", n12);
                    jSONObject5.put("type", "GET_STATUS");
                    t4.p pVar = nVar5.f24943f;
                    if (pVar != null) {
                        jSONObject5.put("mediaSessionId", pVar.f23225b);
                    }
                } catch (JSONException unused5) {
                }
                nVar5.o(n12, jSONObject5.toString());
                nVar5.f24953q.a(n12, O12);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar) {
        super(hVar, true);
        this.f23864A = 2;
        this.f23865B = hVar;
    }
}
