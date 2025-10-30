.class public final LP1/h;
.super LM1/s;
.source "SourceFile"


# instance fields
.field public final synthetic j:Lcom/anilab/android/ui/comment/CommentListFragment;


# direct methods
.method public constructor <init>(Lcom/anilab/android/ui/comment/CommentListFragment;Landroidx/recyclerview/widget/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP1/h;->j:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 2
    .line 3
    const-string p1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 9
    .line 10
    invoke-direct {p0, p2}, LM1/s;-><init>(Landroidx/recyclerview/widget/a;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final c(I)V
    .locals 4

    .line 1
    iget-object v0, p0, LP1/h;->j:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/anilab/android/ui/comment/CommentListFragment;->s0()LP1/G;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    new-instance v2, LP1/A;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v0, p1, v3}, LP1/A;-><init>(LP1/G;ILE7/d;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
