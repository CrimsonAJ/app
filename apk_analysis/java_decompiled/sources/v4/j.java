package v4;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j extends s {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f23861A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int[] f23862B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ h f23863C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, int[] iArr, int i9) {
        super(hVar, false);
        this.f23861A = i9;
        switch (i9) {
            case 1:
                this.f23862B = iArr;
                this.f23863C = hVar;
                super(hVar, true);
                return;
            default:
                this.f23862B = iArr;
                this.f23863C = hVar;
                return;
        }
    }

    @Override // v4.s
    public final void N() {
        switch (this.f23861A) {
            case 0:
                y4.n nVar = this.f23863C.f23849c;
                y4.o O8 = O();
                nVar.getClass();
                int[] iArr = this.f23862B;
                if (iArr.length != 0) {
                    JSONObject jSONObject = new JSONObject();
                    long n7 = nVar.n();
                    try {
                        jSONObject.put("requestId", n7);
                        jSONObject.put("type", "QUEUE_REMOVE");
                        jSONObject.put("mediaSessionId", nVar.B());
                        JSONArray jSONArray = new JSONArray();
                        boolean z9 = false;
                        for (int i9 = 0; i9 < iArr.length; i9++) {
                            jSONArray.put(i9, iArr[i9]);
                        }
                        jSONObject.put("itemIds", jSONArray);
                        int i10 = nVar.f24946i;
                        if (i10 != -1) {
                            z9 = true;
                        }
                        if (z9) {
                            jSONObject.put("sequenceNumber", i10);
                        }
                    } catch (JSONException unused) {
                    }
                    nVar.o(n7, jSONObject.toString());
                    nVar.f24956t.a(n7, new y4.l(nVar, O8, 1));
                    return;
                }
                throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
            default:
                y4.n nVar2 = this.f23863C.f23849c;
                y4.o O9 = O();
                int[] iArr2 = this.f23862B;
                nVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long n9 = nVar2.n();
                try {
                    jSONObject2.put("requestId", n9);
                    jSONObject2.put("type", "QUEUE_GET_ITEMS");
                    jSONObject2.put("mediaSessionId", nVar2.B());
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i11 : iArr2) {
                        jSONArray2.put(i11);
                    }
                    jSONObject2.put("itemIds", jSONArray2);
                } catch (JSONException unused2) {
                }
                nVar2.o(n9, jSONObject2.toString());
                nVar2.f24958v.a(n9, O9);
                return;
        }
    }
}
