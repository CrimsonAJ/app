package R1;

import com.anilab.android.ui.download.DownloadFragment;

/* loaded from: classes.dex */
public final class l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6538r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DownloadFragment f6539s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(E7.d dVar, DownloadFragment downloadFragment) {
        super(2, dVar);
        this.f6539s = downloadFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        l lVar = new l(dVar, this.f6539s);
        lVar.f6538r = obj;
        return lVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        lVar.invokeSuspend(nVar);
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[Catch: Exception -> 0x0168, TryCatch #0 {Exception -> 0x0168, blocks: (B:11:0x001b, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x005b, B:22:0x0074, B:24:0x007a, B:27:0x0085, B:32:0x0089, B:34:0x00a1, B:36:0x00a7, B:37:0x00de, B:39:0x0135, B:40:0x013f, B:41:0x00ae, B:43:0x00b8, B:46:0x00db, B:47:0x00c3, B:48:0x00c8, B:51:0x00d5, B:55:0x0153, B:56:0x0158), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[Catch: Exception -> 0x0168, TryCatch #0 {Exception -> 0x0168, blocks: (B:11:0x001b, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x005b, B:22:0x0074, B:24:0x007a, B:27:0x0085, B:32:0x0089, B:34:0x00a1, B:36:0x00a7, B:37:0x00de, B:39:0x0135, B:40:0x013f, B:41:0x00ae, B:43:0x00b8, B:46:0x00db, B:47:0x00c3, B:48:0x00c8, B:51:0x00d5, B:55:0x0153, B:56:0x0158), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153 A[Catch: Exception -> 0x0168, TryCatch #0 {Exception -> 0x0168, blocks: (B:11:0x001b, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x005b, B:22:0x0074, B:24:0x007a, B:27:0x0085, B:32:0x0089, B:34:0x00a1, B:36:0x00a7, B:37:0x00de, B:39:0x0135, B:40:0x013f, B:41:0x00ae, B:43:0x00b8, B:46:0x00db, B:47:0x00c3, B:48:0x00c8, B:51:0x00d5, B:55:0x0153, B:56:0x0158), top: B:10:0x001b }] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
