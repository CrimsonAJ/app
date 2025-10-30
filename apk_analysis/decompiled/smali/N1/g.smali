.class public final synthetic LN1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/categoryDetail/MovieListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/categoryDetail/MovieListFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, LN1/g;->a:I

    iput-object p1, p0, LN1/g;->b:Lcom/anilab/android/ui/categoryDetail/MovieListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, LN1/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN1/g;->b:Lcom/anilab/android/ui/categoryDetail/MovieListFragment;

    .line 7
    .line 8
    invoke-virtual {v0}, LM1/n;->e0()LW/g;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LJ1/A;

    .line 13
    .line 14
    iget-object v1, v1, LJ1/A;->z:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LN1/j;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, LN1/j;-><init>(Lcom/anilab/android/ui/categoryDetail/MovieListFragment;Landroidx/recyclerview/widget/a;)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :pswitch_0
    new-instance v0, LN1/f;

    .line 27
    .line 28
    iget-object v3, p0, LN1/g;->b:Lcom/anilab/android/ui/categoryDetail/MovieListFragment;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->s0()LN1/u;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v9, v1, LN1/u;->a:Lcom/anilab/domain/model/Shortcut;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->s0()LN1/u;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, LN1/u;->a:Lcom/anilab/domain/model/Shortcut;

    .line 41
    .line 42
    const-string v2, "recentlyUpdated"

    .line 43
    .line 44
    iget-object v1, v1, Lcom/anilab/domain/model/Shortcut;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    new-instance v1, LG0/h;

    .line 51
    .line 52
    const-class v4, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;

    .line 53
    .line 54
    const-string v5, "onMovieClick"

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    const-string v6, "onMovieClick(Lcom/anilab/domain/model/Movie;)V"

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x1

    .line 61
    invoke-direct/range {v1 .. v8}, LG0/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 62
    .line 63
    .line 64
    move-object v11, v1

    .line 65
    new-instance v1, LN1/i;

    .line 66
    .line 67
    const-class v4, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;

    .line 68
    .line 69
    const-string v5, "onUpdateWatchList"

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    const-string v6, "onUpdateWatchList(Lcom/anilab/domain/model/Movie;Z)V"

    .line 73
    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    invoke-direct/range {v1 .. v8}, LN1/i;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    iget-boolean v2, v9, Lcom/anilab/domain/model/Shortcut;->d:Z

    .line 80
    .line 81
    invoke-direct {v0, v2, v10, v11, v1}, LN1/f;-><init>(ZZLG0/h;LN1/i;)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
