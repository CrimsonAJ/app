package X;

import java.util.LinkedHashSet;

/* renamed from: X.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413m extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f8096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0413m(O o9, int i9) {
        super(0);
        this.f8095d = i9;
        this.f8096e = o9;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f8095d) {
            case 0:
                return ((Z.i) this.f8096e.j.getValue()).f8896c;
            default:
                Z.f fVar = this.f8096e.f8011a;
                String q9 = ((x8.y) fVar.f8880d.getValue()).f24686a.q();
                synchronized (Z.f.f8876f) {
                    LinkedHashSet linkedHashSet = Z.f.f8875e;
                    if (!linkedHashSet.contains(q9)) {
                        linkedHashSet.add(q9);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + q9 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new Z.i(fVar.f8877a, (x8.y) fVar.f8880d.getValue(), (Y) fVar.f8878b.invoke((x8.y) fVar.f8880d.getValue(), fVar.f8877a), new Z.e(fVar, 1));
        }
    }
}
