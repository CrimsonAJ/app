package S1;

import M1.n;
import b8.InterfaceC0726f;
import com.anilab.android.ui.editProfile.EditProfileFragment;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfileFragment f6712b;

    public /* synthetic */ d(EditProfileFragment editProfileFragment, int i9) {
        this.f6711a = i9;
        this.f6712b = editProfileFragment;
    }

    @Override // b8.InterfaceC0726f
    public final Object emit(Object obj, E7.d dVar) {
        switch (this.f6711a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    n.q0(this.f6712b);
                }
                return A7.n.f558a;
            default:
                ((a) this.f6712b.f13752E0.getValue()).o((List) obj);
                return A7.n.f558a;
        }
    }
}
