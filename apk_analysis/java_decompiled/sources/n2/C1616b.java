package n2;

import android.os.Bundle;
import com.anilab.android.ui.selectSubtitle.BottomSheetSelectSubtitle;
import kotlin.jvm.internal.i;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1616b extends i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomSheetSelectSubtitle f21052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1616b(BottomSheetSelectSubtitle bottomSheetSelectSubtitle, int i9) {
        super(0);
        this.f21051d = i9;
        this.f21052e = bottomSheetSelectSubtitle;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f21051d) {
            case 0:
                BottomSheetSelectSubtitle bottomSheetSelectSubtitle = this.f21052e;
                Bundle bundle = bottomSheetSelectSubtitle.f18390f;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + bottomSheetSelectSubtitle + " has null arguments");
            default:
                return this.f21052e;
        }
    }
}
