package H2;

import java.util.List;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final List f3082a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3083b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3084c;

    public w(List comments, List users, List votes) {
        kotlin.jvm.internal.h.e(comments, "comments");
        kotlin.jvm.internal.h.e(users, "users");
        kotlin.jvm.internal.h.e(votes, "votes");
        this.f3082a = comments;
        this.f3083b = users;
        this.f3084c = votes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (kotlin.jvm.internal.h.a(this.f3082a, wVar.f3082a) && kotlin.jvm.internal.h.a(this.f3083b, wVar.f3083b) && kotlin.jvm.internal.h.a(this.f3084c, wVar.f3084c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3084c.hashCode() + ((this.f3083b.hashCode() + (this.f3082a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ReplyCommentList(comments=" + this.f3082a + ", users=" + this.f3083b + ", votes=" + this.f3084c + ")";
    }
}
