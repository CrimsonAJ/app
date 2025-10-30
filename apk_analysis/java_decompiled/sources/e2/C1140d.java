package e2;

import android.os.Bundle;
import com.anilab.android.ui.myList.MyListActionBottomSheet;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140d extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MyListActionBottomSheet f17104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1140d(MyListActionBottomSheet myListActionBottomSheet, int i9) {
        super(0);
        this.f17103d = i9;
        this.f17104e = myListActionBottomSheet;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f17103d) {
            case 0:
                MyListActionBottomSheet myListActionBottomSheet = this.f17104e;
                Bundle bundle = myListActionBottomSheet.f18390f;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + myListActionBottomSheet + " has null arguments");
            default:
                return this.f17104e;
        }
    }
}
