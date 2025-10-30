package j3;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1445b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f19531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1447c f19532b;

    public C1445b(C1447c c1447c, Handler handler) {
        this.f19532b = c1447c;
        this.f19531a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i9) {
        this.f19531a.post(new G.j(i9, 2, this));
    }
}
