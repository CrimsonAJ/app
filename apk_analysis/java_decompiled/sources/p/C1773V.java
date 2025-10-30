package p;

import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: p.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1773V extends com.google.firebase.messaging.u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f21922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1773V(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f21922b = appCompatTextView;
    }

    @Override // com.google.firebase.messaging.u, p.InterfaceC1771U
    public final void a(int i9) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i9);
    }

    @Override // com.google.firebase.messaging.u, p.InterfaceC1771U
    public final void b(int i9) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i9);
    }
}
