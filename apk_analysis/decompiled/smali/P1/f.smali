.class public final synthetic LP1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/comment/CommentListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/comment/CommentListFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, LP1/f;->a:I

    iput-object p1, p0, LP1/f;->b:Lcom/anilab/android/ui/comment/CommentListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LP1/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP1/f;->b:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/anilab/android/ui/comment/CommentListFragment;->y0(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/anilab/android/ui/comment/CommentListFragment;->s0()LP1/G;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, v0, LP1/G;->v:LH2/c;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v2, LP1/y;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v2, v0, v1, v3}, LP1/y;-><init>(LP1/G;LH2/c;LE7/d;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {v0, v1, v2}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v0, LA7/n;->a:LA7/n;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    const/4 v0, 0x0

    .line 34
    iget-object v1, p0, LP1/f;->b:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Lcom/anilab/android/ui/comment/CommentListFragment;->y0(Z)V

    .line 37
    .line 38
    .line 39
    sget-object v0, LA7/n;->a:LA7/n;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_1
    iget-object v0, p0, LP1/f;->b:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 43
    .line 44
    invoke-virtual {v0}, LM1/n;->e0()LW/g;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, LJ1/E;

    .line 49
    .line 50
    iget-object v1, v1, LJ1/E;->E:Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/a;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, LP1/h;

    .line 57
    .line 58
    invoke-direct {v2, v0, v1}, LP1/h;-><init>(Lcom/anilab/android/ui/comment/CommentListFragment;Landroidx/recyclerview/widget/a;)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :pswitch_2
    new-instance v0, LP1/e;

    .line 63
    .line 64
    iget-object v1, p0, LP1/f;->b:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 65
    .line 66
    invoke-direct {v0, v1}, LP1/e;-><init>(Lcom/anilab/android/ui/comment/CommentListFragment;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method
