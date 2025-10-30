package co.notix;

import co.notix.perseverance.worker.PerseveranceWorker;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class ij extends kotlin.jvm.internal.g implements O7.l {
    public ij(PerseveranceWorker perseveranceWorker) {
        super(1, perseveranceWorker, PerseveranceWorker.class, "addRetry", "addRetry(Lco/notix/perseverance/PerseveranceParams;)Lco/notix/perseverance/PerseveranceParams;", 0);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        ni p02 = (ni) obj;
        kotlin.jvm.internal.h.e(p02, "p0");
        PerseveranceWorker perseveranceWorker = (PerseveranceWorker) this.receiver;
        g8.a aVar = PerseveranceWorker.f12959d;
        perseveranceWorker.getClass();
        int i9 = p02.f12826c + 1;
        long a5 = ki.a(p02.f12826c) + System.currentTimeMillis();
        String id = p02.f12824a;
        String type = p02.f12825b;
        JSONObject paramsJson = p02.f12828e;
        kotlin.jvm.internal.h.e(id, "id");
        kotlin.jvm.internal.h.e(type, "type");
        kotlin.jvm.internal.h.e(paramsJson, "paramsJson");
        return new ni(id, type, i9, a5, paramsJson);
    }
}
