package i2;

import android.os.Bundle;
import com.anilab.android.ui.rating.BottomSheetRating;

/* renamed from: i2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1378f extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomSheetRating f18459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1378f(BottomSheetRating bottomSheetRating, int i9) {
        super(0);
        this.f18458d = i9;
        this.f18459e = bottomSheetRating;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f18458d) {
            case 0:
                BottomSheetRating bottomSheetRating = this.f18459e;
                Bundle bundle = bottomSheetRating.f18390f;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + bottomSheetRating + " has null arguments");
            default:
                return this.f18459e;
        }
    }
}
