package V1;

import android.os.Bundle;
import com.anilab.android.ui.filterResult.FilterResultFragment;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FilterResultFragment f7631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(FilterResultFragment filterResultFragment, int i9) {
        super(0);
        this.f7630d = i9;
        this.f7631e = filterResultFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f7630d) {
            case 0:
                FilterResultFragment filterResultFragment = this.f7631e;
                Bundle bundle = filterResultFragment.f18390f;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + filterResultFragment + " has null arguments");
            default:
                return this.f7631e;
        }
    }
}
