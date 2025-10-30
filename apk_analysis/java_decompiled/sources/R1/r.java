package R1;

import android.os.Bundle;
import com.anilab.android.ui.download.DownloadFragment;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DownloadFragment f6553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(DownloadFragment downloadFragment, int i9) {
        super(0);
        this.f6552d = i9;
        this.f6553e = downloadFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f6552d) {
            case 0:
                DownloadFragment downloadFragment = this.f6553e;
                Bundle bundle = downloadFragment.f18390f;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + downloadFragment + " has null arguments");
            default:
                return this.f6553e;
        }
    }
}
