package C3;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements A {

    /* renamed from: b, reason: collision with root package name */
    public static final u f1559b = new u(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1560a;

    public /* synthetic */ u(int i9) {
        this.f1560a = i9;
    }

    @Override // C3.A
    public int a(Object obj) {
        p pVar = (p) obj;
        switch (this.f1560a) {
            case 1:
                String str = pVar.f1479a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (l4.y.f20553a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                return pVar.f1479a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
