package C4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class r extends BasePendingResult {

    /* renamed from: x, reason: collision with root package name */
    public final Status f1589x;

    public r(Status status) {
        super(null);
        this.f1589x = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final o F(Status status) {
        return this.f1589x;
    }
}
