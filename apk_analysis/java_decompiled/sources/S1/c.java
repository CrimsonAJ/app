package S1;

import J1.H;
import M1.n;
import androidx.constraintlayout.widget.Group;
import com.anilab.android.ui.editProfile.EditProfileFragment;
import d.AbstractC1073n;

/* loaded from: classes.dex */
public final class c extends AbstractC1073n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EditProfileFragment f6710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EditProfileFragment editProfileFragment) {
        super(false);
        this.f6710d = editProfileFragment;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.g, O7.a] */
    @Override // d.AbstractC1073n
    public final void a() {
        EditProfileFragment editProfileFragment = this.f6710d;
        Group groupSelectAvatar = ((H) editProfileFragment.e0()).f3686y;
        kotlin.jvm.internal.h.d(groupSelectAvatar, "groupSelectAvatar");
        if (groupSelectAvatar.getVisibility() == 0) {
            this.f16606a = false;
            ?? r1 = this.f16608c;
            if (r1 != 0) {
                r1.invoke();
            }
            Group groupSelectAvatar2 = ((H) editProfileFragment.e0()).f3686y;
            kotlin.jvm.internal.h.d(groupSelectAvatar2, "groupSelectAvatar");
            groupSelectAvatar2.setVisibility(8);
            return;
        }
        n.q0(editProfileFragment);
    }
}
