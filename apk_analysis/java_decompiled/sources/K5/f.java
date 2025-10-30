package K5;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class f extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(q qVar, int i9) {
        super(qVar);
        this.f4328e = i9;
    }

    @Override // K5.r
    public void r() {
        switch (this.f4328e) {
            case 0:
                q qVar = this.f4379b;
                qVar.f4370o = null;
                CheckableImageButton checkableImageButton = qVar.f4363g;
                checkableImageButton.setOnLongClickListener(null);
                O4.h.G(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
