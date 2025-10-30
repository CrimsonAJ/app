package N6;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements L6.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5231a;

    @Override // L6.a
    public final void a(Object obj, Object obj2) {
        switch (this.f5231a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                L6.e eVar = (L6.e) obj2;
                eVar.a(O6.f.f5518g, entry.getKey());
                eVar.a(O6.f.f5519h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
