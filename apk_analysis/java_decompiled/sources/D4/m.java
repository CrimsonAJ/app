package D4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class m extends BasePendingResult {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1859x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(w wVar, int i9) {
        super(wVar);
        this.f1859x = i9;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ C4.o F(Status status) {
        switch (this.f1859x) {
            case 0:
                return status;
            default:
                return new v4.r(status, 0);
        }
    }
}
